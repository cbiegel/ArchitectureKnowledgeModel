/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.quarc.core.gssquery.preselector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.gssquery.AbstractProcessor;

public class ApplicableElementsSelector extends AbstractProcessor {

	private boolean includePattern;
	private boolean includePrinciples;
	private boolean includeFlaws;
	private boolean includeRefactorings;
	private boolean includeAll;
	private ApplicabilityTester applicabilityTester;
	private AssignedConstraintsSet assignedConstraintsSet;
	private HashMap<Element, LogicalValues> checkedElements;
	private SelectedGoalsSet selectedGoalsSet;
	private boolean goalsAndPrinciplesOnly;

	/**
	 * the constructor
	 * 
	 * @param gssQuery
	 *            a GSSQuery
	 * @param queryResultSet
	 *            a QueryResultSet
	 * @param accessLayer
	 *            an AccessLayer
	 * @param cacheManager
	 *            a CacheManager
	 * @param assignedConstraintsSet
	 *            a AssignedConstraintsSet
	 * @param selectedGoalsSet
	 *            a SelectedGoalsSet
	 * @param goalsAndPrinciplesOnly
	 *            select goals and principles only
	 */
	public ApplicableElementsSelector(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer,
			CacheManager cacheManager,
			AssignedConstraintsSet assignedConstraintsSet,
			SelectedGoalsSet selectedGoalsSet, boolean goalsAndPrinciplesOnly) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);

		this.assignedConstraintsSet = assignedConstraintsSet;
		this.selectedGoalsSet = selectedGoalsSet;
		this.goalsAndPrinciplesOnly = goalsAndPrinciplesOnly;

		// this.applicabilityTester = applicabilityTester;
	}

	
	/**
	 * an alternative constructor without a SelectedGoalsSet
	 * 
	 * @param gssQuery
	 *            a GSSQuery
	 * @param queryResultSet
	 *            a QueryResultSet
	 * @param accessLayer
	 *            an AccessLayer
	 * @param cacheManager
	 *            a CacheManager
	 * @param assignedConstraintsSet
	 *            a AssignedConstraintsSet
	 * @param goalsAndPrinciplesOnly
	 *            select goals and principles only
	 */
	
	public ApplicableElementsSelector(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer,
			CacheManager cacheManager,
			AssignedConstraintsSet assignedConstraintsSet,
			boolean goalsAndPrinciplesOnly) {
		this(gssQuery, queryResultSet, accessLayer, cacheManager,
				assignedConstraintsSet, null, goalsAndPrinciplesOnly);

	}

	private Set<Goal> selectedGoals;
	private Set<Principle> selectedPrinciples;

	/*
	 * (non-Javadoc)
	 * 
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {

		includePattern = gssQuery.isIncludePattern();
		includePrinciples = gssQuery.isIncludePrinciples();
		includeFlaws = gssQuery.isIncludeFlaws();
		includeRefactorings = gssQuery.isIncludeRefactorings();

		includeAll = gssQuery.isIncludeAll();
		checkedElements = new HashMap<Element, LogicalValues>();

		// applicableElements = new HashMap<Element, ApplicableElement>();
		applicabilityTester = new ApplicabilityTester(assignedConstraintsSet);

		if (selectedGoalsSet == null
				|| selectedGoalsSet.getPrioritizedElements().isEmpty())
			for (Element goal : cacheManager.getRootElements(GSSLayer.layer1))
				checkElement(goal, null, null);
		else {
			selectedGoals = new HashSet<Goal>();
			for (PrioritizedElement goalPriorizedElement : selectedGoalsSet
					.getPrioritizedElements()) {
				selectedGoals.add((Goal) goalPriorizedElement.getElement());
			}

			selectedPrinciples = new HashSet<Principle>();
			if (gssQuery.getSelectedPrinciplesSet() != null)
				for (PrioritizedElement principlePriorizedElement : gssQuery
						.getSelectedPrinciplesSet().getPrioritizedElements()) {
					selectedPrinciples
							.add((Principle) principlePriorizedElement
									.getElement());
				}

			for (Goal selectedGoal : selectedGoals) {
				if (cacheManager
						.getSelectedGoalsPriorizedDecompositionsForSource(
								selectedGoal).isEmpty())
					checkElement(selectedGoal, null, null);
			}
		}

	}

	/** creates an ApplicableElement for the specifed Element
	 * @param element an Element
	 * @return the created ApplicableElement
	 * 
	 */
	private ApplicableElement createAndAddApplicableElement(Element element) {
		ApplicableElement newApplicableElement = cacheManager
				.createApplicableElement(element);
		return newApplicableElement;
	}

	/**
	 * check a related Element of the ApplicableElement about applicableness
	 * @param element an Element 
	 * @param targetApplicableElement a ApplicableElement
	 * @param relation the Relation between the two Elements
	 */
	private void checkElement(Element element,
			ApplicableElement targetApplicableElement, Relation relation) {
		if ((selectedGoals != null && !selectedGoals.isEmpty() && (element instanceof Goal && !selectedGoals
				.contains(element)))
				|| (selectedPrinciples != null && !selectedPrinciples.isEmpty() && (element instanceof Principle && !selectedPrinciples
						.contains(element))))
			return;

		if (relation instanceof Impact) {
			// skip Impact relations with weight == 0 or null
			// skip Impact Relations only
			// offset Relations will be added if weight == 0
			String weight = ((Impact) relation).getWeight();
			if (weight == null || Float.valueOf(weight) == 0.0f) {
				return;
			}
		}

		if (checkedElements.containsKey(element)) {

			cacheManager.addRelation(
					cacheManager.getApplicableElementForElement(element),
					targetApplicableElement, relation);
		} else

		if (element instanceof Goal) {
			checkedElements.put(element, LogicalValues.TRUE);
			ApplicableElement applicableElement = createAndAddApplicableElement(element);
			if (targetApplicableElement != null && relation != null) {

				cacheManager.addRelation(applicableElement,
						targetApplicableElement, relation);
			}
			checkRelations(element, applicableElement);

		} else { // instanceof ConstrainedElement

			if (!elementTypeIsIncluded(element))
				return;
			LogicalValues isApplicable = applicabilityTester
					.evaluatePrecondition((ConstrainedElement) element);
			if (isApplicable == LogicalValues.TRUE) {
				ApplicableElement applicableElement = createAndAddApplicableElement(element);
				cacheManager.addRelation(applicableElement,
						targetApplicableElement, relation);
				checkRelations(element, applicableElement);
			} else if (isApplicable == LogicalValues.FALSE) {
				// ignore source Element / Relation
			} else if (isApplicable == LogicalValues.UNDEFINED) {

				cacheManager.addRelationForUndefinedApplicableness(
						targetApplicableElement, relation);
			}
			checkedElements.put(element, isApplicable);
		}

	}

	/**
	 * check about element type is included in the search
	 * @param element an Element
	 * @return element type is included in the search 
	 */
	private boolean elementTypeIsIncluded(Element element) {
		if ((includeAll && !goalsAndPrinciplesOnly)
				|| (includeAll && goalsAndPrinciplesOnly && (element instanceof org.emftrace.metamodel.QUARCModel.GSS.Flaw || element instanceof org.emftrace.metamodel.QUARCModel.GSS.Principle))) {
			return true;
		} else if (element instanceof org.emftrace.metamodel.QUARCModel.GSS.Pattern
				&& !goalsAndPrinciplesOnly) {
			return includePattern;
		} else

		if (element instanceof org.emftrace.metamodel.QUARCModel.GSS.Principle) {
			return includePrinciples;
		} else

		if (element instanceof org.emftrace.metamodel.QUARCModel.GSS.Refactoring
				&& !goalsAndPrinciplesOnly) {
			return includeRefactorings;
		} else

		if (element instanceof org.emftrace.metamodel.QUARCModel.GSS.Flaw) {
			return includeFlaws;
		} else
			return false;

	}

	/**
	 * check the ratation of the specified Element/ApplicableElement
	 * @param element a Element
	 * @param applicableElement the ApplicableElement for the Element
	 */
	private void checkRelations(Element element,
			ApplicableElement applicableElement) {
		List<Relation> incomingRelations = cacheManager
				.getAllIncomingRelationsForElement(element);
		for (Relation relation : incomingRelations) {
			checkElement(cacheManager.getSourceOfRelation(relation),
					applicableElement, relation);
		}
	}

}

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

import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;


/**
 * Test Element about applicability and caches the result.
 * 
 * @author Daniel Motschmann
 *
 */
public class ApplicabilityTester {

	/**
	 * a cache for the already tested Elements
	 */
	private HashMap<ConstrainedElement, LogicConditionResultItem> testedElementsCache;
	
	/**
	 * the used LogicConditionEvaluator
	 */
	private LogicConditionEvaluator logicConditionEvaluator;

	/**
	 * the constructor
	 * 
	 * @param assignedConstraintsSet a set of constraints
	 * @param acceptedElementClassNames a List of names of class which are not filtered
	 */
	public ApplicabilityTester(AssignedConstraintsSet assignedConstraintsSet ) {
		testedElementsCache = new HashMap<ConstrainedElement, LogicConditionResultItem>();
		if (assignedConstraintsSet != null)
			logicConditionEvaluator = new LogicConditionEvaluator(assignedConstraintsSet.getAssignedConstraints());
		else logicConditionEvaluator = new LogicConditionEvaluator(null);
	}
	
	/**
	 * resets the cache
	 */
	public void clearCache(){
		testedElementsCache.clear();
	}
	
	/**
	 * @param element a ConstrainedElement
	 * @return the logical result of the precondition of the specified ConstrainedElement
	 */
	public LogicalValues evaluatePrecondition(ConstrainedElement element) {
		if (testedElementsCache.containsKey(element)) {
			return testedElementsCache.get(element).getLogicalResultValue();
		}
		return evaluateApplicability(element).getLogicalResultValue();
	}

	/**
	 * @param element a ConstrainedElement
	 * @return true if the precondition of the specified ConstrainedElement is satisfied
	 */
	public boolean isApplicable(ConstrainedElement element) {
		if (testedElementsCache.containsKey(element)) {
			return testedElementsCache.get(element).getLogicalResultValue() == LogicalValues.TRUE ? true :false;
		}
		return evaluateApplicability(element).getLogicalResultValue() == LogicalValues.TRUE ? true :false;
	}
	
	/**
	 * @param element a ConstrainedElement
	 * @return true if the precondition of the specified ConstrainedElement is not satisfied
	 */
	public boolean isNotApplicable(ConstrainedElement element) {
		if (testedElementsCache.containsKey(element)) {
			return testedElementsCache.get(element).getLogicalResultValue() == LogicalValues.FALSE ? true :false;
		}
		return evaluateApplicability(element).getLogicalResultValue() == LogicalValues.FALSE ? true :false;
	}
	
	/**
	 * @param element a ConstrainedElement
	 * @return true if the satisfaction of the precondition of the specified ConstrainedElement is undefined
	 */
	public boolean applicablenessIsUndefined(ConstrainedElement element) {
		if (testedElementsCache.containsKey(element)) {
			return testedElementsCache.get(element).getLogicalResultValue() == LogicalValues.UNDEFINED ? true :false;
		}
		return evaluateApplicability(element).getLogicalResultValue() == LogicalValues.UNDEFINED ? true :false;
	}

	
	/**
	 * evaluateApplicability the Applicability of the specified ConstrainedElement and caches the result
	 * @param element a ConstrainedElement
	 * @return the LogicConditionResultItem of the evaluation
	 */
	private LogicConditionResultItem evaluateApplicability(ConstrainedElement element) {	
		LogicConditionResultItem result  = logicConditionEvaluator.evaluatePrecondition(element.getPrecondition());
		testedElementsCache.put(element, result);
		return result;
	}

}

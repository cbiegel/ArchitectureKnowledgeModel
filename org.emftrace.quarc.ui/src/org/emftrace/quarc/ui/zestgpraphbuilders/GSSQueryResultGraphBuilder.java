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


package org.emftrace.quarc.ui.zestgpraphbuilders;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.aggregations.AbstractCalculator;
import org.emftrace.quarc.core.aggregations.AvgCalculator;
import org.emftrace.quarc.core.aggregations.MaxCalculator;
import org.emftrace.quarc.core.aggregations.MinCalculator;
import org.emftrace.quarc.core.aggregations.WeightedAvgCalculator;
import org.emftrace.quarc.core.aggregations.WeightedMaxCalculator;
import org.emftrace.quarc.core.aggregations.WeightedMinCalculator;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.gssquery.GSSQueryProcessor;
import org.emftrace.quarc.ui.zest.connections.ConnectionDecorator;
import org.emftrace.quarc.ui.zest.graph.GSSGraph;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;

/**
 * A GraphBuilder for GSSQueryResult
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */
public class GSSQueryResultGraphBuilder extends AbstractElementGraphBuilder {

	private GSSQuery query;

	private GSSQueryContainment gssQueryContainment;

	private Toolbox toolbox;

	private GSS gss;

	/**
	 * the constructor
	 * 
	 * @param parent
	 *            the parent Composite
	 * @param style
	 *            the SWT sytle
	 * @param queryResult
	 *            a QueryResult
	 * @param accessLayer
	 *            an AccessLayer instance
	 */
	public GSSQueryResultGraphBuilder(Composite parent, int style,
			IWorkbenchPartSite iWorkbenchPartSite,
			QueryResultSet queryResultSet, AccessLayer accessLayer) {
		super(parent, style, iWorkbenchPartSite, queryResultSet, accessLayer);
		this.query = (GSSQuery) queryResultSet.eContainer();
		this.gssQueryContainment = (GSSQueryContainment) query.eContainer();
		this.toolbox = (Toolbox) gssQueryContainment.eContainer();

		this.gss = toolbox.getGssCatalogue();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see quarc_gssquerygui.zestgpraphbuilders.AbstractElementGraphBuilder#
	 * buildCustomGraph(org.eclipse.zest.core.widgets.Graph)
	 */
	@Override
	protected void buildCustomGraph(final GSSGraph zestGraph) {

		super.buildCustomGraph(zestGraph);
		// create a node for each applicable Element
		for (Entry<ApplicableElement, Element> cacheEntrySet : cacheManager
				.getApplicableElementsSet()) {

			// ApplicableElement applicableElement = cacheEntrySet.getKey();
			Element element = cacheEntrySet.getValue();

			int level = cacheManager.getLevel(element);
			int sublevel = cacheManager.getSublevel(element);

			GSSElementGraphNode node = createNode(zestGraph, SWT.NONE, element,
					level, sublevel,
					cacheManager.isLeafAppicableElement(element), !cacheManager
							.getAllApplicableIncomingRelations(element)
							.isEmpty());
			if (element instanceof Goal)
				setNodeImportance(node, element);
		}

		// create connections for all (outgoing) relations
		for (ApplicableElement applicableElement : cacheManager
				.getAllApplicableElements()) {
			for (Relation outgoingDecompositionRelation : cacheManager
					.getApplicableOutgoingDecompositionRelations(applicableElement)) {

				GraphConnection connection = createConnection(outgoingDecompositionRelation);

				Integer weight = cacheManager
						.getSelectedGoalPriorizedDecompositionWeight(cacheManager
								.getPriorizedGoalDecompositionForDecomposition((Decomposition) outgoingDecompositionRelation));
				connection
						.setText(weight != null ? String.valueOf(weight) : "");
				ConnectionDecorator
						.decoradeConnection(
								connection,
								outgoingDecompositionRelation,
								cacheManager
										.getSourceOfRelation(outgoingDecompositionRelation),
								cacheManager
										.getTargetOfRelation(outgoingDecompositionRelation),
								null);

			}

			if (cacheManager
					.getApplicableOutgoingIsARelations(applicableElement) != null) {

				createConnection(cacheManager
						.getApplicableOutgoingIsARelations(applicableElement));
			}

			for (Impact impact : cacheManager
					.getApplicableIncomingImpactRelations(applicableElement)) {
				createConnection(impact);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * quarc_gssquerygui.zestgpraphbuilders.AbstractElementGraphBuilder#initCache
	 * ()
	 */
	@Override
	protected void initCache() {
		
		if (query.getQueryResultSet() == null) {
		if (displayQuestionMessagebox( "Run query now?"))
	    		
			    new GSSQueryProcessor(query, accessLayer, gss, query.getAssignedConstraintsSet(), false).run();
		}
		else {
		 if (query.isChanged() || query.getAssignedConstraintsSet().isChanged() || query.getSelectedGoalsSet().isChanged() || query.getSelectedPrinciplesSet().isChanged()  ) {
				if (displayQuestionMessagebox( "Due to changes query musst be executed again!\n\nRerun query now?"))
		    		
				    new GSSQueryProcessor(query, accessLayer, gss, query.getAssignedConstraintsSet(), false).run();
				
		}	
		}
		
		cacheManager = new CacheManager(gss, (QueryResultSet) getInput(),
				query.getSelectedGoalsSet(), accessLayer);
		cacheManager.initCache();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder#
	 * createTooltipFigure(org.emftrace.metamodel.QUARCModel.GSS.Element)
	 */
	@Override
	protected IFigure createTooltipFigure(Element element) {
		IFigure tooltipFigure = super.createTooltipFigure(element);

		if (element instanceof ConstrainedElement) {

			String ratingsString = "";

			ratingsString += " Ratings:";
			HashMap<String, AbstractCalculator> calculators = new HashMap<String, AbstractCalculator>();
			List<Element> leafElementsGoalLayer = getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer1);
			for (Element leafGoal : leafElementsGoalLayer) {
				float rating = getCacheManager()
						.getIndirectRatingWeight((ConstrainedElement) element, (Goal) leafGoal);
				if (rating == 0.0f) continue;
				ratingsString += "\n "
						+ accessLayer.getAttributeValue(leafGoal, "name")
						+ ": ";
				ratingsString += String.format("%.2f", rating);
			}

			ratingsString += "\n";

			List<Element> leafElementsPrincipleLayer = getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer3);
			if (element instanceof SolutionInstrument) {

				for (Element leafPrinciple : leafElementsPrincipleLayer) {
					float rating = getCacheManager()
							.getIndirectRatingWeight((ConstrainedElement) element, (Element) leafPrinciple);
					if (rating == 0.0f) continue;
					ratingsString += " \n "
							+ accessLayer.getAttributeValue(leafPrinciple,
									"name") + ": ";
					ratingsString += String.format("%.2f", rating);
				}
				ratingsString += "\n";
			}

			ratingsString += "\n";
			calculators.put("max", new MaxCalculator(leafElementsGoalLayer,
					getCacheManager()));
			calculators.put("min", new MinCalculator(leafElementsGoalLayer,
					getCacheManager()));
			calculators.put("avg", new AvgCalculator(leafElementsGoalLayer,
					getCacheManager()));
			if (!getCacheManager().getSelectedGoals().isEmpty()) {
				calculators.put("weighted max", new WeightedMaxCalculator(
						leafElementsGoalLayer, getCacheManager()));
				calculators.put("weighted min", new WeightedMinCalculator(
						leafElementsGoalLayer, getCacheManager()));
				calculators.put("weighted avg", new WeightedAvgCalculator(
						leafElementsGoalLayer, getCacheManager()));
			}

			if (element instanceof SolutionInstrument) {
				calculators.put("max", new MaxCalculator(
						leafElementsPrincipleLayer, getCacheManager()));
				calculators.put("min", new MinCalculator(
						leafElementsPrincipleLayer, getCacheManager()));
				calculators.put("avg", new AvgCalculator(
						leafElementsPrincipleLayer, getCacheManager()));
				if (!getCacheManager().getSelectedPrinciples().isEmpty()) {
					calculators.put("weighted max", new WeightedMaxCalculator(
							leafElementsPrincipleLayer, getCacheManager()));
					calculators.put("weighted min", new WeightedMinCalculator(
							leafElementsPrincipleLayer, getCacheManager()));
					calculators.put("weighted avg", new WeightedAvgCalculator(
							leafElementsPrincipleLayer, getCacheManager()));
				}
			}

			ratingsString += " Aggregations:";
			for (Entry<String, AbstractCalculator> entry : calculators
					.entrySet()) {
				ratingsString += " \n " + entry.getKey() + ": ";
				ratingsString += entry.getValue()
						.calcAggregationAsString((ConstrainedElement) element);
			}

			org.eclipse.draw2d.Label ratingsLabel = new org.eclipse.draw2d.Label(
					"\n" + ratingsString + "\n");
			ratingsLabel.setFont(defaultLabelFont);
			tooltipFigure.add(ratingsLabel);
			tooltipFigure.setSize(-1, -1);
		}
		return tooltipFigure;
	}

}

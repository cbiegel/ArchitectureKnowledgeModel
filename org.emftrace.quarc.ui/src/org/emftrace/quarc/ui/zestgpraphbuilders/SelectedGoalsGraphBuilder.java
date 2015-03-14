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

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.ICacheChangedListener;
import org.emftrace.quarc.ui.zest.connections.ConnectionDecorator;
import org.emftrace.quarc.ui.zest.graph.GSSGraph;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;

/**
 * A GraphBuilder for the priority selection for goals
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */
public class SelectedGoalsGraphBuilder extends AbstractElementGraphBuilder{

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
	public SelectedGoalsGraphBuilder(Composite parent, int style,
			IWorkbenchPartSite iWorkbenchPartSite,
			SelectedGoalsSet selectedGoalsSet, AccessLayer accessLayer) {
		super(parent, style, iWorkbenchPartSite, selectedGoalsSet, accessLayer);
		this.query = (GSSQuery) selectedGoalsSet.eContainer();
		this.gssQueryContainment = (GSSQueryContainment) query.eContainer();
		this.toolbox = (Toolbox) gssQueryContainment.eContainer();
		this.gss = toolbox.getGssCatalogue();
	}
	
	
	/* (non-Javadoc)
	 * @see quarc_gssquerygui.zestgpraphbuilders.AbstractElementGraphBuilder#buildCustomGraph(org.eclipse.zest.core.widgets.Graph)
	 */
	@Override
	protected void buildCustomGraph(final GSSGraph zestGraph) {

		super.buildCustomGraph(zestGraph);
		
		// create a node for each applicable Element
		cacheManager.initSelectedGoalCache();
		cacheManager.repairSelectedGoalsPrioritiesAndWeights();
		for (PrioritizedElement priorizedGoal : cacheManager
				.getSelectedGoals()) {

			Goal goal = cacheManager.getGoalForSelectedGoal(priorizedGoal);

			int level = cacheManager.getLevel(goal);
			int sublevel = cacheManager.getSublevel(goal);

			GSSElementGraphNode node = createNode(zestGraph, SWT.NONE, goal,
					level, sublevel,
					cacheManager.getSelectedGoalsPriorizedDecompositionsForTarget(goal).isEmpty(), !cacheManager.getSelectedGoalsPriorizedDecompositionsForTarget(goal).isEmpty() ,null);
			setNodeImportance(node, goal);
		}

		
		for (final PrioritizedDecomposition priorizedDecomposition : cacheManager
				.getSelectedGoalsDecompositions()) {
			final Decomposition decomposition = cacheManager.getSelectedGoalsDecomposition(priorizedDecomposition);
			
			final GraphConnection connection = createConnection(decomposition);
			
			
			cacheManager.addCacheChangedListener( new ICacheChangedListener() {
				
				@Override
				public void changed() {
					updateConnectionText(decomposition, priorizedDecomposition, connection);
					}
			});
			
			updateConnectionText(decomposition, priorizedDecomposition, connection);
			
		}

	}

	/**
	 * updates the text and decoration of the connection 
	 * @param decomposition a Decomposition
	 * @param priorizedDecomposition the PrioritizedDecomposition of the Decomposition
	 * @param connection the GraphConnection of the Decomposition
	 */
	protected void updateConnectionText(Decomposition decomposition, PrioritizedDecomposition priorizedDecomposition, GraphConnection connection ){
		Integer weight = cacheManager.getSelectedGoalPriorizedDecompositionWeight(priorizedDecomposition);
		if (cacheManager.goalDecompositionIsMarkedAsToRemove(decomposition))
			connection.setText("X");
		else
			connection.setText(weight != null? String.format("     %d",weight) : "");
		ConnectionDecorator.decoradeConnection(connection, decomposition, cacheManager.getSourceOfRelation(decomposition), cacheManager.getTargetOfRelation(decomposition), null);
	
	}



	/* (non-Javadoc)
	 * @see quarc_gssquerygui.zestgpraphbuilders.AbstractElementGraphBuilder#initCache()
	 */
	@Override
	protected void initCache() {
		cacheManager = new CacheManager(gss, (SelectedGoalsSet) getInput(),
				accessLayer);
		cacheManager.initCache();

	}
	

	/**
	 * deselect the Decomposition
	 * @param decomposition a Decomposition
	 */
	public void deselectDecomposition(Decomposition decomposition){
		cacheManager.markSelectedGoalDecompositionAsToRemove(decomposition);
		
		Element source = cacheManager.getSourceOfRelation(decomposition);
	//	Element target = cacheManager.getTargetOfRelation(decomposition);
		
		GraphNode sourceNode = getNodeForElement(source);
//		GraphNode targetNode = getNodeForElement(target);
		
		
		deselectTargets(sourceNode);
		
	}
	
	/**
	 * deselect all parents of the node 
	 * @param sourceNode a GraphNode
	 */
	private void deselectTargets(GraphNode sourceNode) {
		Element sourceElement = getElementForNode((GSSElementGraphNode) sourceNode);
		cacheManager.markSelectedGoalAsToRemove((Goal) sourceElement);
		
	for (Object outgoingConnection : sourceNode.getSourceConnections()){
		
		

		GraphNode destinationNode = ((GraphConnection)outgoingConnection).getDestination();
		
		Element destinationElement = getElementForNode((GSSElementGraphNode) destinationNode);
		
		Decomposition decomposition = cacheManager.getDecompositionBetween(sourceElement, destinationElement);
		cacheManager.markSelectedGoalDecompositionAsToRemove(decomposition);
		
		cacheManager.markSelectedGoalDecompositionAsToRemove(decomposition);
		
		
		if ( cacheManager.goalIsMarkedAsToRemove((Goal) destinationElement)){
			if (!hasMarkedSourceNodes(destinationNode)){
				deselectTargets(destinationNode);
			}
		}
	}
		
	}

	
	
	/**
	 * @param node a GraphNode
	 * @return node has marked children
	 */
	protected boolean hasMarkedSourceNodes(GraphNode node) {
		boolean result = false;
		for (Object connection : node.getTargetConnections()) {
			GSSElementGraphNode sourceNode = (GSSElementGraphNode) ((GraphConnection) connection).getSource();
			if (cacheManager.goalIsMarkedAsToRemove((Goal) getElementForNode(sourceNode))) {
				result = true;
				break;
			}

		}
		return result;
	}


	/**
	 * select a deselected Decomposition
	 * @param decomposition a Decomposition
	 */
	public void reselectDecomposition(Decomposition decomposition){
		cacheManager.demarkSelectedGoalDecompositionAsToRemove(decomposition);
		
	}
	
	/**
	 * deselect the Element
	 * @param element an Element
	 */
	public void deselectRootElement(Goal element){
		cacheManager.markSelectedGoalAsToRemove(element);
	}

	
	
	/**
	 * select a deselected Element
	 * @param element an Element
	 */
	public void reselectRootElement(Goal element){
		cacheManager.demarkSelectedGoalAsToRemove(element);
	}

}

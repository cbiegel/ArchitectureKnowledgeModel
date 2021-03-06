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

import java.util.List;
import java.util.Map.Entry;

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
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.ui.zest.figures.CheckboxFigure;
import org.emftrace.quarc.ui.zest.figures.listeners.ICheckListener;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;



/**
 * the GraphBuilder for the selection of goals
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class GoalSelectorGraphBuilder extends
		PrioritizedElementSelectorGraphBuilder {

	/**
	 * the constructor
	 * 
	 * @param parent
	 * @param style
	 * @param iWorkbenchPartSite
	 * @param inputContainer
	 * @param accessLayer
	 */
	public GoalSelectorGraphBuilder(Composite parent, int style,
			IWorkbenchPartSite iWorkbenchPartSite, GSS gss,
			SelectedGoalsSet selectedGoalSet, AccessLayer accessLayer) {
		super(parent, style, iWorkbenchPartSite, gss, selectedGoalSet,
				accessLayer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.
	 * PrioriziedElementSelectorGraphBuilder#setCheckSetForSelectedElements()
	 */
	@Override
	protected void setCheckSetForSelectedElements() {
		for (Object node : zestGraph.getNodes()) {
			if (node instanceof GSSElementGraphNode) // leave out
														// LayerLabelGraphNodes
				((GSSElementGraphNode) node).setIsCollapsed();
		}
		
		for (PrioritizedElement selectedGoal : priorizedElementSet
				.getPrioritizedElements()) {
			Element element = selectedGoal.getElement();
			
			GSSElementGraphNode node = (GSSElementGraphNode) getNodeForElement(selectedGoal
					.getElement());
			
			node = (GSSElementGraphNode) getNodeForElement(element);
			
			node.show();

			node.expandParents();
			if (!cacheManager.isLeaf(element)) {
				node.setIsExpanded();
			}
			getCheckboxFigure(node).setIsChecked();
			selectedElementsMap.put(element, selectedGoal);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.
	 * PrioriziedElementSelectorGraphBuilder#createConnectionsBetweenAllNodes()
	 */
	@Override
	protected void createConnectionsBetweenAllNodes() {
		for (Element element : cacheManager.getAllElements()) {
			for (Relation outgoingRelation : cacheManager
					.getAllOutgoingRelationsForElement(element)) {
				createConnection(outgoingRelation);
			}
		}
		
		for (Entry<Element, GSSElementGraphNode> entry : nodeMap.entrySet()) {
			if (!(entry.getKey() instanceof Goal))
				(entry.getValue()).hide();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.
	 * PrioriziedElementSelectorGraphBuilder#createNodesForAllElements()
	 */
	@Override
	protected void createNodesForAllElements() {
		for (final Element element : cacheManager.getAllElements()) {
			int level = cacheManager.getLevel(element);
			int sublevel = cacheManager.getSublevel(element);
			CheckboxFigure topFigure = null;
			if (element instanceof Goal) {
				// GraphNode node = findNodeForElement(element);
				topFigure = new CheckboxFigure(false);

			}

			GSSElementGraphNode node = createNode(zestGraph, SWT.NONE, element,
					level, sublevel, cacheManager.isLeaf(element),
					cacheManager.getAllIncomingRelationsForElement(element)
							.size() != 0, topFigure);
			if (element instanceof Goal) {
				selectionMap.put(node, topFigure);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.
	 * PrioriziedElementSelectorGraphBuilder#addCheckListeners()
	 */
	@Override
	protected void addCheckListeners() {
		for (Entry<GraphNode, CheckboxFigure> entry : selectionMap.entrySet()) {

			final Element element = ((GSSElementGraphNode) entry.getKey())
					.getElement();
			entry.getValue().addCheckListener(new ICheckListener() {

				@Override
				public void unchecked() {
					GraphNode node = getNodeForElement(element);
					for (Object connection : node.getSourceConnections()) {
						GraphNode destination = ((GraphConnection) connection)
								.getDestination();
						if (((GSSElementGraphNode) destination).getElement() instanceof Goal) {
							if (!hasSelectedSourceNodes(destination))
								getCheckboxFigure(destination).setIsUnchecked();

						}
					}
					removePriorizedElement(element);

				}

				@Override
				public void checked() {
					GSSElementGraphNode node = (GSSElementGraphNode) getNodeForElement(element);

					List<Decomposition> outgoingDecompositions = getOutgoingDecomposition(node);
					List<Decomposition> incomingDecompositions = getIncomingDecompositions(node);

					addPriorizedElement(element, outgoingDecompositions,
							incomingDecompositions);

					if (!cacheManager.isLeaf(element)) {
						node.setIsExpanded();
					}

					// add subElements

					for (Object connection : node.getTargetConnections()) {
						CheckboxFigure checkboxFigure = getCheckboxFigure((((GraphConnection) connection)
								.getSource()));
						if (checkboxFigure != null) // -> element == goal
							checkboxFigure.setIsChecked();
					}
				}
			});
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder#
	 * initCache()
	 */
	@Override
	protected void initCache() {
		cacheManager = new CacheManager((GSS) getInput(), accessLayer);
		cacheManager.initCache();
	}
}

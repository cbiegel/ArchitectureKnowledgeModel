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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.commands.prioritizedelementsset.AddPrioritizedElementCommand;
import org.emftrace.quarc.core.commands.prioritizedelementsset.RemovePrioritizedElementCommand;
import org.emftrace.quarc.ui.zest.figures.CheckboxFigure;
import org.emftrace.quarc.ui.zest.graph.GSSGraph;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;


/**
 * A GraphBuilder for the selection of PrioritizedElements
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */
public abstract class PrioritizedElementSelectorGraphBuilder extends AbstractElementGraphBuilder {
	protected PrioritizedElementSet priorizedElementSet;

	protected Map<Element, PrioritizedElement> selectedElementsMap;
	protected Map<GraphNode, CheckboxFigure> selectionMap;

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
	public PrioritizedElementSelectorGraphBuilder(Composite parent, int style,
			IWorkbenchPartSite iWorkbenchPartSite, GSS gss,
			PrioritizedElementSet priorizedElementSet, AccessLayer accessLayer) {
		super(parent, style, iWorkbenchPartSite, gss, accessLayer);
		this.accessLayer = accessLayer;
		this.priorizedElementSet = priorizedElementSet;
		this.selectedElementsMap = new HashMap<Element, PrioritizedElement>();
		this.selectionMap = new HashMap<GraphNode, CheckboxFigure>();
	}


	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder#buildCustomGraph(org.emftrace.quarc.ui.zest.graph.GSSGraph)
	 */
	@Override
	protected void buildCustomGraph(final GSSGraph zestGraph) {

		super.buildCustomGraph(zestGraph);

		createNodesForAllElements();  
		createConnectionsBetweenAllNodes();
		setCheckSetForSelectedElements();
		addCheckListeners();
	}
	
	/**
	 * create Connections between all Elements
	 */
	protected abstract void createConnectionsBetweenAllNodes();

	/**
	 * set the check State for selected Elements
	 */
	protected abstract void setCheckSetForSelectedElements();

	/**
	 * create Nodes for all Elements
	 */
	protected abstract void createNodesForAllElements();
	
	/**
	 * add the Listern for the Checkbox
	 */
	protected abstract void addCheckListeners();

	/**
	 * selectes an Element by adding a PriorizedElement
	 * 
	 * @param element a Element
	 * @param outgoingDecompositions a List with outgoing Decompositions
	 * @param incomingDecompositions a List with incoming Decompositions
	 */
	protected void addPriorizedElement(Element element,
			List<Decomposition> outgoingDecompositions,
			List<Decomposition> incomingDecompositions) {

		if (selectedElementsMap.containsKey(element))
			return;
		PrioritizedElement prioritizedElement = QueryFactory.eINSTANCE.createPrioritizedElement();
		prioritizedElement.setElement(element);

		new AddPrioritizedElementCommand(priorizedElementSet, prioritizedElement, outgoingDecompositions, incomingDecompositions).runAsJob();
		selectedElementsMap.put(element, prioritizedElement);
	}

	/**
	 * deselectes a element by removing the PriorizedElement
	 * @param element a Element
	 */
	protected void removePriorizedElement(Element element) {
		getNodeForElement(element);
		new RemovePrioritizedElementCommand(priorizedElementSet, selectedElementsMap.get(element)).runAsJob();
		selectedElementsMap.remove(element);
	}

	/**
	 * 
	 * @param node a GraphNode
	 * @return a List with all incoming Decomposition-Ratings of Element of the node
	 */
	protected List<Decomposition> getIncomingDecompositions(GraphNode node) {
		List<Decomposition> result = new ArrayList<Decomposition>();
		for (Object connection : node.getTargetConnections()){
			Element element = ((GSSElementGraphNode)((GraphConnection) connection).getSource()).getElement();
			PrioritizedElement priorizedElement = findPrioritizedElementForElement(element);
			if (priorizedElement!= null)
				result.add((Decomposition)findRelationForConnection((GraphConnection)connection));
			

		}
		return result;
	}
	
	/**
	 * 
	 * @param node a GraphNode
	 * @return a List with all outgoing Decomposition-Ratings of Element of the node
	 */
	protected List<Decomposition> getOutgoingDecomposition(GraphNode node) {
		List<Decomposition> result = new ArrayList<Decomposition>();
		for (Object connection : node.getSourceConnections()){
			Element element =  ((GSSElementGraphNode)((GraphConnection) connection).getDestination()).getElement();
			PrioritizedElement priorizedElement = findPrioritizedElementForElement(element);
			if (priorizedElement!= null)
			result.add((Decomposition)findRelationForConnection((GraphConnection)connection));
		}
		return result;
	}

	/**
	 * @param element an Element
	 * @return the PrioritizedElement for the Element
	 */
	protected PrioritizedElement findPrioritizedElementForElement(
			Element element) {
		return selectedElementsMap.get(element);
	}

	/**
	 * 
	 * @param node a GraphNode
	 * @return has this node selected childen?
	 */
	protected boolean hasSelectedSourceNodes(GraphNode node) {
		boolean result = false;
		for (Object connection : node.getTargetConnections()) {
			GraphNode source = ((GraphConnection) connection).getSource();
			if (getCheckboxFigure(source).isChecked()) {
				result = true;
				break;
			}

		}
		return result;
	}
	/**
	 * 
	 * @param node a GraphNode
	 * @return has this node selected ?
	 */
	protected boolean nodeIsSelected(GraphNode node) {
		return selectionMap.get(node).isChecked();
	}

	/**
	 * 
	 * @param node a GraphNode
	 * @return the CheckboxFigure for the node
	 */
	protected CheckboxFigure getCheckboxFigure(GraphNode node) {
		return selectionMap.get(node);
	}

}

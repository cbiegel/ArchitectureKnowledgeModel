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

package org.emftrace.quarc.ui.zest.graph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphItem;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;


/**
 * An extended Zest Graph for GSS with some helpers
 * 
 * @author Daniel Motschmann
 *
 */
public class GSSGraph extends Graph {

	/**the constructor 
	 * @param parent the parent composite
	 * @param style the swt stype
	 */
	public GSSGraph(Composite parent, int style) {
		super(parent, style);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (e.button == 1 && getFigureAt(e.x, e.y) == null) {
					//deselect all nodes if had not clicked on a node
					deselectAllNodes();
				}

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		
		
	}
	/**
	 * deselects all selected node
	 */
	public void deselectAllNodes() {
		List<Object> selectedNodes = new ArrayList<Object>(); //due to concurrent access to the selected nodes, the list must be duplicated
		selectedNodes.addAll(this.getSelection());			  //otherwise an expection will be raised
		for (Object selectedNode:selectedNodes ){
			if (selectedNode instanceof GSSElementGraphNode )
			deselectNode((GSSElementGraphNode) selectedNode, false);
		}

	}

	/**
	 * selects the specified node
	 * @param node the GSSElementGraphNode to select
	 * @param replaceSelection should selection be replaced?
	 */
	public void selectNode(GSSElementGraphNode node, boolean replaceSelection) {
		if (!replaceSelection) {
			GraphItem[] selectedItems = new GraphItem[this.getSelection().size()+1];
		int i = 0;
		for (Object selectedObject : this.getSelection()){
			selectedItems[i] = (GraphItem)selectedObject;
			i++;
		}
		selectedItems[i] = node;
		this.setSelection(selectedItems);
		}
		else {
		GraphItem[] selectedItems = { node };
		this.setSelection(selectedItems);
		
		}

		Event event = new Event();
		event.widget = node;
		this.notifyListeners(SWT.Selection, event);
		node.notifySelectionListeners();
		
	}
	
	/**
	 * selects the specified nodes
	 * @param nodes a List with GSSElementGraphNode to select
	 * @param replaceSelection should selection be replaced?
	 */
	public void selectNodes(List<GSSElementGraphNode> nodes, boolean replaceSelection) {
		if (replaceSelection) {
		GraphItem[] selectedItems = { };
		this.setSelection(selectedItems);
		}
		for (GSSElementGraphNode node : nodes){
			selectNode(node, false);
		}	
	}
	
	/**
	 * deselects the specified nodes
	 * @param nodes a List with GSSElementGraphNode to deselect
	 */
	public void deselectNodes(List<GSSElementGraphNode> nodes) {
		for (GSSElementGraphNode node : nodes){
			deselectNode(node, false);
		}	
	}
	
	/**
	 * deselects the specified node
	 * @param node the GSSElementGraphNode to deselect
	 * @param clearCompleteSelection deselect all nodes?
	 */
	public void deselectNode(GSSElementGraphNode node, boolean clearCompleteSelection) {
		if (!clearCompleteSelection) {
			GraphItem[] selectedItems = new GraphItem[this.getSelection().size()-1];
			int i = 0;
			for (Object selectedObject : this.getSelection()){
				if (node != selectedObject){
				selectedItems[i] = (GraphItem)selectedObject;
				i++;
				}
			}
			this.setSelection(selectedItems);
		}
		else {
			GraphItem[] selectedItems = { };
			this.setSelection(selectedItems);
		}	
		Event event = new Event();
		event.widget = node;
		this.notifyListeners(SWT.Selection, event);
		node.notifySelectionListeners();	
	}

}

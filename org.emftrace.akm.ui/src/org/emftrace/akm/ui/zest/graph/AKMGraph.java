package org.emftrace.akm.ui.zest.graph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphItem;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;

/**
 * The Graph that is used to to display an {@link ArchitectureKnowledgeModel} and its components.<br>
 * This class originates from the QUARC project and was modified for the AKM project.
 * 
 * @author Christopher Biegel
 * 
 */
public class AKMGraph extends Graph {

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor.
	 * 
	 * @param pParent
	 *            The parent Composite of this graph
	 * @param pStyle
	 *            The SWT style for this graph
	 */
	public AKMGraph(final Composite pParent, final int pStyle) {
		super(pParent, pStyle);

		this.addMouseListener(new org.eclipse.swt.events.MouseAdapter() {

			@Override
			public void mouseDown(final MouseEvent pEvent) {
				if ((pEvent.button == 1) && (getFigureAt(pEvent.x, pEvent.y) == null)) {

					// if a mouse click was performed on an empty space (no
					// nodes were selected), deselect all previously selected
					// nodes.
					deselectAllNodes();
				}
			}
		});
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Selects the specified node.
	 * 
	 * @param pNode
	 *            The node to select
	 * @param pReplaceSelection
	 *            If true, the selected node will be replaced. Otherwise, it will not be replaced.
	 */
	public void selectNode(final AbstractAKMGraphNode pNode, final boolean pReplaceSelection) {
		if (!pReplaceSelection) {
			GraphItem[] selectedItems = new GraphItem[this.getSelection().size() + 1];
			int i = 0;
			for (Object selectedObject : this.getSelection()) {
				selectedItems[i] = (GraphItem) selectedObject;
				i++;
			}
			selectedItems[i] = pNode;
			this.setSelection(selectedItems);
		} else {
			GraphItem[] selectedItems = { pNode };
			this.setSelection(selectedItems);
		}

		Event event = new Event();
		event.widget = pNode;
		this.notifyListeners(SWT.Selection, event);
		pNode.notifySelectionListeners();
	}

	/**
	 * Deselects all currently selected nodes in the graph.
	 */
	public void deselectAllNodes() {
		List<Object> selectedNodes = new ArrayList<Object>(); // due to concurrent access to the
																// selected nodes, the list must be
																// duplicated
		selectedNodes.addAll(this.getSelection()); // otherwise an expection will be raised
		for (Object selectedNode : selectedNodes) {
			if (selectedNode instanceof AbstractAKMGraphNode) {
				deselectNode((AbstractAKMGraphNode) selectedNode, false);
			}
		}
	}

	/**
	 * Deselects a specific node in the graph.
	 * 
	 * @param pNode
	 *            the AbstractAKMGraphNode to deselect
	 * @param pClearCompleteSelection
	 *            If true, all nodes will be deselected. Otherwise, will only deselect the given
	 *            {@link pNode}.
	 */
	public void
			deselectNode(final AbstractAKMGraphNode pNode, final boolean pClearCompleteSelection) {
		if (!pClearCompleteSelection) {
			GraphItem[] selectedItems = new GraphItem[this.getSelection().size() - 1];
			int i = 0;
			for (Object selectedObject : this.getSelection()) {
				if (pNode != selectedObject) {
					selectedItems[i] = (GraphItem) selectedObject;
					i++;
				}
			}
			this.setSelection(selectedItems);
		} else {
			GraphItem[] selectedItems = {};
			this.setSelection(selectedItems);
		}
		Event event = new Event();
		event.widget = pNode;
		this.notifyListeners(SWT.Selection, event);
		pNode.notifySelectionListeners();
	}
}
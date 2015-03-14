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



package org.emftrace.quarc.ui.zest.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.quarc.ui.zest.connections.GSSRelationConnection;
import org.emftrace.quarc.ui.zest.figures.ElementFigure;
import org.emftrace.quarc.ui.zest.figures.listeners.IExpandListener;
import org.emftrace.quarc.ui.zest.graph.GSSGraph;

/**
 * A GraphNode for representing a GSS Element with a custom figure
 * (ElementFigure)
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */
public class GSSElementGraphNode extends GraphNode {

	/**
	 * the represented GSS Element
	 */
	private Element element;

	/**
	 * the custom figure for the node
	 */
	private ElementFigure elementFigure = null;

	/**
	 * the level of the node ( e.g. goal = 0, principle = 1, instrument = 2)
	 */
	private int level;

	/**
	 * the sub level of the node (e.g. count of ancestors)
	 */
	private int sublevel;

	/**
	 * flag of marking
	 */
	private boolean mark;

	/**
	 * the Color for marking
	 */
	private Color markColor;

	/**
	 * the popup menu of the node
	 */
	private Menu menu;
	/**
	 * the default colors
	 */
	private final Color defaultMarkColor = Display.getDefault().getSystemColor(
			SWT.COLOR_TITLE_BACKGROUND_GRADIENT);
	private final Color defaultHighlightColor = Display.getDefault()
			.getSystemColor(SWT.COLOR_LIST_SELECTION);
	private final Color defaultBackgroundColor = Display.getDefault()
			.getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);
	private final Color defaultTextColor = Display.getDefault().getSystemColor(
			SWT.COLOR_BLACK);
	private final Color defaultMarkedTextColor = Display.getDefault()
			.getSystemColor(SWT.COLOR_BLACK);
	private final Color defaultHighlightTextColor = Display.getDefault()
			.getSystemColor(SWT.COLOR_LIST_SELECTION_TEXT);

	/**
	 * is node visible?
	 */
	private boolean isVisbile;

	/**
	 * color used to painted the text of a marked node
	 */
	private Color markedTextColor;

	/**
	 * color used to painted the text of a highlighted node
	 */
	private Color highlightedTextColor;

	/**
	 * color used to painted the text
	 */

	private Color textColor;

	/**
	 * the default constructor
	 * 
	 * @param graphModel
	 *            the container graph
	 * @param style
	 *            the SWT style
	 * @param elementFigure
	 *            the custom figure for the node
	 * @param level
	 *            the level of the node ( e.g. goal = 0, principle = 1,
	 *            instrument = 2)
	 * @param sublevel
	 *            the sub level of the node (e.g. count of ancestors)
	 * @param element
	 *            the represented GSS Element
	 */
	public GSSElementGraphNode(IContainer graphModel, int style,
			ElementFigure elementFigure, int level, int sublevel,
			Element element) {
		super(graphModel, style, elementFigure);
		this.level = level;
		this.sublevel = sublevel;
		this.element = element;
		this.elementFigure = elementFigure;
		this.elementFigure.setHighlightColor(defaultHighlightColor);
		this.elementFigure.setBackgroundColor(defaultBackgroundColor);
		this.mark = false;
		this.isVisbile = true;
		this.markColor = defaultMarkColor;
		this.setHighlightColor(defaultHighlightColor);
		this.setBackgroundColor(defaultBackgroundColor);
		this.setTextColor(defaultTextColor);
		this.setMarkedTextColor(defaultMarkedTextColor);
		this.setHighlightedTextColor(defaultHighlightTextColor);
		selectionListeners = new ArrayList<SelectionListener>();

		addDefaultMouseListener();

		addDefaultExpandListener();

	}

	/**
	 * a List with all listening SelectionListeners
	 */
	private List<SelectionListener> selectionListeners;

	/**
	 * adds the specified IExpandListener
	 * 
	 * @param expandListener
	 *            a IExpandListener
	 */
	public void addExpandListener(IExpandListener expandListener) {
		this.getElementFigure().addExpandListener(expandListener);
	}

	/**
	 * removes the specified IExpandListener
	 * 
	 * @param expandListener
	 *            a IExpandListener
	 */
	public void removeExpandListener(IExpandListener expandListener) {
		this.getElementFigure().removeExpandListener(expandListener);
	}

	/**
	 * @return the local element figure
	 */
	public ElementFigure getElementFigure() {
		return elementFigure;
	}

	/**
	 * @return true if node is visible
	 */
	public boolean isVisbile() {
		return isVisbile;
	}

	/**
	 * @return true if node is expanded (all children are shown)
	 */
	public boolean isExpanded() {
		return elementFigure.isExpanded();
	}

	/**
	 * @return true if node it collapsed (no children are shown)
	 */
	public boolean isCollasped() {
		return !elementFigure.isExpanded();
	}

	/**
	 * creates and add the default ShowHideListener to show or hide children if
	 * uses clicks on the showHideFigure
	 */
	private void addDefaultExpandListener() {
		final GSSElementGraphNode thisNode = this;

		elementFigure.addExpandListener(new IExpandListener() {

			@Override
			public void expanded() {
				// thisNode.showChildren();
				thisNode.expand();
			}

			@Override
			public void collapsed() {
				// thisNode.hideChildren();
				thisNode.collapse();
			}
		});

	}

	/**
	 * hides the node
	 */
	public void hide() {
		isVisbile = false;
		setVisible(false);
	}

	/**
	 * shows the node if node is hidden
	 */
	public void show() {
		isVisbile = true;
		setVisible(true);
		
		//hide connections
		//due to zest shows all connection when setVisible is called
		@SuppressWarnings("rawtypes")
		List sConnections = (this).getSourceConnections();
		@SuppressWarnings("rawtypes")
		List tConnections = (this).getTargetConnections();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator2 = sConnections.iterator(); iterator2.hasNext();) {
			GraphConnection connection = (GraphConnection) iterator2.next();
			connection.setVisible(false);
		}

		for (@SuppressWarnings("rawtypes")
		Iterator iterator2 = tConnections.iterator(); iterator2.hasNext();) {
			GraphConnection connection = (GraphConnection) iterator2.next();
			connection.setVisible(false);
		}
	}

	/**
	 * creates a mouse listener to open a Menu by right clicking or to select
	 * the node by left clicking
	 */
	private void addDefaultMouseListener() {
		final GSSGraph graph = (GSSGraph) getGraphModel();
		final GSSElementGraphNode node = this;

		elementFigure.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent me) {

			}

			@Override
			public void mouseReleased(MouseEvent me) {
				if (me.button == 1) {
					// left mouse button was pressed
					setSelection(me.getState());
				} else if (me.button == 3) {
					// right mouse button was pressed

					// get location of the mouse in the workspace
					int x = graph.getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getLocation().x;
					int y = graph.getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getLocation().y;
					x += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getLocation().x;
					y += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getLocation().y;

					x += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getLocation().x;
					y += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getLocation().y;

					x += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getLocation().x;
					y += graph.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getParent().getParent()
							.getParent().getParent().getLocation().y;

					openMenu(me.x + x, me.y + y);
				}

			}

			private void openMenu(int xPos, int yPos) {
				if (menu != null) {
					menu.setLocation(xPos, yPos);
					menu.setVisible(true);
				}

			}

			private void setSelection(int state) {
				if (state == 786432) {
					// control was pressed & hold

					if (graph.getSelection().contains(node)) {
						// remove selected node

						graph.deselectNode(node, false);
					} else {
						// add selected node
						graph.selectNode(node, false);
					}
				} else if (graph.getSelection().contains(node)) {
					// clear selection
					graph.deselectNode(node, true);
				} else {
					// add selected node
					graph.selectNode(node, true);

				}

			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {

			}

		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#highlight()
	 */
	@Override
	public void highlight() {
		super.highlight();
		elementFigure.setHighlightColor(this.getHighlightColor());
		elementFigure.setLabelColor(this.getHighlightedTextColor());
		elementFigure.highlight();
	}

	/**
	 * marks the node
	 */
	public void mark() {
		mark = true;
		if (this.isSelected() == false) {
			elementFigure.setHighlightColor(this.getMarkColor());
			elementFigure.setLabelColor(this.getMarkedTextColor());
			elementFigure.highlight();
		}
		super.highlight();
	}

	/**
	 * @return the Color used to paint the text of a non-marked and
	 *         non-highlighted node
	 */
	public Color getTextColor() {
		return this.textColor;
	}

	/**
	 * setter for the Color used to paint the text of a non-marked and
	 * non-highlighted node
	 * 
	 * @param c
	 *            a Color
	 */
	public void setTextColor(Color c) {
		this.textColor = c;
	}

	/**
	 * @return the Color used to paint the text of a marked node
	 */
	public Color getMarkedTextColor() {
		return this.markedTextColor;
	}

	/**
	 * setter for the Color used to paint the text of a marked node
	 * 
	 * @param c
	 *            a Color
	 */
	public void setMarkedTextColor(Color c) {
		this.markedTextColor = c;
	}

	/**
	 * @return the Color used to paint the text of a highlighted node
	 */
	public Color getHighlightedTextColor() {
		return this.highlightedTextColor;
	}

	/**
	 * setter for the Color used to paint the text of a highlighted node
	 * 
	 * @param c
	 *            a Color
	 */
	public void setHighlightedTextColor(Color c) {
		this.highlightedTextColor = c;
	}

	/**
	 * unmarks the node
	 */
	public void unmark() {
		mark = false;
		elementFigure.setHighlightColor(this.getHighlightColor());
		if (this.isSelected() == true) {
			elementFigure.setLabelColor(this.getHighlightedTextColor());
			elementFigure.highlight();
			super.highlight();
		} else {
			elementFigure.setLabelColor(this.getTextColor());
			elementFigure.unhighlight();
			super.unhighlight();
		}
	}

	/**
	 * @return true if the node is marked<br>
	 *         note: a node could be marked and highlighted as well
	 */
	public boolean isMarked() {
		return mark;
	}

	/**
	 * setter for the Color used to mark a node
	 * 
	 * @param c
	 *            a Color
	 */
	public void setMarkColor(Color color) {
		markColor = color;
		elementFigure.setHighlightColor(color);
	}

	/**
	 * getter for the Color used to mark a node
	 * 
	 * @return the use Color
	 */
	public Color getMarkColor() {
		return markColor;
	}

	/**
	 * setter for a PopupMenu for the node
	 * 
	 * @param menu
	 *            a Menu
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.widgets.GraphNode#setHighlightColor(org.eclipse
	 * .swt.graphics.Color)
	 */
	@Override
	public void setHighlightColor(Color c) {
		super.setHighlightColor(c);
		elementFigure.setHighlightColor(c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.widgets.GraphNode#setBackgroundColor(org.eclipse
	 * .swt.graphics.Color)
	 */
	@Override
	public void setBackgroundColor(Color c) {
		super.setBackgroundColor(c);
		elementFigure.setBackgroundColor(c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#unhighlight()
	 */
	@Override
	public void unhighlight() {
		super.unhighlight();
		if (isMarked() == true) {
			elementFigure.setHighlightColor(this.getMarkColor());
			elementFigure.setLabelColor(this.getMarkedTextColor());
			elementFigure.highlight();
		} else {

			elementFigure.setHighlightColor(this.getHighlightColor());
			elementFigure.setLabelColor(this.getTextColor());
			elementFigure.unhighlight();
		}
	}

	/**
	 * the width of the painted figure <br>
	 * <br>
	 * <b>note:</b> <br>
	 * the figure must be painted already!</b>
	 * 
	 * @return the width of the painted figure
	 */
	public int getElementFigureWidth() {
		return elementFigure.getWidth();
	}

	/**
	 * the height of the painted figure <br>
	 * <br>
	 * <b>note:</b><br>
	 * the figure must be painted already!</b>
	 * 
	 * @return the height of the painted figure
	 */
	public int getElementFigureHeight() {
		return elementFigure.getHeight();
	}

	/**
	 * getter for the represented Element
	 * 
	 * @return the represented Element
	 */
	public Element getElement() {
		return this.element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#createFigureForModel()
	 */
	@Override
	protected IFigure createFigureForModel() {
		return (IFigure) this.getData();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#toString()
	 */
	@Override
	public String toString() {
		// must be overridden due to GraphNode uses text attribute for toString
		return "GSSElementGraphNode \"" + element.getName() + "\"";
	}

	/**
	 * getter for level
	 * 
	 * @return the level of the node
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * setter for level
	 * 
	 * @param level
	 *            the level of the node
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * getter for sub level
	 * 
	 * @return the sub level of the node
	 */
	public int getSubLevel() {
		return sublevel;
	}

	/**
	 * setter for sub level
	 * 
	 * @param sublevel
	 *            the sub level of the node
	 */
	public void setSublevel(int sublevel) {
		this.sublevel = sublevel;
	}

	/**
	 * adds the specified SelectionListener
	 * 
	 * @param listener
	 *            a SelectionListener
	 */
	public void addSelectionListener(SelectionListener listener) {
		selectionListeners.add(listener);
	}

	/**
	 * removes the specified SelectionListener
	 * 
	 * @param listener
	 *            a SelectionListener
	 */
	public void removeSelectionListener(SelectionListener listener) {
		selectionListeners.remove(listener);
	}

	/**
	 * shows all children of the node
	 */
	public void showChildren() {
		showChildren(this);
		// elementFigure.setIsExpanded();
		graph.applyLayout();
	}

	/**
	 * hides all children of the node
	 */
	public void hideChildren() {
		hideChildren(this);
		// elementFigure.setIsCollapsed();
		graph.applyLayout();
	}

	/**
	 * shows all children of the specified node
	 * 
	 * @param node
	 *            a GSSElementGraphNode
	 */
	private void showChildren(GSSElementGraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			GSSElementGraphNode childNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getSource();
			childNode.show();
			if (childNode.isExpanded())
				showChildren(childNode);
		}
	}

	/**
	 * hides all children of the specified node
	 * 
	 * @param node
	 *            a GSSElementGraphNode
	 */
	private void hideChildren(GSSElementGraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			GSSElementGraphNode childNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getSource();
			childNode.hide();
			hideChildren(childNode);
		}
	}

	/**
	 * show all parent nodes
	 */
	public void showParents() {
		showParents(this);
		graph.applyLayout();
	}

	/**
	 * expand the node
	 */
	public void expand() {
		expandChildren(this);
		graph.applyLayout();
	}

	/**
	 * collapse the node
	 */
	public void collapse() {
		collapseChildren(this);
		graph.applyLayout();
	}

	/**
	 * expand children to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void expandChildren(GSSElementGraphNode node) {
		// show only connections to expanded nodes

		for (Object connection : node.getSourceConnections()) {
			GSSElementGraphNode parentNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getDestination();
			if (parentNode.isExpanded() && parentNode.isVisbile()) {
				((GraphConnection) connection).setVisible(true);
			} else {
				((GraphConnection) connection).setVisible(false);
			}
			
		}
		
		// show all children
		for (Object connection : node.getTargetConnections()) {
			if (connection instanceof GSSRelationConnection) {
				Relation relation = ((GSSRelationConnection) connection)
						.getRelation();
				if (relation instanceof Offset) {
					continue;
				}

			}
			GSSElementGraphNode childNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getSource();
			
			if (!childNode.isVisbile) {
				childNode.show();

			}
			((GraphConnection) connection).setVisible(true);
			if (childNode.isExpanded())
				expandChildren(childNode);
		}
		
	}

	/**
	 * collapse children to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void collapseChildren(GSSElementGraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			GSSElementGraphNode childNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getSource();

			boolean hasNoOtherParent = true;
			for (Object connectionToParent : childNode.getSourceConnections()) {
				GSSElementGraphNode parent = (GSSElementGraphNode) ((GraphConnection) connectionToParent)
						.getDestination();

				if (connectionToParent instanceof GSSRelationConnection) {
					Relation relation = ((GSSRelationConnection) connectionToParent)
							.getRelation();
					if (relation instanceof Offset) {
						continue;

					} else

					if (parent != node && parent.isVisbile()
							&& parent.isExpanded()) {
						hasNoOtherParent = false;
						break;
					}
				}
			}

			if (hasNoOtherParent) {
				childNode.hide();
				collapseChildren(childNode);
			} // else {
			((GraphConnection) connection).setVisible(false);
			// }
		}

	}

	/**
	 * show all parents to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void showParents(GSSElementGraphNode node) {
		for (Object connection : node.getSourceConnections()) {
			GSSElementGraphNode parentNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getDestination();
			parentNode.show();

			((GraphConnection) connection).setVisible(true);
			if (parentNode.isExpanded()) {

				showParents(parentNode);
			}
		}
	}

	/**
	 * hide all parents
	 */
	public void hideParents() {
		hideParents(this);
	}

	/**
	 * hide all parents to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void hideParents(GSSElementGraphNode node) {
		for (Object connection : node.getSourceConnections()) {
			GSSElementGraphNode parentNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getDestination();
			parentNode.hide();
			hideParents(parentNode);
		}
	}

	/**
	 * mark all parents
	 */
	public void markParents() {
		markParents(this);
	}

	/**
	 * mark all children
	 */
	public void markChildren() {
		markChildren(this);
	}

	/**
	 * mark all children to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void markChildren(GraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			GSSElementGraphNode childNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getSource();
			childNode.mark();
			markChildren(childNode);
		}
	}

	/**
	 * mark all parents to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void markParents(GraphNode node) {
		for (Object connection : node.getSourceConnections()) {
			GSSElementGraphNode parentNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getDestination();
			parentNode.mark();
			markParents(parentNode);
		}
	}

	/**
	 * set state to expanded
	 */
	public void setIsExpanded() {
		elementFigure.setIsExpanded();

	}

	/**
	 * set state to collapsed
	 */
	public void setIsCollapsed() {

		elementFigure.setIsCollapsed();
	}

	/**
	 * expand parents
	 */
	public void expandParents() {

		expandParents(this);
	}

	/**
	 * expand all parents to the specified node
	 * 
	 * @node a GSSElementGraphNode
	 */
	private void expandParents(GraphNode node) {

		for (Object connection : node.getSourceConnections()) {
			GSSElementGraphNode parentNode = (GSSElementGraphNode) ((GraphConnection) connection)
					.getDestination();
			parentNode.show();
			parentNode.expand();

			((GraphConnection) connection).setVisible(true);

			if (parentNode.isCollasped()) {
				expandParents(parentNode);

			}
		}
	}

	/**
	 * notifies all listening SelectionListeners(
	 */
	public void notifySelectionListeners() {
		for (SelectionListener listener : selectionListeners) {
			Event event = new Event();
			event.widget = this;
			SelectionEvent selectionEvent = new SelectionEvent(event);
			listener.widgetSelected(selectionEvent);
		}
	}

}

package org.emftrace.akm.ui.zest.nodes;

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
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.quarc.ui.zest.connections.GSSRelationConnection;
import org.emftrace.quarc.ui.zest.figures.ElementFigure;
import org.emftrace.quarc.ui.zest.figures.listeners.IExpandListener;

/**
 * This abstract class serves as a super class for all types of GraphNodes of an
 * {@link org.emftrace.akm.ui.zest.graph.AKMGraph}.
 * 
 * @author Christopher Biegel
 * 
 */
public abstract class AbstractAKMGraphNode extends GraphNode {

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The default colors
	 */
	private final Color mDefaultMarkColor = Display.getDefault().getSystemColor(
			SWT.COLOR_TITLE_BACKGROUND_GRADIENT);
	private final Color mDefaultHighlightColor = Display.getDefault().getSystemColor(
			SWT.COLOR_LIST_SELECTION);
	private final Color mDefaultBackgroundColor = Display.getDefault().getSystemColor(
			SWT.COLOR_WIDGET_BACKGROUND);
	private final Color mDefaultTextColor = Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
	private final Color mDefaultMarkedTextColor = Display.getDefault().getSystemColor(
			SWT.COLOR_BLACK);
	private final Color mDefaultHighlightTextColor = Display.getDefault().getSystemColor(
			SWT.COLOR_LIST_SELECTION_TEXT);

	/**
	 * The custom ElementFigure for the node
	 */
	private ElementFigure mElementFigure = null;

	/**
	 * The level of the node within the graph (e.g. ArchitectureKnowledgeModel = 0,
	 * TechnologySolution = 1, TechnologyFeature = 2, ...)
	 */
	private int mLevel;

	/**
	 * The sub level of the node (e.g. count of ancestors)
	 */
	private int mSublevel;

	/**
	 * Flag of marking
	 */
	private boolean mIsMarked;

	/**
	 * The Color for marking
	 */
	private Color mMarkColor;

	/**
	 * The context menu of the node
	 */
	private Menu mMenu;

	/**
	 * Flag for the visibility of the node
	 */
	private boolean mIsVisbile;

	/**
	 * Color used to painted the text of a marked node
	 */
	private Color mMarkedTextColor;

	/**
	 * Color used to painted the text of a highlighted node
	 */
	private Color mHighlightedTextColor;

	/**
	 * Color used to painted the text of the node
	 */
	private Color mTextColor;

	/**
	 * A List of all listening SelectionListeners
	 */
	private List<SelectionListener> mSelectionListenerList;

	/**
	 * The ArchitectureKnowledgeModelBase element represented by this node
	 */
	private ArchitectureKnowledgeModelBase mAKMBaseElement;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The default constructor
	 * 
	 * @param pGraphModel
	 *            The graph that contains this node
	 * @param pStyle
	 *            The SWT style used for this node
	 * @param pElementFigure
	 *            The custom figure for the node
	 * @param pLevel
	 *            The level of the node within the graph (e.g. ArchitectureKnowledgeModel = 0,
	 *            TechnologySolution = 1, TechnologyFeature = 2, ...)
	 * @param pSublevel
	 *            The sub level of the node (e.g. count of ancestors)
	 * @param pElement
	 *            The ArchitectureKnowledgeModelBase element represented by this node
	 */
	public AbstractAKMGraphNode(final IContainer pGraphModel, final int pStyle,
			final ElementFigure pElementFigure, final int pLevel, final int pSublevel,
			final ArchitectureKnowledgeModelBase pElement) {

		super(pGraphModel, pStyle, pElementFigure);
		mLevel = pLevel;
		mSublevel = pSublevel;
		mElementFigure = pElementFigure;
		mElementFigure.setHighlightColor(mDefaultHighlightColor);
		mElementFigure.setBackgroundColor(mDefaultBackgroundColor);
		mIsMarked = false;
		mIsVisbile = true;
		mMarkColor = mDefaultMarkColor;
		setHighlightColor(mDefaultHighlightColor);
		setBackgroundColor(mDefaultBackgroundColor);
		setTextColor(mDefaultTextColor);
		setMarkedTextColor(mDefaultMarkedTextColor);
		setHighlightedTextColor(mDefaultHighlightTextColor);
		mSelectionListenerList = new ArrayList<SelectionListener>();
		mAKMBaseElement = pElement;

		addDefaultMouseListener();

		addDefaultExpandListener();
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#setHighlightColor(org.eclipse
	 * .swt.graphics.Color)
	 */
	@Override
	public void setHighlightColor(final Color c) {
		super.setHighlightColor(c);
		mElementFigure.setHighlightColor(c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.widgets.GraphNode#setBackgroundColor(org.eclipse
	 * .swt.graphics.Color)
	 */
	@Override
	public void setBackgroundColor(final Color c) {
		super.setBackgroundColor(c);
		mElementFigure.setBackgroundColor(c);
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
			mElementFigure.setHighlightColor(getMarkColor());
			mElementFigure.setLabelColor(this.getMarkedTextColor());
			mElementFigure.highlight();
		} else {

			mElementFigure.setHighlightColor(this.getHighlightColor());
			mElementFigure.setLabelColor(this.getTextColor());
			mElementFigure.unhighlight();
		}
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
	 * @see org.eclipse.zest.core.widgets.GraphNode#highlight()
	 */
	@Override
	public void highlight() {
		super.highlight();
		mElementFigure.setHighlightColor(this.getHighlightColor());
		mElementFigure.setLabelColor(this.getHighlightedTextColor());
		mElementFigure.highlight();
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Adds the specified IExpandListener to the ElementFigure of this node
	 * 
	 * @param pExpandListener
	 *            An IExpandListener to be added
	 */
	public void addExpandListener(final IExpandListener pExpandListener) {
		getElementFigure().addExpandListener(pExpandListener);
	}

	/**
	 * Removes the specified IExpandListener from the ElementFigure of this node
	 * 
	 * @param pExpandListener
	 *            An IExpandListener to be removed
	 */
	public void removeExpandListener(final IExpandListener pExpandListener) {
		getElementFigure().removeExpandListener(pExpandListener);
	}

	/**
	 * Creates and adds the default listener to show or hide children if a click was performed on
	 * this node
	 */
	private void addDefaultExpandListener() {
		final AbstractAKMGraphNode thisNode = this;

		mElementFigure.addExpandListener(new IExpandListener() {

			@Override
			public void expanded() {

				thisNode.expand();
			}

			@Override
			public void collapsed() {

				thisNode.collapse();
			}
		});
	}

	/**
	 * Hide this node
	 */
	public void hide() {
		this.setVisible(false);
		setVisible(false);
	}

	/**
	 * Show the node if it is hidden
	 */
	public void show() {
		this.setVisible(true);
		setVisible(true);

		// hide connections
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
	 * Creates a mouse listener to open a context menu by right clicking or to select the node by
	 * left clicking
	 */
	private void addDefaultMouseListener() {
		final AKMGraph graph = (AKMGraph) getGraphModel();
		final AbstractAKMGraphNode node = this;

		mElementFigure.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(final MouseEvent me) {

			}

			@Override
			public void mouseReleased(final MouseEvent me) {
				if (me.button == 1) {
					// left mouse button was pressed
					setSelection(me.getState());
				} else if (me.button == 3) {
					// right mouse button was pressed

					// get location of the mouse in the workspace
					int x =
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getLocation().x;
					int y =
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getLocation().y;
					x +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getLocation().x;
					y +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getLocation().y;

					x +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getParent().getLocation().x;
					y +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getParent().getLocation().y;

					x +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getLocation().x;
					y +=
							graph.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getParent()
									.getParent().getParent().getParent().getParent().getLocation().y;

					openMenu(me.x + x, me.y + y);
				}
			}

			private void openMenu(final int xPos, final int yPos) {
				if (mMenu != null) {
					mMenu.setLocation(xPos, yPos);
					mMenu.setVisible(true);
				}
			}

			private void setSelection(final int state) {

				// TODO CB State-Code in Variable auslagern
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
			public void mouseDoubleClicked(final MouseEvent me) {

			}
		});
	}

	/**
	 * Mark the node
	 */
	public void mark() {
		mIsMarked = true;
		if (this.isSelected() == false) {
			mElementFigure.setHighlightColor(this.getMarkColor());
			mElementFigure.setLabelColor(this.getMarkedTextColor());
			mElementFigure.highlight();
		}
		super.highlight();
	}

	/**
	 * Unmark the node
	 */
	public void unmark() {
		mIsMarked = false;
		mElementFigure.setHighlightColor(this.getHighlightColor());
		if (this.isSelected() == true) {
			mElementFigure.setLabelColor(this.getHighlightedTextColor());
			mElementFigure.highlight();
			super.highlight();
		} else {
			mElementFigure.setLabelColor(this.getTextColor());
			mElementFigure.unhighlight();
			super.unhighlight();
		}
	}

	/**
	 * Adds the specified SelectionListener
	 * 
	 * @param pListener
	 *            The SelectionListener to be added
	 */
	public void addSelectionListener(final SelectionListener pListener) {
		mSelectionListenerList.add(pListener);
	}

	/**
	 * Removes the specified SelectionListener
	 * 
	 * @param pListener
	 *            The SelectionListener to be removed
	 */
	public void removeSelectionListener(final SelectionListener pListener) {
		mSelectionListenerList.remove(pListener);
	}

	/**
	 * Shows all children of the node
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
	 * @param pNode
	 *            AN AbstractAKMGraphNode
	 */
	private void showChildren(final AbstractAKMGraphNode pNode) {
		for (Object connection : pNode.getTargetConnections()) {
			AbstractAKMGraphNode childNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getSource();
			childNode.show();
			if (childNode.isExpanded()) {
				showChildren(childNode);
			}
		}
	}

	/**
	 * Hide all children of the specified node
	 * 
	 * @param pNode
	 *            An AbstractAKMGraphNode
	 */
	private void hideChildren(final AbstractAKMGraphNode pNode) {
		for (Object connection : pNode.getTargetConnections()) {
			AbstractAKMGraphNode childNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getSource();
			childNode.hide();
			hideChildren(childNode);
		}
	}

	/**
	 * Show all parent nodes
	 */
	public void showParents() {
		showParents(this);
		graph.applyLayout();
	}

	/**
	 * Hide all parent nodes
	 */
	public void hideParents() {
		hideParents(this);
	}

	/**
	 * Mark all parent nodes
	 */
	public void markParents() {
		markParents(this);
	}

	/**
	 * Mark all child nodes
	 */
	public void markChildren() {
		markChildren(this);
	}

	/**
	 * Expand this node
	 */
	public void expand() {
		expandChildren(this);
		graph.applyLayout();
	}

	/**
	 * Collapse this node
	 */
	public void collapse() {
		collapseChildren(this);
		graph.applyLayout();
	}

	/**
	 * Expand all parent nodes
	 */
	public void expandParents() {

		expandParents(this);
	}

	/**
	 * Show all parent nodes of the specified node
	 * 
	 * @param pNode
	 *            The node to show its parents of
	 */
	private void showParents(final AbstractAKMGraphNode pNode) {
		for (Object connection : pNode.getSourceConnections()) {
			AbstractAKMGraphNode parentNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getDestination();
			parentNode.show();

			((GraphConnection) connection).setVisible(true);
			if (parentNode.isExpanded()) {

				showParents(parentNode);
			}
		}
	}

	/**
	 * Hide all parents to the specified node
	 * 
	 * @param pNode
	 *            The node to hide its parents of
	 */
	private void hideParents(final AbstractAKMGraphNode pNode) {
		for (Object connection : pNode.getSourceConnections()) {
			AbstractAKMGraphNode parentNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getDestination();
			parentNode.hide();
			hideParents(parentNode);
		}
	}

	/**
	 * Mark all parents to the specified node
	 * 
	 * @param pNdoe
	 *            The node to mark its parents of
	 */
	private void markParents(final GraphNode pNode) {
		for (Object connection : pNode.getSourceConnections()) {
			AbstractAKMGraphNode parentNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getDestination();
			parentNode.mark();
			markParents(parentNode);
		}
	}

	/**
	 * Mark all children to the specified node
	 * 
	 * @param pNode
	 *            The node to mark its children of
	 */
	private void markChildren(final GraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			AbstractAKMGraphNode childNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getSource();
			childNode.mark();
			markChildren(childNode);
		}
	}

	/**
	 * Expand children of the specified node
	 * 
	 * @param pNode
	 *            The node to expand its children of
	 */
	private void expandChildren(final AbstractAKMGraphNode pNode) {
		// show only connections to expanded nodes

		for (Object connection : pNode.getSourceConnections()) {
			AbstractAKMGraphNode parentNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getDestination();
			if (parentNode.isExpanded() && parentNode.isVisible()) {
				((GraphConnection) connection).setVisible(true);
			} else {
				((GraphConnection) connection).setVisible(false);
			}

		}

		// show all children
		for (Object connection : pNode.getTargetConnections()) {
			// TODO CB Relations-Typ �ndern
			if (connection instanceof GSSRelationConnection) {
				Relation relation = ((GSSRelationConnection) connection).getRelation();
				if (relation instanceof Offset) {
					continue;
				}

			}
			AbstractAKMGraphNode childNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getSource();

			if (!childNode.isVisible()) {
				childNode.show();

			}
			((GraphConnection) connection).setVisible(true);
			if (childNode.isExpanded()) {
				expandChildren(childNode);
			}
		}

	}

	/**
	 * Collapse children of the specified node
	 * 
	 * @param pNode
	 *            The node to collapse its children of
	 */
	private void collapseChildren(final AbstractAKMGraphNode node) {
		for (Object connection : node.getTargetConnections()) {
			AbstractAKMGraphNode childNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getSource();

			boolean hasNoOtherParent = true;
			for (Object connectionToParent : childNode.getSourceConnections()) {
				AbstractAKMGraphNode parent =
						(AbstractAKMGraphNode) ((GraphConnection) connectionToParent)
								.getDestination();

				if (connectionToParent instanceof GSSRelationConnection) {
					// TODO CB Relations-Typ �ndern
					Relation relation = ((GSSRelationConnection) connectionToParent).getRelation();
					if (relation instanceof Offset) {
						continue;

					} else

					if ((parent != node) && parent.isVisible() && parent.isExpanded()) {
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
	 * Expand all parents to the specified node
	 * 
	 * @param pNode
	 *            The node to expand all parents of
	 */
	private void expandParents(final GraphNode pNode) {

		for (Object connection : pNode.getSourceConnections()) {
			AbstractAKMGraphNode parentNode =
					(AbstractAKMGraphNode) ((GraphConnection) connection).getDestination();
			parentNode.show();
			parentNode.expand();

			((GraphConnection) connection).setVisible(true);

			if (parentNode.isCollasped()) {
				expandParents(parentNode);

			}
		}
	}

	/**
	 * Notifies all listening SelectionListeners(
	 */
	public void notifySelectionListeners() {
		for (SelectionListener listener : mSelectionListenerList) {
			Event event = new Event();
			event.widget = this;
			SelectionEvent selectionEvent = new SelectionEvent(event);
			listener.widgetSelected(selectionEvent);
		}
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * @return The ElementFigure of this node
	 */
	public ElementFigure getElementFigure() {
		return mElementFigure;
	}

	/**
	 * @param pElementFigure
	 *            The ElementFigure to set
	 */
	public void setElementFigure(final ElementFigure pElementFigure) {
		mElementFigure = pElementFigure;
	}

	/**
	 * The width of the painted figure <br>
	 * <br>
	 * <b>Note:</b> <br>
	 * The figure must be painted already!</b>
	 * 
	 * @return The width of the painted figure
	 */
	public int getElementFigureWidth() {
		return mElementFigure.getWidth();
	}

	/**
	 * The height of the painted figure <br>
	 * <br>
	 * <b>Note:</b><br>
	 * The figure must be painted already!</b>
	 * 
	 * @return The height of the painted figure
	 */
	public int getElementFigureHeight() {
		return mElementFigure.getHeight();
	}

	/**
	 * @return True, if this node is expanded (all children are shown). Otherwise, returns false
	 */
	public boolean isExpanded() {
		return mElementFigure.isExpanded();
	}

	/**
	 * @return True, if this node it collapsed (no children are shown). Otherwise, returns false
	 */
	public boolean isCollasped() {
		return !mElementFigure.isExpanded();
	}

	/**
	 * Set state to expanded
	 */
	public void setIsExpanded() {
		mElementFigure.setIsExpanded();

	}

	/**
	 * Set state to collapsed
	 */
	public void setIsCollapsed() {

		mElementFigure.setIsCollapsed();
	}

	/**
	 * @return The level of the node within the graph (e.g. ArchitectureKnowledgeModel = 0,
	 *         TechnologySolution = 1, TechnologyFeature = 2, ...)
	 */
	public int getLevel() {
		return mLevel;
	}

	/**
	 * @param pLevel
	 *            The level of this node to set
	 */
	public void setmLevel(final int pLevel) {
		mLevel = pLevel;
	}

	/**
	 * @return The sublevel of this node (e.g. the count of ancestors)
	 */
	public int getSubLevel() {
		return mSublevel;
	}

	/**
	 * @param pSublevel
	 *            The sublevel of this node to set
	 */
	public void setmSublevel(final int pSublevel) {
		mSublevel = pSublevel;
	}

	/**
	 * @return True, if this node acts as a mark. Otherwise, returns false.
	 */
	public boolean isMark() {
		return mIsMarked;
	}

	/**
	 * @param pMark
	 *            Whether this node should act as a mark
	 */
	public void setMark(final boolean pMark) {
		mIsMarked = pMark;
	}

	/**
	 * @return The color of the mark
	 */
	public Color getMarkColor() {
		return mMarkColor;
	}

	/**
	 * @param pMarkColor
	 *            The color of the mark to set
	 */
	public void setMarkColor(final Color pMarkColor) {
		mMarkColor = pMarkColor;
	}

	/**
	 * @param pMenu
	 *            The context menu for this node to set
	 */
	public void setMenu(final Menu pMenu) {
		mMenu = pMenu;
	}

	/**
	 * @return True, if this node is invisible. Otherwise, returns false.
	 */
	public boolean IsVisbile() {
		return mIsVisbile;
	}

	/**
	 * @param pIsVisbile
	 *            Whether this node is visible or not
	 */
	public void setIsVisbile(final boolean pIsVisbile) {
		mIsVisbile = pIsVisbile;
	}

	/**
	 * @return The color of the marked text
	 */
	public Color getMarkedTextColor() {
		return mMarkedTextColor;
	}

	/**
	 * @param pMarkedTextColor
	 *            The color of the marked text to set
	 */
	public void setMarkedTextColor(final Color pMarkedTextColor) {
		mMarkedTextColor = pMarkedTextColor;
	}

	/**
	 * @return The color of the highlighted text
	 */
	public Color getHighlightedTextColor() {
		return mHighlightedTextColor;
	}

	/**
	 * @param pHighlightedTextColor
	 *            The color of the highlighted text to set
	 */
	public void setHighlightedTextColor(final Color pHighlightedTextColor) {
		mHighlightedTextColor = pHighlightedTextColor;
	}

	/**
	 * @return The color of the text
	 */
	public Color getTextColor() {
		return mTextColor;
	}

	/**
	 * @param pTextColor
	 *            The color of the text to set
	 */
	public void setTextColor(final Color pTextColor) {
		mTextColor = pTextColor;
	}

	/**
	 * @return True, if the node is marked.<br>
	 *         Note: A node could be marked and highlighted as well
	 */
	public boolean isMarked() {
		return mIsMarked;
	}

	/**
	 * @return The ArchitectureKnowledgeModelBase element represented by this node
	 */
	public ArchitectureKnowledgeModelBase getAKMBaseElement() {
		return mAKMBaseElement;
	}
}

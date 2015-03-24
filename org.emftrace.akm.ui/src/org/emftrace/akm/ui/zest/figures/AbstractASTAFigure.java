package org.emftrace.akm.ui.zest.figures;

import java.awt.MouseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.emftrace.akm.ui.zest.figures.listeners.IExpandListener;
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.akm.ui.zest.nodes.ASTAGraphNode;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA;

/**
 * An abstract class for a figure that is used for {@link ASTAGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public abstract class AbstractASTAFigure extends AbstractAKMFigure {

	// ===========================================================
	// Constants
	// ===========================================================

	/**
	 * The default font size
	 */
	final protected static int DEFAULT_FONT_SIZE = 8;

	/**
	 * Default font
	 */
	final protected static Font DEFAULT_FONT = new Font(null, "Arial", DEFAULT_FONT_SIZE,
			SWT.NORMAL);

	/**
	 * Default font for titles (bold)
	 */
	final protected static Font DEFAULT_FONT_TITLE = new Font(null, "Arial", DEFAULT_FONT_SIZE,
			SWT.BOLD);

	/**
	 * A List of all the Labels in this figure
	 */
	final protected List<Label> mContentsList;

	/**
	 * A Map that maps the labels of this figure to their associated ASTA elements
	 */
	final protected Map<Label, ASTA> mASTAMap;

	/**
	 * A Map that maps the name of this figure's ASTA elements to their respective labels
	 */
	final protected Map<String, Label> mLabelMap;

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The RectangleFigure that draws the border of this figure
	 */
	protected RectangleFigure mBorderFigure;

	/**
	 * The layout of this figure's border figure
	 */
	protected GridLayout mGridLayout;

	/**
	 * Contains information about whether a label in this figure is currently selected
	 */
	private boolean mIsLabelSelected;

	/**
	 * The currently selected label (if a label is selected)
	 */
	private Label mSelectedLabel;

	/**
	 * A Map that maps each label to its associated context menu
	 */
	private Map<Label, Menu> mContextMenuMap;

	/**
	 * The Color that is used to highlight this figure
	 */
	private Color mHighlightColor;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * Constructor
	 */
	public AbstractASTAFigure() {

		mContentsList = new ArrayList<Label>();
		mASTAMap = new HashMap<Label, ASTA>();
		mLabelMap = new HashMap<String, Label>();
		mContextMenuMap = new HashMap<Label, Menu>();

		mBorderFigure = new RectangleFigure();
		mBorderFigure.setFill(true);

		mGridLayout = new GridLayout(1, false);
		mGridLayout.marginHeight = 10;
		mGridLayout.marginWidth = 10;

		setLayoutManager(new GridLayout(1, false));
		mBorderFigure.setLayoutManager(mGridLayout);
		add(mBorderFigure);
		setOpaque(false);
		setSize(-1, -1);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * @return The amount of {@link ASTA} elements in this figure
	 */
	public int getContentsCount() {
		return mContentsList.size();
	}

	/**
	 * @return True, if a label in this figure is currently selected
	 */
	public boolean isLabelSelected() {
		return mIsLabelSelected;
	}

	/**
	 * @return The currently selected label. If no label is currently selected, return null
	 */
	public Label getSelectedLabel() {
		return mSelectedLabel;
	}

	/**
	 * Get the {@link ASTA} element for the given label.
	 * 
	 * @param pLabel
	 *            The label to get the ASTA element for
	 * @return The ASTA element of the given label
	 */
	public ASTA getASTAElementForLabel(final Label pLabel) {

		return mASTAMap.get(pLabel);
	}

	/**
	 * Get the Label for the given {@link ASTA} element
	 * 
	 * @param pASTAElement
	 *            The ASTA element to get the label for
	 * @return The Label of the given ASTA element
	 */
	public Label getLabelForASTAElement(final ASTA pASTAElement) {
		return mLabelMap.get(pASTAElement.getName());
	}

	/**
	 * Set the context menu of a label
	 * 
	 * @param pLabel
	 *            The label to set the context menu for
	 * @param pMenu
	 *            The new menu of the label
	 */
	public void setContextMenu(final Label pLabel, final Menu pMenu) {
		mContextMenuMap.put(pLabel, pMenu);
	}

	/**
	 * @return The title label of this figure
	 */
	abstract public Label getTitleLabel();

	/**
	 * @return The title of this figure
	 */
	abstract public String getTitle();

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public void repaint() {
		super.repaint();
	}

	@Override
	public void highlight() {
		mBorderFigure.setBackgroundColor(mHighlightColor);
	}

	@Override
	public void unhighlight() {
		mBorderFigure.setBackgroundColor(getBackgroundColor());
	}

	@Override
	public void setHighlightColor(final Color pColor) {
		mHighlightColor = pColor;
	}

	@Override
	public boolean isExpanded() {
		return false;
	}

	@Override
	public void setIsExpanded() {
	}

	@Override
	public void setIsCollapsed(final boolean pApplyLayout) {
	}

	@Override
	public void setLabelColor(final Color pColor) {
		for (Label label : mContentsList) {
			label.setOpaque(false);
			label.setBackgroundColor(getBackgroundColor());
			if (!label.hasFocus()) {
				label.setForegroundColor(pColor);
			}
		}
	}

	@Override
	public void addMouseListener(final MouseListener listener) {

		mBorderFigure.addMouseListener(listener);
	}

	@Override
	public void removeMouseListener(final MouseListener listener) {

		mBorderFigure.removeMouseListener(listener);
	}

	@Override
	public void addExpandListener(final IExpandListener expandListener) {
	}

	@Override
	public void removeExpandListener(final IExpandListener expandListener) {
	}

	public Color getHighlightColor() {
		return mHighlightColor;
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * @return A list of all the {@link ASTA} elements contained in this figure
	 */
	public List<ASTA> getContents() {

		Collection<ASTA> collection = mASTAMap.values();
		List<ASTA> astaList = new ArrayList<ASTA>(collection);

		return astaList;
	}

	/**
	 * Remove the specified {@link ASTA} element from this figure
	 * 
	 * @param pElement
	 *            The ASTA element to be removed
	 */
	public void removeElement(final ASTA pElement) {

		Figure elementFigure = mLabelMap.get(pElement.getName());

		if (mContentsList.contains(elementFigure)) {
			mBorderFigure.remove(elementFigure);
			mContentsList.remove(elementFigure);
		}
	}

	/**
	 * Add the specified {@link ASTA} element to this figure
	 * 
	 * @param pElement
	 *            The ASTA element to be added
	 */
	public void addElement(final ASTA pElement) {

		Figure elementFigure = mLabelMap.get(pElement.getName());

		if (!mContentsList.contains(elementFigure)) {
			mBorderFigure.add(elementFigure);
			mContentsList.add((Label) elementFigure);
		}
	}

	/**
	 * Determines whether this figure contains the given {@link ASTA} element
	 * 
	 * @param pElement
	 *            The ASTA element to check
	 * @return True, if this figure contains the given ASTA element. Otherwise, returns false.
	 */
	public boolean figureContainsElement(final ASTA pElement) {

		return mContentsList.contains(pElement);
	}

	/**
	 * Creates a mouse listener to open a context menu by right clicking or to select the node by
	 * left clicking
	 */
	public void addCustomMouseListener(final AKMGraph pGraph, final AbstractAKMGraphNode pNode) {

		for (final Label label : mContentsList) {

			label.addMouseListener(new MouseListener() {

				@Override
				public void mousePressed(final MouseEvent me) {

				}

				@Override
				public void mouseReleased(final MouseEvent me) {
					if (me.button == 1) {
						// left mouse button was pressed
						setSelection(me.getState());
						label.setOpaque(true);
						label.setBackgroundColor(mHighlightColor);
						label.setForegroundColor(new Color(Display.getCurrent(), 255, 255, 255));

						mBorderFigure.setBackgroundColor(Display.getDefault().getSystemColor(
								SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
						for (Label otherLabel : mContentsList) {
							if (otherLabel != label) {
								otherLabel.setForegroundColor(new Color(Display.getCurrent(), 0, 0,
										0));
							}
						}

					} else if (me.button == 3) {

						// The location of the mouse event is relative to the location within the
						// graph. The menu coordinates are relative to the display (screen).
						// Therefore, it requires the location on the display.
						java.awt.Point displayLocation = MouseInfo.getPointerInfo().getLocation();

						openMenu(displayLocation.x, displayLocation.y);
					}
				}

				private void openMenu(final int pXPos, final int pYPos) {

					Menu contextMenu = mContextMenuMap.get(label);

					if (contextMenu != null) {
						contextMenu.setLocation(pXPos, pYPos);
						contextMenu.setVisible(true);
					}
				}

				private void setSelection(final int state) {

					if (state == 786432) {
						// control was pressed & hold

						if (pGraph.getSelection().contains(pNode)) {
							// remove selected node

							pGraph.deselectNode(pNode, false);
						} else {
							// add selected node
							pGraph.selectNode(pNode, false);
						}
					} else if (pGraph.getSelection().contains(pNode)) {
						// clear selection
						pGraph.deselectNode(pNode, true);
					} else {
						// add selected node
						mIsLabelSelected = true;
						mSelectedLabel = label;
						pGraph.selectNode(pNode, true);
						mIsLabelSelected = false;
						mSelectedLabel = null;
					}
				}

				@Override
				public void mouseDoubleClicked(final MouseEvent me) {

				}
			});
		}
	}
}

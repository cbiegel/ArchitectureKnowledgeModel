package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.emftrace.akm.ui.zest.figures.listeners.IExpandListener;

public abstract class AbstractAKMFigure extends Figure {

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * the height of the whole Figure
	 */
	private int mHeight;

	/**
	 * the width of the whole Figure
	 */
	private int mWidth;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * 
	 * the constructor
	 * 
	 * @param bodyDecoratorFigure
	 *            the AbstractDecoratorFigure for the body
	 * @param footDecoratorFigure
	 *            the Figure for the decoration of the bottom
	 * @param headDecoratorFigure
	 *            the Figure for the decoration of the top
	 */
	public AbstractAKMFigure() {

	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * @return The height of this figure
	 */
	public int getHeight() {
		return mHeight;
	}

	/**
	 * @return The width of this figure
	 */
	public int getWidth() {
		return mWidth;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	@Override
	protected void paintFigure(final Graphics g) {
		super.paintFigure(g);
		// the height and weight for the figure could only be accessed here
		// after the figure it painted!
		Rectangle r = getClientArea();
		mHeight = r.height;
		mWidth = r.width;

	}

	// ===========================================================
	// Methods
	// ===========================================================

	abstract public void highlight();

	abstract public void unhighlight();

	abstract public void setHighlightColor(final Color pColor);

	abstract public boolean isExpanded();

	abstract public void setIsExpanded();

	abstract public void setIsCollapsed();

	abstract public void setLabelColor(final Color pColor);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Figure#addMouseListener(org.eclipse.draw2d.MouseListener)
	 */
	@Override
	abstract public void addMouseListener(final MouseListener listener);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Figure#removeMouseListener(org.eclipse.draw2d.MouseListener)
	 */
	@Override
	abstract public void removeMouseListener(final MouseListener listener);

	/**
	 * adds the specified ExpandListener
	 * 
	 * @param showHideListener
	 */
	abstract public void addExpandListener(final IExpandListener expandListener);

	/**
	 * removes the specified ExpandListener
	 * 
	 * @param showHideListener
	 */
	abstract public void removeExpandListener(final IExpandListener expandListener);

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}

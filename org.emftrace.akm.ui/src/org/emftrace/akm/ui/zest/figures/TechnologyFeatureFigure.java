package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class TechnologyFeatureFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Fields
	// ===========================================================

	private Color mBorderColor;

	// ===========================================================
	// Constructors
	// ===========================================================

	public TechnologyFeatureFigure(final String pName, final boolean pIsExpandable,
			final Color pBorderColor) {

		super(pName, pIsExpandable);
		mBorderColor = pBorderColor;
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

		Rectangle r = getClientArea();

		r.setWidth(r.width - 1);
		r.setHeight(r.height - 1);

		if (mBorderColor != null) {
			g.setForegroundColor(mBorderColor);
		} else {
			g.setForegroundColor(new Color(Display.getCurrent(), 255, 255, 255));
		}

		// drawAndFillFigureBorder(g, points);
		drawAndFillFigureBorderOval(g, r);
	}
}

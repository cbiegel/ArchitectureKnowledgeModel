package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.emftrace.akm.ui.zest.nodes.TechnologyFeatureGraphNode;

/**
 * The figure for {@link TechnologyFeatureGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public class TechnologyFeatureFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The color of this figure's border
	 */
	private Color mBorderColor;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor.
	 * 
	 * @param pName
	 *            The name of this figure's element (will be displayed)
	 * @param pIsExpandable
	 *            Whether this figure is expandable or not
	 * @param pBorderColor
	 *            The color of this figure's border
	 */
	public TechnologyFeatureFigure(final String pName, final boolean pIsExpandable,
			final Color pBorderColor) {

		super(pName, pIsExpandable);
		mBorderColor = pBorderColor;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

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

		drawAndFillFigureBorderOval(g, r);
	}
}

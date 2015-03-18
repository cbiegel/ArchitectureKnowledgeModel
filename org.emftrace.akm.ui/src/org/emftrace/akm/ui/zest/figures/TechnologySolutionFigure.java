package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class TechnologySolutionFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor
	 * 
	 * @param name
	 *            the name of the Element
	 * @param isExpandable
	 *            node is expandable or not
	 */
	public TechnologySolutionFigure(final String name, final boolean isExpandable) {
		super(name, isExpandable);
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

		int x = r.x;
		int y = r.y;
		int cutoff = r.height / 4;

		PointList points = new PointList();
		points.addPoint(x, y + cutoff);
		points.addPoint(x + cutoff, y);
		points.addPoint((x + r.width) - cutoff, y);
		points.addPoint(x + r.width, y + cutoff);
		points.addPoint(x + r.width, (y + r.height) - cutoff);
		points.addPoint((x + r.width) - cutoff, y + r.height);
		points.addPoint(x + cutoff, y + r.height);
		points.addPoint(x, (y + r.height) - cutoff);
		points.addPoint(x, y + cutoff);

		// PointList points = new PointList();
		// points.addPoint(r.x, r.y - (r.height / 2));
		// points.addPoint(r.x + (r.width / 2), r.y);
		// points.addPoint(r.x + r.width, r.y - (r.height / 2));
		// points.addPoint(r.x + (r.width / 2), r.y - r.height);
		// points.addPoint(r.x, r.y - (r.height / 2));

		// drawAndFillFigureBorder(g, points);
		drawAndFillFigureBorder(g, points);
	}
}

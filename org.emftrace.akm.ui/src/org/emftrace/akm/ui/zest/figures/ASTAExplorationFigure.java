package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class ASTAExplorationFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public ASTAExplorationFigure(final String name, final boolean isExpandable) {
		super(name, isExpandable);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void paintFigure(final Graphics g) {
		super.paintFigure(g);

		Rectangle r = getClientArea();

		r.setWidth(r.width - 1);
		r.setHeight(r.height - 1);

		drawAndFillFigureBorderRectangle(g, r);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}

package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.emftrace.akm.ui.zest.nodes.AKMElementGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;

/**
 * The figure used for {@link AKMElementGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public class AKMElementFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor
	 * 
	 * @param pName
	 *            The name of this figure's {@link ArchitectureKnowledgeModel} element
	 * @param pIsExpandable
	 *            Whether the node of this figure is expandable or not
	 */
	public AKMElementFigure(final String pName, final boolean pIsExpandable) {
		super(pName, pIsExpandable);
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

		PointList points = new PointList();

		points.addPoint(r.x, r.y + (r.height / 2));
		points.addPoint(r.x + (r.width / 2), r.y);
		points.addPoint((r.x + r.width) - 1, r.y + (r.height / 2));
		points.addPoint(r.x + (r.width / 2), (r.y + r.height) - 1);
		points.addPoint(r.x, r.y + (r.height / 2));

		// drawAndFillFigureBorder(g, points);
		drawAndFillFigureBorder(g, points);
	}
}

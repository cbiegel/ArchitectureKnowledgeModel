package org.emftrace.akm.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.emftrace.akm.ui.zest.nodes.ASTAExplorationGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA;

/**
 * The figure used for {@link ASTAExplorationGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public class ASTAExplorationFigure extends AbstractDecoratorFigure {

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * Constructor.
	 * 
	 * @param pName
	 *            The name of this figure's {@link ASTA} element
	 * @param pIsExpandable
	 *            Whether the node of this figure is expandable or not
	 */
	public ASTAExplorationFigure(final String pName, final boolean pIsExpandable) {
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

		drawAndFillFigureBorderRectangle(g, r);
	}
}

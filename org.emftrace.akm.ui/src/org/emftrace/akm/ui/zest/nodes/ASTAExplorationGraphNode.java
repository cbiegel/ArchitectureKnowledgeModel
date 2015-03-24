package org.emftrace.akm.ui.zest.nodes;

import org.eclipse.zest.core.widgets.IContainer;
import org.emftrace.akm.ui.zest.figures.AbstractAKMFigure;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA;

/**
 * A GraphNode for representing an {@link ASTA} element with a custom figure.<br>
 * This GraphNode is used in the Benefit&Drawback Exploration View
 * 
 * @author Christopher Biegel
 * 
 */
public class ASTAExplorationGraphNode extends AbstractAKMGraphNode {

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The {@link ASTA} element represented by this graph node
	 */
	private ASTA mASTAElement;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor
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
	 * @param pASTAElement
	 *            The represented {@link ASTA} object of this node
	 */
	public ASTAExplorationGraphNode(final IContainer pGraphModel, final int pStyle,
			final AbstractAKMFigure pElementFigure, final int pLevel, final int pSublevel,
			final ASTA pASTAElement) {
		super(pGraphModel, pStyle, pElementFigure, pLevel, pSublevel, pASTAElement);

		mASTAElement = pASTAElement;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * Getter for the represented Element
	 * 
	 * @return The {@link ASTA} element represented by this node
	 */
	public ASTA getASTAElement() {
		return mASTAElement;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public String toString() {
		// must be overridden due to GraphNode using text attribute for toString
		return "ASTAExplorationGraphNode \"" + mASTAElement.getName() + "\"";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}

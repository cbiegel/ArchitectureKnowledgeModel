package org.emftrace.akm.ui.zest.nodes;

import org.eclipse.zest.core.widgets.IContainer;
import org.emftrace.akm.ui.zest.figures.ElementFigure;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;

/**
 * A GraphNode for representing an ArchitectureKnowledgeModel element with a custom figure
 * 
 * @author Christopher Biegel
 * 
 */
public class AKMElementGraphNode extends AbstractAKMGraphNode {

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The represented ArchitectureKnowledgeModel object
	 */
	private ArchitectureKnowledgeModel mArchitectureKnowledgeModel;

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
	 * @param pModel
	 *            The represented ArchitectureKnowledgeModel object of this node
	 */
	public AKMElementGraphNode(final IContainer pGraphModel, final int pStyle,
			final ElementFigure pElementFigure, final int pLevel, final int pSublevel,
			final ArchitectureKnowledgeModel pModel) {

		super(pGraphModel, pStyle, pElementFigure, pLevel, pSublevel, pModel);

		this.mArchitectureKnowledgeModel = pModel;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * Getter for the represented Element
	 * 
	 * @return The element represented by this node
	 */
	public ArchitectureKnowledgeModel getArchitectureKnowledgeModel() {
		return mArchitectureKnowledgeModel;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public String toString() {
		// must be overridden due to GraphNode using text attribute for toString
		return "AKMElementGraphNode \"" + mArchitectureKnowledgeModel.getName() + "\"";
	}
}

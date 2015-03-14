package org.emftrace.akm.ui.zestgraphbuilders;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions;

public class FeaturesExplorationGraphBuilder extends AbstractElementGraphBuilder {

	private ArchitectureKnowledgeModel mModel;

	public FeaturesExplorationGraphBuilder(final Composite pParentComposite, final int pStyle,
			final IWorkbenchPartSite pWorkbenchPartSite, final ArchitectureKnowledgeModel pModel,
			final AccessLayer pAccessLayer) {

		super(pParentComposite, pStyle, pWorkbenchPartSite, pModel, pAccessLayer);

		mModel = pModel;
		TechnologySolutions solutions = pModel.getTechnologySolutions();
		EList<TechnologySolution> solutionList = solutions.getTechnologySolution();
	}

	@Override
	protected void initCache() {

		cacheManager = new org.emftrace.akm.core.cache.CacheManager(mModel, accessLayer);
		cacheManager.initCache();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see quarc_gssquerygui.zestgpraphbuilders.AbstractElementGraphBuilder#
	 * buildCustomGraph(org.eclipse.zest.core.widgets.Graph)
	 */
	@Override
	protected void buildCustomGraph(final AKMGraph pZestGraph) {

		super.buildCustomGraph(pZestGraph);

		// Get the AKM object
		ArchitectureKnowledgeModel model = cacheManager.getModel();
		// Get the TechnologySolutions of the model
		TechnologySolutions technologySolutions = model.getTechnologySolutions();
		EList<TechnologySolution> technologySolutionList =
				technologySolutions.getTechnologySolution();

		// Create a node for the ArchitectureKnowledgeModel element
		createAKMElementNode(pZestGraph, SWT.NONE, model, 0, 0, false, true);

		// Create a node for each TechnologySolution element in the AKM element and connect them
		for (TechnologySolution technologySolution : technologySolutionList) {
			createAKMElementNode(pZestGraph, SWT.NONE, technologySolution, 1, 0, false, true);
		}

		// Create connections for all elements with ArchitectureKnowledgeModel as source element
		// and TechnologySolution as target element
		// TODO CB: Diese Schleife wird zweimal hintereinander durchlaufen. Aus Performance-Gr�nden
		// nach oben verlagern?
		for (TechnologySolution technologySolution : technologySolutionList) {
			createConnection(model, technologySolution);
		}
	}

}

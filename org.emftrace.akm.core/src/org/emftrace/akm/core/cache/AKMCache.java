package org.emftrace.akm.core.cache;

import org.eclipse.emf.common.util.EList;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions;

/**
 * The main cache<br>
 * This class contains parts of the QUARC project and was modified for the AKM project.
 * 
 * @author Christopher Biegel
 * 
 */
public class AKMCache extends AbstractCache {

	public AKMCache(final ArchitectureKnowledgeModel pInput, final AccessLayer pAccessLayer) {
		super(pInput, pAccessLayer);
	}

	@Override
	public void initCache() {

	}

	/**
	 * @return the input of the cache
	 */
	public ArchitectureKnowledgeModel getModel() {
		return (ArchitectureKnowledgeModel) getInput();
	}

	public TechnologySolutions getTechnologySolutions() {

		ArchitectureKnowledgeModel model = getModel();
		TechnologySolutions solutions = model.getTechnologySolutions();
		EList<TechnologySolution> solutionList = solutions.getTechnologySolution();

		for (TechnologySolution technologySolution : solutionList) {
			System.out.println("AKMCache:\t" + technologySolution.getName());
		}

		return null;
	}
}

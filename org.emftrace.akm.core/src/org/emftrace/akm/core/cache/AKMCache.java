package org.emftrace.akm.core.cache;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions;

public class AKMCache extends AbstractCache {

	/**
	 * A set to cache TechnologySolution objects
	 */
	private Set<TechnologySolution> mTechnologySolutionSet;

	public AKMCache(final ArchitectureKnowledgeModel pInput, final AccessLayer pAccessLayer) {
		super(pInput, pAccessLayer);
	}

	@Override
	public void initCache() {

		mTechnologySolutionSet = new HashSet<TechnologySolution>();

		// for (ApplicableElement applicableElement : getQueryResultSet().getApplicableElements()) {
		// addApplicableElementToCache(applicableElement);
		// }

		Object test = getTechnologySolutions();

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
/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.quarc.core.commands.prioritizedelementsset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;

/**
 * A command to repair selected priorities of a prioritized element (e.g.
 * selected goals)
 * 
 * @author Daniel Motschmann
 * 
 */
public class RepairPrioritizedElemenetsPrioritiesCommand extends
		AbstractPrioritizedElemenetsSetCommand {

	private Map<Element, Boolean> lockedElements;

	/**
	 * an alternative constructor
	 * 
	 * @param priorizedElementsSet
	 *            a PrioritizedElementSet
	 */
	public RepairPrioritizedElemenetsPrioritiesCommand(
			PrioritizedElementSet priorizedElementsSet) {
		super("repair selected goal proitiy", priorizedElementsSet);
		this.lockedElements = new HashMap<Element, Boolean>();
	}

	/**
	 * an alternative constructor
	 * 
	 * @param priorizedElementsSet
	 *            a PrioritizedElementSet
	 * @param lockedElements
	 *            a map with the locked PrioritizedElements
	 */
	public RepairPrioritizedElemenetsPrioritiesCommand(
			PrioritizedElementSet priorizedElementsSet,
			Map<Element, Boolean> lockedElements) {
		super("repair selected goal proitiy", priorizedElementsSet);
		this.lockedElements = lockedElements;
	}

	private Map<PrioritizedDecomposition, Element> targetDecompositionMap = new HashMap<PrioritizedDecomposition, Element>();
	private Map<PrioritizedDecomposition, Element> sourceDecompositionMap = new HashMap<PrioritizedDecomposition, Element>();
	private Map<Element, PrioritizedElement> priorizedElementMap = new HashMap<Element, PrioritizedElement>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.emftrace.quarc.core.commands.prioritizedelementsset.
	 * AbstractPrioritizedElemenetsSetCommand#doRun()
	 */
	@Override
	protected void doRun() {

		for (PrioritizedDecomposition d : priorizedElementsSet
				.getPriorizedDecompositionRelations()) {
			targetDecompositionMap.put(d, d.getDecompostion().getTarget());
			sourceDecompositionMap.put(d, d.getDecompostion().getSource());
		}

		for (PrioritizedElement e : priorizedElementsSet
				.getPrioritizedElements()) {
			priorizedElementMap.put(e.getElement(), e);
		}

		List<Element> roots = findRoots();

		int prioritySum = 0;
		int countOfElements = roots.size();
		int countOfLockedElements = 0; // lockedGoals.size();

		for (Element element : roots) {
			PrioritizedElement priorizedElement = priorizedElementMap
					.get(element);
			String priorityString = priorizedElement.getGlobalPriority();
			if (priorityString != null) {
				prioritySum += Integer.parseInt(priorityString);
			}

			if (isLocked(element)) {

				countOfLockedElements++;
			}
		}

		int countOfNotLockedElement = countOfElements - countOfLockedElements;
		int notAssignedLocalPrioritysumOfNotLocked = 100 - prioritySum;

		int diffForEachNotLockedElement = countOfNotLockedElement != 0 ? notAssignedLocalPrioritysumOfNotLocked
				/ countOfNotLockedElement
				: 0;

		int modulo = countOfNotLockedElement != 0 ? notAssignedLocalPrioritysumOfNotLocked
				% countOfNotLockedElement
				: 0;

		int i = 0;

		if (notAssignedLocalPrioritysumOfNotLocked != 0) {

			for (Element element : roots) {

				if (!isLocked(element)) {
					i++;

					PrioritizedElement priorizedElement = priorizedElementMap
							.get(element);
					String oldPriorityString = priorizedElement
							.getGlobalPriority();
					int oldPriorityInt = oldPriorityString != null ? Integer
							.parseInt(oldPriorityString) : 0;
					int newPriorityInt = oldPriorityInt
							+ diffForEachNotLockedElement;
					if (modulo >= i)
						newPriorityInt++;

					String newPrioritySting = String.valueOf(newPriorityInt);
					priorizedElement.setGlobalPriority(newPrioritySting);

				}
			}
		}

	}

	/**
	 * finds root elements of the
	 * 
	 * @return List with the found roots
	 */
	private List<Element> findRoots() {
		List<Element> result = new ArrayList<Element>();

		for (Element element : priorizedElementMap.keySet()) {

			if (!sourceDecompositionMap.containsValue(element)) {
				result.add(element);
			}
		}
		return result;
	}

	/**
	 * i
	 * @param element a Element
	 * @return is the element locked?
	 */
	private boolean isLocked(Element element) {
		return lockedElements.containsKey(element)
				&& lockedElements.get(element) == true;
	}
}

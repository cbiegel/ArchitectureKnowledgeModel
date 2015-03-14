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
import java.util.List;

import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;


/**
 * removes a priorizedElement from a PriorizedElemenetsSet
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class RemovePrioritizedElementCommand extends
		AbstractPrioritizedElemenetsSetCommand {

	/**
	 * the  PriorizedElement to remove
	 */
	private PrioritizedElement priorizedElement;

	/**
	 * the constructor
	 * 
	 * @param priorizedElementsSet the containment PriorizedElementSet
	 * @param priorizedElement the PriorizedElement to remove
	 */
	public RemovePrioritizedElementCommand(
			PrioritizedElementSet priorizedElementsSet,
			PrioritizedElement priorizedElement) {
		super("removing priorized element \""
				+ getElementName(priorizedElement) + "\"", priorizedElementsSet);
		this.priorizedElement = priorizedElement;

	}

	/**
	 * gets the Name for a PriorizedElement
	 * @param priorizedElement a PriorizedElement
	 * @return the name
	 */
	private static String getElementName(PrioritizedElement priorizedElement) {
		return (priorizedElement!= null && priorizedElement.getElement() != null
				&& priorizedElement.getElement().getName() != null ? priorizedElement
				.getElement().getName() : "");
	}

	/* (non-Javadoc)
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		super.doRun();
		if (priorizedElement == null) return;
			
		Element element = priorizedElement.getElement();
		List<PrioritizedDecomposition> toRemoveList = new ArrayList<PrioritizedDecomposition>();
		for (PrioritizedDecomposition priorizedDecomposition : priorizedElementsSet
				.getPriorizedDecompositionRelations()) {
			if (priorizedDecomposition.getDecompostion().getTarget() == element
					|| priorizedDecomposition.getDecompostion().getSource() == element)
				toRemoveList.add(priorizedDecomposition);
		}

		for (PrioritizedDecomposition priorizedDecomposition : toRemoveList) {
			priorizedElementsSet.getPriorizedDecompositionRelations().remove(
					priorizedDecomposition);
		}

		priorizedElementsSet.getPrioritizedElements().remove(priorizedElement);
	}
}
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

import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;


/**
 * Command to update the priority of a PrioritizeddElement
 * 
 * @author Daniel Motschmann
 *
 */
public class UpdatePrioritizedElementPriorityCommand extends AbstractPrioritizedElemenetsSetCommand {
	
	private String newPriority;
	private  PrioritizedElement priorizedElement;
	
	/**
	 * the constructor
	 * 
	 * @param priorizedElementsSet the parent PrioritizedElementSet
	 * @param priorizedElement a PrioritizedElement
	 * @param newPriority the new priority as string
	 */
	public UpdatePrioritizedElementPriorityCommand(PrioritizedElementSet priorizedElementsSet, PrioritizedElement priorizedElement, String newPriority) {
		super("update selected goal proiritiy", priorizedElementsSet);

		this.newPriority = newPriority;
		this.priorizedElement = priorizedElement;

	}

	/* (non-Javadoc)
	 * @see org.emftrace.quarc.core.commands.prioritizedelementsset.AbstractPrioritizedElemenetsSetCommand#doRun()
	 */
	@Override
	protected void doRun() {
		super.doRun();
		priorizedElement.setGlobalPriority(newPriority);
		
	}
}

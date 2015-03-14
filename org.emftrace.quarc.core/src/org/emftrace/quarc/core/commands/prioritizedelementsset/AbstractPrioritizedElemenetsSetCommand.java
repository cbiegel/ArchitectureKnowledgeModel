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

import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;

import org.emftrace.ui.command.AbstractCommand;


/**
 * Abstract Command for PrioritizedElemenetsSets
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractPrioritizedElemenetsSetCommand extends AbstractCommand {

	protected PrioritizedElementSet priorizedElementsSet;

	/**
	 * the constructor
	 * 
	 * @param label the label for the job
	 * @param priorizedElementsSet a PrioritizedElementSet
	 */
	public AbstractPrioritizedElemenetsSetCommand(String label, PrioritizedElementSet priorizedElementsSet) {
		super(label);
		this.priorizedElementsSet = priorizedElementsSet;
	}
	
	/* (non-Javadoc)
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		priorizedElementsSet.setChanged(true);
	}
	
}

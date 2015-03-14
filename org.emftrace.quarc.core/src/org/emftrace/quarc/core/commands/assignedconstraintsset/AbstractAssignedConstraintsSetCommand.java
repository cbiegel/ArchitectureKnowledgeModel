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

package org.emftrace.quarc.core.commands.assignedconstraintsset;

import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;

import org.emftrace.ui.command.AbstractCommand;

/**
 * Abstract command for AssignedConstraintsSets
 * 
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractAssignedConstraintsSetCommand extends AbstractCommand {

	protected AssignedConstraintsSet assignedConstraintsSet;
	
	/**
	 * the constructor
	 * 
	 * @param label the label for the command
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 */
	public AbstractAssignedConstraintsSetCommand(String label, AssignedConstraintsSet assignedConstraintsSet){
		super(label);
		this.assignedConstraintsSet = assignedConstraintsSet;
	}

}

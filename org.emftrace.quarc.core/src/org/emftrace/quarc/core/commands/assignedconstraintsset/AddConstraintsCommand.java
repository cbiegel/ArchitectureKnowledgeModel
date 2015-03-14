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

import java.util.List;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;

/**
 * Command for Adding constraints to an AssignedConstraintsSet
 * 
 * @author Daniel Motschmann
 *
 */
public class AddConstraintsCommand extends AbstractAssignedConstraintsSetCommand {

	private List<Constraint> constraints;

	/**
	 * the constructor
	 * 
	 * @param assignedConstraintsSet the AssignedConstraintsSet
	 * @param constraints a List with constraints
	 */
	public AddConstraintsCommand(
			AssignedConstraintsSet assignedConstraintsSet, List<Constraint> constraints) {
		super("adding constraints", assignedConstraintsSet);
		this.constraints = constraints;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		assignedConstraintsSet.setChanged(true);
		for (Constraint constraint :constraints) {
			assignedConstraintsSet.getAssignedConstraints().add(constraint);
		}
	}

}

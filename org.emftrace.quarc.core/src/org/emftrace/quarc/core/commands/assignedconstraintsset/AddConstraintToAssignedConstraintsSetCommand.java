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

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;

/**
 * Command for Adding a single constraint to an AssignedConstraintsSet
 * 
 * @author Daniel Motschmann
 *
 */
public class AddConstraintToAssignedConstraintsSetCommand extends
AbstractAssignedConstraintsSetCommand {
	
	private Constraint newConstraint;

	/**
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 * @param newConstraint a Constraint
	 */
	public AddConstraintToAssignedConstraintsSetCommand(
			AssignedConstraintsSet assignedConstraintsSet, Constraint newConstraint) {
		super("adding assigned constraint", assignedConstraintsSet);

		this.newConstraint = newConstraint;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		assignedConstraintsSet.setChanged(true);
		assignedConstraintsSet.getAssignedConstraints().add(newConstraint);
	}

}

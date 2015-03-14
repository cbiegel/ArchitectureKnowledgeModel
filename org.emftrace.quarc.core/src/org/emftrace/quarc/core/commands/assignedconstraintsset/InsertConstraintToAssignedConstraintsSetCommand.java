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
 * Command for inserting to a specified index a Constraint into an AssignedConstraintSet
 * 
 * @author Daniel Motschmann
 *
 */
public class InsertConstraintToAssignedConstraintsSetCommand extends
		AbstractAssignedConstraintsSetCommand {
	
	private Constraint newConstraint;
	private int index;

	/**
	 * the constructor
	 * 
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 * @param newConstraint the Constraint to insert
	 * @param index the index
	 */
	public InsertConstraintToAssignedConstraintsSetCommand(
			AssignedConstraintsSet assignedConstraintsSet, Constraint newConstraint, int index ) {
		super("insert assigned constraint", assignedConstraintsSet);
		this.newConstraint = newConstraint;
		this.index = index;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		assignedConstraintsSet.setChanged(true);
		assignedConstraintsSet.getAssignedConstraints().add(index, newConstraint);
	}

}
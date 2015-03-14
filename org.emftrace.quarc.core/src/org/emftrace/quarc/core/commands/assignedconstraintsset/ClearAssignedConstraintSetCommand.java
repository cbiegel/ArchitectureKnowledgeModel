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
 * Command for clearing an AssignedConstraintSet
 * 
 * @author Daniel Motschmann
 *
 */
public class ClearAssignedConstraintSetCommand extends AbstractAssignedConstraintsSetCommand {

	/**
	 * the constructor
	 * 
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 */
	public ClearAssignedConstraintSetCommand(AssignedConstraintsSet assignedConstraintsSet) {
		super("clearing assigned constraint set", assignedConstraintsSet);
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		assignedConstraintsSet.setChanged(true);
		for (int i = assignedConstraintsSet.getAssignedConstraints().size()-1; i >=0; i--) {
			Constraint constraint = assignedConstraintsSet.getAssignedConstraints().get(i);
			assignedConstraintsSet.getAssignedConstraints().remove(constraint);
		}
		
	}
	

}

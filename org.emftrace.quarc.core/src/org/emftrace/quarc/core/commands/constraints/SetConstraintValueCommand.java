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

package org.emftrace.quarc.core.commands.constraints;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;


/**
 * Command to set the value of a constraint
 * 
 * @author Daniel Motschmann
 *
 */
public class SetConstraintValueCommand extends
		AbstractConstraintCommand {
	private String value;

	/**the constructor
	 * 
	 * @param constraint a Constraint
	 * @param value the new value for the constraint
	 */
	public SetConstraintValueCommand( Constraint constraint, String value) {
		super("setting value", constraint);
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		if (constraint.eContainer() != null && constraint.eContainer() instanceof AssignedConstraintsSet)
			((AssignedConstraintsSet)constraint.eContainer()).setChanged(true);
		
		constraint.setValue(value);
	}

}

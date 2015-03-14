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

import org.emftrace.ui.command.AbstractCommand;

/**
 * Abstract command for Constraints
 * 
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractConstraintCommand extends AbstractCommand {

	protected Constraint constraint;
	
	
	/**
	 * the constructor
	 * 
	 * @param label the label for the command
	 * @param constraint a Constraint
	 */
	public AbstractConstraintCommand(String label, Constraint constraint){
		super(label);
		this.constraint = constraint;
	}

}

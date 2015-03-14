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

package org.emftrace.quarc.core.commands.gssquery;

import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;

import org.emftrace.ui.command.AbstractCommand;


/**
 * 
 * Abstract Command for GSSQuery
 * 
 * @author Daniel Motschmann
 * 
 */
public abstract class AbstractGSSQueryCommand extends AbstractCommand {

	protected GSSQuery query;

	/**
	 * the constructor
	 * 
	 * @param label the job label
	 * @param query a GSSQuery
	 */
	public AbstractGSSQueryCommand(String label, GSSQuery query) {
		super(label);
		this.query = query;
	}

}

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
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;


/**
 * 
 * Command to add a GSSQuery to a GSSQueryContainment
 * 
 * @author Daniel Motschmann
 * 
 */
public class AddGSSQuery extends AbstractGSSQueryCommand {

	private GSSQueryContainment gssQueryContainment;

	/**
	 * the constructor
	 * 
	 * 
	 * @param gssQueryContainment a GSSQueryContainment
	 * @param query GSSQuery
	 */
	public AddGSSQuery(GSSQueryContainment gssQueryContainment, GSSQuery query) {
		super("create new query", query);
		this.gssQueryContainment = gssQueryContainment;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {		
		gssQueryContainment.getGssQueries().add(query);
	}

}

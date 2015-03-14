
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


package org.emftrace.quarc.ui.handlers.navigator;

import org.eclipse.core.commands.AbstractHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.emftrace.ui.modelimport.EMFTraceImportHelper;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.quarc.core.gssquery.GSSQueryProcessor;

/**
 * Handler for UnicaseNavigator to execute a query
 * 
 * @author Daniel Motschmann
 *
 */

public class ExecuteQueryHandler extends AbstractHandler {

	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// final GSSQuery query = (GSSQuery) UiUtil.getSelectedEObject();	
		final GSSQuery query = (GSSQuery) EMFTraceImportHelper.getModelElement(event);	
		
		Toolbox container = (Toolbox) query.eContainer().eContainer();
		AccessLayer accessLayer = new AccessLayer(false);

		AssignedConstraintsSet assignedConstraintsSet = query.getAssignedConstraintsSet();
		
		new GSSQueryProcessor(query, accessLayer, container.getGssCatalogue(), assignedConstraintsSet, false).runAsJob();
		return null;
	}

}

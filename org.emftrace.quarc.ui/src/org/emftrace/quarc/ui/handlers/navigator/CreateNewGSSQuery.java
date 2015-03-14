
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
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.quarc.ui.wizards.NewGSSQueryWizard;


/**
 * Handler for UnicaseNavigator to create a new query
 * 
 * @author Daniel Motschmann
 *
 */

public class CreateNewGSSQuery extends AbstractHandler {

	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final GSSQueryContainment gssQueryContainment = (GSSQueryContainment) EMFTraceImportHelper.getModelElement(event);	
		NewGSSQueryWizard wizard = new NewGSSQueryWizard(gssQueryContainment);
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.create();
		dialog.open();		
		return null;
	}
}

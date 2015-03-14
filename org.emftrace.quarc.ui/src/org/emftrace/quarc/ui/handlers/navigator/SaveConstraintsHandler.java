
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
// TODO CLEANUP UiUtil
//import org.eclipse.emf.ecp.common.util.UiUtil;
import org.emftrace.ui.modelimport.EMFTraceImportHelper;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.quarc.ui.wizards.SaveConstraintsWizard;


/**
 * Handler for UnicaseNavigator to save constraints
 * 
 * @author Daniel Motschmann
 *
 */
public class SaveConstraintsHandler extends AbstractHandler {

	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// final GSSQuery query = (GSSQuery) UiUtil.getSelectedEObject();	
		final GSSQuery query = (GSSQuery) EMFTraceImportHelper.getModelElement(event);
		SaveConstraintsWizard wizard = new SaveConstraintsWizard(query);
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.create();
		dialog.open();
		return null;
	}
}
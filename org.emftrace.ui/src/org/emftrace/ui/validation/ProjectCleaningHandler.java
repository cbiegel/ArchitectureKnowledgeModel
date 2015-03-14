/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.validation;

import java.util.concurrent.Callable;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.activator.Activator;


/**
 * Handles the cleaning & update of the project through the ProjectCleaner.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ProjectCleaningHandler extends AbstractHandler
{

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        ISelection sel = HandlerUtil.getCurrentSelection(event);
        final ECPProject project = (ECPProject) ((StructuredSelection) sel).getFirstElement();
        final Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
        
        final ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell); 
 
        progressDialog.open();
        progressDialog.getProgressMonitor().beginTask("Cleaning up project...", 10);
        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{        
		        Activator.getAccessLayer().invalidateCache(project);		        
		        Activator.getProjectCleaner().cleanUpRuleOrphans(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().cleanUpLinkTypeOrphans(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().cleanUpViolationTypeOrphans(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().cleanUpChangeTypeOrphans(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateLinkTypeCatalogs(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateViolationTypeCatalogs(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateRuleCatalogs(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateChangeTypeCatalogs(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateLinkContainer(project);
		        progressDialog.getProgressMonitor().worked(1);
		        Activator.getProjectCleaner().updateReportContainer(project);
		        progressDialog.getProgressMonitor().worked(1);
        
				return null;
			}
		};
		
		RunESCommand.run(call);

        progressDialog.getProgressMonitor().done();
        progressDialog.close();
        
        return null;
    }
}
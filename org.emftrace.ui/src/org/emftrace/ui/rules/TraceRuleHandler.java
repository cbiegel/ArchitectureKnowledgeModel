/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.rules;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.DependencyDetectionWizard;

/**
 * Handles the execution of TraceRules through the RuleEngine.
 *
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TraceRuleHandler extends AbstractHandler 
{
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException 
    {
        ISelection sel = HandlerUtil.getCurrentSelection(event);
        final ECPProject project = (ECPProject) ((StructuredSelection) sel).getFirstElement();
                
        final Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
        
        final DependencyDetectionWizard wizard = new DependencyDetectionWizard(project);
        final WizardDialog dialog = new WizardDialog(shell, wizard);
        
        int ruleCnt = (Activator.getAccessLayer().getElements(project, "Rule")).size();
        
        if( ruleCnt == 0 )
        {
            MessageDialog.openError(shell, "Execution abborted", "The project does not contain any rule(s)");
            return null;
        }
        
        int modelCnt = (Activator.getAccessLayer().getElements(project, "EObject")).size() - ruleCnt;
        
        if( modelCnt == 0 )
        {
            MessageDialog.openError(shell, "Execution abborted", "The project does not contain any model(s)");
            return null;
        }
        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Activator.getProjectCleaner().cleanUpProject(project);
				return null;
			}
		};
		
		RunESCommand.run(call);
        
        dialog.open();
        
        if( wizard.finishedSuccessfully )
        {
            Activator.getAccessLayer().invalidateCache(project);
                        
            RuleApplicationOperation op = new RuleApplicationOperation(project, wizard.selectedModels, wizard.selectedCatalog, wizard.selectedRules);
            try
            {        
                ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
                progressDialog.run(true, false, op);
            }
            catch (InvocationTargetException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
		
        return null;
    }
}
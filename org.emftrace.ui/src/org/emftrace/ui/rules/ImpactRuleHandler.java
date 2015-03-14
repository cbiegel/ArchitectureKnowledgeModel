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
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.modelimport.EMFTraceImportHelper;
import org.emftrace.ui.wizards.TypeBasedImpactAnalysisWizard;

/**
 * Handles the execution of ImpactRules through the RuleEngine.
 *
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ImpactRuleHandler extends AbstractHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{        
        final EObject model =  EMFTraceImportHelper.getModelElement(event);
        
        Collection<ECPProject> projects = ECPUtil.getECPProjectManager().getProjects();
        
        ECPProject tmp = null;
        Iterator<ECPProject> it = projects.iterator();
        
        while( it.hasNext() )
        {
        	if( it.next().getContents().contains(model) )
        	{
        		tmp = it.next();
        		break;
        	}
        }
                    
        final ECPProject project = tmp;
        
        final Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();    
        
		Activator.getAccessLayer().invalidateCache(project);
				        
        TypeBasedImpactAnalysisWizard wizard = new TypeBasedImpactAnalysisWizard(project, model);
        WizardDialog dialog = new WizardDialog(shell, wizard);
        
        dialog.open();
        
        if( wizard.finishedSuccessfully )
        {       	
        	wizard.selectedModels.add(model);
        	
        	if( wizard.changeTarget != null ) wizard.selectedModels.add(wizard.changeTarget);
        	
            ImpactAnalysisOperation op = new ImpactAnalysisOperation(project, wizard.selectedModels, wizard.selectedCatalog, wizard.b1, wizard.b2, true);

            try 
            {
            	ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
				progressDialog.run(true, false, op);
				
				MessageDialog.openInformation(shell, "Impact Analysis completed", op.getSizeOfImpactSet()+" impact reports generated");
			}
            catch (InvocationTargetException e)
			{
				e.printStackTrace();
			} 
            catch (InterruptedException e)
			{
				e.printStackTrace();
			}
        }
        
		return null;
	}
}
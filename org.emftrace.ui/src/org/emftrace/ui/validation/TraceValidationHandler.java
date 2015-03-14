/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.validation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handles the execution of TraceRules through the RuleEngine.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TraceValidationHandler extends AbstractHandler 
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
        
        TraceValidationOperation op = new TraceValidationOperation(project);
        try
        {
            new ProgressMonitorDialog(shell).run(true, false, op);
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
        
        return null;
    }
}
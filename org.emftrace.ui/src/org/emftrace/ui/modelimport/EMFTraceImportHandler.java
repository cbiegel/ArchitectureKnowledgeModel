/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelimport;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.util.UIHelper;
import org.emftrace.ui.util.UIHelper.ModelExchangeState;


/**
 * Handles the import of models into a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public abstract class EMFTraceImportHandler extends AbstractHandler
{
	/**
	 * Stores the import path of the model
	 */
    private String IMPORT_MODEL_PATH = "";

    /**
     * These filter names are used to filter which files are displayed.
     */
    protected String[] FILTER_NAMES;

    /**
     * These filter extensions are used to filter which files are displayed.
     */
    protected String[] FILTER_EXTS;
    
    /**
     * A list of all supported file extensions
     */
    protected String[] FILE_EXTS;
    
    /**
     * A list of all supported templates
     */
    protected String[] TEMPLATE_NAMES;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Processes the import of a model element
     * 
     * @param event the current selection event
     * @throws InterruptedException 
     * @throws InvocationTargetException 
     */
    protected ModelExchangeState processImport(ExecutionEvent event) throws InvocationTargetException, InterruptedException
    {
        ISelection       sel      = HandlerUtil.getCurrentSelection(event);
        final ECPProject project  = (ECPProject) ((StructuredSelection) sel).getFirstElement();
        final Shell      shell    = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
        final String     fileName = getFileName(FILTER_NAMES, FILTER_EXTS);
        
        if( project  == null ) return EMFTraceImportHelper.processResult(shell, ModelExchangeState.Project_Missing, true);                
        if( fileName == null ) return EMFTraceImportHelper.processResult(shell, ModelExchangeState.File_Missing, true);
          
        try
        {        
	        for(int i = 0; i < FILE_EXTS.length; i++)
			{
				if( fileName.endsWith(FILE_EXTS[i]) )
				{
					EMFTraceImportHelper op = new EMFTraceImportHelper(shell, project, fileName, FILE_EXTS[i], UIHelper.TEMPLATE_PATH + TEMPLATE_NAMES[i] + UIHelper.TEMPLATE_EXTENSION);
					new ProgressMonitorDialog(shell).run(true, false, op);					
					break;
				}
			}
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }        

        return EMFTraceImportHelper.processResult(shell, ModelExchangeState.Import_OK, false);    
    }
    
    ///////////////////////////////////////////////////////////////////////////
                
    /**
     * Opens a standard file-dialog
     * 
     * @param filterNames     
     * @param filterExtensions
     * @return the file path for the model to be imported
     */
    protected String getFileName(String[] filterNames, String[] filterExtensions) 
    {
        FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.OPEN);
        dialog.setFilterNames(filterNames);
        dialog.setFilterExtensions(filterExtensions);
        
        String initialPath = IMPORT_MODEL_PATH;
        if( initialPath == "" ) initialPath = System.getProperty(UIHelper.USER_HOME);

        dialog.setFilterPath(initialPath);

        String fileName = dialog.open();

        if( fileName == null ) return null;
        
        final File file = new File(dialog.getFilterPath(), dialog.getFileName());
        
        IMPORT_MODEL_PATH = file.getAbsolutePath();

        return IMPORT_MODEL_PATH;
    }
}
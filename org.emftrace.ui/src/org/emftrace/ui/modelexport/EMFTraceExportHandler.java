/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelexport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.util.UIHelper;
import org.emftrace.ui.util.UIHelper.ModelExchangeState;

/**
 * Handles the export of models from a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public abstract class EMFTraceExportHandler extends AbstractHandler
{
    private String EXPORT_MODEL_PATH = "";
    
    /**
     * These filter names are used to filter which files are displayed.
     */
    protected String[] FILTER_NAMES;

    /**
     * These filter extensions are used to filter which files are displayed.
     */
    protected String[] FILTER_EXTS;

    /**
     * Declare the file extension
     */
    protected String FILE_EXTS;
    
    /**
     * Declare template name
     */
    protected String TEMPL_NAME;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Handles the actual export of an model
     * 
     * @param event the execution event that triggered the export
     */
    protected void export(ExecutionEvent event)
    {
        Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
        final  List<EObject> exportModelElements = getSelfContainedModelElementTree(event);
        String filePath = getFilePathByFileDialog(Activator.getAccessLayer().getNameOfModel(exportModelElements.get(0)), FILTER_NAMES, FILTER_EXTS, FILE_EXTS);

        ModelExchangeState state = ModelExchangeState.Misc_Error;
        try
        {
            state = EMFTraceExportHelper.exportModel(exportModelElements, filePath, FILE_EXTS, UIHelper.TEMPLATE_PATH + TEMPL_NAME + UIHelper.TEMPLATE_EXTENSION);            
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        processResult(shell, state);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Processes the result of the export process and prints out the proper notification.
     * 
     * @param shell the shell for the dialog window
     * @param state the export state
     */
    protected void processResult(Shell shell, ModelExchangeState state)
    {
        switch(state)
        {
            case Export_OK : 
            {
                MessageDialog.openInformation(shell, "Export finished", "The model has been exported properly");
                break;
            }          
            
            case Transformation_Error :
            {
                MessageDialog.openError(shell, "Export abborted", "An error occured during model transformation. See the Eclipse Log for more details.");
                break;
            }
            
            case Template_Missing :
            {
                MessageDialog.openError(shell, "Export abborted", "XSLT-Template missing");
                break;
            }
            
            case Extension_Missing :
            {
                MessageDialog.openError(shell, "Export abborted", "File-extension missing");
                break;               
            }
            
            case File_Missing :
            {
                MessageDialog.openError(shell, "Export abborted", "No file specified");
                break;                
            }
            
            case Model_Missing :
            {
                MessageDialog.openError(shell, "Export abborted", "No model specified");
                break;                
            }
            
            case Misc_Error :
            {
                MessageDialog.openError(shell, "Export abborted", "An error occured during the export procedure. See the Eclipse Log for more details.");
                break;                
            }
		default:
			break;
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns a list of models which are intended to be exported
     * 
     * @param event the current execution event that triggered the export
     * @return the list of models, where the export-event was triggered for
     */
    protected List<EObject> getSelfContainedModelElementTree(ExecutionEvent event) 
    {
        List<EObject> result = new ArrayList<EObject>();

        ISelection selection = HandlerUtil.getCurrentSelection(event);
        IStructuredSelection strucSel = null;
        EObject copyModelElement = null;

        if( selection != null && selection instanceof IStructuredSelection )
        {
            strucSel = (IStructuredSelection) selection;
            Object firstElement = strucSel.getFirstElement();
            
            if( firstElement instanceof EObject )
            {
                copyModelElement = ModelUtil.clone((EObject) firstElement);
                result.add(copyModelElement);
            }
        }

        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns a filepath for a given model
     * 
     * @param modelElementName the name of the model that should be exported
     * @param filterNames      names of possible diagram files
     * @param filterExtensions possible file-extensions
     * @param extension        the extension used by the file
     * @return                 the filepath for the given model
     */
    protected String getFilePathByFileDialog(String modelElementName, String[] filterNames, String[] filterExtensions, String extension)
    {
        FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
        dialog.setFilterNames(filterNames);
        dialog.setFilterExtensions(filterExtensions);
        
        String initialPath = EXPORT_MODEL_PATH;
        if( initialPath == "" ) initialPath = System.getProperty(UIHelper.USER_HOME);

        dialog.setFilterPath(initialPath);
        dialog.setOverwrite(true);

        try
        {
            String initialFileName = modelElementName + extension;
            dialog.setFileName(initialFileName);
        }
        catch (NullPointerException e) 
        {
        }

        EXPORT_MODEL_PATH = dialog.open();

        return EXPORT_MODEL_PATH;
    }
}
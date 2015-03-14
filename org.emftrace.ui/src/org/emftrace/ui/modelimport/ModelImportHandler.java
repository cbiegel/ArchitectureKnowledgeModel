/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelimport;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.emftrace.ui.util.UIHelper;


/**
 * Handles the import of models from CASE-tools into a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ModelImportHandler extends EMFTraceImportHandler 
{
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        FILTER_NAMES = new String[]{UIHelper.OWL_Filter_Names, 
        							UIHelper.URN_Filter_Names,
        							UIHelper.UML_Filter_Names,
        							UIHelper.BPMN_Filter_Names,
        							UIHelper.FeatureModel_Filter_Names};
        
        FILTER_EXTS  = new String[]{UIHelper.OWL_Filter_Extension,
        							UIHelper.URN_Filter_Extension,
        							UIHelper.UML_Filter_Extension,
        							UIHelper.BPMN_Filter_Extension,
        							UIHelper.FeatureModel_Filter_Extension};
        
        TEMPLATE_NAMES = new String[]{UIHelper.OWL_2_EMF_Template,
        							  UIHelper.URN_2_EMF_Template,
        							  UIHelper.UML_2_EMF_Template,
        							  UIHelper.BPMN_2_EMF_Template,
        							  UIHelper.FeatureModel_2_EMF_Template};
        
        FILE_EXTS = new String[]{UIHelper.OWL_File_Extension,
        						 UIHelper.URN_File_Extension,
        						 UIHelper.UML_File_Extension,
        						 UIHelper.BPMN_File_Extension,
        						 UIHelper.FeatureModel_File_Extension};
        
        try 
        {
			processImport(event);
		} 
        catch (InvocationTargetException e)
		{
			e.printStackTrace();
		} 
        catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

        return null;
    }
}
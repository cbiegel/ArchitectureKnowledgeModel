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
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.ui.util.UIHelper;

/**
 * Handles the import of {@link Rule Rules} and {@link RuleCatalogue Rule-Catalogs} into a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TraceRuleImportHandler extends EMFTraceImportHandler 
{    
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        FILTER_NAMES   = new String[]{UIHelper.Rule_Filter_Name,      UIHelper.RuleCatalogue_Filter_Name};
        FILTER_EXTS    = new String[]{UIHelper.Rule_Filter_Extension, UIHelper.RuleCatalogue_Filter_Extension};       
        FILE_EXTS      = new String[]{UIHelper.Rule_File_Extension,   UIHelper.RuleCatalogue_File_Extension};
        TEMPLATE_NAMES = new String[]{UIHelper.Rule_2_EMF_Template,   UIHelper.RuleCatalogue_2_EMF_Template};
        
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
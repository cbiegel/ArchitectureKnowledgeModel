/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelexport;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.emftrace.ui.util.UIHelper;


/**
 * Handles the export of URN-models from a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class URNExportHandler extends EMFTraceExportHandler 
{
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException 
    {
        FILTER_NAMES = new String[]{UIHelper.URN_Filter_Names};
        FILTER_EXTS  = new String[]{UIHelper.URN_Filter_Extension};
        FILE_EXTS    = UIHelper.URN_File_Extension;
        TEMPL_NAME   = UIHelper.EMF_2_URN_Template;
        
        export(event);
        return null;
    }
}
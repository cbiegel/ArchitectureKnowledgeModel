/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.editors.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;
import org.emftrace.ui.modelimport.EMFTraceImportHelper;

/**
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 *
 */
public class OpenTraceEditorHandler extends AbstractHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
        final EObject selectedModelElement = EMFTraceImportHelper.getModelElement(event);
        
        EMFTraceModelElementOpener.openStandardEditor(selectedModelElement);
        
		return null;
	}
}
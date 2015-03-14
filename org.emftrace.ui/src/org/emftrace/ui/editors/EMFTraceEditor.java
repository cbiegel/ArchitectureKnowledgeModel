/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.editors;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.ui.editors.formpage.EMFTraceFormPage;
import org.emftrace.ui.util.UIHelper;

/**
 * 
 * @author Steffen
 *
 */
public class EMFTraceEditor extends ModelElementEditor
{
	/**
	 * the FormPage
	 */
	private FormPage page;
	
	/**
	 * the page ID
	 */
	final private String pageID = UIHelper.TRACE_EDITOR; 
	
	/**
	 * the page name
	 */
	final private String pageName = "Standard View"; 
	
    ///////////////////////////////////////////////////////////////////////////
	
	@Override
	protected void addPages()
	{
		page = new EMFTraceFormPage(this, pageID, pageName, modelElement, getProject());
		try 
		{
			addPage(page);
		} 
		catch (PartInitException e) 
		{
			e.printStackTrace();
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	@Override
	public void setFocus()
	{
		super.setFocus();
		// focus to page and a control must be set
		// otherwise user must click on page before a new editor can be opened with the unicase navigator
		page.setFocus();
	}
}
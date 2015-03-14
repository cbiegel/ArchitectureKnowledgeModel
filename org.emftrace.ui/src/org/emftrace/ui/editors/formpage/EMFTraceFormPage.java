/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.editors.formpage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;
import org.emftrace.ui.editors.builders.TraceGUIBuilder;

/**
 * The FormPage for the EMFTraceEditor
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public class EMFTraceFormPage extends FormPage 
{
	/**
	 * The Composite of the ManagedForm
	 */
	private Composite managedFormComposite;
	
	/**
	 * The Builder for the GUI
	 */
	private AbstractGUIBuilder builder;
	
	/**
	 * The model for the Input
	 */
	private EObject modelElement;
	
	/**
	 * The current project
	 */
	private ECPProject project;
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param editor       the parent FormEditor
	 * @param id           the page id
	 * @param title        the page title
	 * @param modelElement a ModelElement
	 */
	public EMFTraceFormPage(FormEditor editor, String id, String title, EObject modelElement, ECPProject newProject) 
	{
		super(editor, id, title);
		this.modelElement = modelElement;
		this.builder      = null;
		this.project = newProject;
	}
	
    ///////////////////////////////////////////////////////////////////////////

	@Override
	protected void createFormContent(IManagedForm managedForm) 
	{
		super.createFormContent(managedForm);
		
		managedFormComposite = managedForm.getForm().getBody();
		managedFormComposite.setLayout(new FillLayout()); // set any Layout
		
		//build GUI
		builder = new TraceGUIBuilder(Activator.getAccessLayer(), modelElement, managedFormComposite, project);
			
		if (builder != null) builder.build();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	@Override
	public void setFocus() 
	{
		super.setFocus();
		managedFormComposite.setFocus();
		managedFormComposite.getChildren()[0].setFocus();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	@Override
	public void dispose() 
	{
		if( builder != null ) builder.dispose();		
		super.dispose();
	}
}

/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 

package org.emftrace.quarc.ui.editors.formpages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;


/**
 * the used FormPage to edit a modell element (without using a Graph)
 * 
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractModelElementFormPage extends FormPage {
	
	/**
	 * the ModelElement form the Input
	 */
	protected EObject modelElement;
	
	/**
	 * the AccessLayer
	 */
	protected AccessLayer accessLayer;
	
	/**
	 * the Composite of the ManagedForm
	 */
	protected Composite managedFormComposite;
	
	/**
	 * the builder for the controls
	 */
	protected AbstractGUIBuilder builder;
	
	/**
	 * the constructor
	 * 
	 * @param editor parent FormEditor 
	 * @param id the page id
	 * @param title the page title
	 * @param modelElement the ModelElement to edit
	 */
	public AbstractModelElementFormPage(FormEditor editor, String id, String title,
			EObject modelElement) {
		super(editor, id, title);
		this.modelElement = modelElement;
		this.accessLayer = new AccessLayer(false);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormPage#setFocus()
	 */
	@Override
	public void setFocus() {
		super.setFocus();
		managedFormComposite.setFocus();
		if (managedFormComposite.getChildren().length > 0) {
			managedFormComposite.getChildren()[0].setFocus();
		}			
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#dispose()
	 */
	@Override
	public void dispose() {
		//dispose listener etc. here
		
		if (builder != null)
			builder.dispose();
		super.dispose();
	}

	public AbstractGUIBuilder getBuilder(){
		return builder;
	}
	
}



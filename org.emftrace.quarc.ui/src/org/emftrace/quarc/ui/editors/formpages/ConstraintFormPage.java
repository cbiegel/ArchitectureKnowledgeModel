
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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.quarc.ui.builders.ConstraintsSetBuilder;


/**
 * The FormPage for the GSSQueryModelElementEditor
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ConstraintFormPage extends AbstractModelElementFormPage {
	

	/**
	 * the constructor
	 * 
	 * @param editor parent FormEditor 
	 * @param id the page id
	 * @param title the page title
	 * @param modelElement the ModelElement to edit
	 */
	public ConstraintFormPage(FormEditor editor, String id, String title,
			EObject modelElement) {
		super(editor, id, title, modelElement);
		this.modelElement = modelElement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui
	 * .forms.IManagedForm)
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		
		managedFormComposite = managedForm.getForm().getBody();
		managedFormComposite.setLayout(new FillLayout()); // set any Layout
		if (modelElement instanceof AssignedConstraintsSet){
		builder = new ConstraintsSetBuilder(accessLayer, managedFormComposite, (AssignedConstraintsSet) modelElement);
		builder.build();
		}
	}


}


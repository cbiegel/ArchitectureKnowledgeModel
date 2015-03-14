
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedPrinciplesSet;
import org.emftrace.quarc.ui.zestgpraphbuilders.GoalSelectorGraphBuilder;
import org.emftrace.quarc.ui.zestgpraphbuilders.PrincipleSelectorGraphBuilder;

/**
 * The FormPage for the GSSQueryModelElementEditor
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class SelectGoalsFormPage extends AbstractGSSFormPage {
	
	/**
	 * the constructor
	 * 
	 * @param editor parent FormEditor 
	 * @param id the page id
	 * @param title the page title
	 * @param modelElement the ModelElement to edit
	 */
	public SelectGoalsFormPage(FormEditor editor, String id, String title,
			EObject modelElement) {
		super(editor, id, title, modelElement);
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
		
	/*	if (modelElement instanceof QueryResultSet){
			builder =  new QueryResultGraphBuilder(managedFormComposite, SWT.NONE, getSite(), (QueryResultSet)modelElement, accessLayer);
		} else
	*/	
		if (modelElement instanceof SelectedGoalsSet){
			GSSQuery query =  (GSSQuery) modelElement.eContainer();
			GSSQueryContainment queryContainment  =  (GSSQueryContainment) query.eContainer();
			Toolbox toolbox  =  (Toolbox) queryContainment.eContainer();
			GSS gss  =  toolbox.getGssCatalogue();
			builder = new GoalSelectorGraphBuilder(managedFormComposite, SWT.NONE, getSite(), gss, (SelectedGoalsSet)modelElement, accessLayer);
		} else
		
		if (modelElement instanceof SelectedPrinciplesSet){
			GSSQuery query =  (GSSQuery) modelElement.eContainer();
			GSSQueryContainment queryContainment  =  (GSSQueryContainment) query.eContainer();
			Toolbox toolbox  =  (Toolbox) queryContainment.eContainer();
			GSS gss  =  toolbox.getGssCatalogue();
			builder = new PrincipleSelectorGraphBuilder(managedFormComposite, SWT.NONE, getSite(), gss,query, (SelectedPrinciplesSet)modelElement, accessLayer);

		}
		if (builder != null)
			builder.build();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#setActive(boolean)
	 */
	@Override
	public void setActive(boolean active){
		super.setActive(active);
	//	if (builder != null)		
	//		builder.build();
	//	managedFormComposite.layout();
	}

}


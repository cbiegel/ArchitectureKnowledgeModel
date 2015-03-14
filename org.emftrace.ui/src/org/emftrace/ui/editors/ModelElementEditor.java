/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.editor.e3.MEEditorInput;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;

/**
 * abstract class for a SharedHeaderFormEditor with MEEditorInput which is similar to the MEEditor
 * 
 * @author Daniel Motschmann
 * @version 1.0
 *
 */
public abstract class ModelElementEditor extends SharedHeaderFormEditor
{	
	/**
	 * the editor input
	 */
	protected MEEditorInput meInput;
	
	/**
	 * the ModelElement from input
	 */
	protected EObject modelElement;
	
	/**
	 * the EditingDomain
	 * (former TransactionalEditingDomain, which caused several exceptions with EMFStore 0.8.9)
	 */
	protected EditingDomain editingDomain;
	
	/**
	 * the ECPProject of modelElement
	 */
	protected ECPProject project;
		
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * getter for project
	 * @return the ECPProject of modelElement
	 */
	public ECPProject getProject() 
	{
		return project;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * getter for modelElement
	 * @return  the ModelElement from input
	 */
	public EObject getModelElement() 
	{
		return modelElement;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException 
	{
		super.init(site, input);

		if (input instanceof MEEditorInput) 
		{
			meInput = (MEEditorInput) input;
			modelElement = meInput.getModelElementContext().getDomainObject();
			project = ECPUtil.getECPProjectManager().getProject(modelElement);
			initializeEditingDomain();
		}
		else 
		{
			throw new PartInitException("ModelElementEditor is only appliable for MEEditorInputs");
		}

	}
		
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Initializes the editing domain for this model element.
	 */
	protected void initializeEditingDomain()
	{
		if( project != null ) this.editingDomain = project.getEditingDomain();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor)
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void doSaveAs() 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public boolean isSaveAsAllowed() 
	{
		// TODO Auto-generated method stub
		return false;
	}	
}
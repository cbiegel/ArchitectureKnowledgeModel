
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

package org.emftrace.quarc.ui.editors;


import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsPriorities;
import org.emftrace.quarc.ui.editors.formpages.ConstraintFormPage;
import org.emftrace.quarc.ui.editors.formpages.GSSModelElementFormPage;
import org.emftrace.quarc.ui.editors.formpages.GSSQueryResultModelElementFormPage;
import org.emftrace.quarc.ui.editors.formpages.SelectGoalsFormPage;
import org.emftrace.quarc.ui.editors.formpages.SelectPrioritiesFormPage;
import org.emftrace.ui.editors.ModelElementEditor;
import org.emftrace.ui.util.UIHelper;

/**
 * An EditorPart for the editable constraint list
 * 
 * @author Daniel Motschmann
 * 
 */
public class QUARCModelElementEditor extends ModelElementEditor {

	/**
	 * the FormPage
	 */
	private FormPage page;

	/**
	 * the editor ID
	 */
	final public static String pageID = UIHelper.QUARC_EDITOR;

	/**
	 * the page name
	 */
	final private String defaultPageName = "Standard View";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	@Override
	protected void addPages() {

		if (modelElement instanceof AssignedConstraintsSet)
			page = new ConstraintFormPage(this, pageID, defaultPageName,
					modelElement);

		else if (modelElement instanceof QueryResultSet)
			page =  new GSSQueryResultModelElementFormPage(this, pageID,
					defaultPageName, modelElement);

		else if (modelElement instanceof GSS)
			page =  new GSSModelElementFormPage(this, pageID,
					defaultPageName, modelElement);
		else if (modelElement instanceof SelectedGoalsPriorities)
			page =  new SelectPrioritiesFormPage(this, pageID,
					defaultPageName, modelElement);
		else if (modelElement instanceof PrioritizedElementSet)
			page =  new SelectGoalsFormPage(this, pageID, defaultPageName,
					modelElement);

		else if (modelElement instanceof PrioritizedElementSet) {
			page = new SelectGoalsFormPage(this, pageID, defaultPageName,
					modelElement);

		}

			try {
				addPage(page);
			} catch (PartInitException e) {
				e.printStackTrace();
			}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.SharedHeaderFormEditor#setFocus()
	 */
	@Override
	public void setFocus() {
		super.setFocus();
		// focus to page and a control must be set
		// otherwise user must click on page before a new editor can be opened
		// with the unicase navigator
		page.setFocus();
	}

}
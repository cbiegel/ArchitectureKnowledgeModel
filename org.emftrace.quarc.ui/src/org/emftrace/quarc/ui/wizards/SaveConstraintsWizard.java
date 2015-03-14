
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

package org.emftrace.quarc.ui.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.quarc.core.commands.predefinedconstraintsetcatalogues.CreatePredefinedConstraintSetCommand;
import org.emftrace.quarc.ui.wizards.pages.SaveConstraintsToPredefinedConstraintSetWizardPage;

/**
 * A Wizard to save Constraints of a GSSQuery to a PredefinedConstraintsSet
 * 
 * @author Daniel Motschmann
 * 
 */
public class SaveConstraintsWizard extends Wizard {

	private GSSQueryContainment parentPackage;
	private SaveConstraintsToPredefinedConstraintSetWizardPage saveConstraintsToPredefinedConstraintSetWizardPage;
	private GSSQuery query;

	/**
	 * the constructor
	 * 
	 * @param query
	 *            a GSSQuery
	 */
	public SaveConstraintsWizard(GSSQuery query) {
		super();
		this.parentPackage = (GSSQueryContainment) query.eContainer();
		this.query = query;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		saveConstraintsToPredefinedConstraintSetWizardPage = new SaveConstraintsToPredefinedConstraintSetWizardPage(
				"pageName", "title", null, query.getAssignedConstraintsSet());
		addPage(saveConstraintsToPredefinedConstraintSetWizardPage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		Toolbox toolbox = ((Toolbox) parentPackage.eContainer());

		new CreatePredefinedConstraintSetCommand(
				toolbox.getPredefinedContraintsSetCatalogue(),
				saveConstraintsToPredefinedConstraintSetWizardPage
						.getSelectedConstraints(),
				saveConstraintsToPredefinedConstraintSetWizardPage
						.getPredefinedSetName(),
				saveConstraintsToPredefinedConstraintSetWizardPage
						.getTemplateDescription()).run();

		return true;
	}
}

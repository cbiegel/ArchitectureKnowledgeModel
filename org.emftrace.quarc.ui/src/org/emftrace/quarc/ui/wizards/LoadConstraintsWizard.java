
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.jface.wizard.Wizard;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.quarc.core.commands.assignedconstraintsset.AddConstraintsCommand;
import org.emftrace.quarc.ui.wizards.pages.NewGSSQueryWizardPageTwo;

/**
 * A Wizard to load Constraints from a PredefinedConstraintsSet into a GSSQuery
 * 
 * @author Daniel Motschmann
 *
 */

public class LoadConstraintsWizard extends Wizard {

	private GSSQueryContainment parentPackage;
	private NewGSSQueryWizardPageTwo LoadConstraintsWizardPage;
	private GSSQuery gssQuery;

	/**
	 * the constructor
	 * 
	 * @param query a GSSQuery
	 */
	public LoadConstraintsWizard(GSSQuery gssQuery) {
		super();
		this.parentPackage = (GSSQueryContainment) gssQuery.eContainer();
		this.gssQuery = gssQuery;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		LoadConstraintsWizardPage = new NewGSSQueryWizardPageTwo(
				"LoadConstraintsWizardPage", parentPackage);
		addPage(LoadConstraintsWizardPage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		List<Constraint> clonedConstraints = new ArrayList<Constraint>();
		for (Constraint contraint : LoadConstraintsWizardPage
				.getSelectedConstraints()) {
			ModelUtil.clone(contraint);
			clonedConstraints.add(ModelUtil.clone(contraint));
		}

		new AddConstraintsCommand(gssQuery.getAssignedConstraintsSet(),
				clonedConstraints).run();

		return true;
	}
}
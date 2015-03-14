
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


//TODO CLEANUP ModelUtil
//import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.jface.wizard.Wizard;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.commands.gssquery.AddGSSQuery;
import org.emftrace.quarc.ui.wizards.pages.NewGSSQueryWizardPageOne;
import org.emftrace.quarc.ui.wizards.pages.NewGSSQueryWizardPageTwo;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;


/**
 * A Wizard to create a new GSSQuery
 * 
 * @author Daniel Motschmann
 *
 */
public class NewGSSQueryWizard extends Wizard {

	private GSSQueryContainment parentPackage;
	private NewGSSQueryWizardPageOne newGSSQueryWizardPageOne;
	private NewGSSQueryWizardPageTwo newGSSQueryWizardPageTwo;

	/**
	 * the constructor
	 * 
	 * @param parentPackage a GSSQueryContainment
	 */
	public NewGSSQueryWizard(GSSQueryContainment parentPackage) {
		super();
		this.parentPackage = parentPackage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		newGSSQueryWizardPageOne = new NewGSSQueryWizardPageOne(
				"NewGSSQueryWizardPage", parentPackage);
		addPage(newGSSQueryWizardPageOne);

		newGSSQueryWizardPageTwo = new NewGSSQueryWizardPageTwo(
				"NewGSSQueryWizardPage", parentPackage);
		addPage(newGSSQueryWizardPageTwo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		GSSQuery query = QueryFactory.eINSTANCE.createGSSQuery();
		query.setAssignedConstraintsSet(QueryFactory.eINSTANCE
				.createAssignedConstraintsSet());
		query.setSelectedGoalsSet(QueryFactory.eINSTANCE
				.createSelectedGoalsSet());
		query.setSelectedPrinciplesSet(QueryFactory.eINSTANCE
				.createSelectedPrinciplesSet());
		query.setSelectedGoalsPriorities(QueryFactory.eINSTANCE
				.createSelectedGoalsPriorities());
		query.setUsername(newGSSQueryWizardPageOne.getUsername());
		query.setUuid(newGSSQueryWizardPageOne.getId());
		query.setName(newGSSQueryWizardPageOne.getQueryName());
		query.setDescription(newGSSQueryWizardPageOne.getQueryDescription());
		query.setIncludeAll(newGSSQueryWizardPageOne.includeAll());
		query.setIncludeRefactorings(newGSSQueryWizardPageOne.includeRefactorings());
		query.setIncludePattern(newGSSQueryWizardPageOne.includePattern());
		query.setIncludePrinciples(newGSSQueryWizardPageOne.includePrinciples());
		query.setIncludeFlaws(newGSSQueryWizardPageOne.includeFlaws());
		if (newGSSQueryWizardPageTwo.isLoadConstraints()) {
			for (Constraint constraint : newGSSQueryWizardPageTwo
					.getSelectedConstraints()) {
				query.getAssignedConstraintsSet().getAssignedConstraints()
						.add(ModelUtil.clone(constraint));
			}
		}
		new AddGSSQuery(parentPackage, query).run();
		//ModelOpenHelper.openModel(query);
		EMFTraceModelElementOpener.open(query);
		return true;
	}

}
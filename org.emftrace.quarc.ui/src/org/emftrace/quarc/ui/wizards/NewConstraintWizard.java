
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
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.quarc.core.commands.assignedconstraintsset.AddConstraintToAssignedConstraintsSetCommand;
import org.emftrace.quarc.ui.wizards.pages.SelectPropertyWizardPage;



/**
 * Wizard for to create a new constraint
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class NewConstraintWizard extends Wizard {

	public AssignedConstraintsSet assignedConstraintedSet;
	public SelectPropertyWizardPage selectPropertyWizardPage;
private TechnicalPropertiesCatalogue propertiesCatalogue;


/**
 * the constructor 
 * @param assignedConstraintedSet a AssignedConstraintsSet
 * @param propertiesCatalogue a TechnicalPropertiesCatalogue
 */
public NewConstraintWizard(AssignedConstraintsSet assignedConstraintedSet, TechnicalPropertiesCatalogue propertiesCatalogue) {
	super();
	this.assignedConstraintedSet = assignedConstraintedSet;
	this.propertiesCatalogue = propertiesCatalogue;
}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		
		
		selectPropertyWizardPage = new SelectPropertyWizardPage(
				"New Constraint Wizard Page 2(a)",propertiesCatalogue, assignedConstraintedSet);

		

		addPage(selectPropertyWizardPage);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();
		constraint.setTechnicalProperty(selectPropertyWizardPage.getSelectedProperty());
		constraint.setOperator(BaseConditionOperators.EQUALS);
		constraint.setValue(selectPropertyWizardPage.getValue());

		new AddConstraintToAssignedConstraintsSetCommand(assignedConstraintedSet, constraint).runAsJob();
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		return selectPropertyWizardPage != null && selectPropertyWizardPage.getSelectedProperty()!= null && selectPropertyWizardPage.getErrorMessage() == null;
	}

}

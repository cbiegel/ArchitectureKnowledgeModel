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

package org.emftrace.quarc.core.commands.predefinedconstraintsetcatalogues;

import java.util.List;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSet;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue;



/**
 * 
 * a Command to create a PredefinedConstraintSet
 * @author Daniel Motschmann
 *
 */
public class CreatePredefinedConstraintSetCommand extends AbstractPredefinedContraintSetCatalogueCommand{

	private String description;
	private String name;
	private List<Constraint> constraints;

	/**
	 * the constructor
	 * @param cataloguge the containment
	 * @param constraints a list with predefined constraints
	 * @param name the name 
	 * @param description the description
	 */
	public CreatePredefinedConstraintSetCommand(PredefinedConstraintSetCatalogue cataloguge, List<Constraint> constraints, String name, String description) {
		super("saving constraints to template", cataloguge);
		this.name = name;
		this.description = description;
		this.constraints = constraints;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.ui.command.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		PredefinedConstraintSet predefinedConstraintSet = ConstraintsFactory.eINSTANCE.createPredefinedConstraintSet();
		predefinedConstraintSet.setName(name);
		predefinedConstraintSet.setDescription(description);
		for (Constraint constraint : constraints){
			predefinedConstraintSet.getConstraints().add(constraint);
		}
		predefinedConstraintSetCatalogue.getCatalogueItems().add(predefinedConstraintSet);
	}

}

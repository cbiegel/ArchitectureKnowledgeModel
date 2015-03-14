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

import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue;

import org.emftrace.ui.command.AbstractCommand;

/**
 * Abstract command for PredefinedContraintSetCatalogue
 * 
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractPredefinedContraintSetCatalogueCommand extends
		AbstractCommand {

	protected PredefinedConstraintSetCatalogue predefinedConstraintSetCatalogue;

	/**
	 * the constructor
	 * @param label the label used by the eclipse job
	 * @param predefinedConstraintSetCatalogue a PredefinedConstraintSetCatalogue
	 */
	public AbstractPredefinedContraintSetCatalogueCommand(String label,
			PredefinedConstraintSetCatalogue predefinedConstraintSetCatalogue) {
		super(label);
		this.predefinedConstraintSetCatalogue = predefinedConstraintSetCatalogue;
	}

}

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

package org.emftrace.quarc.core.commands.prioritizedelementsset;

import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;


/**
 * Command to update the weigth of a PrioritizedDecomposition
 * 
 * @author Daniel Motschmann
 *
 */
public class UpdatePrioritizedDecompositionWeightCommand extends AbstractPrioritizedElemenetsSetCommand{

	private PrioritizedDecomposition priorizedDecomposition;
	private String newWeight;
	
	
	/**the constructor
	 * 
	 * @param priorizedElementsSet a PrioritizedElementSet
	 * @param priorizedDecomposition a PrioritizedDecomposition
	 * @param newWeight the new weigth as String
	 */
	public UpdatePrioritizedDecompositionWeightCommand(
			PrioritizedElementSet priorizedElementsSet, PrioritizedDecomposition priorizedDecomposition, String newWeight) {
		super("updating priorized decomposition weight", priorizedElementsSet);
		this.priorizedDecomposition = priorizedDecomposition;
		this.newWeight = newWeight;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.quarc.core.commands.prioritizedelementsset.AbstractPrioritizedElemenetsSetCommand#doRun()
	 */
	@Override
	protected void doRun() {
		super.doRun();
		priorizedDecomposition.setWeight(newWeight);
		
	}

}

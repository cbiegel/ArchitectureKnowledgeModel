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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;


/**
 * Adds a PriorizedElement to a PriorizedElementSet and creates PriorizedDecomposition for the new priorized incoming and outgoing Decomposition<br>
 * 
 * validates the input before a PriorizedElement is added<br>
 * A PriorizedElement will only be added, if no other PriorizedElement of this Element exists already
 * A PriorizedDecomposition will only be created and added if no other PriorizedDecomposition of this Decomposition exists already 
 *
 * @author Daniel Motschmann
 * @version 1.0
 */
public class AddPrioritizedElementCommand extends AbstractPrioritizedElemenetsSetCommand{

	/**
	 * a PriorizedElementSet
	 */
	private PrioritizedElement priorizedElement;
	
	/**
	 * a List with all outgoing Decomposition Relations to other PriorizedElements
	 */
	private List<Decomposition> outgoingDecompositions;
	
	/**
	 * a List with all incoming Decomposition Relations to other PriorizedElements
	 */
	private List<Decomposition> incomingDecompositions;
	
	
	/**
	 * the constructor
	 * 
	 * @param priorizedElementsSet a PriorizedElementSet
	 * @param priorizedElement the priorizedElementsSet to add
	 * @param outgoingDecompositions a List with all outgoing Decomposition Relations to other PriorizedElements
	 * @param incomingDecompositions a List with all incoming Decomposition Relations to other PriorizedElements
	 * <br>
	 */
	public AddPrioritizedElementCommand(
			PrioritizedElementSet priorizedElementsSet, PrioritizedElement priorizedElement, List<Decomposition> outgoingDecompositions, List<Decomposition> incomingDecompositions) {
		super("adding priorized element \"" + priorizedElement.getElement().getName()+"\"", priorizedElementsSet);
		this.priorizedElement = priorizedElement;
		this.outgoingDecompositions = outgoingDecompositions;
		this.incomingDecompositions = incomingDecompositions;
	}

	/**
	 * Adds the specified Decomposition to the specified PriorizedElementSet
	 * @param decomposition a Decomposition
	 * @param priorizedElementsSet a PriorizedElementSet
	 */
	private void createPriorizedDecomposition(Decomposition decomposition, PrioritizedElementSet priorizedElementsSet){
		PrioritizedDecomposition newPriorizedDecomposition = QueryFactory.eINSTANCE.createPrioritizedDecomposition();
		newPriorizedDecomposition.setDecompostion(decomposition);
		priorizedElementsSet.getPriorizedDecompositionRelations().add(newPriorizedDecomposition);
	}
	
	/* (non-Javadoc)
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		super.doRun();
		Element element = priorizedElement.getElement();
		Set<Decomposition> existingPriorizedDecompositions = new HashSet<Decomposition>();
		
		for (PrioritizedDecomposition priorizedDecomposition : priorizedElementsSet.getPriorizedDecompositionRelations()){
			existingPriorizedDecompositions.add(priorizedDecomposition.getDecompostion());
		}
		for (Decomposition outgoingDecomposition : outgoingDecompositions){	
			if (!existingPriorizedDecompositions.contains(outgoingDecomposition))
			createPriorizedDecomposition(outgoingDecomposition, priorizedElementsSet);
		}	
		for (Decomposition incomingDecomposition : incomingDecompositions){
			if (!existingPriorizedDecompositions.contains(incomingDecompositions))
				createPriorizedDecomposition(incomingDecomposition, priorizedElementsSet);	
		}
		
		boolean alreadyExists = false;
		
		for (PrioritizedElement priorizedElement: priorizedElementsSet.getPrioritizedElements())
		{
			if (priorizedElement.getElement() == element){
			alreadyExists = true;
			break;
			}
		}
		if (!alreadyExists)
			priorizedElementsSet.getPrioritizedElements().add(priorizedElement);
	}

}

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

package org.emftrace.quarc.core.conditions;

import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

/**
 * an EObjectCondition to exclude a set of EObject
 * 
 * @author Daniel Motschmann
 *
 */
public class ExcludeEObjectCondition extends EObjectCondition{

	private HashSet<EObject> excludedObjectsSet;

	/**
	 * the constructor
	 * 
	 * @param excludedObjects a List with th elements to exclude
	 */
	public ExcludeEObjectCondition(List<EObject> excludedObjects){
		this.excludedObjectsSet = new HashSet<EObject>(); //HashSet is faster than List
		this.excludedObjectsSet.addAll(excludedObjects);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.query.conditions.eobjects.EObjectCondition#isSatisfied(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean isSatisfied(EObject eobject) {
		return !excludedObjectsSet.contains(eobject);
	}

}

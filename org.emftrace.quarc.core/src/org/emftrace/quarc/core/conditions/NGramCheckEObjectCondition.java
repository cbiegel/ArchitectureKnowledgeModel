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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;

/**
 * an EObjectAttributeValueCondition for a NGraphCheck
 * 
 * @author Daniel Motschmann
 *
 */
public class NGramCheckEObjectCondition extends EObjectAttributeValueCondition {

	private NGramCheckCondition nGramCheckCondition;
	private EAttribute attribute;
	private String attributeName;
	private EObject containment;

	public NGramCheckEObjectCondition(EAttribute attribute,
			NGramCheckCondition nGramCheckCondition, EObject containment) {
		super(attribute, nGramCheckCondition);
		this.nGramCheckCondition = nGramCheckCondition;
		this.hits = new HashMap<EObject, HashMap<String, HashMap<String, Integer>>>();
		this.attribute = attribute;
		this.attributeName = attribute.getName();
		this.containment = containment;

	}

	//eobject, eattribute name, hit, number of hits
	private HashMap<EObject, HashMap<String, HashMap<String, Integer>>> hits;

	@Override
	public boolean isSatisfied(EObject eObject) {
		boolean result = false;

		try {
			String attributeValue = "";
			if (eObject.eGet(attribute) == null ){
				attributeValue = "";
			} else if (attribute.isMany()){
				String strValue = eObject.eGet(attribute).toString();
				attributeValue = strValue.substring(1, strValue.length()-1); // removes 1st "[" and last "]"
			} else {
				attributeValue = eObject.eGet(attribute).toString();
			}

		
		result = nGramCheckCondition.isSatisfied(attributeValue);

		if (result == true) {
			putsHits(eObject, nGramCheckCondition.getLastHits());
		}
		
		if (eObject.eContainer() != null && (eObject.eContainer() != containment)){
			result = result | this.isSatisfied(eObject.eContainer());
	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}




	/**
	 * puts the hitted EObject into the cache
	 * 
	 * @param eObject the hitted EObject
	 * @param lastHits a Map for the the matched word
	 */
	private void putsHits(EObject eObject, Map<String, Integer> lastHits) {

		HashMap<String, HashMap<String, Integer>> newEntry = new HashMap<String, HashMap<String, Integer>>();
		newEntry.put(attributeName, (HashMap<String, Integer>) lastHits);
		hits.put(eObject, newEntry);

	}

	/**
	 * @return a map with the calculated hits 	//== eobject, eattribute name, hit, number of hits
	 */
	public HashMap<EObject, HashMap<String, HashMap<String, Integer>>> getHits() {

		return hits;
	}


}

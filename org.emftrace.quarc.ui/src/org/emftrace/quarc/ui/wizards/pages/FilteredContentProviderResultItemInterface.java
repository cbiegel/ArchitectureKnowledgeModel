
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


package org.emftrace.quarc.ui.wizards.pages;
//TODO CLEANUP PROJECT
//import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.ESObjectContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.ui.controls.FilteredContentProviderResultItem;
import org.emftrace.ui.controls.LabelProvider;



/**
 * An Interface to ResultItemView
 * @author Daniel Motschmann
 *
 */
public class FilteredContentProviderResultItemInterface {

	
	/**
	 * creates a FilteredContentProviderResultItem for the specified EObject and hits
	 * 
	 * @param eObject a TechnicalProperty
	 * @param hits the calculated hits
	 * @return the created FilteredContentProviderResultItem
	 */
	public static FilteredContentProviderResultItem createFilteredContentProviderResultItem(EObject eObject, HashMap<String, HashMap<String, Integer>> hits){
		
		
		TechnicalProperty modelElement = (TechnicalProperty) eObject;
		String id = modelElement.getIdentifier();
		

     
        String label = LabelProvider.getLabel(modelElement);
        Image image = LabelProvider.getImage(modelElement);
        HashMap<String, String> content = new HashMap<String, String>();
		for (EAttribute attribute : modelElement.eClass().getEAllAttributes()) {
			String attributeName = attribute.getName();
			String attributeStringValue = "";
			if (eObject.eGet(attribute) == null ){
				attributeStringValue = "";
			} else if (attribute.isMany()){
				String strValue = eObject.eGet(attribute).toString();
				attributeStringValue = strValue.substring(1, strValue.length()-1); // removes 1st "[" and last "]"
			} else {
				attributeStringValue = eObject.eGet(attribute).toString();
			}
			content.put(attributeName, attributeStringValue);
		}
		
        
        
		ESObjectContainer<EObject> project = null;
		HashMap<String, List<String>> hit = new HashMap<String, List<String>>();
		for (Entry<String, HashMap<String, Integer>> hitEntry : hits.entrySet()){
			List<String> matchedWordsList = new ArrayList<String>();
			for (Entry<String, Integer> hitSubEntry : hitEntry.getValue().entrySet())
				matchedWordsList.add(hitSubEntry.getKey()); //add matched word
		hit.put(hitEntry.getKey(), matchedWordsList);	
					
		}
	
		 
		return new FilteredContentProviderResultItem(id, modelElement, label, image, content, project,hit );
	}
}

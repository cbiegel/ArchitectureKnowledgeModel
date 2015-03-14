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

package org.emftrace.ui.controls;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
//TODO CLEANUP PROJECT
//import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.ESObjectContainer;

/**
 * A Item for a filered ContentProviderResultItem
 * @author Daniel Motschmann
 *
 */
public class FilteredContentProviderResultItem extends
ContentProviderResultItem {

	/**
	 * HaspMap for hits
	 */
	private HashMap<String, List<String>> hits;

	/**
	 * getter for hits
	 * @return the hits
	 */
	public HashMap<String, List<String>>getHits() {
		return hits;
	}
	
	/**
	 * a constructor
	 * 
	 * @param id the id of the ModelElement
	 * @param modelElement the ModelElement
	 * @param content the content
	 * @param label the label / text of the ModelElement
	 * @param image the icon of the ModelElement
	 * @param content a HashMap with attributes and attributes values
	 * @param project the of the ModelElement
	 * @param hits HashMap with a found word and a List with places
	 */
	public FilteredContentProviderResultItem(String id,
	        EObject modelElement, String label, Image image, HashMap<String, String> content,
			ESObjectContainer<EObject> project, HashMap<String, List<String>> hits) {
		super(id, modelElement, label, image, content, project);
		this.hits = hits;
	}

	
	/**
	 * a constructor
	 * @param item a ContentProviderResultItem
	 * @param hits HashMap with a found word and a List with places
	 */
	public FilteredContentProviderResultItem(ContentProviderResultItem item, HashMap<String, List<String>> hits) {
		super(item.getId(), item.getModelElement(), item.getLabel(), item.getImage(), item.getContent(), item.getProject());
		this.hits = hits;
	}

}

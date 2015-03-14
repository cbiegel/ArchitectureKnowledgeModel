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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
// TODO CLEANUP PROJECT
//import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.ESObjectContainer;

/**
 * Class for a ContentProvider result item
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */

public class ContentProviderResultItem implements
		Comparable<ContentProviderResultItem> {

	/**
	 *  the id
	 */
	private String id;
	
	/**
	 *  the modelElement
	 */
	private EObject modelElement;
	
	/**
	 *  the label
	 */
	private String label;
	
	/**
	 *  Map with attributes and attribute values as String
	 */
	private HashMap<String, String> content;
	
	
	/**
	 *  the project
	 */
	//private Project project;
	private ESObjectContainer<EObject> project;
	
	
	/**
	 *  the icon
	 */
	private Image image;

	
	//
	/**
	 * Compares this object with the given object according to the labels<br>
	 * 
	 * Required for sort.
	 * 
	 * @param compareObject the other object
	 * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
	 */
	public int compareTo(ContentProviderResultItem compareObject) {		
		int result;
		if ((this.getLabel() == null) && (compareObject.getLabel() == null))
			result = 0;
		else if (this.getLabel() == null) // && compareObject.getValue() != null
			result = -1;
		else if (compareObject.getLabel() == null) // && this.getValue() != null
				result = 1;
			else
		result = this.getLabel().compareTo(compareObject.getLabel());
		return result;
	}

	/**
	 * The constructor
	 * 
	 * @param id the id of the ModelElement
	 * @param modelElement the ModelElement
	 * @param content the content
	 * @param label the label / text of the ModelElement
	 * @param image the icon of the ModelElement
	 * @param content a HashMap with attributes and attributes values
	 * @param project the of the ModelElement
	 */
	public ContentProviderResultItem(String id, EObject modelElement,
			String label, Image image, HashMap<String, String> content, ESObjectContainer<EObject> project) {
		this.id = id;
		this.modelElement = modelElement;
		this.content = content;
		this.label = label;
		this.image = image;
		this.project = project;
	}

	
	/**
	 * Getter for project/ESObjectContainer
	 * @return the project/ESObjectContainer
	 */
	public ESObjectContainer<EObject> getProject() {
		return project;
	}
	
	/**
	 * Getter for Id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Getter for the ModelElement
	 * @return the ModelElement
	 */
	public EObject getModelElement() {
		return modelElement;
	}

	/**
	 * Getter for the content
	 * @return the content
	 */
	public HashMap<String, String> getContent() {
		return content;
	}
	
	/**
	 * Getter for the label
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Getter for the label
	 * @return the label
	 */
	public Image getImage() {
		return image;
	}


}

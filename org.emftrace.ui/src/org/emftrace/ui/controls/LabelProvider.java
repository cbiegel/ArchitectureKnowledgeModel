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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * Provider for labels
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class LabelProvider {

	/**
	 * Creates a label for the given ModelElement. Uses AccessLayer due caching.<br>
	 * 
	 * for FTEntry: result = numbering + " " + name<br>
	 * 
	 * for FactorTable: result = string value for the type<br>
	 * 
	 * for other ModelElements: result = name<br>
	 * 
	 * @param element
	 *            the ModelElement
	 * @return label for the given ModelElement
	 */
	public static String getLabel(EObject element) {
		return new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE)).getText(element);

	}
	
	/**
	 * gets the default image for the ModelElement
	 * @param modelElement the ModelElement
	 * @return the image for the ModelElement
	 */
	public static Image getImage(EObject modelElement){
		return new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE)).getImage(modelElement);

	}
}

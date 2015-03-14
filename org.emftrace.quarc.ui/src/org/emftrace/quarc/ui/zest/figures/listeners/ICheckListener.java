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

package org.emftrace.quarc.ui.zest.figures.listeners;

/**
 * An interface for a Lister for changes of the checked / unchecked state of a Checkbox Figure
 * 
 * @author Daniel Motschmann
 *
 */
public interface ICheckListener {

	/**
	 * the user is setting the state of the CheckboxFigure to checked
	 */
	public void checked();
	
	/**
	 * the user is setting the state to the CheckboxFigure to unchecked
	 */
	public void unchecked();
	
}

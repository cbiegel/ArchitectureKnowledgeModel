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
 * An interface for a Lister for changes of the expanded or collapsed state of a NameFigure
 * 
 * @author Daniel Motschmann
 *
 */
public interface IExpandListener {

	/**
	 * the node was expanded by the user
	 */
	public void expanded();
	
	/**
	 * the node was collapsed by the user
	 */
	public void collapsed();
	
}

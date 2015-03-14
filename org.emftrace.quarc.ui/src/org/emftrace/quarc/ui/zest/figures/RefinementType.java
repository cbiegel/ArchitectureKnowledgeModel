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

package org.emftrace.quarc.ui.zest.figures;

/**
 * Labels the different refinement types 
 * 
 * @author Daniel Motschmann
 *
 */
public class RefinementType {
	
	/**
	 * decomposition type "and"
	 */
	public final static String AND = "and"; // and
	
	/**
	 * decomposition type "inclusive or"
	 */
	public final static String IOR = "or";  // inclusive or
	
	/**
	 * decomposition type "exclusive or"
	 */
	public final static String XOR = "xor"; // exclusive or
	
	/**
	 * is a refinement
	 */
	public final static String IsA = "is a"; // is a

}

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
 * A Figure for a RefinementType
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class RefinementTypeFigure extends AbstractDecoratorFigure {

	 /**
	 * the constructor
	 * @param type the type of the Refinement
	 * @see RefinementType
	 */
	public RefinementTypeFigure(String type) {
		  super(type, false, defaultFont,1,1, false);
	  }
	
}


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

package org.emftrace.quarc.ui.parts;

import org.eclipse.swt.widgets.Composite;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;


/**
 * A Part for a Constraint with a FloatTechicalProperty
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class FloatPropertyConstraintPart  extends NumericalPropertyConstraintPart {

	/**
	 * the constructor 
	 *
	 * @param parent a parent composite 
	 * @param constraint the Constraint to display
	 */
	public FloatPropertyConstraintPart(Composite parent, Constraint constraint) {
		super(parent, constraint);
	}

}

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

package org.emftrace.ui.editors.builders.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * An abstract Part for a List
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class ListPart extends Part {
	
	protected Composite childrenComposite;
	protected Composite bodyComposite;
	
	/**
	 * the constructor
	 * @param parent the parent composite
	 */
	public ListPart(Composite parent) {
		super(parent);
	}
	
	/* (non-Javadoc)
	 * @see emffit_gui.builders.guis.parts.Part#createControls()
	 */
	@Override
	protected void createControls(){
		super.createControls();

		bodyComposite = new Composite(getBaseComposite(), SWT.NONE);
		bodyComposite.setLayout(new GridLayout(1, true));
		bodyComposite.setBackground(bodyComposite.getParent().getBackground());
		
		childrenComposite = new Composite(getBaseComposite(), SWT.NONE);
		childrenComposite.setLayout(new GridLayout(1, true));
        childrenComposite.setBackground(childrenComposite.getParent().getBackground());
	}
		

	
	/**
	 * getter for childrenComposite
	 * @return the composite for children parts
	 */
	public Composite getChildrenComposite(){
		return childrenComposite;
	}
	
	/**
	 * getter for bodyComposite
	 * @return the composite for own controls
	 */
	public Composite getBodyComposite(){
		return bodyComposite;
	}
	
}

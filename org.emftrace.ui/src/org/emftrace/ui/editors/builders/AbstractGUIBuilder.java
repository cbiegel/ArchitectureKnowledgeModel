/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.ui.editors.builders;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.emftrace.core.accesslayer.AccessLayer;

import org.emftrace.ui.editors.builders.AbstractBuilder;


/**
 * The abstract class for all GUI builders
 * 
 * @author  Daniel Motschmann
 * @version 1.0
 */
public abstract class AbstractGUIBuilder extends AbstractBuilder{

	/**
	 * the body Composite
	 */
	protected Composite bodyComposite;
	
	/**
	 * the parent Composite
	 */
	protected Composite parentComposite;

	/**
	 * the constructor
	 * @param accessLayer an AccessLayer
	 * @param parentComposite the container
	 */
	public AbstractGUIBuilder(AccessLayer accessLayer, Composite parentComposite) {
		super(accessLayer);
		this.parentComposite = parentComposite;
	}
	

	/* (non-Javadoc)
	 * @see sharedcomponents.builders.AbstractBuilder#doBuild()
	 */
	@Override
	protected void doBuild() {
		if (bodyComposite!= null)
			bodyComposite.dispose();
		bodyComposite = new Composite(parentComposite, SWT.NONE);
		bodyComposite.setBackground(bodyComposite.getParent().getBackground());
	}


	/* (non-Javadoc)
	 * @see sharedcomponents.builders.AbstractBuilder#dispose()
	 */
	@Override
	public void dispose(){
		bodyComposite.dispose();
	}
	
}

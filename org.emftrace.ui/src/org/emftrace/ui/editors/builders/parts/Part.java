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
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * abstract class for all Parts
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class Part{
	
	/**
	 * the lowest composite
	 */
	protected Composite baseComposite;
	
	/**
	 * the parent composite
	 */
	protected Composite parentComposite;
	
	/**
	 * the constructor for the part
	 * @param parent the parent composite
	 */
	public Part(Composite parent) {
		this.parentComposite = parent;
		createControls();
	}
	
	/**
	 * creates own controls
	 */
	protected void createControls(){
		parentComposite.setLayout(new RowLayout(SWT.VERTICAL));
		baseComposite = new Composite(parentComposite, SWT.NONE);
		baseComposite.setLayout(new RowLayout(SWT.VERTICAL));
		baseComposite.setBackground(parentComposite.getBackground());
	}

	/**
	 * getter for baseComposite 
	 * @return the lowest composite
	 */
	public Composite getBaseComposite(){
		return baseComposite;
	}
	
	/**
	 * getter for parent composite
	 * @return the parent composite
	 */
	public Composite getParentComposite(){
		return parentComposite;
	}
	
	/**
	 * disposes part and
	 * packs all parent composites
	 * to remove the gap
	 */
	public void dispose(){
		Composite parentComposite = baseComposite.getParent();
		baseComposite.dispose();
		Composite c = parentComposite;
		c.pack();
		c.layout();
		while (!(c.getParent() instanceof Shell)){
			c = c.getParent();
 			c.pack();
 			c.layout();
 		}
	}
	
	/**
	 * packs all parent composites to set the correct ScrollBar Position
	 */
	public void pack(){
		Composite c = baseComposite;
		c.pack();
		c.layout();
		while (!(c.getParent() instanceof Shell)){
 			c = c.getParent();
 			c.pack();
 			c.layout();
 		};
	}
	
}

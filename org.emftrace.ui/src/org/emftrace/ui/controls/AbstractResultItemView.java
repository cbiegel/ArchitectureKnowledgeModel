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

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;


/**
 * Abstract class for a text or graphic based visualization for a ModelElement and found words
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractResultItemView {

	/**
	 * the FilteredContentProviderResultItem to display
	 */
	protected FilteredContentProviderResultItem item;
	
	/**
	 * the parent composite
	 */
	protected Composite parent;
	
	/**
	 *  the SWT style
	 */
	protected int style;
	
	/**
	 * the constructor
	 * 
	 * @param parent the parent composite
	 * @param style the SWT style for the widget
	 */
	public AbstractResultItemView(Composite parent, int style) {
		this.setParent(parent);
		this.setStyle(style);
	}
	
	/**
	 * set a GridData LayoutData
	 * @param data the GridData
	 */
	public abstract void setLayoutData(GridData data);

	/**
	 * setter for parentComposite
	 * @param parent the parent composite
	 */
	private void setParent(Composite parent) {
		this.parent = parent;	
	}
	
	/**
	 * setter for the SWT style for the widget
	 * @param style the SWT style for the widget
	 */
	private void setStyle(int style) {
		this.style = style;	
	}

	/**
	 * setter for FilteredContentProviderResultItem
	 * @param item a FilteredContentProviderResultItem
	 */
	public void setItemToDisplay(FilteredContentProviderResultItem item){	
		this.item = item;
		displayHits(this.item);
	}

	/**
	 * displays specified matched words for the specified item
	 * @param item a FilteredContentProviderResultItem
	 */
	protected abstract void displayHits(FilteredContentProviderResultItem item);

	/**
	 * getter for the parent composite
	 * 
	 * @return the parent composite
	 */
	public Composite getParent() {
		return parent;
	}

	/**
	 * getter for the SWT style
	 * @return the SWT style
	 */
	public int getStyle() {
		return style;
	}
	
	
}

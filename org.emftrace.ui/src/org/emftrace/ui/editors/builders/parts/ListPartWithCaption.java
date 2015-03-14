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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;


/**
 * A Part for a List with a caption
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ListPartWithCaption extends ListPart {

	protected Composite headComposite;
	protected Label titleLabel;


	/**
	 * the constructor
	 * 
	 * @param parent the parent composite
	 * @param caption the caption
	 */
	public ListPartWithCaption(Composite parent,  String caption) {
		super(parent);
		setCaption(caption);
	}

	/* (non-Javadoc)
	 * @see emffit_gui.builders.guis.parts.ListPart#createControls()
	 */
	@Override
	protected void createControls() {
		super.createControls();

		headComposite = new Composite(getBodyComposite(), SWT.NONE);
		headComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		headComposite.setBackground(Display.getDefault().getSystemColor(
				SWT.COLOR_WIDGET_NORMAL_SHADOW)); // headComposite.getParent().getBackground());

		titleLabel = new Label(headComposite, SWT.NONE);
		titleLabel.setBackground(headComposite.getBackground());
		titleLabel.setLayoutData(new RowData(707, 25));
	}
	
	public void setCaptionTooltip(String text){
		titleLabel.setToolTipText(text);
	}

	public void setCaption(String caption) {
		titleLabel.setText(caption);
	}

	public String getCaption() {
		return titleLabel.getText();
	}

	public Composite getHeadComposite() {
		return headComposite;
	}
}

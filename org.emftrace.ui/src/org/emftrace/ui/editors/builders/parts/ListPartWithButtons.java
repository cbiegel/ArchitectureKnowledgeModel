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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * A Part for a List with Buttons
 * <br>
 * available buttons:<br>
 * addButton (optional)<br>
 * new Button <br>
 * delete Button<br>
 * <br>
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ListPartWithButtons extends ListPartWithCaption {
	
	private Button addButton;
	private Button newButton;
	private Button deleteAllButton;
	private boolean withAddButton;

	/**
	 * the constructor
	 * 
	 * @param parent the parent composite
	 * @param caption the caption
	 * @param withAddButton with or without Add button
	 */
	public ListPartWithButtons(Composite parent, String caption, boolean withAddButton) {
		super(parent, caption);
		this.withAddButton = withAddButton;	
		createCustomControls();
	}
	
	/**
	 * create controls for this part<br>
	 */
	private void createCustomControls(){

		if (withAddButton == true){
			titleLabel.setLayoutData(new RowData(603,25));
		
	    addButton = new Button(getHeadComposite(), SWT.FLAT);
	    addButton.setText("add");
	    addButton.setLayoutData(new RowData(35,25));
	    addButton.setBackground(headComposite.getBackground());
		} else {
			titleLabel.setLayoutData(new RowData(643,25));
		}
	    
	    newButton = new Button(getHeadComposite(), SWT.FLAT);
	    newButton.setText("new");
	    newButton.setLayoutData(new RowData(35,25));
	    newButton.setBackground(headComposite.getBackground());
	    
	    deleteAllButton = new Button(getHeadComposite(), SWT.FLAT);
	    deleteAllButton.setLayoutData(new RowData(25,25));
	    deleteAllButton.setBackground(headComposite.getBackground());
	}
	
	public void setDeleteAllButtonImage(Image image){
		deleteAllButton.setImage(image);
	}
	
	
	public void setDeleteAllButtonTooltip(String text){
		deleteAllButton.setToolTipText(text);
	}
	
	public void setNewButtonTooltip(String text){
		newButton.setToolTipText(text);
	}
	
	public void setAddButtonTooltip(String text){
		addButton.setToolTipText(text);
	}
	
	public void addDeleteButtonSelectionListener(SelectionListener listener){
		deleteAllButton.addSelectionListener(listener);
	}
	
	public void addAddButtonSelectionListener(SelectionListener listener){
		addButton.addSelectionListener(listener);
	}
	
	public void removeDeleteButtonSelectionListener(SelectionListener listener){
		deleteAllButton.removeSelectionListener(listener);
	}
	
	public void removeAddButtonSelectionListener(SelectionListener listener){
		addButton.removeSelectionListener(listener);
	}
	
	public void addNewButtonSelectionListener(SelectionListener listener){
		newButton.addSelectionListener(listener);
	}
	
	public void removeNewButtonSelectionListener(SelectionListener listener){
		newButton.removeSelectionListener(listener);
	}
	
}

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
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import org.emftrace.ui.controls.TextEdit;

/**
 * A Part for a header
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class TitlePart extends Part {

	/**
	 * the constructor
	 * 
	 * @param parent the parent composite
	 * @param withEditableText should text be editable
	 */
	public TitlePart(Composite parent, boolean withEditableText) {
		super(parent);
		this.withEditableText = withEditableText;
		createCustomControls();
	}

	private TextEdit nameText;
	private Button deleteButton;
	private Label captionLabel;
	private boolean withEditableText;

	/**
	 * create controls for this part<br>
	 */
	private void createCustomControls(){
		getBaseComposite().setLayout(new RowLayout());

		Device device = Display.getDefault();
		Color bgColor = new Color (device, 130, 130, 130);
		getBaseComposite().setBackground(bgColor);
		
		captionLabel = new Label(getBaseComposite(), SWT.NONE);
		captionLabel.setBackground(getBaseComposite().getBackground());

		captionLabel.setLayoutData(new RowData(75, 25));

		if (withEditableText) {
			nameText = new TextEdit(getBaseComposite(), SWT.BORDER | SWT.SINGLE);
			nameText.setEditable(true);
			nameText.setLayoutData(new RowData(600, 25));
		} else {
			nameText = new TextEdit(getBaseComposite(), SWT.NONE  | SWT.SINGLE);
			nameText.setEditable(false);
			nameText.setBackground(nameText.getParent().getBackground());

			nameText.setLayoutData(new RowData(610, 25));
		}

		

		deleteButton = new Button(getBaseComposite(), SWT.NONE);

		deleteButton.setLayoutData(new RowData(25, 25));
		deleteButton.setBackground(getBaseComposite().getBackground());

	}
	
	
	public void setDeleteButtonImage(Image image){
		deleteButton.setImage(image);
	}
	
	public void setDeleteButtonTooltip(String text){
		deleteButton.setToolTipText(text);
	}
	
	public void setCaptionTooltip(String text){
		nameText.setToolTipText(text);
	}

	public void setCaptionFont(Font font) {
		captionLabel.setFont(font);
	}

	public Font getCaptionFont() {
		return captionLabel.getFont();
	}

	public void setCaption(String caption) {
		if (caption != null)
			captionLabel.setText(caption);
		else
			captionLabel.setText("");
	}

	public String getCaption() {
		return captionLabel.getText();
	}

	public void setNameFont(Font font) {
		nameText.setFont(font);
	}

	public Font setNameFont() {
		return nameText.getFont();
	}

	public void setName(String caption) {
		if (caption != null)
			nameText.setText(caption);
		else
			nameText.setText("");
	}

	public String getName() {
		return nameText.getText();
	}

	public void addDeleteButtonSelectionListener(
			SelectionListener selectionListener) {
		deleteButton.addSelectionListener(selectionListener);
	}

	public void addNameTextFocusListener(FocusListener focusListener) {
		nameText.addFocusListener(focusListener);
	}

	public void removeNameTextFocusListener(FocusListener focusListener) {
		nameText.removeFocusListener(focusListener);
	}

	public void removeDeleteButtonSelectionListener(
			SelectionListener selectionListener) {
		deleteButton.removeSelectionListener(selectionListener);
	}

}

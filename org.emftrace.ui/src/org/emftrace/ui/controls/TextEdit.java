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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;



/**
 * StyledText with default popup menu
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class TextEdit extends StyledText {

	/** the constructor
	 * @param parent the parent composite
	 * @param style the SWT style
	 */
	public TextEdit(Composite parent, int style) {
		super(parent, style);
		addPopUpMenu();
	}

	
	/**
	 * creates and adds the popup menu 
	 * due to override in test class, visibility must be protected
	 */
	protected void addPopUpMenu() {

		Menu menu = new Menu(this);
		
		//TODO implement undo & re-undo
		/*
		 * MenuItem undoMenuItem = new MenuItem(menu, SWT.PUSH);
		 * undoMenuItem.setText("undo"); undoMenuItem
		 * .addSelectionListener(createUndoMenuItemSelectionListener(this));
		 * new MenuItem(menu, SWT.SEPARATOR);
		 */

		new MenuItem(menu, SWT.SEPARATOR);

		final MenuItem cutMenuItem = new MenuItem(menu, SWT.PUSH);
		cutMenuItem.setText("cut");
		cutMenuItem.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_CUT));

		cutMenuItem
				.addSelectionListener(createCutMenuItemSelectionListener(this));

		final MenuItem copyMenuItem = new MenuItem(menu, SWT.PUSH);
		copyMenuItem.setText("copy");
		copyMenuItem.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_COPY));

		copyMenuItem
				.addSelectionListener(createCopyMenuItemSelectionListener(this));

		MenuItem pasteMenuItem = new MenuItem(menu, SWT.PUSH);
		pasteMenuItem.setText("paste");
		pasteMenuItem.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_PASTE));

		pasteMenuItem
				.addSelectionListener(createPasteMenuItemSelectionListener(this));

		new MenuItem(menu, SWT.SEPARATOR);

		MenuItem markAllMenuItem = new MenuItem(menu, SWT.PUSH);
		markAllMenuItem.setText("select all");

		markAllMenuItem
				.addSelectionListener(createMarkAllMenuItemSelectionListener(this));

		this.setMenu(menu);

		final StyledText listText = this;
		menu.addMenuListener(new MenuListener() {

			@Override
			public void menuHidden(MenuEvent e) {}

			@Override
			public void menuShown(MenuEvent e) {

				boolean anySelected = listText.getSelectionCount() > 0;
				cutMenuItem.setEnabled(anySelected);
				copyMenuItem.setEnabled(anySelected);

			}
		});

	}


	/**
	 * creates a SelectionListener for the mark all menu item
	 * @param textEdit the TextEdit
	 * @return the created SelectionListener
	 */
	private SelectionListener createMarkAllMenuItemSelectionListener(
			final TextEdit textEdit) {
			return new SelectionListener(){

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {}

				@Override
				public void widgetSelected(SelectionEvent e) {
					textEdit.selectAll();	
				}};
		
	}


	/**
	 * creates a SelectionListener for the paste menu item
	 * @param textEdit the TextEdit
	 * @return the created SelectionListener
	 */
	private SelectionListener createPasteMenuItemSelectionListener(
			final TextEdit textEdit) {
		return new SelectionListener(){

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}

			@Override
			public void widgetSelected(SelectionEvent e) {
				textEdit.paste();	
			}};
	}


	/**
	 * creates a SelectionListener for the copy menu item
	 * @param textEdit the TextEdit
	 * @return the created SelectionListener
	 */
	private SelectionListener createCopyMenuItemSelectionListener(
			final TextEdit textEdit) {
		
		return new SelectionListener(){

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}

			@Override
			public void widgetSelected(SelectionEvent e) {
				textEdit.copy();
				
			}};
	}


	/**
	 * creates a SelectionListener for the cut menu item
	 * @param textEdit the TextEdit
	 * @return the created SelectionListener
	 */
	private SelectionListener createCutMenuItemSelectionListener(
			final TextEdit textEdit) {
	
		return new SelectionListener(){

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}

			@Override
			public void widgetSelected(SelectionEvent e) {
				textEdit.cut();	
			}
			
		};
	}
	
	
}

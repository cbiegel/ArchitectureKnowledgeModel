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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;





/**
 * A link control for ModelElements
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class EmbeddedLink {
	// can't be extend from Label due to Label doesn't allow subclassing
	
	/**
	 * the target ModelElement
	 */
	private EObject target;
	
	/**
	 * the text of the link
	 */
	private String text;
	
	
	/**
	 * the Label of the Link
	 */
	private Label link;
	
	
	/**
	 * is Link currently highlighted or not
	 */
	private boolean highlighted;
	
	/**
	 * the tooltip message for the the link
	 */
	private String targetDescription;
	
	/**
	 * link could be highlighted if mouse over event occurs
	 */
	private boolean canHighlight;

	/**
	 * the constructor
	 * @param parent the parent composite
	 * @param style the SWT style
	 * @param canHighlight link could be highlighted if mouse over event occurs
	 */
	public EmbeddedLink(Composite parent, int style, boolean canHighlightLink/*, ModelElementOpener modelElementOpener*/) {
		link = new Label(parent, style);

		highlighted = false;
		this.canHighlight = canHighlightLink;

		link.setBackground(parent.getBackground());
		link.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {}

			@Override
			public void mouseUp(MouseEvent e) {
				//open target
			    EObject target = getTarget();
				if ((target != null) && (e.button == 1)) { // only if target
																	// was set and 1st
																	// mouse button was
																	// used
					EMFTraceModelElementOpener.open(target);
					
				}
			}
		});

		link.addMouseTrackListener(new MouseTrackListener() {

			@Override
			public void mouseHover(MouseEvent e) {}

			@Override
			public void mouseExit(MouseEvent e) {
				highlighted = false;
				updateLinkDisplay();

			}

			@Override
			public void mouseEnter(MouseEvent e) {
				
				highlighted = canHighlight;
				updateLinkDisplay();

			}
		});
		this.setTarget(null); // displays link as unlinked link
	}

	public EmbeddedLink(Composite parent, int style/*, ModelElementOpener modelElementOpener*/) {
	this(parent, style,true);
	}
	
	/**
	 * disposes the link
	 */
	public void dispose() {
		link.dispose();
	}

	/** 
	 * getter for the bounds
	 * @return the bounds
	 */
	public Rectangle getBounds() {
		return link.getBounds();
	}

	/**
	 * getter for the Label widget
	 * @return the Label widget
	 */
	public Label getControl() {
		return this.link;
	}

	/**
	 * getter for size
	 * @return the size
	 */
	public Point getSize() {
		return link.getSize();
	}

	/**
	 * getter for the target
	 * @return the target ModelElement
	 */
	public EObject getTarget() {
		return this.target;

	}

	/**
	 * getter for text
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * packs the link
	 */
	public void pack() {
		link.pack();
	}

	/**
	 * setter for background
	 * @param color the new background color
	 */
	public void setBackground(Color color) {
		link.setBackground(color);
	}

	/**
	 * setter for font
	 * @param font the new font
	 */
	public void setFont(Font font) {
		link.setFont(font);
	}

	/**
	 * sets a location for the link
	 * @param x x-value
	 * @param y y-value
	 */
	public void setLocation(int x, int y) {
		link.setLocation(x, y);
	}

	/**
	 * sets a Menu
	 * @param menu the Menu
	 */
	public void setMenu(Menu menu) {
		link.setMenu(menu);
	}

	/**
	 * updates the visualization for the link<br>
	 * paints a red link if link has no target<br>
	 * paints a blue link if link has no target<br>
	 * sets CURSOR_HAND and background highlighting if highlighted
	 */
	private void updateLinkDisplay() {
		Display display = Display.getDefault();
		if (target == null) {
			
			// colors the link red
			// and disables CURSOR_HAND and highlighting

			link.setForeground(display.getSystemColor(SWT.COLOR_RED));
			link.setBackground(link.getParent().getBackground());

			//Cursor cursor = new Cursor(display, SWT.CURSOR_NO);
			//link.setCursor(cursor);

		} else {

			// colors the link blue
			// and enables CURSOR_HAND and highlighting

			Cursor cursor = new Cursor(display, SWT.CURSOR_HAND);
			link.setCursor(cursor);

			if (highlighted) {
				link.setForeground(Display.getDefault().getSystemColor(
						SWT.COLOR_BLUE));
				link.setBackground(display.getSystemColor(SWT.COLOR_YELLOW));
			} else {
				link.setBackground(link.getParent().getBackground());
				link.setForeground(Display.getDefault().getSystemColor(
						SWT.COLOR_BLUE));
			}
		}
	}

	/**
	 * sets a target for the link
	 * @param target the target ModelElement
	 */
	public void setTarget(EObject target) {

		this.target = target;
		if (target != null) {
			setTargetDescription(new ItemProvider().getText(target));
		} else {
			setTargetDescription("");
		}

		updateLinkDisplay();
	}

	/**
	 * sets the tooltip
	 * @param targetDescription the message
	 */
	public void setTargetDescription(String targetDescription) {
		this.targetDescription = targetDescription;
		link.setToolTipText(targetDescription);
	}

	/**
	 * getter for tooltip
	 * @return the tooltip
	 */
	public String getTargetDescription() {
		return this.targetDescription;
	}

	/** setter for text
	 * @param text the text
	 */
	public void setText(String text) {
		if (text == null){
			text = "";
		}
		this.text = text;
		link.setText(text);
	}

	/** setter for RowData LayoutData
	 * @param rowData the RowData
	 */
	public void setLayoutData(RowData rowData) {
		link.setLayoutData(rowData);

	}

	/** setter for GridData LayoutData
	 * @param gridData the GridData
	 */
	public void setLayoutData(GridData gridData) {
		link.setLayoutData(gridData);
	}
}
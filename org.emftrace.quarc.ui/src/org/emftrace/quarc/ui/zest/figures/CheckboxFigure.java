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

package org.emftrace.quarc.ui.zest.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.emftrace.quarc.ui.zest.figures.listeners.ICheckListener;

/**
 * A Figure for a checkbox
 * 
 * @author Daniel Motschmann
 * 
 */
public class CheckboxFigure extends Figure {

	/**
	 * the char of the symbol of the checked state
	 */
	private static String CHECK_MARK_CHAR = "þ";

	/**
	 * the char of the symbol of the unchecked state
	 */
	private static String CROSS_MARK_CHAR = "¨";

	/**
	 * is the checkbox checked or not
	 */
	private boolean isChecked;

	/**
	 * a List with all currently listening CheckListeners
	 */
	private List<ICheckListener> checkListeners;

	/**
	 * a Label for the Mark of the check state
	 */
	private Label checkMarkLabel;

	private static Font font = new Font(null, "Wingdings", 14, SWT.BOLD);

	/**
	 * the constructor
	 * 
	 * @param isCheckedByDefault
	 *            is checked by default or not
	 */
	public CheckboxFigure(boolean isCheckedByDefault) {
		super();

		this.isChecked = isCheckedByDefault;

		checkListeners = new ArrayList<ICheckListener>();

		ToolbarLayout layout = new ToolbarLayout();

		layout.setMinorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
		setLayoutManager(layout);
		setOpaque(false);

		checkMarkLabel = new Label();

		checkMarkLabel.setFont(font);

		checkMarkLabel.setLabelAlignment(PositionConstants.RIGHT);
		checkMarkLabel.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent me) {

			}

			@Override
			public void mouseReleased(MouseEvent me) {

				if (me.button == 1) {
					if (isChecked) {
						setIsUnchecked();
					} else {
						setIsChecked();
					}
				}
			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {
			}

		});
		if (isChecked)
			setIsChecked();
		else
			setIsUnchecked();
		add(checkMarkLabel);

		setSize(-1, -1);
	}

	/**
	 * adds the specified CheckListener
	 * 
	 * @param listener
	 *            a CheckListener
	 */
	public void addCheckListener(ICheckListener listener) {
		checkListeners.add(listener);
	}

	/**
	 * removes the specified CheckListener
	 * 
	 * @param listener
	 *            a CheckListener
	 */
	public void removeCheckListener(ICheckListener listener) {
		checkListeners.remove(listener);
	}

	/**
	 * fires a notification to all listeners about the checked state
	 * 
	 * @param checked
	 *            is the Checkbox checked or not
	 */
	private void notifyCheckListener(boolean checked) {
		try {

			if (checked)
				for (ICheckListener listener : checkListeners)
					listener.checked();

			else
				for (ICheckListener listener : checkListeners)
					listener.unchecked();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return is the Checkbox checked or not
	 */
	public boolean isChecked() {
		return this.isChecked;
	}

	/**
	 * sets the checkbox to checked
	 */
	public void setIsChecked() {
		this.isChecked = true;
		checkMarkLabel.setText(CHECK_MARK_CHAR);
		checkMarkLabel.setForegroundColor(new Color(null, 0, 165, 0));
		checkMarkLabel.repaint();
		notifyCheckListener(true);
	}

	/**
	 * sets the checkbox to unchecked
	 */
	public void setIsUnchecked() {
		this.isChecked = false;
		checkMarkLabel.setText(CROSS_MARK_CHAR);
		checkMarkLabel.setForegroundColor(new Color(null, 0, 0, 0));
		checkMarkLabel.repaint();
		notifyCheckListener(false);
	}

}


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

package org.emftrace.quarc.ui.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.quarc.core.commands.constraints.DeleteConstraintCommand;
import org.emftrace.quarc.core.helpers.ConstraintValueValidator;
import org.emftrace.ui.controls.EmbeddedLink;
import org.emftrace.ui.editors.builders.parts.Part;




/**
 * An abstract Part for a Constraint
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class ConstraintPart extends Part {

	protected TechnicalProperty property;

	protected Constraint constraint;

	private boolean hasValidValue;

	private final Color invalidBackgroundColor = new Color(null, 255, 182, 193);  //light pink

	protected Composite bodyComposite;

	/**
	 * the constructor 
	 *
	 * @param parent a parent composite 
	 * @param constraint the Constraint to display
	 */
	public ConstraintPart(Composite parent, Constraint constraint) {
		super(parent);
		this.property = constraint.getTechnicalProperty();
		this.constraint = constraint;
		createPartsForContraints();
		this.hasValidValue = true;
	}
	
	/**
	 * @return the value for the constraint is valid
	 */
	public boolean hasValidValue(){
		return hasValidValue;
	}

	/**
	 * create the required controls
	 */
	protected void createPartsForContraints() {
		baseComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		baseComposite.setLayoutData(new RowData(690, 70));
		addTitle();
		bodyComposite = new Composite(baseComposite, SWT.NONE);
		bodyComposite.setLayoutData(new RowData(690, 40));
		addBody();
	}


	/**
	 * creates the body (for value input)
	 */
	abstract protected void addBody();

	/**
	 * add the head with a link to the technical property
	 */
	protected void addTitle() {

		Composite composite = new Composite(baseComposite, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite.setBackground(Display.getDefault().getSystemColor(
				SWT.COLOR_WIDGET_LIGHT_SHADOW));
		composite.setLayoutData(new RowData(690, 30));
		final EmbeddedLink link = new EmbeddedLink(composite, SWT.NONE, false);
		// add link
		link.setTarget(property);
		if (property.getName() != null)
			link.setText(property.getName());
		else
			link.setText("");

		link.setLayoutData(new RowData(650, 25));

		property.addModelElementChangeListener(new ECPModelElementChangeListener(constraint) {
			
			@Override
			public void onChange(final Notification notification) {
				if (notification.getEventType() == Notification.SET)
					if (notification.getFeature().getClass().getName() == "name") {
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								link.setText(notification.getNewStringValue());
							}
						});
					} else if (notification.getFeature().getClass().getName() == "description") {
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								link.setTargetDescription(notification
									.getNewStringValue());
							}
						});
					}				
				}
		});
//		property.addModelElementChangeListener(new ModelElementChangeListener() {
//
//			@Override
//			public void onChange(final Notification notification) {
//				if (notification.getEventType() == Notification.SET)
//					if (notification.getFeature().getClass().getName() == "name") {
//						Display.getDefault().asyncExec(new Runnable() {
//
//							@Override
//							public void run() {
//								link.setText(notification.getNewStringValue());
//							}
//						});
//					} else if (notification.getFeature().getClass().getName() == "description") {
//						Display.getDefault().asyncExec(new Runnable() {
//
//							@Override
//							public void run() {
//								link.setTargetDescription(notification
//										.getNewStringValue());
//							}
//						});
//					}
//
//			}
//
//			@Override
//			public void onRuntimeExceptionInListener(RuntimeException exception) {
//
//			}
//
//		});
		// add delete button
		Button deleteButton = new Button(composite, SWT.None);
		deleteButton.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_DELETE));
		deleteButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		deleteButton.setToolTipText("delete this assigned contraint");
		deleteButton.setLayoutData(new RowData(25, 25));
		deleteButton.setBackground(deleteButton.getParent().getBackground());
		deleteButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				new DeleteConstraintCommand(constraint).runAsJob();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

	}

	/**
	 * @return the value entered by an user
	 */
	public abstract String getValue();

	/**
	 * validates the input of the specified control
	 * 
	 * @param control a SWT Control (Combo or Text)
	 * @param property a TechnicalProperty
	 */
	protected void addDefaultVertifyListener(final Control control,
			final TechnicalProperty property) {

		final ToolTip tip = new ToolTip(control.getShell(), SWT.BALLOON
				| SWT.ICON_ERROR);
		if (control instanceof Combo) {

			((Combo) control).addVerifyListener(new VerifyListener() {


				@Override
				public void verifyText(VerifyEvent e) {
					String text = ((Combo) control).getText(); // calculate new
																// text
					text = text.substring(0, e.start) + e.text
							+ text.substring(e.end, text.length());
					String errorMsg = ConstraintValueValidator.validateValue(
							text, property);
					if (errorMsg != null) {

						tip.setMessage(errorMsg);
						tip.setAutoHide(true);
						tip.setVisible(true);
						((Combo) control).setBackground( invalidBackgroundColor);
						((Combo) control).setForeground( Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
						hasValidValue = false;
					} else {
						tip.setVisible(false);
						((Combo) control).setBackground( Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
						((Combo) control).setForeground( Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
						hasValidValue = true;
					}
				}
			});
		} else if (control instanceof Text) {
			((Text) control).addVerifyListener(new VerifyListener() {

				@Override
				public void verifyText(VerifyEvent e) {
					String text = ((Text) control).getText(); // calculate new
																// text
					text = text.substring(0, e.start) + e.text
							+ text.substring(e.end, text.length());
					String errorMsg = ConstraintValueValidator.validateValue(
							text, property);
					if (errorMsg != null) {
						tip.setMessage(errorMsg);
						tip.setAutoHide(true);
						tip.setVisible(true);
						((Text) control).setBackground(invalidBackgroundColor); 
						((Text) control).setForeground( Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
						hasValidValue = false;
					} else {
						tip.setVisible(false);
						((Text) control).setBackground( Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
						((Text) control).setForeground( Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
						hasValidValue = true;
					}
				}
			});
		} else {
			new Exception("unknow control").printStackTrace();
		}

	}

}


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

package org.emftrace.quarc.ui.builders;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.quarc.core.commands.assignedconstraintsset.ClearAssignedConstraintSetCommand;
import org.emftrace.quarc.ui.parts.BooleanPropertyConstraintPart;
import org.emftrace.quarc.ui.parts.ConstraintPart;
import org.emftrace.quarc.ui.parts.EnumPropertyConstraintPart;
import org.emftrace.quarc.ui.parts.FloatPropertyConstraintPart;
import org.emftrace.quarc.ui.parts.IntegerPropertyConstraintPart;
import org.emftrace.quarc.ui.parts.RegExPropertyConstraintPart;
import org.emftrace.quarc.ui.parts.StringPropertyConstraintPart;
import org.emftrace.quarc.ui.wizards.NewConstraintWizard;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;
import org.emftrace.ui.editors.builders.parts.ListPartWithButtons;

/**
 * A Builder for an editable list of constraints
 * 
 * @author Daniel Motschmann
 *
 */
public class ConstraintsSetBuilder extends AbstractGUIBuilder {

	private AssignedConstraintsSet assignedConstraintsSet;

	/**
	 * the constructor
	 * 
	 * @param accessLayer an AccessLayer
	 * @param parentComposite the parent Composite
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 */
	public ConstraintsSetBuilder(AccessLayer accessLayer,
			Composite parentComposite,
			AssignedConstraintsSet assignedConstraintsSet) {
		super(accessLayer, parentComposite);
		this.assignedConstraintsSet = assignedConstraintsSet;
	}

	
	private HashMap<Constraint, ConstraintPart> constraintPartMap;
	
	/* (non-Javadoc)
	 * @see sharedcomponents.builders.guis.AbstractGUIBuilder#doBuild()
	 */
	@Override
	protected void doBuild() {
		super.doBuild();

		final ListPartWithButtons constraintsListPart = new ListPartWithButtons(
				bodyComposite, "constraints", false);
		final Composite composite = constraintsListPart.getChildrenComposite();
		constraintPartMap = new HashMap<Constraint, ConstraintPart>();

		for (Constraint constraint : assignedConstraintsSet
				.getAssignedConstraints()) {
			addPart(constraint, composite, constraintPartMap);
		}


		assignedConstraintsSet
			.addModelElementChangeListener(new ECPModelElementChangeListener(assignedConstraintsSet) {
				
				@Override
				public void onChange(final Notification notification) {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
	
							if (notification.getEventType() == Notification.REMOVE) {
	
								removePart((Constraint) notification
										.getOldValue());
								constraintsListPart.pack();
	
							} else if (notification.getEventType() == Notification.ADD) {
								addPart((Constraint) notification
										.getNewValue(), composite,
										constraintPartMap);
								constraintsListPart.pack();
							}
						}				
					});					
				}
			});

		constraintsListPart.setNewButtonTooltip("create a new constraint using a wizard");

		
		constraintsListPart	.addNewButtonSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {

						NewConstraintWizard wizard = new NewConstraintWizard(
								assignedConstraintsSet,
								((Toolbox) assignedConstraintsSet.eContainer()
										.eContainer().eContainer())
										.getPropertiesCatalogue());

						WizardDialog dialog = new WizardDialog(parentComposite
								.getShell(), wizard);
						dialog.create();
						dialog.open();
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});
		
		constraintsListPart.setDeleteAllButtonTooltip("delete all assigned constraints");
		constraintsListPart.setDeleteAllButtonImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_DELETE));

		
		constraintsListPart.addDeleteButtonSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				new ClearAssignedConstraintSetCommand(assignedConstraintsSet).runAsJob();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {			
			}
		});
	}
	
	/**
	 * removes the part for the specified Constraint
	 * 
	 * @param constraintToRemove a Constraint
	 */
	private void removePart(Constraint constraintToRemove) {
		
		if (constraintPartMap.get(constraintToRemove)!= null){
		constraintPartMap.get(constraintToRemove)
				.dispose(); // remove
							// part
		constraintPartMap
				.remove(constraintToRemove);
		}
		

		
	}
	
	/**
	 * add a part for the specifed constraints
	 * 
	 * @param constraint a Constraint
	 * @param composite the parent Composite
	 * @param constraintPartMap a reference to the Map with all Constraints/Parts
	 */
	private void addPart(Constraint constraint, Composite composite,
			HashMap<Constraint, ConstraintPart> constraintPartMap) {
		ConstraintPart constraintPart = null;
		if (constraint.getTechnicalProperty() instanceof StringTechnicalProperty) {
			constraintPart = new StringPropertyConstraintPart(composite,
					constraint);
		} else if (constraint.getTechnicalProperty() instanceof RegularExpressionTechnicalProperty) {
			constraintPart = new RegExPropertyConstraintPart(composite,
					constraint);
		} else if (constraint.getTechnicalProperty() instanceof FloatTechnicalProperty) {
			constraintPart = new FloatPropertyConstraintPart(composite,
					constraint);
		} else if (constraint.getTechnicalProperty() instanceof IntegerTechnicalProperty) {
			constraintPart = new IntegerPropertyConstraintPart(composite,
					constraint);
		} else if (constraint.getTechnicalProperty() instanceof BooleanTechnicalProperty) {
			constraintPart = new BooleanPropertyConstraintPart(composite,
					constraint);
		} else if (constraint.getTechnicalProperty() instanceof EnumTechnicalProperty) {
			constraintPart = new EnumPropertyConstraintPart(composite,
					constraint);
		}
		constraintPartMap.put(constraint, constraintPart);
	}
}

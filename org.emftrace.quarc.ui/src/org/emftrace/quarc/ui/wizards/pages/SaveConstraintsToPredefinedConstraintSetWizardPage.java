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


package org.emftrace.quarc.ui.wizards.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;

/**
 * WizardPage for SaveConstaintsWizard
 * 
 * @author Daniel Motschmann
 *
 */
public class SaveConstraintsToPredefinedConstraintSetWizardPage extends WizardPage{

	private Map<TableItem, Constraint> constraintMap;
	private Text nameText;
	private Text descriptionText;
	private Table constraintsTable;
	private AssignedConstraintsSet constraintsSet;

	public SaveConstraintsToPredefinedConstraintSetWizardPage(String pageName,
			String title, ImageDescriptor titleImage, AssignedConstraintsSet constraintsSet ) {
		super(pageName, title, titleImage);
	    setTitle("Save constraints to predefined constraint set wizard");
        setMessage("Please select a set of constraint you want to save in a predefined constraint set");
		this.constraintMap = new HashMap<TableItem, Constraint>();
		this.constraintsSet = constraintsSet;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		setControl(composite);
		composite.setLayout(new GridLayout(2,true));

		new Label(composite, SWT.None).setText("name:");
		nameText = new Text(composite,  SWT.BORDER ); 
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		nameText.setToolTipText("please enter here a name for the predefined constraint set");

		
		new Label(composite, SWT.None).setText("description:");
		descriptionText = new Text(composite,  SWT.BORDER | SWT.MULTI ); 
		descriptionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		descriptionText.setToolTipText("please enter here a description for the predefined constraint set");

		new Label(composite, SWT.None).setText("constraints:");
		constraintsTable = new Table(composite,  SWT.BORDER | SWT.CHECK); 
		constraintsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		constraintsTable.setToolTipText("please select here a set of constraints you want to save to the predefined constraint set");
		fillTable();
		
	}

	/**
	 * this the table
	 */
	private void fillTable() {

		constraintsTable.removeAll();
		constraintMap.clear();
	
		for (Constraint constraint : constraintsSet.getAssignedConstraints()){
			addConstraintToTable(constraint);
		}
	}

	/**
	 * adds the constaint to the table
	 * @param constraint a Constraint
	 */
	protected void addConstraintToTable(Constraint constraint) {
		TableItem item = new TableItem(constraintsTable, SWT.NONE);
		item.setText(constraint.getTechnicalProperty().getName() + " == "+ constraint.getValue());
		item.setChecked(true);
		constraintMap.put(item, constraint);
		
	}
	
	/**
	 * @return the selected constraints in the table
	 */
	public java.util.List<Constraint> getSelectedConstraints(){
		java.util.List<Constraint> result = new ArrayList<Constraint>();
		for (TableItem item : constraintsTable.getItems()){
			if (item.getChecked())
			result.add(constraintMap.get(item));
		}
		return result;
	}

	/**
	 * @return the entered description
	 */
	public String getTemplateDescription() {
		return descriptionText.getText();
	}
	
	/**
	 * @return the entered set name
	 */
	public String getPredefinedSetName() {
		return nameText.getText();
	}

}

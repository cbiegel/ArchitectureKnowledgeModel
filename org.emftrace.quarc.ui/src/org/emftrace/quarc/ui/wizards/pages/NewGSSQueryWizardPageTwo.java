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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSet;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;


/**
 * the 2nd WizardPage for NewGSSWizard to load selected constraints from another query or a template
 * 
 * @author Daniel Motschmann
 *
 */
public class NewGSSQueryWizardPageTwo extends WizardPage {

	private GSSQueryContainment parentPackage;
	private Table sourceTable;
	private Table constraintsTable;
	private Button fromQueryButton;
	private Button fromTemplateButton;
	private Button noneButton;
	private HashMap<TableItem, EObject> sourceMap;
	private HashMap<TableItem, Constraint> constraintMap;
	private Text descriptionText;

	/**
	 * the constructor
	 * @param pageName the page name
	 * @param parent the GSSQueryContainment used as parent for a new query 
	 */
	public NewGSSQueryWizardPageTwo(String pageName, GSSQueryContainment parent) {
		super(pageName);
	    setTitle("Load constraints wizard");
        setMessage("Please select a source and set of constraint you want to load");
		this.parentPackage = parent;
		this.sourceMap = new HashMap<TableItem, EObject>();
		this.constraintMap = new HashMap<TableItem, Constraint>();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		setControl(composite);

		Group radioGroup = new Group(composite, SWT.NONE);
		radioGroup.setLayout(new RowLayout(SWT.VERTICAL));
		radioGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				2, 1));

		radioGroup.setToolTipText("please choose an action");

		noneButton = new Button(radioGroup, SWT.RADIO);
		noneButton.setText("do not load constraints");
		noneButton.setSelection(true);
		noneButton
				.setToolTipText("do not load constraints from a template or another query");

		fromTemplateButton = new Button(radioGroup, SWT.RADIO);
		fromTemplateButton.setText("load constraints from a predefined constraint set");
		noneButton
				.setToolTipText("load selected constraints from a selected predefined constraint set");

		fromQueryButton = new Button(radioGroup, SWT.RADIO);
		fromQueryButton.setText("load constraints from another query");
		noneButton
				.setToolTipText("load selected constraints from a selected query");

		Label sourceLabel = new Label(composite, SWT.None);
		sourceLabel.setText("sources:");
		sourceTable = new Table(composite, SWT.BORDER);
		sourceTable
				.setToolTipText("please select here a containment with acts as a predefined set");
		sourceLabel.setToolTipText(sourceTable.getToolTipText());

		sourceTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		sourceTable.setEnabled(false);
		Label constraintsLabel = new Label(composite, SWT.None);
		constraintsLabel.setText("constraints:");
		constraintsTable = new Table(composite, SWT.BORDER | SWT.CHECK);
		constraintsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		constraintsTable
				.setToolTipText("please select here a set of constraints you want to load");
		constraintsLabel.setToolTipText(constraintsTable.getToolTipText());

		constraintsTable.setEnabled(false);
		Label descriptionLabel = new Label(composite, SWT.None);
		descriptionLabel.setText("description:");

		descriptionText = new Text(composite, SWT.BORDER | SWT.READ_ONLY
				| SWT.MULTI);
		descriptionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		descriptionText.setBackground(Display.getDefault().getSystemColor(
				SWT.COLOR_INFO_BACKGROUND));
		descriptionText
				.setToolTipText("the description of the selected element");
		descriptionText.setEnabled(false);
		descriptionLabel.setToolTipText(descriptionText.getToolTipText());
		SelectionListener buttonListener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				fillTable();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		};
		noneButton.addSelectionListener(buttonListener);
		fromTemplateButton.addSelectionListener(buttonListener);
		fromQueryButton.addSelectionListener(buttonListener);

		sourceTable.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				EObject source = sourceMap.get(sourceTable.getSelection()[0]);
				constraintsTable.removeAll();
				if (source instanceof GSSQuery) {
					for (Constraint constraint : ((GSSQuery) source)
							.getAssignedConstraintsSet()
							.getAssignedConstraints()) {
						addConstraintToTable(constraint);
					}
				}
				if (source instanceof PredefinedConstraintSet) {
					for (Constraint constraint : ((PredefinedConstraintSet) source)
							.getConstraints()) {
						addConstraintToTable(constraint);
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		constraintsTable.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (constraintsTable.getSelectionCount() != 0) {
					String description = constraintMap
							.get(constraintsTable.getSelection()[0])
							.getTechnicalProperty().getDescription();
					descriptionText.setText(description != null ? description
							: "");
				} else
					descriptionText.setText("");
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
	}

	/**
	 * fills the table with possible sources
	 */
	private void fillTable() {
		sourceTable.removeAll();
		constraintsTable.removeAll();
		sourceMap.clear();
		constraintMap.clear();
		descriptionText.setText("");
		Toolbox toolbox = (Toolbox) parentPackage.eContainer();
		if (fromTemplateButton.getSelection()) {
			for (PredefinedConstraintSet template : toolbox
					.getPredefinedContraintsSetCatalogue().getCatalogueItems()) {
				TableItem item = new TableItem(sourceTable, SWT.NONE);
				String name = template.getName();
				item.setText(name != null ? name : "");
				String description = template.getDescription();
				descriptionText.setText(description != null ? description : "");
				sourceMap.put(item, template);
			}
		} else if (fromQueryButton.getSelection()) {
			for (GSSQuery query : toolbox.getQueryContainment().getGssQueries()) {
				TableItem item = new TableItem(sourceTable, SWT.NONE);
				String name = query.getName();
				item.setText(name != null ? name : "");
				String description = query.getDescription();
				descriptionText.setText(description != null ? description : "");
				sourceMap.put(item, query);
				descriptionText.setEnabled(true);
			}
		}
		Boolean enable = !noneButton.getSelection();
		sourceTable.setEnabled(enable);
		constraintsTable.setEnabled(enable);
		descriptionText.setEnabled(enable);

	}

	/**
	 * adds the specified constraints to the table
	 * @param constraint
	 */
	protected void addConstraintToTable(Constraint constraint) {
		TableItem item = new TableItem(constraintsTable, SWT.NONE);

		TechnicalProperty property = constraint.getTechnicalProperty();
		String name = null;

		name = (property != null) ? property.getName() : "unknown property";
		if (name == null)
			name = "";
		String value = constraint.getValue();
		if (value == null)
			value = "";
		item.setText(name + " == " + value);
		item.setChecked(true);
		constraintMap.put(item, constraint);

	}

	/**
	 * @return the currently selected constraint
	 */
	public java.util.List<Constraint> getSelectedConstraints() {
		java.util.List<Constraint> result = new ArrayList<Constraint>();
		for (TableItem item : constraintsTable.getItems()) {
			if (item.getChecked())
				result.add(constraintMap.get(item));
		}
		return result;
	}

	/**
	 * @return true if none button is not checked
	 */
	public boolean isLoadConstraints() {
		return !noneButton.getSelection();
	}

}

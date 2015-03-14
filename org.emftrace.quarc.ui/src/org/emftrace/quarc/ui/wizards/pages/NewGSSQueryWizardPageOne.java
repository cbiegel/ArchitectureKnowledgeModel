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

import java.util.UUID;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
//import org.eclipse.emf.emfstore.client.model.WorkspaceManager;


/**
 * 1st WizardPage for NewGSSWizard
 * 
 * @author Daniel Motschmann
 *
 */
public class NewGSSQueryWizardPageOne extends WizardPage {
	
	
	private Text nameText;
	
	/**
	 * @return the entered name for the new query
	 */
	public String getQueryName() {
		return nameText.getText();
	}

	/**
	 * @return the id for the new query
	 */
	public String getId() {
		return idText.getText();
	}
	
	/**
	 * @return the entered description for the new query
	 */
	public String getQueryDescription() {
		return descriptionText.getText();
	}

	/**
	 * @return a selected username
	 */
	public String getUsername() {
		return usernameText.getText();
	}


	private Text idText;
	private Text descriptionText;
	private Text usernameText;
	private GSSQueryContainment parentPackage;
	private Button allButton;
	private Button patternButton;
	private Button refactoringsButton;

	/**
	 * the constructor
	 * 
	 * @param pageName the page name
	 * @param parent a GSSQueryContainment
	 */
	public NewGSSQueryWizardPageOne(String pageName, GSSQueryContainment parent) {
		super(pageName);
	    setTitle("New query wizard");
        setMessage("Please enter the properies of the new query");
		this.parentPackage = parent;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		setControl(composite);

		
		Label nameLabel = new Label(composite, SWT.NONE);
		nameLabel.setText("Name:");
		
		nameText = new Text(composite, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		nameText.setToolTipText("please enter the name for the new query here");
		
		Label descriptionLabel = new Label(composite, SWT.NONE);
		descriptionLabel.setText("Description:");
		
		descriptionText = new Text(composite, SWT.BORDER | SWT.MULTI);
		descriptionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		descriptionText.setToolTipText("please enter the description for the new query here");
		
		Label idLabel = new Label(composite, SWT.NONE);
		idLabel.setText("ID:");
		
		idText = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		idText.setText("");
		idText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		idText.setToolTipText("the automatic generated id for the new query");
		
		Button regenerateIDButton = new Button(composite, SWT.NONE);
		regenerateIDButton.setText("new");
		regenerateIDButton.setToolTipText("generate a new ID");
		
		regenerateIDButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		regenerateIDButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				generateID();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {				
			}
		});
		
		
		Label usernameLabel = new Label(composite, SWT.NONE);
		usernameLabel.setText("Creator:");
		
		usernameText = new Text(composite, SWT.BORDER);
		usernameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		usernameText.setToolTipText("please enter the username of the creator of the new query here");

		initTexts();
		
		Group radioGroup = new Group(composite, SWT.NONE);
		radioGroup.setText("solution instrument types to search");
		radioGroup.setLayout(new RowLayout(SWT.VERTICAL));
		radioGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				2, 1));

		radioGroup.setToolTipText("please select the type of the solution instrument to search here");

		allButton = new Button(radioGroup, SWT.RADIO);
		allButton.setText("all");
		allButton.setSelection(true);
		allButton
				.setToolTipText("include all solution instruments");
			
		patternButton = new Button(radioGroup, SWT.RADIO);
		patternButton.setText("pattern only");
		patternButton.setSelection(false);
		patternButton
		.setToolTipText("include only pattern");
		
		refactoringsButton = new Button(radioGroup, SWT.RADIO);
		refactoringsButton.setText("refactorings and flaws only");
		refactoringsButton.setSelection(false);
		refactoringsButton
		.setToolTipText("include only refactorings and flaws");
		
	}

	/**
	 * Initializes all Text controls with default values
	 */
	private void initTexts() {
		usernameText.setText("");
		generateID();		
	}

	/**
	 * generates a new ID and fills the idText control with this ID
	 */
	private void generateID() {
		idText.setText(UUID.randomUUID().toString());
	}

	
	/**
	 * @return the value for the inculdeAll Flag
	 */
	public boolean includeAll() {
		return allButton.getSelection();
	}

	/**
	 * @return the value for the inculdeRefactorings Flag
	 */
	public boolean includeRefactorings() {
		return allButton.getSelection() || refactoringsButton.getSelection();
	}

	/**
	 * @return the value for the inculdePattern Flag
	 */
	public boolean includePattern() {
		return allButton.getSelection() || patternButton.getSelection();
	}

	/**
	 * @return the value for the inculdePrinciples Flag
	 */
	public boolean includePrinciples() {
		return allButton.getSelection() || patternButton.getSelection() || refactoringsButton.getSelection();
	}
	
	/**
	 * @return the value for the inculdeFlaws
	 */

	public boolean includeFlaws() {
		return allButton.getSelection() || refactoringsButton.getSelection();
	}
	

}

/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TypeBasedImpactAnalysisWizardPage4 extends WizardPage
{
    private Composite container;
    
    private Button createSingleReportsButton;
    private Button createComprehensiveReportButton;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Determines whether the impact analysis returns single impact reports
     * 
     * @return true if single reports shall be created
     */
    public boolean shouldCreateSingleReports()
    {
    	return createSingleReportsButton.getSelection();
    }

    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Determines whether the impact analysis shall return one comprehensive report
     * 
     * @return true if one comprehensive report shall be created
     */
    public boolean shouldCreateComprehensiveReport()
    {
    	return createComprehensiveReportButton.getSelection();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param pageName the name of the page
     */
	public TypeBasedImpactAnalysisWizardPage4(String pageName)
	{
		super(pageName);
	}
	
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void createControl(Composite parent)
    {
        container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        
        GridData gd= new GridData();
        gd.horizontalSpan= 1;
        
        createSingleReportsButton = new Button(container, SWT.CHECK);
        createSingleReportsButton.setText("Create individual impact reports");
        createSingleReportsButton.setLayoutData(gd);
        
        createComprehensiveReportButton = new Button(container, SWT.CHECK);
        createComprehensiveReportButton.setText("Create a comprehensive impact report");
        createComprehensiveReportButton.setLayoutData(gd);
        
        createSingleReportsButton.setSelection(false);
        createComprehensiveReportButton.setSelection(true);
        
        setControl(container);
        setPageComplete(true);
    }
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Label;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.DependencyDetectionWizard;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyDetectionWizardPage2 extends WizardPage
{   
    private ECPProject project;
    private List ruleList;
    
    private Composite container;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * 
     * @param currentProject the current project 
     */
    public DependencyDetectionWizardPage2(ECPProject currentProject)
    {
        super("RuleApplicationWizardPage2");
        
        project = currentProject;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Adjust the list before viewing this page
     */
    void onEnterPage()
    {
        ruleList.removeAll();
        if( ((DependencyDetectionWizard)getWizard()).selectedCatalog != null )
        {
            for(int i = 0; i < ((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().size(); i++)
            {
                if( ((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().get(i).getRuleID() != null )
                    ruleList.add(((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().get(i).getRuleID());
            }
            
            setPageComplete(true);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void createControl(Composite parent)
    {
        container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
         
        Label headerLabel = new Label(container, SWT.NULL);
        headerLabel.setText("The following rules are available:");        
        headerLabel.setLayoutData(new GridData());
        
        ruleList = new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL );
        ruleList.setLayoutData(new GridData(TreeHelperUtil.treeControlWidth, TreeHelperUtil.treeControlHeight));
        ruleList.deselectAll();
        
        final java.util.List<EObject> rules = Activator.getAccessLayer().getElements(project, "Rule");
                        
        if( ((DependencyDetectionWizard)getWizard()).selectedCatalog != null )
        {
            for(int i = 0; i < ((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().size(); i++)
            {
                if( ((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().get(i).getRuleID() != null )
                    ruleList.add(((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().get(i).getRuleID());
            }
        }
        else
        {
            java.util.List<String> nameList = new ArrayList<String>();
            for(int i = 0; i < rules.size(); i++)
            {
                if( ((Rule)rules.get(i)).getRuleID() != null ) nameList.add(((Rule)(rules.get(i))).getRuleID());
            }
            Collections.sort(nameList, String.CASE_INSENSITIVE_ORDER);
            
            // add all rules to the list:     
            for(int i = 0; i < nameList.size(); i++)
            {
                for(int j = 0; j < rules.size(); j++)
                {
                    if( ((Rule)rules.get(j)).getRuleID() == null )
                    {
                        if( ((Rule)(rules.get(j))).getRuleID().equals(nameList.get(i)) )
                        {
                            ruleList.add(((Rule)(rules.get(j))).getRuleID());
                            break;
                        }
                    }
                }
            }
        }
        
        ruleList.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetDefaultSelected(SelectionEvent e)
            {              
            }

            @Override
            public void widgetSelected(SelectionEvent e)
            {
                if( ruleList.getSelectionIndex() == -1 ) 
                {
                    if( ((DependencyDetectionWizard)getWizard()).selectedCatalog == null )
                    {
                        setErrorMessage("You must select at least 1 rule");
                        setPageComplete(false);
                    }
                    return;
                }
                
                ((DependencyDetectionWizard)getWizard()).selectedRules = new ArrayList<Rule>();
                
                if( ((DependencyDetectionWizard)getWizard()).selectedCatalog != null )
                {
                    for(int i = 0; i < ((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().size(); i++)
                        if( ruleList.isSelected(i) )
                            ((DependencyDetectionWizard)getWizard()).selectedRules.add(((DependencyDetectionWizard)getWizard()).selectedCatalog.getRules().get(i));
                    
                }
                else
                {
                    for(int i = 0; i < rules.size(); i++)
                        if( ruleList.isSelected(i) )
                            ((DependencyDetectionWizard)getWizard()).selectedRules.add((Rule)rules.get(i));
                    
                    setPageComplete(true);
                }
            }
        });

        setControl(container);
        setPageComplete(false);
    }
}
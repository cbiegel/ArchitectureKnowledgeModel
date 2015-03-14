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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.TypeBasedImpactAnalysisWizard;

/**
 * A class to provide utility functions for inserting data into trees
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TypeBasedImpactAnalysisWizardPage3 extends WizardPage
{           
    private Composite container;
    
    private Tree modelTree;
    
    private ECPProject project;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * 
     * @param currentProject the current project
     */
    public TypeBasedImpactAnalysisWizardPage3(ECPProject currentProject)
    {
        super("ImpactAnalysisWizardPage3");
        setControl(modelTree);
        
        project = currentProject;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void createControl(Composite parent)
    {
        container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
         
        Label headerLabel = new Label(container, SWT.NULL);
        headerLabel.setText("The selected model contains the following sub-models:");
        
        headerLabel.setLayoutData(new GridData());
        
        modelTree = new Tree(container, SWT.BORDER | SWT.V_SCROLL );
        modelTree.setLayoutData(new GridData(TreeHelperUtil.treeControlWidth, TreeHelperUtil.treeControlHeight));
        modelTree.deselectAll();
        
        EList<Object> tmp = project.getContents();
        final java.util.List<EObject> models = new ArrayList<EObject>();
        for(int i = 0; i < tmp.size(); i++)
        	models.add((EObject) tmp.get(i));
                
        for(int i = 0; i < models.size(); i++)
        {
        	TreeHelperUtil.addToTree(modelTree, models.get(i));
        }
        
        modelTree.addSelectionListener(new SelectionListener() 
        {
            @Override
            public void widgetDefaultSelected(SelectionEvent e)
            {              
            }

            @Override
            public void widgetSelected(SelectionEvent e)
            {            	
                if( modelTree.getSelection() == null    ) return;
                if( modelTree.getSelection().length > 1 ) return;
                
                String selectionName = modelTree.getSelection()[0].getText();
                
                ((TypeBasedImpactAnalysisWizard)getWizard()).changeTarget = null;
                
                final java.util.List<EObject> models = Activator.getAccessLayer().getAllElements(project);
                
                for(int i = 0; i < models.size(); i++)
                {
                    if( TreeHelperUtil.getName(models.get(i)).equalsIgnoreCase(selectionName) )
                    {
                        ((TypeBasedImpactAnalysisWizard)getWizard()).changeTarget = models.get(i);
                        break;
                    }
                }
            }
        });

        // Required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
    }
}
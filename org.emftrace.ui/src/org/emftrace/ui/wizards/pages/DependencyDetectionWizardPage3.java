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
import org.emftrace.ui.wizards.DependencyDetectionWizard;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyDetectionWizardPage3 extends WizardPage
{    
    private ECPProject project;
    
    private Composite container;

    private Tree modelTree;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * 
     * @param currentProject the current project
     */
    public DependencyDetectionWizardPage3(ECPProject currentProject)
    {
        super("RuleApplicationWizardPage3");
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
        headerLabel.setText("The following models are available in the project:");
        
        headerLabel.setLayoutData(new GridData());
        
        modelTree = new Tree(container, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI );
        modelTree.setLayoutData(new GridData(TreeHelperUtil.treeControlWidth, TreeHelperUtil.treeControlHeight));
        modelTree.deselectAll();
        
        // add all catalogs to the list:
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
                
                ((DependencyDetectionWizard)getWizard()).selectedModels = new ArrayList<EObject>();
                
                for(int i = 0; i < modelTree.getSelection().length; i++)
                	for(int j = 0; j < models.size(); j++)
                		if( models.get(j) == modelTree.getSelection()[i].getData() )
                			((DependencyDetectionWizard)getWizard()).selectedModels.add(models.get(j));
            }
        });

        // Required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
    }
}
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
import org.eclipse.swt.widgets.TreeItem;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.AbstractWizard;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TypeBasedImpactAnalysisWizardPage2 extends WizardPage
{
    private ECPProject project;
    
    private Composite container;
    private Tree changeTree;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * 
     * @param currentProject the current project
     */
    public TypeBasedImpactAnalysisWizardPage2(ECPProject currentProject)
    {
        super("ImpactAnalysisWizardPage2");
        setControl(changeTree);
        
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
        headerLabel.setText("The following change types are available in the project:");
        
        headerLabel.setLayoutData(new GridData());
        
        changeTree = new Tree(container, SWT.BORDER | SWT.V_SCROLL );
        changeTree.setLayoutData(new GridData(TreeHelperUtil.treeControlWidth, TreeHelperUtil.treeControlHeight));
        changeTree.deselectAll();
        
        java.util.List<EObject> rootCatalogs = Activator.getAccessLayer().getElements(project, "ChangeTypeCatalog");
        
        for(int i = 0; i < rootCatalogs.size(); i++)
        {
        	if( project.getContents().contains(rootCatalogs.get(i)) ) continue;
        	else
        	{
        		rootCatalogs.remove(i);
        		i--;
        	}
        }
        
        for(int i = 0; i < rootCatalogs.size(); i++)
        {
        	ChangeTypeCatalog cat = (ChangeTypeCatalog) rootCatalogs.get(i);
        	TreeItem item = new TreeItem(changeTree, SWT.NONE);
        	item.setText(cat.getName());
        	
        	TreeHelperUtil.scanSubCatalogs(item, cat);
        }

        changeTree.addSelectionListener(new SelectionListener() 
        {
            @Override
            public void widgetDefaultSelected(SelectionEvent e)
            {              
            }

            @Override
            public void widgetSelected(SelectionEvent e)
            {
            	setPageComplete(false);
            	
                if( changeTree.getSelection() == null    ) return;
                if( changeTree.getSelection().length > 1 ) return;
                
                String name = changeTree.getSelection()[0].getText();
                                
                if( ((AbstractWizard)getWizard()).selectedModels == null )
                	((AbstractWizard)getWizard()).selectedModels = new ArrayList<EObject>();
                else 
                	((AbstractWizard)getWizard()).selectedModels.clear();

                final java.util.List<EObject> models = Activator.getAccessLayer().getElements(project, "AtomicChangeType");
                models.addAll(Activator.getAccessLayer().getElements(project, "CompositeChangeType"));
                
                for(int i = 0; i < models.size(); i++)
                {
                    if( ((AbstractChangeType) models.get(i)).getName().equalsIgnoreCase(name) )
                    {
                        ((AbstractWizard)getWizard()).selectedModels.add(models.get(i));
                        setPageComplete(true);
                        break;
                    }
                }
            }
        });

        // Required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
    }
}
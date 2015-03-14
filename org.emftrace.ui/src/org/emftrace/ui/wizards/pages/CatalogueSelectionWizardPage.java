/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards.pages;

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
import org.eclipse.swt.widgets.List;
import org.emftrace.metamodel.RuleModel.RuleCatalog;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.AbstractWizard;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class CatalogueSelectionWizardPage extends WizardPage
{   
    private ECPProject project;
    
    private Composite container;
    private List catalogList;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * 
     * @param currentProject the current project
     */
    public CatalogueSelectionWizardPage(ECPProject currentProject)
    {
        super("CatalogueSelectionWizardPage");
        setControl(catalogList);
        
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
        headerLabel.setText("The following catalogs are available in the project:");
        
        headerLabel.setLayoutData(new GridData());

        catalogList = new List(container, SWT.BORDER | SWT.V_SCROLL );
        catalogList.setLayoutData(new GridData(500, 200));
        catalogList.deselectAll(); 
        
        // add all catalogues to the list:
        final java.util.List<EObject> catalogs = Activator.getAccessLayer().getElements(project, "RuleCatalog");
 
        for(int i = 0; i < catalogs.size(); i++)
        {      	
            if( ((RuleCatalog)(catalogs.get(i))).getName() != null )
                catalogList.add(((RuleCatalog)(catalogs.get(i))).getName());
        }
        
        catalogList.addSelectionListener(new SelectionListener() 
        {
            @Override
            public void widgetDefaultSelected(SelectionEvent e)
            {              
            }

            @Override
            public void widgetSelected(SelectionEvent e)
            {
                if( catalogList.getSelectionIndex() > -1 )
                    ((AbstractWizard)getWizard()).selectedCatalog = (RuleCatalog)catalogs.get(catalogList.getSelectionIndex());
                
                setPageComplete(((AbstractWizard)getWizard()).selectedCatalog != null);
            }
        });

        // Required to avoid an error in the system
        setControl(container);
    }
}
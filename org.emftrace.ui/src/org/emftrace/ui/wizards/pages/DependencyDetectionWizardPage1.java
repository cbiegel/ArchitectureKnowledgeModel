/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards.pages;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.emftrace.ui.wizards.DependencyDetectionWizard;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyDetectionWizardPage1 extends CatalogueSelectionWizardPage
{

	public DependencyDetectionWizardPage1(ECPProject currentProject)
	{
		super(currentProject);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
    @Override
    public void createControl(Composite parent)
    {
    	super.createControl(parent);
    	setPageComplete(true);
    }
	
	///////////////////////////////////////////////////////////////////////////
	
    @Override
    public WizardPage getNextPage()
    {     
        DependencyDetectionWizardPage2 page = ((DependencyDetectionWizard)getWizard()).page2;
        
        if( ((DependencyDetectionWizard)getWizard()).selectedCatalog != null)
        {           
            page.onEnterPage();            
        }
        
        return page;
    }
}
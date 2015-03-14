/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards;

import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.pages.DistanceBasedImpactAnalysisWizardPage;


/**
 * A wizard that guides the user through the configuration of the distance-based impact analyzer.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DistanceBasedImpactAnalysisWizard extends AbstractWizard
{
	public DistanceBasedImpactAnalysisWizardPage page;
	
    /**
     * Constructor
     */
    public DistanceBasedImpactAnalysisWizard() 
    {
        super();     
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void addPages() 
    {
        page = new DistanceBasedImpactAnalysisWizardPage("");
        page.setDescription("Specify the maximum propagation distance for impact analysis");
        addPage(page);
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public boolean performFinish()
    {
        Activator.getDistanceBasedImpactAnalyzer().setPropagationDistance(page.getPropagationDistance());
        finishedSuccessfully = true;
        
        return true;
    }
}

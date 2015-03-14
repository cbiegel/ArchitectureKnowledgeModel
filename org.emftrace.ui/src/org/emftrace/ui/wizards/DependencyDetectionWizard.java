/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.pages.DependencyDetectionWizardPage1;
import org.emftrace.ui.wizards.pages.DependencyDetectionWizardPage2;
import org.emftrace.ui.wizards.pages.DependencyDetectionWizardPage3;
import org.emftrace.ui.wizards.pages.RuleEngineSettingWizardPage;

/**
 * A wizard that guides the user through the configuration of the {@link RuleEngine} before any rules are 
 * applied upon the current project
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyDetectionWizard extends AbstractWizard
{
    final String page1Title = "Select a rule-catalog";
    final String page2Title = "Select the rules";
    final String page3Title = "Select the ModelElements";
    final String page4Title = "Adjust the parameters";
    final String page1Description = "Specify a catalog of rules you want to apply, otherwise just proceed with \"Next\"";
    final String page2Description = "Specify the rules you want to apply upon the project. If you did select a catalog in the previous step, you can skip this page and proceed with \"Next\"";
    final String page3Description = "Select the ModelElements you want the rules to be applied upon. If you select no models, all models will be used instead";
    final String page4Description = "Adjust the parameters for pattern matching algorithms used by the rules";
                
    /**
     * Wizard-Page for selecting a {@link RuleCatalogue rule-catalog}
     */
    public DependencyDetectionWizardPage1 page1;
    
    /**
     * Wizard-Page for selecting {@link Rule rules} 
     */
    public DependencyDetectionWizardPage2 page2;
    
    /**
     * Wizard-Page for selecting {@link EObject models}
     */
    public DependencyDetectionWizardPage3 page3;
    
    /**
     * Wizard-Page for adjusting the n-gram parameters of the {@link RuleEngine}
     */
    public RuleEngineSettingWizardPage page4;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param currentProject the current project where rules should be applied upon
     */
    public DependencyDetectionWizard(ECPProject currentProject) 
    {
        super();
        setNeedsProgressMonitor(true);
        project = currentProject;
        
        selectedCatalog = null;
        selectedModels = null;
        selectedRules = null;
        
        N = Activator.getRuleEngine().getN();
        correlation = Activator.getRuleEngine().getCorrelation();
        
        finishedSuccessfully = false;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void addPages() 
    {
        page1 = new DependencyDetectionWizardPage1(project);
        page2 = new DependencyDetectionWizardPage2(project);
        page3 = new DependencyDetectionWizardPage3(project);
        page4 = new RuleEngineSettingWizardPage();
        page1.setTitle(page1Title);
        page1.setDescription(page1Description);
        page2.setTitle(page2Title);
        page2.setDescription(page2Description);
        page3.setTitle(page3Title);
        page3.setDescription(page3Description);
        page4.setTitle(page4Title);
        page4.setDescription(page4Description);
        addPage(page1);
        addPage(page2);
        addPage(page3);
        addPage(page4);
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public boolean performFinish()
    {
        Activator.getRuleEngine().setN(page4.getN());
        Activator.getRuleEngine().setCorrelation(page4.getCorrelation());
        finishedSuccessfully = true;
                        
        return true;
    }
}
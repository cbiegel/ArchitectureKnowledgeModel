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
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.wizards.pages.RuleEngineSettingWizardPage;
import org.emftrace.ui.wizards.pages.TypeBasedImpactAnalysisWizardPage1;
import org.emftrace.ui.wizards.pages.TypeBasedImpactAnalysisWizardPage2;
import org.emftrace.ui.wizards.pages.TypeBasedImpactAnalysisWizardPage3;
import org.emftrace.ui.wizards.pages.TypeBasedImpactAnalysisWizardPage4;

/**
 * A wizard that guides the user through the configuration of the {@link RuleEngine} before any rules are 
 * applied upon the current project when performing impact analysis.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TypeBasedImpactAnalysisWizard extends AbstractWizard
{
	/**
	 * The source model that is changed
	 */
	public EObject changeSource;
	
	/**
	 * The actual part of the changed source model
	 */
	public EObject changeTarget;
	
    /**
     * Wizard-Page for selecting a {@link RuleCatalogue rule-catalog}
     */
    public TypeBasedImpactAnalysisWizardPage1 page1;
    
    /**
     * Wizard-Page for selecting a {@link AbstractChangeType change type}
     */
    public TypeBasedImpactAnalysisWizardPage2 page2;
    
    /**
     * Wizwrd-Page for selecting the changed model element
     */
    public TypeBasedImpactAnalysisWizardPage3 page3;
    
    /**
     * Wizard-Page for adjusting the n-gram parameters of the {@link RuleEngine}
     */
    public RuleEngineSettingWizardPage page4;
    
    /**
     * Wizard-Page for specifying the types of reports which should be generated
     */
    public TypeBasedImpactAnalysisWizardPage4 page5;
    
    public boolean b1;
    public boolean b2;
        
    final String page1Title = "Select a rule-catalog";
    final String page2Title = "Select the change type";
    final String page3Title = "Select the changed model";
    final String page4Title = "Adjust the parameters";
    final String page5Title = "Specify the analysis output";
    final String page1Description = "Specify a catalog of rules you want to apply.";
    final String page2Description = "Specify the change type you want to apply upon the model.";
    final String page3Description = "Select the sub-model which should be 'deleted' from the selected one, or 'merged' with the selected one, or...";
    final String page4Description = "Adjust the parameters for pattern matching algorithms used by the rules";
    final String page5Description = "Specify which type of report shall be generated";

    ///////////////////////////////////////////////////////////////////////////
    
    public TypeBasedImpactAnalysisWizard(ECPProject currentProject, EObject model)
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
	    
	    changeSource = model;
	    changeTarget = null;
    }    
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void addPages() 
    {
        page1 = new TypeBasedImpactAnalysisWizardPage1(project);
        page2 = new TypeBasedImpactAnalysisWizardPage2(project);
        page3 = new TypeBasedImpactAnalysisWizardPage3(project);
        page4 = new RuleEngineSettingWizardPage();
        page5 = new TypeBasedImpactAnalysisWizardPage4(page5Title);
        page1.setTitle(page1Title);
        page1.setDescription(page1Description);
        page2.setTitle(page2Title);
        page2.setDescription(page2Description);
        page3.setTitle(page3Title);
        page3.setDescription(page3Description);
        page4.setTitle(page4Title);
        page4.setDescription(page4Description);
        page5.setDescription(page5Description);
        addPage(page1);
        addPage(page2);
        addPage(page3);
        addPage(page4);
        addPage(page5);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public boolean performFinish()
    {
        Activator.getRuleEngine().setN(page4.getN());
        Activator.getRuleEngine().setCorrelation(page4.getCorrelation());
        
        b1 = page5.shouldCreateSingleReports();
        b2 = page5.shouldCreateComprehensiveReport();
        
        finishedSuccessfully = true;
                        
        return true;
    }
}
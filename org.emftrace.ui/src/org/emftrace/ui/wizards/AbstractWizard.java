/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.wizard.Wizard;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class AbstractWizard extends Wizard
{
	/**
	 * The current {@link Project project}
	 */
    protected ECPProject project;
    
    /**
     * The selected {@link RuleCatalog rule catalog}
     */
    public RuleCatalog selectedCatalog;
    
    /**
     * The list of selected {@link EObject model elements}. Can be null.
     */
    public List<EObject> selectedModels;
    
    /**
     * The list of selected {@link Rule rules}. Can be null.
     */
    public List<Rule>    selectedRules;
    
    /**
     * The number of NGrams
     */
    public int N;
    
    /**
     * The minimum correlation required to detect a match between two strings
     */
    public float correlation;
    
    /**
     * Determines whether the wizard was able to collect all required data
     */
    public boolean finishedSuccessfully;

	@Override
	public boolean performFinish() 
	{
		return false;
	}
}
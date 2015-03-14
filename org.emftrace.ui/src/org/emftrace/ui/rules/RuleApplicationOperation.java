/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.rules;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;
import org.emftrace.ui.activator.Activator;

/**
 * This class provides the operation for executing rules, encapsulated in
 * an progress monitor dialog
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public class RuleApplicationOperation implements IRunnableWithProgress
{
    /**
     * The {@link ECPProject project}
     */
	private ECPProject project;
    
    /**
     * A {@link List list} of {@link EObject models} selected by the user 
     */
    private List<EObject> selectedModels;
    
    /**
     * The selected {@link RuleCatalogue catalog}
     */
    private RuleCatalog selectedCatalog;
    
    /**
     * A {@link List list} of {@link Rule rules} selected by the user 
     */
    private List<Rule> selectedRules;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param newProjectSpace the current project space
     */
    public RuleApplicationOperation(ECPProject newProject, List<EObject> models, RuleCatalog catalog, List<Rule> rules)
    {
    	project = newProject;
        selectedModels = models;
        selectedCatalog = catalog;
        selectedRules = rules;
    }
    
    /////////////////////////////////////////////////////////////////////////// 
    
        
    @Override
    public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
    { 	     
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	if( (selectedRules == null && selectedCatalog == null) || project == null ) return null;
				
				List<Rule> rules = null;
				if( selectedRules != null ) rules = selectedRules;
				else                        rules = selectedCatalog.getRules(); 
		        		
		        int numRules = rules.size();
		        RuleEngine ruleEngine = Activator.getRuleEngine();
		
		        monitor.beginTask("Applying rules...", numRules+1);
		
		        for(int i = 0; i < rules.size(); i++)
		        {                                        
		            monitor.subTask(rules.get(i).getRuleID() + " ("+(i+1)+"/"+numRules+")");
		            ruleEngine.applyRule(project, selectedModels, rules.get(i));
		            monitor.worked(1);
		        }
		        
		        monitor.subTask("Cleaning up project");
		        Activator.getProjectCleaner().cleanUpProject(project);
		        monitor.worked(1);
		        
				return null;
			}
		};
		
		RunESCommand.run(call);

        monitor.done();
    }
}
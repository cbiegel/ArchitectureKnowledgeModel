/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.rules;

import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.emftrace.core.impactanalyzer.TypeBasedImpactAnalyzer;
import org.emftrace.metamodel.RuleModel.RuleCatalog;
import org.emftrace.ui.activator.Activator;

/**
 * Implements a operation for executing type-based impact analysis
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public class ImpactAnalysisOperation implements IRunnableWithProgress 
{
	private RuleCatalog rules;
	private ECPProject project;
	private List<EObject> startingImpactSet;	
	private boolean createIndividualReports;
	private boolean createComprehensiveReport;
	private boolean typeBased;	
	int sizeOfImpactSet;
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns the size of the computed impact set
	 * 
	 * @return the size of the EIS
	 */
	public int getSizeOfImpactSet()
	{
		return sizeOfImpactSet;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param newProject               the current project
	 * @param SIS                      the starting impact set
	 * @param catalogue                the current set of rules
	 * @param individualReports        creates individual impact reports for each impacted element
	 * @param comprehensiveReport      creates one comprehensive report containing all impacted elements
	 * @param performTypeBasedAnalysis enables type-based impact analysis, otherwise distance-based analysis will be applied
	 */
	public ImpactAnalysisOperation(ECPProject newProject, List<EObject> SIS, RuleCatalog catalog, boolean individualReports, boolean comprehensiveReport, boolean performTypeBasedAnalysis)
	{
		project = newProject;
		rules = catalog;
		startingImpactSet = SIS;
		createIndividualReports = individualReports;
		createComprehensiveReport = comprehensiveReport;
		typeBased = performTypeBasedAnalysis;
		sizeOfImpactSet = 0;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
    @Override
    public void run(final IProgressMonitor monitor)
    {    
    	monitor.beginTask("Performing Impact Analysis...", 2);
    	
    	monitor.subTask("Step 1: Executing impact logic");
    	
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{    	
				Activator.getAccessLayer().invalidateCache(project);
				
		    	if( typeBased )
		    	{
		    		TypeBasedImpactAnalyzer impactAnalyzer = Activator.getTypeBasedImpactAnalyzer();
		    		impactAnalyzer.init(rules);
		    		sizeOfImpactSet = impactAnalyzer.performImpactAnalysis(project, startingImpactSet, createIndividualReports, createComprehensiveReport);
		    	}
		    	else sizeOfImpactSet = Activator.getDistanceBasedImpactAnalyzer().performImpactAnalysis(project, startingImpactSet, createIndividualReports, createComprehensiveReport);
		    	
		    	monitor.worked(1);	
		    	
		    	monitor.subTask("Step 2: Cleaning up project");
		        Activator.getProjectCleaner().cleanUpProject(project);
		        monitor.worked(1);
		                
				return null;
			}
		};
		
		RunESCommand.run(call);
        		
        monitor.done();
    }
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.analysis;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.emftrace.ui.activator.Activator;


/**
 * This class provides the operation for validating traces, encapsulated in
 * an progress monitor dialog
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public class TransitivityAnalysisOperation implements IRunnableWithProgress
{
    /**
     * The {@link ECPProject project}
     */
    private ECPProject project;
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param newProjectSpace the current project space
     */
    TransitivityAnalysisOperation(ECPProject newProject)
    {
    	project = newProject;
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
		        Activator.getAccessLayer().invalidateCache(project);
		        
		        Activator.getProjectCleaner().cleanUpProject(project);               
		                        
		        monitor.beginTask("Searching for transitive links...", 1);
		
		        Activator.getLinkManager().performTransitivityAnalysis(project);
		        monitor.worked(1);
		        
		        Activator.getProjectCleaner().cleanUpProject(project);
		        
				return null;
			}
		};
		
		RunESCommand.run(call);
		        
        monitor.done();
    }
}
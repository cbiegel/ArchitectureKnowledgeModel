/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.validation;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.ui.activator.Activator;

/**
 * This class provides the operation for validating traces, encapsulated in
 * an progress monitor dialog
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public class TraceValidationOperation implements IRunnableWithProgress
{
    /**
     * The {@link ECPProject project}
     */
	private ECPProject project;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param newProject the current project
     */
    TraceValidationOperation(ECPProject newProject)
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
		                        
		        List<EObject> traces = Activator.getAccessLayer().getElements(project, "Trace");
		        
		        if( traces.isEmpty() ) return null;
		                        
		        monitor.beginTask("Validating traces...", traces.size()+1);
		        
		        for(EObject temp : traces)
		        {
		        	monitor.subTask(((Trace) temp).getName());
		        	Activator.getLinkManager().validateTrace(project, (Trace) temp);
		            monitor.worked(1);
		        }		        		        
		        
		        Activator.getProjectCleaner().cleanUpProject(project);
		        
				return null;
			}
		};
		
		RunESCommand.run(call);
        
        monitor.done();
    }
}
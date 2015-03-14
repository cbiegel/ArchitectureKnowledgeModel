/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.test;

import java.util.concurrent.Callable;

import junit.framework.TestCase;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.junit.Before;


public abstract class EMFTraceBaseTest extends TestCase
{
    protected AccessLayer accessLayer = null;
    protected ECPProject project = null;
    
    @Before // this is important, otherwise setUp() would not be called
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        final String name = this.getName();
            
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				ECPUtil.getECPProjectManager().getProjects();
				
		        String projectName = "EMFTraceCoreTestProject_" + name;
		        project = ECPUtil.getECPProjectManager().getProject(projectName);
		        
		        if( project == null )
		        {
		        	project = ECPUtil.getECPProjectManager().createProject(ECPUtil.getECPProviderRegistry().getProvider("org.eclipse.emf.ecp.emfstore.provider"), projectName, ECPUtil.createProperties());
		        }
		        
		        if( accessLayer == null )
		        {
		        	accessLayer = EMFTraceCoreFactory.createAccessLayer();
		        }        
		        
		        project.open();
		        
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
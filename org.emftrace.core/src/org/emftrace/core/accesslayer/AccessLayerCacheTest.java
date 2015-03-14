/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.accesslayer;

import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;
import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class AccessLayerCacheTest extends EMFTraceBaseTest
{   
    @Override
    public void setUp()  throws Exception
    {
        super.setUp();
    }
    
    private void runClassTest(int numTests, String className)
    {
        for(int i = 0; i < numTests; i++) 
        {
            List<EObject> list = accessLayer.getAllElements(project);
            
            for(int j = 0; j < list.size(); j++)
            {
                if( list.get(j).eClass().getName().equals(className))
                {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
    
    @Test
    public void testCacheSpeedGain()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        int numElements = 300;
		        int numTests    = 10;
		        
		        project.getContents().clear();
		        
		        for(int i = 0; i < numElements; i++) 
		        {
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createConcern());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createURNspec());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createActor());        	
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createGRLspec());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createDemand());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createGRLGraph());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createUCMmap());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createAndFork());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createAndJoin());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createActorRef());
		        	accessLayer.addElement(project, URNModelFactory.eINSTANCE.createConcreteCondition());        	
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createConcreteStyle());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createConcreteURNspec());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createEndPoint());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createEmptyPoint());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createGRLNode());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createActiveResource());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createWorkload());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createWaitingPlace());
		            accessLayer.addElement(project, URNModelFactory.eINSTANCE.createVariable());
		            
		            if( (i+1)*20 % 100 == 0 ) System.out.println((i+1)*20);
		        }
		        
		        System.out.println(20*numElements + " model(s) registered in project; performing " + numTests + " test(s):");
		        
		        // test without cache:
		        long time = System.currentTimeMillis();
		        runClassTest(numTests, "Concern");
		        runClassTest(numTests, "URNspec");
		        runClassTest(numTests, "Actor");
		        runClassTest(numTests, "GRLspec");
		        runClassTest(numTests, "Demand");
		        runClassTest(numTests, "GRLgraph");
		        runClassTest(numTests, "UCMmap");
		        runClassTest(numTests, "AndFork");
		        runClassTest(numTests, "AndJoin");
		        runClassTest(numTests, "ActorRef");
		        runClassTest(numTests, "ConcreteCondition");
		        runClassTest(numTests, "ConcreteStyle");
		        runClassTest(numTests, "ConcreteURNspec");
		        runClassTest(numTests, "EndPoint");
		        runClassTest(numTests, "EmptyPoint");
		        runClassTest(numTests, "GRLNode");
		        runClassTest(numTests, "ActiveResource");
		        runClassTest(numTests, "Workload");
		        runClassTest(numTests, "WaitingPlace");
		        runClassTest(numTests, "Variable");
		                
		        time = System.currentTimeMillis() - time;
		        System.out.println("no cache ... computation took " + time + " ms");
		        
		        // test with cache:
		        time = System.currentTimeMillis();
		        for(int i = 0; i < numTests; i++)
		        {
		            accessLayer.getElements(project, "Concern"); 
		            accessLayer.getElements(project, "URNspec");
		            accessLayer.getElements(project, "Actor");
		            accessLayer.getElements(project, "GRLspec");
		            accessLayer.getElements(project, "Demand");
		            accessLayer.getElements(project, "GRLgraph");
		            accessLayer.getElements(project, "UCMmap");            
		            accessLayer.getElements(project, "AndFork");
		            accessLayer.getElements(project, "AndJoin");
		            accessLayer.getElements(project, "ActorRef");
		            accessLayer.getElements(project, "ConcreteCondition");
		            accessLayer.getElements(project, "ConcreteStyle");
		            accessLayer.getElements(project, "ConcreteURNspec");
		            accessLayer.getElements(project, "EndPoint");
		            accessLayer.getElements(project, "EmptyPoint");
		            accessLayer.getElements(project, "GRLNode");
		            accessLayer.getElements(project, "ActiveResource");
		            accessLayer.getElements(project, "Workload");
		            accessLayer.getElements(project, "WaitingPlace");
		            accessLayer.getElements(project, "Variable");
		        }
		        time = System.currentTimeMillis() - time;
		        System.out.println("with cache ... computation took " + time + " ms");
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}

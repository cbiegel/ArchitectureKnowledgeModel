/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.linkmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class LinkManagerTest extends EMFTraceBaseTest
{
    protected LinkManager linkManager;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        linkManager = EMFTraceCoreFactory.createLinkManager();
        linkManager.enableLogging(false);
        linkManager.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testAddToTrace()
    {   
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
		        
		        accessLayer.addElement(project, link);
		        accessLayer.addElement(project, trace);
		        
		        assertEquals("Result", 0, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(project, trace, link);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        assertSame(link, trace.getTraceabilityLinks().get(0));
		        
		        linkManager.addToTrace(null, trace, link);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(project, null, link);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(project, trace, null);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(null, null, link);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(null, trace, null);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(project, null, null);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
		        linkManager.addToTrace(null, null, null);
		        assertEquals("Result", 1, trace.getTraceabilityLinks().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testcheckIfLinkExists()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{		        
				project.getContents().clear();
				
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        LinkType t = LinkModelFactory.eINSTANCE.createLinkType();
		        
		        List<EObject> sources = new ArrayList<EObject>();
		        sources.add(c1);
		        List<EObject> targets = new ArrayList<EObject>();
		        targets.add(c2);
		
		        assertEquals(0, accessLayer.getElements(project, "LinkContainer").size());
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        assertNull(linkManager.checkIfLinkExists(project, sources, targets, "Id1", t));
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        linkManager.createLink(project, c1, c2, "42", t, "Id1");
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        assertNotNull(linkManager.checkIfLinkExists(project, sources, targets, "Id1", t));
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testCreateLinkProjectModelElementModelElementStringLinkType()
    {      
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{       
				project.getContents().clear();
				
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        LinkType t = LinkModelFactory.eINSTANCE.createLinkType();
		                
		        assertEquals(0, accessLayer.getElements(project, "LinkContainer").size());
		        assertNotNull(linkManager.createLink(project, c1, c2, "42", t, ""));
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        assertNull(linkManager.createLink(null, c1, c2, "42", t, ""));
		        assertNull(linkManager.createLink(project, null, c2, "42", t, ""));
		        assertNull(linkManager.createLink(project, c1, null, "42", t, ""));
		        assertNull(linkManager.createLink(project, c1, c2, null, t, ""));
		        assertNull(linkManager.createLink(project, c1, c2, "42", null, ""));
		        assertNull(linkManager.createLink(null, (EObject)null, (EObject)null, null, null, null));
				return null;
			}
		};
		
		RunESCommand.run(call);
	}
    
    @Test
    public void testCreateTrace()
    {     
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
	        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
	        List<TraceLink> list = new ArrayList<TraceLink>();
	        list.add(link);
	        
	        assertEquals(0, accessLayer.getElements(project, "LinkContainer").size());
	        assertNotNull(linkManager.createTrace(project, list, "42"));       
	        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
	        assertNull(linkManager.createTrace(null, null, "42"));
	        assertNull(linkManager.createTrace(project, null, null));
	        assertNull(linkManager.createTrace(null, null, null));
					return null;
			}    		
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testDeleteLinkProjectTraceLink()
    { 
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        
		        accessLayer.addElement(project, link);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.deleteLink(null, link);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.deleteLink(project, (TraceLink)null);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.deleteLink(null, (TraceLink)null);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());  
		        linkManager.deleteLink(project, link);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testDeleteTraceProjectTrace()
    {  
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
		        
		        accessLayer.addElement(project, trace);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.deleteTrace(null, trace);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.deleteTrace(project, (Trace)null);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.deleteTrace(null, (Trace)null);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.deleteTrace(project, trace);
		        assertEquals(0, accessLayer.getElements(project, "Trace").size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testRemoveFromTrace()
    {  
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        
		        accessLayer.addElement(project, trace);
		        accessLayer.addElement(project, link);
		        trace.setCreatedByUser(true);
		        
		        linkManager.addToTrace(project, trace, link);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(null, trace, link, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(project, null, link, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(project, trace, null, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(null, null, link, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(null, trace, null, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(project, null, null, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(null, null, null, false);
		        assertEquals(1, trace.getTraceabilityLinks().size());
		        linkManager.removeFromTrace(project, trace, link, false);
		        assertEquals(0, trace.getTraceabilityLinks().size());        
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testPerformTransitivityAnalysis()
    {        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{		     
				project.getContents().clear();
				
		        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
		        accessLayer.addElement(project, trace);
		        trace.setCreatedByUser(false);
		                
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.performTransitivityAnalysis(null);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.performTransitivityAnalysis(project);
		        assertEquals(0, accessLayer.getElements(project, "Trace").size());
		        
		        TraceLink link1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink link2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link1);
		        accessLayer.addElement(project, link2);
		                
		        Concern concern1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern3 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern1);
		        accessLayer.addElement(project, concern2);
		        accessLayer.addElement(project, concern3);
		        
		        // create a transitive relation:        
		        link1.setSource(concern1);
		        link1.setTarget(concern2);
		        link2.setSource(concern2);
		        link2.setTarget(concern3);
		        
		        // this should result in one trace being created:
		        linkManager.performTransitivityAnalysis(project);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        assertEquals(2, ((Trace) (accessLayer.getElements(project, "Trace").get(0))).getTraceabilityLinks().size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

	@Test
    public void testValidateLinkProjectTraceLink()
    {      	
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link);
		        link.setCreatedByUser(false);
		        link.setCreatedByRule("Test");
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.validateLink(project, (TraceLink)null);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.validateLink(null, link);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        linkManager.validateLink(null, (TraceLink)null);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        
		        // test removing links with no content:
		        linkManager.validateLink(project, link);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		               
		        // test removing links without source:
		        accessLayer.addElement(project, link);
		        link.setTarget(c1);
		        linkManager.validateLink(project, link);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        
		        // test removing links without target:
		        accessLayer.addElement(project, link);
		        link.setSource(c1);
		        linkManager.validateLink(project, link);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        
		        // test validation of valid link:
		        accessLayer.addElement(project, link);
		        link.setSource(c1);
		        link.setTarget(c2);
		        linkManager.validateLink(project, link);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testValidateTraceProjectTrace()
    {        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
		        accessLayer.addElement(project, trace);
		        trace.setCreatedByUser(false);
		        
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.validateTrace(null, trace);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.validateTrace(project, (Trace)null);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.validateTrace(null, (Trace)null);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		               
		        Concern concern1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern3 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern4 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern1);
		        accessLayer.addElement(project, concern2);
		        accessLayer.addElement(project, concern3);
		        accessLayer.addElement(project, concern4);
		                
		        TraceLink link1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink link2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link1);
		        accessLayer.addElement(project, link2);
		        
		        link1.setSource(concern1);
		        link1.setTarget(concern2);
		        link2.setSource(concern2);
		        link2.setTarget(concern3);
		             
		        // create the transitive trace:
		        linkManager.addToTrace(project, trace, link1);
		        linkManager.addToTrace(project, trace, link2);
		        
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        linkManager.validateTrace(project, trace);
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        
		        // break the transitive relation:
		        link2.setSource(null);
		        link2.setSource(concern3);
		        
		        linkManager.validateTrace(project, trace);
		        assertEquals(0, accessLayer.getElements(project, "Trace").size());
		        
		        // now test splitting one trace into 2 traces (first create such a trace):
		        TraceLink link3 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink link4 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link3);
		        accessLayer.addElement(project, link4);        
		        accessLayer.addElement(project, trace);
		
		        linkManager.addToTrace(project, trace, link1);
		        linkManager.addToTrace(project, trace, link2);
		        linkManager.addToTrace(project, trace, link3);
		        linkManager.addToTrace(project, trace, link4);
		        
		        link2.setSource(concern2);
		        
		        Concern concern5 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern6 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern5);
		        accessLayer.addElement(project, concern6);
		                
		        link3.setSource(concern4);
		        link3.setTarget(concern5);
		        link4.setSource(concern5);
		        link4.setTarget(concern6);
		        
		        assertEquals(4, trace.getTraceabilityLinks().size());
		        assertEquals(1, accessLayer.getElements(project, "Trace").size());
		        
		        // the trace consisting of 2 transitive links (each consisting of 2 links) should be splitted into
		        // 2 new traces, each containing one transitive link:
		        linkManager.validateTrace(project, trace);
		        assertEquals(2, accessLayer.getElements(project, "Trace").size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testCheckForDirectRelationship()
    {   
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink link2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link1);
		        accessLayer.addElement(project, link2);
		                
		        Concern concern1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern3 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern1);
		        accessLayer.addElement(project, concern2);
		        accessLayer.addElement(project, concern3);
		        
		        // create a transitive relation:        
		        link1.setSource(concern1);
		        link1.setTarget(concern2);
		        link2.setSource(concern2);
		        link2.setTarget(concern3);
		        
		        assertTrue(linkManager.checkForDirectRelationship(link1, link2));
		        
		        // destroy the transitive relation:
		        Concern concern4 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern4);
		        link2.setSource(null);
		        link2.setSource(concern4);
		        
		        assertFalse(linkManager.checkForDirectRelationship(link1, link2));
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }

    @Test
    public void testCheckForIndirectRelationships()
    {       
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink link2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link1);
		        accessLayer.addElement(project, link2);
		                
		        Concern concern1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern3 = URNModelFactory.eINSTANCE.createConcern();
		        Concern concern4 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern1);
		        accessLayer.addElement(project, concern2);
		        accessLayer.addElement(project, concern3);
		        accessLayer.addElement(project, concern4);
		        
		        // create a transitive relation:
		        link1.setSource(concern1);
		        link1.setTarget(concern2);
		        link2.setSource(concern2);
		        link2.setTarget(concern3);
		        
		        List<TraceLink> list = new ArrayList<TraceLink>();
		        list.clear();
		        assertNull(linkManager.checkForIndirectRelationships(null));
		        assertEquals(0, linkManager.checkForIndirectRelationships(list).size());
		        list.add(link1);
		        list.add(link2);
		        
		        assertEquals(2, linkManager.checkForIndirectRelationships(list).size());
		        assertEquals(2, linkManager.checkForIndirectRelationships(list).get(0).size());
		        assertEquals(0, linkManager.checkForIndirectRelationships(list).get(1).size());
		        
		        // check with non-transitive links:
		        link2.setSource(null);
		        link2.setSource(concern3);
        
		        assertEquals(2, linkManager.checkForIndirectRelationships(list).size());
		        assertEquals(1, linkManager.checkForIndirectRelationships(list).get(0).size());
		        assertEquals(1, linkManager.checkForIndirectRelationships(list).get(1).size());
				return null;
			}    		
    	};
    	
    	RunESCommand.run(call);
    }
}
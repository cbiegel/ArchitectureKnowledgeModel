/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.accesslayer;

import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.junit.Test;
//import org.eclipse.emf.emfstore.internal.common.model.ModelElementId;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.LinkTypeCatalog;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class AccessLayerTest extends EMFTraceBaseTest
{   
    @Override
    public void setUp()  throws Exception
    {
        super.setUp();
    }

    @Test
    public void testAddElement()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern test = URNModelFactory.eINSTANCE.createConcern();
		        project.getContents().clear();
		        
		        assertEquals("Result", 0, project.getContents().size());
		        accessLayer.addElement(project, test);
		        assertEquals("Result", 1, project.getContents().size());
		        
		        accessLayer.addElement(project, null);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.addElement(null, test);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.addElement(null, null);
		        assertEquals("Result", 1, project.getContents().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testCommitProject()
    {
        // can't really test here since it would require to mock EMFStore
        assertTrue(true);
    }

    @Test
    public void testCommitProjects()
    {
        // can't really test here since it would require to mock EMFStore
        assertTrue(true);
    }

    @Test
    public void testGetAllChildren()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        LinkType          t1  = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType          t2  = LinkModelFactory.eINSTANCE.createLinkType();
		        project.getContents().add(cat);
		        project.getContents().add(t1);
		        project.getContents().add(t2);
		        
		        cat.getLinkTypes().add(t1);
		        t1.getRefinement().add(t2);
		 
		        assertEquals(2, accessLayer.getAllChildren(cat).size());
		        assertEquals(0, accessLayer.getAllChildren(null).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetAttribute()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern test = URNModelFactory.eINSTANCE.createConcern();
		        test.setId("123");
		        accessLayer.addElement(project, test);        
		        assertNotNull(accessLayer.getAttribute(test, "Id"));
		        
		        assertNull(accessLayer.getAttribute(null, "creator"));
		        assertNull(accessLayer.getAttribute(test, null));
		        assertNull(accessLayer.getAttribute(null, null));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetAttributeValueModelElementString()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        cat.setDescription("I'm a leaf on the wind!");
		
		        assertEquals("Result", "I'm a leaf on the wind!", accessLayer.getAttributeValue(cat, "Description"));
		        
		        assertNull(accessLayer.getAttributeValue(null, "Description"));
		        assertNull(accessLayer.getAttributeValue(cat, (String)null));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testGetAttributeValueModelElementStringString()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        Actor actor = URNModelFactory.eINSTANCE.createActor();
		        
		        actor.setId("123");
		        
		        link.setSource(actor);
		
		        assertEquals("Result", "123", accessLayer.getAttributeValue(link.getSource(), "Id"));
		        actor.setId("1234");
		        assertEquals("Result", "1234", accessLayer.getAttributeValue(link.getSource(), "Id"));
		        assertNull(accessLayer.getAttributeValue(null, (String)null, (String)null));
		        assertNull(accessLayer.getAttributeValue(link.getSource(), (String)null, (String)null));
		        assertNull(accessLayer.getAttributeValue(link.getSource(), (String)null, "Id"));
		        assertNull(accessLayer.getAttributeValue(link.getSource(), (String)null));
		        assertNull(accessLayer.getAttributeValue(null, "Id"));
		        assertNull(accessLayer.getAttributeValue(link.getSource(), "test"));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetAttributes()
    {        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{		
				LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        
		        // name, description = 2
		        assertEquals("Result", 2, accessLayer.getAttributes(cat).size());
		        assertNull(accessLayer.getAttributes(null));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetDirectChildren()
    {    
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        LinkType          t1  = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType          t2  = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType          t3  = LinkModelFactory.eINSTANCE.createLinkType();
		        project.getContents().add(cat);
		        project.getContents().add(t1);
		        project.getContents().add(t2);
		        project.getContents().add(t3);
		        
		        cat.getLinkTypes().add(t1);
		        t1.getRefinement().add(t2);
		        t2.getRefinement().add(t3);
		 
		        assertEquals(1, accessLayer.getDirectChildren(cat).size());
		        assertEquals(0, accessLayer.getDirectChildren(null).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testGetParent()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog catalog = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        accessLayer.addElement(project, catalog);
		        
		        LinkType type = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, type);
		         
		        catalog.getLinkTypes().add(type);        
		        assertEquals(catalog, accessLayer.getParent(type));
		        assertEquals(null, accessLayer.getParent(null));        
		        catalog.getLinkTypes().remove(type);     
		        assertNotNull(type);
		        assertNotSame(catalog, accessLayer.getParent(type));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testGetAllElements()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        accessLayer.addElement(project, c3);
		        		        
		        assertEquals(3, accessLayer.getAllElements(project).size());
		        assertNull(accessLayer.getAllElements(null));
		        accessLayer.removeElement(project, c1);
		        assertEquals(2, accessLayer.getAllElements(project).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetElementsProjectEClass()
    {    
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        LinkType          t1  = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType          t2  = LinkModelFactory.eINSTANCE.createLinkType();
		        project.getContents().clear();
		        project.getContents().add(cat);
		        project.getContents().add(t1);
		        project.getContents().add(t2);
		        
		        cat.getLinkTypes().add(t1);
		        t1.getRefinement().add(t2);
		 
		        assertEquals("Result", 2, accessLayer.getElements(project, t1.eClass()).size());
		        assertEquals("Result", 1, accessLayer.getElements(project, cat.eClass()).size());
		        assertEquals(0, accessLayer.getElements(null, cat.eClass()).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testGetElementsProjectString()
    { 
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkTypeCatalog cat = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        LinkType          t1  = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType          t2  = LinkModelFactory.eINSTANCE.createLinkType();
		        project.getContents().clear();
		        project.getContents().add(cat);
		        project.getContents().add(t1);
		        project.getContents().add(t2);
		        
		        cat.getLinkTypes().add(t1);
		        t1.getRefinement().add(t2);
		 
		        assertEquals("Result", 2, accessLayer.getElements(project, "LinkType").size());
		        assertEquals("Result", 1, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        
		        assertEquals(0, accessLayer.getElements(project, (String)null).size());
		        assertEquals(0, accessLayer.getElements(null, "LinkType").size());
		        assertEquals(0, accessLayer.getElements(null, (String)null).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testRemoveElementProjectModelElement()
    {        
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern test = URNModelFactory.eINSTANCE.createConcern();
		        project.getContents().clear();
		        
		        assertEquals("Result", 0, project.getContents().size());
		        accessLayer.addElement(project, test);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.removeElement(project, test);
		        assertEquals("Result", 0, project.getContents().size());
		        
		        accessLayer.addElement(project, test);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.removeElement(null, test);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.removeElement(project, (EObject)null);
		        assertEquals("Result", 1, project.getContents().size());
		        accessLayer.removeElement(null, (EObject)null);
		        assertEquals("Result", 1, project.getContents().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testSetCommitImmediately()
    {
        assertFalse(accessLayer.commitsImmediately());
        accessLayer.setCommitImmediately(true);
        assertTrue(accessLayer.commitsImmediately());
    }
    
    @Test
    public void testCommitsImmediately()
    {
        assertFalse(accessLayer.commitsImmediately());
        accessLayer.setCommitImmediately(true);
        assertTrue(accessLayer.commitsImmediately());
    }
    
    @Test
    public void testGetNameOfModel()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern test = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, test);
		        
		        test.setName("HAL9000");
		        assertEquals("HAL9000", accessLayer.getNameOfModel(test));
		        assertNull(accessLayer.getNameOfModel(null));
				return null;
			}
		};

		RunESCommand.run(call);
    }
}
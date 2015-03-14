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

import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ModelElementCacheTest extends EMFTraceBaseTest 
{
	protected ModelElementCache cache;
	
	@Test
	public void testGet()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Actor actor = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor);
				
				// test case "project not yet registered:
				assertNull(cache.get(project, "Actor"));
				
				// test case "model not yet stored in cache":
				cache.addProject(project);
				assertNull(cache.get(project, "Actor"));
				
				// test case "model is stored in cache":
				cache.insert(project, actor);
				assertNotNull(cache.get(project, "Actor"));
				assertEquals(actor, cache.get(project, "Actor").get(0));
				
				// add another model of same type:
				Actor actor2 = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor2);
				cache.insert(project, actor2);
				assertEquals(2, cache.get(project, "Actor").size());
				
				// add a model of a different class to the cache:
				Concern concern = URNModelFactory.eINSTANCE.createConcern();
				project.getContents().add(concern);
				cache.insert(project, concern);
				assertEquals(2, cache.get(project, "Actor").size());
				
				return null;
			}
		};
		
		RunESCommand.run(call);
	}
	
	@Test
	public void testInsert()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Actor actor1 = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor1);
				Actor actor2 = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor2);
				
				assertNull(cache.get(project, "Actor"));
				cache.insert(project, actor1);
				assertEquals(1, cache.get(project, "Actor").size());
				assertEquals(1, cache.getProjects().size());
				cache.insert(project, actor2);
				assertEquals(2, cache.get(project, "Actor").size());
				assertEquals(1, cache.getProjects().size());
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testRemove()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Actor actor = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor);
				cache.insert(project, actor);
				
				cache.remove(null, actor);
				assertEquals(actor, cache.get(project, "Actor").get(0));
				cache.remove(project, null);
				assertEquals(actor, cache.get(project, "Actor").get(0));
				cache.remove(project, actor);
				assertNull(cache.get(project, "Actor"));
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testClear()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Actor actor = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor);
				cache.insert(project, actor);
				
				cache.remove(null, actor);
				assertEquals(actor, cache.get(project, "Actor").get(0));
				cache.remove(project, actor);
				assertNull(cache.get(project, "Actor"));
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testClearEntireCache()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				Actor actor = URNModelFactory.eINSTANCE.createActor();
				project.getContents().add(actor);
				cache.insert(project, actor);
				
				cache.remove(null, actor);
				assertEquals(actor, cache.get(project, "Actor").get(0));
				cache.remove(project, actor);
				assertNull(cache.get(project, "Actor"));
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testContainsProject()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				assertFalse(cache.containsProject(project));
				cache.addProject(project);
				assertTrue(cache.containsProject(project));
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testAddProject()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				assertFalse(cache.containsProject(project));
				assertNull(cache.getProjects());
				cache.addProject(project);
				assertTrue(cache.containsProject(project));
				assertEquals(1, cache.getProjects().size());
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
	
	@Test
	public void testGetProjects()
	{
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
				assertNull(cache.getProjects());
				cache.addProject(project);
				assertEquals(1, cache.getProjects().size());
				
				return null;
			}
		};
		
		RunESCommand.run(call);		
	}
}

/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.elementprocessor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ElementProcessorTest extends EMFTraceBaseTest
{
    protected ElementProcessor elementProcessor;
    
    public void setUp() throws Exception
    {
        super.setUp();
        
        elementProcessor = EMFTraceCoreFactory.createElementProcessor();
        elementProcessor.enableLogging(false);
        elementProcessor.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testRetrieveElementsProjectStringListOfQueryElement()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link);
		                
		        List<EObject> list = new ArrayList<EObject>();
		        list.clear();
		        
		        assertEquals(0, list.size());
		        elementProcessor.retrieveElements(project, "TraceLink", list);
		        assertEquals(1, list.size());
		        assertSame(link, list.get(0));
		        list.clear();
		        
		        Actor actor = URNModelFactory.eINSTANCE.createActor();
		        accessLayer.addElement(project, actor);
		        
		        assertEquals(0, list.size());
		        elementProcessor.retrieveElements(project, "TraceLink|Actor", list);
		        assertEquals(2, list.size());
		        list.clear();
		        
		        assertEquals(0, list.size());
		        elementProcessor.retrieveElements(project, "*", list);
		        assertEquals(2, list.size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testRetrieveElementsProjectTraceRuleListOfModelElementListOfListOfQueryElement()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link);
		        
		        List<List<EObject>> results = new ArrayList<List<EObject>>();
		        results.add(new ArrayList<EObject>());
		        results.get(0).clear();
		        
		        List<EObject> models = new ArrayList<EObject>();
		        models.add(link);
		        
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        e1.setType("TraceLink");
		        rule.getElements().add(e1);
		        
		        assertEquals(1, results.size());
		        assertEquals(0, results.get(0).size());
		        elementProcessor.retrieveElements(project, rule, models, results);
		        assertEquals(1, results.size());
		        assertEquals(1, results.get(0).size());
		        assertSame(link, results.get(0).get(0));
		        
		        Actor actor = URNModelFactory.eINSTANCE.createActor();
		        accessLayer.addElement(project, actor);
		        models.add(actor);
		        results.get(0).clear();
		        e1.setType("*");
		        
		        assertEquals(1, results.size());
		        assertEquals(0, results.get(0).size());
		        elementProcessor.retrieveElements(project, rule, models, results);
		        assertEquals(1, results.size());
		        assertEquals(2, results.get(0).size());
		        
		        results.get(0).clear();
		        e1.setType("Actor");
		        
		        assertEquals(1, results.size());
		        assertEquals(0, results.get(0).size());
		        elementProcessor.retrieveElements(project, rule, models, results);
		        assertEquals(1, results.size());
		        assertEquals(1, results.get(0).size());
		        assertSame(actor, results.get(0).get(0));
		        
		        results.get(0).clear();
		        e1.setType("TraceLink|Actor");
		        
		        assertEquals(1, results.size());
		        assertEquals(0, results.get(0).size());
		        elementProcessor.retrieveElements(project, rule, models, results);
		        assertEquals(1, results.size());
		        assertEquals(2, results.get(0).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testRunProjectTraceRuleListOfListOfQueryElementListOfModelElement()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        e1.setType("TraceLink");
		        e1.setAlias("e1");
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e2);
		        e2.setType("Concern");
		        e2.setAlias("e2");
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link);
		        Concern concern = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern);
		        
		        List<List<EObject>> results = new ArrayList<List<EObject>>();
		        results.clear();
		        
		        List<EObject> models = new ArrayList<EObject>();
		        models.add(link);
		        models.add(concern);
		        
		        List<List<EObject[]>> tuples = null;
		        
		        assertEquals(0, results.size());
		        elementProcessor.run(null, rule, results, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, null, results, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, rule, null, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, null, results, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, rule, null, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, rule, results, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, null, null, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, null, results, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, rule, null, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, null, null, models, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, rule, null, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, null, results, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, null, null, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(null, null, null, null, tuples);
		        assertEquals(0, results.size());
		        elementProcessor.run(project, rule, results, models, tuples);
		        assertEquals(2, results.size());
		        assertEquals(1, results.get(0).size());
		        assertEquals(1, results.get(1).size());
		        assertSame(link, results.get(0).get(0));
		        assertSame(concern, results.get(1).get(0));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testRunProjectTraceRuleListOfListOfEObject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        e1.setType("TraceLink");
		        e1.setAlias("e1");
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e2);
		        e2.setType("Concern");
		        e2.setAlias("e2");
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, link);
		        Concern concern = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, concern);
		        
		        List<List<EObject>> list = new ArrayList<List<EObject>>();
		        list.clear();
		        
		        List<List<EObject[]>> tuples = null;
		        
		        assertEquals(0, list.size());
		        elementProcessor.run(null, rule, list, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(project, null, list, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(project, rule, null, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(null, null, list, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(null, rule, null, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(project, null, null, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(null, null, null, tuples);
		        assertEquals(0, list.size());
		        elementProcessor.run(project, rule, list, tuples);
		        assertEquals(2, list.size());
		        assertEquals(1, list.get(0).size());
		        assertEquals(1, list.get(1).size());
		        assertSame(link, list.get(0).get(0));
		        assertSame(concern, list.get(1).get(0));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
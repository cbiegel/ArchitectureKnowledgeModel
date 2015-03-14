/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ConditionProcessorHelperTest extends EMFTraceBaseTest
{
    @Test
    public void testCreateDeepCopyOfResultList()
    {
        List<List<EObject>> l1 = new ArrayList<List<EObject>>();
        
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        l1.add(new ArrayList<EObject>());
        l1.get(0).add(c1);
        l1.get(0).add(c2);
        
        List<List<EObject>> l2 = ConditionProcessorHelper.createDeepCopyOfResultList(l1);
        
        assertEquals(l1.size(), l2.size());
        assertEquals(l1.get(0).size(), l2.get(0).size());
        assertSame(l1.get(0).get(0), l2.get(0).get(0));
        assertSame(l1.get(0).get(1), l2.get(0).get(1));
    }

    @Test
    public void testEqualizeResultLists()
    {
        List<List<EObject>> l1 = new ArrayList<List<EObject>>();
        List<List<EObject>> l2 = new ArrayList<List<EObject>>();
        
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        c1.setName("Name1");
        c2.setName("Name2");
        
        l1.add(new ArrayList<EObject>());
        l1.get(0).add(c1);
        l2.add(new ArrayList<EObject>());
        l2.get(0).add(c1);
        l2.get(0).add(c2);
        
        assertEquals(1, l1.get(0).size());
        assertEquals(2, l2.get(0).size());
        ConditionProcessorHelper.equalizeResultLists(l1, l2);
        assertEquals(2, l1.get(0).size());
        assertSame(c1.getName(), ((Concern) (l1.get(0).get(0))).getName());
        assertSame(c2.getName(), ((Concern) (l1.get(0).get(1))).getName());
    }
    
    @Test
    public void testFindElementsForDeletion()
    {
        Rule rule = RuleModelFactory.eINSTANCE.createRule();
        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
        BaseCondition baseCondition = RuleModelFactory.eINSTANCE.createBaseCondition();
        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
        e1.setAlias("e1");
        e2.setAlias("e2");
        
        rule.getElements().add(e1);
        rule.getElements().add(e2);
               
        rule.setConditions(logicCondition);
                
        List<Integer> paths = new ArrayList<Integer>();
        
        ConditionProcessorHelper.findElementsForDeletion(paths, rule, logicCondition);
        assertTrue(paths.isEmpty());
        
        logicCondition.getBaseConditions().add(baseCondition);
        baseCondition.setSource("e2");
        
        ConditionProcessorHelper.findElementsForDeletion(paths, rule, logicCondition);
        assertEquals(1, paths.size());
        assertEquals(1, (int)paths.get(0));
        
        paths.clear();
        
        baseCondition.setTarget("e1");
        
        ConditionProcessorHelper.findElementsForDeletion(paths, rule, logicCondition);
        assertEquals(2, paths.size());
        assertEquals(1, (int)paths.get(0));
        assertEquals(0, (int)paths.get(1));        
    }

    @Test
    public void testCreateResultListDiff()
    {
        List<List<EObject>> l1 = new ArrayList<List<EObject>>();
        List<List<EObject>> l2 = new ArrayList<List<EObject>>();
        
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        l1.add(new ArrayList<EObject>());
        l1.get(0).add(c1);
        l1.add(new ArrayList<EObject>());
        l1.get(1).add(c2);
        l2.add(new ArrayList<EObject>());
        l2.add(new ArrayList<EObject>());
        l2.get(1).add(c2);
        
        Rule rule = RuleModelFactory.eINSTANCE.createRule();
        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
        BaseCondition baseCondition = RuleModelFactory.eINSTANCE.createBaseCondition();
        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
        e1.setAlias("e1");
        e2.setAlias("e2");
        
        rule.getElements().add(e1);
        rule.getElements().add(e2);
        
        baseCondition.setSource("e2");
        
        rule.setConditions(logicCondition);
        logicCondition.getBaseConditions().add(baseCondition);
        
        assertEquals(1, l1.get(0).size());
        assertEquals(1, l1.get(1).size());
        assertEquals(0, l2.get(0).size());
        assertEquals(1, l2.get(1).size());
        ConditionProcessorHelper.createResultListDiff(l1, l2, rule, baseCondition);
        assertEquals(1, l1.get(0).size());
        assertEquals(0, l1.get(1).size());
        assertSame(c1, l1.get(0).get(0));
        
        l1.get(1).add(c2);
        assertEquals(1, l1.get(0).size());
        assertEquals(1, l1.get(1).size());
        assertEquals(0, l2.get(0).size());
        assertEquals(1, l2.get(1).size());
        ConditionProcessorHelper.createResultListDiff(l1, l2, rule, logicCondition);
        assertEquals(1, l1.get(0).size());
        assertEquals(0, l1.get(1).size());
        assertSame(c1, l1.get(0).get(0));
    }

    @Test
    public void testMergeResultLists()
    {
        List<List<EObject>> l1 = new ArrayList<List<EObject>>();
        List<List<EObject>> l2 = new ArrayList<List<EObject>>();
        
        List<List<EObject>> result = new ArrayList<List<EObject>>();
        result.add(new ArrayList<EObject>());
        
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        l1.add(new ArrayList<EObject>());
        l1.get(0).add(c1);
        l2.add(new ArrayList<EObject>());
        l2.get(0).add(c2);
        
        List<List<List<EObject>>> mergeLists = new ArrayList<List<List<EObject>>>();
        mergeLists.add(l1);
        mergeLists.add(l2);
        
        assertEquals(1, l1.get(0).size());
        assertEquals(1, l2.get(0).size());
        assertEquals(0, result.get(0).size());
        ConditionProcessorHelper.mergeResultLists(result, mergeLists);
        assertEquals(2, result.get(0).size()); 
        assertSame(c1, result.get(0).get(0));
        assertSame(c2, result.get(0).get(1));
    }
    
    @Test
    public void testAddToTuples()
    {
    	List<EObject[]> tuples = new ArrayList<EObject[]>();
    	
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        assertTrue(tuples.isEmpty());
        ConditionProcessorHelper.addToTuples(c1, c2, tuples);
        assertEquals(1, tuples.size());
        assertEquals(2, tuples.get(0).length);
        ConditionProcessorHelper.addToTuples(c1, c2, tuples);
        assertEquals(1, tuples.size());
        
        tuples.clear();
        assertTrue(tuples.isEmpty());
        ConditionProcessorHelper.addToTuples(c1, null, tuples);
        assertEquals(1, tuples.size());
        assertEquals(1, tuples.get(0).length);
        ConditionProcessorHelper.addToTuples(c1, null, tuples);
        ConditionProcessorHelper.addToTuples(c1, null, tuples);
    }
    
    @Test
    public void testCreateDeepCopyOfTupleList()
    {
       	List<EObject[]> tuples = new ArrayList<EObject[]>();
       	
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        
        tuples.add(new EObject[2]);
        tuples.get(0)[0] = c1;
        tuples.get(0)[1] = c2;
        
        List<EObject[]> copy = null;
        
        assertNull(copy);
        assertEquals(1, tuples.size());
        assertEquals(2, tuples.get(0).length);
        copy = ConditionProcessorHelper.createDeepCopyOfTupleList(tuples);
        assertEquals(1, tuples.size());
        assertEquals(2, tuples.get(0).length);
        assertEquals(1, copy.size());
        assertEquals(2, copy.get(0).length);
        assertEquals(copy.get(0)[0], tuples.get(0)[0]);
        assertEquals(copy.get(0)[1], tuples.get(0)[1]);
    }
    
    @Test
    public void testCreateDeepCopyOfTupleList2()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{  
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	List<List<EObject[]>> copy = null;
		    	
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		        
		        tuples.add(new ArrayList<EObject[]>());
		        tuples.add(new ArrayList<EObject[]>());
		        
		        tuples.get(0).add(new EObject[2]);
		        tuples.get(1).add(new EObject[1]);
		        
		        tuples.get(0).get(0)[0] = c1;
		        tuples.get(0).get(0)[1] = c2;
		        tuples.get(1).get(0)[0] = c3;
		        
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	LogicCondition lc1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	LogicCondition lc2 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	accessLayer.addElement(project, rule);
		    	accessLayer.addElement(project, lc1);
		    	accessLayer.addElement(project, lc2);
		    	
		    	rule.setConditions(lc1);
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	accessLayer.addElement(project, bc1);
		    	accessLayer.addElement(project, bc2);
		    	
		    	lc1.getLogicConditions().add(lc2);
		    	lc1.getBaseConditions().add(bc1);
		    	lc2.getBaseConditions().add(bc2);
		    	
		    	assertNull(copy);
		    	copy = ConditionProcessorHelper.createDeepCopyOfTupleList(accessLayer, tuples, rule, lc2);
		    	assertNotNull(copy);
		    	assertEquals(2, copy.size());
		    	assertTrue(copy.get(0).isEmpty());
		    	assertEquals(1, copy.get(1).size());
		    	assertEquals(1, copy.get(1).get(0).length);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCreateTupleListDiff()
    {
       	List<EObject[]> tuples = new ArrayList<EObject[]>();
       	List<EObject[]> copy = new ArrayList<EObject[]>();
       	
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
        Concern c4 = URNModelFactory.eINSTANCE.createConcern();
        
        tuples.add(new EObject[1]);
        tuples.get(0)[0] = c1;
        
        tuples.add(new EObject[1]);
        tuples.get(1)[0] = c2;
        
        tuples.add(new EObject[1]);
        tuples.get(2)[0] = c3;
        
        tuples.add(new EObject[1]);
        tuples.get(3)[0] = c4;
        
        copy.add(new EObject[1]);
        copy.get(0)[0] = c2;
        
        copy.add(new EObject[1]);
        copy.get(1)[0] = c4;
        
        assertEquals(4, tuples.size());
        ConditionProcessorHelper.createTupleListDiff(tuples, copy);
        assertEquals(2, tuples.size());
        assertEquals(c1, tuples.get(0)[0]);
        assertEquals(c3, tuples.get(1)[0]);
    }
    
    @Test
    public void testCreateTupleListDiff2()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{  
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	List<List<EObject[]>> copy   = new ArrayList<List<EObject[]>>();
		    	
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	LogicCondition lc1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	LogicCondition lc2 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	accessLayer.addElement(project, rule);
		    	accessLayer.addElement(project, lc1);
		    	accessLayer.addElement(project, lc2);
		    	
		    	rule.setConditions(lc1);
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	accessLayer.addElement(project, bc1);
		    	accessLayer.addElement(project, bc2);
		    	
		    	lc1.getLogicConditions().add(lc2);
		    	lc1.getBaseConditions().add(bc1);
		    	lc2.getBaseConditions().add(bc2);
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		        
		    	accessLayer.addElement(project, c1);
		    	accessLayer.addElement(project, c2);
		    	accessLayer.addElement(project, c3);
		    	accessLayer.addElement(project, c4);
		    	
		        tuples.add(new ArrayList<EObject[]>());
		        tuples.add(new ArrayList<EObject[]>());        
		        tuples.get(0).add(new EObject[2]);
		        tuples.get(1).add(new EObject[2]);        
		        tuples.get(0).get(0)[0] = c1;
		        tuples.get(0).get(0)[1] = c2;        
		        tuples.get(1).get(0)[0] = c3;
		        tuples.get(1).get(0)[1] = c4;
		        
		        copy.add(new ArrayList<EObject[]>());
		        copy.add(new ArrayList<EObject[]>());
		        copy.get(0).add(new EObject[2]);
		        copy.get(1).add(new EObject[2]); 
		        copy.get(0).get(0)[0] = c1;
		        copy.get(0).get(0)[1] = c2;
		        copy.get(1).get(0)[0] = c3;
		        copy.get(1).get(0)[1] = c4;
		    	
		        assertEquals(2, tuples.size());
		        assertEquals(1, tuples.get(0).size());
		        assertEquals(1, tuples.get(1).size());
		    	ConditionProcessorHelper.createTupleListDiff(accessLayer, tuples, copy, rule, lc2);
		    	assertEquals(2, tuples.size());
		    	assertEquals(1, tuples.get(0).size());
		    	assertEquals(0, tuples.get(1).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testEqualizeTupleLists()
    {
    	List<EObject[]> tuples = new ArrayList<EObject[]>();
    	List<EObject[]> copy   = new ArrayList<EObject[]>();
    	
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
        
        tuples.add(new EObject[2]);
        tuples.get(0)[0] = c1;
        tuples.get(0)[1] = c2;
        
        copy.add(new EObject[1]);
        copy.get(0)[0] = c3;
        
        assertEquals(1, tuples.size());
        assertEquals(2, tuples.get(0).length);
        ConditionProcessorHelper.equalizeTupleLists(tuples, copy);
        assertEquals(1, tuples.size());
        assertEquals(1, tuples.get(0).length);
        assertEquals(c3, tuples.get(0)[0]);
    }
    
    @Test
    public void testPrepareTupleLists()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{  
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	accessLayer.addElement(project, rule);
		    	accessLayer.addElement(project, logicCondition);
		    	
		    	rule.setConditions(logicCondition);
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	accessLayer.addElement(project, bc1);
		    	accessLayer.addElement(project, bc2);
		    	
		    	logicCondition.getBaseConditions().add(bc1);
		    	logicCondition.getBaseConditions().add(bc2);
		    	
		    	assertTrue(tuples.isEmpty());
		    	ConditionProcessorHelper.prepareTupleLists(accessLayer, rule, tuples);
		    	assertEquals(2, tuples.size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testRemoveFromTuples()
    {
    	List<EObject[]> tuples = new ArrayList<EObject[]>();
    	
        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
        Concern c4 = URNModelFactory.eINSTANCE.createConcern();
        
        tuples.add(new EObject[2]);
        tuples.get(0)[0] = c1;
        tuples.get(0)[1] = c2;
        
        tuples.add(new EObject[2]);
        tuples.get(1)[0] = c1;
        tuples.get(1)[1] = c3;
        
        tuples.add(new EObject[2]);
        tuples.get(2)[0] = c3;
        tuples.get(2)[1] = c4;
        
        assertEquals(3, tuples.size());
        assertEquals(c1, tuples.get(0)[0]);
        assertEquals(c2, tuples.get(0)[1]);
        assertEquals(c1, tuples.get(1)[0]);
        assertEquals(c3, tuples.get(1)[1]);
        assertEquals(c3, tuples.get(2)[0]);
        assertEquals(c4, tuples.get(2)[1]);
        ConditionProcessorHelper.removeFromTuples(c1, tuples, 0);
        assertEquals(1, tuples.size());
        assertEquals(c3, tuples.get(0)[0]);
        assertEquals(c4, tuples.get(0)[1]);
    }
}
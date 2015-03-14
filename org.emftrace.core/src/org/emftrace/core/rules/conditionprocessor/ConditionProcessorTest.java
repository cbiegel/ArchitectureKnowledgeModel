/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.conditionprocessor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;


/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ConditionProcessorTest extends EMFTraceBaseTest
{
    protected ConditionProcessor conditionProcessor;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        conditionProcessor = EMFTraceCoreFactory.createConditionProcessor();
        conditionProcessor.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testExecuteBaseCondition()
    {     
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        result.add(new ArrayList<EObject>());
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        c1.setId("test");
		        c2.setId("test");
		        
		        result.add(new ArrayList<EObject>());
		        result.get(0).add(c1);
		        result.add(new ArrayList<EObject>());
		        result.get(1).add(c2);
		        
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e2);
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        
		        e1.setAlias("number_1");
		        e2.setAlias("number_2");
		        
		        BaseCondition baseCondition = RuleModelFactory.eINSTANCE.createBaseCondition();
		        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, baseCondition);
		        accessLayer.addElement(project, logicCondition);
		        
		        rule.setConditions(logicCondition);
		        logicCondition.getBaseConditions().add(baseCondition);
		        logicCondition.setType(LogicConditionType.AND);
		        baseCondition.setSource("number_1::Id");
		        baseCondition.setTarget("number_2::Id");
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        // test "EQUALS":
		        baseCondition.setType(BaseConditionType.VALUE_EQUALS);        
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        assertEquals(1, result.get(0).size()); // test this once...
		        assertEquals(1, result.get(1).size());
		        c1.setId("test_addition");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "STARTS_WITH":
		        c1.setId("test_bla");
		        baseCondition.setType(BaseConditionType.VALUE_STARTS_WITH);        
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("bla");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "ENDS_WITH":
		        c1.setId("test");
		        baseCondition.setType(BaseConditionType.VALUE_ENDS_WITH);        
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("test_bla");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "CONTAINS":
		        c1.setId("test_addition");
		        baseCondition.setType(BaseConditionType.VALUE_CONTAINS);        
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("tes");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "SIMILAR_TO"
		        c1.setId("test");
		        baseCondition.setType(BaseConditionType.VALUE_SIMILAR_TO);        
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("tast");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		                
		        // test "LESSER_THAN":
		        c1.setId("1");
		        c2.setId("2");
		        baseCondition.setType(BaseConditionType.VALUE_LESSER_THAN);
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("2");
		        c2.setId("1");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "GREATER_THAN":
		        c1.setId("2");
		        c2.setId("1");
		        baseCondition.setType(BaseConditionType.VALUE_GREATER_THAN);
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        c1.setId("1");
		        c2.setId("2");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        
		        // test "IS_PARENT":
		        result.get(0).clear();
		        result.get(0).add(rule);
		        result.get(1).clear();
		        result.get(1).add(baseCondition);
		        baseCondition.setSource("number_1");
		        baseCondition.setTarget("number_2");
		        baseCondition.setType(BaseConditionType.MODEL_PARENT_OF);
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        baseCondition.setSource("number_2");
		        baseCondition.setTarget("number_1");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        
		        // test "MODEL_EQUALS":
		        baseCondition.setType(BaseConditionType.MODEL_EQUALS);
		        baseCondition.setSource("e1::Source");
		        baseCondition.setTarget("e2");
		        
		        e1.setAlias("e1");
		        e2.setAlias("e2");
		        e1.setType("TraceLink");
		        e2.setType("Actor");
		        
		        TraceLink link  = LinkModelFactory.eINSTANCE.createTraceLink();
		        Actor     actor = URNModelFactory.eINSTANCE.createActor();
		        
		        accessLayer.addElement(project, link);
		        accessLayer.addElement(project, actor);
		              
		        link.setSource(actor);
		        
		        result.get(0).clear();
		        result.get(1).clear();
		        result.get(0).add(link);
		        result.get(1).add(actor);
		                
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        assertTrue(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        
		        baseCondition.setSource("e1::Target");
		        assertFalse(conditionProcessor.executeBaseCondition(rule, result, baseCondition, tuples));
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testExecuteLogicCondition()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		                
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		               
		        result.add(new ArrayList<EObject>());
		        result.get(0).add(c1);
		        result.add(new ArrayList<EObject>());
		        result.get(1).add(c2);
		                
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e2);
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        
		        e1.setAlias("number_1");
		        e2.setAlias("number_2");
		        
		        BaseCondition baseCondition1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        BaseCondition baseCondition2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, baseCondition1);
		        accessLayer.addElement(project, baseCondition2);
		        accessLayer.addElement(project, logicCondition);
		        
		        rule.setConditions(logicCondition);
		        logicCondition.getBaseConditions().add(baseCondition1);
		        logicCondition.getBaseConditions().add(baseCondition2);
		        baseCondition1.setSource("number_1::Id");
		        baseCondition1.setTarget("number_2::Id");
		        baseCondition1.setType(BaseConditionType.VALUE_EQUALS);
		        baseCondition2.setSource("number_1::name");
		        baseCondition2.setTarget("number_2::name");
		        baseCondition2.setType(BaseConditionType.VALUE_EQUALS);
		        
		        List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		        tuples.add(new ArrayList<EObject[]>());
		        tuples.add(new ArrayList<EObject[]>());
		        
		        // test "AND":
		        c1.setId("creator");
		        c2.setId("creator");
		        c1.setName("name");
		        c2.setName("name");
		        logicCondition.setType(LogicConditionType.AND);
		        assertTrue(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        c1.setId("creator__");
		        assertFalse(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "OR":
		        logicCondition.setType(LogicConditionType.OR);
		        assertTrue(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        c2.setName("name___");
		        assertFalse(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "XOR":
		        c1.setId("creator");
		        logicCondition.setType(LogicConditionType.XOR);
		        assertTrue(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        c1.setId("creator");
		        c2.setId("creator");
		        c1.setName("name");
		        c2.setName("name");
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        assertFalse(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        
		        // test "NOT":
		        c1.setId("creator__");
		        logicCondition.setType(LogicConditionType.NOT);
		        logicCondition.getBaseConditions().remove(baseCondition2);
		        assertEquals(2, result.size());
		        assertTrue(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
		        result.get(0).clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c2);
		        c1.setId("creator");
		        assertFalse(conditionProcessor.executeLogicCondition(rule, result, rule.getConditions(), tuples));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testExecuteCompareConditionListOfQueryElementStringListOfQueryElementStringBaseConditionType()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule rule1 = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule1);
		        Rule rule2 = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule2);               
		        List<EObject> l1 = new ArrayList<EObject>();
		        l1.add(rule1);
		        List<EObject> l2 = new ArrayList<EObject>();
		        l2.add(rule2);
		        
		        rule1.setRuleID("test");
		        rule2.setRuleID("test");
		        
		        List<List<EObject>> results = new ArrayList<List<EObject>>();
		        results.add(l1);
		        results.add(l2);
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        // test "EQUALS":
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_EQUALS, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule1.setRuleID("test__");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_EQUALS, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        
		        // test "STARTS_WITH":
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_STARTS_WITH, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule1.setRuleID("_test");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_STARTS_WITH, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        
		        // test "ENDS_WITH":
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_ENDS_WITH, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule1.setRuleID("test_");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_ENDS_WITH, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        
		        // test "CONTAINS":
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_CONTAINS, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule1.setRuleID("tes");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_CONTAINS, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        
		        // test "LESSER_THAN":
		        rule1.setRuleID("1");
		        rule2.setRuleID("2");
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule1.setRuleID("2");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        rule1.setRuleID("no_number"); // test if the input ain't a number
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        
		        // test "GREATER_THAN":
		        rule1.setRuleID("2");
		        rule2.setRuleID("1");
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(1, l1.size());
		        assertEquals(1, l2.size());
		        rule2.setRuleID("2");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", l2, "RuleID", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
		        l1.add(rule1);
		        l2.add(rule2);
		        rule1.setRuleID("no_number"); // test if the input ain't a number
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "creator", l2, "creator", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(0, l1.size());
		        assertEquals(0, l2.size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testExecuteCompareConditionListOfQueryElementStringStringBaseConditionType()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		               
		        List<EObject> l1 = new ArrayList<EObject>();
		        l1.add(rule);
		        rule.setRuleID("TestRule");
		        
		        List<List<EObject>> results = new ArrayList<List<EObject>>();
		        results.add(l1);
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        // test "EQUALS": 
		        assertEquals(1, l1.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "TestRule", BaseConditionType.VALUE_EQUALS, tuples));
		        assertEquals(1, l1.size());
		        rule.setRuleID("TestRule___");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "TestRule", BaseConditionType.VALUE_EQUALS, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        rule.setRuleID("TestRule");
		        
		        // test "STARTS_WITH"
		        assertEquals(1, l1.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "Test", BaseConditionType.VALUE_STARTS_WITH, tuples));
		        assertEquals(1, l1.size());
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "Rule", BaseConditionType.VALUE_STARTS_WITH, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        
		        // test "ENDS_WITH"
		        assertEquals(1, l1.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "Rule", BaseConditionType.VALUE_ENDS_WITH, tuples));
		        assertEquals(1, l1.size());
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "Test", BaseConditionType.VALUE_ENDS_WITH, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        
		        // test "CONTAINS"
		        assertEquals(1, l1.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "TestRule", BaseConditionType.VALUE_CONTAINS, tuples));
		        assertEquals(1, l1.size());
		        rule.setRuleID("TestRul");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "TestRule", BaseConditionType.VALUE_CONTAINS, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        
		        // test "LESSER_THAN":
		        assertEquals(1, l1.size());
		        rule.setRuleID("1");
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "2", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(1, l1.size());
		        rule.setRuleID("2");
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "2", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        rule.setRuleID("no_number"); // test if the input ain't a number
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "2", BaseConditionType.VALUE_LESSER_THAN, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        
		        // test "GREATER_THAN":
		        rule.setRuleID("2");
		        assertEquals(1, l1.size());
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "1", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(1, l1.size());
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "2", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(0, l1.size());
		        l1.add(rule);
		        rule.setRuleID("no_number"); // test if the input ain't a number
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "RuleID", "2", BaseConditionType.VALUE_GREATER_THAN, tuples));
		        assertEquals(0, l1.size());
		        
		        // test "NOT_NULL":
		        l1.add(rule);
		        assertTrue(conditionProcessor.executeCompareCondition(l1, "RuleID", "", BaseConditionType.VALUE_NOT_NULL, tuples));
		        assertFalse(conditionProcessor.executeCompareCondition(l1, "Description", "", BaseConditionType.VALUE_NOT_NULL, tuples));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testIsParent()
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
		        
		        rule.getElements().add(e1);
		        
		        List<EObject> l1 = new ArrayList<EObject>();
		        List<EObject> l2 = new ArrayList<EObject>();
		        l1.add(rule);
		        l2.add(e1);
		        
		        List<List<EObject>> results = new ArrayList<List<EObject>>();
		        results.add(l1);
		        results.add(l2);
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        assertTrue(conditionProcessor.isParent(l1, l2, false, tuples));
		        assertFalse(conditionProcessor.isParent(l2, l1, false, tuples));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testRun()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		               
		        result.add(new ArrayList<EObject>());
		        result.get(0).add(c1);
		        result.add(new ArrayList<EObject>());
		        result.get(1).add(c2);
		                
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e2);
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        
		        e1.setAlias("number_1");
		        e2.setAlias("number_2");
		        
		        BaseCondition baseCondition1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        BaseCondition baseCondition2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, baseCondition1);
		        accessLayer.addElement(project, baseCondition2);
		        accessLayer.addElement(project, logicCondition);
		        
		        rule.setConditions(logicCondition);
		        logicCondition.getBaseConditions().add(baseCondition1);
		        logicCondition.getBaseConditions().add(baseCondition2);
		        baseCondition1.setSource("number_1::Id");
		        baseCondition1.setTarget("number_2::Id");
		        baseCondition1.setType(BaseConditionType.VALUE_EQUALS);
		        baseCondition2.setSource("number_1::name");
		        baseCondition2.setTarget("number_2::name");
		        baseCondition2.setType(BaseConditionType.VALUE_EQUALS);
		        
		        c1.setId("1");
		        c2.setId("1");
		        c1.setName("name");
		        c2.setName("name");
		        logicCondition.setType(LogicConditionType.AND);
		        
		        List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		        tuples.add(new ArrayList<EObject[]>());
		        tuples.add(new ArrayList<EObject[]>());
		        
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        conditionProcessor.run(project, rule, result, tuples);
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        assertEquals(2, tuples.size());
		        assertEquals(1, tuples.get(0).size());
		        assertEquals(1, tuples.get(1).size());
		        
		        c1.setName("name___");
		        conditionProcessor.run(project, rule, result, tuples);
		        assertEquals(0, result.size());
		        assertEquals(0, tuples.size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testIsModelEqual()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = c1;
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		               
		        result.add(new ArrayList<EObject>());
		        result.get(0).add(c1);
		        result.add(new ArrayList<EObject>());
		        result.get(1).add(c2);    	
		
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        assertFalse(conditionProcessor.isModelEqual(result.get(0), result.get(1), null, null, tuples));
		        assertEquals(0, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
		        
		        tuples.clear();
		        result.get(0).add(c1);
		        result.get(1).clear();
		        result.get(1).add(c3);
		        assertTrue(conditionProcessor.isModelEqual(result.get(0), result.get(1), null, null, tuples));
		        assertEquals(1, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testAreRelated()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        accessLayer.addElement(project, c3);
		        
		        TraceLink l1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, l1);
		        		        
		        LinkType t1 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, t1);
		        
		        t1.setName("Refines");
		        
		        l1.setType(t1);
		        l1.setSource(c1);
		        l1.setTarget(c2);
		               
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c3);    	
		
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        conditionProcessor.run(project, null, null, null);
		        
		        assertFalse(conditionProcessor.areRelated(result.get(0), result.get(1), "Refines", tuples, true));
		        assertEquals(0, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c2);
		        
		        assertFalse(conditionProcessor.areRelated(result.get(0), result.get(1), "Implements", tuples, true));
		        assertEquals(0, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c2);
		        
		        assertTrue(conditionProcessor.areRelated(result.get(0), result.get(1), "Refines", tuples, true));
		        assertEquals(1, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testAreIndirectlyRelated()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        accessLayer.addElement(project, c3);
		        accessLayer.addElement(project, c4);
		        
		        TraceLink l1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, l1);
		        
		        TraceLink l2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, l2);
		        
		        TraceLink l3 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, l3);
		        
		        LinkType t1 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, t1);
		        
		        t1.setName("Refines");
		        
		        l1.setType(t1);
		        l1.setSource(c1);
		        l1.setTarget(c2);
		        
		        l2.setType(t1);
		        l2.setSource(c2);
		        l2.setTarget(c3);
		        
		        l3.setType(t1);
		        l3.setSource(c3);
		        l3.setTarget(c4);
		               
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c3);    	
		
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        conditionProcessor.run(project, null, null, null);
		        
		        // test c1 -> c2 -> c3
		        assertTrue(conditionProcessor.areIndirectlyRelated(result.get(0), result.get(1), "Refines", tuples));
		        assertEquals(1, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        
		        result.get(1).add(c2);
		        
		        // test c1 -> c2
		        assertTrue(conditionProcessor.areIndirectlyRelated(result.get(0), result.get(1), "Refines", tuples));
		        assertEquals(2, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(2, result.get(1).size());
		        
		        result.get(1).add(c4);
		        
		        // test c1 -> c2 -> c3 -> c4
		        assertTrue(conditionProcessor.areIndirectlyRelated(result.get(0), result.get(1), "Refines", tuples));
		        assertEquals(3, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(3, result.get(1).size());
		        
		        assertFalse(conditionProcessor.areIndirectlyRelated(result.get(0), result.get(1), "Implements", tuples));
		        assertEquals(0, tuples.size());
		        assertEquals(2, result.size());
		        assertEquals(0, result.get(0).size());
		        assertEquals(0, result.get(1).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
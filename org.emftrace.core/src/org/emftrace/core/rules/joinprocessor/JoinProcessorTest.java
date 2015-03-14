/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.joinprocessor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class JoinProcessorTest extends EMFTraceBaseTest
{
	protected JoinProcessor joinProcessor;
	    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        joinProcessor = EMFTraceCoreFactory.createJoinProcessor();
        joinProcessor.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testCloneTuple()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	EObject[] tuple = new EObject[4];
		    	tuple[0] = c1;
		    	tuple[1] = c2;
		    	tuple[2] = c3;
		    	tuple[3] = c4;
		    	
		    	EObject[] clone = null;
		    	
		    	clone = joinProcessor.cloneTuple(tuple);
		    	
		    	assertEquals(clone[0], tuple[0]);
		    	assertEquals(clone[1], tuple[1]);
		    	assertEquals(clone[2], tuple[2]);
		    	assertEquals(clone[3], tuple[3]);
		    	
		    	tuple[2] = null;
		    	
		    	assertNotNull(clone[2]);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCountOccurrences()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<EObject[]> tuples = new ArrayList<EObject[]>();
		    	
		    	tuples.add(new EObject[2]);
		    	tuples.get(0)[0] = c1;
		    	tuples.get(0)[1] = c2;
		    	
		    	tuples.add(new EObject[2]);
		    	tuples.get(1)[0] = c1;
		    	tuples.get(1)[1] = c3;
		    	
		    	tuples.add(new EObject[2]);
		    	tuples.get(2)[0] = c1;
		    	tuples.get(2)[1] = c4;
		    	
		    	List<Integer> pos = new ArrayList<Integer>();
		    	
		    	assertTrue(pos.isEmpty());
		    	assertEquals(3, joinProcessor.countOccurrences(tuples, 0, c1, pos));
		    	assertEquals(3, pos.size());
		    	assertEquals((int)pos.get(0), 0);
		    	assertEquals((int)pos.get(1), 1);
		    	assertEquals((int)pos.get(2), 2);
		    	
		    	pos.clear();
		    	
		    	assertTrue(pos.isEmpty());
		    	assertEquals(0, joinProcessor.countOccurrences(tuples, 1, c1, pos));
		    	assertTrue(pos.isEmpty());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testGetFinalTuples()
    {
    	assertNotNull(joinProcessor.getFinalTuples());
    	assertTrue(joinProcessor.getFinalTuples().isEmpty());
    }
    
    @Test
    public void testJoinAND()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		
		    	/*
		    	 * create the following rule:
		    	 * 
		    	 * <AND>
		    	 *  bc1
		    	 *  bc2
		    	 *  bc3
		    	 * </AND>
		    	 */
		    	LogicCondition lc = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc3 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	rule.setConditions(lc);
		    	lc.getBaseConditions().add(bc1);
		    	lc.getBaseConditions().add(bc2);
		    	lc.getBaseConditions().add(bc3);
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	conditions.add(bc3);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	
		    	// set all the attributes:
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	
		    	lc.setType(LogicConditionType.AND);
		    	bc1.setSource("e1");
		    	bc2.setSource("e1");
		    	bc3.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setTarget("e2");
		    	bc3.setTarget("e2");
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c7 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c8 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<EObject[]>       results = new ArrayList<EObject[]>();
		    	List<List<EObject[]>> tuples  = new ArrayList<List<EObject[]>>();
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).get(0)[0] = c1;
		    	tuples.get(0).get(0)[1] = c2;
		    	tuples.get(0).get(1)[0] = c3;
		    	tuples.get(0).get(1)[1] = c4;
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(1).add(new EObject[2]);
		    	tuples.get(1).add(new EObject[2]);
		    	tuples.get(1).get(0)[0] = c1;
		    	tuples.get(1).get(0)[1] = c2;
		    	tuples.get(1).get(1)[0] = c5;
		    	tuples.get(1).get(1)[1] = c6;
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(2).add(new EObject[2]);
		    	tuples.get(2).add(new EObject[2]);
		    	tuples.get(2).get(0)[0] = c1;
		    	tuples.get(2).get(0)[1] = c2;
		    	tuples.get(2).get(1)[0] = c7;
		    	tuples.get(2).get(1)[1] = c8;
		    	
		    	assertTrue(results.isEmpty());
		    	joinProcessor.joinAND(rule, lc, conditions, tuples, results);
		    	assertEquals(1, results.size());
		    	assertEquals(results.get(0)[0], c1);
		    	assertEquals(results.get(0)[1], c2);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testJoinFirstTupleList()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	
		    	// set all the attributes:
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	
		    	List<EObject[]> finalTuples   = new ArrayList<EObject[]>();
		    	List<EObject[]> currentTuples = new ArrayList<EObject[]>();
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	   	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");    	
		    	bc2.setTarget("e3");
		    	
		    	currentTuples.add(new EObject[2]);
		    	currentTuples.get(0)[0] = c1;
		    	currentTuples.get(0)[1] = c2;
		    	
		    	assertTrue(finalTuples.isEmpty());
		    	joinProcessor.joinFirstTupleList(finalTuples, currentTuples, conditions, 0, rule);
		    	assertEquals(1, finalTuples.size());
		    	assertEquals(finalTuples.get(0)[0], c1);
		    	assertEquals(finalTuples.get(0)[1], c2);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testJoinLogicCondition()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	/*
		    	 * create the following scenario:
		    	 * 
		    	 * <AND>
		    	 * 	 BC1 e1, e2
		    	 *   BC2 e2, e3
		    	 * 	 <OR>
		    	 * 	   BC3 e3
		    	 * 	   BC4 e3
		    	 *   </OR>
		    	 * </AND>
		    	 */
		    	
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	LogicCondition lc1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	LogicCondition lc2 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc3 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc4 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	conditions.add(bc3);
		    	conditions.add(bc4);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	rule.getElements().add(e3);
		    	
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	e3.setAlias("e3");
		    	
		    	rule.setConditions(lc1);
		    	
		    	lc1.setType(LogicConditionType.AND);
		    	lc2.setType(LogicConditionType.OR);
		    	
		    	lc1.getBaseConditions().add(bc1);
		    	lc1.getBaseConditions().add(bc2);
		    	lc2.getBaseConditions().add(bc3);
		    	lc2.getBaseConditions().add(bc4);
		    	
		    	lc1.getLogicConditions().add(lc2);
		    	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");
		    	bc2.setTarget("e3");
		    	bc3.setSource("e3");
		    	bc4.setSource("e3");
		    	
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	tuples.add(new ArrayList<EObject[]>()); // bc1
		    	tuples.add(new ArrayList<EObject[]>()); // bc2
		    	tuples.add(new ArrayList<EObject[]>()); // bc3
		    	tuples.add(new ArrayList<EObject[]>()); // bc4
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c7 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c8 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	tuples.get(0).add(new EObject[2]); // bc1 tuple 1
		    	tuples.get(0).get(0)[0] = c1;
		    	tuples.get(0).get(0)[1] = c2;
		    	tuples.get(0).add(new EObject[2]); // bc1 tuple 2
		    	tuples.get(0).get(1)[0] = c1;
		    	tuples.get(0).get(1)[1] = c3;    	
		    	
		    	tuples.get(1).add(new EObject[2]); // bc2 tuple 1
		    	tuples.get(1).get(0)[0] = c2;
		    	tuples.get(1).get(0)[1] = c4;
		    	tuples.get(1).add(new EObject[2]); // bc2 tuple 2
		    	tuples.get(1).get(1)[0] = c2;
		    	tuples.get(1).get(1)[1] = c5;  	
		    	
		    	tuples.get(2).add(new EObject[1]);  // bc3 tuple 1
		       	tuples.get(2).get(0)[0] = c4;
		       	tuples.get(2).add(new EObject[1]);  // bc3 tuple 2
		    	tuples.get(2).get(1)[0] = c6;
		    	
		    	tuples.get(3).add(new EObject[1]);  // bc4 tuple 1
		       	tuples.get(3).get(0)[0] = c7;
		       	tuples.get(3).add(new EObject[1]);  // bc4 tuple 2
		    	tuples.get(3).get(1)[0] = c8;
		    	    	
		    	assertTrue(joinProcessor.getFinalTuples().isEmpty());
		    	joinProcessor.joinLogicCondition(rule, lc1, conditions, tuples, joinProcessor.getFinalTuples());
		    	joinProcessor.removeDuplicatedTuples();
		    	joinProcessor.removeUnJoinableTuples();
		    	assertEquals(1, joinProcessor.getFinalTuples().size());
		    	assertEquals(3, joinProcessor.getFinalTuples().get(0).length);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[0], c1);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[1], c2);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[2], c4);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testJoinOneElementTuples()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	
		    	// set all the attributes:
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	
		    	List<EObject[]> finalTuples   = new ArrayList<EObject[]>();
		    	List<EObject[]> currentTuples = new ArrayList<EObject[]>();
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	   	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");
		    	
		    	finalTuples.add(new EObject[2]);
		    	finalTuples.get(0)[0] = c1;
		    	finalTuples.get(0)[1] = c2;
		    	finalTuples.add(new EObject[2]);
		    	finalTuples.get(1)[0] = c3;
		    	finalTuples.get(1)[1] = c4;
		    	
		    	currentTuples.add(new EObject[1]);
		    	currentTuples.get(0)[0] = c2;
		    	
		    	assertEquals(2, finalTuples.size());
		    	joinProcessor.joinOneElementTuples(finalTuples, currentTuples, 1, conditions, rule);
		    	assertEquals(1, finalTuples.size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testJoinOR()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		
		    	/*
		    	 * create the following rule:
		    	 * 
		    	 * <OR>
		    	 *  bc1
		    	 *  bc2
		    	 *  bc3
		    	 * </OR>
		    	 */
		    	LogicCondition lc = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc3 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	rule.setConditions(lc);
		    	lc.getBaseConditions().add(bc1);
		    	lc.getBaseConditions().add(bc2);
		    	lc.getBaseConditions().add(bc3);
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	conditions.add(bc3);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	
		    	// set all the attributes:
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	
		    	lc.setType(LogicConditionType.OR);
		    	bc1.setSource("e1");
		    	bc2.setSource("e1");
		    	bc3.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setTarget("e2");
		    	bc3.setTarget("e2");
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c7 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c8 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<EObject[]>       results = new ArrayList<EObject[]>();
		    	List<List<EObject[]>> tuples  = new ArrayList<List<EObject[]>>();
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).get(0)[0] = c1;
		    	tuples.get(0).get(0)[1] = c2;
		    	tuples.get(0).get(1)[0] = c3;
		    	tuples.get(0).get(1)[1] = c4;
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(1).add(new EObject[2]);
		    	tuples.get(1).add(new EObject[2]);
		    	tuples.get(1).get(0)[0] = c1;
		    	tuples.get(1).get(0)[1] = c2;
		    	tuples.get(1).get(1)[0] = c5;
		    	tuples.get(1).get(1)[1] = c6;
		    	
		    	tuples.add(new ArrayList<EObject[]>());
		    	tuples.get(2).add(new EObject[2]);
		    	tuples.get(2).add(new EObject[2]);
		    	tuples.get(2).get(0)[0] = c1;
		    	tuples.get(2).get(0)[1] = c2;
		    	tuples.get(2).get(1)[0] = c7;
		    	tuples.get(2).get(1)[1] = c8;
		    	
		    	assertTrue(results.isEmpty());
		    	joinProcessor.joinOR(rule, lc, conditions, tuples, results);
		    	joinProcessor.getFinalTuples().addAll(results);
		    	joinProcessor.removeUnJoinableTuples();
		    	joinProcessor.removeDuplicatedTuples();
		    	assertEquals(4, joinProcessor.getFinalTuples().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testJoinTwoElementTuples()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	rule.getElements().add(e3);
		    	
		    	// set all the attributes:
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	e3.setAlias("e3");
		    	
		    	List<EObject[]> finalTuples   = new ArrayList<EObject[]>();
		    	List<EObject[]> currentTuples = new ArrayList<EObject[]>();
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	// test the case that the final tuple list is empty:
		    	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");    	
		    	bc2.setTarget("e3");
		    	
		    	currentTuples.add(new EObject[2]);
		    	currentTuples.get(0)[0] = c1;
		    	currentTuples.get(0)[1] = c2;
		    	
		    	assertTrue(finalTuples.isEmpty());
		    	joinProcessor.joinFirstTupleList(finalTuples, currentTuples, conditions, 0, rule);
		    	joinProcessor.joinTwoElementTuples(finalTuples, currentTuples, 0, conditions, rule);
		    	assertEquals(1, finalTuples.size());
		    	assertEquals(finalTuples.get(0)[0], c1);
		    	assertEquals(finalTuples.get(0)[1], c2);
		    	assertEquals(finalTuples.get(0)[2], null);
		    	    	
		    	// test the case that both conditions cover the same elements:
		    	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e1");
		    	bc2.setTarget("e2");
		    	
		    	currentTuples.add(new EObject[2]);
		    	currentTuples.get(1)[0] = c1;
		    	currentTuples.get(1)[1] = c2;
		    	
		    	assertEquals(1, finalTuples.size());
		    	joinProcessor.joinTwoElementTuples(finalTuples, currentTuples, 1, conditions, rule);
		    	assertEquals(1, finalTuples.size());
		    	
		    	currentTuples.get(1)[0] = c1;
		    	currentTuples.get(1)[1] = c3;
		    	
		    	joinProcessor.joinTwoElementTuples(finalTuples, currentTuples, 1, conditions, rule);
		    	assertEquals(1, finalTuples.size());
		    	    	
		    	// test the case that both conditions are transitively related:
		    	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");
		    	bc2.setTarget("e3");
		    	
		    	finalTuples.clear();
		    	finalTuples.add(new EObject[3]);
		    	finalTuples.get(0)[0] = c1;
		    	finalTuples.get(0)[1] = c2;
		    	finalTuples.get(0)[2] = null;
		
		    	currentTuples.get(1)[0] = c2;
		    	currentTuples.get(1)[1] = c3;
		    	
		    	assertEquals(1, finalTuples.size());
		    	assertNull(finalTuples.get(0)[2]);
		    	joinProcessor.joinTwoElementTuples(finalTuples, currentTuples, 1, conditions, rule);
		    	assertEquals(1, finalTuples.size());
		    	assertEquals(finalTuples.get(0)[2], c3);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testRemoveOutdatedTuples()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	
		    	BaseCondition condition = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(condition);
		    	
		    	condition.setSource("e1");
		    	condition.setTarget("e2");
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<List<EObject>> results = new ArrayList<List<EObject>>();
		    	results.add(new ArrayList<EObject>());
		    	results.add(new ArrayList<EObject>());
		    	
		    	results.get(0).add(c1);
		    	results.get(1).add(c2);
		    	results.get(0).add(c3);
		    	
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	tuples.add(new ArrayList<EObject[]>());
		    	
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).get(0)[0] = c1;
		    	tuples.get(0).get(0)[1] = c2;
		    	
		    	tuples.get(0).add(new EObject[2]);
		    	tuples.get(0).get(1)[0] = c3;
		    	tuples.get(0).get(1)[1] = c4;
		    	
		    	assertEquals(2, tuples.get(0).size());
		    	joinProcessor.removeOutdatedTuples(rule, conditions, results, tuples);
		    	assertEquals(1, tuples.get(0).size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testRemoveUnjoinableTuples()
    {  
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<EObject[]> tuples = new ArrayList<EObject[]>();
		    	
		    	tuples.add(new EObject[2]);
		    	tuples.add(new EObject[2]);
		    	tuples.add(new EObject[2]);
		    	tuples.add(new EObject[2]);
		    	
		    	tuples.get(0)[0] = null;
		    	tuples.get(0)[1] = null;
		    	
		    	tuples.get(1)[0] = c1;
		    	tuples.get(1)[1] = null;
		    	
		    	tuples.get(2)[0] = null;
		    	tuples.get(2)[1] = c1;
		    	
		    	tuples.get(3)[0] = c1;
		    	tuples.get(3)[1] = c2;
		    	
		    	joinProcessor.getFinalTuples().addAll(tuples);
		    	
		    	assertEquals(4, joinProcessor.getFinalTuples().size());
		    	joinProcessor.removeUnJoinableTuples();
		    	assertEquals(1, joinProcessor.getFinalTuples().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testCleanTupleList()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	List<EObject[]> joinedTuples = new ArrayList<EObject[]>();
		    	List<EObject[]> tupleList    = new ArrayList<EObject[]>();
		
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c7 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	joinedTuples.add(new EObject[3]);
		    	joinedTuples.get(0)[0] = c1;
		    	joinedTuples.get(0)[1] = c2;
		    	joinedTuples.get(0)[2] = null;
		    	joinedTuples.add(new EObject[3]);
		    	joinedTuples.get(1)[0] = c3;
		    	joinedTuples.get(1)[1] = c4;
		    	joinedTuples.get(1)[2] = null;
		    	
		    	tupleList.add(new EObject[2]);
		    	tupleList.get(0)[0] = c2;
		    	tupleList.get(0)[1] = c5;
		    	tupleList.add(new EObject[2]);
		    	tupleList.get(1)[0] = c6;
		    	tupleList.get(1)[1] = c7;
		    	
		    	assertEquals(2, joinedTuples.size());
		    	assertEquals(2, tupleList.size());
		    	joinProcessor.cleanTupleList(joinedTuples, tupleList, 1, 2, 0);
		    	assertEquals(1, joinedTuples.size());
		    	assertEquals(1, tupleList.size());
		    	assertEquals(joinedTuples.get(0)[0], c1);
		    	assertEquals(joinedTuples.get(0)[1], c2);
		    	assertEquals(joinedTuples.get(0)[2], null);
		    	assertEquals(tupleList.get(0)[0], c2);
		    	assertEquals(tupleList.get(0)[1], c5);
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
		    	/*
		    	 * create the following scenario:
		    	 * 
		    	 * <AND>
		    	 * 	 BC1 e1, e2
		    	 *   BC2 e2, e3
		    	 * 	 <OR>
		    	 * 	   BC3 e3
		    	 * 	   BC4 e3
		    	 *   </OR>
		    	 * </AND>
		    	 */
		    	
		    	Rule rule = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	LogicCondition lc1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	LogicCondition lc2 = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc3 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition bc4 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	List<BaseCondition> conditions = new ArrayList<BaseCondition>();
		    	conditions.add(bc1);
		    	conditions.add(bc2);
		    	conditions.add(bc3);
		    	conditions.add(bc4);
		    	
		    	ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition e3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	ActionDefinition a = RuleModelFactory.eINSTANCE.createActionDefinition();
		    	a.setActionType(ActionType.CREATE_LINK);
		    	
		    	rule.getElements().add(e1);
		    	rule.getElements().add(e2);
		    	rule.getElements().add(e3);
		    	
		    	rule.getActions().add(a);
		    	
		    	e1.setAlias("e1");
		    	e2.setAlias("e2");
		    	e3.setAlias("e3");
		    	
		    	rule.setConditions(lc1);
		    	
		    	lc1.setType(LogicConditionType.AND);
		    	lc2.setType(LogicConditionType.OR);
		    	
		    	lc1.getBaseConditions().add(bc1);
		    	lc1.getBaseConditions().add(bc2);
		    	lc2.getBaseConditions().add(bc3);
		    	lc2.getBaseConditions().add(bc4);
		    	
		    	lc1.getLogicConditions().add(lc2);
		    	
		    	bc1.setSource("e1");
		    	bc1.setTarget("e2");
		    	bc2.setSource("e2");
		    	bc2.setTarget("e3");
		    	bc3.setSource("e3");
		    	bc4.setSource("e3");
		    	
		    	List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		    	tuples.add(new ArrayList<EObject[]>()); // bc1
		    	tuples.add(new ArrayList<EObject[]>()); // bc2
		    	tuples.add(new ArrayList<EObject[]>()); // bc3
		    	tuples.add(new ArrayList<EObject[]>()); // bc4
		    	
		    	Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c7 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern c8 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	List<List<EObject>> results = new ArrayList<List<EObject>>();
		    	results.add(new ArrayList<EObject>()); // e1
		    	results.add(new ArrayList<EObject>()); // e2
		    	results.add(new ArrayList<EObject>()); // e3
		    	
		    	results.get(0).add(c1);
		    	results.get(1).add(c2);
		    	results.get(1).add(c3);
		    	results.get(2).add(c4);
		    	results.get(2).add(c5);
		    	results.get(2).add(c6);
		    	results.get(2).add(c7);
		    	results.get(2).add(c8);
		    	
		    	tuples.get(0).add(new EObject[2]); // bc1 tuple 1
		    	tuples.get(0).get(0)[0] = c1;
		    	tuples.get(0).get(0)[1] = c2;
		    	tuples.get(0).add(new EObject[2]); // bc1 tuple 2
		    	tuples.get(0).get(1)[0] = c1;
		    	tuples.get(0).get(1)[1] = c3;    	
		    	
		    	tuples.get(1).add(new EObject[2]); // bc2 tuple 1
		    	tuples.get(1).get(0)[0] = c2;
		    	tuples.get(1).get(0)[1] = c4;
		    	tuples.get(1).add(new EObject[2]); // bc2 tuple 2
		    	tuples.get(1).get(1)[0] = c2;
		    	tuples.get(1).get(1)[1] = c5;  	
		    	
		    	tuples.get(2).add(new EObject[1]);  // bc3 tuple 1
		       	tuples.get(2).get(0)[0] = c4;
		       	tuples.get(2).add(new EObject[1]);  // bc3 tuple 2
		    	tuples.get(2).get(1)[0] = c6;
		    	
		    	tuples.get(3).add(new EObject[1]);  // bc4 tuple 1
		       	tuples.get(3).get(0)[0] = c7;
		       	tuples.get(3).add(new EObject[1]);  // bc4 tuple 2
		    	tuples.get(3).get(1)[0] = c8;
		    	    	
		    	assertTrue(joinProcessor.getFinalTuples().isEmpty());
		    	joinProcessor.run(project, rule, results, tuples);
		    	assertEquals(1, joinProcessor.getFinalTuples().size());
		    	assertEquals(3, joinProcessor.getFinalTuples().get(0).length);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[0], c1);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[1], c2);
		    	assertEquals(joinProcessor.getFinalTuples().get(0)[2], c4);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
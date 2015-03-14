/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.resultprocessor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.joinprocessor.JoinProcessor;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;
import org.emftrace.metamodel.ChangeModel.AtomicChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ResultProcessorTest extends EMFTraceBaseTest
{
    protected LinkManager linkManager;
    protected ReportManager reportManager;
    protected ResultProcessor resultProcessor;
    protected JoinProcessor joinProcessor;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
      
        linkManager = EMFTraceCoreFactory.createLinkManager();
        linkManager.registerAccessLayer(accessLayer);
        reportManager = EMFTraceCoreFactory.createReportManager();
        reportManager.registerAccessLayer(accessLayer);
        resultProcessor = EMFTraceCoreFactory.createResultProcessor();
        resultProcessor.registerAccessLayer(accessLayer);
        resultProcessor.registerLinkManager(linkManager);
        resultProcessor.registerReportManager(reportManager);
        joinProcessor = EMFTraceCoreFactory.createJoinProcessor();
        joinProcessor.registerAccessLayer(accessLayer);
        resultProcessor.registerJoinProcessor(joinProcessor);
    }
    
    @Test
    public void testProcessCreateLinkResult()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	project.getContents().clear();
		    	
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c2);
		        
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ActionDefinition action = RuleModelFactory.eINSTANCE.createActionDefinition();
		        accessLayer.addElement(project, action);
		        
		        rule.getActions().add(action);        
		        
		        action.setSourceElement("e1");
		        action.setTargetElement("e2");
		        action.setResultType("Test");
		        action.setActionType(ActionType.CREATE_LINK);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        accessLayer.addElement(project, e2);
		        e1.setAlias("e1");
		        e2.setAlias("e2");
		        e1.setType("Concern");
		        e2.setType("Concern");
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        rule.setRuleID("TestRule");
		        
		        LinkType type = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, type);
		        type.setName("Test_");
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        tuples.add(new EObject[2]);
		        tuples.get(0)[0] = c1;
		        tuples.get(0)[1] = c2;
		        
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.processCreateLinkResult(project, rule, result, tuples, 0);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        
		        type.setName("Test");
		        
		        resultProcessor.processCreateLinkResult(project, rule, result, tuples, 0);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.processCreateLinkResult(project, rule, result, tuples, 0);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        
		        type.setName("Test_"); 
		        
		        resultProcessor.processCreateLinkResult(project, rule, result, tuples, 0);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testProcessReportImpactResult()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        AtomicChangeType type = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		        accessLayer.addElement(project, type);
		        
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c2);
		        result.get(2).add(type);
		        
		        List<EObject[]> tuples = new ArrayList<EObject[]>();
		        
		        tuples.add(new EObject[3]);
		        tuples.get(0)[0] = c1;
		        tuples.get(0)[1] = c2;
		        tuples.get(0)[2] = type;
		
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        ActionDefinition action = RuleModelFactory.eINSTANCE.createActionDefinition();
		        accessLayer.addElement(project, action);
		        
		        rule.getActions().add(action);        
		        
		        action.setSourceElement("e1");
		        action.setImpactedElement("e2");
		        action.setResultType("Test");
		        action.setActionType(ActionType.REPORT_IMPACT);
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        ElementDefinition e3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        accessLayer.addElement(project, e2);
		        accessLayer.addElement(project, e3);
		        e1.setAlias("e1");
		        e2.setAlias("e2");
		        e3.setAlias("e3");
		        e1.setType("Concern");
		        e2.setType("Concern");
		        e3.setType("AtomicChangeType");
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        rule.getElements().add(e3);
		        rule.setRuleID("TestRule");
		        
		        type.setName("Test"); 
		                
		        assertEquals(0, resultProcessor.getImpactSet().size());
		        resultProcessor.processReportImpactResult(project, rule, result, tuples, 0);
		        assertEquals(1, resultProcessor.getImpactSet().size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testProcessReportViolationResult()
    {
    	// TODO    	
    }
    
    @Test
    public void testRun()
    {     
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        List<List<EObject>> result = new ArrayList<List<EObject>>();
		        result.add(new ArrayList<EObject>());
		        result.add(new ArrayList<EObject>());
		        
		        result.get(0).add(c1);
		        result.get(1).add(c2);
		        
		        List<List<EObject[]>> tuples = new ArrayList<List<EObject[]>>();
		        
		        tuples.add(new ArrayList<EObject[]>());
		        tuples.get(0).add(new EObject[2]);
		        tuples.get(0).get(0)[0] = c1;
		        tuples.get(0).get(0)[1] = c2;
		
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        LogicCondition cnd1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, cnd1);
		        BaseCondition cnd2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, cnd2);
		          
		        rule.setConditions(cnd1);
		        cnd1.getBaseConditions().add(cnd2);
		        cnd2.setSource("Test");
		        cnd2.setTarget("Test");
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        accessLayer.addElement(project, e2);
		        e1.setAlias("e1");
		        e2.setAlias("e2");
		        e1.setType("Concern");
		        e2.setType("Concern");
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        rule.setRuleID("TestRule");
		        
		        LinkType l1 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, l1);
		        l1.setName("Test");
		        
		        ActionDefinition a1 = RuleModelFactory.eINSTANCE.createActionDefinition();
		        accessLayer.addElement(project, a1);
		        a1.setSourceElement("e1");
		        a1.setTargetElement("e2");
		        a1.setResultType("Test");
		        a1.setActionType(ActionType.CREATE_LINK);
		        
		        BaseCondition baseCondition = RuleModelFactory.eINSTANCE.createBaseCondition();
		        baseCondition.setSource("e1");
		        baseCondition.setTarget("e2");
		                
		        LogicCondition logicCondition = RuleModelFactory.eINSTANCE.createLogicCondition();
		        logicCondition.getBaseConditions().add(baseCondition);
		        
		        rule.setConditions(logicCondition);
		        
		        rule.getActions().add(a1);
		        
		        joinProcessor.run(project, rule, result, tuples);
		        
		        resultProcessor.run(null, rule, result, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(project, null, result, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(project, rule, null, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(null, null, result, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(null, rule, null, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(project, null, null, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        resultProcessor.run(null, null, null, tuples);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        resultProcessor.run(project, rule, result, tuples);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        assertEquals(1, result.get(0).size());
		        assertEquals(1, result.get(1).size());
		        
		        result.get(0).clear();
		        resultProcessor.run(project, rule, result, tuples);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        
		        result.clear();
		        resultProcessor.run(project, rule, result, tuples);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
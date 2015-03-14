/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.ruleengine;

import java.util.concurrent.Callable;

import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class RuleEngineTest extends EMFTraceBaseTest
{
    protected RuleEngine ruleEngine;
    protected LinkManager linkManager;
    protected ReportManager reportManager;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
      
        linkManager = EMFTraceCoreFactory.createLinkManager();
        linkManager.registerAccessLayer(accessLayer);
        reportManager = EMFTraceCoreFactory.createReportManager();
        reportManager.registerAccessLayer(accessLayer);
        ruleEngine = EMFTraceCoreFactory.createRuleEngine();
        ruleEngine.registerAccessLayer(accessLayer);
        ruleEngine.registerLinkManager(linkManager);
        ruleEngine.registerReportManager(reportManager);
    }

    @Test
    public void testApplyRule()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        project.deleteElements(project.getContents());
		    	
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern();
		        Actor   c2 = URNModelFactory.eINSTANCE.createActor();
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        c1.setId("test_user");
		        c2.setId("test_user");
		                
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        LogicCondition cnd1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, cnd1);
		        BaseCondition cnd2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, cnd2);
		          
		        rule.setRuleID("TestRule");
		        rule.setConditions(cnd1);
		        cnd1.getBaseConditions().add(cnd2);
		        cnd2.setSource("e1::Id");
		        cnd2.setTarget("e2::Id");
		        
		        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		        accessLayer.addElement(project, e1);
		        accessLayer.addElement(project, e2);
		        e1.setAlias("e1");
		        e2.setAlias("e2");
		        e1.setType("Concern");
		        e2.setType("Actor");
		        
		        rule.getElements().add(e1);
		        rule.getElements().add(e2);
		        
		        LinkType l1 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, l1);
		        l1.setName("Test");
		        
		        ActionDefinition a1 = RuleModelFactory.eINSTANCE.createActionDefinition();
		        accessLayer.addElement(project, a1);
		        a1.setSourceElement("e1");
		        a1.setTargetElement("e2");
		        a1.setResultType("Test");
		        a1.setActionType(ActionType.CREATE_LINK);
		        
		        rule.getActions().add(a1);
		        
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        ruleEngine.applyRule(null, null, rule);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        ruleEngine.applyRule(project, null, null);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());
		        ruleEngine.applyRule(null, null, null);
		        assertEquals(0, accessLayer.getElements(project, "TraceLink").size());        
		        ruleEngine.applyRule(project, null, rule);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        ruleEngine.applyRule(project, null, rule);
		        assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testApplyNotRule()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	project.getContents().clear();
		    	
		        Concern c1 = URNModelFactory.eINSTANCE.createConcern(); // e1
		        Concern c2 = URNModelFactory.eINSTANCE.createConcern(); // e2
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        c1.setName("42");
		        c2.setName("42");
		        
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        LogicCondition lc1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, lc1);
		        LogicCondition lc2 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, lc2);
		        LogicCondition lc3 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, lc3);
		        BaseCondition bc1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, bc1);
		        BaseCondition bc2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, bc2);
		        BaseCondition bc3 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, bc3);
		        
		        lc2.setType(LogicConditionType.NOT);
		          
		        rule.setRuleID("TestRule");
		        rule.setConditions(lc1);
		        lc1.getBaseConditions().add(bc1);
		        lc1.getLogicConditions().add(lc2);
		        bc1.setSource("e1::name");
		        bc1.setTarget("e2::name");
		        
		        bc2.setSource("e1::name");
		        bc2.setValue("test");
		        
		        bc3.setSource("e1::name");
		        bc3.setValue("test2");
		        
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
		        
		        LinkType l1 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, l1);
		        l1.setName("Test");
		        
		        LinkType l2 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, l2);
		        l2.setName("TestRelation");
		        
		        ActionDefinition a1 = RuleModelFactory.eINSTANCE.createActionDefinition();
		        accessLayer.addElement(project, a1);
		        a1.setSourceElement("e1");
		        a1.setTargetElement("e2");
		        a1.setResultType("Test");
		        a1.setActionType(ActionType.CREATE_LINK);
		        
		        rule.getActions().add(a1);
		        
		        /*
		         * case 1:
		         * 
		         * <and>
		         * 		e1.name = e2.name
		         *      <not>
		         *         e1.name = "test"
		         *      </not>
		         * </and>
		         */
		        
		         lc2.getBaseConditions().add(bc2);
		         
		         assertEquals(0, accessLayer.getElements(project, "TraceLink").size());        
		         ruleEngine.applyRule(project, null, rule);
		         assertEquals(1, accessLayer.getElements(project, "TraceLink").size());
		        
		        /*
		         * case 2:
		         * 
		         * <and>
		         * 		e1.name = e2.name
		         *      <not>
		         *      	<and>
		         *         		e1.name = "test"
		         *              e1.name = "test2"
		         *          </and>
		         *      </not>
		         * </and>
		         */
		        
		         a1.setResultType("TestRelation");
		         lc2.getBaseConditions().clear();
		         lc2.getLogicConditions().add(lc3);
		         lc3.getBaseConditions().add(bc2);
		         lc3.getBaseConditions().add(bc3);
		         
		         assertEquals(1, accessLayer.getElements(project, "TraceLink").size());        
		         ruleEngine.applyRule(project, null, rule);
		         assertEquals(2, accessLayer.getElements(project, "TraceLink").size());
					return null;
				}
			};
			
			RunESCommand.run(call);
    }
}
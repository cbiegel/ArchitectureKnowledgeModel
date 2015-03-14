/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

public class RuleValidatorTest extends EMFTraceBaseTest
{
    protected RuleValidator ruleValidator;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        ruleValidator = EMFTraceCoreFactory.createRuleValidator();
        ruleValidator.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testCheckActionDefinition()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        ActionDefinition actionDef = RuleModelFactory.eINSTANCE.createActionDefinition();
		        actionDef.setActionType(ActionType.CREATE_LINK);
		        List<String> elements = new ArrayList<String>();
		        elements.add("e1");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        actionDef.setSourceElement("e2");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        actionDef.setSourceElement("e1");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        actionDef.setTargetElement("e2");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        elements.add("e2");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        actionDef.setResultType("test");
		        assertFalse(ruleValidator.checkActionDefinition(project, actionDef, elements));
		        LinkType linkType = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, linkType);
		        linkType.setName("test");
		        assertTrue(ruleValidator.checkActionDefinition(project, actionDef, elements));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testCheckBaseCondition()
    {
        List<String> elements = new ArrayList<String>();
        elements.add("e1");
        elements.add("e2");
        
        BaseCondition b1 = RuleModelFactory.eINSTANCE.createBaseCondition();
        
        assertFalse(ruleValidator.checkBaseCondition(b1, elements));
        b1.setSource("e1");
        assertFalse(ruleValidator.checkBaseCondition(b1, elements));
        b1.setTarget("e2");
        assertFalse(ruleValidator.checkBaseCondition(b1, elements));
        b1.setSource("e1::name");
        assertFalse(ruleValidator.checkBaseCondition(b1, elements));
        b1.setTarget("e2::name");
        assertTrue(ruleValidator.checkBaseCondition(b1, elements));
    }

    @Test
    public void testCheckElementDefinition()
    {
        ElementDefinition elemDef = RuleModelFactory.eINSTANCE.createElementDefinition();
        List<String> elements = new ArrayList<String>();
        
        assertFalse(ruleValidator.checkElementDefinition(elemDef, elements));
        elemDef.setAlias("");
        assertFalse(ruleValidator.checkElementDefinition(elemDef, elements));
        assertTrue(elements.isEmpty());
        elemDef.setAlias("e1");
        assertFalse(ruleValidator.checkElementDefinition(elemDef, elements));
        assertTrue(elements.isEmpty());
        elemDef.setType("");
        assertFalse(ruleValidator.checkElementDefinition(elemDef, elements));
        assertTrue(elements.isEmpty());
        elemDef.setType("Concern");
        assertTrue(ruleValidator.checkElementDefinition(elemDef, elements));
        assertFalse(elements.isEmpty());
    }

    @Test
    public void testCheckLogicCondition()
    {
        List<String> elements = new ArrayList<String>();
        elements.add("e1");
        elements.add("e2");
        
        LogicCondition c1 = RuleModelFactory.eINSTANCE.createLogicCondition();
        LogicCondition c2 = RuleModelFactory.eINSTANCE.createLogicCondition();
        BaseCondition b1 = RuleModelFactory.eINSTANCE.createBaseCondition();
        b1.setSource("e1::name");
        b1.setTarget("e2::name");
        b1.setType(BaseConditionType.VALUE_EQUALS);
        
        assertFalse(ruleValidator.checkLogicCondition(c1, elements));
        c1.getLogicConditions().add(c2);
        assertFalse(ruleValidator.checkLogicCondition(c1, elements));
        c2.getBaseConditions().add(b1);
        assertTrue(ruleValidator.checkLogicCondition(c1, elements));
    }

    @Test
    public void testValidateTraceRule()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule rule = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, rule);
		        
		        LogicCondition cnd1 = RuleModelFactory.eINSTANCE.createLogicCondition();
		        accessLayer.addElement(project, cnd1);
		        BaseCondition cnd2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		        accessLayer.addElement(project, cnd2);
		          
		        rule.setConditions(cnd1);
		        cnd1.getBaseConditions().add(cnd2);
		        cnd2.setSource("e1::creator");
		        cnd2.setTarget("e2::creator");
		        
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
		        
		        assertTrue(ruleValidator.validateRule(project, rule));
		        a1.setSourceElement("42");
		        assertFalse(ruleValidator.validateRule(project, rule));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}

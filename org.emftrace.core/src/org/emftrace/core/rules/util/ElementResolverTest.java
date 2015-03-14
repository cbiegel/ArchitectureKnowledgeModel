/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ElementResolverTest extends EMFTraceBaseTest
{      	
    @Test
    public void testGetIndexForElement()
    {
        Rule rule = RuleModelFactory.eINSTANCE.createRule();      
        ElementDefinition e1 = RuleModelFactory.eINSTANCE.createElementDefinition();
        ElementDefinition e2 = RuleModelFactory.eINSTANCE.createElementDefinition();
        
        rule.getElements().add(e1);
        rule.getElements().add(e2);
        
        e1.setAlias("number_1");
        e2.setAlias("number_2");
        
        assertEquals(0, ElementResolver.getIndexForElement(rule, "number_1"));
        assertEquals(1, ElementResolver.getIndexForElement(rule, "number_2"));
    }
    
    @Test
    public void testHasTarget()
    {
    	BaseCondition condition = RuleModelFactory.eINSTANCE.createBaseCondition();
    	
    	condition.setTarget("e1");    	
    	assertTrue(ElementResolver.hasTarget(condition));
    	
    	condition.setTarget("");    	
    	assertFalse(ElementResolver.hasTarget(condition));
    	
    	condition.setTarget(null);    	
    	assertFalse(ElementResolver.hasTarget(condition));
    }
}

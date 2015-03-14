/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * A helper-class for list-operations
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ElementResolver
{  
 
    /**
     * Returns the index where to find the elements with that alias in the result-list
     * 
     * @param rule    the current rule
     * @param element the alias name of the element
     * @return the index where to find the elements in the result-list
     */
    public static int getIndexForElement(Rule rule, String element)
    {
        for(int i = 0; i < rule.getElements().size(); i++)
            if( rule.getElements().get(i).getAlias().equals(element) ) 
                return i;

        return 0;
    } 
    
    /**
     * Checks whether a {@link BaseCondition} is a "two-element-condition"
     * 
     * @param condition the base condition
     * @return true if the conditions contains two elements
     */
    public static boolean hasTarget(BaseCondition condition)
    {
    	return (condition.getTarget() != null && !condition.getTarget().equalsIgnoreCase("") );
    }
    
    /**
     * Returns the index of an {@BaseCondition condition}
     * 
     * @param accessLayer the current accesslayer
     * @param rule        the current rule
     * @param condition   the condition
     * @return            the index of the condition
     */
    public static int getIndexOfCondition(AccessLayer accessLayer, Rule rule, BaseCondition condition)
    {
    	int index = 0;
    	List<EObject> conditions = accessLayer.getAllChildren(rule.getConditions());
    	for(int i = 0; i < conditions.size(); i++)
    	{
    		if( conditions.get(i) instanceof BaseCondition ) 
    		{            			
    			if( conditions.get(i) == condition ) break;
    			else index++;
    		}
    	}
    	
    	return index;
    }
    
    /**
     * Removes all instances of {@link LogicCondition LogicConditions} from a list of conditions
     * 
     * @param conditions the list of conditions
     */
    public static void filterBaseConditions(List<EObject> conditions)
    {
    	for(int i = 0; i < conditions.size(); i++)
    	{
    		if( conditions.get(i) instanceof LogicCondition )
    		{
    			conditions.remove(i);
    			i--;
    		}
    	}
    }
}
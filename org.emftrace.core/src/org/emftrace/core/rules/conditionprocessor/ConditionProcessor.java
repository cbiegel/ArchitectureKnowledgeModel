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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.processingcomponent.ProcessingComponent;
import org.emftrace.core.rules.util.InputValidator;
import org.emftrace.core.rules.util.ElementResolver;
import org.emftrace.core.rules.util.NGramCheck;
import org.emftrace.core.rules.util.ConditionProcessorHelper;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ConditionProcessor extends ProcessingComponent implements IConditionProcessor
{ 
	/**
	 * The local helper storing the current {@link ECPProject}
	 */
	private ECPProject project;
	
    ///////////////////////////////////////////////////////////////////////////
	
    /**
     * Constructor
     */
    public ConditionProcessor()
    {
        super("QueryOptimizer");
        project = null;
    }
        
    ///////////////////////////////////////////////////////////////////////////    
    
    public boolean executeBaseCondition(Rule rule, List<List<EObject>> results, BaseCondition condition, List<EObject[]> tuples)
    {
        if( rule == null || results == null || condition == null ) return false;
        
        switch(condition.getType())
        {
            case MODEL_PARENT_OF : 
            {
                int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
                int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
                
                return isParent(results.get(srcIdx), results.get(dstIdx), true, tuples);
            }
            
            case MODEL_DIRECT_PARENT_OF :
            {
                int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
                int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
                
                return isParent(results.get(srcIdx), results.get(dstIdx), false, tuples);
            }
            
            case MODEL_EQUALS :
            {
            	String[] src = condition.getSource().split("::");
            	String[] dst = condition.getTarget().split("::");
            	
                int srcIdx = ElementResolver.getIndexForElement(rule, src[0]);
                int dstIdx = ElementResolver.getIndexForElement(rule, dst[0]);
                
                String sourceRef = null;
                String targetRef = null;
                
                if( src.length > 1 ) sourceRef = src[1];
                if( dst.length > 1 ) targetRef = dst[1];
                
                return isModelEqual(results.get(srcIdx), results.get(dstIdx), sourceRef, targetRef, tuples);
            }
            
            case MODEL_RELATED_TO : 
            {
                int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
                int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
                
            	return areRelated(results.get(srcIdx), results.get(dstIdx), condition.getValue(), tuples, true);
            }
            
            case MODEL_UNDIRECTED_RELATED_TO :
            {
                int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
                int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
                
            	return areRelated(results.get(srcIdx), results.get(dstIdx), condition.getValue(), tuples, false);
            }
            
            case MODEL_INDIRECTLY_RELATED_TO :
            {
                int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
                int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
                
            	return areIndirectlyRelated(results.get(srcIdx), results.get(dstIdx), condition.getValue(), tuples);   	
            }
                
            default :
            {
                String[] src = condition.getSource().split("::");
                int srcIdx = ElementResolver.getIndexForElement(rule, src[0]);
                                                
                if( condition.getTarget() == null || condition.getTarget().equalsIgnoreCase("") ) 
                {
                    return executeCompareCondition(results.get(srcIdx), src[1], condition.getValue(), condition.getType(), tuples);
                }
                else 
                {
                    String[] dst = condition.getTarget().split("::");
                    int dstIdx = ElementResolver.getIndexForElement(rule, dst[0]);
                    
                    return executeCompareCondition(results.get(srcIdx), src[1], results.get(dstIdx), dst[1], condition.getType(), tuples);
                }
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean executeLogicCondition(Rule rule, List<List<EObject>> results, LogicCondition condition, List<List<EObject[]>> tuples)
    {
        if( rule == null || results == null || condition == null ) return false;
        
        if( condition.getBaseConditions().isEmpty() && condition.getLogicConditions().isEmpty() ) return false;
        else
        {            
            int orCount  = 0; // if orCount == 1: at least one or-condition was met
            int xorCount = 0; // if xorCount == 1: one xor-condition was met, if another one is met return false
            boolean orUsed  = false; // to check if no or-condition was met, if so: return false
            boolean xorUsed = false; // to check if no xor-condition was met, if so: return false
              
            // or / xor-branches work on a copy of the list; the copies will be merged in case of "or"
            // and only one of them will be used in case of "xor": 
            List<List<List<EObject>>> orLists = null;
            if( condition.getType() == LogicConditionType.OR || condition.getType() == LogicConditionType.XOR )
            {
                orLists = new ArrayList<List<List<EObject>>>();
                for(int i = 0; i < condition.getBaseConditions().size(); i++) orLists.add(ConditionProcessorHelper.createDeepCopyOfResultList(results));
                for(int i = 0; i < condition.getLogicConditions().size(); i++) orLists.add(ConditionProcessorHelper.createDeepCopyOfResultList(results));
            }
            
            int xorIdx = 0; // marks the list in the orLists that contains the proper results after working through the XOR-branches

            // execute the basic conditions:
            for(int i = 0; i < condition.getBaseConditions().size(); i++)
            {
            	int conditionIndex = ElementResolver.getIndexOfCondition(accessLayer, rule, condition.getBaseConditions().get(i));//0;
         			
                switch(condition.getType())
                {
                    case AND :
                    {
                    	if( !executeBaseCondition(rule, results, condition.getBaseConditions().get(i), tuples.get(conditionIndex)) )
                    	{
                    		tuples.get(conditionIndex).clear();
                    		return false;
                    	}
                    	break;
                    }
                    case OR :
                    {
                        orUsed = true;                        

                        if( executeBaseCondition(rule, orLists.get(i), condition.getBaseConditions().get(i), tuples.get(conditionIndex)) )
                            orCount++;
                        else
                        {
                        	orLists.get(i).clear();
                        	tuples.get(conditionIndex).clear();
                        }

                        break;
                    }
                    case NOT :
                    {
                        List<List<EObject>> copy = ConditionProcessorHelper.createDeepCopyOfResultList(results);
                        List<EObject[]> tupleCopy = ConditionProcessorHelper.createDeepCopyOfTupleList(tuples.get(conditionIndex));
                        
                        // if the condition fails, all elements in "results"  are valid
                        // since it's "NOT". however, if the condition is met (-> some elements
                        // are still in the lists), those elements have to be removed:                        
                        if( executeBaseCondition(rule, copy, condition.getBaseConditions().get(i), tupleCopy) )
                        {
                            ConditionProcessorHelper.createResultListDiff(results, copy, rule, condition.getBaseConditions().get(i));
                            ConditionProcessorHelper.createTupleListDiff(tuples.get(conditionIndex), tupleCopy);
                        }
                        else ConditionProcessorHelper.fillEmptyTuples(results, tuples.get(conditionIndex), rule, condition.getBaseConditions().get(i));
                        
                        int count = 0;
                        for(int j = 0; j < results.size(); j++)
                            if( results.get(j).isEmpty() ) 
                            	count++;
                        
                        if( count == results.size() ) 
                        {
                        	tuples.get(conditionIndex).clear();
                        	return false;
                        }
                        
                        break;
                    }
                    case XOR :
                    {
                        xorUsed = true;
                                                
                        if( executeBaseCondition(rule, orLists.get(i), condition.getBaseConditions().get(i), tuples.get(conditionIndex)) )
                        {
                            xorIdx = i;
                            xorCount++;
                            if( xorCount > 1 ) 
                            {
                            	tuples.get(conditionIndex).clear();
                            	return false;
                            }
                        }
                        
                        break;
                    }
                    default : break;
                }
            }
            
            // execute the logic conditions:
            for(int i = 0; i < condition.getLogicConditions().size(); i++)
            {           	
                switch(condition.getType())
                {
                    case AND :
                    {
                        if( !executeLogicCondition(rule, results, condition.getLogicConditions().get(i), tuples) ) return false;
                        break;
                    }
                    case OR :
                    {
                        orUsed = true;
                        
                        int index = condition.getBaseConditions().size() + i;

                        if( executeLogicCondition(rule, orLists.get(index), condition.getLogicConditions().get(i), tuples) )
                            orCount++;
                        else
                        	orLists.get(index).clear();

                        break;
                    }
                    case NOT :
                    {
                        List<List<EObject>> copy = ConditionProcessorHelper.createDeepCopyOfResultList(results);
                        List<List<EObject[]>> tupleCopy = ConditionProcessorHelper.createDeepCopyOfTupleList(accessLayer, tuples, rule, condition.getLogicConditions().get(i));
                        
                        // if the condition fails, all elements in "results"  are valid
                        // since it's "NOT". however, if the condition is met (-> some elements
                        // are still in the lists), those elements have to be removed:
                        if( executeLogicCondition(rule, copy, condition.getLogicConditions().get(i), tupleCopy) ) 
                        {
                            ConditionProcessorHelper.createResultListDiff(results, copy, rule, condition.getLogicConditions().get(i));
                            ConditionProcessorHelper.createTupleListDiff(accessLayer, tuples, tupleCopy, rule, condition.getLogicConditions().get(i));
                        }
                        else ConditionProcessorHelper.fillEmptyTuples(accessLayer, results, tuples, rule, condition.getLogicConditions().get(i));
                                                
                        int count = 0;
                        for(int j = 0; j < results.size(); j++)
                            if( results.get(j).isEmpty() )
                            	count++;
                        
                        if( count == results.size() ) return false;
                       
                        break;
                    }
                    case XOR :
                    {
                        xorUsed = true;                        
                         
                        if( executeLogicCondition(rule, orLists.get(condition.getBaseConditions().size() + i ), condition.getLogicConditions().get(i), tuples) )
                        {
                            xorIdx = condition.getBaseConditions().size() + i;
                            xorCount++;
                            if( xorCount > 1 ) return false;
                        }
                        
                        break;
                    }
                    default : break;
                }
            }
            
            // if no OR/XOR-condition was met return false:
            // (in case of XOR: also return false if more than 1 condition returned true)
            if( (orUsed && orCount == 0) || (xorUsed && xorCount != 1) ) return false;
            
            // compute the final result of the or/xor-branches:
            if( orLists != null )
            {
                // merge all result-lists if it was "OR":
                if( condition.getType() == LogicConditionType.OR ) ConditionProcessorHelper.mergeResultLists(results, orLists);            
                
                // copy the proper xor-list into the result-list:
                if( condition.getType() == LogicConditionType.XOR ) ConditionProcessorHelper.equalizeResultLists(results, orLists.get(xorIdx));
            }
        }       
      
        return true;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    public boolean executeCompareCondition(List<EObject> source, String sourceAttribute, List<EObject> target, String targetAttribute, BaseConditionType type, List<EObject[]> tuples)
    {
        if( source == null || target == null || type == null ) return false;
        if( sourceAttribute == null || sourceAttribute.equalsIgnoreCase("") ) return false;
        if( targetAttribute == null || targetAttribute.equalsIgnoreCase("") ) return false;
               
        // counts if the targets have been used (saves separate checks):
        List<Boolean> dstCount = new ArrayList<Boolean>();
        for(int i = 0; i < target.size(); i++)
            dstCount.add(false);
        
        for(int i = 0; i < source.size(); i++)
        {
            String srcVal = accessLayer.getAttributeValue(source.get(i), sourceAttribute);
                       
            boolean isRelated = false;
            
            // the source-element does not contain this attribute:
            if( srcVal == null ) 
            {
            	ConditionProcessorHelper.removeFromTuples(source.get(i), tuples, 0);
                source.remove(i);                
                i--;
                continue;
            }
            else
            {
                for(int j = 0; j < target.size(); j++)
                {                   
                    if( source.get(i) == target.get(j) ) continue;
                    
                    String dstVal = accessLayer.getAttributeValue(target.get(j), targetAttribute);
                   
                    // the target-element does not contain this attribute:
                    if( dstVal == null ) 
                    {
                    	ConditionProcessorHelper.removeFromTuples(target.get(j), tuples, 1);
                        target.remove(j);
                        dstCount.remove(j);
                        j--;
                    }
                    else
                    {
                        switch(type)
                        {
                            case VALUE_EQUALS :
                            {
                                if( srcVal.equalsIgnoreCase(dstVal) )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }

                                break;
                            }
                            case VALUE_STARTS_WITH :
                            {
                                if( srcVal.toLowerCase().startsWith(dstVal.toLowerCase()) )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }
                                
                            	break;
                            }
                            case VALUE_ENDS_WITH :
                            {
                                if( srcVal.toLowerCase().endsWith(dstVal.toLowerCase()) )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }
                                break;
                            }
                            case VALUE_CONTAINS :
                            {                            	
                                if( srcVal.toLowerCase().contains(dstVal.toLowerCase()) )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }

                                break;
                            }
                            case VALUE_SIMILAR_TO : 
                            {
                                if( NGramCheck.compareWords(n, srcVal.toLowerCase(), dstVal.toLowerCase(), correlation) )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }

                                break;
                            }
                            case VALUE_GREATER_THAN :
                            {
                                if( InputValidator.checkFloatInput(srcVal) &&
                                    InputValidator.checkFloatInput(dstVal) &&
                                    Float.valueOf(srcVal).floatValue() > Float.valueOf(dstVal).floatValue() )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }

                                break;
                            }
                            case VALUE_LESSER_THAN :
                            {
                                if( InputValidator.checkFloatInput(srcVal) && 
                                    InputValidator.checkFloatInput(dstVal) && 
                                    Float.valueOf(srcVal).floatValue() < Float.valueOf(dstVal).floatValue() )
                                {
                                	ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
                                    dstCount.set(j, true);
                                    isRelated = true;
                                }

                                break;
                            }

                            default : break;
                        }
                    }                    
                }
            }    
            
            // remove unrelated source-elements:
            if( !isRelated ) 
            {
            	ConditionProcessorHelper.removeFromTuples(source.get(i), tuples, 0);
                source.remove(i);
                i--;
            }
        }
        
        // remove unrelated target-elements:
        for(int i = 0; i < target.size(); i++)
        {
            if( dstCount.get(i).booleanValue() == false ) 
            {
            	ConditionProcessorHelper.removeFromTuples(target.get(i), tuples, 1);
                target.remove(i);
                dstCount.remove(i);
                i--;
            }
        }

    	return ( !source.isEmpty() && !target.isEmpty() );
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean executeCompareCondition(List<EObject> element, String attribute, String value,  BaseConditionType type, List<EObject[]> tuples)
    {
        if( element == null || element.isEmpty() || type == null) return false;
        if( attribute == null || attribute.equalsIgnoreCase("") ) return false;
        if( value == null && type != BaseConditionType.VALUE_NOT_NULL ) return false;
        
        for(int i = 0; i < element.size(); i++)
        {
            String tmp = accessLayer.getAttributeValue(element.get(i), attribute);
            
            if( tmp == null && type != BaseConditionType.VALUE_NOT_NULL )
            {
            	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                element.remove(i);
                i--;
                continue;
            }
            else
            {
                switch(type)
                {
                    case VALUE_EQUALS :
                    {
                        if( !tmp.equalsIgnoreCase(value) )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_STARTS_WITH :
                    {
                        if( !tmp.toLowerCase().startsWith(value.toLowerCase()) )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }                        
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                    	break;
                    }
                    case VALUE_ENDS_WITH :
                    {
                        if( !tmp.toLowerCase().endsWith(value.toLowerCase()) )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_CONTAINS :
                    {
                        if( !tmp.toLowerCase().contains(value.toLowerCase()) )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_SIMILAR_TO : 
                    {
                        if( !NGramCheck.compareWords(n, tmp.toLowerCase(), value.toLowerCase(), correlation) )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_GREATER_THAN :
                    {
                        if( !InputValidator.checkFloatInput(tmp) || Float.valueOf(tmp).floatValue() <= Float.valueOf(value).floatValue() )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_LESSER_THAN :
                    {
                        if( !InputValidator.checkFloatInput(tmp) || Float.valueOf(tmp).floatValue() >= Float.valueOf(value).floatValue() )
                        {
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                        }
                        else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                        
                        break;
                    }
                    case VALUE_NOT_NULL :
                    {
                    	if( tmp == null || tmp.equalsIgnoreCase("") )
                    	{
                        	ConditionProcessorHelper.removeFromTuples(element.get(i), tuples, 0);
                            element.remove(i);
                            i--;
                    	}
                    	else ConditionProcessorHelper.addToTuples(element.get(i), null, tuples);
                    	
                        break;
                    }
                    default : break;
                }
            }
        }
        
        return ( !element.isEmpty() );
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean isParent(List<EObject> parent, List<EObject> child, boolean allowIndirectChildren, List<EObject[]> tuples)
    {
        if( parent == null   || child == null )   return false;
        if( parent.isEmpty() || child.isEmpty() ) return false;
        
        // counts if the children have been used (saves separate checks):
        int[] childCount = new int[child.size()];
        for(int i = 0; i < child.size(); i++)
            childCount[i] = 0;
        
        // check and link the parents:
        for(int i = 0; i < parent.size(); i++)
        {
            boolean noChildren = true;
            List<EObject> list = null;
            
            if( allowIndirectChildren )
            	list = accessLayer.getAllChildren(parent.get(i));
            else
            	list = accessLayer.getDirectChildren(parent.get(i));
            
            for(int j = 0; j < child.size(); j++)
            {
                if( list.contains(child.get(j)) ) 
                {
                	ConditionProcessorHelper.addToTuples(parent.get(i), child.get(j), tuples);
                    childCount[j]++;
                    noChildren = false;
                }
            }
     
            // remove all "parents" without children:
            if( noChildren ) 
            {
            	ConditionProcessorHelper.removeFromTuples(parent.get(i), tuples, 0);
                parent.remove(i);
                i--;
            }
        }
        
        // check the children and remove unrelated ones:
        int offset = 0;
        for(int i = 0; i < child.size(); i++)
        {
            if( childCount[i+offset] == 0 ) 
            {
            	ConditionProcessorHelper.removeFromTuples(child.get(i), tuples, 1);
                child.remove(i);
                i--;
                offset++;
            }
        }
        
        return ( !parent.isEmpty() && !child.isEmpty() );
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean areRelated(List<EObject> source, List<EObject> target, String relationType, List<EObject[]> tuples, boolean directionSensitive)
    {
    	if( relationType == null || relationType.equalsIgnoreCase("") ) return false;
    	
    	List<EObject>   tmp   = accessLayer.getElements(project, "TraceLink");
    	List<TraceLink> links = new ArrayList<TraceLink>();    
    	
    	for(int i = 0; i < tmp.size(); i++)
    		if( ((TraceLink)tmp.get(i)).getType().getName().equalsIgnoreCase(relationType) )
    			links.add((TraceLink)tmp.get(i));
    	    	
    	// there is no link with the required type:
    	if( links.isEmpty() )
    	{
    		source.clear();
    		target.clear();
    		tuples.clear();
    		
    		return false;
    	}
    	
		int[] destCount = new int[target.size()];
        for(int i = 0; i < target.size(); i++)
        	destCount[i] = 0;
    	
    	for(int i = 0; i < source.size(); i++)
    	{
    		boolean sourceRelated = false;
    		
    		for(int j = 0; j < target.size(); j++)
    		{    		
    			for(int k = 0; k < links.size(); k++)
    			{
    				if( directionSensitive )
    				{
	    				if( links.get(k).getSource() == source.get(i) && links.get(k).getTarget() == target.get(j) )
	    				{
	    					ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
	    					sourceRelated = true;
	    					destCount[j]++;
	    					break;
	    				}
    				}
    				else
    				{
	    				if( links.get(k).getSource() == source.get(i) && links.get(k).getTarget() == target.get(j) ||
	    					links.get(k).getTarget() == source.get(i) && links.get(k).getSource() == target.get(j) )
	    				{
	    					ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
	    					sourceRelated = true;
	    					destCount[j]++;
	    					break;
	    				}
    				}
    			}
    		}
    		
			// this source element is not related to any target:
			if( !sourceRelated ) 
			{
				ConditionProcessorHelper.removeFromTuples(source.get(i), tuples, 0);
				source.remove(i);
				i--;
			}
    	}
    	
		// remove all target elements which are not related to any source elements:
		int offset = 0;
		for(int i = 0; i < target.size(); i++)
		{
			if( destCount[i+offset] == 0 )
			{
				ConditionProcessorHelper.removeFromTuples(target.get(i), tuples, 1);
				target.remove(i);
				offset++;
				i--;
			}
		}
    	
    	return ( !source.isEmpty() && !target.isEmpty() );
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public boolean areIndirectlyRelated(List<EObject> source, List<EObject> target, String relationType, List<EObject[]> tuples)
    {
    	if( relationType == null || relationType.equalsIgnoreCase("") ) return false;
    	
    	List<EObject> relations = accessLayer.getElements(project, "TraceLink");    	
    	List<TraceLink> links = new ArrayList<TraceLink>();
    	
    	for(int i = 0; i < relations.size(); i++)
    		if( ((TraceLink) relations.get(i)).getType().getName().equalsIgnoreCase(relationType) )
    			links.add((TraceLink) relations.get(i));
    	
    	// there is no link with the required type:
    	if( links.isEmpty() )
    	{
    		source.clear();
    		target.clear();
    		tuples.clear();
    		
    		return false;
    	}
        
		int[] destCount = new int[target.size()];
        for(int i = 0; i < target.size(); i++)
        	destCount[i] = 0;
    	
    	for(int i = 0; i < source.size(); i++)
    	{
    		boolean sourceRelated = false;
    		
    		for(int j = 0; j < target.size(); j++)
    		{  
    			TraceLink link = null;
    			
    			do
    			{
    				if( link == null )
    				{
	    				for(int k = 0; k < links.size(); k++) 
	    				{
	    					if( links.get(k).getSource() == source.get(i) )
	    					{
	    						link = links.get(k);
	    						break;
	    					}
	    				}
	    				
	    				if( link == null ) break;
    				}
    						        	
		        	if( link.getTarget() == target.get(j) )
		        	{
    					ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
    					sourceRelated = true;
    					destCount[j]++;
    					break;
		        	}

		        	int count = 0;
    				for(int k = 0; k < links.size(); k++)
    				{
    					if( links.get(k).getSource() == link.getTarget() )
    					{
    						link = links.get(k);
    						break;
    					}
    					else count++;
    				}
    				
    				if( count == links.size() ) break;
    			} 
    			while( link != null );
    		}
    		
			// this source element is not related to any target:
			if( !sourceRelated ) 
			{
				ConditionProcessorHelper.removeFromTuples(source.get(i), tuples, 0);
				source.remove(i);
				i--;
			}
    	}
    	
		// remove all target elements which are not related to any source elements:
		int offset = 0;
		for(int i = 0; i < target.size(); i++)
		{
			if( destCount[i+offset] == 0 )
			{
				ConditionProcessorHelper.removeFromTuples(target.get(i), tuples, 1);
				target.remove(i);
				offset++;
				i--;
			}
		}
		
    	return ( !source.isEmpty() && !target.isEmpty() );	
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unchecked")
	public boolean isModelEqual(List<EObject> source, List<EObject> target, String sourceRef, String targetRef, List<EObject[]> tuples)
    {
		int[] destCount = new int[target.size()];
        for(int i = 0; i < target.size(); i++)
        	destCount[i] = 0;
		
		for(int i = 0; i < source.size(); i++)
		{
			boolean targetRelated = false;
			
			EObject srcModel = source.get(i);			
			if( sourceRef != null && accessLayer.getReference(srcModel, sourceRef) != null )
			{
				Object obj = srcModel.eGet(accessLayer.getReference(srcModel, sourceRef));
				
				if( obj instanceof EObjectResolvingEList )
					srcModel = (EObject) ((EObjectResolvingEList<Object>)obj).toArray()[0];
				else 
					srcModel = (EObject) obj;
			}
			
			for(int j = 0; j < target.size(); j++)
			{
				EObject dstModel = target.get(j);
				if( targetRef != null && accessLayer.getReference(dstModel, targetRef) != null ) 
				{
					Object obj = dstModel.eGet(accessLayer.getReference(dstModel, targetRef));
					
					if( obj instanceof EObjectResolvingEList )
						dstModel = (EObject) ((EObjectResolvingEList<Object>)obj).toArray()[0];
					else 
						dstModel = (EObject) obj;
				}
					
				// check if both are equal:
				if( srcModel == dstModel ) 
				{
					ConditionProcessorHelper.addToTuples(source.get(i), target.get(j), tuples);
					destCount[j]++;
					targetRelated = true;
					break;
				}
			}
			
			// this source element is not related to any target:
			if( !targetRelated ) 
			{
				ConditionProcessorHelper.removeFromTuples(source.get(i), tuples, 0);
				source.remove(i);
				i--;
			}
		}
		
		// remove all target elements which are not related to any source elements:
		int offset = 0;
		for(int i = 0; i < target.size(); i++)
		{
			if( destCount[i+offset] == 0 )
			{
				ConditionProcessorHelper.removeFromTuples(target.get(i), tuples, 1);
				target.remove(i);
				offset++;
				i--;
			}
		}
    	
		// return false if both lists are empty:
		return ( !source.isEmpty() && !target.isEmpty() );    	
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public void run(ECPProject newProject, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples)
    {    	
    	project = newProject;
    	
        if( rule == null || results == null || accessLayer == null ) return;
                
        printToLog("run", "start applying conditions of rule \""+rule.getRuleID()+"\"");
                 
        if( !executeLogicCondition(rule, results, rule.getConditions(), tuples) )
        {
            results.clear();
            tuples.clear();
        }

        printToLog("run", "... finished the application of conditions of rule \""+rule.getRuleID()+"\"");
    }
}
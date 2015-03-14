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

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * A helper-class for list-operations, adjusted for rule-optimization
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ConditionProcessorHelper
{
    /**
     * Prepares a deep copy of a {@link List}
     * 
     * @param list the list that should be copied
     * @return a copy of the list
     */
    public static List<List<EObject>> createDeepCopyOfResultList(List<List<EObject>> list)
    {
        List<List<EObject>> resultList = new ArrayList<List<EObject>>();
        
        for(int i = 0; i < list.size(); i++)
        {
            resultList.add(new ArrayList<EObject>());
            for(int j = 0; j < list.get(i).size(); j++)
                resultList.get(i).add(list.get(i).get(j));
        }
        
        return resultList;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Adjusts an original list to match a modified copy
     * 
     * @param original the original list
     * @param copy     a modified copy of the original
     */
    public static void equalizeResultLists(List<List<EObject>> original, List<List<EObject>> copy)
    {
        for(int i = 0; i < original.size(); i++)
        {
            original.get(i).clear();
            //original.get(i).addAll(ModelUtil.clone(copy.get(i)));
            original.get(i).addAll(copy.get(i));
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Removes all elements of "copy" from "original"
     * 
     * @param original  the original list
     * @param copy      a modified copy of the original
     * @param rule      the current TraceRule, can be null
     * @param condition the current BaseCondition, can be null
     */
    public static void createResultListDiff(List<List<EObject>> original, List<List<EObject>> copy, Rule rule, BaseCondition condition)
    {
        int srcIdx = -1;
        int dstIdx = -1;
        
        if( condition.getSource() != null ) srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource().split("::")[0]);
        if( condition.getTarget() != null ) dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget().split("::")[0]);
        
        for(int i = 0; i < original.size(); i++)
        {
            if( i == srcIdx || i == dstIdx || (srcIdx == -1 && dstIdx == -1) )
            {
                for(int j = 0; j < original.get(i).size(); j++)
                {               
                    for(int k = 0; k < copy.get(i).size(); k++)
                    {
                        if( copy.get(i).get(k) == original.get(i).get(j) )
                        {
                            original.get(i).remove(original.get(i).get(j));
                            j--;
                            break;
                        }
                    }
                }
            }
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Searches for all list-indices where elements can be removed from, after completing a NOT-branch
     * 
     * @param paths     the list of indices
     * @param rule      the current rule
     * @param condition the current LogicCondition
     */
    public static void findElementsForDeletion(List<Integer> paths, Rule rule, LogicCondition condition)
    {
        // check the BaseConditions:
        for(int i = 0; i < condition.getBaseConditions().size(); i++)
        {               
            String[] source = condition.getBaseConditions().get(i).getSource().split("::");
            int srcIdx = ElementResolver.getIndexForElement(rule, source[0]);
            paths.add(srcIdx);
            
            if( condition.getBaseConditions().get(i).getTarget() == null ) continue;
            
            String[] target = condition.getBaseConditions().get(i).getTarget().split("::");
            int dstIdx = ElementResolver.getIndexForElement(rule, target[0]);          
            paths.add(dstIdx);
        }
        
        // cbeck the LogiConditions:
        for(int i = 0; i < condition.getLogicConditions().size(); i++)
            findElementsForDeletion(paths, rule, condition.getLogicConditions().get(i));
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Removes all elements of "copy" from "original"
     * 
     * @param original  the original list
     * @param copy      a modified copy of the original
     * @param rule      the current TraceRule
     * @param condition the current LogicCondition
     */
    public static void createResultListDiff(List<List<EObject>> original, List<List<EObject>> copy, Rule rule, LogicCondition condition)
    {
    	List<Integer> paths = new ArrayList<Integer>();
        
        findElementsForDeletion(paths, rule, condition);
        
        for(int i = 0; i < original.size(); i++)
        {
            if( paths.contains(i) )
            {
                for(int j = 0; j < original.get(i).size(); j++)
                {               
                    for(int k = 0; k < copy.get(i).size(); k++)
                    {
                        if( copy.get(i).get(k) == original.get(i).get(j) )
                        {
                            original.get(i).remove(original.get(i).get(j));
                            j--;
                            break;
                        }
                    }
                }
            }
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
        
    /**
     * Merges several copies of the result-list into one list
     * (will be used for merging result-list of OR-branches)
     * 
     * @param results the final result list
     * @param copies  several, different versions of the final list
     */
    public static void mergeResultLists(List<List<EObject>> results, List<List<List<EObject>>> copies)
    {   
        for(int i = 0; i < results.size(); i++)
            results.get(i).clear();
        
        for(int i = 0; i < copies.size(); i++)
        {
            List<List<EObject>> workingList = copies.get(i);
            
            for(int j = 0; j < workingList.size(); j++)
            {             
                for(int k = 0; k < workingList.get(j).size(); k++)
                {
                    if( results.get(j).isEmpty() ) results.get(j).add(workingList.get(j).get(k));
                    else
                    {
                        boolean found = false;
                        for(int l = 0; l < results.get(j).size(); l++)
                        {
                            if( results.get(j).get(l) == workingList.get(j).get(k) )
                            {                               
                                found = true;
                                break;
                            }
                        }
                        if( !found ) results.get(j).add(workingList.get(j).get(k));
                    }
                }
            }
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
   
    /**
     * Adds two models to the list of tuples
     * 
     * @param src    the source model
     * @param dst    the target model
     * @param tuples the list of tuples
     */
    public static void addToTuples(EObject src, EObject dst, List<EObject[]> tuples)
    {
    	int size = tuples.size();
    	boolean tupleAlreadyExists = false;
    	
    	// check if the same tuple already exists:
    	if( dst != null )
    	{
	    	for(int i = 0; i < size; i++)
	    	{
	    		if( tuples.get(i)[0] == src && tuples.get(i)[1] == dst )
	    		{
	    			tupleAlreadyExists = true;
	    			break;
	    		}
	    	}
    	}
    	else
    	{
	    	for(int i = 0; i < size; i++)
	    	{
	    		if( tuples.get(i)[0] == src )
	    		{
	    			tupleAlreadyExists = true;
	    			break;
	    		}
    		}
    	}
    	
    	// if not, add it to the list of tuples:
    	if( !tupleAlreadyExists )
    	{
        	if( dst != null )
        	{
        		tuples.add( new EObject[2]);
        		tuples.get(size)[0] = src; 
        		tuples.get(size)[1] = dst;
        	}
        	else
        	{
        		tuples.add( new EObject[1]);
        		tuples.get(size)[0] = src; 
        	}
    	}
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Removes a certain model from all tuples
     * 
     * @param model  the model to be deleted
     * @param tuples the list of tuples
     */
    public static void removeFromTuples(EObject model, List<EObject[]> tuples, int pos)
    {
    	if( tuples.isEmpty() ) return;
    	
    	for(int i = 0; i < tuples.size(); i++)
    	{
    		if( tuples.get(i)[pos] == model )
    		{
    			tuples.remove(i);
    			i--;
    		}
    	}
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Creates new, empty tuple-lists according to the amount of conditions of a certain rule
     * 
     * @param accessLayer the current AccessLayer
     * @param rule        the current rule
     * @param tuples      the list of tuple-lists
     */
    public static void prepareTupleLists(AccessLayer accessLayer, Rule rule, List<List<EObject[]>> tuples)
    {
    	tuples.clear();
    	
    	List<EObject> conditions = accessLayer.getAllChildren(rule.getConditions());
    	
    	for(int i = 0; i < conditions.size(); i++)
    		if( conditions.get(i) instanceof BaseCondition )
    			tuples.add(new ArrayList<EObject[]>());

    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Removes all tuples contained by one list from another tuple-list (required for NOT-conditions)
     * 
     * @param original the original list
     * @param copy     a possibly modified copy of the original list
     */
    public static void createTupleListDiff(List<EObject[]> original, List<EObject[]> copy)
    {
    	if( copy.isEmpty() ) return;
    	if( original.isEmpty() ) return;
    	
    	int len = original.get(0).length;
    	
    	for(int i = 0; i < original.size(); i++)
    	{
    		for(int j = 0; j < copy.size(); j++)
    		{
    			int counts = 0;
    			
    			for(int k = 0; k < len; k++)
    				if( original.get(i)[k] == copy.get(j)[k] )
    					counts++;
    			
    			if( counts == len )
    			{
	    			original.remove(i);
	    			i--;
	    			break;
    			}
    		}
    	}
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Removes all tuples contained by one list from another tuple-list (required for NOT-conditions)
     * 
     * @param accessLayer the current AccessLayer
     * @param original    the original list
     * @param copy        a possibly modified copy of the original list
     * @param rule        the current rule
     * @param condition   the encapsulating LogicCondition
     */
    public static void createTupleListDiff(AccessLayer accessLayer, List<List<EObject[]>> original, List<List<EObject[]>> copy, Rule rule, LogicCondition condition)
    {
    	List<EObject> conditions     = accessLayer.getAllChildren(rule.getConditions());
    	List<EObject> baseConditions = accessLayer.getAllChildren(condition);
    	
    	ElementResolver.filterBaseConditions(conditions);   	
    	ElementResolver.filterBaseConditions(baseConditions);
    	
    	// adjust only those that belong to an NOT-condition:
    	for(int i = 0; i < conditions.size(); i++)
    	{
    		for(int j = 0; j < baseConditions.size(); j++)
    		{
    			if( conditions.get(i) == baseConditions.get(j) )
    			{
    				createTupleListDiff(original.get(i), copy.get(i));
    			}
    		}
    	}
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public static void fillEmptyTuples(List<List<EObject>> results, List<EObject[]> tuples, Rule rule, BaseCondition condition)
    {
    	if( !tuples.isEmpty() ) return;
    	
    	int srcIdx = ElementResolver.getIndexForElement(rule, condition.getSource());
    	
    	if( !ElementResolver.hasTarget(condition) )
    	{
    		for(int i = 0; i < results.get(srcIdx).size(); i++)
    		{
    			EObject[] tuple = new EObject[1];
    			tuple[0] = results.get(srcIdx).get(i);
    			tuples.add(tuple);
    		}
    	}
    	else
    	{
    		// compute the cross-product of the elements
    		int dstIdx = ElementResolver.getIndexForElement(rule, condition.getTarget());
    		
    		for(int i = 0; i < results.get(srcIdx).size(); i++)
    		{
    			for(int j = 0; j < results.get(dstIdx).size(); j++)
    			{
        			EObject[] tuple = new EObject[2];
        			tuple[0] = results.get(srcIdx).get(i);
        			tuple[1] = results.get(dstIdx).get(j);
        			tuples.add(tuple);
    			}
    		}
    	}
    }
    
    public static void fillEmptyTuples(AccessLayer accessLayer, List<List<EObject>> results, List<List<EObject[]>> tuples, Rule rule, LogicCondition condition)
    {
    	for(int i = 0; i < condition.getBaseConditions().size(); i++)
    	{
    		int idx = ElementResolver.getIndexOfCondition(accessLayer, rule, condition.getBaseConditions().get(i));
    		fillEmptyTuples(results, tuples.get(idx), rule, condition.getBaseConditions().get(i));
    	}
    	
    	for(int i = 0; i < condition.getLogicConditions().size(); i++)
    	{
    		fillEmptyTuples(accessLayer, results, tuples, rule, condition.getLogicConditions().get(i));
    	}
    }
        
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Equalize a list and a possibly modified copy of the list, i.e. both contain the same elements afterwards
     * 
     * @param original the original list
     * @param copy     a possibly modified copy of the original list
     */
    public static void equalizeTupleLists(List<EObject[]> original, List<EObject[]> copy)
    {
        original.clear();
        
        if( copy.isEmpty() ) return;
        
        int tupleSize = copy.get(0).length;
        
        for(int i = 0; i < copy.size(); i++)
        {
        	original.add(new EObject[tupleSize]);
        	for(int j = 0; j < tupleSize; j++)
        		original.get(i)[j] = copy.get(i)[j];
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Prepares a deep-copy of a tuple-list
     * 
     * @param list the list to be copied
     * @return     a deep-copy of the list
     */
    public static List<EObject[]> createDeepCopyOfTupleList(List<EObject[]> list)
    {
        List<EObject[]> resultList = new ArrayList<EObject[]>();
        
        if( list.isEmpty() ) return resultList;
        
        int tupleSize = list.get(0).length;
        
        for(int i = 0; i < list.size(); i++)
        {
            resultList.add(new EObject[tupleSize]);
            for(int j = 0; j < tupleSize; j++)
                resultList.get(i)[j] = list.get(i)[j];
        }
        
        return resultList;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Prepares a deep-copy of a tuple-list
     * 
     * @param accessLayer the current accesslayer
     * @param list        the list to be copied
     * @param rule        the current rule
     * @param condition   the encapsulating LogicCondition
     * @return            a deep-copy of the tuple-list
     */
    public static List<List<EObject[]>> createDeepCopyOfTupleList(AccessLayer accessLayer, List<List<EObject[]>> list, Rule rule, LogicCondition condition)
    {
    	List<List<EObject[]>> resultList = new ArrayList<List<EObject[]>>();
    	
    	// create empty lists for each base condition:
    	for(int i = 0; i < list.size(); i++)
    		resultList.add(new ArrayList<EObject[]>());
    	
    	// only copy those that are really needed:
    	List<EObject> conditions = accessLayer.getAllChildren(rule.getConditions());
    	List<EObject> baseConditions = accessLayer.getAllChildren(condition);
    	
    	ElementResolver.filterBaseConditions(conditions);    	
    	ElementResolver.filterBaseConditions(baseConditions);
		
    	for(int i = 0; i < conditions.size(); i++)
    	{						
    		for(int j = 0; j < baseConditions.size(); j++)
    		{    			
				if( conditions.get(i) == baseConditions.get(j) )
    			{
    				if( list.get(i).isEmpty() ) continue;
    					
    		        int tupleSize = list.get(i).get(0).length;
    		        
    		        for(int k = 0; k < list.get(i).size(); k++)
    		        {
    		            resultList.get(i).add(new EObject[tupleSize]);
    		            for(int l = 0; l < tupleSize; l++)
    		                resultList.get(i).get(k)[l] = list.get(i).get(k)[l];
    		        }
    			}
    		}    			
    	}
    	
    	return resultList;
    }
}
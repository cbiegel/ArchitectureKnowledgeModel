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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.processingcomponent.ProcessingComponent;
import org.emftrace.core.rules.util.ConditionProcessorHelper;
import org.emftrace.core.rules.util.ElementResolver;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class JoinProcessor extends ProcessingComponent implements IJoinProcessor
{
	/**
	 * the final tuples containing the JOIN of all tuple-lists
	 */
	private List<EObject[]> finalTuples;
		
	/**
	 * Constructor
	 */
	public JoinProcessor()
	{
        super("JoinProcessor");
        
        finalTuples = new ArrayList<EObject[]>();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public List<EObject[]> getFinalTuples()
	{
		return finalTuples;
	}
		
    ///////////////////////////////////////////////////////////////////////////
	
	public EObject[] cloneTuple(EObject[] tuple)
	{
		int size = tuple.length;
		
		EObject[] clonedTuple = new EObject[size];
		
		for(int i = 0; i < size; i++) clonedTuple[i] = tuple[i];
		
		return clonedTuple;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public int countOccurrences(List<EObject[]> list, int position, EObject model, List<Integer> positionList)
	{
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			if( list.get(i)[position] == model )
			{
				positionList.add(i);
				count++;
			}
		}
		
		return count;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void cleanTupleList(List<EObject[]> tupleList1, List<EObject[]> tupleList2, int srcIdx, int dstIdx, int pos)
	{
		for(int i = 0; i < tupleList1.size(); i++)
		{
			boolean found = false;
			
			for(int j = 0; j < tupleList2.size(); j++)
			{
				if( tupleList1.get(i)[srcIdx] == tupleList2.get(j)[pos] || tupleList1.get(i)[dstIdx] == tupleList2.get(j)[pos] )
				{
					found = true;
					break;
				}
			}
			
			if( !found )
			{
				tupleList1.remove(i);
				i--;
			}
		}
		
		for(int i = 0; i < tupleList2.size(); i++)
		{
			boolean found = false;
			
			for(int j = 0; j < tupleList1.size(); j++)
			{
				if( tupleList1.get(j)[srcIdx] == tupleList2.get(i)[pos] || tupleList1.get(j)[dstIdx] == tupleList2.get(i)[pos] )
				{
					found = true;
					break;
				}
			}
			
			if( !found )
			{
				tupleList2.remove(i);
				i--;
			}
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinTwoElementTuplesWhereOneWasAlreadyJoined(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int srcIdx, int dstIdx, int tuplePos)
	{
		// remove tuples that can't be joined:		
		cleanTupleList(joinedTuples, tupleList, srcIdx, dstIdx, tuplePos);
		
		int inverseTuplePos = 0;
		
		if( tuplePos == 0 ) inverseTuplePos = 1;
		
	    int finalTupleSize = joinedTuples.size();
	    	
		for(int j = 0; j < finalTupleSize; j++)
		{
			for(int i = 0; i < tupleList.size(); i++)
			{
				boolean srcHit = joinedTuples.get(j)[srcIdx] == tupleList.get(i)[tuplePos];
				boolean dstHit = joinedTuples.get(j)[dstIdx] == tupleList.get(i)[tuplePos];
				
				if( srcHit || dstHit )
				{		
					List<Integer> pos = new ArrayList<Integer>();
					int requiredClonesFromTupleList = countOccurrences(tupleList, tuplePos, tupleList.get(i)[tuplePos], pos);
					
					for(int k = 0; k < requiredClonesFromTupleList-1; k++)
					{
						EObject[] tuple = cloneTuple(joinedTuples.get(j));
						joinedTuples.add(tuple);

						if( srcHit ) tuple[dstIdx] = tupleList.get(pos.get(k+1))[inverseTuplePos];
						else         tuple[srcIdx] = tupleList.get(pos.get(k+1))[inverseTuplePos];
					}
					
					if( srcHit ) joinedTuples.get(j)[dstIdx] = tupleList.get(i)[inverseTuplePos];
					else         joinedTuples.get(j)[srcIdx] = tupleList.get(i)[inverseTuplePos];
					
					break;
				}
			}
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinTwoElementTuples(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int index, List<BaseCondition> conditions, Rule rule)
	{	   
		if( tupleList.isEmpty() ) 
		{
			joinedTuples.clear();
			return;
		}
		
		String src1 = conditions.get(index).getSource();				
		String dst1 = conditions.get(index).getTarget();
		
		if( src1.contains("::") ) src1 = src1.split("::")[0];
		if( dst1.contains("::") ) dst1 = dst1.split("::")[0];
		
		int srcIdx = ElementResolver.getIndexForElement(rule, src1);
		int dstIdx = ElementResolver.getIndexForElement(rule, dst1);
		
		String src2 = null;
		String dst2 = null;
		
		boolean sourceWasJoined = false;
		boolean targetWasJoined = false;
		
		// check if the source and/or the target elements have been joined before:
		for(int i = 0; i < index; i++)
		{
			src2 = conditions.get(i).getSource();
			dst2 = conditions.get(i).getTarget();
			
			if( src2.contains("::") ) src2 = src2.split("::")[0];
			if( dst2 != null && dst2.contains("::") ) dst2 = dst2.split("::")[0];
			
			if( src1.equalsIgnoreCase(src2) || (dst2 != null && src1.equalsIgnoreCase(dst2)) ) sourceWasJoined = true;			
			if( dst1.equalsIgnoreCase(src2) || (dst2 != null && dst1.equalsIgnoreCase(dst2)) ) targetWasJoined = true;
		}
		
		// even if the conditions indicate that both have been joined previously this might not be the case
		// e.g. imagine the following:
		//
		// <or>
		//    src RelatedTo dst Via "Refines"
		//    dst RelatedTo src Via "Refines"
		// </or>
		//
		// in this case, both "sourceWasJoined" and "targetWasJoined" will be true although the first base condition might have returned nothing
		// thus, the tuples of the 2nd base condition would never be added
		int count = 0;
		for(int i = 0; i < joinedTuples.size(); i++)
		{
			if( joinedTuples.get(i)[srcIdx] == null && joinedTuples.get(i)[dstIdx] == null ) count++;
		}
		
		// ... they never appear anywhere in the tuples:
		if( count == joinedTuples.size() )
		{
			sourceWasJoined = false;
			targetWasJoined = false;
		}
				
		// both have been joined before, so remove tuples that didn't match with other conditions:
		if( sourceWasJoined && targetWasJoined )
		{
			for(int i = 0; i < joinedTuples.size(); i++)
			{
				boolean found = false;
				
				for(int j = 0; j < tupleList.size(); j++)
				{
					if( (joinedTuples.get(i)[srcIdx] == tupleList.get(j)[0] && joinedTuples.get(i)[dstIdx] == tupleList.get(j)[1]) )
					{
						found = true;
						break;
					}
				}
				
				if( !found )
				{
					joinedTuples.remove(i);
					i--;
				}
			}
			
			return;
		}
		
		// none of them have been joined before, hence add them to each of the existing tuples:
		if( !sourceWasJoined && !targetWasJoined )
		{
			//int size = tupleList.size();
			int size = joinedTuples.size();					
			
			// simply clone the finalTuple list n-1 times, where n = sizeOf(tupleList):
			List<EObject[]> copy = ConditionProcessorHelper.createDeepCopyOfTupleList(joinedTuples);
			for(int i = 0; i < tupleList.size()-1; i++)
				joinedTuples.addAll(ConditionProcessorHelper.createDeepCopyOfTupleList(copy));
			
			for(int i = 0; i < joinedTuples.size(); i++)
			{
				if( size > 0 )
				{
					joinedTuples.get(i)[srcIdx] = tupleList.get(i/size)[0];
					joinedTuples.get(i)[dstIdx] = tupleList.get(i/size)[1];
				}
				else // there is only one tuple in the tupleList
				{
					joinedTuples.get(i)[srcIdx] = tupleList.get(i)[0];
					joinedTuples.get(i)[dstIdx] = tupleList.get(i)[1];				
				}
			}
						
			return;
		}
		
		// only the source element has been joined so far:
		if( sourceWasJoined )
		{
			joinTwoElementTuplesWhereOneWasAlreadyJoined(joinedTuples, tupleList, srcIdx, dstIdx, 0);
			return;
		}
		
		// otherwise only the target element has been joined so far:
		joinTwoElementTuplesWhereOneWasAlreadyJoined(joinedTuples, tupleList, srcIdx, dstIdx, 1);
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinOneElementTuples(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int index, List<BaseCondition> conditions, Rule rule)
	{
		if( tupleList.isEmpty() ) 
		{
			joinedTuples.clear();
			return;
		}
				
		int idx;
		
		if( conditions.get(index).getSource().contains("::") ) idx = ElementResolver.getIndexForElement(rule, conditions.get(index).getSource().split("::")[0]);
		else idx = ElementResolver.getIndexForElement(rule, conditions.get(index).getSource());
		
		// check if the same element was processed in a "two-element-condition":
		boolean wasAlreadyJoined = false;
		String src1 = conditions.get(index).getSource();						
		if( src1.contains("::") ) src1 = src1.split("::")[0];
		
		for(int i = 0; i < index; i++)
		{
			String src2 = conditions.get(i).getSource();				
			String dst2 = conditions.get(i).getTarget();
			
			if( src2.contains("::") ) src2 = src2.split("::")[0];
			if( dst2 != null && dst2.contains("::") ) dst2 = dst2.split("::")[0];
			
			if( src2.equalsIgnoreCase(src1) || (dst2 != null && dst2.equalsIgnoreCase(src1)) )
			{
				wasAlreadyJoined = true;
				break;
			}
		}
		
		// see discussion of "joinTwoElementTuples"
		int count = 0;
		for(int i = 0; i < joinedTuples.size(); i++)
		{
			if( joinedTuples.get(i)[idx] == null ) count++;
		}
		
		// ... it never appears anywhere in the tuples:
		if( count == joinedTuples.size() ) wasAlreadyJoined = false;
		
		if( wasAlreadyJoined )
		{
			for(int i = 0; i < joinedTuples.size(); i++)
			{
				boolean found = false;
				
				for(int j = 0; j < tupleList.size(); j++)
				{
					if( joinedTuples.get(i)[idx] == tupleList.get(j)[0] )
					{
						found = true;
						break;
					}
				}
				
				if( !found )
				{
					joinedTuples.remove(i);
					i--;
				}
			}
		}
		else
		{
			int size = tupleList.size();
					
			if( size == 1)
			{
				for(int i = 0; i < joinedTuples.size(); i++)
					joinedTuples.get(i)[idx] = tupleList.get(0)[0];
			}
			else
			{
				int joinedSize = joinedTuples.size();
				
				// simply clone the finalTuple list n-1 times, where n = sizeOf(tupleList):
				List<EObject[]> copy = ConditionProcessorHelper.createDeepCopyOfTupleList(joinedTuples);
				for(int i = 0; i < size-1; i++)
					joinedTuples.addAll(ConditionProcessorHelper.createDeepCopyOfTupleList(copy));
				
				for(int i = 0; i < joinedTuples.size(); i++)
					joinedTuples.get(i)[idx] = tupleList.get(i/joinedSize)[0];
			}
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void removeUnJoinableTuples()
	{
		if( finalTuples.isEmpty() ) return;
		
		int tupleSize = finalTuples.get(0).length;
		
		for(int i = 0; i < finalTuples.size(); i++)
		{
			for(int j = 0; j < tupleSize; j++)
			{
				if( finalTuples.get(i)[j] == null)
				{
					finalTuples.remove(i);
					i--;
					break;
				}
			}
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void removeOutdatedTuples(Rule rule, List<BaseCondition> conditions, List<List<EObject>> results, List<List<EObject[]>> tuples)
	{
		for(int i = 0; i < tuples.size(); i++)
		{
            String[] src = conditions.get(i).getSource().split("::");
            int srcIdx = ElementResolver.getIndexForElement(rule, src[0]);
            
            for(int j = 0; j < tuples.get(i).size(); j++)
            {
				if( !results.get(srcIdx).contains(tuples.get(i).get(j)[0]) )
				{
					tuples.get(i).remove(j);
					j--;
				}
            }
            
            if( ElementResolver.hasTarget(conditions.get(i)) )
            {
	            String[] dst = conditions.get(i).getTarget().split("::");
	            int dstIdx = ElementResolver.getIndexForElement(rule, dst[0]);
	            
	            for(int j = 0; j < tuples.get(i).size(); j++)
	            {
					if( !results.get(dstIdx).contains(tuples.get(i).get(j)[1]) )
					{
						tuples.get(i).remove(j);
						j--;
					}
	            }
            }
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
		
	public void removeDuplicatedTuples()
	{
		if( finalTuples.isEmpty() ) return;
		
		int size = finalTuples.get(0).length;
		
		for(int i = 0; i < finalTuples.size(); i++)
		{
			for(int j = 0; j < finalTuples.size(); j++)
			{
				if( i == j ) continue;
				
				int count = 0;
				
				for(int k = 0; k < size; k++)
					if( finalTuples.get(i)[k] == finalTuples.get(j)[k] )
						count++;
				
				if( count == size )
				{
					finalTuples.remove(i);
					i--;
					break;
				}
			}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public void fixImpactTuples(Rule rule, List<List<EObject>> results, List<BaseCondition> conditions)
	{
		for(int i = 0; i < rule.getElements().size(); i++)
		{
			boolean elementCoveredByConditions = false;
			
			for(int j = 0; j < conditions.size(); j++)
			{
				if( conditions.get(j).getSource().contains(rule.getElements().get(i).getAlias()) )
				{
					elementCoveredByConditions = true;
					break;
				}
				if( ElementResolver.hasTarget(conditions.get(j)) && conditions.get(j).getTarget().contains(rule.getElements().get(i).getAlias()) )
				{
					elementCoveredByConditions = true;
					break;
				}
			}
			
			if( elementCoveredByConditions ) continue;
			else
			{
				for(int j = 0; j < finalTuples.size(); j++)
					finalTuples.get(j)[i] = results.get(i).get(0);
			}
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////

	@Override
    public void run(ECPProject newProject, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples)
    {
        printToLog("run", "start joining tuples for rule \""+rule.getRuleID()+"\"");
        
    	finalTuples.clear();
    	
    	if( !tuples.isEmpty() )
    	{    	
			// get the BaseConditions:
			List<BaseCondition> conditions = new ArrayList<BaseCondition>();
			List<EObject> helper = accessLayer.getAllChildren(rule.getConditions());
		
			for(int i = 0; i < helper.size(); i++)
				if( helper.get(i) instanceof BaseCondition )
					conditions.add((BaseCondition) helper.get(i));
	    	
			// remove the out-dated tuples:
			removeOutdatedTuples(rule, conditions, results, tuples);
	    	
			joinLogicCondition(rule, rule.getConditions(), conditions, tuples, finalTuples);
			
			// some impact rules contain elements that are not addressed by conditions, hence these tuples would be removed
			// -> we have to add them manually
			if( rule.getActions().get(0).getActionType() == ActionType.REPORT_IMPACT ) fixImpactTuples(rule, results, conditions);
			
			// remove tuples that could not be joined:
			removeUnJoinableTuples();
			
			// remove duplicated tuples:
			removeDuplicatedTuples();
    	}
    	
        printToLog("run", "... finished joining tuples for rule \""+rule.getRuleID()+"\"");
    }
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinLogicCondition(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples)
	{
		LogicConditionType type = condition.getType();
		
		switch(type)
		{
			case AND : joinAND(rule, condition, conditions, tuples, joinedTuples); break;
			case OR  : joinOR(rule, condition, conditions, tuples, joinedTuples); break;
			case NOT : joinAND(rule, condition, conditions, tuples, joinedTuples); break;
			case XOR : joinOR(rule, condition, conditions, tuples, joinedTuples); break;
			default : break;
		}
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinAND(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples)
	{	
		for(int i = 0; i < condition.getBaseConditions().size(); i++)
		{
			int index = conditions.indexOf(condition.getBaseConditions().get(i));

			// check whether this is the first tuple-list to be processed:
			if( joinedTuples.isEmpty() ) 
			{
				joinFirstTupleList(joinedTuples, tuples.get(index), conditions, index, rule);
				continue;
			}
			
			if( ElementResolver.hasTarget(conditions.get(index)) ) joinTwoElementTuples(joinedTuples, tuples.get(index), index, conditions, rule);
			else joinOneElementTuples(joinedTuples, tuples.get(index), index, conditions, rule);
		}
		
		for(int i = 0; i < condition.getLogicConditions().size(); i++) 
			joinLogicCondition(rule, condition.getLogicConditions().get(i), conditions, tuples, joinedTuples);
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinOR(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples)
	{		
		List<List<EObject[]>> tupleCopies = new ArrayList<List<EObject[]>>();
		
		int baseSize = condition.getBaseConditions().size();
		int logicSize = condition.getLogicConditions().size();
		int size = baseSize+logicSize;
		
		for(int i = 0; i < size; i++) 
			tupleCopies.add(ConditionProcessorHelper.createDeepCopyOfTupleList(joinedTuples));
			
		for(int i = 0; i < baseSize; i++)
		{
			int index = conditions.indexOf(condition.getBaseConditions().get(i));
			
			// check whether this is the first tuple-list to be processed:
			if( tupleCopies.get(i).isEmpty() ) 
			{
				joinFirstTupleList(tupleCopies.get(i), tuples.get(index), conditions, index, rule);
				continue;
			}
			
			if( ElementResolver.hasTarget(conditions.get(index)) ) joinTwoElementTuples(tupleCopies.get(i), tuples.get(index), index, conditions, rule);
			else joinOneElementTuples(tupleCopies.get(i), tuples.get(index), index, conditions, rule);
		}
				
		for(int i = 0; i < logicSize; i++) 
			joinLogicCondition(rule, condition.getLogicConditions().get(i), conditions, tuples, tupleCopies.get(i+baseSize));
		
		joinedTuples.clear();
		
		for(int i = 0; i < size; i++)
			joinedTuples.addAll(tupleCopies.get(i));
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	public void joinFirstTupleList(List<EObject[]> joinedTuples, List<EObject[]> tupleList, List<BaseCondition> conditions, int index, Rule rule)
	{
		int srcIdx = -1;
		int dstIdx = -1;
		
		if( conditions.get(index).getSource().contains("::") ) srcIdx = ElementResolver.getIndexForElement(rule, conditions.get(index).getSource().split("::")[0]);
		else srcIdx = ElementResolver.getIndexForElement(rule, conditions.get(index).getSource());
			
		if( ElementResolver.hasTarget(conditions.get(index)) )
		{
			if( conditions.get(index).getTarget().contains("::") ) dstIdx = ElementResolver.getIndexForElement(rule, conditions.get(index).getTarget().split("::")[0]);
			else dstIdx = ElementResolver.getIndexForElement(rule, conditions.get(index).getTarget());
		}
		
		for(int i = 0; i < tupleList.size(); i++)
		{
			int tupleLenght = rule.getElements().size();
			joinedTuples.add(new EObject[tupleLenght]);
			
			joinedTuples.get(i)[srcIdx] = tupleList.get(i)[0];
			if( dstIdx > -1 ) joinedTuples.get(i)[dstIdx] = tupleList.get(i)[1];
		}
	}
}
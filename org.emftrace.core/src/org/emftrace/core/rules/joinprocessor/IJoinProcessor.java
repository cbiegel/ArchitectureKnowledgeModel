/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.joinprocessor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.rules.processingcomponent.IProcessingComponent;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * Provides the interface for the join-processing component which is
 * responsible for joining the tuples computed by executing the
 * rules
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IJoinProcessor extends IProcessingComponent 
{
	/**
	 * Returns the final set of tuples
	 * 
	 * @return the final set of tuples
	 */
	public List<EObject[]> getFinalTuples();
	
	/**
	 * Prepares a deep-copy of a tuple
	 * 
	 * @param tuple the tuple to be cloned
	 * @return      a deep-copy of the tuple
	 */
	public EObject[] cloneTuple(EObject[] tuple);
	
	/**
	 * Counts how often a certain element appears in a tuple-list
	 * 
	 * @param list         the tuple-list to be searched
	 * @param position     the position of the element in a tuple
	 * @param model        the element that is searched
	 * @param positionList the list of positions where the element occurs
	 * @return             the number of occurrences of a element
	 */
	public int countOccurrences(List<EObject[]> list, int position, EObject model, List<Integer> positionList);
	
	/**
	 * Joins tuple-lists belonging to "two-element" conditions
	 * 
	 * @param joinedTuples the list of already joined tuples
	 * @param tupleList    the current tuple-list 
	 * @param index        the index of the current condition to which the tuple list belongs
	 * @param conditions   the list of all BaseConditions of a rule
	 * @param rule         the current rule
	 */
	public void joinTwoElementTuples(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int index, List<BaseCondition> conditions, Rule rule);
	
	/**
	 * Joins a two-element tuple where one of the elements has been joined already
	 * 
	 * @param joinedTuples the list of already joined tuples
	 * @param tupleList    the current tuple-list
	 * @param srcIdx       the position of the first tuple element
	 * @param dstIdx       the position of the second tuple element
	 * @param tuplePos     marks the position in the tuple that was already joined
	 */
	public void joinTwoElementTuplesWhereOneWasAlreadyJoined(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int srcIdx, int dstIdx, int tuplePos);
	
	/**
	 * Joins "one-element-only" tuple-lists with the remaining tuples
	 *
	 * @param joinedTuples the list of already joined tuples
	 * @param tupleList    the current tuple-list
	 * @param index        the index of the current condition to which the tuple list belongs
	 * @param conditions   a list of all BaseConditions of a rule
	 * @param rule         the current rule
	 */
	public void joinOneElementTuples(List<EObject[]> joinedTuples, List<EObject[]> tupleList, int index, List<BaseCondition> conditions, Rule rule);
		
	/**
	 * Removes all tuples that cannot be joined with other tuples
	 */
	public void removeUnJoinableTuples();
	
	/**
	 * Removes duplicated tuples
	 */
	public void removeDuplicatedTuples();
	
	/**
	 * Removes all tuples still containing elements that are no longer contained by the result-lists
	 * 
	 * @param rule       the current rule
	 * @param conditions all base conditions of the rule
	 * @param results    the current results
	 * @param tuples     the current tuples
	 */
	public void removeOutdatedTuples(Rule rule, List<BaseCondition> conditions, List<List<EObject>> results, List<List<EObject[]>> tuples);
	
	/**
	 * Removes elements from tuple-lists to be joined which do not appear in the other list
	 * 
	 * @param tupleList1 the first tuple list
	 * @param tupleList2 the second tuple list
	 * @param srcIdx     the index of the source element
	 * @param dstIdx     the index of the target element
	 * @param pos        the position of the element in the tuple
	 */
	public void cleanTupleList(List<EObject[]> tupleList1, List<EObject[]> tupleList2, int srcIdx, int dstIdx, int pos);
	
	/**
	 * Joins the tuple-lists belonging to a certain {@LogicCondition}
	 * 
	 * @param rule         the current rule
	 * @param condition    the current logic condition 
	 * @param conditions   all base conditions of the rule
	 * @param tuples       all tuples of the rule
	 * @param joinedTuples the already joined tuples
	 */
	public void joinLogicCondition(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples);
	
	/**
	 * Joins the first tuple list into the final list of tuples
	 * 
	 * @param joinedTuples the already joined tuples (empty so far)
	 * @param tupleList    the current tuples
	 * @param conditions   all base conditions of the rule
	 * @param index        the index of the current condition
	 * @param rule         the current rule
	 */
	public void joinFirstTupleList(List<EObject[]> joinedTuples, List<EObject[]> tupleList, List<BaseCondition> conditions, int index, Rule rule);
	
	/**
	 * Joins all tuples belonging to an AND-{@link LogicCondition condition}. This function also applies for NOT.
	 *  
	 * @param rule         the current rule
	 * @param condition    the current logic condition
	 * @param conditions   all base conditions of the rule
	 * @param tuples       all tuple-lists belonging to a rule
	 * @param joinedTuples the already joined tuples
	 */
	public void joinAND(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples);
	
	/**
	 * Joins all tuples belonging to an OR-{@link LogicCondition condition}
	 * 
	 * @param rule         the current rule
	 * @param condition    the current logic condition
	 * @param conditions   all base conditions of the rule
	 * @param tuples       all tuple-lists belonging to a rule
	 * @param joinedTuples the already joined tuples
	 */
	public void joinOR(Rule rule, LogicCondition condition, List<BaseCondition> conditions, List<List<EObject[]>> tuples, List<EObject[]> joinedTuples);
}

/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.conditionprocessor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.rules.processingcomponent.IProcessingComponent;

import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * Provides the interface for the optimizer-component. This component removes elements
 * from the final result list BEFORE any tuple is computed to decrease the amount of
 * "false-positive" tuples which have to be removed afterwards. Currently, the interface
 * is very similar to IRuleProcess as it applies rules to filter out unrelated elements.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IConditionProcessor extends IProcessingComponent
{   
    /**
     * Compares two {@link EObject models} if they share a common {@link EAttribute attribute}
     * with the same value
     * 
     * @param source             a list of possible results for one query-element
     * @param sourceAttribute    the name of the source-attribute
     * @param sourceRefAttribute the name of the attribute queried from the source-reference (sourceAttribute = reference)
     * @param target             a list of possible results for one query-element
     * @param targetAttribute    the name of the target-attribute
     * @param targetRefAttribute the name of the attribute queried from the target-reference (targetAttribute = reference)
     * @param type               the type of the condition that should be applied
     * @return true if the condition is met
     */
    public boolean executeCompareCondition(List<EObject> source, String sourceAttribute,
                                           List<EObject> target, String targetAttribute,
                                           BaseConditionType type, List<EObject[]> tuples);
 
    /**
     * Checks whether an {@link EAttribute attribute} of an {@link EObject model}
     * matches a certain value
     * 
     * @param element      a list of possible results for the query-element
     * @param attribute    the name of the attribute
     * @param attributeRef the name of the attribute queried from the attribute-reference (attribute = reference)
     * @param value        the value of the attribute
     * @param type         the type of the condition that should be applied
     * @return true if the condition is met
     */
    public boolean executeCompareCondition(List<EObject> element, String attribute, String value, BaseConditionType type, List<EObject[]> tuples);
    
    /**
     * Checks whether a parent-child relation exists between two {@link EObject models}
     *  
     * @param parent the possible parent element
     * @param child  the possible child element
     * @return true if the condition is met
     */
    public boolean isParent(List<EObject> parent, List<EObject> child, boolean allowIndirectChildren, List<EObject[]> tuples);
    
    /**
     * Checks whether two {@link EObject models} are equal, or if a model matches the reference of another model.
     * 
     * @param source    the source model
     * @param target    the target model
     * @param sourceRef the name of the source-reference
     * @param targetRef the name of the target-reference
     * @return true if both models/references are the same
     */
    public boolean isModelEqual(List<EObject> source, List<EObject> target, String sourceRef, String targetRef, List<EObject[]> tuples);
    
    /**
     * Checks whether two {@link EObject models} are interconnected by a {@link TraceLink dependency relation}
     * 
     * @param source             the source model
     * @param target             the target model
     * @param relationType       the type of relation between both models
     * @param tuples             the current list of tuples
     * @param directionSensitive determines whether the direction of the dependency shall be considered
     * @return true if such a relation exists 
     */
    public boolean areRelated(List<EObject> source, List<EObject> target, String relationType, List<EObject[]> tuples, boolean directionSensitive);
    
    /**
     * Checks whether two {@link EObject models} are indirectly interconnected by a chain of {@link TraceLink dependency relations}
     * 
     * @param source       the source model
     * @param target       the target model
     * @param relationType the type of relation between both models
     * @param tuples       the current list of tuples
     * @return true if such a relation exists 
     */
    public boolean areIndirectlyRelated(List<EObject> source, List<EObject> target, String relationType, List<EObject[]> tuples);
        
    /**
     * Executes an base-condition specified by a {@link Rule}
     * 
     @param rule        the current rule
     * @param results   the list of results for this rule
     * @param condition the current base condition
     * @return true if the condition is met
     */
    public boolean executeBaseCondition(Rule rule, List<List<EObject>> results, BaseCondition condition, List<EObject[]> tuples);
    
    /**
     * Executes an boolean-condition specified by a {@link Rule}
     * 
     * @param rule      the current rule
     * @param results   the list of results for this rule
     * @param condition the current boolean condition
     * @return true if the condition is met
     */
    public boolean executeLogicCondition(Rule rule, List<List<EObject>> results, LogicCondition condition, List<List<EObject[]>> tuples);
}
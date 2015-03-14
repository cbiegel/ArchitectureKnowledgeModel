/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.validator;

import java.util.List;

import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.core.tracecomponent.ITraceComponent;

/**
 * This component is responsible for validating {@link Rule Rules}
 * before applying them on {@link ModelElement ModelElements}
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IRuleValidator extends ITraceComponent
{
    /**
     * Validates a {@link ElementDefinition} contained by a {@link Rule}
     * 
     * @param elementDefinition the current ElementDefinition
     * @param elements          a list of all defined elements
     * @return                  false if the validation fails
     */
    public boolean checkElementDefinition(ElementDefinition elementDefinition, List<String> elements);
    
    /**
     * Validates a {@link ActionDefinition} contained by a {@link Rule}
     * 
     * @param project          the current project
     * @param actionDefinition the current ActionDefinition
     * @param elements         a list of all defined elements
     * @return                 false if the validation fails
     */
    public boolean checkActionDefinition(ECPProject project, ActionDefinition actionDefinition, List<String> elements);
    
    /**
     * Validates a {@link LogicCondition} contained by a {@link Rule}
     * 
     * @param logicCondition the current LogicCondition
     * @param elements       a list of all defined elements
     * @return               false if the validation fails
     */
    public boolean checkLogicCondition(LogicCondition logicCondition, List<String> elements);
    
    /**
     * Validates a {@link BaseCondition} contained by a {@link Rule}
     * 
     * @param baseCondition the current BaseCondition
     * @param elements      a list of all defined elements
     * @return              false if the validation fails
     */
    public boolean checkBaseCondition(BaseCondition baseCondition, List<String> elements);
    
    /**
     * Validates a {@link Rule}
     * 
     * @param project the current project
     * @param rule    the current Rule
     * @return        false if the validation fails
     */
    public boolean validateRule(ECPProject project, Rule rule); 
}
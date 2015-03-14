/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.elementprocessor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.processingcomponent.IProcessingComponent;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * Provides the interface for the element-processing component which is
 * responsible for gathering the required elements from EMFStore
 *  
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IElementProcessor extends IProcessingComponent
{    
    /**
     * Define token for name-checking:
     */
    public final static String seperator  = "\\|";
    public final static String allClasses = "*";
    
    /**
     * Adds suitable elements to an {@link List list} of {@link EObject models} that match
     * the declaration in the rule
     * 
     * @param project the current project
     * @param name    the name of the class 
     * @param result  the current list of results
     */
    public void retrieveElements(ECPProject project, String name, List<EObject> result);
    
    /**
     * Sorts the input into {@link List lists} of {@link EObject models} that match their type
     * 
     * @param project the current project
     * @param rule    the current rule  
     * @param models  a list of all models where rules should be applied upon
     * @param result  the current list of results
     */
    public void retrieveElements(ECPProject project, Rule rule, List<EObject> models, List<List<EObject>> results);
        
    /**
     * The overloaded run-method of this component
     * 
     * @param project the current project
     * @param rule    the current rule 
     * @param results the current list of results
     * @param models  a list of all models where rules should be applied upon
     * @param tuples  the list of all created tuples
     */
    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject> models, List<List<EObject[]>> tuples);
}

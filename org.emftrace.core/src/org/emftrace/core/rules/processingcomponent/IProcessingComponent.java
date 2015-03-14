/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.processingcomponent;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.ITraceComponent;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * This is the interface for all rule-processing components
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IProcessingComponent extends ITraceComponent
{
    /**
     * The actual run-method of this component. 
     * 
     * @param project the current project
     * @param rule    the current rule
     * @param results the list of results for this rule
     * @param tuples  the list of all created tuples
     */
    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples);
    
    /**
     * Returns the size of each n-gram the input will be split into
     * 
     * @return the size of each n-gram
     */
    public int getN();
    
    /**
     * Sets the size of each n-gram the input will be split into
     * 
     * @param newN the new size of the n-grams
     */
    public void setN(int newN);
    
    /**
     * Returns the minimum correlation that is required to match
     * to texts
     * 
     * @return the minimum correlation for pattern-matching
     */
    public float getCorrelation();
    
    /**
     * Sets the minimum correlation that is required to match
     * to texts
     * 
     * @param newCorrelation the correlation-factor
     */
    public void setCorrelation(float newCorrelation);
}
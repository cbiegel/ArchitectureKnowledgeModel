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
import org.emftrace.core.tracecomponent.TraceComponent;
import org.emftrace.metamodel.RuleModel.Rule;

public class ProcessingComponent extends TraceComponent implements IProcessingComponent
{
    /**
     * The factor for n-gram checks
     */
    protected int n;
    
    /**
     * The required correlation for n-gram checks
     */
    protected float correlation;
    
    /**
     * Constructor
     */
    public ProcessingComponent(String name)
    {
        super(name);
        n = 3;
        correlation = 0.75f;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public int getN()
    {
        return n;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void setN(int newN)
    {
        n = newN;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public float getCorrelation()
    {
        return correlation;        
    }    

    ///////////////////////////////////////////////////////////////////////////
    
    public void setCorrelation(float newCorrelation)
    {
        correlation = newCorrelation;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples)
    {        
    }
}

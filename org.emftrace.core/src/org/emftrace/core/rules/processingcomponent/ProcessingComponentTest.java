/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.processingcomponent;

import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;


/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ProcessingComponentTest extends EMFTraceBaseTest
{
    protected ProcessingComponent component;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        component = new ProcessingComponent("Test");
        component.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testGetN()
    {
        assertEquals(3, component.getN());
    }
    
    @Test
    public void testSetN()
    {
        assertEquals(3, component.getN());
        component.setN(2);
        assertEquals(2, component.getN());
    }
    
    @Test 
    public void testGetCorrelation()
    {
        assertEquals(0.75f, component.getCorrelation());
    }
    
    @Test
    public void testSetCorrelation()
    {
        assertEquals(0.75f, component.getCorrelation());
        component.setCorrelation(0.5f);
        assertEquals(0.5f, component.getCorrelation());        
    }
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.tracecomponent;

import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;


/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TraceComponentTest extends EMFTraceBaseTest
{
    protected TraceComponent traceComponent;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        traceComponent = new TraceComponent();
        traceComponent.registerAccessLayer(accessLayer);
    }

    @Test
    public void testDisconnectAccesslayer()
    {
        traceComponent.disconnectAccessLayer();
        assertNull("Result", traceComponent.getAccessLayer());
    }

    @Test
    public void testEnableLogging()
    {
        traceComponent.enableLogging(true);
        assertTrue(traceComponent.isLoggingEnabled());
        traceComponent.enableLogging(false);
        assertTrue(!traceComponent.isLoggingEnabled());
    }
    
    @Test
    public void testisLoggingEnabled()
    {
        traceComponent.enableLogging(true);
        assertTrue(traceComponent.isLoggingEnabled());
        traceComponent.enableLogging(false);
        assertTrue(!traceComponent.isLoggingEnabled());
    }

    @Test
    public void testGetName()
    {
        traceComponent.setName("TestComp");
        assertEquals("Result", "TestComp", traceComponent.getName());
    }

    @Test
    public void testPrintToLogStringString()
    {
        assertTrue(true);
    }

    @Test
    public void testPrintToLogString()
    {
        assertTrue(true);
    }

    @Test
    public void testRegisterAccessLayer()
    {
        assertNotNull("Result", traceComponent.getAccessLayer());
        assertSame(accessLayer, traceComponent.getAccessLayer());
    }

    @Test
    public void testSetName()
    {
        traceComponent.setName("TestComp");
        assertEquals("Result", "TestComp", traceComponent.getName());
        traceComponent.setName("Testing");
        assertEquals("Result", "Testing", traceComponent.getName());
    }
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;


/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class InputValidatorTest extends EMFTraceBaseTest
{
    @Test
    public void testCheckFloatInput()
    {
        assertTrue(InputValidator.checkFloatInput("1.0"));
        assertTrue(InputValidator.checkFloatInput("0.5"));
        assertTrue(InputValidator.checkFloatInput("-1.0"));
        assertTrue(InputValidator.checkFloatInput("-0.5"));
        assertTrue(InputValidator.checkFloatInput("1"));
        assertTrue(InputValidator.checkFloatInput("-1"));
        assertFalse(InputValidator.checkFloatInput(""));
        assertFalse(InputValidator.checkFloatInput("Taffer!"));
        assertFalse(InputValidator.checkFloatInput("123...Test"));
    }
}
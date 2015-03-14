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
public class NGramCheckTest extends EMFTraceBaseTest
{

    @Test
    public void testCreateNGram()
    {
        assertEquals(5, NGramCheck.createNGram(2, "book").length);
        assertEquals(5, NGramCheck.createNGram(3, "book").length);
                
        String[] ngrams = NGramCheck.createNGram(3, "book");
        assertEquals(5, ngrams.length);
        assertEquals("§bo", ngrams[0]);
        assertEquals("boo", ngrams[1]);
        assertEquals("ook", ngrams[2]);
        assertEquals("ok§", ngrams[3]);
        assertEquals("k§§", ngrams[4]);        
        String[] ngrams2 = NGramCheck.createNGram(2, "book");
        assertEquals(5, ngrams2.length);
        assertEquals("§b", ngrams2[0]);
        assertEquals("bo", ngrams2[1]);
        assertEquals("oo", ngrams2[2]);
        assertEquals("ok", ngrams2[3]);
        assertEquals("k§", ngrams2[4]);
    }

    @Test
    public void testCompareWords()
    {        
        assertTrue(NGramCheck.compareWords(3, "wirk", "work", 0.3f));
        assertTrue(NGramCheck.compareWords(3, "work", "work", 1.0f));
        assertFalse(NGramCheck.compareWords(3, "working", "work", 0.5f));
        assertFalse(NGramCheck.compareWords(3, "", "work", 0.5f));
        assertFalse(NGramCheck.compareWords(3, "work", "work", 1.1f));
        assertFalse(NGramCheck.compareWords(3, "work", "work", -0.1f));
        assertFalse(NGramCheck.compareWords(1, "work", "work", 0.4f));
    }
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

/**
 * A helper-class for computing similarities between text-patterns
 * using the N-Gram-algorithm
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class NGramCheck
{
	private static final String symbol = "§";
    /**
     * Creates all n-grams for a certain text input 
     * 
     * @param n     the number of computed sub-patterns
     * @param input the input text
     * @return an array of n-grams
     */
    public static String[] createNGram(int n, String input)
    {
        int k = input.length()+1;
        String[] nGrams = new String[k];
        
        int idx = 0;
        for(int i = 0; i < k; i++)
        {
            nGrams[i] = "";
            
            if( i == 0 ) 
            {
                nGrams[i] = symbol;
                for(int j = 0; j < n-1; j++) 
                {
                	if( j < input.length() ) nGrams[i] += input.charAt(j);
                	else nGrams[i] += symbol;
                }
            }
            else
            {
                for(int j = 0; j < n; j++) 
                {
                    if( (idx + j) < input.length() ) nGrams[i] += input.charAt(idx+j);
                    else nGrams[i] += symbol;
                }
                
                if( idx < input.length() ) idx++;
            }      
        }
        
        return nGrams;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Performs a similarity-check between two texts
     * 
     * @param n              the number of computed sub-patterns
     * @param text1          the first input text
     * @param text2          the second input text
     * @param minCorrelation defines how many n-grams should match
     * @return true if both words match with a correlation >= minCorrelation
     */
    public static boolean compareWords(int n, String text1, String text2, float minCorrelation)
    {
        if( n < 2 || minCorrelation < 0.0f || minCorrelation > 1.0f ) return false;
        if( text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty() ) return false;
        
        String[] nGrams1 = createNGram(n, text1);
        String[] nGrams2 = createNGram(n, text2);
                
        int numberOfMatches = 0;
        for(int i = 0; i < nGrams1.length; i++)
            for(int j = 0; j < nGrams2.length; j++)
                if( nGrams1[i].equalsIgnoreCase(nGrams2[j]) )
                    numberOfMatches++;
        
        float correlation = (float)(2*numberOfMatches) / (float)(nGrams1.length+nGrams2.length);
                
        if( correlation >= minCorrelation ) return true;
        else return false;
    } 
}
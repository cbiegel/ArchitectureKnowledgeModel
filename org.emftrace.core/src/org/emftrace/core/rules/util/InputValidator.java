/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.util;

import java.util.regex.Pattern;

/**
 * A helper class to check whether a input
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class InputValidator
{
    /**
     * Those 4 Strings are used to verify whether a given String encodes a
     * valid float-value.
     * This code was taken from the Java Documentation:
     * http://download.oracle.com/javase/6/docs/api/java/lang/Double.html#valueOf%28java.lang.String%29 
     */
    private final static String Digits     = "(\\p{Digit}+)";
    private final static String HexDigits  = "(\\p{XDigit}+)";
    private final static String Exp        = "[eE][+-]?" + Digits;
    private final static String fpRegex    = ("[\\x00-\\x20]*" + "[+-]?(" + "NaN|" + "Infinity|" + 
                                              "((("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|"+
                                              "(\\.("+Digits+")("+Exp+")?)|"+
                                              "((" + "(0[xX]" + HexDigits + "(\\.)?)|" +
                                              "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +
                                              ")[pP][+-]?" + Digits + "))" +
                                              "[fFdD]?))" + "[\\x00-\\x20]*"); 
    
    /**
     * Checks whether a String encodes a float-value
     * 
     * @param number the float-value encoded as String
     * @return true if the number-string is a valid float
     */
    public static boolean checkFloatInput(String number)
    {              
        return Pattern.matches(fpRegex, number); 
    }
}

/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 
package org.emftrace.quarc.ui.helpers;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * Helper to store the default Colors
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class DefaultColors {

	/**
	 * @param value a rating value (-100.0f..100.0f)
	 * @return the default Color for the background of a widget for the specified rating value
	 */
	public static Color getBackgroundColor(float value){
		if (value < -75f)
			return	new Color(Display.getDefault(), 255,0,0);
		else if (value < -25f)
			return	new Color(Display.getDefault(), 255,150,100);
		else if (value < 0f)
			return	new Color(Display.getDefault(), 210,255,210);
		else if (value == 0.0f)
			return	new Color(Display.getDefault(), 255,255,255);
		else if (value <= 25.0f)
			return	new Color(Display.getDefault(), 210,255,210);
		else if (value <= 75.0f)
			return	new Color(Display.getDefault(), 150,255,150);
		else 
			return	new Color(Display.getDefault(), 0,255,0);
	}

	/**
	 * @param value a rating value (-100.0f..100.0f)
	 * @return the default Color for the foreground of a widget for the specified rating value
	 */
	public static Color getForegroundColor(float value) {
		if (value < -75f)
			return	new Color(Display.getDefault(), 255, 255, 255);
		else if (value < -25f)
			return	new Color(Display.getDefault(), 255, 255, 255);
		else if (value < 0f)
			return	new Color(Display.getDefault(), 255, 255, 255);
		else if (value == 0.0f)
			return	new Color(Display.getDefault(), 0, 0, 0);
		else if (value <= 25.0f)
			return	new Color(Display.getDefault(), 0, 0, 0);
		else if (value <= 75.0f)
			return	new Color(Display.getDefault(), 0, 0, 0);
		else 
			return	new Color(Display.getDefault(), 0, 0, 0);
	}
	
	/**
	 * @param value a rating value (-100.0f..100.0f)
	 * @return the default Color for a connection for the specified rating value
	 */
	public static Color getConnectionColor(float value) {
		if (value < -75f)
			return	new Color(Display.getDefault(), 128,0,0);
		else if (value < -25f)
			return	new Color(Display.getDefault(), 175,25,25);
		else if (value < 0f)
			return	new Color(Display.getDefault(), 200,50,50);
		else if (value == 0.0f)
			return	new Color(Display.getDefault(), 255,255,255);
		else if (value <= 25.0f)
			return	new Color(Display.getDefault(), 50,200,50);
		else if (value <= 75.0f)
			return	new Color(Display.getDefault(), 25,175,25);
		else 
			return	new Color(Display.getDefault(), 0,128,0);
	}

}

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

package org.emftrace.quarc.ui.zest.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;

/**
 * A Figure for a precondition of a ContainedElement
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class PreconditionFigure extends AbstractDecoratorFigure {
	

	/**
	 * the constructor
	 * 
	 * @param preconditions a List with Labels for each Condition
	 */
	public PreconditionFigure(String preconditionString){
		super(formatPreconditionString(preconditionString) ,true, defaultFont,1,1, false);
	   
	}
	
	/**
	 * converts a List with labels for conditions to a single string
	 * @param preconditions a List with labels for each Condition
	 * @return a
	 */
	private static String formatPreconditionString(String preconditionString) {

		return "  "+ preconditionString + " ";
	}

	/* (non-Javadoc)
	 * @see quarc_gssguicore.zest.figures.AbstractDecoratorFigure#createBody(org.eclipse.swt.graphics.Font)
	 */
	@Override
	protected void createBody(Font font){
		super.createBody(font);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	@Override
	  protected void paintFigure(Graphics g) {
	  super.paintFigure(g);

	  Rectangle r = getClientArea(); 
	  
	  PointList points = new PointList();
	  points.addPoint(r.x+20, r.y) ;
	  points.addPoint(r.x + r.width - 20, r.y) ;
	  points.addPoint(r.x + r.width - 20, r.y +r.height) ;
	  points.addPoint(r.x+20 , r.y +r.height) ;

	  g.setLineStyle(SWT.LINE_DOT);
	  	  
	  g.drawPolygon(points);

	}
	
}

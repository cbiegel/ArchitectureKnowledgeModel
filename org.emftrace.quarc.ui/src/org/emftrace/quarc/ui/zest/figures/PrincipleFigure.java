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

/**
 * A Figure for a Principle
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class PrincipleFigure extends AbstractDecoratorFigure {
	

	/**
	 * the constructor
	 * 
	 * @param name the name of the element
	 * @param isExpandable node is expandable or not
	 */
	public PrincipleFigure(String name, boolean isExpandable) {
			super(name,6,1, isExpandable);
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
		points.addPoint(r.x+ r.width-1, r.y) ;
		points.addPoint(r.x+ r.width - 20, r.y + r.height-1) ;
		points.addPoint(r.x, r.y + r.height-1) ;

		drawAndFillFigureBorder(g, points);
		}
		
}
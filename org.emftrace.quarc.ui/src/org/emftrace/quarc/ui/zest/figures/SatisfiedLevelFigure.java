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

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;

/**
 * A Figure for decorating a node with satisfied known form GRL
 * 
 * @author Daniel Motschmann
 *
 */
public class SatisfiedLevelFigure extends Figure { 
	
	
	/**
	 * the label used to draw the level of the satisfaction 
	 */
	private Label satisfiedLevelLabel;
	
	/**
	 * the level of the satisfaction (-100.0f..100.0f)
	 */
	private Float satisfiedLevel;

	/**
	 * the constructor
	 * @param satisfiedLevel the level of the satisfaction (-100.0f..100.0f)
	 */
	public SatisfiedLevelFigure(Float satisfiedLevel) {
		super();

	 this.satisfiedLevel = satisfiedLevel;
		ToolbarLayout layout = new ToolbarLayout(); 
		layout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
		
		setLayoutManager(layout);
		setOpaque(false);

		satisfiedLevelLabel = new Label();

		satisfiedLevelLabel.setLabelAlignment(PositionConstants.LEFT);
		setLayoutManager(layout);
		setOpaque(false);
		
		drawSatisfiedLevel(satisfiedLevel);
		add(satisfiedLevelLabel);
		
		setSize(-1, -1);
	}
	
	/**
	 * setter for the level of the satisfaction 
	 * @param satisfiedLevel the level of the satisfaction (-100.0f..100.0f)
	 */
	public void setSatisfiedLevel(Float satisfiedLevel){
		this.satisfiedLevel = satisfiedLevel;
		drawSatisfiedLevel(satisfiedLevel);
	}
	
	/**
	 * @return the currently shown satisfied level
	 */
	public float getSatisfiedLevel(){
		return this.satisfiedLevel;
	}

	/**
	 * (re)draws the satisfied level
	 * @param satisfiedLevel the satisfied level 
	 */
	private void drawSatisfiedLevel(Float satisfiedLevel){
		satisfiedLevelLabel.setText(String.valueOf(satisfiedLevel));
		setSize(-1, -1);
		repaint();
	}
}

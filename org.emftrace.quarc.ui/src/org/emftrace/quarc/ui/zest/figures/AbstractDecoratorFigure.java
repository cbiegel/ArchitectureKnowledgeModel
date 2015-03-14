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
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.emftrace.quarc.ui.zest.figures.listeners.IExpandListener;




/**
 * Abstract Figure for decorating a Zest GraphNode
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class AbstractDecoratorFigure extends Figure {

	
	/**
	 * the caption for the Element
	 */
	protected String name;
	
	/**
	 * the importance of the Element
	 */
	protected Float importance;
	
	/**
	 * node is highlighted or not
	 */
	protected boolean isHighlighted;
	
	
	/**
	 * the default font size 
	 */
	final protected static int defaultFontSize  = 8;
	
	/**
	 * the default font for any contents 
	 */
	final protected static Font defaultFont = new Font(null, "Arial", defaultFontSize, SWT.NORMAL);
	
	/**
	 * the default font for the name
	 */
	final protected static Font defaultTitleFont = new Font(null, "Arial", defaultFontSize, SWT.BOLD);
	
	
	/**
	 * the color used to highlight the node
	 */
	protected Color highlightColor;

	
	
	/**
	 * a Figure for the name
	 */
	protected NameFigure nameDecoratorFigure;
	
	/**
	 * @return the NameFigure
	 */
	public NameFigure getNameFigure(){
		return this.nameDecoratorFigure;
	}
	
	/**
	 * should name be formated before drawing the name?
	 */
	protected boolean formatName;

	/**
	 * is node expandable or not
	 */
	protected boolean isExpandable;

	/**
	 * a constructor
	 * 
	 * @param name the name
	 */
	public AbstractDecoratorFigure(String name){
		
		this(name, true, defaultTitleFont, 6, 6, false);
	}
	
	/**
     * a constructor
	 * @param name the name
	 * @param isExpandable node expandable or not
	 */
	public AbstractDecoratorFigure(String name, boolean isExpandable){
		this(name, true, defaultTitleFont, 6, 6, isExpandable);
	}
	
	/**
     * a constructor
	 * 
	 * @param name the name
	 * @param font a for the name
	 */
	public AbstractDecoratorFigure(String name, Font font){
		
		this(name, true, font, 6, 6, false);
	}
	
	/**
     * a constructor
	 * 
	 * @param name the name
	 * @param font a for the name
	 * @param isExpandable node expandable or not
	 */
	public AbstractDecoratorFigure(String name, Font font, boolean isExpandable){
		
		this(name, true, font, 6, 6, isExpandable);
	}
	
	
	/**
     * a constructor
	 * 
	 * @param name the name
	 * @param bottomSpace the size of the gap between the bottom border and the last label
	 * @param topSpace the size of the gap between the top border and the first label
	 */
	public AbstractDecoratorFigure(String name, int bottomSpace, int topSpace ){
		
		this(name, true, defaultTitleFont, bottomSpace, topSpace, false);
	}
	
	/**
     * a constructor
	 * 
	 * @param name the name
	 * @param bottomSpace the size of the gap between the bottom border and the last label
	 * @param topSpace the size of the gap between the top border and the first label
	 * @param isExpandable node expandable or not
	 */
	public AbstractDecoratorFigure(String name, int bottomSpace, int topSpace, boolean isExpandable ){
		
		this(name, true, defaultTitleFont, bottomSpace, topSpace, isExpandable);
	}
	

	/**
     * a constructor
	 * 
	 * @param name the name
	 * @param formatName painted name should be formated or not
	 * @param font a for the name
	 * @param bottomSpace the size of the gap between the bottom border and the last label
	 * @param topSpace the size of the gap between the top border and the first label
	 * @param isExpandable node expandable or not
	 */
	
	public AbstractDecoratorFigure(String name, boolean formatName, Font font, int bottomSpace, int topSpace, boolean isExpandable){
		this.formatName = formatName;
		this.name = name;
		this.isExpandable = isExpandable;
		ToolbarLayout layout = new ToolbarLayout();
	    setLayoutManager(layout);	
	    setOpaque(false);
		Label topSpaceLabel = new Label("");
		topSpaceLabel.setFont(new Font(null, "Arial", topSpace, SWT.NORMAL));

		Label bottomSpaceLabel = new Label("");
		bottomSpaceLabel.setFont(new Font(null, "Arial", bottomSpace, SWT.NORMAL));
		add(topSpaceLabel);
		createBody(font);
		add(bottomSpaceLabel);
		
		isHighlighted = false;
	//	highlightColor = new Color(null,200,200,0);
		
	}
	
	
	/**
	 * creates the figures of the body
	 * @param font a Font for the 
	 */
	protected void createBody(Font font){	
		nameDecoratorFigure = new NameFigure(font,name, isExpandable);
		nameDecoratorFigure.setIsExpanded();
		add(nameDecoratorFigure);
	}
	
	/**
	 * 
	 * formats the specified String by add free spaces before and behind the the text 
	 * 
	 * @param text a String
	 * @return the formated String
	 */
	protected static String formatText(String text){
		return "      " + text + "      "; // 6 free spaces before and behind the text
	}
	
	/**
	 * getter for name
	 * 
	 * @return the name
	 */
	public String getName(){
		return this.name;
	}


	/**
	 * setter for name of the node
	 * 
	 * @param name a new name
	 */
	public void setName(String name){
		this.name = name;
		
		nameDecoratorFigure.setName(name);

		//this.repaint();
	}
	
	/**
	 * setter for name of the node
	 * 
	 * @param name a new name
	 */
	public void setImportance(Float value){
		this.importance = value;
		
	//	setSize(-1,-1);
		nameDecoratorFigure.setImportance(value);
	//	nameDecoratorFigure.repaint();
		
	//	this.repaint();
	}
	
	/**
	 * highlights the node
	 */
	public void highlight() {
		isHighlighted = true;
		this.repaint();
	}

	/**
	 * removes highlighting 
	 */
	public void unhighlight() {
		isHighlighted = false;
		this.repaint();
	}
	@Override
public void repaint(){
		//  System.out.println("AbstractDecoratorFigure.repaint "+ this );
		  
		  super.repaint();
	//	  nameDecoratorFigure.repaint();
		  
}

	/**
	 * @return true if node it highlighted
	 */
	public boolean isHighlighted(){
		return isHighlighted;
	}

	
	/**
	 * setter for Color used to highlight the node
	 * @param c a Color
	 */
	public void setHighlightColor(Color c) {
		this.highlightColor = c;
		
	}
	
	/**
	 * getter for Color used to highlight the node
	 * @return the Color used to highlight the node
	 */
	public Color getHighlightColor() {
		return highlightColor;	
	}
	
	/**
	 * draws and fills the border of the Figure
	 * @param g a draw2d Graphics
	 * @param points a PointList for the border polygon of the Figure
	 */
	protected void drawAndFillFigureBorder(Graphics g, PointList points){
		  if (isHighlighted()) {
			  g.setBackgroundColor(getHighlightColor());
		  } else {
			  g.setBackgroundColor(getBackgroundColor());
		  }
		  
		 g.fillPolygon(points);
		
		g.drawPolygon(points);
	}


	/**
	 * adds the specified ExpandListener
	 * @param expandListener a ExpandListener
	 */
	public void addExpandListener(IExpandListener expandListener) {
		nameDecoratorFigure.addExpandListener(expandListener);
		
	}

	/**
	 * removes the specified ExpandListener
	 * @param expandListener a ExpandListener
	 */
	public void removeExpandListener(IExpandListener expandListener) {
		nameDecoratorFigure.removeExpandListener(expandListener);
	}

	

	/**
	 * @return true if the node is expanded
	 */
	public boolean isExpanded() {
		return nameDecoratorFigure.isExpanded();
	}

	/**
	 * the node to expanded
	 */
	public void setIsExpanded() {
		nameDecoratorFigure.setIsExpanded();
		
	}
	
	/**
	 * the node to collapsed
	 */
	public void setIsCollapsed() {
		nameDecoratorFigure.setIsCollapsed();
	}
	
	/**
	 * setter for the foreground color of the caption
	 * @param c a Color
	 */
	public void setLabelColor(Color c){
		nameDecoratorFigure.setLabelColor(c);
	}
}

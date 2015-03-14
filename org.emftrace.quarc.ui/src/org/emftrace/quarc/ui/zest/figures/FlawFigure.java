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

import java.util.ArrayList;
import org.eclipse.draw2d.Label;
import org.eclipse.swt.graphics.Color;

/**
 * A Figure for a Flaw
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class FlawFigure extends PrincipleFigure {

	/**
	 * a list for all labels used by this figure
	 * 
	 */
	private ArrayList<Label> labelList;

	/**
	 * the constructor
	 * 
	 * @param name
	 *            the name of the element
	 * @param interpretationRule
	 *            a string for interpretation rules
	 * @param metrics
	 *            a string for metrics
	 * @param isExpandable
	 *            node is expandable or not
	 */
	public FlawFigure(String name, String interpretationRule, String metrics,
			boolean isExpandable) {
		super(name, isExpandable);
		paintMetricAndRule(interpretationRule, metrics);
	}

	/**
	 * paints the list with metrics and rules
	 * 
	 * @param metricAndRuleList
	 */
	private void paintMetricAndRule(String interpretationRule, String metrics) {
		labelList = new ArrayList<Label>();
		Label tilteLabel = new Label(formatText("Metric&Rule:"));
		tilteLabel.setFont(defaultTitleFont);
		add(tilteLabel);
		labelList.add(tilteLabel);

		Label metricLabel = new Label(formatText(metrics!= null? metrics : ""));
		metricLabel.setFont(defaultFont);
		add(metricLabel);
		labelList.add(metricLabel);

		Label interpretationRuleLabel = new Label(
				formatText(interpretationRule != null ? interpretationRule:""));
		interpretationRuleLabel.setFont(defaultFont);
		add(interpretationRuleLabel);
		labelList.add(interpretationRuleLabel);

	}

	/**
	 * setter for the foreground color of the caption
	 * 
	 * @param c
	 *            a Color
	 */
	@Override
	public void setLabelColor(Color c) {
		super.setLabelColor(c);
		for (Label label : labelList) {
			label.setForegroundColor(c);
		}
	}
}
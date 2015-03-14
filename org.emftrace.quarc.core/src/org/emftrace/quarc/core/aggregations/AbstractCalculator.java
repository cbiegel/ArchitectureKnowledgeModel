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

package org.emftrace.quarc.core.aggregations;

import java.util.List;

import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;


/**
 * Abstract base class to calculate impacts for a list of selected selected goals
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractCalculator {

	/**
	 *  a CacheManager
	 */
	protected CacheManager cacheManager;
	
	
	/**
	 *  a List of selected selected goals
	 */
	protected List<Element> goals;

	/**
	 * the constructor
	 * 
	 * @param goals a List of selected selected goals
	 * @param cacheManager a CacheManager
	 */
	public AbstractCalculator(List<Element> goals, CacheManager cacheManager){
		this.goals = goals;
		this.cacheManager = cacheManager;
	}
		
	/**
	 * calculates the aggregated impact between the selected goals and the specified ConstrainedElement
	 * 
	 * @param constrainedElement a ConstrainedElement
	 * @return the aggregated impact between the selected goals and the specified ConstrainedElement
	 */
	public abstract float calcAggregation(ConstrainedElement constrainedElement);
	
	/**
	 * generates a formated String for the aggregated impact between the selected goals and the specified ConstrainedElement
	 * 
	 * @param constrainedElement a ConstrainedElement
	 * @return a formated String for the aggregated impact between the selected goals and the specified ConstrainedElement
	 */
	public String calcAggregationAsString(ConstrainedElement constrainedElement){
		return String.format("%.2f", calcAggregation(constrainedElement));
	}
	
	protected Float getRatingWeightFromCache(ConstrainedElement constrainedElement, Element element) {
		Float rating = cacheManager.getIndirectRatingWeight(constrainedElement, (Element) element);
		if (rating == null)
			rating = 0.0f;
		return rating;
	}
	
	/**
	 * @param element a GSS.Element
	 * @return the selected priority of the specified Element
	 */
	protected Float getPriorityFromCache(Object element) {
		Float priority = null;
		if (element instanceof Goal)
			priority = cacheManager.getSelectedGoalPriority((Goal) element);
		else if (element instanceof Principle)
			priority = cacheManager.getSelectedPrinciplePriority((Principle) element);
		
		if (priority == null)
			priority = 0.0f;
		return priority;
	}
}

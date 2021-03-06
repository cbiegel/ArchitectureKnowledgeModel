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
import org.emftrace.quarc.core.cache.CacheManager;


/**
 * calculated the minimal of the weighted impacts for a specified solution
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class WeightedMinCalculator extends AbstractCalculator {

	/**
	 * the constructor
	 * 
	 * @param goals a List of selected selected goals
	 * @param cacheManager a CacheManager
	 */
	public WeightedMinCalculator(List<Element> goals, CacheManager cacheManager) {
		super(goals, cacheManager);
	}
	
	/* (non-Javadoc)
	 * @see quarc_gsscore.aggregations.AbstractAggregation#calcAggregation(GSS.SolutionInstrument)
	 */
	@Override
	public float calcAggregation(ConstrainedElement constrainedElement) {
		Float result = null;
		for (Object element : goals){
			Float rating = getRatingWeightFromCache(constrainedElement, (Element) element);
			Float priority = getPriorityFromCache(element);
			Float finalRating = rating * priority;
			result = result == null? finalRating : result;
			result = Math.min(result, finalRating);
		}
		return result / 100.0f;
	}

}

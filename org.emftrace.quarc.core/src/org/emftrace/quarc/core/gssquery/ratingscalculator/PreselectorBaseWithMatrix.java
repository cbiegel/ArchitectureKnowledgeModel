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

package org.emftrace.quarc.core.gssquery.ratingscalculator;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;


/**
 * abstract class for all sub phase of the 2nd phase which stores the calculates
 * values at a Matrix <br>
 * has an ApplicableElementCache and a Matrix
 * 
 * @author Daniel Motschmann
 * 
 */
public abstract class PreselectorBaseWithMatrix extends PreselectorBase {

	/**
	 * the Matrix for the calculated values
	 */
	protected Matrix matrix;

	/**
	 * getter for the Matrix with the calculated values
	 */
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * the constructor
	 * 
	 * @param gssQuery
	 *            a GSSQuery
	 * @param queryResultSet
	 *            a QueryResultSet
	 * @param accessLayer
	 *            an AccessLayer instance
	 * @param cache
	 *            a GSSCache
	 * @param applicableElementCache
	 *            an ApplicableElementCache
	 */
	public PreselectorBaseWithMatrix(GSSQuery gssQuery, QueryResultSet queryResultSet,
			AccessLayer accessLayer, CacheManager cacheManager) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);
		matrix = new Matrix();
	}

}

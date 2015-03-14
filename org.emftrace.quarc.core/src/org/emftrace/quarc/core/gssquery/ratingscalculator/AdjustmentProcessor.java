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

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;

/**
 * calculates the final ratings by adjusting the unadjusted ratings by including
 * the Offset-Relations
 * 
 * @author Daniel Motschmann
 * 
 */
public class AdjustmentProcessor extends PreselectorBaseWithMatrix {

	/**
	 * the matrix with the unadjusted values
	 */
	private Matrix unadjustedRatingMatrix;

	/**
	 * the matrix with the offsets values
	 */
	private Matrix adjustmentMatrix;

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
	 * @param unadjustedRatingMatrix
	 *            the matrix with the unadjusted values
	 * @param adjustmentMatrix
	 *            the matrix with the offsets values
	 */
	public AdjustmentProcessor(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer,
			CacheManager cacheManager, Matrix unadjustedRatingMatrix,
			Matrix adjustmentMatrix) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);
		this.unadjustedRatingMatrix = unadjustedRatingMatrix;
		this.adjustmentMatrix = adjustmentMatrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {

		for (Entry<Element, LinkedHashMap<Element, Float>> entry : unadjustedRatingMatrix
				.getColumnEntrySet()) {
			SolutionInstrument solutionInstrument = (SolutionInstrument) entry
					.getKey();
			LinkedHashMap<Element, Float> columnVector = entry.getValue();
			for (Entry<Element, Float> columnVectorEntry : columnVector
					.entrySet()) {
				Goal goal = (Goal) columnVectorEntry.getKey();
				Float offsetValue = adjustmentMatrix.getValue(
						solutionInstrument, goal);
				Float unadjustedValue = columnVectorEntry.getValue();
				Float adjustedValue = offsetValue == null ? unadjustedValue
						: (unadjustedValue + offsetValue) / 2;
				matrix.setValue(solutionInstrument, goal, adjustedValue);
			}
		}
	}

}

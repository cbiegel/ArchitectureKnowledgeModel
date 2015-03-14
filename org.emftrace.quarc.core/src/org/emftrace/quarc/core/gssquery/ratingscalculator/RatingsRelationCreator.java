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
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
/**
 * creates the Rating-ModelElements for the calculated rating values.<br>
 * created Relations will be added to the specified QueryResultSet
 * 
 * @author Daniel Motschmann
 *
 */
public class RatingsRelationCreator extends PreselectorBase {

	/**
	 * the Matrix with the calculated rating values
	 */
	private Matrix ratingsMatrix;
	
	/**
	 * false == source Elements are contained by the row keys;  true == target Elements are contained by the column keys
	 */
	private boolean rowKeyContaintsSourcesOfRelation;
	

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
	 * @param ratingsMatrix a Matrix with the calculated rating values
	 * @param rowKeyContaintsSourcesOfRelation false == source Elements are contained by the row keys;  true == target Elements are contained by the column keys
	 */
	public RatingsRelationCreator(GSSQuery gssQuery, QueryResultSet queryResultSet,
			AccessLayer accessLayer, CacheManager cacheManager, Matrix ratingsMatrix, boolean rowKeyContaintsSourcesOfRelation ) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);
		this.ratingsMatrix = ratingsMatrix;
		this.rowKeyContaintsSourcesOfRelation = rowKeyContaintsSourcesOfRelation;
	}

	/* (non-Javadoc)
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		if (rowKeyContaintsSourcesOfRelation){
		
			for (Entry<Element, LinkedHashMap<Element, Float>> columnEntry : ratingsMatrix.getColumnEntrySet()){
				Element sourceElement = columnEntry.getKey();
				for (Entry<Element, Float> entry: columnEntry.getValue().entrySet() ){
					// key = target Element 
					// value = weight
					cacheManager.createRatingRelation(sourceElement, entry.getKey(), entry.getValue());
				}
			}
		}
		else {
			for (Entry<Element, LinkedHashMap<Element, Float>> columnEntry : ratingsMatrix.getColumnEntrySet()){
				Element targetElement = columnEntry.getKey();
				for (Entry<Element, Float> entry: columnEntry.getValue().entrySet() ){
					// key = target Element 
					// value = weight
					cacheManager.createRatingRelation(entry.getKey(), targetElement, entry.getValue());
				}
			}
		}
		
	}

}

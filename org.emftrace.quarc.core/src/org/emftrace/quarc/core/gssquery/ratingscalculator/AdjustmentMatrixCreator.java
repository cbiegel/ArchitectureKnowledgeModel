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
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;


/**
 * creates a matrix with the values of the Offsets
 *
 * @author Daniel Motschmann
 *
 */
public class AdjustmentMatrixCreator extends PreselectorBaseWithMatrix{

	
	/**
	 * the constructor
	 * 
	 * @param gssQuery
	 *            a GSSQuery
	 * @param queryResult
	 *            a QueryResult
	 * @param accessLayer
	 *            an AccessLayer instance
	 * @param cache
	 *            a GSSCache
	 * @param applicableElementCache
	 *            an ApplicableElementCache
	 */
	public AdjustmentMatrixCreator(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer, CacheManager cacheManager) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);

	}

	/* (non-Javadoc)
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		try {
		for (Element solutionInstrument : cacheManager.getRootApplicableElementElements(GSSLayer.layer4)) {
			checkElement(solutionInstrument);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * check the specified SolutionInstrument
	 * @param solutionInstrument a SolutionInstrument
	 * @throws Exception
	 */
	private void checkElement(Element solutionInstrument) throws Exception {
		for (Relation offset : cacheManager.getApplicableOutgoingOffsetRelations(
				solutionInstrument)) {
			addOffset((SolutionInstrument)solutionInstrument, (Goal) cacheManager.getTargetOfRelation(offset),
					cacheManager.getRelationWeight(offset));
	}
		
	for (Relation isA : cacheManager.getApplicableIncomingIsARelations(solutionInstrument)) {
		checkElement(cacheManager.getSourceOfRelation(isA));

	}
		
	}

	/**
	 * add the weight of an Offset relation the the matrix
	 * 
	 * @param solutionInstrument a SolutionInstrument
	 * @param targetGoal the influenced Goal
	 * @param weight the weight of the offset
	 * @throws Exception
	 */
	private void addOffset(SolutionInstrument solutionInstrument, Goal targetGoal, Float weight) throws Exception {
		if (cacheManager.isLeaf(solutionInstrument)){
			if (matrix.getValue(solutionInstrument, targetGoal) == null)
				matrix.setValue(solutionInstrument, targetGoal, weight);
			else 
				throw new Exception("invalid offset relation from " + solutionInstrument + " to " + targetGoal);
		}
		else {
			for (Relation relation : cacheManager.getApplicableIncomingIsARelations(solutionInstrument)){
				addOffset((SolutionInstrument) cacheManager.getSourceOfRelation(relation), targetGoal, weight);
		}}
	}

}

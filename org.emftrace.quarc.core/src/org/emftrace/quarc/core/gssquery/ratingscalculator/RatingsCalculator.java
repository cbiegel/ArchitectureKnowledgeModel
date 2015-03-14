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
import org.emftrace.quarc.core.gssquery.AbstractProcessor;



/**
 * the whole 2nd phase of calculating a ranking by GSS
 * 
 * @author Daniel Motschmann
 *
 */
public class RatingsCalculator extends AbstractProcessor {
	
	
	/**
	 * the constructor 
	 * @param gssQuery a GSSQuery
	 * @param queryResultSet a QueryResultSet
	 * @param accessLayer an AccessLayer instance
	 * @param cache a GSSCache
	 * @param applicableElementCache an ApplicableElementCache
	 */
	public RatingsCalculator(GSSQuery gssQuery, QueryResultSet queryResultSet,  AccessLayer accessLayer, CacheManager cacheManager) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);
	}

	/* (non-Javadoc)
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		
		PrincipleGoalImpactMatrixCreator principleGoalImpactMatrixCreator = new PrincipleGoalImpactMatrixCreator(gssQuery, queryResultSet,
				accessLayer, cacheManager);
		principleGoalImpactMatrixCreator.runWithoutUnicaseCommand();
		Matrix principleGoalImpactMatrix = principleGoalImpactMatrixCreator.getMatrix();
		
		PrincipleRatingsCalculator principleRatingsCalculator = new PrincipleRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager );
		principleRatingsCalculator.runWithoutUnicaseCommand();
		Matrix principleRatingsMatrix = principleRatingsCalculator.getMatrix();
		
		GoalRatingsCalculator goalRatingsCalculator = new GoalRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager, principleGoalImpactMatrix, principleRatingsMatrix);
		goalRatingsCalculator.runWithoutUnicaseCommand();
		Matrix unadjustedGoalRatingsMatrix = goalRatingsCalculator.getMatrix();
		
		AdjustmentMatrixCreator adjustmentMatrixCreator = new AdjustmentMatrixCreator(gssQuery, queryResultSet,
				accessLayer, cacheManager);
		adjustmentMatrixCreator.runWithoutUnicaseCommand();
		Matrix adjustmentMatrix = adjustmentMatrixCreator.getMatrix();

		AdjustmentProcessor adjustmentProcessor = new AdjustmentProcessor(
				gssQuery, queryResultSet, accessLayer, cacheManager,
				unadjustedGoalRatingsMatrix, adjustmentMatrix);
		adjustmentProcessor.runWithoutUnicaseCommand();
		Matrix adjustedRatingsMatrix = adjustmentProcessor.getMatrix();
		
		new RatingsRelationCreator(gssQuery, queryResultSet, accessLayer, cacheManager, principleGoalImpactMatrix, false).runWithoutUnicaseCommand();	
		new RatingsRelationCreator(gssQuery, queryResultSet, accessLayer, cacheManager, principleRatingsMatrix, true).runWithoutUnicaseCommand();	
		new RatingsRelationCreator(gssQuery, queryResultSet, accessLayer, cacheManager, adjustedRatingsMatrix,true).runWithoutUnicaseCommand();	
		
	
	}
}

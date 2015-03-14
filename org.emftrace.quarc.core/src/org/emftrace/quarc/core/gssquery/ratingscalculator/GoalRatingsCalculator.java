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
 * calculates the unadjusted ratings between solution instruments and goals (leafs only)
 * 
 * @author Daniel Motschmann
 *
 */
public class GoalRatingsCalculator extends PreselectorBaseWithMatrix{

	/**
	 *  the mapping matrix with the impact of principles to a goal
	 */
	private Matrix mappingMatrix;
	
	/**
	 *  the matrix with the rating values between solution instruments and principles
	 */
	private Matrix principleMatrix;
	
	
	/**
	 * the constructor 
	 * 
	 * @param gssQuery a GSSQuery
	 * @param queryResultSet a QueryResultSet
	 * @param accessLayer an AccessLayer instance
	 * @param cache a GSSCache
	 * @param applicableElementCache an ApplicableElementCache
	 * @param mappingMatrix the matrix with the rating values between solution instruments and principles
	 * @param principleMatrix the matrix with the rating
	 */
	public GoalRatingsCalculator(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer, CacheManager cacheManager, Matrix mappingMatrix, Matrix principleMatrix) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);

		this.mappingMatrix = mappingMatrix;
		this.principleMatrix = principleMatrix;
	}
	

	/* (non-Javadoc)
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		
		for (  Entry<Element, LinkedHashMap<Element, Float>> entry : principleMatrix.getColumnEntrySet()){
			SolutionInstrument si = (SolutionInstrument) entry.getKey();
			LinkedHashMap<Element, Float> solutionInstrumentImpactOnPrincipleMatrixColumnVector = entry.getValue();
			
			for ( Entry<Element, LinkedHashMap<Element, Float>>  mappingMatrixEntry :mappingMatrix.getColumnEntrySet()){
				Goal goal = (Goal) mappingMatrixEntry.getKey();
				if (!cacheManager.isLeafAppicableElement(goal)) continue; //skip non-leaf goals
				LinkedHashMap<Element, Float> mappingMatrixColumnVector = mappingMatrixEntry.getValue();
				
				int number = Matrix.numberOfEntries(mappingMatrixColumnVector);
			    float dotProduct = Matrix.calaculateDotProductForColumnVectors(solutionInstrumentImpactOnPrincipleMatrixColumnVector, mappingMatrixColumnVector);
				float result = (dotProduct / number) /100.0f;
				
				matrix.setValue(si, goal, result);
				
			}
		}

	}

}

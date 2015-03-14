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
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;


/**
 * creates the required mapping matrix for the the impact of solution principles to goals
 * 
 * <br>
 * note: the impacts will not been aggregated<br>
 * that is done by other sub phases
 * 
 * @author Daniel Motschmann
 * 
 */
public class PrincipleGoalImpactMatrixCreator extends PreselectorBaseWithMatrix {


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
	public PrincipleGoalImpactMatrixCreator(GSSQuery gssQuery, QueryResultSet queryResultSet,
			AccessLayer accessLayer, CacheManager cacheManager) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		for (Element goal : cacheManager
				.getLeafApplicableElementElements(GSSLayer.layer1)) {

			for (Relation impact : cacheManager
					.getApplicableIncomingImpactRelations(goal)) {
				Element source = cacheManager.getSourceOfRelation(impact);
				@SuppressWarnings("static-access")
				int layer = cacheManager.getGSSLayer(source);
				// impacts from layer 3 to 2 & 1 only
				if (layer == GSSLayer.layer3){
				
					if (matrix.getValue(goal, source) != null)
						new Exception("invalid impact "+ impact ).printStackTrace();
					matrix.setValue(goal, source,
							cacheManager.getRelationWeight(impact));
				}
				else if (layer == GSSLayer.layer4) {
					new Exception("invalid impact "+ impact ).printStackTrace();
				}
			}
		}
	}

}

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

import java.util.ArrayList;
import java.util.List;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;

/**
 * 
 * Calculates the weight of the Rating between Solution Instruments and Principles
 * @author Daniel Motschmann
 * 
 */
/**
 * @author Daniel
 * 
 */
public class PrincipleRatingsCalculator extends PreselectorBaseWithMatrix {

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
	public PrincipleRatingsCalculator(GSSQuery gssQuery,
			QueryResultSet queryResultSet, AccessLayer accessLayer,
			CacheManager cacheManager) {
		super(gssQuery, queryResultSet, accessLayer, cacheManager);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see quarc_gsscore.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		for (Element principle : cacheManager
				.getRootApplicableElementElements(GSSLayer.layer3)) {
			putElement(principle);
		}
	}

	/**
	 * calculates the rating weight and puts the calculated value into the
	 * matrix
	 * 
	 * @param principle
	 *            a Principle
	 * @return a List with sources (Solution Instruments) of the Impact
	 *         relations to the specified principle
	 */
	private List<SolutionInstrument> putElement(Element principle) {
		List<SolutionInstrument> result = new ArrayList<SolutionInstrument>();
		if (cacheManager.isLeafAppicableElement(principle)) {
			result = addDirectImpactsToInstruments(principle);
		} else {
			List<Principle> parts = new ArrayList<Principle>();

			for (Relation relation : cacheManager
					.getApplicableIncomingDecompositionRelations(principle)) {
				Principle target = (Principle) cacheManager
						.getSourceOfRelation(relation);
				result.addAll(putElement(target));
				parts.add(target);

			}

			int count = parts.size();
			for (SolutionInstrument si : result) {

				Float sum = 0.0f;
				for (Principle p : parts) {
					sum = matrix.getValue(si, p) != null ? sum
							+ matrix.getValue(si, p) : sum;
				}

				matrix.setValue(si, principle, (sum) / count);
			}
		}
		return result;
	}

	/**
	 * adds all impact weights of relations between the specified Principle and
	 * possible Solution Instruments
	 * 
	 * @param principle
	 *            a Principle, must be an leaf
	 * @return a List with sources (Solution Instruments) of the Impact
	 *         relations to the specified principle
	 */
	private List<SolutionInstrument> addDirectImpactsToInstruments(
			Element principle) {

		List<SolutionInstrument> result = new ArrayList<SolutionInstrument>();

		for (Relation relation : cacheManager
				.getApplicableIncomingImpactRelations(principle)) {
			SolutionInstrument sourceSolutionInstrument = (SolutionInstrument) cacheManager
					.getSourceOfRelation(relation);

			result.addAll(findLeafSolutionInstruments(sourceSolutionInstrument,
					(Principle) principle,
					cacheManager.getRelationWeightString(relation)));
		}

		return result;
	}

	/**
	 * finds leaf SolutionInstrument starting a the specifed SolutionInstrument 
	 * and adds these found leafs to with the specified weight to the matrix<br>
	 * is required because of "IsA" relations of SolutionInstrument
	 *
	 * @param source a SolutionInstrument
	 * @param principle a Principle
	 * @param weight the of the relation (may be an indirect one) between the SolutionInstrument and the Principle
	 * @return the found leafs
	 */
	private List<SolutionInstrument> findLeafSolutionInstruments(
			SolutionInstrument source, Principle principle, String weight) {
		List<SolutionInstrument> result = new ArrayList<SolutionInstrument>();

		if (cacheManager.isLeafAppicableElement(source)) {
			matrix.setValue(source, principle, weight);
			result.add(source);
		} else {
			for (Relation incomingRelation : cacheManager
					.getAllApplicableIncomingRelations(source)) {
				result.addAll(findLeafSolutionInstruments(
						(SolutionInstrument) cacheManager
								.getSourceOfRelation(incomingRelation),
						principle, weight)); // check all children
			}

		}
		return result;
	}
}

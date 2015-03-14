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

package org.emftrace.quarc.core.gssquery.preselector;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.AbstractProcessor;



/**
 * The 1st phase of GSS<br>
 * 
 * - creates a preselection of applicable elements and relations<br>
 * 
 * - optimizes the preselection by pruning all principles without a transitive relation to a solution instrument<br>
 * 
 * - stores the optimized preselection in the QueryResult of the specified GSSQuery<br>
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 * 
 */
public class Preselector extends AbstractProcessor {

	private AssignedConstraintsSet assignedConstraintsSet;
	private SelectedGoalsSet selectedGoalsSet;
	private boolean goalsAndPrinciplesOnly;

	/**
	 * the constructor
	 * 
	 * @param gssQuery a GSSQuery 
	 * @param queryResult a QueryResultSet
	 * @param accessLayer an AccessLayer
	 * @param cacheManager an CacheManager
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 * @param selectedGoalsSet a SelectedGoalsSet
	 * @param goalsAndPrinciplesOnly select goals and principles only
	 */
	public Preselector(GSSQuery gssQuery, QueryResultSet queryResult,
			AccessLayer accessLayer, CacheManager cacheManager,
			AssignedConstraintsSet assignedConstraintsSet, SelectedGoalsSet selectedGoalsSet, boolean goalsAndPrinciplesOnly) {
		super(gssQuery, queryResult, accessLayer, cacheManager);
		this.assignedConstraintsSet = assignedConstraintsSet;
		this.selectedGoalsSet = selectedGoalsSet;
		this.goalsAndPrinciplesOnly = goalsAndPrinciplesOnly;
	}

	/* (non-Javadoc)
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	public void doRun() {
		// execute all sub phases
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer, cacheManager, assignedConstraintsSet, selectedGoalsSet, goalsAndPrinciplesOnly).runWithoutUnicaseCommand();
		new ApplicableElementsPruner(gssQuery, queryResultSet, accessLayer, cacheManager, !goalsAndPrinciplesOnly)
				.runWithoutUnicaseCommand();
		
		// save set of applicable elements
		gssQuery.setQueryResultSet(queryResultSet);
	}

}

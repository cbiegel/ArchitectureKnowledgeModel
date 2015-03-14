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

package org.emftrace.quarc.core.tests.aggregations;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.aggregations.MaxCalculator;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.RatingsCalculator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class MaxCalculatorTest extends QUARCCoreTestCase{

	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, gssQuery.getSelectedGoalsSet(), accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
	    
	    new RatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager).runWithoutUnicaseCommand();
	}

	@Test
	public void test() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Goal g2 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		

		createImpact(gss, p1, g1, 100.0f);
		createImpact(gss, p1, g2, 50.0f);
		createImpact(gss, si1, p1, 100.0f);
		
		createSelectedGoal(gssQuery, g1, 60);
		createSelectedGoal(gssQuery, g2, 40);


		// execute required phases
		executeRequiredPhases();
		

		// check result
		List<Element> goalList = new ArrayList<Element>();
		goalList.add(g1);
		goalList.add(g2);
		
		
		assertEquals(100.0f , new MaxCalculator(goalList, cacheManager).calcAggregation(si1));
	}

}

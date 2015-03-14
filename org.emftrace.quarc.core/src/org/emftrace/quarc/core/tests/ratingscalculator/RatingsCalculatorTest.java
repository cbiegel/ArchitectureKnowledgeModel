package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.RatingsCalculator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class RatingsCalculatorTest extends QUARCCoreTestCase {

	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		

	    
	    new RatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager).runWithoutUnicaseCommand(); 
	}

	@Test
	public void test() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		
		createImpact(gss, p1, g1, 100.0f);
		createImpact(gss, si1, p1, 100.0f);
		

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(3, queryResultSet.getRatings().size());
		assertEquals(si1,((Rating) queryResultSet.getRatings().get(2)).getSource());
		assertEquals(g1,((Rating) queryResultSet.getRatings().get(2)).getTarget());
		assertEquals("100.0",((Rating) queryResultSet.getRatings().get(1)).getWeight());
		
		assertEquals(p1,((Rating) queryResultSet.getRatings().get(0)).getSource());
		assertEquals(g1,((Rating) queryResultSet.getRatings().get(0)).getTarget());
		assertEquals("100.0",((Rating) queryResultSet.getRatings().get(0)).getWeight());
		
		assertEquals(si1,((Rating) queryResultSet.getRatings().get(1)).getSource());
		assertEquals(p1,((Rating) queryResultSet.getRatings().get(1)).getTarget());
		assertEquals("100.0",((Rating) queryResultSet.getRatings().get(1)).getWeight());
	}
	

}

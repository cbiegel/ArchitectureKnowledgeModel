package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.GoalRatingsCalculator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleGoalImpactMatrixCreator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleRatingsCalculator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.RatingsRelationCreator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class RatingsRelationCreatorTest extends QUARCCoreTestCase {

	private Matrix goalMatrix;
	private Matrix principleGoalImpactMatrix;

	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		
		PrincipleGoalImpactMatrixCreator principleGoalImpactMatrixCreator = new PrincipleGoalImpactMatrixCreator(gssQuery, queryResultSet,
				accessLayer,cacheManager);

		principleGoalImpactMatrixCreator.runWithoutUnicaseCommand();
		principleGoalImpactMatrix = principleGoalImpactMatrixCreator.getMatrix();
		
			
		PrincipleRatingsCalculator principleRatingsCalculator = new PrincipleRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager );

		principleRatingsCalculator.runWithoutUnicaseCommand();
		Matrix principleMatrix = principleRatingsCalculator.getMatrix();
		
		GoalRatingsCalculator goalRatingsCalculator = new GoalRatingsCalculator(gssQuery, queryResultSet, accessLayer,cacheManager, principleGoalImpactMatrix, principleMatrix);
		goalRatingsCalculator.runWithoutUnicaseCommand();
		goalMatrix = goalRatingsCalculator.getMatrix();
	    
	   }

	@Test
	public void testStoreRatingBetweenSolutionAndPrinciples() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		
		createImpact(gss, p1, g1, 100.0f);
		createImpact(gss, si1, p1, 100.0f);
		

		// execute required phases
		executeRequiredPhases();
		 new RatingsRelationCreator(gssQuery, queryResultSet, accessLayer, cacheManager, goalMatrix, true).runWithoutUnicaseCommand(); //works with the unadjusted rating matrix as well as the adjusted rating matrix
			

		// check result

		assertEquals(1, queryResultSet.getRatings().size());
		assertEquals(si1,((Rating) queryResultSet.getRatings().get(0)).getSource());
		assertEquals(g1,((Rating) queryResultSet.getRatings().get(0)).getTarget());
		assertEquals("100.0",((Rating) queryResultSet.getRatings().get(0)).getWeight());
	}
	
	@Test
	public void testStoreImpactBetweenGoalsAndPrinciples() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		
		createImpact(gss, p1, g1, 100.0f);
		createImpact(gss, si1, p1, 100.0f);
		

		// execute required phases
		executeRequiredPhases();
		 new RatingsRelationCreator(gssQuery, queryResultSet, accessLayer, cacheManager, principleGoalImpactMatrix, false).runWithoutUnicaseCommand(); //works with the unadjusted rating matrix as well as the adjusted rating matrix
			

		// check result

		assertEquals(1, queryResultSet.getRatings().size());
		assertEquals(p1,((Rating) queryResultSet.getRatings().get(0)).getSource());
		assertEquals(g1,((Rating) queryResultSet.getRatings().get(0)).getTarget());
		assertEquals("100.0",((Rating) queryResultSet.getRatings().get(0)).getWeight());
	}
	

}

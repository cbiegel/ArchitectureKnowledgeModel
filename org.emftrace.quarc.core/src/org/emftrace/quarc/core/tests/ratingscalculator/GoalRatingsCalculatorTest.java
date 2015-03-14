package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.GoalRatingsCalculator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleGoalImpactMatrixCreator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleRatingsCalculator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class GoalRatingsCalculatorTest extends QUARCCoreTestCase {


	private Matrix goalMatrix;


	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();

		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		
		PrincipleGoalImpactMatrixCreator mappingMatrixCreator = new PrincipleGoalImpactMatrixCreator(gssQuery, queryResultSet,
				accessLayer, cacheManager);

		mappingMatrixCreator.runWithoutUnicaseCommand();
		Matrix mappingMatrix = mappingMatrixCreator.getMatrix();
		
			
		PrincipleRatingsCalculator principleRatingsCalculator = new PrincipleRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager );

		principleRatingsCalculator.runWithoutUnicaseCommand();
		Matrix principleMatrix = principleRatingsCalculator.getMatrix();
		
		GoalRatingsCalculator goalRatingsCalculator = new GoalRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager, mappingMatrix, principleMatrix);
		goalRatingsCalculator.runWithoutUnicaseCommand();
	    goalMatrix = goalRatingsCalculator.getMatrix();
	}
	
	@Test
	public void testSimpleGraph1() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 =  createPattern(gss, 1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p1, 100);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(100.0f, goalMatrix.getValue(si1, g1));
	}
	
	@Test
	public void testSimpleGraph2() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 =  createPattern(gss, 1);

		createImpact(gss, p1, g1, 20);
		createImpact(gss, si1, p1, 100);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(20.0f, goalMatrix.getValue(si1, g1));
	}
	
	@Test
	public void testSimpleGraph3() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 =  createPattern(gss, 1);
		

		createImpact(gss, p1, g1, 20);
		createImpact(gss, si1, p1, 20);
		
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(4.0f, goalMatrix.getValue(si1, g1));
	}
	
	@Test
	public void testTestWithDecompostionsAtPrincipleLayer() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		
		Pattern si1 =  createPattern(gss, 1);
	
		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p3, p2);
		
		createImpact(gss, p1, g1, 20);
		createImpact(gss, p2, g1, 10);
		createImpact(gss, si1, p3, 100);


		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(15.0f, goalMatrix.getValue(si1, g1));
		
	}

}

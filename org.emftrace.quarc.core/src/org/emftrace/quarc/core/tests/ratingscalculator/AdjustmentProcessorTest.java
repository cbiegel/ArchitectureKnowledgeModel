package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.AdjustmentMatrixCreator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.AdjustmentProcessor;
import org.emftrace.quarc.core.gssquery.ratingscalculator.GoalRatingsCalculator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleGoalImpactMatrixCreator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleRatingsCalculator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class AdjustmentProcessorTest extends QUARCCoreTestCase {

	private Matrix adjustedRatingsMatrix;


	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();

		
//		ApplicableElementCache applicableElementCache = new ApplicableElementCache(queryResultSet);
//		applicableElementCache.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		
		PrincipleGoalImpactMatrixCreator mappingMatrixCreator = new PrincipleGoalImpactMatrixCreator(
				gssQuery, queryResultSet, accessLayer, cacheManager);

		mappingMatrixCreator.runWithoutUnicaseCommand();
		Matrix mappingMatrix = mappingMatrixCreator.getMatrix();

		PrincipleRatingsCalculator principleRatingsCalculator = new PrincipleRatingsCalculator(
				gssQuery, queryResultSet, accessLayer, cacheManager);

		principleRatingsCalculator.runWithoutUnicaseCommand();
		Matrix principleMatrix = principleRatingsCalculator.getMatrix();

		GoalRatingsCalculator goalRatingsCalculator = new GoalRatingsCalculator(
				gssQuery, queryResultSet, accessLayer, cacheManager, mappingMatrix,
				principleMatrix );
		goalRatingsCalculator.runWithoutUnicaseCommand();

		Matrix unajustedGoalRatingsMatrix = goalRatingsCalculator.getMatrix();
		AdjustmentMatrixCreator adjustmentMatrixCreator = new AdjustmentMatrixCreator(
				gssQuery, queryResultSet, accessLayer, cacheManager);

		adjustmentMatrixCreator.runWithoutUnicaseCommand();
		Matrix adjustmentMatrix = adjustmentMatrixCreator.getMatrix();

		AdjustmentProcessor adjustmentProcessor = new AdjustmentProcessor(
				gssQuery, queryResultSet, accessLayer, cacheManager,
				unajustedGoalRatingsMatrix, adjustmentMatrix);
		adjustmentProcessor.runWithoutUnicaseCommand();
		adjustedRatingsMatrix = adjustmentProcessor.getMatrix();

	}

	@Test
	public void test1() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createOffset(gss, si1, g1, 1);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(2.5f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test2() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createOffset(gss, si1, g1, 0);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);		
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(2.0f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test3() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		Offset offset = GSSFactory.eINSTANCE.createOffset();
		offset.setSource(si1);
		offset.setTarget(g1);
		offset.setValue(null);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);	
		
		gss.getRelations().add(offset);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(4.0f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test4() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
	
		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);	
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(4.0f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test5() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createOffset(gss, si1, g1, -1);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);	
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(1.5f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test6() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createOffset(gss, si1, g1, -2);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);	

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(1.0f, adjustedRatingsMatrix.getValue(si1, g1));
	}

	@Test
	public void test7() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createOffset(gss, si1, g1, 2);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(3.0f, adjustedRatingsMatrix.getValue(si1, g1));
	}
	
	@Test
	public void testIsA1() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createOffset(gss, si1, g1, 2);

		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, adjustedRatingsMatrix.getValue(si1, g1));
		assertEquals(3.0f, adjustedRatingsMatrix.getValue(si2, g1));
		assertEquals(3.0f, adjustedRatingsMatrix.getValue(si3, g1));
		
	}
	
	@Test
	public void testIsA2() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 =createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createOffset(gss, si2, g1, 1);
		createOffset(gss, si3, g1, 2);


		createImpact(gss, si1, p1, 20);
		createImpact(gss, p1, g1, 20);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, adjustedRatingsMatrix.getValue(si1, g1));
		assertEquals(2.50f, adjustedRatingsMatrix.getValue(si2, g1));
		assertEquals(3.00f, adjustedRatingsMatrix.getValue(si3, g1));
		
	}
}

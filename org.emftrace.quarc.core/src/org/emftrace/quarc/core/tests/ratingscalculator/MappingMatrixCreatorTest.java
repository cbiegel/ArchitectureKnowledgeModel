package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleGoalImpactMatrixCreator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class MappingMatrixCreatorTest extends QUARCCoreTestCase {

	private PrincipleGoalImpactMatrixCreator mappingMatrixCreator;
	private Matrix goalPrincipleMappingMatrix;

	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();


		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		
		
		mappingMatrixCreator = new PrincipleGoalImpactMatrixCreator(gssQuery, queryResultSet,
				accessLayer, cacheManager);

		mappingMatrixCreator.runWithoutUnicaseCommand();
		goalPrincipleMappingMatrix = mappingMatrixCreator.getMatrix();

	}
	
	/**
	 *  test for applicable Elements only
	 */
	@Test
	public void test0() {

		gssQuery = QueryFactory.eINSTANCE.createGSSQuery();
		gssQuery.setUuid("foo query");
		gssQuery.setTimestamp("01.01.1970 00:01");
		gssQuery.setUsername("foo user");
		
		queryResultSet = QueryFactory.eINSTANCE.createQueryResultSet();
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();

		mappingMatrixCreator = new PrincipleGoalImpactMatrixCreator(gssQuery, queryResultSet,
				accessLayer, cacheManager);

		mappingMatrixCreator.runWithoutUnicaseCommand();
		goalPrincipleMappingMatrix = mappingMatrixCreator.getMatrix();

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g1, 100.0f);
		
		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
	}
	
	

	/**
	 *  a simple test with a goal and a principle
	 */
	@Test
	public void test1() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g1, 100.0f);
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g1, p1));
	}

	
	/**
	 *  a simple test with a goal with a sub goal with an impact on a principle
	 *  tests: only leafs (of goals) are considered
	 */
	@Test
	public void test2() {

		// build graph for test case
		
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Principle p1 = createPrinciple(gss, 1);

		createDecomposition(gss, g2, g1);
		createImpact(gss, p1, g2, 100.0f);
		

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p1));
	}


	@Test
	public void test3() {

		// build graph for test case
		
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		createImpact(gss, p1, g2, 100.0f);
		createImpact(gss, p2, g3, 100.0f);
		

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p2));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p1));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p1));
	
	}

	@Test
	public void test4() {

		// build graph for test case
		
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		createImpact(gss, p1, g2, 100.0f);
		createImpact(gss, p1, g3, 100.0f);
		createImpact(gss, p2, g3, 100.0f);
		createImpact(gss, p2, g2, 100.0f);

	

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p2));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p1));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p2));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p2));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p1));

	}

	@Test
	public void test5() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Principle p4 = createPrinciple(gss, 4);
		Principle p5 = createPrinciple(gss, 5);
		Principle p6 = createPrinciple(gss, 6);
		Principle p7 = createPrinciple(gss, 7);


		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p4, p1);
		createDecomposition(gss, p5, p3);
		createDecomposition(gss, p6, p3);
		createDecomposition(gss, p7, p3);

		createImpact(gss, p1, g2, 100.0f);
		createImpact(gss, p2, g3, 100.0f);



		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p3));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p7));

		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p3));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p7));

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p1));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p3));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p7));

	}

	@Test
	public void test6() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Principle p4 = createPrinciple(gss, 4);
		Principle p5 = createPrinciple(gss, 5);
		Principle p6 = createPrinciple(gss, 6);
		Principle p7 = createPrinciple(gss, 7);
		Principle p8 = createPrinciple(gss, 8);
		Principle p9 = createPrinciple(gss, 9);

		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p4, p1);
		createDecomposition(gss, p5, p3);
		createDecomposition(gss, p6, p3);
		createDecomposition(gss, p7, p3);
		createDecomposition(gss, p8, p2);
		createDecomposition(gss, p9, p2);

		createImpact(gss, p1, g2, 100.0f);
		createImpact(gss, p3, g3, 100.0f);
		createImpact(gss, p4, g3, -100.0f);
		createImpact(gss, p8, g3, 100.0f);
		createImpact(gss, p9, g3, -100.0f);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p3));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p7));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p8));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p9));

		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g2, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p3));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p7));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p8));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g2, p9));

		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p1));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p2));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p3));
		assertEquals(-100.0f, goalPrincipleMappingMatrix.getValue(g3, p4));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p5));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p6));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g3, p7));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g3, p8));
		assertEquals(-100.0f, goalPrincipleMappingMatrix.getValue(g3, p9));

	}
	
	
	/**
	 *  test for decomposition relations with the same source
	 */
	@Test
	public void test7() {

		// build graph for test case
		
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);

		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p3, p2);
		
		createImpact(gss, p1, g1, 50.0f);
		createImpact(gss, p2, g1, 100.0f);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(50.0f, goalPrincipleMappingMatrix.getValue(g1, p1));
		assertEquals(100.0f, goalPrincipleMappingMatrix.getValue(g1, p2));
		assertEquals(null, goalPrincipleMappingMatrix.getValue(g1, p3));

	}
	

}

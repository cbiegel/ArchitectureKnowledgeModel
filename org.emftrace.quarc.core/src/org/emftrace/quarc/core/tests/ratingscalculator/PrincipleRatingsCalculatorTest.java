package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.gssquery.ratingscalculator.PrincipleRatingsCalculator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class PrincipleRatingsCalculatorTest extends QUARCCoreTestCase {


	private Matrix principleMatrix;
	private PrincipleRatingsCalculator principleRatingsCalculator;


	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		
		principleRatingsCalculator = new PrincipleRatingsCalculator(gssQuery, queryResultSet, accessLayer, cacheManager );

		principleRatingsCalculator.runWithoutUnicaseCommand();
		principleMatrix = principleRatingsCalculator.getMatrix();
	}
	
	@Test
	public void test1() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		// execute required phases
		executeRequiredPhases();

		// check result
		assertEquals(1.0f, principleMatrix.getValue(si1, p1));
	}

	
	@Test
	public void test2() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Pattern si1 = createPattern(gss, 1);
		
		createDecomposition(gss, p2, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);


		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
	} 
	
	@Test
	public void test3() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		
		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);


		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
	} 
	
	@Test
	public void test4() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		
		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);
		createImpact(gss, si2, p2, 100);
		createImpact(gss, si2, p3, 100);

		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
	} 
	
	@Test
	public void test5() {

		// build graph for test case
		
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);
		createImpact(gss, si2, p2, 100);
		createImpact(gss, si2, p3, -100);
		
		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(-100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(0.0f, principleMatrix.getValue(si2, p1));
	} 
	
	@Test
	public void test6() {

		// build graph for test case
		
		
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);

		createImpact(gss, si2, p3, -100);

		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(null, principleMatrix.getValue(si2, p2));
		assertEquals(-100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(-50.0f, principleMatrix.getValue(si2, p1));
	} 
	
	
	@Test
	public void test7() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Principle p4 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);
		createImpact(gss, si2, p2, 100);
		createImpact(gss, si2, p3, 100);
		createImpact(gss, si1, p4, 100);
		createImpact(gss, si2, p4, 100);
		createImpact(gss, p4, g1, 100);
		
		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p4));
		assertEquals(100.0f, principleMatrix.getValue(si2, p4));
	} 
	
	
	@Test
	public void test8() {
		

		// build graph for test case
		
		
		Goal g1 = createGoal(gss, 1);
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Principle p4 = createPrinciple(gss, 3);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);
		createImpact(gss, si2, p2, 100);
		createImpact(gss, si2, p3, 100);
		createImpact(gss, si2, p4, 100);
		createImpact(gss, p4, g1, 100);

		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
		
		assertEquals(null, principleMatrix.getValue(si1, p4));
		assertEquals(100.0f, principleMatrix.getValue(si2, p4));
	} 
	
	
	@Test
	public void test9() {
		

		// build graph for test case
		Goal g1 = GSSFactory.eINSTANCE.createGoal();
		g1.setName("goal 1");

		Principle p1 = GSSFactory.eINSTANCE.createPrinciple();
		p1.setName("Principle 1");
		Principle p2 = GSSFactory.eINSTANCE.createPrinciple();
		p2.setName("Principle 2");
		Principle p3 = GSSFactory.eINSTANCE.createPrinciple();
		p3.setName("Principle 3");
		
		Principle p4 = GSSFactory.eINSTANCE.createPrinciple();
		p4.setName("Principle 4");
		
		Principle p5 = GSSFactory.eINSTANCE.createPrinciple();
		p5.setName("Principle 5");
		
		Principle p6 = GSSFactory.eINSTANCE.createPrinciple();
		p6.setName("Principle 6");
		
		Pattern si1 = GSSFactory.eINSTANCE.createPattern();
		si1.setName("Pattern 1");
		Pattern si2 = GSSFactory.eINSTANCE.createPattern();
		si2.setName("Pattern 2");

		gss.getElements().add(g1);
		gss.getElements().add(p1);
		gss.getElements().add(p2);
		gss.getElements().add(p3);
		gss.getElements().add(p4);
		gss.getElements().add(p5);
		gss.getElements().add(p6);
		gss.getElements().add(si1);
		gss.getElements().add(si2);
		
		
		Decomposition decomposition1 = GSSFactory.eINSTANCE.createDecomposition();
		decomposition1.setSource(p2);
		decomposition1.setTarget(p1);
		
		Decomposition decomposition2 = GSSFactory.eINSTANCE.createDecomposition();
		decomposition2.setSource(p3);
		decomposition2.setTarget(p1);

		Decomposition decomposition3 = GSSFactory.eINSTANCE.createDecomposition();
		decomposition3.setSource(p3);
		decomposition3.setTarget(p4);

		Decomposition decomposition4 = GSSFactory.eINSTANCE.createDecomposition();
		decomposition4.setSource(p5);
		decomposition4.setTarget(p4);

		Decomposition decomposition5 = GSSFactory.eINSTANCE.createDecomposition();
		decomposition5.setSource(p6);
		decomposition5.setTarget(p4);

		
		Impact impact1 = GSSFactory.eINSTANCE.createImpact();
		impact1.setSource(p1);
		impact1.setTarget(g1);
		impact1.setWeight("100");
		
		Impact impact2 = GSSFactory.eINSTANCE.createImpact();
		impact2.setSource(si1);
		impact2.setTarget(p2);
		impact2.setWeight("100");
		
		Impact impact3 = GSSFactory.eINSTANCE.createImpact();
		impact3.setSource(si1);
		impact3.setTarget(p3);
		impact3.setWeight("100");
		
		Impact impact4 = GSSFactory.eINSTANCE.createImpact();
		impact4.setSource(si2);
		impact4.setTarget(p2);
		impact4.setWeight("100");
		
		Impact impact5 = GSSFactory.eINSTANCE.createImpact();
		impact5.setSource(si2);
		impact5.setTarget(p3);
		impact5.setWeight("100");
		
		Impact impact6 = GSSFactory.eINSTANCE.createImpact();
		impact6.setSource(si1);
		impact6.setTarget(p5);
		impact6.setWeight("100");
		
		Impact impact7 = GSSFactory.eINSTANCE.createImpact();
		impact7.setSource(p4);
		impact7.setTarget(g1);
		impact7.setWeight("100");
		
		Impact impact8 = GSSFactory.eINSTANCE.createImpact();
		impact8.setSource(si2);
		impact8.setTarget(p5);
		impact8.setWeight("100");
		
		Impact impact9 = GSSFactory.eINSTANCE.createImpact();
		impact9.setSource(si2);
		impact9.setTarget(p6);
		impact9.setWeight("100");

		
		gss.getRelations().add(decomposition1);
		gss.getRelations().add(decomposition2);
		gss.getRelations().add(decomposition3);
		gss.getRelations().add(decomposition4);
		gss.getRelations().add(decomposition5);

		
		gss.getRelations().add(impact1);
		gss.getRelations().add(impact2);
		gss.getRelations().add(impact3);
		gss.getRelations().add(impact4);
		gss.getRelations().add(impact5);
		gss.getRelations().add(impact6);
		gss.getRelations().add(impact7);
		gss.getRelations().add(impact8);
		gss.getRelations().add(impact9);
		

		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si1, p5));
		assertEquals(100.0f, principleMatrix.getValue(si2, p5));
		assertEquals(null, principleMatrix.getValue(si1, p6));
		assertEquals(100.0f, principleMatrix.getValue(si2, p6));

		assertEquals(66.6666667f, principleMatrix.getValue(si1, p4));
		assertEquals(100.0f, principleMatrix.getValue(si2, p4));
	} 
	
	
	@Test
	public void test10() {
		


		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		Principle p4 = createPrinciple(gss, 4);
		Principle p5 = createPrinciple(gss, 5);
		Principle p6 = createPrinciple(gss, 6);
		Principle p7 = createPrinciple(gss, 7);
		Principle p8 = createPrinciple(gss, 8);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p5, p4);
		createDecomposition(gss, p6, p4);
		createDecomposition(gss, p7, p6);
		createDecomposition(gss, p8, p6);

		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p2, 100);
		createImpact(gss, si1, p3, 100);
		createImpact(gss, si2, p2, 100);
		createImpact(gss, si2, p3, 100);
		createImpact(gss, si2, p5, 100);
		createImpact(gss, p4, g1, 100);
		createImpact(gss, si2, p7, 100);
		createImpact(gss, si3, p7, -100);
		createImpact(gss, si1, p8, 100);


		// execute required phases
		executeRequiredPhases();

		// check result


		assertEquals(100.0f, principleMatrix.getValue(si1, p2));
		assertEquals(100.0f, principleMatrix.getValue(si1, p3));

		assertEquals(100.0f, principleMatrix.getValue(si1, p1));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p2));
		assertEquals(100.0f, principleMatrix.getValue(si2, p3));
		
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
		
		assertEquals(null, principleMatrix.getValue(si3, p3));
		assertEquals(null, principleMatrix.getValue(si3, p2));
		assertEquals(null, principleMatrix.getValue(si3, p1));
		
		
		assertEquals(null, principleMatrix.getValue(si1, p7));
		assertEquals(null, principleMatrix.getValue(si1, p5));

		
		assertEquals(100.0f, principleMatrix.getValue(si2, p7));
		assertEquals(100.0f, principleMatrix.getValue(si2, p5));
		assertEquals(null, principleMatrix.getValue(si2, p8));
		
		assertEquals(null, principleMatrix.getValue(si3, p8));
		assertEquals(-100.0f, principleMatrix.getValue(si3, p7));
		assertEquals(null, principleMatrix.getValue(si3, p5));
		
		assertEquals(-50.0f, principleMatrix.getValue(si3, p6));
		assertEquals(-25.0f, principleMatrix.getValue(si3, p4));
		
	}
	
	
	@Test
	public void testx() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);
		
		Pattern si1 = createPattern(gss, 1);

		
		createDecomposition(gss, p3, p1);
		createDecomposition(gss, p3, p2);
		
		createImpact(gss, p1, g1, 20);
		createImpact(gss, p2, g1, 10);
		createImpact(gss, si1, p3, 10);

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(10.0f, principleMatrix.getValue(si1, p3));
		
		assertEquals(10.0f, principleMatrix.getValue(si1, p1));
		assertEquals(10.0f, principleMatrix.getValue(si1, p2));
		



	}
	
	@Test
	public void testIsA1() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
	
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
	
		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p1, 100);
		createIsA(gss, si3, si1);
		createIsA(gss, si2, si1);
		

		// execute required phases
		executeRequiredPhases();

		// check result

     	assertEquals(null, principleMatrix.getValue(si1, p1));
		assertEquals(100.0f, principleMatrix.getValue(si2, p1));
		assertEquals(100.0f, principleMatrix.getValue(si3, p1));
	}
	
	@Test
	public void testIsA2() {

		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
	
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
	
		createImpact(gss, p1, g1, 10);
		createImpact(gss, si3, p1, 30);
		createImpact(gss, si2, p1, 20);
		createIsA(gss, si3, si1);
		createIsA(gss, si2, si1);
		

		// execute required phases
		executeRequiredPhases();

		// check result

		assertEquals(null, principleMatrix.getValue(si1, p1));
		assertEquals(20.0f, principleMatrix.getValue(si2, p1));
		assertEquals(30.0f, principleMatrix.getValue(si3, p1));
	}
	

}

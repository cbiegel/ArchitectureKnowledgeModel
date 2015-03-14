package org.emftrace.quarc.core.tests.ratingscalculator;

import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.AdjustmentMatrixCreator;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class AdjustmentMatrixCreatorTest extends QUARCCoreTestCase{
	



private AdjustmentMatrixCreator adjustmentMatrixCreator;
private Matrix adjustmentMatrix;


private void executeRequiredPhases() {
	gssQuery.setIncludeAll(true);

	cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
	cacheManager.initCache();

	new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
			cacheManager, null,false).runWithoutUnicaseCommand();

	adjustmentMatrixCreator = new AdjustmentMatrixCreator(gssQuery, queryResultSet,
			accessLayer, cacheManager);

	adjustmentMatrixCreator.runWithoutUnicaseCommand();
	adjustmentMatrix = adjustmentMatrixCreator.getMatrix();
	

}

@Test
public void testOnlyApplicableElementsAreUsed() {
	// test for only applicable Elements are used

	cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
	cacheManager.initCache();
	
	//ApplicableElementCache applicableElementCache = new ApplicableElementCache(queryResultSet);
	//applicableElementCache.initCache();
	
	new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
			cacheManager, null, false).runWithoutUnicaseCommand();

	adjustmentMatrixCreator = new AdjustmentMatrixCreator(gssQuery, queryResultSet,
			accessLayer, cacheManager);

	adjustmentMatrixCreator.runWithoutUnicaseCommand();
	adjustmentMatrix = adjustmentMatrixCreator.getMatrix();

	// build graph for test case
	Goal g1 = GSSFactory.eINSTANCE.createGoal();
	g1.setName("goal 1");

	Pattern si1 = GSSFactory.eINSTANCE.createPattern();
	si1.setName("Principle 1");

	gss.getElements().add(g1);
	gss.getElements().add(si1);

	Offset offset = GSSFactory.eINSTANCE.createOffset();
	offset.setSource(si1);
	offset.setTarget(g1);
	offset.setValue("1");

	gss.getRelations().add(offset);


	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
}

@Test
public void test1() {
	//one Goal and one SolutionInstrument with Offset-Relation
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);


	Pattern si1 = createPattern(gss, 1);

createOffset(gss, si1, g1, 1);


	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(1.0f, adjustmentMatrix.getValue(si1, g1));
}

@Test
public void test2() {

	//one Goal and one SolutionInstrument without a Relation
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);

	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
}


@Test
public void test3() {

	//one Goal and one SolutionInstrument with Offset with weight Null
	
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);
	
	Offset offset = GSSFactory.eINSTANCE.createOffset();
	offset.setSource(si1);
	offset.setTarget(g1);
	offset.setValue(null);

	gss.getRelations().add(offset);

	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
}

@Test
public void test4() {

	//one Goal and one SolutionInstrument with Offset with weight 0.0f
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);

	createOffset(gss, si1, g1, 0);

	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(0.0f, adjustmentMatrix.getValue(si1, g1));
}
@Test
public void testIsA1() {
	
	//test for Offset from root SIs
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);
	Pattern si2 = createPattern(gss, 2);
	Pattern si3 = createPattern(gss, 3);

	createIsA(gss, si2, si1);
	createIsA(gss, si3, si1);
	
	createOffset(gss, si1, g1, 1);

	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
	
	assertEquals(1.0f, adjustmentMatrix.getValue(si2, g1));
	assertEquals(1.0f, adjustmentMatrix.getValue(si3, g1));
	
}

@Test
public void testIsA2() {
	
	//test for Offset from not-root SIs
	
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);
	Pattern si2 = createPattern(gss, 2);
	Pattern si3 = createPattern(gss, 3);

	createIsA(gss, si2, si1);
	createIsA(gss, si3, si1);
	
	createOffset(gss, si2, g1, 1.0f);
	createOffset(gss, si3, g1, 2.0f);

	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
	
	assertEquals(1.0f, adjustmentMatrix.getValue(si2, g1));
	assertEquals(2.0f, adjustmentMatrix.getValue(si3, g1));
	
}

@Test
public void testIsA3() {
	//test for Offset from not-root SIs
	
	// build graph for test case
	Goal g1 = createGoal(gss, 1);

	Pattern si1 = createPattern(gss, 1);
	Pattern si2 = createPattern(gss, 2);
	Pattern si3 = createPattern(gss, 3);
	Pattern si4 = createPattern(gss, 4);
	Pattern si5 = createPattern(gss, 5);

	createIsA(gss, si2, si1);
	createIsA(gss, si3, si1);
	createIsA(gss, si4, si3);
	createIsA(gss, si5, si3);
	
	createOffset(gss, si2, g1, 1.0f);
	createOffset(gss, si3, g1, 2.0f);


	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
	
	assertEquals(1.0f, adjustmentMatrix.getValue(si2, g1));
	assertEquals(null, adjustmentMatrix.getValue(si3, g1));
	assertEquals(2.0f, adjustmentMatrix.getValue(si4, g1));
	assertEquals(2.0f, adjustmentMatrix.getValue(si5, g1));
	
}

@Test
public void testIsA4() {
	
	//test for bug with Impact-Relation
	Goal g1 = createGoal(gss, 1);

	Principle p1 =createPrinciple(gss, 1);
	Pattern si1 = createPattern(gss, 1);
	Pattern si2 = createPattern(gss, 2);
	Pattern si3 = createPattern(gss, 3);

	createOffset(gss, si3, g1, 2.0f);
	createOffset(gss, si2, g1, 1.0f);

	createImpact(gss, si1, p1, 2.0f);
	createImpact(gss, p1, g1, 2.0f);

	createIsA(gss, si2, si1);
	createIsA(gss, si3, si1);
	// execute required phases
	executeRequiredPhases();

	// check result

	assertEquals(null, adjustmentMatrix.getValue(si1, g1));
	
	assertEquals(1.0f, adjustmentMatrix.getValue(si2, g1));
	assertEquals(2.0f, adjustmentMatrix.getValue(si3, g1));
	
}

}
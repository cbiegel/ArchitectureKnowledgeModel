package org.emftrace.quarc.core.tests.preselector;

import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsPruner;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class GSSGraphPrunerTest extends QUARCCoreTestCase{

	
	private void executeRequiredPhases(boolean prunePrinciples) {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss,queryResultSet, accessLayer);
		cacheManager.initCache();
		
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();

		ApplicableElementsPruner gssGraphPruner = new ApplicableElementsPruner(gssQuery, queryResultSet, accessLayer,cacheManager, prunePrinciples);
		
    	gssGraphPruner.runWithoutUnicaseCommand();
	}

	@Test
	public void testSimpleGraphWithAnythingToPrune() {
	
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		
		executeRequiredPhases(true);
		
		clearLists();
		
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		sourcesOfImpacts.add(p1);
		
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		targetsOfImpacts.add(p1);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
	}
	
	

	@Test
	public void testSimpleGraphWithoutGoals() {
		Principle p1 = createPrinciple(gss, 1);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, si1, p1, 1);
		
		executeRequiredPhases(true);
		
		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);
	}

	@Test
	public void testPrunePrincipleWithoutRelationFromAnInstrument() {
		
		
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		executeRequiredPhases(true);

		clearLists();
		
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		sourcesOfImpacts.add(p1);
		
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		targetsOfImpacts.add(p1);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
	
		assertNotContaintsApplicableElement(p2);
	}
	
	@Test
	public void testPrunePrincipleAndInstrumentsWithoutRelationsToGoals1() {
		//don't prune goals
		
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, si1, p1, 1);
		
		executeRequiredPhases(true);

		clearLists();
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);
	}
	
	@Test
	public void testPrunePrincipleAndInstrumentsWithoutRelationsToGoals2() {
		
		
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		createImpact(gss, si1, p2, 1);
		
		executeRequiredPhases(true);

		

		
		clearLists();
		
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		sourcesOfImpacts.add(p1);
		
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		targetsOfImpacts.add(p1);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		assertNotContaintsApplicableElement(p2);
	}
	
	@Test
	public void testPrunePrincipleAndInstrumentsWithoutRelationsToGoals3() {
		
		
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		createImpact(gss, p2, g1, 1);

		
		executeRequiredPhases(true);

		
		assertNotContaintsApplicableElement(p2);

		
		clearLists();
		
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		sourcesOfImpacts.add(p1);
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions, sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		
		targetsOfImpacts.add(p1);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		

	}
	
	public void testPrunneAbstractSI1(){
		 
		Goal g1 =  createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);


		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
	
		gssQuery.setIncludeAll(true);
		
		cacheManager = new CacheManager(gss,queryResultSet, accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null,false).runWithoutUnicaseCommand();
		
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		
		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		cacheManager.initGSSCache();
		
	
		ApplicableElementsPruner gssGraphPruner = new ApplicableElementsPruner(gssQuery, queryResultSet, accessLayer, cacheManager,true);
		
    	gssGraphPruner.runWithoutUnicaseCommand();	
		clearLists();
			
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		
		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);
		assertNotContaintsApplicableElement(si2);
		assertNotContaintsApplicableElement(si3);
		
	}

	public void testPrunneAbstractSI3(){
		 
		Goal g1 =  createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
	
		Pattern si2 = createPattern(gss, 2);
		createIsA(gss, si2, si1);
		
		gssQuery.setIncludeAll(true);
		
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		

		Pattern si3 = createPattern(gss, 3);
		createIsA(gss, si3, si1);
		
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();

		ApplicableElementsPruner gssGraphPruner = new ApplicableElementsPruner(gssQuery, queryResultSet, accessLayer,cacheManager, true);
		
    	gssGraphPruner.runWithoutUnicaseCommand();

		
		clearLists();
		sourcesOfImpacts.add(p1);
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		assertNotContaintsApplicableElement(si3);
		
	}

	public void testPrunneAbstractSI2(){
		 
		Goal g1 =  createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);


		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
	
		Pattern si2 = createPattern(gss, 2);
		createIsA(gss, si2, si1);

		Pattern si3 = createPattern(gss, 3);
		createIsA(gss, si3, si1);
		
	
		executeRequiredPhases(true);
		
		clearLists();
		sourcesOfImpacts.add(p1);
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );	
	}
	
	
	public void testPruneNoPrinciples(){
		 
		Goal g1 =  createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);

		
		Pattern si1 = createPattern(gss, 1);


		createImpact(gss, p1, g1, 1);

		createImpact(gss, p2, g1, 1);
		createImpact(gss, si1, p1, 1);
	
		Pattern si2 = createPattern(gss, 2);
		createIsA(gss, si2, si1);

		Pattern si3 = createPattern(gss, 3);
		createIsA(gss, si3, si1);
		
		createDecomposition(gss, p3, p1);
		
	
		executeRequiredPhases(false);
		
		clearLists();
		sourcesOfImpacts.add(p1);
		sourcesOfImpacts.add(p2);
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		sourcesOfDecompositions.add(p3);
		
		assertContaintsApplicableElement(p1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(p2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfDecompositions.add(p1);
		
		assertContaintsApplicableElement(p3, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );	
	}
	
	public void testPruneNoFlaws(){
		 
		Goal g1 =  createGoal(gss, 1);

		Flaw f1 = createFlaw(gss, 1);
		Flaw f2 = createFlaw(gss, 2);
		Flaw f3 = createFlaw(gss, 3);

		
		Pattern si1 = createPattern(gss, 1);


		createImpact(gss, f1, g1, 1);

		createImpact(gss, f2, g1, 1);
		createImpact(gss, si1, f1, 1);
	
		Pattern si2 = createPattern(gss, 2);
		createIsA(gss, si2, si1);

		Pattern si3 = createPattern(gss, 3);
		createIsA(gss, si3, si1);
		
		createDecomposition(gss, f3, f1);
		
	
		executeRequiredPhases(false);
		
		clearLists();
		sourcesOfImpacts.add(f1);
		sourcesOfImpacts.add(f2);
		
		assertContaintsApplicableElement(g1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		sourcesOfDecompositions.add(f3);
		
		assertContaintsApplicableElement(f1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		targetsOfImpacts.add(g1);
		
		assertContaintsApplicableElement(f2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfDecompositions.add(f1);
		
		assertContaintsApplicableElement(f3, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		
		clearLists();
		targetsOfImpacts.add(f1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		
		assertContaintsApplicableElement(si1, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );
		
		clearLists();
		targetsOfIsAs.add(si1);
		
		assertContaintsApplicableElement(si2, targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs, sourcesOfIsAs );	
	}

	


}

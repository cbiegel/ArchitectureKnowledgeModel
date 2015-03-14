package org.emftrace.quarc.core.tests.gssquery;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.GSSQueryProcessor;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class GSSQueryProcessorTest extends QUARCCoreTestCase{

	private GSSQueryProcessor gssQueryProcessor;
	
	private void executeRequiredPhases(boolean goalsAndPriniplesOnly) {
		gssQuery.setIncludeAll(true);
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();

		gssQueryProcessor = new GSSQueryProcessor(gssQuery, accessLayer, gss, null, goalsAndPriniplesOnly);
		gssQueryProcessor.runWithoutUnicaseCommand(); 
	}

	@Test
	public void testSimple() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);

		createImpact(gss, si1, p1, 100);
		
		createSelectedGoal(gssQuery, g1, 100);

		// execute required phases
		executeRequiredPhases(false);

		// check result
		
		assertNotNull(gssQuery.getQueryResultSet());

		assertEquals(3, gssQuery.getQueryResultSet().getApplicableElements().size());

		assertNotNull( gssQuery.getTimestamp());
		
		assertEquals(3, gssQuery.getQueryResultSet().getRatings().size());
		assertEquals(si1,((Rating) gssQuery.getQueryResultSet().getRatings().get(2)).getSource());
		assertEquals(g1,((Rating) gssQuery.getQueryResultSet().getRatings().get(2)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getWeight());
		
		assertEquals(p1,((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getSource());
		assertEquals(g1,((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getWeight());
		
		assertEquals(si1,((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getSource());
		assertEquals(p1,((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getWeight());
	}
	
	@Test
	public void testSelectedGoalsAreUsedOnly() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);
		createImpact(gss, p1, g2, 100);
		
		createImpact(gss, p2, g2, 100);
		createImpact(gss, si2, p2, 100);
		
		createImpact(gss, si1, p1, 100);
		
		createSelectedGoal(gssQuery, g1, 100);

		// execute required phases
		executeRequiredPhases(false);

		// check result
		
		assertNotNull(gssQuery.getQueryResultSet());

		assertEquals(3, gssQuery.getQueryResultSet().getApplicableElements().size());
		
		assertEquals(3, gssQuery.getQueryResultSet().getRatings().size());
		assertEquals(si1,((Rating) gssQuery.getQueryResultSet().getRatings().get(2)).getSource());
		assertEquals(g1,((Rating) gssQuery.getQueryResultSet().getRatings().get(2)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getWeight());
		
		assertEquals(p1,((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getSource());
		assertEquals(g1,((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(0)).getWeight());
		
		assertEquals(si1,((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getSource());
		assertEquals(p1,((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getTarget());
		assertEquals("100.0",((Rating) gssQuery.getQueryResultSet().getRatings().get(1)).getWeight());
		
	}
	
	
	@Test
	public void testOnlyGoalsAndPriniplesOnly_SelectedGoalsAreUsedOnly() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);
		createImpact(gss, p1, g2, 100);
		
		createImpact(gss, p2, g2, 100);
		createImpact(gss, si2, p2, 100);
		
		createImpact(gss, si1, p1, 100);
		

		// execute required phases
		executeRequiredPhases(true);

		// check result
		
		assertNotNull(gssQuery.getQueryResultSet());

		
		assertEquals(0, gssQuery.getQueryResultSet().getRatings().size());
		
		assertEquals(4, gssQuery.getQueryResultSet().getApplicableElements().size());
		

		
		
	}
	
	@Test
	public void testOnlyGoalsAndPriniplesOnly() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);
		createImpact(gss, p1, g2, 100);
		
		createImpact(gss, p2, g2, 100);
		createImpact(gss, si2, p2, 100);
		
		createImpact(gss, si1, p1, 100);
		
		createSelectedGoal(gssQuery, g1, 100);

		// execute required phases
		executeRequiredPhases(true);

		// check result
		
		assertNotNull(gssQuery.getQueryResultSet());

		
		assertEquals(0, gssQuery.getQueryResultSet().getRatings().size());
		
		assertEquals(2, gssQuery.getQueryResultSet().getApplicableElements().size());
		
	}
	
	@Test
	public void testSetChangeFlags() {
		// build graph for test case
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);

		createImpact(gss, si1, p1, 100);
				
		gssQuery.setChanged(true);
		gssQuery.getAssignedConstraintsSet().setChanged(true);
		createSelectedGoal(gssQuery, g1, 100);
		gssQuery.getSelectedGoalsSet().setChanged(true);
		createSelectedPrinciple(gssQuery, p1, 100);
		gssQuery.getSelectedPrinciplesSet().setChanged(true);

		// execute required phases
		executeRequiredPhases(false);

		// check result
		

		assertEquals(false, gssQuery.isChanged());
		assertEquals(false, gssQuery.getAssignedConstraintsSet().isChanged());
		assertEquals(false, gssQuery.getSelectedGoalsSet().isChanged());
		assertEquals(false, gssQuery.getSelectedPrinciplesSet().isChanged());
		
	}
}

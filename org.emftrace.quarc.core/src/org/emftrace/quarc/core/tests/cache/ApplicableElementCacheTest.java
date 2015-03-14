package org.emftrace.quarc.core.tests.cache;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.cache.GSSQueryCache;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class ApplicableElementCacheTest extends QUARCCoreTestCase {

	private GSSQueryCache applicableElementCache;

	private void executeRequiredPhases() {
		gssQuery.setIncludeAll(true);	
		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		

		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
		
		
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, false).runWithoutUnicaseCommand();
		

		applicableElementCache.initCache();
	}
	
	@Test
	public void testApplicableElementCacheInit() {
		executeRequiredPhases(); //test for constructor
	}

	@Test
	public void testGetRootElements() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(5, applicableElementCache.getRootElements().size());
		assertTrue( applicableElementCache.getRootElements().contains(g1));
		assertTrue( applicableElementCache.getRootElements().contains(g4));
		assertTrue( applicableElementCache.getRootElements().contains(p1));
		assertTrue( applicableElementCache.getRootElements().contains(si1));
		assertTrue( applicableElementCache.getRootElements().contains(si4));
			
	}

	@Test
	public void testIsRootElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		

		assertTrue( applicableElementCache.isRootElement(g1));
		assertTrue( applicableElementCache.isRootElement(g4));
		assertTrue( applicableElementCache.isRootElement(p1));
		assertTrue( applicableElementCache.isRootElement(si1));
		assertTrue( applicableElementCache.isRootElement(si4));
		assertFalse( applicableElementCache.isRootElement(g2));
		assertFalse( applicableElementCache.isRootElement(g3));
		assertFalse( applicableElementCache.isRootElement(si2));
		assertFalse( applicableElementCache.isRootElement(si3));

	}

	@Test
	public void testIsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);
		
		
		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty();
		Precondition precondition = ConstraintsFactory.eINSTANCE.createPrecondition(); 
		
		BaseCondition baseCondition =ConstraintsFactory.eINSTANCE.createBaseCondition();
		baseCondition.setTechnicalProperty(property);
		baseCondition.setValue("foo");
		baseCondition.setOperator(BaseConditionOperators.EQUALS);
		
		precondition.getBaseConditions().add(baseCondition);
		si4.setPrecondition(precondition);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		

		assertTrue( applicableElementCache.isApplicableElement(g1));
		assertTrue( applicableElementCache.isApplicableElement(g4));
		assertTrue( applicableElementCache.isApplicableElement(p1));
		assertTrue( applicableElementCache.isApplicableElement(si1));
		assertTrue( applicableElementCache.isApplicableElement(si3));
		assertTrue( applicableElementCache.isApplicableElement(g2));
		assertTrue( applicableElementCache.isApplicableElement(g3));
		assertTrue( applicableElementCache.isApplicableElement(si2));
		assertFalse( applicableElementCache.isApplicableElement(si4));
	}

	@Test
	public void testIsLeafElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		

		assertFalse( applicableElementCache.isLeafElement(g1));
		assertTrue( applicableElementCache.isLeafElement(g4));
		assertTrue( applicableElementCache.isLeafElement(p1));
		assertFalse( applicableElementCache.isLeafElement(si1));
		assertTrue( applicableElementCache.isLeafElement(si4));
		assertTrue( applicableElementCache.isLeafElement(g2));
		assertTrue( applicableElementCache.isLeafElement(g3));
		assertTrue( applicableElementCache.isLeafElement(si2));
		assertTrue( applicableElementCache.isLeafElement(si3));
	}

	@Test
	public void testGetRootApplicableElements() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(5, applicableElementCache.getRootElements().size());
	}

	@Test
	public void testGetApplicableElementsSet() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(9, applicableElementCache.getApplicableElementsSet().size());
		assertEquals(4, applicableElementCache.getApplicableElementsSet("Goal").size());
	}

	@Test
	public void testGetElementsSet() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(9, applicableElementCache.getElementsSet().size());
		assertEquals(4, applicableElementCache.getElementsSet("Goal").size());
	}

	@Test
	public void testGetIncomingImpactRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(1, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(1, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(2, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetIncomingImpactRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(g1).size());
		assertEquals(1, applicableElementCache.getIncomingImpactRelations(g2).size());
		assertEquals(1, applicableElementCache.getIncomingImpactRelations(g3).size());
		assertEquals(2, applicableElementCache.getIncomingImpactRelations(p1).size());
		
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(si1).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(si2).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(si3).size());
		assertEquals(0, applicableElementCache.getIncomingImpactRelations(si4).size());
	}

	@Test
	public void testGetApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		
		executeRequiredPhases();
		
		Goal g2 = createGoal(gss, 2);
		
		assertEquals(g1, applicableElementCache.getApplicableElement(g1).getElement());
		assertEquals(null, applicableElementCache.getApplicableElement(g2));
	}

	@Test
	public void testGetElement() {
		Goal g1 = createGoal(gss, 1);
		
		executeRequiredPhases();
		
		ApplicableElement ag2 = QueryFactory.eINSTANCE.createApplicableElement();

		Goal g2 = createGoal(gss, 2);
		ag2.setElement(g2);
		
		
		assertEquals(g1, applicableElementCache.getElement(applicableElementCache.getApplicableElement(g1)));
		assertEquals(null, applicableElementCache.getElement(ag2));
	}

	@Test
	public void testGetOutgoingImpactRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(2, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(1, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(1, applicableElementCache.getOutgoingImpactRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetOutgoingImpactRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(g1).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(g2).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(g3).size());
		assertEquals(2, applicableElementCache.getOutgoingImpactRelations(p1).size());
		
		assertEquals(1, applicableElementCache.getOutgoingImpactRelations(si1).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(si2).size());
		assertEquals(0, applicableElementCache.getOutgoingImpactRelations(si3).size());
		assertEquals(1, applicableElementCache.getOutgoingImpactRelations(si4).size());
	}

	@Test
	public void testGetOutgoingOffsetRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(1, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(1, applicableElementCache.getOutgoingOffsetRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetOutgoingOffsetRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(g1).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(g2).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(g3).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(p1).size());
		
		assertEquals(1, applicableElementCache.getOutgoingOffsetRelations(si1).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(si2).size());
		assertEquals(0, applicableElementCache.getOutgoingOffsetRelations(si3).size());
		assertEquals(1, applicableElementCache.getOutgoingOffsetRelations(si4).size());
	}

	@Test
	public void testGetIncomingOffsetRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(g4)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetIncomingOffsetRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getIncomingOffsetRelations(g1).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(g2).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(g3).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(g4).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(p1).size());
		
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(si1).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(si2).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(si3).size());
		assertEquals(0, applicableElementCache.getIncomingOffsetRelations(si4).size());
	}

	@Test
	public void testGetIncomingDecompositionRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(g4)).size());
		
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetIncomingDecompositionRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getIncomingDecompositionRelations(g1).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(g2).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(g3).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(g4).size());
		
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(p1).size());
		
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(si1).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(si2).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(si3).size());
		assertEquals(0, applicableElementCache.getIncomingDecompositionRelations(si4).size());
	}

	@Test
	public void testGetOutgoingDecompositionRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(1, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(1, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(g4)).size());
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetOutgoingDecompositionRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(g1).size());
		assertEquals(1, applicableElementCache.getOutgoingDecompositionRelations(g2).size());
		assertEquals(1, applicableElementCache.getOutgoingDecompositionRelations(g3).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(g4).size());
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(p1).size());
		
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(si1).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(si2).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(si3).size());
		assertEquals(0, applicableElementCache.getOutgoingDecompositionRelations(si4).size());
	}

	@Test
	public void testGetOutgoingIsARelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertNull(applicableElementCache.getOutgoingIsARelation(g1));
		assertNull( applicableElementCache.getOutgoingIsARelation(g2));
		assertNull(applicableElementCache.getOutgoingIsARelation(g3));
		assertNull( applicableElementCache.getOutgoingIsARelation(g4));
		
		assertNull(applicableElementCache.getOutgoingIsARelation(p1));
		assertNull(applicableElementCache.getOutgoingIsARelation(si1));
		assertEquals(si1, applicableElementCache.getOutgoingIsARelation(si2).getTarget());
		assertEquals(si1, applicableElementCache.getOutgoingIsARelation(si3).getTarget());
		assertNull(applicableElementCache.getOutgoingIsARelation(si4));
	}

	@Test
	public void testGetIncomingIsARelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getIncomingIsARelations(g1).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(g2).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(g3).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(g4).size());
		
		assertEquals(0, applicableElementCache.getIncomingIsARelations(p1).size());
		
		assertEquals(2, applicableElementCache.getIncomingIsARelations(si1).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(si2).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(si3).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(si4).size());
	}

	@Test
	public void testGetOutgoingIsARelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertNull(applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(g1)));
		assertNull( applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(g2)));
		assertNull(applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(g3)));
		assertNull( applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(g4)));
		
		assertNull(applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(p1)));
		assertNull(applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(si1)));
		assertEquals(si1, applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(si2)).getTarget());
		assertEquals(si1, applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(si3)).getTarget());
		assertNull(applicableElementCache.getOutgoingIsARelations(applicableElementCache.getApplicableElement(si4)));
	}

	@Test
	public void testGetIncomingIsARelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);
		
		createOffset(gss, si1, g1, 1);
		createOffset(gss, si4, g1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(g4)).size());
		
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(p1)).size());
		
		assertEquals(2, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getIncomingIsARelations(applicableElementCache.getApplicableElement(si4)).size());
	}


	@Test
	public void testGetAllIncomingRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getAllIncomingRelations(g1).size());

		assertEquals(1, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(p1, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(g2)).get(0).getSource());
		assertEquals(1, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(p1, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(g3)).get(0).getSource());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(g4)).size());
		
		assertEquals(2, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(p1)).size());

		assertEquals(2, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(applicableElementCache.getApplicableElement(si4)).size());
	}

	@Test
	public void testGetAllOutgoingRelationsApplicableElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g1)).size());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g2)).size());
		assertEquals(g1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g2)).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g3)).size());
		assertEquals(g1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g3)).get(0).getTarget());
		assertEquals(0, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(g4)).size());
		assertEquals(2, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(p1)).size());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si1)).size());
		assertEquals(p1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si1)).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si2)).size());
		assertEquals(si1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si2)).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si3)).size());
		assertEquals(si1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si3)).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si4)).size());
		assertEquals(p1, applicableElementCache.getAllOutgoingRelations(applicableElementCache.getApplicableElement(si4)).get(0).getTarget());
	}

	@Test
	public void testGetAllIncomingRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getAllIncomingRelations(g1).size());

		assertEquals(1, applicableElementCache.getAllIncomingRelations(g2).size());
		assertEquals(p1, applicableElementCache.getAllIncomingRelations(g2).get(0).getSource());
		assertEquals(1, applicableElementCache.getAllIncomingRelations(g3).size());
		assertEquals(p1, applicableElementCache.getAllIncomingRelations(g3).get(0).getSource());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(g4).size());
		
		assertEquals(2, applicableElementCache.getAllIncomingRelations(p1).size());

		assertEquals(2, applicableElementCache.getAllIncomingRelations(si1).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(si2).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(si3).size());
		assertEquals(0, applicableElementCache.getAllIncomingRelations(si4).size());	

	}


	@Test
	public void testGetAllOutgoingRelationsElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(0, applicableElementCache.getAllOutgoingRelations(g1).size());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(g2).size());
		assertEquals(g1, applicableElementCache.getAllOutgoingRelations(g2).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(g3).size());
		assertEquals(g1, applicableElementCache.getAllOutgoingRelations(g3).get(0).getTarget());
		assertEquals(0, applicableElementCache.getAllOutgoingRelations(g4).size());
		assertEquals(2, applicableElementCache.getAllOutgoingRelations(p1).size());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(si1).size());
		assertEquals(p1, applicableElementCache.getAllOutgoingRelations(si1).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(si2).size());
		assertEquals(si1, applicableElementCache.getAllOutgoingRelations(si2).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(si3).size());
		assertEquals(si1, applicableElementCache.getAllOutgoingRelations(si3).get(0).getTarget());
		assertEquals(1, applicableElementCache.getAllOutgoingRelations(si4).size());
		assertEquals(p1, applicableElementCache.getAllOutgoingRelations(si4).get(0).getTarget());
	}

	@Test
	public void testGetAllElements() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(9, applicableElementCache.getAllElements().size());
	}

	@Test
	public void testGetAllApplicableElements() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(9, applicableElementCache.getAllApplicableElements().size());
	}

	@Test
	public void testGetAllElementsInt() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(4, applicableElementCache.getAllElements(GSSLayer.layer1).size());
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g1));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g3));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g4));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g4));
	
		assertEquals(4, applicableElementCache.getAllElements(GSSLayer.layer2).size()); //layer 1 == layer 2
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g1));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g2));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g3));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer1).contains(g4));
		
		assertEquals(1, applicableElementCache.getAllElements(GSSLayer.layer3).size());
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer3).contains(p1));
		
		assertEquals(4, applicableElementCache.getAllElements(GSSLayer.layer4).size());
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer4).contains(si1));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer4).contains(si2));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer4).contains(si3));
		assertTrue( applicableElementCache.getAllElements(GSSLayer.layer4).contains(si4));
	}

	@Test
	public void testGetRootElementsInt() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(2, applicableElementCache.getRootElements(GSSLayer.layer1).size());
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer1).contains(g1));
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer1).contains(g4));
	
		assertEquals(2, applicableElementCache.getRootElements(GSSLayer.layer2).size()); //layer 1 == layer 2
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer2).contains(g1));
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer2).contains(g4));
		
		assertEquals(1, applicableElementCache.getRootElements(GSSLayer.layer3).size());
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer3).contains(p1));
		
		assertEquals(2, applicableElementCache.getRootElements(GSSLayer.layer4).size());
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer4).contains(si1));
		assertTrue( applicableElementCache.getRootElements(GSSLayer.layer4).contains(si4));
	}

	@Test
	public void testGetLeafElementsInt() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		
		executeRequiredPhases();
		
		assertEquals(3, applicableElementCache.getLeafElements(GSSLayer.layer1).size());
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer1).contains(g2));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer1).contains(g3));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer1).contains(g4));
	
		assertEquals(3, applicableElementCache.getLeafElements(GSSLayer.layer2).size()); //layer 1 == layer 2
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer2).contains(g2));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer2).contains(g3));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer2).contains(g4));
		
		assertEquals(1, applicableElementCache.getLeafElements(GSSLayer.layer3).size());
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer3).contains(p1));
		
		assertEquals(3, applicableElementCache.getLeafElements(GSSLayer.layer4).size());
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer4).contains(si2));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer4).contains(si3));
		assertTrue( applicableElementCache.getLeafElements(GSSLayer.layer4).contains(si4));
	}

	@Test
	public void testIsInnerNodeElement() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		Goal g4 = createGoal(gss, 1);
		
		createDecomposition(gss, g2, g1);
		createDecomposition(gss, g3, g1);
		createDecomposition(gss, g4, g3);
		
		Principle p1 = createPrinciple(gss, 1);
		
		createImpact(gss, p1, g2, 1);
		createImpact(gss, p1, g3, 1);
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);
		Pattern si4 = createPattern(gss, 4);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si4, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		createIsA(gss, si4, si3);
		
		executeRequiredPhases();
		

		assertFalse( applicableElementCache.isInnerNodeElement(g1));
		assertFalse( applicableElementCache.isInnerNodeElement(g2));
		assertTrue( applicableElementCache.isInnerNodeElement(g3));
		assertFalse( applicableElementCache.isInnerNodeElement(g4));
		assertFalse( applicableElementCache.isInnerNodeElement(p1));
		assertFalse( applicableElementCache.isInnerNodeElement(si1));
		assertFalse( applicableElementCache.isInnerNodeElement(si2));
		assertTrue( applicableElementCache.isInnerNodeElement(si3));
		assertFalse( applicableElementCache.isInnerNodeElement(si4));

	}
	
	@Test
	public void testAddRelation(){
	
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 1);
		Goal g3 = createGoal(gss, 1);
		
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
		applicableElementCache.createApplicableElement(g1);
		
		assertTrue(applicableElementCache.isLeafElement(g1));
		assertTrue(applicableElementCache.isRootElement(g1));
		
		applicableElementCache.createApplicableElement(g2);
		
		assertTrue(applicableElementCache.isLeafElement(g1));
		assertTrue(applicableElementCache.isRootElement(g1));
		
		createDecomposition(gss, g2, g1);
		
		
		applicableElementCache.getApplicableElement(g2).getOutgoingDecompositionRelations().add((Decomposition) gss.getRelations().get(0));
		
		applicableElementCache.addRelation(applicableElementCache.getApplicableElement(g2), applicableElementCache.getApplicableElement(g1), applicableElementCache.getApplicableElement(g2).getOutgoingDecompositionRelations().get(0));
		
		
		assertFalse(applicableElementCache.isLeafElement(g1));
		assertTrue(applicableElementCache.isRootElement(g1));
		
		assertTrue(applicableElementCache.isLeafElement(g2));
		assertFalse(applicableElementCache.isRootElement(g2));
		
		applicableElementCache.createApplicableElement(g3);
		createDecomposition(gss, g3, g2);
		
		applicableElementCache.getApplicableElement(g3).getOutgoingDecompositionRelations().add((Decomposition) gss.getRelations().get(1));
		
		applicableElementCache.addRelation(applicableElementCache.getApplicableElement(g3), applicableElementCache.getApplicableElement(g2), applicableElementCache.getApplicableElement(g3).getOutgoingDecompositionRelations().get(0));
		
		assertFalse(applicableElementCache.isLeafElement(g1));
		assertTrue(applicableElementCache.isRootElement(g1));
		
		assertFalse(applicableElementCache.isLeafElement(g2));
		assertFalse(applicableElementCache.isRootElement(g2));
		
		assertTrue(applicableElementCache.isLeafElement(g3));
		assertFalse(applicableElementCache.isRootElement(g3));
		
	}
	@Test
	public void testCreateRatingRelation() {
		Goal g1 = createGoal(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);
		
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
	
		

		Rating rating = applicableElementCache.createRatingRelation(si1, g1, 100.0f);
		
		
		assertEquals(1, queryResultSet.getRatings().size());
		assertEquals(rating, queryResultSet.getRatings().get(0));
		
		assertEquals(si1,rating.getSource());
		assertEquals(g1,rating.getTarget());
		assertEquals("100.0",rating.getWeight());
	
	}

	@Test
	public void testGetRatingWeight() {
		Goal g1 = createGoal(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);
		
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
	
		

		applicableElementCache.createRatingRelation(si1, g1, 100.0f);
		
		
		assertEquals(0f, applicableElementCache.getRatingWeight(g1, si1));
		assertEquals(100.0f, applicableElementCache.getRatingWeight(si1, g1));



	}
	
	@Test
	public void testGetIndirectRatingWeight() {
		Goal g1 = createGoal(gss, 1);
		
		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		
		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		
		Impact i1 = createImpact(gss, p1, g1, 100.0f);
		Impact i2 = createImpact(gss, si1, p2, 100.0f);
		
		isA isa1 = createIsA(gss, si2, si1);
		Decomposition d1 = createDecomposition(gss, p2, p1);
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
	
		
		ApplicableElement aeg1 = applicableElementCache.createApplicableElement(g1);
		ApplicableElement aep1 =applicableElementCache.createApplicableElement(p1);
		ApplicableElement aep2 =applicableElementCache.createApplicableElement(p2);
		ApplicableElement aesi1 =applicableElementCache.createApplicableElement(si1);
		ApplicableElement aesi2 =applicableElementCache.createApplicableElement(si2);
		
		applicableElementCache.addRelation(aep1, aeg1, i1);
		applicableElementCache.addRelation(aesi1, aep2, i2);
		
		applicableElementCache.addRelation(aep2, aep1, d1);
		applicableElementCache.addRelation(aesi2, aesi1, isa1);

		applicableElementCache.createRatingRelation(si2, g1, 100.0f);
		
		applicableElementCache.createRatingRelation(p1, g1, 100.0f);
		
		
		
		assertEquals(100.0f, applicableElementCache.getIndirectRatingWeight(p1, g1));
		assertEquals(100.0f, applicableElementCache.getIndirectRatingWeight(p2, g1));


		assertEquals(100.0f, applicableElementCache.getIndirectRatingWeight(si1, g1));
		assertEquals(100.0f, applicableElementCache.getIndirectRatingWeight(si2, g1));



	}

	@Test
	public void testGetRatingRelations() {

		Goal g1 = createGoal(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 1);
		
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
	
		

		Rating r1 = applicableElementCache.createRatingRelation(si1, g1, 100.0f);
		Rating r2 =applicableElementCache.createRatingRelation(si2, g1, 50.0f);
		
		
		assertEquals(r1, applicableElementCache.getRatingRelation(si1, g1));
		assertEquals(r2, applicableElementCache.getRatingRelation(si2, g1));

		
	}
	

	
	
	@Test
	public void testGetRatingRelationsTo() {
		Goal g1 = createGoal(gss, 1);

		
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 1);
		
		
		applicableElementCache = new GSSQueryCache(queryResultSet, accessLayer);
		applicableElementCache.initCache();
	
		

		Rating r1 = applicableElementCache.createRatingRelation(si1, g1, 100.0f);
		Rating r2 =applicableElementCache.createRatingRelation(si2, g1, 50.0f);
		
		
		assertEquals(2, applicableElementCache.getRatingRelationsTo(g1).size());
		assertTrue( applicableElementCache.getRatingRelationsTo(g1).contains(r1));
		assertTrue( applicableElementCache.getRatingRelationsTo(g1).contains(r2));
	}
	
	
}

package org.emftrace.quarc.core.tests.preselector;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class ApplicableElementsSelectorTest extends QUARCCoreTestCase {

	private void executeRequiredPhases(boolean goalsAndPriniplesOnly) {

		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();
		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, null, gssQuery.getSelectedGoalsSet(),
				goalsAndPriniplesOnly).runWithoutUnicaseCommand();

	}

	@Test
	public void testSimpleGraph() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(3, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testSimpleGraphWithoutRelationFromGoalToSI() {

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);
		assertEquals(0, queryResultSet.getApplicableElements().size());

	}

	@Test
	public void testIgnorePrincipleWithoutRelationToGoal1() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		createImpact(gss, si1, p2, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);
		;

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		assertNotContaintsApplicableElement(p2);
		// assertContaintsApplicableElement(p2,
		// targetsOfDecompositions,sourcesOfDecompositions, targetsOfImpacts,
		// sourcesOfImpacts, targetsOfOffsets, sourcesOfOffsets );

		assertEquals(3, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testIgnorePrincipleWithoutRelationToGoal2() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);

		assertEquals(1, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testIgnorePrincipleWithoutRelationToGoal3() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		createImpact(gss, p2, g1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);
		sourcesOfImpacts.add(p2);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(4, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testImpactFromTwoPriniplesToASI() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, p2, g1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		assertEquals(4, queryResultSet.getApplicableElements().size());

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);
		sourcesOfImpacts.add(p2);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);
		targetsOfImpacts.add(p2);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

	}

	@Test
	public void testDecompositionsForGoals() {

		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		Goal g4 = createGoal(gss, 4);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createImpact(gss, p1, g1, 1);

		createImpact(gss, si1, p1, 1);
		createImpact(gss, si2, p2, 1);
		createImpact(gss, p2, g3, 1);
		createImpact(gss, p2, g1, 1);
		createImpact(gss, p1, g4, 1);

		createDecomposition(gss, g3, g2);
		createDecomposition(gss, g4, g2);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(p1);
		sourcesOfImpacts.add(p2);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfDecompositions.add(g3);
		sourcesOfDecompositions.add(g4);

		assertContaintsApplicableElement(g2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p2);
		targetsOfDecompositions.add(g2);

		assertContaintsApplicableElement(g3, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);
		targetsOfDecompositions.add(g2);

		assertContaintsApplicableElement(g4, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		targetsOfImpacts.add(g4);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		sourcesOfImpacts.add(si2);
		targetsOfImpacts.add(g3);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p2);

		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(8, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testIsA2() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);

		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);

		assertContaintsApplicableElement(si3, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(5, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testDecompositionsForPrinciples() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfDecompositions.add(p2);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfDecompositions.add(p1);

		assertContaintsApplicableElement(p2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p2);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(4, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testElementWithUnsatisfiedPrecondition() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		TechnicalProperty propery = ConstraintsFactory.eINSTANCE
				.createStringTechnicalProperty();
		Precondition precondition = ConstraintsFactory.eINSTANCE
				.createPrecondition();
		BaseCondition baseCondition = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition.setTechnicalProperty(propery);
		baseCondition.setValue("foo");
		baseCondition.setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().add(baseCondition);
		si2.setPrecondition(precondition);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si2, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfDecompositions.add(p2);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfDecompositions.add(p1);

		assertContaintsApplicableElement(p2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p2);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(4, queryResultSet.getApplicableElements().size());

		for (ApplicableElement ae : queryResultSet.getApplicableElements())
			if (ae.getElement() == p1) {
				assertEquals(
						1,
						ae.getIncomingRelationsFromElementsWithUndefinedProperties()
								.size());
				assertEquals(
						p1,
						((Relation) ae
								.getIncomingRelationsFromElementsWithUndefinedProperties()
								.get(0)).getTarget());
				assertEquals(
						si2,
						((Relation) ae
								.getIncomingRelationsFromElementsWithUndefinedProperties()
								.get(0)).getSource());

			} else if (ae.getElement() == p2) {
				assertEquals(
						0,
						ae.getIncomingRelationsFromElementsWithUndefinedProperties()
								.size());
			} else if (ae.getElement() == g1) {
				assertEquals(
						0,
						ae.getIncomingRelationsFromElementsWithUndefinedProperties()
								.size());
			} else if (ae.getElement() == si1) {
				assertEquals(
						0,
						ae.getIncomingRelationsFromElementsWithUndefinedProperties()
								.size());
			}

	}

	@Test
	public void testForImpactWeightEquals0() {

		// test for impact weight == 0
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 0.0f);
		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);

	}

	@Test
	public void testForNullImpactWeight() {

		// test for impact weight == null
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		Impact impact = GSSFactory.eINSTANCE.createImpact();
		impact.setSource(p1);
		impact.setTarget(g1);
		impact.setWeight(null);

		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);

	}

	@Test
	public void testIsA() {

		// test for bug with Impact-Relation
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
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

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		// check result

		clearLists();

		sourcesOfImpacts.add(p1);
		sourcesOfOffsets.add(si2);
		sourcesOfOffsets.add(si3);
		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		targetsOfOffsets.add(g1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		targetsOfOffsets.add(g1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

	}

	@Test
	public void testWithSelectedGoalsSet() {

		// test for bug with Impact-Relation
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createOffset(gss, si3, g1, 2.0f);
		createOffset(gss, si2, g1, 1.0f);

		createImpact(gss, si1, p1, 2.0f);
		createImpact(gss, p1, g1, 2.0f);
		createImpact(gss, p1, g2, 2.0f);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);
		// execute required phases

		createSelectedGoal(gssQuery, g1, 100);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		// check result

		clearLists();

		sourcesOfImpacts.add(p1);
		sourcesOfOffsets.add(si2);
		sourcesOfOffsets.add(si3);
		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);
		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		targetsOfOffsets.add(g1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		targetsOfOffsets.add(g1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertNotContaintsApplicableElement(g2);

	}

	@Test
	public void testWithSelectedSubgoals() {

		// test for bug with Subgoals
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		Goal g4 = createGoal(gss, 4);
		Goal g5 = createGoal(gss, 4);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);
		Pattern si3 = createPattern(gss, 3);

		createImpact(gss, si1, p1, 2.0f);
		createImpact(gss, p1, g3, 2.0f);
		createImpact(gss, p1, g5, 2.0f);

		createDecomposition(gss, g3, g1);
		createDecomposition(gss, g4, g2);
		createDecomposition(gss, g5, g4);

		createIsA(gss, si2, si1);
		createIsA(gss, si3, si1);

		createOffset(gss, si3, g1, 2.0f);
		createOffset(gss, si2, g1, 1.0f);

		// execute required phases

		createSelectedGoal(gssQuery, g3, 50);
		createSelectedGoal(gssQuery, g4, 50);
		createSelectedGoal(gssQuery, g5, 50);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		// check result

		assertNotContaintsApplicableElement(g2);
		assertNotContaintsApplicableElement(g1);

		clearLists();
		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g3, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfDecompositions.add(g5);
		assertContaintsApplicableElement(g4, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfDecompositions.add(g4);
		sourcesOfImpacts.add(p1);
		assertContaintsApplicableElement(g5, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g5);
		targetsOfImpacts.add(g3);
		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		targetsOfImpacts.add(p1);
		sourcesOfIsAs.add(si2);
		sourcesOfIsAs.add(si3);
		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfIsAs.add(si1);
		assertContaintsApplicableElement(si2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

	}

	@Test
	public void testForFlaw() {

		Goal g1 = createGoal(gss, 1);

		Principle f1 = createFlaw(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, f1, g1, 1);
		createImpact(gss, si1, f1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(f1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(f1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(f1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(3, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testForDecompostionsForFlaws() {

		Goal g1 = createGoal(gss, 1);

		Principle f1 = createFlaw(gss, 1);
		Principle f2 = createFlaw(gss, 2);
		Principle f3 = createFlaw(gss, 3);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, f1, g1, 1);
		createImpact(gss, si1, f3, 1);
		createImpact(gss, si1, f2, 1);

		createDecomposition(gss, f3, f1);
		createDecomposition(gss, f2, f1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfDecompositions.add(f2);
		sourcesOfDecompositions.add(f3);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(f1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		targetsOfDecompositions.add(f1);
		sourcesOfImpacts.add(si1);

		assertContaintsApplicableElement(f2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();
		targetsOfDecompositions.add(f1);
		sourcesOfImpacts.add(si1);

		assertContaintsApplicableElement(f3, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(f1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(f2);
		targetsOfImpacts.add(f3);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(5, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testWithFilterForPrinicples() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(false);
		gssQuery.setIncludePattern(true);

		executeRequiredPhases(false);

		clearLists();

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertNotContaintsApplicableElement(p1);
		assertNotContaintsApplicableElement(si1);

		assertEquals(1, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testWithFilterForIncludeAll() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p1, 1);

		gssQuery.setIncludeAll(true);
		executeRequiredPhases(false);

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		assertEquals(3, queryResultSet.getApplicableElements().size());
	}

	@Test
	public void testNoRootGoalIsSelectedBug() {

		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createDecomposition(gss, g2, g1);

		createImpact(gss, p1, g2, 100);
		createImpact(gss, si1, p1, 100);

		createSelectedGoal(gssQuery, g2, 100);

		gssQuery.setIncludePattern(true);
		gssQuery.setIncludePrinciples(true);

		executeRequiredPhases(false);

		assertEquals(3, queryResultSet.getApplicableElements().size());

		clearLists();

		sourcesOfImpacts.add(si1);
		targetsOfImpacts.add(g2);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g2, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		targetsOfImpacts.add(p1);

		assertContaintsApplicableElement(si1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

	}
	
	
	@Test
	public void testGoalsAndPriniplesOnly() {

		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Pattern si1 = createPattern(gss, 1);

		createImpact(gss, p1, g1, 100);
		createImpact(gss, si1, p1, 100);


		gssQuery.setIncludePattern(true);
		gssQuery.setIncludePrinciples(true);

		executeRequiredPhases(true);

		assertEquals(2, queryResultSet.getApplicableElements().size());

		clearLists();

		targetsOfImpacts.add(g1);

		assertContaintsApplicableElement(p1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);

		clearLists();

		sourcesOfImpacts.add(p1);

		assertContaintsApplicableElement(g1, targetsOfDecompositions,
				sourcesOfDecompositions, targetsOfImpacts, sourcesOfImpacts,
				targetsOfOffsets, sourcesOfOffsets, targetsOfIsAs,
				sourcesOfIsAs);



		assertNotContaintsApplicableElement(si1);

	}

}

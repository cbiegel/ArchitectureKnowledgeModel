package org.emftrace.quarc.core.tests.helpers;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.ApplicableElementsSelector;
import org.emftrace.quarc.core.helpers.PreconditionFinder;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class PreconditionFinderTest extends QUARCCoreTestCase {

	private void executeRequiredPhases() {

		gssQuery.setIncludeAll(true);

		cacheManager = new CacheManager(gss, queryResultSet, accessLayer);
		cacheManager.initCache();

		new ApplicableElementsSelector(gssQuery, queryResultSet, accessLayer,
				cacheManager, gssQuery.getAssignedConstraintsSet(),
				gssQuery.getSelectedGoalsSet(),false).runWithoutUnicaseCommand();
	}

	@Test
	public void testNoPreconditionsFromParents() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si2, p1, 1);

		executeRequiredPhases();

		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(si1, cacheManager));
		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(si2, cacheManager));
		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p1, cacheManager));
		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p2, cacheManager));
	}

	@Test
	public void testPreconditionsFromParents1() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		TechnicalProperty propery = ConstraintsFactory.eINSTANCE
				.createStringTechnicalProperty();
		propery.setName("foo");
		Precondition precondition = ConstraintsFactory.eINSTANCE
				.createPrecondition();
		BaseCondition baseCondition = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition.setTechnicalProperty(propery);
		baseCondition.setValue("true");
		baseCondition.setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().add(baseCondition);
		p1.setPrecondition(precondition);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si2, p1, 1);

		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();
		constraint.setTechnicalProperty(propery);
		constraint.setOperator(BaseConditionOperators.EQUALS);
		constraint.setValue("false");

		gssQuery.getAssignedConstraintsSet().getAssignedConstraints()
				.add(constraint);
		executeRequiredPhases();

		assertEquals("not ( foo equals true )",
				PreconditionFinder.getRequirementsFromParent(si1, cacheManager));
		assertEquals("not ( foo equals true )",
				PreconditionFinder.getRequirementsFromParent(si2, cacheManager));

		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p1, cacheManager));
		assertEquals("not ( foo equals true )",
				PreconditionFinder.getRequirementsFromParent(p2, cacheManager));

	}

	@Test
	public void testPreconditionsFromParents2() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);
		Principle p3 = createPrinciple(gss, 3);

		Pattern si1 = createPattern(gss, 1);

		TechnicalProperty propery1 = ConstraintsFactory.eINSTANCE
				.createStringTechnicalProperty();
		propery1.setName("foo");
		Precondition precondition1 = ConstraintsFactory.eINSTANCE
				.createPrecondition();
		BaseCondition baseCondition1 = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition1.setTechnicalProperty(propery1);
		baseCondition1.setValue("true");
		baseCondition1.setOperator(BaseConditionOperators.EQUALS);
		precondition1.getBaseConditions().add(baseCondition1);
		p2.setPrecondition(precondition1);

		TechnicalProperty propery2 = ConstraintsFactory.eINSTANCE
				.createStringTechnicalProperty();
		propery2.setName("bar");
		Precondition precondition2 = ConstraintsFactory.eINSTANCE
				.createPrecondition();
		BaseCondition baseCondition2 = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition2.setTechnicalProperty(propery2);
		baseCondition2.setValue("false");
		baseCondition2.setOperator(BaseConditionOperators.EQUALS);
		precondition2.getBaseConditions().add(baseCondition2);
		p3.setPrecondition(precondition2);

		createDecomposition(gss, p2, p1);
		createDecomposition(gss, p3, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si1, p3, 1);

		Constraint constraint1 = ConstraintsFactory.eINSTANCE
				.createConstraint();
		constraint1.setTechnicalProperty(propery1);
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		constraint1.setValue("false");

		gssQuery.getAssignedConstraintsSet().getAssignedConstraints()
				.add(constraint1);

		Constraint constraint2 = ConstraintsFactory.eINSTANCE
				.createConstraint();
		constraint2.setTechnicalProperty(propery2);
		constraint2.setOperator(BaseConditionOperators.EQUALS);
		constraint2.setValue("true");

		gssQuery.getAssignedConstraintsSet().getAssignedConstraints()
				.add(constraint2);
		executeRequiredPhases();

		assertEquals("not ( foo equals true ) or not ( bar equals false )",
				PreconditionFinder.getRequirementsFromParent(si1, cacheManager));

		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p1, cacheManager));
		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p2, cacheManager));
		assertEquals("",
				PreconditionFinder.getRequirementsFromParent(p3, cacheManager));

	}
	

	@Test
	public void testNoPrecondition() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 2);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si2, p1, 1);

		executeRequiredPhases();

		assertEquals("",
				PreconditionFinder.formatConditionString(si1.getPrecondition()));
		assertEquals("",
				PreconditionFinder.formatConditionString(si2.getPrecondition()));
		assertEquals("",
				PreconditionFinder.formatConditionString(p1.getPrecondition()));
		assertEquals("",
				PreconditionFinder.formatConditionString(p2.getPrecondition()));
	}

	@Test
	public void testPrecondition() {
		Goal g1 = createGoal(gss, 1);

		Principle p1 = createPrinciple(gss, 1);
		Principle p2 = createPrinciple(gss, 1);

		Pattern si1 = createPattern(gss, 1);
		Pattern si2 = createPattern(gss, 2);

		createDecomposition(gss, p2, p1);

		createImpact(gss, p1, g1, 1);
		createImpact(gss, si1, p2, 1);
		createImpact(gss, si2, p1, 1);

		TechnicalProperty propery = ConstraintsFactory.eINSTANCE
				.createStringTechnicalProperty();
		propery.setName("foo");
		Precondition precondition = ConstraintsFactory.eINSTANCE
				.createPrecondition();
		BaseCondition baseCondition = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition.setTechnicalProperty(propery);
		baseCondition.setValue("foo");
		baseCondition.setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().add(baseCondition);
		si1.setPrecondition(precondition);

		executeRequiredPhases();

		assertEquals("not ( foo equals foo )",
				PreconditionFinder.formatConditionString(si1.getPrecondition()));

	}

}

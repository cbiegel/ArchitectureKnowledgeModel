package org.emftrace.quarc.core.tests.preselector;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.ToleranceTypes;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.gssquery.preselector.LogicConditionEvaluator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Before;
import org.junit.Test;



public class LogicConditionEvaluatorTest extends QUARCCoreTestCase {
	private LogicConditionEvaluator logicConditionEvaluator;
	private AssignedConstraintsSet assignedConstraintsSet;
	private Precondition precondition;

	// private Pattern pattern;
	@Before
	// this is important, otherwise setUp() would not be called
	@Override
	public void setUp() throws Exception {
		super.setUp();

		assignedConstraintsSet = QueryFactory.eINSTANCE
				.createAssignedConstraintsSet();
		gssQuery.setAssignedConstraintsSet(assignedConstraintsSet);
		precondition = ConstraintsFactory.eINSTANCE.createPrecondition();
		/*
		 * pattern = GSSFactory.eINSTANCE.createPattern();
		 * pattern.setName("foo pattern"); gss.getElements().add(pattern);
		 */
	}

	private void initConditionEvaluator() {
		logicConditionEvaluator = new LogicConditionEvaluator(
				assignedConstraintsSet.getAssignedConstraints());

	}

	@Test
	public void testForEmptyPrecondition() {

		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();
		TechnicalProperty property = createPropertyWithTypeString();
		constraint.setTechnicalProperty(property);
		constraint.setValue("foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		initConditionEvaluator();

		assertLogicalTrue();

	}
	
	
	@Test
	public void testForPreconditionWithPropertyCategory() {

		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();
		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createTechnicalPropertyCategory();
		property.setName("foo property category");
		constraint.setTechnicalProperty(property);
		constraint.setValue("foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);
		
		constraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		initConditionEvaluator();
		
		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);


		assertIsInvalid();

	}

	@Test
	public void testForNullPrecondition() {

		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();
		TechnicalProperty property = createPropertyWithTypeString();

		constraint.setTechnicalProperty(property);
		constraint.setValue("foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		initConditionEvaluator();

		precondition = null;

		assertLogicalTrue();

	}

	public void assertIsInvalid() {
		initConditionEvaluator();
		try {
			assertEquals(LogicalValues.INVALID, logicConditionEvaluator.evaluatePrecondition(precondition).getLogicalResultValue());
			
		} catch (Exception e) {
			//fail(e.toString());
		}
	}
	
	private void assertAssignmentForPropertyIsNotRequiered(TechnicalProperty property ) {
		initConditionEvaluator();
		try {
			assertFalse(logicConditionEvaluator.evaluatePrecondition(precondition).getUnassignedProperties().containsKey(property));
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	private void assertPropertyIsUnassigned(TechnicalProperty property, boolean satisfyDirectly ) {
		initConditionEvaluator();
		try {
			assertTrue(logicConditionEvaluator.evaluatePrecondition(precondition).getUnassignedProperties().containsKey(property));
			assertEquals(satisfyDirectly, logicConditionEvaluator.evaluatePrecondition(precondition).getUnassignedProperties().get(property).booleanValue());
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	private void assertLogicalTrue() {
		initConditionEvaluator();
		try {

			assertEquals(LogicalValues.TRUE,
					logicConditionEvaluator.evaluatePrecondition(precondition).getLogicalResultValue());
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	private void assertLogicalFalse() {
		initConditionEvaluator();
		try {

			assertEquals(LogicalValues.FALSE,
					logicConditionEvaluator.evaluatePrecondition(precondition).getLogicalResultValue());
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	private void assertLogicalUndefined() {
		initConditionEvaluator();
		try {

			assertEquals(LogicalValues.UNDEFINED,
					logicConditionEvaluator.evaluatePrecondition(precondition).getLogicalResultValue());
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	private TechnicalProperty createPropertyWithTypeString() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createStringTechnicalProperty();
		property.setName("foo property");
		
		return property;
	}

	
	private TechnicalProperty createPropertyWithTypeBoolean() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty();
		property.setName("foo property");
		
		return property;
	}
	
	private TechnicalProperty createPropertyWithTypeInteger() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty();
		property.setName("foo property");
		
		return property;
	}
	
	private TechnicalProperty createPropertyWithTypeFloat() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createFloatTechnicalProperty();
		property.setName("foo property");

		return property;
	}
	
	private TechnicalProperty createPropertyWithTypeEnum() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createEnumTechnicalProperty();
		property.setName("foo property");
		
		return property;
	}
	
	private TechnicalProperty createPropertyWithTypeRegularExpression() {

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createRegularExpressionTechnicalProperty();
		property.setName("foo property");

		return property;
	}

	private Constraint createConstraint(TechnicalProperty property, String value) {
		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();

		constraint.setTechnicalProperty(property);
		constraint.setValue(value);
		return constraint;
	}

	private BaseCondition createBaseCondition(TechnicalProperty property,
			BaseConditionOperators type, String value) {
		BaseCondition baseCondition = ConstraintsFactory.eINSTANCE
				.createBaseCondition();
		baseCondition.setTechnicalProperty(property);
		baseCondition.setOperator(type);
		baseCondition.setValue(value);
		return baseCondition;
	}

	@Test
	public void testForStringEquals() {

		TechnicalProperty property = createPropertyWithTypeString();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		
		// test for true

		baseCondition.setValue("foo");

		assertLogicalTrue();

		// test for false
		baseCondition.setValue("bar");

		assertLogicalFalse();

		// test for no case sensitive
		baseCondition.setValue("FoO");

		assertLogicalFalse();
	}
	
	@Test
	public void testForStringEqualsIgnoreCase() {

		TechnicalProperty property = createPropertyWithTypeString();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS_IGNORE_CASE, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		
		// test for true

		baseCondition.setValue("foo");

		assertLogicalTrue();

		// test for false
		baseCondition.setValue("bar");

		assertLogicalFalse();

		// test for case sensitive
		baseCondition.setValue("FoO");

		assertLogicalTrue();
	}

	
	@Test
	public void testForStringInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeString();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.GREATER_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.LESS_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MAXIMAL);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MINIMAL);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.MATCHES);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.APPROXIMATELY_EQUALS);
		assertIsInvalid();


	}
	
	@Test
	public void testForEnumEqualsEquals() {

		TechnicalProperty property = createPropertyWithTypeEnum();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		baseCondition.setValue("foo");

		assertLogicalTrue();

		// test for false
		baseCondition.setValue("bar");

		assertLogicalFalse();

		// test for no case sensitive
		baseCondition.setValue("FoO");

		assertLogicalFalse();
	}

	
	@Test
	public void testForEnumInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeEnum();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.GREATER_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.LESS_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MAXIMAL);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MINIMAL);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.MATCHES);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.EQUALS_IGNORE_CASE);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.APPROXIMATELY_EQUALS);
		assertIsInvalid();
	
	}
	
	@Test
	public void testForRegExMatches() {

		TechnicalProperty property = createPropertyWithTypeRegularExpression();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setValue("(foo|bar)");
		// test for true

		constraint.setValue("foo");
		assertLogicalTrue();

		constraint.setValue("bar");
		assertLogicalTrue();

		// test for false
		constraint.setValue("foo bar");

		assertLogicalFalse();

	}
	
	@Test
	public void testForRegExInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeRegularExpression();
		
		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.GREATER_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.LESS_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MAXIMAL);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MINIMAL);
		assertIsInvalid();

		
		baseCondition.setOperator(BaseConditionOperators.EQUALS);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.EQUALS_IGNORE_CASE);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.APPROXIMATELY_EQUALS);
		assertIsInvalid();
		
	}

	@Test
	public void testForRegExInvalidValues() {
		TechnicalProperty property = createPropertyWithTypeRegularExpression();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setValue("(foo");
		assertIsInvalid();

	}

	@Test
	public void testForIntEquals() {
		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true
		constraint.setValue("1");
		assertLogicalTrue();

		constraint.setValue("0");
		assertLogicalFalse();

		constraint.setValue("2");
		assertLogicalFalse();

	}
	
	

	@Test
	public void testForIntMin() {

		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MINIMAL, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1");
		assertLogicalTrue();

		constraint.setValue("2");
		assertLogicalTrue();

		constraint.setValue("0");
		assertLogicalFalse();

	}

	@Test
	public void testForIntGreaterThan() {

		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.GREATER_THAN, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("2");
		assertLogicalTrue();

		constraint.setValue("1");
		assertLogicalFalse();

		constraint.setValue("0");
		assertLogicalFalse();

	}

	@Test
	public void testForIntSmallerThan() {

		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.LESS_THAN, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("0");
		assertLogicalTrue();

		constraint.setValue("1");
		assertLogicalFalse();

		constraint.setValue("2");
		assertLogicalFalse();

	}

	@Test
	public void testForIntInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.MATCHES);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.EQUALS_IGNORE_CASE);
		assertIsInvalid();

	}
	
	@Test
	public void testForIntApproximatelyEqualsWithRelativeTolerance() {
		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.APPROXIMATELY_EQUALS, "100");
		baseCondition.setTolerance("0.01");
		baseCondition.setToleranceType(ToleranceTypes.RELATIVE);

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("100");
		assertLogicalTrue();

		constraint.setValue("101");
		assertLogicalTrue();

		constraint.setValue("99");
		assertLogicalTrue();

		// test for false
		constraint.setValue("102");
		assertLogicalFalse();
		
		constraint.setValue("98");
		assertLogicalFalse();

	}
	
	@Test
	public void testForIntApproximatelyEqualsWithAbsoluteTolerance() {
		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.APPROXIMATELY_EQUALS, "100");
		baseCondition.setTolerance("1");
		baseCondition.setToleranceType(ToleranceTypes.ABSOLUTE);

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("100");
		assertLogicalTrue();

		constraint.setValue("101");
		assertLogicalTrue();

		constraint.setValue("99");
		assertLogicalTrue();

		// test for false
		constraint.setValue("102");
		assertLogicalFalse();
		
		constraint.setValue("98");
		assertLogicalFalse();

	}


	@Test
	public void testForIntInvalidValues() {

		TechnicalProperty property = createPropertyWithTypeInteger();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		constraint.setValue("1.1");
		assertIsInvalid();

		constraint.setValue("foo");
		assertIsInvalid();

		constraint.setValue(null);
		assertIsInvalid();

		baseCondition.setValue("1.1");
		assertIsInvalid();

		baseCondition.setValue("foo");
		assertIsInvalid();

		baseCondition.setValue(null);
		assertIsInvalid();

	}
	
	

	@Test
	public void testForFloatEquals() {
		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "1");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1");
		assertLogicalTrue();

		constraint.setValue("1.0");
		assertLogicalTrue();

		constraint.setValue("1.0f");
		assertLogicalTrue();

		// test for false
		constraint.setValue("0");
		assertLogicalFalse();

	}
	
	@Test
	public void testForFloatApproximatelyEqualsWithRelativeTolerance() {
		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.APPROXIMATELY_EQUALS, "1");
		
		baseCondition.setTolerance("0.01");
		baseCondition.setToleranceType(ToleranceTypes.RELATIVE);

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1.0");
		assertLogicalTrue();

		constraint.setValue("1.01f");
		assertLogicalTrue();

		constraint.setValue("0.99f");
		assertLogicalTrue();

		// test for false
		constraint.setValue("1.011");
		assertLogicalFalse();
		
		constraint.setValue("0.989");
		assertLogicalFalse();

	}
	
	@Test
	public void testForFloatApproximatelyEqualsWithAbsoluteTolerance() {
		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.APPROXIMATELY_EQUALS, "1");
		
		baseCondition.setTolerance("0.01");
		baseCondition.setToleranceType(ToleranceTypes.ABSOLUTE);

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1.0");
		assertLogicalTrue();

		constraint.setValue("1.01f");
		assertLogicalTrue();

		constraint.setValue("0.99f");
		assertLogicalTrue();

		// test for false
		constraint.setValue("1.011");
		assertLogicalFalse();
		
		constraint.setValue("0.989");
		assertLogicalFalse();
	}
	

	@Test
	public void testForFloatMax() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MAXIMAL, "1.0");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1");
		assertLogicalTrue();

		constraint.setValue("0.9");
		assertLogicalTrue();

		// test for false
		constraint.setValue("1.1");
		assertLogicalFalse();

	}

	@Test
	public void testForFloatMin() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MINIMAL, "1.0");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1.0");
		assertLogicalTrue();

		constraint.setValue("1");
		assertLogicalTrue();

		constraint.setValue("1.1");
		assertLogicalTrue();

		// test for false
		constraint.setValue("0.9");
		assertLogicalFalse();

	}

	@Test
	public void testForFloatGreaterThan() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.GREATER_THAN, "1.0");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("1.1");
		assertLogicalTrue();

		constraint.setValue("2");
		assertLogicalTrue();

		constraint.setValue("1.0");
		assertLogicalFalse();

		constraint.setValue("0.9");
		assertLogicalFalse();

	}

	@Test
	public void testForFloatSmallerThan() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "1");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.LESS_THAN, "1.0");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("0.9");
		assertLogicalTrue();

		constraint.setValue("0");
		assertLogicalTrue();

		constraint.setValue("1.0");
		assertLogicalFalse();

		constraint.setValue("1.1");
		assertLogicalFalse();

	}

	@Test
	public void testForFloatInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.MATCHES);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.EQUALS_IGNORE_CASE);
		assertIsInvalid();

	}

	@Test
	public void testForFloatInvalidValues() {

		TechnicalProperty property = createPropertyWithTypeFloat();

		Constraint constraint = createConstraint(property, "foo");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		constraint.setValue("1.1.2");
		assertIsInvalid();

		constraint.setValue("foo");
		assertIsInvalid();

		constraint.setValue(null);
		assertIsInvalid();

		baseCondition.setValue("1.1.2");
		assertIsInvalid();

		baseCondition.setValue("foo");
		assertIsInvalid();

		baseCondition.setValue(null);
		assertIsInvalid();

	}

	@Test
	public void testForBooleanIsTrue() {

		TechnicalProperty property = createPropertyWithTypeBoolean();

		Constraint constraint = createConstraint(property, "true");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("true");
		assertLogicalTrue();

		constraint.setValue("false");
		assertLogicalFalse();

	}

	@Test
	public void testForBooleanIsFalse() {
		
		TechnicalProperty property = createPropertyWithTypeBoolean();

		Constraint constraint = createConstraint(property, "false");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "false");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		// test for true

		constraint.setValue("false");
		assertLogicalTrue();

		constraint.setValue("true");
		assertLogicalFalse();

	}


	@Test
	public void testForBooleanInvalidOperators() {

		TechnicalProperty property = createPropertyWithTypeBoolean();

		Constraint constraint = createConstraint(property, "true");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.MATCHES, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		baseCondition.setOperator(BaseConditionOperators.MATCHES);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.GREATER_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.LESS_THAN);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MAXIMAL);
		assertIsInvalid();

		baseCondition.setOperator(BaseConditionOperators.MINIMAL);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.EQUALS_IGNORE_CASE);
		assertIsInvalid();
		
		baseCondition.setOperator(BaseConditionOperators.APPROXIMATELY_EQUALS);
		assertIsInvalid();
	}

	@Test
	public void testForBooleanInvalidValues() {

		TechnicalProperty property = createPropertyWithTypeBoolean();

		Constraint constraint = createConstraint(property, "true");
		constraint.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint);

		BaseCondition baseCondition = createBaseCondition(property,
				BaseConditionOperators.EQUALS, "foo");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition);

		
		constraint.setValue("1");
		assertIsInvalid();
		
		constraint.setValue("1.1.2");
		assertIsInvalid();

		constraint.setValue("foo");
		assertIsInvalid();

		constraint.setValue(null);
		assertIsInvalid();

		baseCondition.setValue("1.1.2");
		assertIsInvalid();

		baseCondition.setValue("1");
		assertIsInvalid();

		baseCondition.setValue("foo");
		assertIsInvalid();

		baseCondition.setValue(null);
		assertIsInvalid();

	}
	
	@Test
	public void testForNotCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();


		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");


		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getBaseConditions().add(baseCondition1);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);

		// true

		constraint1.setValue("true");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false

		constraint1.setValue("false");
		assertLogicalTrue();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined

		constraint1.setTechnicalProperty(property2);
		constraint1.setValue("true");
		assertLogicalUndefined();
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		constraint1.setTechnicalProperty(property2);
		constraint1.setValue("false");
		assertLogicalUndefined();
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

	}
	
	
	

	@Test
	public void testForAndCondition() {

		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true );
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalFalse();
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true );
		
		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, false );
		assertPropertyIsUnassigned(property2, false );

	}

	@Test
	public void testForOrCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();
		
		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.OR);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalUndefined();
	
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);


		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertPropertyIsUnassigned(property2, true);

	}

	@Test
	public void testForXOrCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.XOR);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);
		
		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalTrue();

		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);
		
		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);

		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, false);
		assertPropertyIsUnassigned(property2, false);

	}
	
	@Test
	public void testForNorCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOR);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);


		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();

		assertPropertyIsUnassigned(property1, true);
		assertPropertyIsUnassigned(property2, true);
	}
	
	@Test
	public void testForNandCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NAND);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);
		
		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, false);
		assertPropertyIsUnassigned(property2, false);

	}
	
	@Test
	public void testForImpliesCondition() {

		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.IMPLIES);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertPropertyIsUnassigned(property2, true);

	}
	
	
	@Test
	public void testForEquivalentCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.EQUIVALENT);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);

		// true / true

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// true / false

		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /true

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalFalse();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false /false

		constraint1.setValue("false");
		constraint2.setValue("false");
		assertLogicalTrue();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /false

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("false");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// undefined /true

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property2);
		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, true);
		assertAssignmentForPropertyIsNotRequiered(property2);

		// false / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("false");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);


		// true / undefined

		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property3);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertAssignmentForPropertyIsNotRequiered(property1);
		assertPropertyIsUnassigned(property2, true);

		// undefined / undefined

		constraint1.setTechnicalProperty(property3);
		constraint2.setTechnicalProperty(property4);

		constraint1.setValue("true");
		constraint2.setValue("true");
		assertLogicalUndefined();
		
		assertPropertyIsUnassigned(property1, false);
		assertPropertyIsUnassigned(property2, false);

	}



	@Test
	public void testForInvalidNotCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();


		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, null);

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, null);

		// BaseConditions for logicCondition1
		BaseCondition baseCondition3 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, null);

		BaseCondition baseCondition4 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, null);

		// BaseCondition for logicCondition2
		BaseCondition baseCondition5 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, null);

		BaseCondition baseCondition6 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, null);

		LogicCondition logicCondition1 = ConstraintsFactory.eINSTANCE
				.createLogicCondition();
		logicCondition1.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		logicCondition1.getBaseConditions().add(baseCondition3);
		logicCondition1.getBaseConditions().add(baseCondition4);

		LogicCondition logicCondition2 = ConstraintsFactory.eINSTANCE
				.createLogicCondition();
		logicCondition2.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		logicCondition2.getBaseConditions().add(baseCondition5);
		logicCondition2.getBaseConditions().add(baseCondition6);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraintsSet.getAssignedConstraints().add(constraint1);

		// number base conditions > 1

		precondition.getBaseConditions().clear();
		precondition.getLogicConditions().clear();
		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		assertIsInvalid();

		// number logic conditions > 1
		precondition.getBaseConditions().clear();
		precondition.getLogicConditions().clear();

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getLogicConditions().add(logicCondition1);
		precondition.getLogicConditions().add(logicCondition2);

		assertIsInvalid();

		// number logic conditions == 1 && number base conditions == 1
		precondition.getBaseConditions().clear();
		precondition.getLogicConditions().clear();

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getLogicConditions().add(logicCondition1);
		precondition.getBaseConditions().add(baseCondition1);
		assertIsInvalid();

		// number logic conditions > 1 && number base conditions == 1
		precondition.getBaseConditions().clear();
		precondition.getLogicConditions().clear();

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getLogicConditions().add(logicCondition1);
		precondition.getLogicConditions().add(logicCondition2);
		precondition.getBaseConditions().add(baseCondition1);

		assertIsInvalid();

		// number logic conditions == 1 && number base conditions > 1
		precondition.getBaseConditions().clear();
		precondition.getLogicConditions().clear();

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.NOT);
		precondition.getLogicConditions().add(logicCondition1);
		precondition.getBaseConditions().add(baseCondition1);
		precondition.getBaseConditions().add(baseCondition2);

		assertIsInvalid();

	}
	
	@Test
	public void testForNestedCondition() {


		TechnicalProperty property1 = createPropertyWithTypeBoolean();
		TechnicalProperty property2 = createPropertyWithTypeBoolean();
		TechnicalProperty property3 = createPropertyWithTypeBoolean();
		TechnicalProperty property4 = createPropertyWithTypeBoolean();

		TechnicalProperty property5 = createPropertyWithTypeBoolean();
		TechnicalProperty property6 = createPropertyWithTypeBoolean();
		TechnicalProperty property7 = createPropertyWithTypeBoolean();
		TechnicalProperty property8 = createPropertyWithTypeBoolean();

		BaseCondition baseCondition1 = createBaseCondition(property1,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition2 = createBaseCondition(property2,
				BaseConditionOperators.EQUALS, "true");
		
		BaseCondition baseCondition3 = createBaseCondition(property3,
				BaseConditionOperators.EQUALS, "true");

		BaseCondition baseCondition4 = createBaseCondition(property4,
				BaseConditionOperators.EQUALS, "true");
		
		LogicCondition logicCondition1 = ConstraintsFactory.eINSTANCE.createLogicCondition();
		logicCondition1.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		logicCondition1.getBaseConditions().add(baseCondition1);
		logicCondition1.getBaseConditions().add(baseCondition2);
		
		
		LogicCondition logicCondition2 = ConstraintsFactory.eINSTANCE.createLogicCondition();
		logicCondition2.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		logicCondition2.getBaseConditions().add(baseCondition3);
		logicCondition2.getBaseConditions().add(baseCondition4);
		

		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.OR);
		precondition.getLogicConditions().add(logicCondition1);
		precondition.getLogicConditions().add(logicCondition2);

		Constraint constraint1 = createConstraint(property1, "true");
		constraint1.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint2 = createConstraint(property2, "true");
		constraint2.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint3 = createConstraint(property3, "true");
		constraint3.setOperator(BaseConditionOperators.EQUALS);
		Constraint constraint4 = createConstraint(property4, "true");
		constraint4.setOperator(BaseConditionOperators.EQUALS);

		assignedConstraintsSet.getAssignedConstraints().add(constraint1);
		assignedConstraintsSet.getAssignedConstraints().add(constraint2);
		assignedConstraintsSet.getAssignedConstraints().add(constraint3);
		assignedConstraintsSet.getAssignedConstraints().add(constraint4);

		// true & true | true & true

		constraint1.setValue("true");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		assertLogicalTrue();

		// false & true | true & true

		constraint1.setValue("false");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		assertLogicalTrue();

		// false & false | true & true

		constraint1.setValue("false");
		constraint2.setValue("false");
		constraint3.setValue("true");
		constraint4.setValue("true");
		assertLogicalTrue();
		
		// false & false | false & true

		constraint1.setValue("false");
		constraint2.setValue("false");
		constraint3.setValue("false");
		constraint4.setValue("true");
		assertLogicalFalse();
		
		// false & false | false & false

		constraint1.setValue("false");
		constraint2.setValue("false");
		constraint3.setValue("false");
		constraint4.setValue("false");
		assertLogicalFalse();
		
		// undefined & true | true & true

		constraint1.setValue("true");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property2);
		constraint3.setTechnicalProperty(property3);
		constraint4.setTechnicalProperty(property4);
		
		assertLogicalTrue();
		
		// undefined & undefined | true & true

		constraint1.setValue("true");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property6);
		constraint3.setTechnicalProperty(property3);
		constraint4.setTechnicalProperty(property4);
		
		assertLogicalTrue();
		
		
		// undefined & undefined | undefined & true

		constraint1.setValue("true");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property6);
		constraint3.setTechnicalProperty(property7);
		constraint4.setTechnicalProperty(property4);
		
		assertLogicalUndefined();
		
		// undefined & undefined | undefined & undefined

		constraint1.setValue("true");
		constraint2.setValue("true");
		constraint3.setValue("true");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property6);
		constraint3.setTechnicalProperty(property7);
		constraint4.setTechnicalProperty(property8);
		
		assertLogicalUndefined();
		
		// false & false | false & undefined

		constraint1.setValue("false");
		constraint2.setValue("false");
		constraint3.setValue("false");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property1);
		constraint2.setTechnicalProperty(property2);
		constraint3.setTechnicalProperty(property3);
		constraint4.setTechnicalProperty(property8);
		
		assertLogicalFalse();
		
		// undefined& false | false & undefined

		constraint1.setValue("true");
		constraint2.setValue("false");
		constraint3.setValue("false");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property2);
		constraint3.setTechnicalProperty(property3);
		constraint4.setTechnicalProperty(property7);
		
		assertLogicalFalse();
		
		// undefined& false | false & undefined

		constraint1.setValue("true");
		constraint2.setValue("false");
		constraint3.setValue("false");
		constraint4.setValue("true");
		
		constraint1.setTechnicalProperty(property5);
		constraint2.setTechnicalProperty(property2);
		constraint3.setTechnicalProperty(property3);
		constraint4.setTechnicalProperty(property7);
		
		assertLogicalFalse();

	}

}

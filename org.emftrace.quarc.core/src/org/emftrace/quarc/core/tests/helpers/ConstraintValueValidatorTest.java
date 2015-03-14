package org.emftrace.quarc.core.tests.helpers;

import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.quarc.core.helpers.ConstraintValueValidator;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class ConstraintValueValidatorTest extends QUARCCoreTestCase{

	@Test
	public void testBooleanTechnicalProperty() {
		BooleanTechnicalProperty property = ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty();
		
		assertNull(ConstraintValueValidator.validateValue("true",property));
		assertNull(ConstraintValueValidator.validateValue("false",property));
		assertNotNull(ConstraintValueValidator.validateValue("falsetrue",property));
		assertNotNull(ConstraintValueValidator.validateValue("foo",property));
	}
	
	
	@Test
	public void testFloatTechnicalProperty() {
		FloatTechnicalProperty property = ConstraintsFactory.eINSTANCE.createFloatTechnicalProperty();
		
		
		assertNull(ConstraintValueValidator.validateValue("1",property));
		assertNull(ConstraintValueValidator.validateValue("-1",property));
		assertNull(ConstraintValueValidator.validateValue("1.1",property));
		assertNull(ConstraintValueValidator.validateValue("-1.1",property));
		assertNull(ConstraintValueValidator.validateValue("-0.1",property));
		assertNull(ConstraintValueValidator.validateValue("0.1",property));
		
		assertNotNull(ConstraintValueValidator.validateValue("0.0.0",property));
		assertNotNull(ConstraintValueValidator.validateValue("--1",property));

		
		property.setMax("5.0");
		property.setMin("1.0");
		
		assertNull(ConstraintValueValidator.validateValue("1",property));
		assertNull(ConstraintValueValidator.validateValue("5",property));

		assertNotNull(ConstraintValueValidator.validateValue("5.01",property));
		assertNotNull(ConstraintValueValidator.validateValue("0.99",property));
	}

	
	
	@Test
	public void testIntegerTechnicalProperty() {
		IntegerTechnicalProperty property = ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty();
		
		
		assertNull(ConstraintValueValidator.validateValue("1",property));
		assertNull(ConstraintValueValidator.validateValue("-1",property));
		assertNotNull(ConstraintValueValidator.validateValue("1.1",property));
		assertNotNull(ConstraintValueValidator.validateValue("-1.1",property));
		assertNotNull(ConstraintValueValidator.validateValue("-0.1",property));
		assertNotNull(ConstraintValueValidator.validateValue("0.1",property));
		assertNotNull(ConstraintValueValidator.validateValue("0.0.0",property));
		assertNotNull(ConstraintValueValidator.validateValue("--1",property));
		
		property.setMax("5");
		property.setMin("1");
		
		assertNull(ConstraintValueValidator.validateValue("1",property));
		assertNull(ConstraintValueValidator.validateValue("5",property));

		assertNotNull(ConstraintValueValidator.validateValue("6",property));
		assertNotNull(ConstraintValueValidator.validateValue("7",property));
	}
	
	@Test
	public void testStringTechnicalProperty() {
		StringTechnicalProperty property = ConstraintsFactory.eINSTANCE.createStringTechnicalProperty();
		
		
		assertNull(ConstraintValueValidator.validateValue("1",property));
		assertNull(ConstraintValueValidator.validateValue("+1",property));
		assertNull(ConstraintValueValidator.validateValue("foo",property));
		assertNull(ConstraintValueValidator.validateValue("bar foo",property));

	}
	
	@Test
	public void testEnumTechnicalProperty() {
		EnumTechnicalProperty property = ConstraintsFactory.eINSTANCE.createEnumTechnicalProperty();
		
		property.getPossibleValues().add("foo");
		property.getPossibleValues().add("bar");
		
		assertNull(ConstraintValueValidator.validateValue("foo",property));
		assertNull(ConstraintValueValidator.validateValue("bar",property));
		assertNotNull(ConstraintValueValidator.validateValue("foofoo",property));
		assertNotNull(ConstraintValueValidator.validateValue("bar foo",property));

	}

}

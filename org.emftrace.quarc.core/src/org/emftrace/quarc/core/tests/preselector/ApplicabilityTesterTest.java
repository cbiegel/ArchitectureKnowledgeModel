package org.emftrace.quarc.core.tests.preselector;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.gssquery.preselector.ApplicabilityTester;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Before;
import org.junit.Test;


public class ApplicabilityTesterTest extends QUARCCoreTestCase{
	
	

	private ApplicabilityTester applicabilityTester ;
	private Principle p1;
	private StringTechnicalProperty property;
	
	@Before
    @Override
    public void setUp()  throws Exception
    {
        super.setUp();
        
        AssignedConstraintsSet assignedConstraintsSet = QueryFactory.eINSTANCE.createAssignedConstraintsSet();
        
		Constraint assignedConstraint = ConstraintsFactory.eINSTANCE.createConstraint();

		
		assignedConstraintsSet.getAssignedConstraints().add(assignedConstraint);
		
		property = ConstraintsFactory.eINSTANCE.createStringTechnicalProperty();
		property.setName("foo thing");

		assignedConstraint.setTechnicalProperty(property);
		assignedConstraint.setOperator(BaseConditionOperators.EQUALS);
		assignedConstraint.setValue("foo");
		applicabilityTester = new ApplicabilityTester(assignedConstraintsSet);
		

		p1 = GSSFactory.eINSTANCE.createPrinciple();
		p1.setName("Principle 1");

  
    }

	@Test
	public void testForPreconditionIsNull() {
		p1.setPrecondition(null);
        assert( applicabilityTester.isApplicable(p1));
	}
	
	@Test
	public void testForEmptyCondition() {
        p1.setPrecondition(ConstraintsFactory.eINSTANCE.createPrecondition());
        assertTrue( applicabilityTester.isApplicable(p1));
	}
	
	@Test
	public void testForFalseCondition() {

		Precondition precondition = ConstraintsFactory.eINSTANCE.createPrecondition();
		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(ConstraintsFactory.eINSTANCE.createBaseCondition());
		
		property.setName("foo thing");
		precondition.getBaseConditions().get(0).setTechnicalProperty(property);
		precondition.getBaseConditions().get(0).setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().get(0).setValue("bar");
        
        
        p1.setPrecondition(precondition);
        assertFalse( applicabilityTester.isApplicable(p1));
        assertTrue( applicabilityTester.isNotApplicable(p1));
        assertFalse( applicabilityTester.applicablenessIsUndefined(p1));
	}
	
	@Test
	public void testForNotEmptyTrueCondition() {

		Precondition precondition = ConstraintsFactory.eINSTANCE.createPrecondition();
		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(ConstraintsFactory.eINSTANCE.createBaseCondition());
		
		property.setName("foo thing");
		precondition.getBaseConditions().get(0).setTechnicalProperty(property);
		precondition.getBaseConditions().get(0).setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().get(0).setValue("foo");
        
        
        p1.setPrecondition(precondition);
        assertTrue(applicabilityTester.isApplicable(p1));
        assertFalse( applicabilityTester.isNotApplicable(p1));
        assertFalse( applicabilityTester.applicablenessIsUndefined(p1));
	}
	
	
	@Test
	public void testForUndefinedProperty() {

		Precondition precondition = ConstraintsFactory.eINSTANCE.createPrecondition();
		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createStringTechnicalProperty();
		precondition.setLogicalConnectiveType(LogicalConnectiveTypes.AND);
		precondition.getBaseConditions().add(ConstraintsFactory.eINSTANCE.createBaseCondition());
		
		property.setName("bar thing");
		precondition.getBaseConditions().get(0).setTechnicalProperty(property);
		precondition.getBaseConditions().get(0).setOperator(BaseConditionOperators.EQUALS);
		precondition.getBaseConditions().get(0).setValue("foo");
        
        
        p1.setPrecondition(precondition);
        assertFalse(applicabilityTester.isApplicable(p1));
        assertFalse( applicabilityTester.isNotApplicable(p1));
        assertTrue( applicabilityTester.applicablenessIsUndefined(p1));
	}
	
	
}

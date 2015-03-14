package org.emftrace.quarc.core.tests.commands.constraints;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.quarc.core.commands.constraints.SetConstraintPropertyCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class SetConstraintPropertyCommandTest extends QUARCCoreTestCase {

	@Test
	public void test() {
		Constraint constraint1 = ConstraintsFactory.eINSTANCE.createConstraint();

		TechnicalProperty property = ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty();

		gssQuery.getAssignedConstraintsSet().getAssignedConstraints().add(constraint1);

		
		new SetConstraintPropertyCommand(constraint1, property).runWithoutUnicaseCommand();
		
		assertEquals(1, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().size());
		assertEquals(property, constraint1.getTechnicalProperty());
		

		
		assertEquals(true, gssQuery.getAssignedConstraintsSet().isChanged());
	}

}

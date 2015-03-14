package org.emftrace.quarc.core.tests.commands.constraints;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.quarc.core.commands.constraints.SetConstraintValueCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class SetConstraintValueCommandTest  extends QUARCCoreTestCase {

	@Test
	public void test() {
		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();



		gssQuery.getAssignedConstraintsSet().getAssignedConstraints().add(constraint);

		
		new SetConstraintValueCommand(constraint, "true").runWithoutUnicaseCommand();
		
		assertEquals(1, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().size());
		assertEquals("true", constraint.getValue());
		

		
		assertEquals(true, gssQuery.getAssignedConstraintsSet().isChanged());
	}

}

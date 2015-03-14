package org.emftrace.quarc.core.tests.commands.assignedconstraintsset;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.quarc.core.commands.assignedconstraintsset.AddConstraintToAssignedConstraintsSetCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class AddConstraintToAssignedConstraintsSetCommandTest extends QUARCCoreTestCase{

	@Test
	public void test() {
		Constraint constraint = ConstraintsFactory.eINSTANCE.createConstraint();

		
		new AddConstraintToAssignedConstraintsSetCommand(gssQuery.getAssignedConstraintsSet(), constraint).runWithoutUnicaseCommand();
		
		assertEquals(1, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().size());
		
		assertEquals(true, gssQuery.getAssignedConstraintsSet().isChanged());
	}

}

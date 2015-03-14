package org.emftrace.quarc.core.tests.commands.assignedconstraintsset;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.quarc.core.commands.assignedconstraintsset.InsertConstraintToAssignedConstraintsSetCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class InsertConstraintToAssignedConstraintsSetCommandTest extends QUARCCoreTestCase{

	@Test
	public void test() {
		Constraint constraint1 = ConstraintsFactory.eINSTANCE.createConstraint();
		Constraint constraint2 = ConstraintsFactory.eINSTANCE.createConstraint();
		Constraint constraint3 = ConstraintsFactory.eINSTANCE.createConstraint();

		gssQuery.getAssignedConstraintsSet().getAssignedConstraints().add(constraint1);
		gssQuery.getAssignedConstraintsSet().getAssignedConstraints().add(constraint3);
		
		new InsertConstraintToAssignedConstraintsSetCommand(gssQuery.getAssignedConstraintsSet(), constraint2,1).runWithoutUnicaseCommand();
		
		assertEquals(3, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().size());
		assertEquals(constraint2, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().get(1));
		
		assertEquals(true, gssQuery.getAssignedConstraintsSet().isChanged());
	}

}

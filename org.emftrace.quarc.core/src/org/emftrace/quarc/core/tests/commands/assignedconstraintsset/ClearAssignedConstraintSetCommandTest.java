package org.emftrace.quarc.core.tests.commands.assignedconstraintsset;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.commands.assignedconstraintsset.ClearAssignedConstraintSetCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class ClearAssignedConstraintSetCommandTest extends QUARCCoreTestCase{

	@Test
	public void test() {
	
		AssignedConstraintsSet assignedConstraintsSet = QueryFactory.eINSTANCE.createAssignedConstraintsSet();
		Constraint c1 = ConstraintsFactory.eINSTANCE.createConstraint();
		Constraint c2 = ConstraintsFactory.eINSTANCE.createConstraint();
		Constraint c3 = ConstraintsFactory.eINSTANCE.createConstraint();
		
		project.addModelElement(c1);
		project.addModelElement(c2);
		project.addModelElement(c3);

		
		assignedConstraintsSet.getAssignedConstraints().add(c1);
		assignedConstraintsSet.getAssignedConstraints().add(c2);
		assignedConstraintsSet.getAssignedConstraints().add(c3);
		
		project.addModelElement(assignedConstraintsSet);
		new ClearAssignedConstraintSetCommand(assignedConstraintsSet).runWithoutUnicaseCommand();
		
		assertEquals(0, assignedConstraintsSet.getAssignedConstraints().size());
		assertEquals(true, assignedConstraintsSet.isChanged());
		
	}

}

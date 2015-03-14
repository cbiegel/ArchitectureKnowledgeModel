package org.emftrace.quarc.core.tests.commands.assignedconstraintsset;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.quarc.core.commands.assignedconstraintsset.AddConstraintsCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class AddConstraintsCommandTest extends QUARCCoreTestCase {

	@Test
	public void test() {

	  List<Constraint> constraints = new ArrayList<Constraint>();
	  for (int i = 0; i<10; i++)
		  constraints.add(ConstraintsFactory.eINSTANCE.createConstraint());
	  
	 new AddConstraintsCommand(gssQuery.getAssignedConstraintsSet(), constraints).runWithoutUnicaseCommand();
	 
	 
	 assertEquals(10, gssQuery.getAssignedConstraintsSet().getAssignedConstraints().size());
	  
		assertEquals(true, gssQuery.getAssignedConstraintsSet().isChanged());
	}

}

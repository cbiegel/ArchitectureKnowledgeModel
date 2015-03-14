package org.emftrace.quarc.core.tests.commands.predefinedcontraintsets;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue;
import org.emftrace.quarc.core.commands.predefinedconstraintsetcatalogues.CreatePredefinedConstraintSetCommand;
import org.junit.Test;


public class CreatePredefinedConstraintSetCommandTest {

	@Test
	public void test() {
		
		PredefinedConstraintSetCatalogue cataloguge = ConstraintsFactory.eINSTANCE.createPredefinedConstraintSetCatalogue();
		List<Constraint> constraints = new ArrayList<Constraint>();
		for (int i= 0; i<10;i++) 
			constraints.add(ConstraintsFactory.eINSTANCE.createConstraint());
		String name = "foo";
		String description ="bar";
		new CreatePredefinedConstraintSetCommand(cataloguge, constraints, name, description).runWithoutUnicaseCommand();
		
		assertEquals(1, cataloguge.getCatalogueItems().size());
		assertEquals(name, cataloguge.getCatalogueItems().get(0).getName());
		assertEquals(description, cataloguge.getCatalogueItems().get(0).getDescription());
		assertEquals(10, cataloguge.getCatalogueItems().get(0).getConstraints().size());
	}

}

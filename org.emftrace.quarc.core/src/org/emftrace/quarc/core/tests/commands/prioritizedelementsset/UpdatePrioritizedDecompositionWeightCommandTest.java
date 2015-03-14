package org.emftrace.quarc.core.tests.commands.prioritizedelementsset;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.quarc.core.commands.prioritizedelementsset.UpdatePrioritizedDecompositionWeightCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class UpdatePrioritizedDecompositionWeightCommandTest extends QUARCCoreTestCase {

	@Test
	public void testSimpleTest() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		
		createSelectedGoal(gssQuery, g1, 0);
		createSelectedGoal(gssQuery, g2, 0);
		
		PrioritizedDecomposition priorizedDecomposition =	createPriorizedDecomposition(gssQuery, d1, 0);

		new UpdatePrioritizedDecompositionWeightCommand(gssQuery.getSelectedGoalsSet(),priorizedDecomposition, "10").runWithoutUnicaseCommand();
		
		assertEquals("10", priorizedDecomposition.getWeight());
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
		
	}

}

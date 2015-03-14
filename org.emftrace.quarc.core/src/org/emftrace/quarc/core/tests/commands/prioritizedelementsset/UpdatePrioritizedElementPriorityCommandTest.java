package org.emftrace.quarc.core.tests.commands.prioritizedelementsset;

import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.quarc.core.commands.prioritizedelementsset.UpdatePrioritizedElementPriorityCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;

public class UpdatePrioritizedElementPriorityCommandTest extends QUARCCoreTestCase {

	/**
	 * simple test without subgoals
	 */
	@Test
	public void testSimpleTestWithoutSubgoals() {
		Goal g1 = createGoal(gss, 1);
		PrioritizedElement sg1 =  createSelectedGoal(gssQuery, g1, 80);
		
		Goal g2 = createGoal(gss, 2);
		PrioritizedElement sg2 =  createSelectedGoal(gssQuery, g2, 10);
		
		Goal g3 = createGoal(gss, 3);
		PrioritizedElement sg3 =  createSelectedGoal(gssQuery, g3, 10);


		
		new UpdatePrioritizedElementPriorityCommand(gssQuery.getSelectedGoalsSet(), sg1, "60" ).runWithoutUnicaseCommand();
		

		assertEquals(3, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size()); 
		assertEquals(0, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size()); 
		assertEquals("60", sg1.getGlobalPriority()); 

		assertEquals("10", sg2.getGlobalPriority()); 

		assertEquals("10", sg3.getGlobalPriority()); 
		
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );

	}	
	
}
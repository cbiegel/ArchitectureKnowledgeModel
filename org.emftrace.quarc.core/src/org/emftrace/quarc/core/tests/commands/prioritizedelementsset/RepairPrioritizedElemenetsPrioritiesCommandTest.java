package org.emftrace.quarc.core.tests.commands.prioritizedelementsset;

import java.util.HashMap;
import java.util.Map;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.quarc.core.commands.prioritizedelementsset.RepairPrioritizedElemenetsPrioritiesCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;


public class RepairPrioritizedElemenetsPrioritiesCommandTest extends QUARCCoreTestCase {

	
	
	@Test
	public void testRootElementsOnly(){
		
		/* graph:
		 * 
		 * g1
		 * 
		 * g2
		 * 
		 * g3
		 */
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		
		PrioritizedElement sg1 = createSelectedGoal(gssQuery, g1, 45);
		PrioritizedElement sg2 = createSelectedGoal(gssQuery, g2, 20);
		PrioritizedElement sg3 = createSelectedGoal(gssQuery, g3, 20);
		
		
		new RepairPrioritizedElemenetsPrioritiesCommand( gssQuery.getSelectedGoalsSet()).runWithoutUnicaseCommand();
		
		
		assertEquals("50",sg1.getGlobalPriority());
		assertEquals("25", sg2.getGlobalPriority());
		assertEquals("25", sg3.getGlobalPriority());
		
		assertEquals(false,gssQuery.getSelectedGoalsSet().isChanged() );

	}
	
	
	@Test
	public void testRootElementsWithLockedElements(){
		
		/* graph:
		 * 
		 * g1 -|--- g2
		 * 
		 * g1 -|--- g3
		 */
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		
		PrioritizedElement sg1 = createSelectedGoal(gssQuery, g1, 50);
		PrioritizedElement sg2 = createSelectedGoal(gssQuery, g2, 20);
		PrioritizedElement sg3 = createSelectedGoal(gssQuery, g3, 20);
		
		Map<Element, Boolean> lockedMap = new HashMap<Element, Boolean>();
		lockedMap.put(g1, true);
		lockedMap.put(g2, false);
		
		
		new RepairPrioritizedElemenetsPrioritiesCommand( gssQuery.getSelectedGoalsSet(), lockedMap).runWithoutUnicaseCommand();
		
		
		assertEquals("50",sg1.getGlobalPriority());
		assertEquals("25", sg2.getGlobalPriority());
		assertEquals("25", sg3.getGlobalPriority());
		
		assertEquals(false,gssQuery.getSelectedGoalsSet().isChanged() );

	}
	
	@Test
	public void testNothingToDo(){
		
		/* graph:
		 * 
		 * g1 -|--- g2
		 * 
		 * g1 -|--- g3
		 * 
		 * g4
		 */
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		Goal g4 = createGoal(gss, 4);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		
		PrioritizedElement sg1 = createSelectedGoal(gssQuery, g1, 50);
		PrioritizedElement sg2 = createSelectedGoal(gssQuery, g2, 25);
		PrioritizedElement sg3 = createSelectedGoal(gssQuery, g3, 25);
		PrioritizedElement sg4 = createSelectedGoal(gssQuery, g4, 50);
		
		PrioritizedDecomposition pd1 = createPriorizedDecomposition(gssQuery, d1, 50);
		PrioritizedDecomposition pd2 = createPriorizedDecomposition(gssQuery, d2, 50);
		
		Map<Element, Boolean> lockedMap = new HashMap<Element, Boolean>();
		lockedMap.put(g1, true);
		lockedMap.put(g2, false);
		
		
		new RepairPrioritizedElemenetsPrioritiesCommand( gssQuery.getSelectedGoalsSet(), lockedMap).runWithoutUnicaseCommand();
		
		
		assertEquals("50",sg1.getGlobalPriority());
		assertEquals("25", sg2.getGlobalPriority());
		assertEquals("25", sg3.getGlobalPriority());
		
		assertEquals("50", sg4.getGlobalPriority());
		assertEquals(false,gssQuery.getSelectedGoalsSet().isChanged() );
	}
	

}

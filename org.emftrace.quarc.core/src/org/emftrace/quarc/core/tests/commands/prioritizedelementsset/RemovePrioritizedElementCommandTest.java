package org.emftrace.quarc.core.tests.commands.prioritizedelementsset;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.quarc.core.commands.prioritizedelementsset.RemovePrioritizedElementCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class RemovePrioritizedElementCommandTest extends QUARCCoreTestCase {

	@Test
	public void testSimpleTest() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, g2, 0);
		
		createPriorizedDecomposition(gssQuery, d1, 0);

		new RemovePrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal2).runWithoutUnicaseCommand();
		
		assertEquals(1, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertFalse(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		
		assertEquals(0, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}

	
	
	@Test
	public void testRemoveAnElementBetweentwoElements() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g2);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, g2, 0);
		PrioritizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		
		createPriorizedDecomposition(gssQuery, d1, 0);
		createPriorizedDecomposition(gssQuery, d2, 0);
	
		new RemovePrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal2).runWithoutUnicaseCommand();
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertFalse(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal3));
		
		assertEquals(0, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}
	
	
	@Test
	public void testForRemoveSubgoalOfParentWithAnotherSubgoal() {
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, g2, 0);
		PrioritizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		
		createPriorizedDecomposition(gssQuery, d1, 0);
		createPriorizedDecomposition(gssQuery, d2, 0);
	
		new RemovePrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal3).runWithoutUnicaseCommand();
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		assertFalse(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal3));

		
		assertEquals(1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());
		
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}

}

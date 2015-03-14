package org.emftrace.quarc.core.tests.commands.prioritizedelementsset;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.commands.prioritizedelementsset.AddPrioritizedElementCommand;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;




public class AddPrioritizedElementCommandTest extends QUARCCoreTestCase {

	@Test
	public void testAddAPriorizedGoalToASelectedGoalSetWithOneSelectedGoal() {
		
		// (g1) -|--- g2 
		
		// (g1) -|--- g3 
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		PrioritizedElement selectedGoal2 = QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal2.setElement(g2);
		
		List<Decomposition> outgoingDecompositions = new ArrayList<Decomposition>();
		List<Decomposition> incomingDecompositions = new ArrayList<Decomposition>();
		
		outgoingDecompositions.add(d1);
		
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal2, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		
		assertEquals(1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());
		
		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );


	}
	
	@Test
	public void testAddAPriorizedGoalBetween2Goals() {
		
		// (g1) -|--- g2 -|--- (g3)
		
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g2);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		
		PrioritizedElement selectedGoal2 = QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal2.setElement(g2);
		
		PrioritizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		
		List<Decomposition> outgoingDecompositions = new ArrayList<Decomposition>();
		List<Decomposition> incomingDecompositions = new ArrayList<Decomposition>();
		
		outgoingDecompositions.add(d1);
		incomingDecompositions.add(d2);
		
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal2, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		assertEquals(3, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());
		assertEquals(d2, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(1).getDecompostion());

		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}
	
	
	@Test
	public void testAddAPriorizedTopleveToASubgoal() {
		
		// g1 -|--- (g2) 
		
		// g1 -|--- g3 
	
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		
		
		PrioritizedElement selectedGoal1 = QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal1.setElement(g1);
		
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, g2, 0);
		
	//	PriorizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		
		List<Decomposition> outgoingDecompositions = new ArrayList<Decomposition>();
		List<Decomposition> incomingDecompositions = new ArrayList<Decomposition>();
		
	//	outgoingDecompositions.add(d1);
		incomingDecompositions.add(d1);
		
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal1, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		
		assertEquals(1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());

		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}
	
	
	@Test
	public void testAddAPriorizedToplevelGoalToTwoSubgoals() {
		
		// g1 -|--- (g2) 
		
		// g1 -|--- (g3)
	
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		
		
		PrioritizedElement selectedGoal1 =  QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal1.setElement(g1);
		
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, g2, 0);
		
		PrioritizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		
		List<Decomposition> outgoingDecompositions = new ArrayList<Decomposition>();
		List<Decomposition> incomingDecompositions = new ArrayList<Decomposition>();
		
		incomingDecompositions.add(d1);
		incomingDecompositions.add(d2);
		
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal1, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		assertEquals(3, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal3));
		
		assertEquals(2, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());
		assertEquals(d2, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(1).getDecompostion());

		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}
	
	/**
	 * 
	 */
	@Test
	public void testAddAPriorizedBetweenTwoSubgoalsWithAlreadyExistingSelectedGoal() {
		
		// (g1) -|---  g2   -|--- (g4)
		
		// (g1) -|--- (g3)  -| ---(g4)
	
		Goal g1 = createGoal(gss, 1);
		Goal g2 = createGoal(gss, 2);
		Goal g3 = createGoal(gss, 3);
		Goal g4 = createGoal(gss, 3);
		
		Decomposition d1 = createDecomposition(gss, g2, g1);
		Decomposition d2 = createDecomposition(gss, g3, g1);
		Decomposition d3 = createDecomposition(gss, g4, g2);
		Decomposition d4 = createDecomposition(gss, g4, g3);
		

		createPriorizedDecomposition(gssQuery, d2, 0);

		createPriorizedDecomposition(gssQuery, d4, 0);	

		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, g1, 0);
		
		PrioritizedElement selectedGoal2 =  QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal2.setElement(g2);
		
		
		PrioritizedElement selectedGoal3 = createSelectedGoal(gssQuery, g3, 0);
		PrioritizedElement selectedGoal4 = createSelectedGoal(gssQuery, g4, 0);
		
		List<Decomposition> outgoingDecompositions = new ArrayList<Decomposition>();
		List<Decomposition> incomingDecompositions = new ArrayList<Decomposition>();
		
		incomingDecompositions.add(d3);
		outgoingDecompositions.add(d1);
		
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal2, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		incomingDecompositions.clear();
		outgoingDecompositions.clear();
		
		outgoingDecompositions.add(d3);
		outgoingDecompositions.add(d4);
		
		
		PrioritizedElement selectedGoal4clone = QueryFactory.eINSTANCE.createPrioritizedElement();
		selectedGoal4clone.setElement(g4);
		new AddPrioritizedElementCommand(gssQuery.getSelectedGoalsSet(), selectedGoal4clone, outgoingDecompositions, incomingDecompositions).runWithoutUnicaseCommand();
		
		
		assertEquals(4, gssQuery.getSelectedGoalsSet().getPrioritizedElements().size());
		
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal1));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal2));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal3));
		assertTrue(gssQuery.getSelectedGoalsSet().getPrioritizedElements().contains(selectedGoal4));
		
		assertEquals(4, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().size());
		
		assertEquals(d2, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(0).getDecompostion());
		assertEquals(d4, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(1).getDecompostion());
		assertEquals(d1, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(2).getDecompostion());
		assertEquals(d3, gssQuery.getSelectedGoalsSet().getPriorizedDecompositionRelations().get(3).getDecompostion());

		assertEquals(true,gssQuery.getSelectedGoalsSet().isChanged() );
	}

}

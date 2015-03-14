package org.emftrace.quarc.core.tests.cache;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.quarc.core.cache.PrioritizedElementsCache;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;




public class PrioritizedElementsCacheTest extends QUARCCoreTestCase{

	private PrioritizedElementsCache priorizedElementsCache;

	private void executeRequiredPhases(){
		priorizedElementsCache = new PrioritizedElementsCache(gssQuery.getSelectedGoalsSet(), accessLayer);
		priorizedElementsCache.initCache();
		
	}
	
	@Test
	public void testInitCache() {
		createSelectedGoal(gssQuery, createGoal(gss, 1), 100);
	}

	@Test
	public void testGetPriorizedElementSet() {
		createSelectedGoal(gssQuery, createGoal(gss, 1), 100);
		executeRequiredPhases();
		assertEquals( gssQuery.getSelectedGoalsSet(), priorizedElementsCache.getPrioritizedElementSet());
	}

	@Test
	public void testGetPriorizedDecomposition() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( priorizedDecomposition, priorizedElementsCache.getPrioritizedDecomposition(decomposition));
	}

	@Test
	public void testGetDecomposition() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( decomposition, priorizedElementsCache.getDecomposition(priorizedDecomposition));
	}

	@Test
	public void testGetPriorizedDecompositionsForSource() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( 1, priorizedElementsCache.getPrioritizedDecompositionsForSource(subgoal).size());
		assertEquals( priorizedDecomposition, priorizedElementsCache.getPrioritizedDecompositionsForSource(subgoal).get(0));
		
		
		assertNotNull( priorizedElementsCache.getPrioritizedDecompositionsForSource(goal)); //must be an empty list if no relations exists
		assertEquals( 0, priorizedElementsCache.getPrioritizedDecompositionsForSource(goal).size());
	}

	@Test
	public void testGetPriorizedDecompositionsForTarget() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( 1, priorizedElementsCache.getPrioritizedDecompositionsForTarget(goal).size());
		assertEquals( priorizedDecomposition, priorizedElementsCache.getPrioritizedDecompositionsForTarget(goal).get(0));
		
		
		assertNotNull( priorizedElementsCache.getPrioritizedDecompositionsForTarget(subgoal)); //must be an empty list if no relations exists
		assertEquals( 0, priorizedElementsCache.getPrioritizedDecompositionsForTarget(subgoal).size());
	
	}

	@Test
	public void testGetPriorizedDecompositionsBetween() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( priorizedDecomposition, priorizedElementsCache.getPrioritizedDecompositionsBetween(subgoal, goal));
	}

	@Test
	public void testGetPriorizedElement() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		PrioritizedElement selectedGoal = createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( selectedGoal, priorizedElementsCache.getPrioritizedElement(goal));
	}

	@Test
	public void testGetElement() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		PrioritizedElement selectedGoal = createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals(goal , priorizedElementsCache.getElement(selectedGoal));
	}

	@Test
	public void testSetWeight() {
		Goal goal1 = createGoal(gss, 1);
		Goal subgoal1 = createGoal(gss, 11);
		
		Goal subgoal2 = createGoal(gss, 21);
		
		Decomposition decomposition1 = createDecomposition(gss, subgoal1, goal1);
		Decomposition decomposition2 = createDecomposition(gss, subgoal2, goal1);
		PrioritizedDecomposition priorizedDecomposition1 = createPriorizedDecomposition(gssQuery, decomposition1, 50);
		PrioritizedDecomposition priorizedDecomposition2 = createPriorizedDecomposition(gssQuery, decomposition2, 50);
		
		PrioritizedElement selectedGoal = createSelectedGoal(gssQuery, goal1, 100);
		createSelectedGoal(gssQuery, subgoal1, 50);
		createSelectedGoal(gssQuery, subgoal2, 50);

		executeRequiredPhases();
		
		priorizedElementsCache.setWeight(subgoal1, goal1, 60);
		priorizedElementsCache.setWeight(subgoal2, goal1, 40);
		
		assertEquals("50", priorizedDecomposition1.getWeight()); //must be unchanged until flush() is called
		assertEquals("50", priorizedDecomposition2.getWeight());
		
		assertEquals(new Integer(60) , priorizedElementsCache.getWeight(subgoal1, goal1));
		assertEquals(new Integer(40) , priorizedElementsCache.getWeight(subgoal2, goal1));
	}

	@Test
	public void testGetWeight() {
		Goal goal1 = createGoal(gss, 1);
		Goal subgoal1 = createGoal(gss, 11);
		
		Goal subgoal2 = createGoal(gss, 21);
		
		Decomposition decomposition1 = createDecomposition(gss, subgoal1, goal1);
		Decomposition decomposition2 = createDecomposition(gss, subgoal2, goal1);
		PrioritizedDecomposition priorizedDecomposition1 = createPriorizedDecomposition(gssQuery, decomposition1, 50);
		PrioritizedDecomposition priorizedDecomposition2 = createPriorizedDecomposition(gssQuery, decomposition2, 50);
		
		PrioritizedElement selectedGoal = createSelectedGoal(gssQuery, goal1, 100);
		createSelectedGoal(gssQuery, subgoal1, 50);
		createSelectedGoal(gssQuery, subgoal2, 50);

		executeRequiredPhases();
		

		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal1, goal1));
		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal2, goal1));
	}

	@Test
	public void testSetPriorityElementInteger() {
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		Goal subgoal1 = createGoal(gss, 3);
		
		Goal subgoal2 = createGoal(gss, 4);
		
		Goal subgoal3 = createGoal(gss,5);
		Goal subgoal4 = createGoal(gss, 6);
		
		Goal subgoal5= createGoal(gss, 7);
		Goal subgoal6 = createGoal(gss, 8);
		
		Decomposition decomposition1 = createDecomposition(gss, subgoal1, goal1);
		Decomposition decomposition2 = createDecomposition(gss, subgoal2, goal1);
		
		
		
		PrioritizedDecomposition priorizedDecomposition1 = createPriorizedDecomposition(gssQuery, decomposition1, 50);
		PrioritizedDecomposition priorizedDecomposition2 = createPriorizedDecomposition(gssQuery, decomposition2, 50);
		
		Decomposition decomposition3 = createDecomposition(gss, subgoal3, goal2);
		Decomposition decomposition4 = createDecomposition(gss, subgoal4, goal2);
		PrioritizedDecomposition priorizedDecomposition3 = createPriorizedDecomposition(gssQuery, decomposition3, 50);
		PrioritizedDecomposition priorizedDecomposition4 = createPriorizedDecomposition(gssQuery, decomposition4, 50);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, goal1, 50);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, goal2, 50);
		
		Decomposition decomposition5 = createDecomposition(gss, subgoal5, subgoal3);
		Decomposition decomposition6 = createDecomposition(gss, subgoal6, subgoal3);
		
		
		PrioritizedDecomposition priorizedDecomposition5 = createPriorizedDecomposition(gssQuery, decomposition5, 40);
		PrioritizedDecomposition priorizedDecomposition6 = createPriorizedDecomposition(gssQuery, decomposition6, 60);
		
		createSelectedGoal(gssQuery, subgoal1, 25);
		createSelectedGoal(gssQuery, subgoal2, 25);
		

		createSelectedGoal(gssQuery, subgoal3, 25);
		createSelectedGoal(gssQuery, subgoal4, 25);
		
		createSelectedGoal(gssQuery, subgoal5, 10);
		createSelectedGoal(gssQuery, subgoal6, 15);
		

		executeRequiredPhases();
		
		priorizedElementsCache.setPriority(goal1, 80);
		priorizedElementsCache.setPriority(goal2, 20);

		assertEquals(80.0f , priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals(20.0f , priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
		assertEquals("50", selectedGoal1.getGlobalPriority()); //priority of elements in the emf workspace must be unchanged until flush() is called
		assertEquals("50", selectedGoal2.getGlobalPriority());
		
		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal1, goal1));
		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal2, goal1));
		
		assertEquals(40.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal1));
		assertEquals(40.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal2));
		
		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal3, goal2));
		assertEquals(new Integer(50) , priorizedElementsCache.getWeight(subgoal4, goal2));
		
		assertEquals(10.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal3));
		assertEquals(10.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal4));
		
		assertEquals(new Integer(40) , priorizedElementsCache.getWeight(subgoal5, subgoal3));
		assertEquals(new Integer(60) , priorizedElementsCache.getWeight(subgoal6, subgoal3));
		
		assertEquals(4.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal5));
		assertEquals(6.0f , priorizedElementsCache.getPrioritizedElementPriority(subgoal6));
	}

	@Test
	public void testGetTarget() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( goal, priorizedElementsCache.getTarget(priorizedDecomposition));
	}

	@Test
	public void testGetSource() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( subgoal, priorizedElementsCache.getSource(priorizedDecomposition));
	}

	@Test
	public void testGetPriorizedElementPriority() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( 100.0f, priorizedElementsCache.getPrioritizedElementPriority(goal));
	}

	@Test
	public void testGetPriorizedDecompositionWeight() {
		Goal goal = createGoal(gss, 1);
		Goal subgoal = createGoal(gss, 2);
		Decomposition decomposition = createDecomposition(gss, subgoal, goal);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		createSelectedGoal(gssQuery, goal, 100);
		createSelectedGoal(gssQuery, subgoal, 100);

		executeRequiredPhases();
		assertEquals( new Integer(100), priorizedElementsCache.getPrioritizedDecompositionWeight(priorizedDecomposition));
	}



	@Test
	public void testFlush() {
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		PrioritizedElement selectedGoal1 = createSelectedGoal(gssQuery, goal1, 50);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, goal2, 50);


		executeRequiredPhases();
		
		priorizedElementsCache.setPriority(goal1, 80);
		priorizedElementsCache.setPriority(goal2, 20);
		assertEquals( 80.0f, priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals( 20.0f, priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
		assertEquals( "50", selectedGoal1.getGlobalPriority()); //must be unchanged until flush is called
		assertEquals( "50", selectedGoal2.getGlobalPriority());

		/* due to the use of transactions to write the changes into the modelworkspace, this method could be test to runtime only
		priorizedElementsCache.flush();
		assertEquals( 80.0f, priorizedElementsCache.getPriorizedElementPriority(goal1));
		assertEquals( 20.0f, priorizedElementsCache.getPriorizedElementPriority(goal2));
		
		assertEquals( "80.0", selectedGoal1.getGlobalPriority()); 
		assertEquals( "20.0", selectedGoal2.getGlobalPriority());*/
	}
	
	@Test
	public void testRepairPrioritiesAndWeightsRootsOnly(){
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		createSelectedGoal(gssQuery, goal1, 40);
		createSelectedGoal(gssQuery, goal2, 40);


		executeRequiredPhases();
		
		priorizedElementsCache.repairPrioritiesAndWeights();
		
		
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
	}
	
	@Test
	public void testRepairPrioritiesAndWeightsRootsWithNullPriority(){
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		PrioritizedElement sg1 =	createSelectedGoal(gssQuery, goal1, 0);
		PrioritizedElement sg2 =createSelectedGoal(gssQuery, goal2, 0);

		sg1.setGlobalPriority(null);
		sg2.setGlobalPriority(null);

		executeRequiredPhases();
		
		priorizedElementsCache.repairPrioritiesAndWeights();
		
		
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
	}
	
	@Test
	public void testRepairPrioritiesAndWeightsRootsWithZeroPriority(){
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		createSelectedGoal(gssQuery, goal1, 0);
		createSelectedGoal(gssQuery, goal2, 0);


		executeRequiredPhases();
		
		priorizedElementsCache.repairPrioritiesAndWeights();
		
		
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
	}
	
	public void testGetRootPriorizedElements(){
		//					   -|--- g5
		// goal 1 -|--- goal 3 
		//					   -|--- g4
		// goal 2
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		Goal goal3 = createGoal(gss, 3);
		Goal goal4 = createGoal(gss, 4);
		
		Goal goal5 = createGoal(gss, 5);

		
		createSelectedGoal(gssQuery, goal1, 0);
		createSelectedGoal(gssQuery, goal2, 0);
		
		createSelectedGoal(gssQuery, goal3, 0);
		createSelectedGoal(gssQuery, goal4, 0);
		
		createSelectedGoal(gssQuery, goal5, 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal3, goal1), 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal4, goal3), 0);
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal5, goal3), 0);
		
		executeRequiredPhases();
		
		assertEquals(2, priorizedElementsCache.getRootPrioritizedElements().size());
	}
	@Test
	public void testIsRoot(){
		//					   -|--- g5
		// goal 1 -|--- goal 3 
		//					   -|--- g4
		// goal 2
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		Goal goal3 = createGoal(gss, 3);
		Goal goal4 = createGoal(gss, 4);
		
		Goal goal5 = createGoal(gss, 5);

		
		createSelectedGoal(gssQuery, goal1, 0);
		createSelectedGoal(gssQuery, goal2, 0);
		
		createSelectedGoal(gssQuery, goal3, 0);
		createSelectedGoal(gssQuery, goal4, 0);
		
		createSelectedGoal(gssQuery, goal5, 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal3, goal1), 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal4, goal3), 0);
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal5, goal3), 0);
		
		executeRequiredPhases();
		
		assertTrue( priorizedElementsCache.isRoot(goal1));
		assertTrue( priorizedElementsCache.isRoot(goal2));
		
		assertFalse( priorizedElementsCache.isRoot(goal3));
		assertFalse( priorizedElementsCache.isRoot(goal4));
		assertFalse( priorizedElementsCache.isRoot(goal5));
	
	}
	
	
	@Test
	public void testIsLeaf(){
		//					   -|--- g5
		// goal 1 -|--- goal 3 
		//					   -|--- g4
		// goal 2
		
		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);
		
		Goal goal3 = createGoal(gss, 3);
		Goal goal4 = createGoal(gss, 4);
		
		Goal goal5 = createGoal(gss, 5);

		
		createSelectedGoal(gssQuery, goal1, 0);
		createSelectedGoal(gssQuery, goal2, 0);
		
		createSelectedGoal(gssQuery, goal3, 0);
		createSelectedGoal(gssQuery, goal4, 0);
		
		createSelectedGoal(gssQuery, goal5, 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal3, goal1), 0);
		
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal4, goal3), 0);
		createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal5, goal3), 0);
		
		executeRequiredPhases();
		
		assertFalse( priorizedElementsCache.isLeaf(goal1));
		assertTrue( priorizedElementsCache.isLeaf(goal2));
		
		assertFalse( priorizedElementsCache.isLeaf(goal3));
		assertTrue( priorizedElementsCache.isLeaf(goal4));
		assertTrue( priorizedElementsCache.isLeaf(goal5));
	
	}
	
	
	@Test
	public void testRepairPrioritiesAndWeightsWithSubgoals(){
//		   -|--- g5
// goal 1 -|--- goal 3 
//					   -|--- g4
// goal 2

Goal goal1 = createGoal(gss, 1);
Goal goal2 = createGoal(gss, 2);

Goal goal3 = createGoal(gss, 3);
Goal goal4 = createGoal(gss, 4);

Goal goal5 = createGoal(gss, 5);


createSelectedGoal(gssQuery, goal1, 0);
createSelectedGoal(gssQuery, goal2, 0);

createSelectedGoal(gssQuery, goal3, 0);
createSelectedGoal(gssQuery, goal4, 0);

createSelectedGoal(gssQuery, goal5, 0);

createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal3, goal1), 0);

createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal4, goal3), 0);
createPriorizedDecomposition(gssQuery, createDecomposition(gss, goal5, goal3), 0);



executeRequiredPhases();
		
		priorizedElementsCache.repairPrioritiesAndWeights();
		
		
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal1));
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal2));
		
		assertEquals( 50.0f, priorizedElementsCache.getPrioritizedElementPriority(goal3));
		
		assertEquals( new Integer(100), priorizedElementsCache.getPrioritizedDecompositionWeight(priorizedElementsCache.getPrioritizedDecompositionsBetween(goal3, goal1)));
		assertEquals( new Integer(50), priorizedElementsCache.getPrioritizedDecompositionWeight(priorizedElementsCache.getPrioritizedDecompositionsBetween(goal4, goal3)));
		assertEquals( new Integer(50), priorizedElementsCache.getPrioritizedDecompositionWeight(priorizedElementsCache.getPrioritizedDecompositionsBetween(goal5, goal3)));
		
		assertEquals( 25.0f, priorizedElementsCache.getPrioritizedElementPriority(goal4));
		assertEquals( 25.0f, priorizedElementsCache.getPrioritizedElementPriority(goal5));
		
	}
	
	@Test
	public void testGetPriorizedDecompositionForDecomposition(){
		
		// goal 1 -|--- goal 2

		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);


		createSelectedGoal(gssQuery, goal1, 100);
		createSelectedGoal(gssQuery, goal2, 100);

		Decomposition decomposition = createDecomposition(gss, goal2, goal1);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);


		executeRequiredPhases();

		assertEquals(priorizedDecomposition , priorizedElementsCache.getPrioritizedDecompositionForDecomposition(decomposition));
	}

	
	
    @Test
	public void testRemoveMarkedElementsAndDecompositions() {

		
		
		// goal 1 -|--- goal 2

		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);


		createSelectedGoal(gssQuery, goal1, 100);
		PrioritizedElement selectedGoal2 = createSelectedGoal(gssQuery, goal2, 100);

		Decomposition decomposition = createDecomposition(gss, goal2, goal1);
		PrioritizedDecomposition priorizedDecomposition = createPriorizedDecomposition(gssQuery, decomposition, 100);


		executeRequiredPhases();

		priorizedElementsCache.markDecompositionAsToRemove(decomposition);
		priorizedElementsCache.markElementAsToRemove(goal2);
		
		/* due to the use of transactions to write the changes into the modelworkspace, this method could be test to runtime only
		priorizedElementsCache.removeMarkedElementsAndDecompositions();
		
		
		assertNull(priorizedElementsCache.getPriorizedDecomposition(decomposition));
		assertNull(priorizedElementsCache.getDecomposition(priorizedDecomposition));
		assertNull(priorizedElementsCache.getElement(selectedGoal2));
		assertNull(priorizedElementsCache.getPriorizedElementPriority(goal2));
		assertNull(priorizedElementsCache.getPriorizedDecompositionsBetween(goal2, goal1));
		
		assertEquals(1, priorizedElementsCache.getPriorizedElementSet().getPriorizedElements().size());
		assertEquals(0, priorizedElementsCache.getPriorizedElementSet().getPriorizedDecompositionRelations().size());
		
		//internal list with elements to remove has been cleared
		assertFalse(priorizedElementsCache.isMarkedAsToRemove(decomposition));
		assertFalse(priorizedElementsCache.isMarkedAsToRemove(goal1));
		assertFalse(priorizedElementsCache.isMarkedAsToRemove(goal2));
		
		*/
		
	}
    
    @Test
	public void testIsMarkedAsToRemove() {
		// goal 1 -|--- goal 2

		Goal goal1 = createGoal(gss, 1);
		Goal goal2 = createGoal(gss, 2);

		createSelectedGoal(gssQuery, goal1, 100);
		createSelectedGoal(gssQuery, goal2, 100);

		Decomposition decomposition = createDecomposition(gss, goal2, goal1);
		createPriorizedDecomposition(gssQuery, decomposition, 100);
		
		executeRequiredPhases();

		priorizedElementsCache.markDecompositionAsToRemove(decomposition);
		priorizedElementsCache.markElementAsToRemove(goal2);
			
		assertTrue(priorizedElementsCache.isMarkedAsToRemove(decomposition));
		assertFalse(priorizedElementsCache.isMarkedAsToRemove(goal1));
		assertTrue(priorizedElementsCache.isMarkedAsToRemove(goal2));
	
    }
    
    
	
}

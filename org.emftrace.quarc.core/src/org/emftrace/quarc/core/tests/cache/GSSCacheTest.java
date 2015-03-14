package org.emftrace.quarc.core.tests.cache;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.quarc.core.cache.GSSCache;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class GSSCacheTest extends QUARCCoreTestCase {

	private Goal g1;
	private Goal g2;
	private Goal g3;
	private Goal g4;
	private Goal g5;

	private Principle p1;
	private Principle p2;
	private Principle p3;
	private Principle p4;
	private Principle p5;

	private Pattern si1;
	private Pattern si2;
	private Pattern si3;
	private Pattern si4;
	private Pattern si5;
	private Decomposition d1;
	private Decomposition d2;
	private Decomposition d3;
	private Decomposition d4;
	private Decomposition d5;
	private Decomposition d6;
	private Decomposition d7;
	private Decomposition d8;

	private isA isA1;
	private isA isA2;
	private isA isA3;
	private isA isA4;

	private Impact i1;
	private Impact i2;
	private Impact i3;
	private Impact i4;
	private GSSCache cache;

	private void executeRequiredPhases() {

		cache = new GSSCache(gss, accessLayer);
		cache.initCache();

	}

	private void createTestCase() {
		g1 = createGoal(gss, 1);
		g2 = createGoal(gss, 2);
		g3 = createGoal(gss, 3);
		g4 = createGoal(gss, 4);
		g5 = createGoal(gss, 5);

		d1 = createDecomposition(gss, g2, g1);
		d2 = createDecomposition(gss, g3, g1);
		d3 = createDecomposition(gss, g4, g3);
		d4 = createDecomposition(gss, g5, g3);

		p1 = createPrinciple(gss, 1);
		p2 = createPrinciple(gss, 2);
		p3 = createPrinciple(gss, 3);
		p4 = createPrinciple(gss, 4);
		p5 = createPrinciple(gss, 5);

		d5 = createDecomposition(gss, p2, p1);
		d6 = createDecomposition(gss, p3, p1);
		d7 = createDecomposition(gss, p4, p3);
		d8 = createDecomposition(gss, p5, p3);

		si1 = createPattern(gss, 1);
		si2 = createPattern(gss, 2);
		si3 = createPattern(gss, 3);
		si4 = createPattern(gss, 4);
		si5 = createPattern(gss, 5);

		isA1 = createIsA(gss, si2, si1);
		isA2 = createIsA(gss, si3, si1);
		isA3 = createIsA(gss, si4, si3);
		isA4 = createIsA(gss, si5, si3);

		i1 = createImpact(gss, p1, g5, 1);
		i2 = createImpact(gss, p5, g4, 1);

		i3 = createImpact(gss, si1, p5, 1);
		i4 = createImpact(gss, si4, p4, 1);

	}

	@Test
	public void testGetGss() {
		executeRequiredPhases();
		assertEquals(gss, cache.getGss());
	}

	@Test
	public void testGetLevel() {

		createTestCase();
		executeRequiredPhases();

		assertEquals(0, cache.getLevel(g1));
		assertEquals(0, cache.getLevel(g2));
		assertEquals(0, cache.getLevel(g3));
		assertEquals(0, cache.getLevel(g4));
		assertEquals(0, cache.getLevel(g5));

		assertEquals(1, cache.getLevel(p1));
		assertEquals(1, cache.getLevel(p2));
		assertEquals(1, cache.getLevel(p3));
		assertEquals(1, cache.getLevel(p4));
		assertEquals(1, cache.getLevel(p5));

		assertEquals(2, cache.getLevel(si1));
		assertEquals(2, cache.getLevel(si2));
		assertEquals(2, cache.getLevel(si3));
		assertEquals(2, cache.getLevel(si4));
		assertEquals(2, cache.getLevel(si5));

	}

	@Test
	public void testGetGSSLayer() {
		createTestCase();
		executeRequiredPhases();

		assertEquals(GSSLayer.layer1, cache.getGSSLayer(g1));
		assertEquals(GSSLayer.layer1, cache.getGSSLayer(g2));
		assertEquals(GSSLayer.layer1, cache.getGSSLayer(g3));
		assertEquals(GSSLayer.layer1, cache.getGSSLayer(g4));
		assertEquals(GSSLayer.layer1, cache.getGSSLayer(g5));

		assertEquals(GSSLayer.layer3, cache.getGSSLayer(p1));
		assertEquals(GSSLayer.layer3, cache.getGSSLayer(p2));
		assertEquals(GSSLayer.layer3, cache.getGSSLayer(p3));
		assertEquals(GSSLayer.layer3, cache.getGSSLayer(p4));
		assertEquals(GSSLayer.layer3, cache.getGSSLayer(p5));

		assertEquals(GSSLayer.layer4, cache.getGSSLayer(si1));
		assertEquals(GSSLayer.layer4, cache.getGSSLayer(si2));
		assertEquals(GSSLayer.layer4, cache.getGSSLayer(si3));
		assertEquals(GSSLayer.layer4, cache.getGSSLayer(si4));
		assertEquals(GSSLayer.layer4, cache.getGSSLayer(si5));
	}

	@Test
	public void testGetSublevel() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(0, cache.getSublevel(g1));
		assertEquals(1, cache.getSublevel(g2));
		assertEquals(1, cache.getSublevel(g3));
		assertEquals(2, cache.getSublevel(g4));
		assertEquals(2, cache.getSublevel(g5));

		assertEquals(0, cache.getSublevel(p1));
		assertEquals(1, cache.getSublevel(p2));
		assertEquals(1, cache.getSublevel(p3));
		assertEquals(2, cache.getSublevel(p4));
		assertEquals(2, cache.getSublevel(p5));

		assertEquals(0, cache.getSublevel(si1));
		assertEquals(1, cache.getSublevel(si2));
		assertEquals(1, cache.getSublevel(si3));
		assertEquals(2, cache.getSublevel(si4));
		assertEquals(2, cache.getSublevel(si5));
	}

	@Test
	public void testIsInnerNode() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(false, cache.isInnerNode(g1));
		assertEquals(false, cache.isInnerNode(g2));
		assertEquals(true, cache.isInnerNode(g3));
		assertEquals(false, cache.isInnerNode(g4));
		assertEquals(false, cache.isInnerNode(g5));

		assertEquals(false, cache.isInnerNode(p1));
		assertEquals(false, cache.isInnerNode(p2));
		assertEquals(true, cache.isInnerNode(p3));
		assertEquals(false, cache.isInnerNode(p4));
		assertEquals(false, cache.isInnerNode(p5));

		assertEquals(false, cache.isInnerNode(si1));
		assertEquals(false, cache.isInnerNode(si2));
		assertEquals(true, cache.isInnerNode(si3));
		assertEquals(false, cache.isInnerNode(si4));
		assertEquals(false, cache.isInnerNode(si5));
	}

	@Test
	public void testIsLeaf() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(false, cache.isLeaf(g1));
		assertEquals(true, cache.isLeaf(g2));
		assertEquals(false, cache.isLeaf(g3));
		assertEquals(true, cache.isLeaf(g4));
		assertEquals(true, cache.isLeaf(g5));

		assertEquals(false, cache.isLeaf(p1));
		assertEquals(true, cache.isLeaf(p2));
		assertEquals(false, cache.isLeaf(p3));
		assertEquals(true, cache.isLeaf(p4));
		assertEquals(true, cache.isLeaf(p5));

		assertEquals(false, cache.isLeaf(si1));
		assertEquals(true, cache.isLeaf(si2));
		assertEquals(false, cache.isLeaf(si3));
		assertEquals(true, cache.isLeaf(si4));
		assertEquals(true, cache.isLeaf(si5));
	}

	@Test
	public void testIsRoot() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(true, cache.isRoot(g1));
		assertEquals(false, cache.isRoot(g2));
		assertEquals(false, cache.isRoot(g3));
		assertEquals(false, cache.isRoot(g4));
		assertEquals(false, cache.isRoot(g5));

		assertEquals(true, cache.isRoot(p1));
		assertEquals(false, cache.isRoot(p2));
		assertEquals(false, cache.isRoot(p3));
		assertEquals(false, cache.isRoot(p4));
		assertEquals(false, cache.isRoot(p5));

		assertEquals(true, cache.isRoot(si1));
		assertEquals(false, cache.isRoot(si2));
		assertEquals(false, cache.isRoot(si3));
		assertEquals(false, cache.isRoot(si4));
		assertEquals(false, cache.isRoot(si5));
	}

	@Test
	public void testGetAllElements() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(15, cache.getAllElements().size());
		assertEquals(true, cache.getAllElements().contains(g1));
		assertEquals(true, cache.getAllElements().contains(g2));
		assertEquals(true, cache.getAllElements().contains(g3));
		assertEquals(true, cache.getAllElements().contains(g4));
		assertEquals(true, cache.getAllElements().contains(g5));

		assertEquals(true, cache.getAllElements().contains(p1));
		assertEquals(true, cache.getAllElements().contains(p2));
		assertEquals(true, cache.getAllElements().contains(p3));
		assertEquals(true, cache.getAllElements().contains(p4));
		assertEquals(true, cache.getAllElements().contains(p5));

		assertEquals(true, cache.getAllElements().contains(si1));
		assertEquals(true, cache.getAllElements().contains(si2));
		assertEquals(true, cache.getAllElements().contains(si3));
		assertEquals(true, cache.getAllElements().contains(si4));
		assertEquals(true, cache.getAllElements().contains(si5));
	}

	@Test
	public void testGetAllElementsInt() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(5, cache.getAllElements(GSSLayer.layer1).size());
		assertEquals(true, cache.getAllElements(GSSLayer.layer1).contains(g1));
		assertEquals(true, cache.getAllElements(GSSLayer.layer1).contains(g2));
		assertEquals(true, cache.getAllElements(GSSLayer.layer1).contains(g3));
		assertEquals(true, cache.getAllElements(GSSLayer.layer1).contains(g4));
		assertEquals(true, cache.getAllElements(GSSLayer.layer1).contains(g5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(p1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(p2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(p3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(p4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(p5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(si1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(si2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(si3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(si4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer1).contains(si5));

		assertEquals(5, cache.getAllElements(GSSLayer.layer2).size());
		assertEquals(true, cache.getAllElements(GSSLayer.layer2).contains(g1));
		assertEquals(true, cache.getAllElements(GSSLayer.layer2).contains(g2));
		assertEquals(true, cache.getAllElements(GSSLayer.layer2).contains(g3));
		assertEquals(true, cache.getAllElements(GSSLayer.layer2).contains(g4));
		assertEquals(true, cache.getAllElements(GSSLayer.layer2).contains(g5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(p1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(p2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(p3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(p4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(p5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(si1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(si2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(si3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(si4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer2).contains(si5));

		assertEquals(5, cache.getAllElements(GSSLayer.layer3).size());
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(g1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(g2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(g3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(g4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(g5));

		assertEquals(true, cache.getAllElements(GSSLayer.layer3).contains(p1));
		assertEquals(true, cache.getAllElements(GSSLayer.layer3).contains(p2));
		assertEquals(true, cache.getAllElements(GSSLayer.layer3).contains(p3));
		assertEquals(true, cache.getAllElements(GSSLayer.layer3).contains(p4));
		assertEquals(true, cache.getAllElements(GSSLayer.layer3).contains(p5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(si1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(si2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(si3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(si4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer3).contains(si5));

		assertEquals(5, cache.getAllElements(GSSLayer.layer4).size());
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(g1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(g2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(g3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(g4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(g5));

		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(p1));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(p2));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(p3));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(p4));
		assertEquals(false, cache.getAllElements(GSSLayer.layer4).contains(p5));

		assertEquals(true, cache.getAllElements(GSSLayer.layer4).contains(si1));
		assertEquals(true, cache.getAllElements(GSSLayer.layer4).contains(si2));
		assertEquals(true, cache.getAllElements(GSSLayer.layer4).contains(si3));
		assertEquals(true, cache.getAllElements(GSSLayer.layer4).contains(si4));
		assertEquals(true, cache.getAllElements(GSSLayer.layer4).contains(si5));
	}

	@Test
	public void testGetRootElements() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(1, cache.getRootElements(GSSLayer.layer1).size());
		assertEquals(true, cache.getRootElements(GSSLayer.layer1).contains(g1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(g2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(g3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(g4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(g5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(p1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(p2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(p3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(p4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1).contains(p5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer1)
				.contains(si1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1)
				.contains(si2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1)
				.contains(si3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1)
				.contains(si4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer1)
				.contains(si5));

		assertEquals(1, cache.getRootElements(GSSLayer.layer2).size());
		assertEquals(true, cache.getRootElements(GSSLayer.layer2).contains(g1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(g2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(g3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(g4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(g5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(p1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(p2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(p3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(p4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2).contains(p5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer2)
				.contains(si1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2)
				.contains(si2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2)
				.contains(si3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2)
				.contains(si4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer2)
				.contains(si5));

		assertEquals(1, cache.getRootElements(GSSLayer.layer3).size());
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(g1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(g2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(g3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(g4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(g5));

		assertEquals(true, cache.getRootElements(GSSLayer.layer3).contains(p1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(p2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(p3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(p4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3).contains(p5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer3)
				.contains(si1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3)
				.contains(si2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3)
				.contains(si3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3)
				.contains(si4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer3)
				.contains(si5));

		assertEquals(1, cache.getRootElements(GSSLayer.layer4).size());
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(g1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(g2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(g3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(g4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(g5));

		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(p1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(p2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(p3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(p4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4).contains(p5));

		assertEquals(true, cache.getRootElements(GSSLayer.layer4).contains(si1));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4)
				.contains(si2));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4)
				.contains(si3));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4)
				.contains(si4));
		assertEquals(false, cache.getRootElements(GSSLayer.layer4)
				.contains(si5));
	}

	@Test
	public void testGetLeafElements() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(3, cache.getLeafElements(GSSLayer.layer1).size());
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(g1));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer1).contains(g2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(g3));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer1).contains(g4));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer1).contains(g5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(p1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(p2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(p3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(p4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1).contains(p5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer1)
				.contains(si1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1)
				.contains(si2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1)
				.contains(si3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1)
				.contains(si4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer1)
				.contains(si5));

		assertEquals(3, cache.getLeafElements(GSSLayer.layer2).size());
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(g1));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer2).contains(g2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(g3));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer2).contains(g4));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer2).contains(g5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(p1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(p2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(p3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(p4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2).contains(p5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer2)
				.contains(si1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2)
				.contains(si2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2)
				.contains(si3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2)
				.contains(si4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer2)
				.contains(si5));

		assertEquals(3, cache.getLeafElements(GSSLayer.layer3).size());
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(g1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(g2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(g3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(g4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(g5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(p1));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer3).contains(p2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3).contains(p3));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer3).contains(p4));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer3).contains(p5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer3)
				.contains(si1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3)
				.contains(si2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3)
				.contains(si3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3)
				.contains(si4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer3)
				.contains(si5));

		assertEquals(3, cache.getLeafElements(GSSLayer.layer4).size());
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(g1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(g2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(g3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(g4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(g5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(p1));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(p2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(p3));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(p4));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4).contains(p5));

		assertEquals(false, cache.getLeafElements(GSSLayer.layer4)
				.contains(si1));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer4).contains(si2));
		assertEquals(false, cache.getLeafElements(GSSLayer.layer4)
				.contains(si3));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer4).contains(si4));
		assertEquals(true, cache.getLeafElements(GSSLayer.layer4).contains(si5));
	}

	@Test
	public void testGetTargetOfRelation() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(g1, cache.getTargetOfRelation(d1));
		assertEquals(si1, cache.getTargetOfRelation(isA1));
		assertEquals(g5, cache.getTargetOfRelation(i1));
	}

	@Test
	public void testGetSourceOfRelation() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(g2, cache.getSourceOfRelation(d1));
		assertEquals(si2, cache.getSourceOfRelation(isA1));
		assertEquals(p1, cache.getSourceOfRelation(i1));

	}

	@Test
	public void testGetAllOutgoingRelationsForElementElement() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(0, cache.getAllOutgoingRelationsForElement(g1).size());
		assertEquals(1, cache.getAllOutgoingRelationsForElement(g5).size());
		assertEquals(1, cache.getAllOutgoingRelationsForElement(si1).size());
	}

	@Test
	public void testGetAllIncomingRelationsForElementElement() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(2, cache.getAllIncomingRelationsForElement(g1).size());
		assertEquals(1, cache.getAllIncomingRelationsForElement(g5).size());
		assertEquals(2, cache.getAllIncomingRelationsForElement(si1).size());
	}

	@Test
	public void testGetAllOutgoingRelationsForElementElementString() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(0,
				cache.getAllOutgoingRelationsForElement(g1, "Decomposition")
						.size());
		assertEquals(0, cache.getAllOutgoingRelationsForElement(g1, "Impact")
				.size());
		assertEquals(0, cache.getAllOutgoingRelationsForElement(g1, "Offset")
				.size());

		assertEquals(1,
				cache.getAllOutgoingRelationsForElement(g2, "Decomposition")
						.size());
		assertEquals(0, cache.getAllOutgoingRelationsForElement(g2, "Impact")
				.size());
		assertEquals(0, cache.getAllOutgoingRelationsForElement(g2, "Offset")
				.size());

	}

	@Test
	public void testGetAllIncomingRelationsForElementElementString() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(2,
				cache.getAllIncomingRelationsForElement(g1, "Decomposition")
						.size());
		assertEquals(0, cache.getAllIncomingRelationsForElement(g1, "Impact")
				.size());
		assertEquals(0, cache.getAllIncomingRelationsForElement(g1, "Offset")
				.size());

		assertEquals(0,
				cache.getAllIncomingRelationsForElement(g5, "Decomposition")
						.size());
		assertEquals(1, cache.getAllIncomingRelationsForElement(g5, "Impact")
				.size());
		assertEquals(0, cache.getAllIncomingRelationsForElement(g5, "Offset")
				.size());

	}

	@Test
	public void testGetAllRelations() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(16, cache.getAllRelations().size());

	}

	@Test
	public void testGetAllRelationsString() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(8, cache.getAllRelations("Decomposition").size());
		assertEquals(4, cache.getAllRelations("Impact").size());
		assertEquals(4, cache.getAllRelations("isA").size());
	}

	@Test
	public void testGetRelationWeight() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(null, cache.getRelationWeight(d1));
		assertEquals(1.0f, cache.getRelationWeight(i1));
		assertEquals(null, cache.getRelationWeight(isA1));

	}

	@Test
	public void testGetRelationWeightString() {
		createTestCase();

		executeRequiredPhases();

		assertEquals(null, cache.getRelationWeightString(d1));
		assertEquals("1.0", cache.getRelationWeightString(i1));
		assertEquals(null, cache.getRelationWeightString(isA1));
	}

}

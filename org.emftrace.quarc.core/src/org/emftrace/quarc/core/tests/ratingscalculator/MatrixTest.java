package org.emftrace.quarc.core.tests.ratingscalculator;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import junit.framework.TestCase;

import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.quarc.core.gssquery.ratingscalculator.Matrix;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest extends TestCase {

	private Principle p1;
	private Principle p2;
	private Principle p3;
	private Principle p4;

	private Pattern si1;
	private Pattern si2;
	private Pattern si3;
	private Pattern si4;

	private LinkedHashMap<Element, Float> testColumnVectorSi1;
	private LinkedHashMap<Element, Float> testColumnVectorSi2;
	private LinkedHashMap<Element, Float> testColumnVectorSi3;
	private LinkedHashMap<Element, Float> testColumnVectorSi4;

	private Matrix testMatrix;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	// this is important, otherwise setUp() would not be called
	@Override
	public void setUp() throws Exception {
		super.setUp();
	
		p1 = GSSFactory.eINSTANCE.createPrinciple();
		p2 = GSSFactory.eINSTANCE.createPrinciple();
		p3 = GSSFactory.eINSTANCE.createPrinciple();
		p4 = GSSFactory.eINSTANCE.createPrinciple();

		si1 = GSSFactory.eINSTANCE.createPattern();
		si2 = GSSFactory.eINSTANCE.createPattern();
		si3 = GSSFactory.eINSTANCE.createPattern();
		si4 = GSSFactory.eINSTANCE.createPattern();

		testColumnVectorSi1 = new LinkedHashMap<Element, Float>();
		testColumnVectorSi1.put(p1, 1.3f);
		testColumnVectorSi1.put(p2, 0.8f);
		testColumnVectorSi1.put(p3, 1.5f);
		testColumnVectorSi1.put(p4, 2.0f);

		testColumnVectorSi2 = new LinkedHashMap<Element, Float>();
		testColumnVectorSi2.put(p1, 1.3f);
		testColumnVectorSi2.put(p2, -0.8f);
		testColumnVectorSi2.put(p3, -1.5f);
		testColumnVectorSi2.put(p4, 2.0f);

		testColumnVectorSi3 = new LinkedHashMap<Element, Float>();
		testColumnVectorSi3.put(p1, 1.4f);
		testColumnVectorSi3.put(p2, 0.2f);
		// key p3 is undefined
		testColumnVectorSi3.put(p4, 1.0f);

		testColumnVectorSi4 = new LinkedHashMap<Element, Float>();
		testColumnVectorSi4.put(p1, 1.3f);
		// keys p2 & p3 are undefined
		testColumnVectorSi4.put(p4, 2.0f);

		testMatrix = new Matrix();
	}

	@Test
	public void testGetValue() {
		testMatrix.setColumnVector(si1, testColumnVectorSi1);
		assertEquals(1.3f, testMatrix.getValue(si1, p1));
		
		//test for Null value
		testMatrix.setColumnVector(si3, testColumnVectorSi3);
		assertNull( testMatrix.getValue(si3, p3));
	}
	

	@Test
	public void testSetValue() {
		testMatrix.setColumnVector(si1, testColumnVectorSi1);
		testMatrix.setValue(si1, p1, 2.0f);
		assertEquals( 2.0f, testMatrix.getValue(si1, p1));
		
		// test for new column element
		Principle p5 = GSSFactory.eINSTANCE.createPrinciple();
		testMatrix.setValue(si1, p5, 2.0f);
		assertEquals( 2.0f, testMatrix.getValue(si1, p5));
		
		// test for new row element
		Pattern si5 = GSSFactory.eINSTANCE.createPattern();
		testMatrix.setValue(si5, p1, 2.0f);
		assertEquals( 2.0f, testMatrix.getValue(si5, p1));
		
		// test for new row element & new column element
		Pattern si6 = GSSFactory.eINSTANCE.createPattern();
		Principle p6 = GSSFactory.eINSTANCE.createPrinciple();
		testMatrix.setValue(si6, p6, 2.0f);
		assertEquals( 2.0f, testMatrix.getValue(si6, p6));
		
		// stored value must be another instance
		float value = 2.0f;
		testMatrix.setValue(si1, p1, value);
		value = 1.0f;
		assertEquals( 2.0f, testMatrix.getValue(si1, p1));
		
		// test for string
		String valueStr = "4.0";
		testMatrix.setValue(si1, p1, valueStr);
		assertEquals( 4.0f, testMatrix.getValue(si1, p1));
	}

	@Test
	public void testGetColumVector() {
		testMatrix.setColumnVector(si1, testColumnVectorSi1);
		assertEquals( 1.3f, testMatrix.getValue(si1, p1));
	}

	@Test
	public void testGetColumnEntrySet() {
		
		testMatrix.setColumnVector(si1,testColumnVectorSi1 );
		testMatrix.setColumnVector(si2,testColumnVectorSi2 );
		testMatrix.setColumnVector(si3,testColumnVectorSi3 );
		testMatrix.setColumnVector(si4,testColumnVectorSi4 );



		assertEquals(4, testMatrix.getColumnEntrySet().size());
		boolean found = false;
		for (Entry<Element, LinkedHashMap<Element, Float>> entry : testMatrix.getColumnEntrySet()){
			Element element = entry.getKey();
			if (element == si1){
				found = true;
				for (Entry<Element, Float> columnEntry : entry.getValue().entrySet()){

					assertEquals(testColumnVectorSi1.get(columnEntry.getKey()), columnEntry.getValue());
				}
				break;
			}
		}

		if (!found)
			fail("si1 not found");

	}
	
	@Test
	public void testSetColumnVector() {

		testMatrix.setColumnVector(si1, testColumnVectorSi1);
		assertEquals( 1.3f, testMatrix.getValue(si1, p1));
		
		//stored column vector must be another instance
		testColumnVectorSi1.put(p1, 0f);
		assertEquals( 1.3f, testMatrix.getValue(si1, p1));

	}

	@Test
	public void testCalaculateDotProductForColumnVectors() {
		// due to the use of Float, the result isn't exactly (e.g. 2.7999997f instead of 2.8f)
		// see "What Every Computer Scientist Should Know About Floating-Point Arithmetic" by David Goldberg, published in the March, 1991 issue of Computing Surveys.
		// http://download.oracle.com/docs/cd/E19957-01/806-3568/ncg_goldberg.html
		assertEquals(2.7999997f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi1, testColumnVectorSi2));
		assertEquals(5.6899996f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi4, testColumnVectorSi4));
		assertEquals(3.82f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi3, testColumnVectorSi4));
		assertEquals(3.98f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi1, testColumnVectorSi3));
		assertEquals(5.6899996f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi1, testColumnVectorSi4));
		assertEquals(3.6599998f, Matrix.calaculateDotProductForColumnVectors(testColumnVectorSi2, testColumnVectorSi3));
	}

	@Test
	public void testNumberOfEntries() {
		assertEquals( 4, Matrix.numberOfEntries(testColumnVectorSi1));
		assertEquals( 4, Matrix.numberOfEntries(testColumnVectorSi2));
		assertEquals( 3, Matrix.numberOfEntries(testColumnVectorSi3));
		assertEquals( 2, Matrix.numberOfEntries(testColumnVectorSi4));
	}

}

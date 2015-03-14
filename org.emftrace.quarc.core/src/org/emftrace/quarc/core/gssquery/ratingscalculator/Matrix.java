/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 

package org.emftrace.quarc.core.gssquery.ratingscalculator;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.emftrace.metamodel.QUARCModel.GSS.Element;

/**
 * A Matrix to store weights of Relations between two Elements<br>
 * A stored value is indexed by the a pair of Elements
 * 
 * @author Daniel Motschmann
 *
 */
public class Matrix {
	
	/**
	 * a Map to store a value for a pair of Elements
	 */
	private LinkedHashMap<Element, LinkedHashMap<Element, Float>> matrix;

	/**
	 * the constructor
	 */
	public Matrix() {
		matrix = new LinkedHashMap<Element, LinkedHashMap<Element, Float>>();
	}

	/**
	 * getter for the stored value of the specified pair of Elements
	 * @param columnElement the column Element
	 * @param rowElement the row Element
	 * @return the stored value of the two specified Elements
	 */
	public Float getValue(Element columnElement, Element rowElement) {

		if (matrix.containsKey(columnElement)) {
			LinkedHashMap<Element, Float> foundColumnVector = matrix.get(columnElement);
			if (foundColumnVector.containsKey(rowElement)) {
				return foundColumnVector.get(rowElement);
			}
		}
		return null;
	}

	/**
 	 * puts the specified value of the specified pair into the matrix
	 * @param columnElement the column Element
	 * @param rowElement the row Element
 	 * @param value a Float value to store
	 */
	public void setValue(Element columnElement, Element rowElement, Float value) {

		if (matrix.containsKey(columnElement)) {

			LinkedHashMap<Element, Float> foundColumnVector = matrix.get(columnElement);
			foundColumnVector.put(rowElement, value);
		} else {
			LinkedHashMap<Element, Float> newColumnVector = new LinkedHashMap<Element, Float>();
			newColumnVector.put(rowElement, value);
			matrix.put(columnElement, newColumnVector);
		}
	}
	
	/**
 	 * puts the specified value of the specified pair into the matrix
	 * @param columnElement the column Element
	 * @param rowElement the row Element
	 * @param value a value as String
	 */
	public void setValue(Element columnElement, Element rowElement, String value) {
		this.setValue(columnElement, rowElement, Float.parseFloat(value));
	}
	
	/**
	 * getter for a Set (LinkedHashSet) of stored column Entries (Entry of column Element, column vector )
	 * @return a Set (LinkedHashSet) of stored column Entries
	 */
	public Set<Entry<Element, LinkedHashMap<Element, Float>>> getColumnEntrySet() {
		Set<Entry<Element, LinkedHashMap<Element, Float>>> result = new LinkedHashSet<Entry<Element,LinkedHashMap<Element, Float>>>();
		for ( Entry<Element, LinkedHashMap<Element, Float>> entry : matrix.entrySet()){
			result.add(entry);
		}
		return result;
	}

	/**
	 * getter for the column vector of the specified column Element
	 * @param columnElement the column Element
	 * @return the column vector of the specified column Element
	 */
	public Map<Element, Float> getColumnVector(Element columnElement) {
		return (Map<Element, Float>) matrix.get(columnElement);
	}

	/**
	 * setter for a column vector of the specified column Element
	 * @param columnElement the column Element
	 * @param columnVector a column vector (Map<Element, Float>)
	 */
	@SuppressWarnings("unchecked")
	public void setColumnVector(Element element,
			LinkedHashMap<Element, Float> columnVector) {
		matrix.put(element,(LinkedHashMap<Element, Float>) columnVector.clone());
	}


	/**
	 * Calculates the dot product for the specified column vectors
	 * @param columnVectorA the 1st column vector
	 * @param columnVerctorB the 2nd column vector
	 * @return the calculated dot product for the specified column vectors
	 */
	public static float calaculateDotProductForColumnVectors(
			LinkedHashMap<Element, Float> columnVectorA,
			LinkedHashMap<Element, Float> columnVerctorB) {
		
		float result = 0f;

		for (Entry<Element, Float> entry : columnVectorA.entrySet()) {
			Element element = entry.getKey();
			float valueA = entry.getValue();

			// valueB = 0 if no value in columVectorA for element exists
			float valueB = 0f;
			if (columnVerctorB.containsKey(element))
				valueB = columnVerctorB.get(element);
			
			result += valueA * valueB;
		}
		return result;
	}


	/**
	 * Counts the number of entries (with values != 0 && != null) of a column vector
	 * @param columnVector a column vector
	 * @return the counted number of entries 
	 */
	public static int numberOfEntries(
			Map<Element, Float> columnVector) {
		int result = 0;
		for (Entry<Element, Float> entry : columnVector.entrySet()) {
			Float value = entry.getValue();
			if (value != null && value != 0.0f)
				result += 1;
		}
		return result;
	}

}
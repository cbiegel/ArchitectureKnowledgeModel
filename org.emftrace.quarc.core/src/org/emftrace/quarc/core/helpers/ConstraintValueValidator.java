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

package org.emftrace.quarc.core.helpers;

import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;


/**
 * Validatator for values of TechnicalProperty
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ConstraintValueValidator {

	/**
	 * validates the specified value matches the possible values of a
	 * TechnicalProperty
	 * 
	 * @param text
	 *            a value to verify
	 * @param property
	 *            a TechnicalProperty
	 * @return null if the specified value is valid, otherwise an error message
	 *         will be returned
	 */
	public static String validateValue(String text,
			TechnicalProperty property) {
		if (property instanceof EnumTechnicalProperty) {
			boolean valid = false;
			for (String possibleValue : ((EnumTechnicalProperty) property)
					.getPossibleValues()) {
				if (possibleValue.equals(text)) {
					valid = true;
					break;
				}
			}
			if (!valid)
				return "please select or enter a valid value from the combobox";

			else
				return null;
		} else if (property instanceof BooleanTechnicalProperty) {

			if (!(text.equals("true") || text.equals("false")))
				return "please select or enter \"true\" or \"false\"";

			else
				return null;
		} else

		if (property instanceof IntegerTechnicalProperty) {
			if (!text.matches("(-|\\+)?[0-9]+"))
				return "please enter an integer";
			else {
				int intValue = 0;
				try {
					intValue = Integer.parseInt(text);
					
				} catch (Exception e) {
					return "please enter a valid integer";
				}
				if (((IntegerTechnicalProperty) property).getMax() != null && ((IntegerTechnicalProperty) property)
						.getMax() != ""
						&& intValue > Integer
								.parseInt(((IntegerTechnicalProperty) property)
										.getMax())) {
					return "the entered value has to be "
							+ ((IntegerTechnicalProperty) property)
									.getMax() + " at most";
				} else if (((IntegerTechnicalProperty) property)
						.getMin() != null && ((IntegerTechnicalProperty) property)
								.getMin() != ""
						&& intValue < Integer
								.parseInt(((IntegerTechnicalProperty) property)
										.getMin())) {
					return "the entered value has to be at least "
							+ ((IntegerTechnicalProperty) property)
									.getMin();

				} else
					return null;
			}

		} else

		if (property instanceof FloatTechnicalProperty) {
			if (!text.matches("(-|\\+)?[0-9]*(\\.[0-9]+)?"))
				return "please enter a real number";
			else {
				float floatValue= 0.0f;
				try {
					floatValue = Float.parseFloat(text);
				} catch (Exception e) {
					return "please enter a real number";
				}
				if (((FloatTechnicalProperty) property).getMax() != null &&((FloatTechnicalProperty) property).getMax() != "" 
						&& floatValue > Float
								.parseFloat(((FloatTechnicalProperty) property)
										.getMax())) {
					return "the entered value has to be "
							+ ((FloatTechnicalProperty) property)
									.getMax() + " at most";
				} else if (((FloatTechnicalProperty) property).getMin() != null &&((FloatTechnicalProperty) property).getMin() != "" 
						&& floatValue < Float
								.parseFloat(((FloatTechnicalProperty) property)
										.getMin())) {
					return "the entered value has to be at least "
							+ ((FloatTechnicalProperty) property)
									.getMin();

				} else
					return null;
			}
		}

		return null;

	}
}

/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tolerance Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types for the tolerance used by the approximatelyEquals operator.
 * <!-- end-model-doc -->
 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getToleranceTypes()
 * @model
 * @generated
 */
public enum ToleranceTypes implements Enumerator {
	/**
	 * The '<em><b>Absolute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE(0, "absolute", "absolute"),

	/**
	 * The '<em><b>Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE(1, "relative", "relative");

	/**
	 * The '<em><b>Absolute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * use the specified tolerance value as an absolute (Float/Integer) value.
	 * (tolerance = value + tolerance value)
	 * <!-- end-model-doc -->
	 * @see #ABSOLUTE
	 * @model name="absolute"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_VALUE = 0;

	/**
	 * The '<em><b>Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * use the specified tolerance value as a relative value (tolerance = value * tolerance value)
	 * <!-- end-model-doc -->
	 * @see #RELATIVE
	 * @model name="relative"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tolerance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ToleranceTypes[] VALUES_ARRAY =
		new ToleranceTypes[] {
			ABSOLUTE,
			RELATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Tolerance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ToleranceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tolerance Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToleranceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToleranceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tolerance Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToleranceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToleranceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tolerance Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToleranceTypes get(int value) {
		switch (value) {
			case ABSOLUTE_VALUE: return ABSOLUTE;
			case RELATIVE_VALUE: return RELATIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ToleranceTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ToleranceTypes

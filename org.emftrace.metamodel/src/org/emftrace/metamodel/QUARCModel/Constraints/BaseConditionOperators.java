/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Base Condition Operators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Operators for BaseConditions.
 * <!-- end-model-doc -->
 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getBaseConditionOperators()
 * @model
 * @generated
 */
public enum BaseConditionOperators implements Enumerator {
	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(0, "equals", "equals"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(1, "greaterThan", "greaterThan"),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(2, "lessThan", "lessThan"),

	/**
	 * The '<em><b>Minimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMAL(3, "minimal", "minimal"),

	/**
	 * The '<em><b>Maximal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMAL(4, "maximal", "maximal"),

	/**
	 * The '<em><b>Matches</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCHES_VALUE
	 * @generated
	 * @ordered
	 */
	MATCHES(5, "matches", "matches"),

	/**
	 * The '<em><b>Equals Ignore Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_IGNORE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS_IGNORE_CASE(6, "equalsIgnoreCase", "equalsIgnoreCase"),

	/**
	 * The '<em><b>Approximately Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATELY_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	APPROXIMATELY_EQUALS(7, "approximatelyEquals", "approximatelyEquals");

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals Operator.
	 * 
	 * Result of a condition will be true if value A equals value B.
	 * Otherwise the result will be false.
	 * 
	 * Allowed for all properies except RegularExpressionProperties.
	 * <!-- end-model-doc -->
	 * @see #EQUALS
	 * @model name="equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 0;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater than Operator.
	 * 
	 * Result of a condition will be true if value A is greater than value B.
	 * 
	 * Otherwise the result will be false.
	 * 
	 * For NumericalProperties only.
	 * <!-- end-model-doc -->
	 * @see #GREATER_THAN
	 * @model name="greaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 1;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less Than Operator.
	 * 
	 * Result of a condition will be true if value A is less than value B.
	 * Otherwise the result will be false.
	 * 
	 * For NumericalProperties only.
	 * <!-- end-model-doc -->
	 * @see #LESS_THAN
	 * @model name="lessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 2;

	/**
	 * The '<em><b>Minimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimal Operator.
	 * 
	 * Result of a condition will be true if value A is at least value B.
	 * Otherwise the result will be false.
	 * 
	 * For NumericalProperties only.
	 * <!-- end-model-doc -->
	 * @see #MINIMAL
	 * @model name="minimal"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMAL_VALUE = 3;

	/**
	 * The '<em><b>Maximal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximal Operator.
	 * 
	 * Result of a condition will be true if value A is maximum value B.
	 * Otherwise the result will be false.
	 * 
	 * For NumericalProperties only.
	 * <!-- end-model-doc -->
	 * @see #MAXIMAL
	 * @model name="maximal"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMAL_VALUE = 4;

	/**
	 * The '<em><b>Matches</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Matching operator.
	 * 
	 * Result of a condition will be true if String A matches the Pattern B.
	 * Otherwise the result will be false.
	 * 
	 * For RegularExpressionTechnicalProperties only.
	 * <!-- end-model-doc -->
	 * @see #MATCHES
	 * @model name="matches"
	 * @generated
	 * @ordered
	 */
	public static final int MATCHES_VALUE = 5;

	/**
	 * The '<em><b>Equals Ignore Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals operator with ignore case. 
	 * 
	 * Result of a condition will be true if String A equals the String B by ignoring case.
	 * Otherwise the result will be false.
	 * 
	 * For StringTechnicalProperties only.
	 * <!-- end-model-doc -->
	 * @see #EQUALS_IGNORE_CASE
	 * @model name="equalsIgnoreCase"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_IGNORE_CASE_VALUE = 6;

	/**
	 * The '<em><b>Approximately Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approximately equals operator. 
	 * 
	 * Result of a condition will be true if value A approximately equals +/- 1% value B.
	 * Otherwise the result will be false.
	 * 
	 * For an approximately equals check a  tolerance of 0.0001 will be used in order to eliminate the inaccuracy of floating point values.
	 * 
	 * For FloatTechnicalProperties only.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #APPROXIMATELY_EQUALS
	 * @model name="approximatelyEquals"
	 * @generated
	 * @ordered
	 */
	public static final int APPROXIMATELY_EQUALS_VALUE = 7;

	/**
	 * An array of all the '<em><b>Base Condition Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BaseConditionOperators[] VALUES_ARRAY =
		new BaseConditionOperators[] {
			EQUALS,
			GREATER_THAN,
			LESS_THAN,
			MINIMAL,
			MAXIMAL,
			MATCHES,
			EQUALS_IGNORE_CASE,
			APPROXIMATELY_EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Base Condition Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BaseConditionOperators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Base Condition Operators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseConditionOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BaseConditionOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Base Condition Operators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseConditionOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BaseConditionOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Base Condition Operators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseConditionOperators get(int value) {
		switch (value) {
			case EQUALS_VALUE: return EQUALS;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case LESS_THAN_VALUE: return LESS_THAN;
			case MINIMAL_VALUE: return MINIMAL;
			case MAXIMAL_VALUE: return MAXIMAL;
			case MATCHES_VALUE: return MATCHES;
			case EQUALS_IGNORE_CASE_VALUE: return EQUALS_IGNORE_CASE;
			case APPROXIMATELY_EQUALS_VALUE: return APPROXIMATELY_EQUALS;
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
	private BaseConditionOperators(int value, String name, String literal) {
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
	
} //BaseConditionOperators

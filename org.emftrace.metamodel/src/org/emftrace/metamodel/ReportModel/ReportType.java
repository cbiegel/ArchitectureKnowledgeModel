/**
 */
package org.emftrace.metamodel.ReportModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Report Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getReportType()
 * @model
 * @generated
 */
public enum ReportType implements Enumerator {
	/**
	 * The '<em><b>Violation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLATION_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLATION(0, "Violation", "Violation"),

	/**
	 * The '<em><b>Bad Smell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_SMELL_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_SMELL(1, "BadSmell", "BadSmell"),

	/**
	 * The '<em><b>Impact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPACT(2, "Impact", "Impact");

	/**
	 * The '<em><b>Violation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Violation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIOLATION
	 * @model name="Violation"
	 * @generated
	 * @ordered
	 */
	public static final int VIOLATION_VALUE = 0;

	/**
	 * The '<em><b>Bad Smell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad Smell</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_SMELL
	 * @model name="BadSmell"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_SMELL_VALUE = 1;

	/**
	 * The '<em><b>Impact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPACT
	 * @model name="Impact"
	 * @generated
	 * @ordered
	 */
	public static final int IMPACT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Report Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReportType[] VALUES_ARRAY =
		new ReportType[] {
			VIOLATION,
			BAD_SMELL,
			IMPACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Report Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReportType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Report Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Report Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Report Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportType get(int value) {
		switch (value) {
			case VIOLATION_VALUE: return VIOLATION;
			case BAD_SMELL_VALUE: return BAD_SMELL;
			case IMPACT_VALUE: return IMPACT;
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
	private ReportType(int value, String name, String literal) {
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
	
} //ReportType

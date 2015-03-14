/**
 */
package org.emftrace.metamodel.RuleModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getActionType()
 * @model
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>Create Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_LINK(0, "CreateLink", "CreateLink"),

	/**
	 * The '<em><b>Report Consistency Violation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_CONSISTENCY_VIOLATION_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_CONSISTENCY_VIOLATION(1, "ReportConsistencyViolation", "ReportConsistencyViolation"),

	/**
	 * The '<em><b>Report Impact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_IMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_IMPACT(2, "ReportImpact", "ReportImpact");

	/**
	 * The '<em><b>Create Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create Link</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_LINK
	 * @model name="CreateLink"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_LINK_VALUE = 0;

	/**
	 * The '<em><b>Report Consistency Violation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Report Consistency Violation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORT_CONSISTENCY_VIOLATION
	 * @model name="ReportConsistencyViolation"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_CONSISTENCY_VIOLATION_VALUE = 1;

	/**
	 * The '<em><b>Report Impact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Report Impact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORT_IMPACT
	 * @model name="ReportImpact"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_IMPACT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
			CREATE_LINK,
			REPORT_CONSISTENCY_VIOLATION,
			REPORT_IMPACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
			case CREATE_LINK_VALUE: return CREATE_LINK;
			case REPORT_CONSISTENCY_VIOLATION_VALUE: return REPORT_CONSISTENCY_VIOLATION;
			case REPORT_IMPACT_VALUE: return REPORT_IMPACT;
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
	private ActionType(int value, String name, String literal) {
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
	
} //ActionType

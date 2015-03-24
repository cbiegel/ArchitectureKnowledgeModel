/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Solution And Feature Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getSolutionAndFeatureRelationType()
 * @model
 * @generated
 */
public enum SolutionAndFeatureRelationType implements Enumerator {
	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(0, "contains", "contains"),

	/**
	 * The '<em><b>Based On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_VALUE
	 * @generated
	 * @ordered
	 */
	BASED_ON(1, "basedOn", "basedOn"),

	/**
	 * The '<em><b>Sub Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_FEATURE(2, "subFeature", "subFeature"),

	/**
	 * The '<em><b>Development Feature Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_FEATURE_ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_FEATURE_ENVIRONMENT(3, "developmentFeatureEnvironment", "developmentFeatureEnvironment"),

	/**
	 * The '<em><b>Using</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USING_VALUE
	 * @generated
	 * @ordered
	 */
	USING(4, "using", "using"),

	/**
	 * The '<em><b>Embodies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBODIES_VALUE
	 * @generated
	 * @ordered
	 */
	EMBODIES(5, "embodies", "embodies"),

	/**
	 * The '<em><b>Integrates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATES_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATES(6, "integrates", "integrates"),

	/**
	 * The '<em><b>Implemented By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTED_BY(7, "implementedBy", "implementedBy");

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>Based On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Based On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASED_ON
	 * @model name="basedOn"
	 * @generated
	 * @ordered
	 */
	public static final int BASED_ON_VALUE = 1;

	/**
	 * The '<em><b>Sub Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sub Feature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUB_FEATURE
	 * @model name="subFeature"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_FEATURE_VALUE = 2;

	/**
	 * The '<em><b>Development Feature Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Development Feature Environment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_FEATURE_ENVIRONMENT
	 * @model name="developmentFeatureEnvironment"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_FEATURE_ENVIRONMENT_VALUE = 3;

	/**
	 * The '<em><b>Using</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Using</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USING
	 * @model name="using"
	 * @generated
	 * @ordered
	 */
	public static final int USING_VALUE = 4;

	/**
	 * The '<em><b>Embodies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Embodies</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMBODIES
	 * @model name="embodies"
	 * @generated
	 * @ordered
	 */
	public static final int EMBODIES_VALUE = 5;

	/**
	 * The '<em><b>Integrates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integrates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRATES
	 * @model name="integrates"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATES_VALUE = 6;

	/**
	 * The '<em><b>Implemented By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implemented By</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED_BY
	 * @model name="implementedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTED_BY_VALUE = 7;

	/**
	 * An array of all the '<em><b>Solution And Feature Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SolutionAndFeatureRelationType[] VALUES_ARRAY =
		new SolutionAndFeatureRelationType[] {
			CONTAINS,
			BASED_ON,
			SUB_FEATURE,
			DEVELOPMENT_FEATURE_ENVIRONMENT,
			USING,
			EMBODIES,
			INTEGRATES,
			IMPLEMENTED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Solution And Feature Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SolutionAndFeatureRelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Solution And Feature Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolutionAndFeatureRelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SolutionAndFeatureRelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Solution And Feature Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolutionAndFeatureRelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SolutionAndFeatureRelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Solution And Feature Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolutionAndFeatureRelationType get(int value) {
		switch (value) {
			case CONTAINS_VALUE: return CONTAINS;
			case BASED_ON_VALUE: return BASED_ON;
			case SUB_FEATURE_VALUE: return SUB_FEATURE;
			case DEVELOPMENT_FEATURE_ENVIRONMENT_VALUE: return DEVELOPMENT_FEATURE_ENVIRONMENT;
			case USING_VALUE: return USING;
			case EMBODIES_VALUE: return EMBODIES;
			case INTEGRATES_VALUE: return INTEGRATES;
			case IMPLEMENTED_BY_VALUE: return IMPLEMENTED_BY;
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
	private SolutionAndFeatureRelationType(int value, String name, String literal) {
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
	
} //SolutionAndFeatureRelationType

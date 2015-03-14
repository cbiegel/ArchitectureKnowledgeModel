/**
 */
package org.emftrace.metamodel.ChangeModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Composite Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getCompositeType()
 * @model
 * @generated
 */
public enum CompositeType implements Enumerator {
	/**
	 * The '<em><b>Move</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(0, "Move", "Move"),

	/**
	 * The '<em><b>Split</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_VALUE
	 * @generated
	 * @ordered
	 */
	SPLIT(1, "Split", "Split"),

	/**
	 * The '<em><b>Merge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE(2, "Merge", "Merge"),

	/**
	 * The '<em><b>Swap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWAP_VALUE
	 * @generated
	 * @ordered
	 */
	SWAP(3, "Swap", "Swap"),

	/**
	 * The '<em><b>Replace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(4, "Replace", "Replace");

	/**
	 * The '<em><b>Move</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Move</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model name="Move"
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 0;

	/**
	 * The '<em><b>Split</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Split</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPLIT
	 * @model name="Split"
	 * @generated
	 * @ordered
	 */
	public static final int SPLIT_VALUE = 1;

	/**
	 * The '<em><b>Merge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Merge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERGE
	 * @model name="Merge"
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_VALUE = 2;

	/**
	 * The '<em><b>Swap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swap</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWAP
	 * @model name="Swap"
	 * @generated
	 * @ordered
	 */
	public static final int SWAP_VALUE = 3;

	/**
	 * The '<em><b>Replace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACE
	 * @model name="Replace"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Composite Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositeType[] VALUES_ARRAY =
		new CompositeType[] {
			MOVE,
			SPLIT,
			MERGE,
			SWAP,
			REPLACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Composite Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composite Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositeType get(int value) {
		switch (value) {
			case MOVE_VALUE: return MOVE;
			case SPLIT_VALUE: return SPLIT;
			case MERGE_VALUE: return MERGE;
			case SWAP_VALUE: return SWAP;
			case REPLACE_VALUE: return REPLACE;
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
	private CompositeType(int value, String name, String literal) {
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
	
} //CompositeType

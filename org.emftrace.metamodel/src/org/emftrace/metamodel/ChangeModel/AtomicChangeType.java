/**
 */
package org.emftrace.metamodel.ChangeModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType()
 * @model
 * @generated
 */
public interface AtomicChangeType extends AbstractChangeType {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.ChangeModel.AtomicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.ChangeModel.AtomicType
	 * @see #setType(AtomicType)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAtomicChangeType_Type()
	 * @model required="true"
	 * @generated
	 */
	AtomicType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AtomicChangeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.ChangeModel.AtomicType
	 * @see #getType()
	 * @generated
	 */
	void setType(AtomicType value);

} // AtomicChangeType

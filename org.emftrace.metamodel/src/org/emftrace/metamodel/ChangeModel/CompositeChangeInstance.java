/**
 */
package org.emftrace.metamodel.ChangeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Change Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.CompositeChangeInstance#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.CompositeChangeInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getCompositeChangeInstance()
 * @model
 * @generated
 */
public interface CompositeChangeInstance extends AbstractChangeInstance {
	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ChangeModel.AbstractChangeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getCompositeChangeInstance_SubTypes()
	 * @model lower="2"
	 * @generated
	 */
	EList<AbstractChangeInstance> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CompositeChangeType)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getCompositeChangeInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	CompositeChangeType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.CompositeChangeInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CompositeChangeType value);

} // CompositeChangeInstance

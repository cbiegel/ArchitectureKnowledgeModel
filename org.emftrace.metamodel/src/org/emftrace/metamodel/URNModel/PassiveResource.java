/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.PassiveResource#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPassiveResource()
 * @model
 * @generated
 */
public interface PassiveResource extends GeneralResource {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPassiveResource_Component()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.PassiveResource#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

} // PassiveResource

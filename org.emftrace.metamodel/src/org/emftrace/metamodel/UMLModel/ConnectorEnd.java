/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining End</em>' attribute.
	 * @see #setDefiningEnd(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectorEnd_DefiningEnd()
	 * @model
	 * @generated
	 */
	String getDefiningEnd();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getDefiningEnd <em>Defining End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining End</em>' attribute.
	 * @see #getDefiningEnd()
	 * @generated
	 */
	void setDefiningEnd(String value);

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port</em>' attribute.
	 * @see #setPartWithPort(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectorEnd_PartWithPort()
	 * @model
	 * @generated
	 */
	String getPartWithPort();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' attribute.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectorEnd_Role()
	 * @model required="true"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ConnectorEnd#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // ConnectorEnd

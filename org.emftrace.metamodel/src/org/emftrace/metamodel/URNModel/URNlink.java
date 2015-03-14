/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UR Nlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.URNlink#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.URNlink#getToElem <em>To Elem</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.URNlink#getFromElem <em>From Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getURNlink()
 * @model
 * @generated
 */
public interface URNlink extends URNmodelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getURNlink_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.URNlink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>To Elem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Elem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Elem</em>' attribute.
	 * @see #setToElem(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getURNlink_ToElem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getToElem();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.URNlink#getToElem <em>To Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Elem</em>' attribute.
	 * @see #getToElem()
	 * @generated
	 */
	void setToElem(String value);

	/**
	 * Returns the value of the '<em><b>From Elem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Elem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Elem</em>' attribute.
	 * @see #setFromElem(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getURNlink_FromElem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getFromElem();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.URNlink#getFromElem <em>From Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Elem</em>' attribute.
	 * @see #getFromElem()
	 * @generated
	 */
	void setFromElem(String value);

} // URNlink

/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.EnumerationType#getValues <em>Values</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.EnumerationType#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends UCMmodelElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEnumerationType_Values()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.EnumerationType#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEnumerationType_Instances()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getInstances();

} // EnumerationType

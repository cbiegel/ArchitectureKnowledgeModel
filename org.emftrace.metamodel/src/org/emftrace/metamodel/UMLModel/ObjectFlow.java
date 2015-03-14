/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ObjectFlow#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ObjectFlow#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getObjectFlow()
 * @model
 * @generated
 */
public interface ObjectFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getObjectFlow_IsMulticast()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMulticast();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ObjectFlow#isIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isIsMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multireceive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getObjectFlow_IsMultireceive()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMultireceive();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' attribute.
	 * @see #setTransformation(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getObjectFlow_Transformation()
	 * @model
	 * @generated
	 */
	String getTransformation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ObjectFlow#getTransformation <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' attribute.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(String value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getObjectFlow_Selection()
	 * @model
	 * @generated
	 */
	String getSelection();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ObjectFlow#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(String value);

} // ObjectFlow

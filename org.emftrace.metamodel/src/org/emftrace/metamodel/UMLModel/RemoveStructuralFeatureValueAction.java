/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.RemoveStructuralFeatureValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getRemoveStructuralFeatureValueAction()
 * @model
 * @generated
 */
public interface RemoveStructuralFeatureValueAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remove Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #setIsRemoveDuplicates(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getRemoveStructuralFeatureValueAction_IsRemoveDuplicates()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRemoveDuplicates();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.RemoveStructuralFeatureValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #isIsRemoveDuplicates()
	 * @generated
	 */
	void setIsRemoveDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getRemoveStructuralFeatureValueAction_RemoveAt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

} // RemoveStructuralFeatureValueAction

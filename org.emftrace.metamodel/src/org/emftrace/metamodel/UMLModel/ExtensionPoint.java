/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExtensionPoint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExtensionPoint()
 * @model
 * @generated
 */
public interface ExtensionPoint extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' attribute.
	 * @see #setUseCase(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExtensionPoint_UseCase()
	 * @model required="true"
	 * @generated
	 */
	String getUseCase();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExtensionPoint#getUseCase <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' attribute.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(String value);

} // ExtensionPoint

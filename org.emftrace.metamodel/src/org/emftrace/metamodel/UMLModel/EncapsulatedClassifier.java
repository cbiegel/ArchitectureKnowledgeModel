/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port</em>' attribute.
	 * @see #setOwnedPort(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model
	 * @generated
	 */
	String getOwnedPort();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Port</em>' attribute.
	 * @see #getOwnedPort()
	 * @generated
	 */
	void setOwnedPort(String value);

} // EncapsulatedClassifier

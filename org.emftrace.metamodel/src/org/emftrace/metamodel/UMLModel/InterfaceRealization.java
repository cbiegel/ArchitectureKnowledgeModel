/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InterfaceRealization#getContract <em>Contract</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InterfaceRealization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInterfaceRealization()
 * @model
 * @generated
 */
public interface InterfaceRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' attribute.
	 * @see #setContract(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInterfaceRealization_Contract()
	 * @model required="true"
	 * @generated
	 */
	String getContract();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.InterfaceRealization#getContract <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' attribute.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(String value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' attribute.
	 * @see #setRealizingClassifier(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInterfaceRealization_RealizingClassifier()
	 * @model required="true"
	 * @generated
	 */
	String getRealizingClassifier();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.InterfaceRealization#getRealizingClassifier <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Classifier</em>' attribute.
	 * @see #getRealizingClassifier()
	 * @generated
	 */
	void setRealizingClassifier(String value);

} // InterfaceRealization

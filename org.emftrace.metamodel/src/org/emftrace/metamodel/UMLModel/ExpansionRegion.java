/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"iterative"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpansionRegion_Mode()
	 * @model default="iterative" required="true" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element</em>' attribute.
	 * @see #setInputElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpansionRegion_InputElement()
	 * @model required="true"
	 * @generated
	 */
	String getInputElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getInputElement <em>Input Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Element</em>' attribute.
	 * @see #getInputElement()
	 * @generated
	 */
	void setInputElement(String value);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Element</em>' attribute.
	 * @see #setOutputElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpansionRegion_OutputElement()
	 * @model
	 * @generated
	 */
	String getOutputElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExpansionRegion#getOutputElement <em>Output Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Element</em>' attribute.
	 * @see #getOutputElement()
	 * @generated
	 */
	void setOutputElement(String value);

} // ExpansionRegion

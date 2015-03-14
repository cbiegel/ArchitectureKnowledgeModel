/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ConnectableElement#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends TypedElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConnectableElement_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ConnectableElement#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

} // ConnectableElement

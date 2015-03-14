/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.UMLBase#getUmlID <em>Uml ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getUMLBase()
 * @model abstract="true"
 * @generated
 */
public interface UMLBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml ID</em>' attribute.
	 * @see #setUmlID(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getUMLBase_UmlID()
	 * @model required="true"
	 * @generated
	 */
	String getUmlID();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.UMLBase#getUmlID <em>Uml ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml ID</em>' attribute.
	 * @see #getUmlID()
	 * @generated
	 */
	void setUmlID(String value);

} // UMLBase

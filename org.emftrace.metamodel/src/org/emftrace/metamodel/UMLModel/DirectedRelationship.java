/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDirectedRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DirectedRelationship#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDirectedRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DirectedRelationship#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // DirectedRelationship

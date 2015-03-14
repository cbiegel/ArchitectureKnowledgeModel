/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Constraint#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' attribute.
	 * @see #setConstrainedElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	String getConstrainedElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Constraint#getConstrainedElement <em>Constrained Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Element</em>' attribute.
	 * @see #getConstrainedElement()
	 * @generated
	 */
	void setConstrainedElement(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConstraint_Specification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Constraint#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getConstraint_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Constraint#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

} // Constraint

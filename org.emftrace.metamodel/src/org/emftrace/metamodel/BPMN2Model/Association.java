/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Association#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Association#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Association#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Artifact {
	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.BPMN2Model.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see org.emftrace.metamodel.BPMN2Model.AssociationDirection
	 * @see #setAssociationDirection(AssociationDirection)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getAssociation_AssociationDirection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Association#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see org.emftrace.metamodel.BPMN2Model.AssociationDirection
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(AssociationDirection value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(BaseElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getAssociation_SourceRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BaseElement getSourceRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Association#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(BaseElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getAssociation_TargetRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BaseElement getTargetRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Association#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(BaseElement value);

} // Association

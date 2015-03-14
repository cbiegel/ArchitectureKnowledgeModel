/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateBinding_Signature()
	 * @model required="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateBinding#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateBinding_ParameterSubstitution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterSubstitution> getParameterSubstitution();

	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Element</em>' attribute.
	 * @see #setBoundElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateBinding_BoundElement()
	 * @model required="true"
	 * @generated
	 */
	String getBoundElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateBinding#getBoundElement <em>Bound Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' attribute.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(String value);

} // TemplateBinding

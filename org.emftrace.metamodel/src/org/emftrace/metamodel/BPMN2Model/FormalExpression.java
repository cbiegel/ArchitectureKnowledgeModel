/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getFormalExpression()
 * @model
 * @generated
 */
public interface FormalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getFormalExpression_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getFormalExpression_Body()
	 * @model required="true" derived="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Evaluates To Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluates To Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates To Type Ref</em>' reference.
	 * @see #setEvaluatesToTypeRef(ItemDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getFormalExpression_EvaluatesToTypeRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ItemDefinition getEvaluatesToTypeRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluates To Type Ref</em>' reference.
	 * @see #getEvaluatesToTypeRef()
	 * @generated
	 */
	void setEvaluatesToTypeRef(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getFormalExpression_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // FormalExpression

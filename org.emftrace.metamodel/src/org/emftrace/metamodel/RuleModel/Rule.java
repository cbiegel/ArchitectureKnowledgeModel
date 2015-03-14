/**
 */
package org.emftrace.metamodel.RuleModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.RuleModel.Rule#getElements <em>Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.Rule#getActions <em>Actions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.Rule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.Rule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.Rule#getRuleID <em>Rule ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends RuleBase {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.RuleModel.ElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementDefinition> getElements();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.RuleModel.ActionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionDefinition> getActions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(LogicCondition)
	 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicCondition getConditions();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.RuleModel.Rule#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(LogicCondition value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.RuleModel.Rule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule ID</em>' attribute.
	 * @see #setRuleID(String)
	 * @see org.emftrace.metamodel.RuleModel.RuleModelPackage#getRule_RuleID()
	 * @model required="true"
	 * @generated
	 */
	String getRuleID();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.RuleModel.Rule#getRuleID <em>Rule ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule ID</em>' attribute.
	 * @see #getRuleID()
	 * @generated
	 */
	void setRuleID(String value);

} // Rule

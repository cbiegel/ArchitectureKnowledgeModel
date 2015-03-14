/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getInitializations <em>Initializations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getParentScenarios <em>Parent Scenarios</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getIncludedScenarios <em>Included Scenarios</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getStartPoints <em>Start Points</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ScenarioDef#getEndPoints <em>End Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef()
 * @model
 * @generated
 */
public interface ScenarioDef extends UCMmodelElement {
	/**
	 * Returns the value of the '<em><b>Initializations</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.Initialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializations</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_Initializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Initialization> getInitializations();

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_Postconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getPostconditions();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Parent Scenarios</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Scenarios</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Scenarios</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_ParentScenarios()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getParentScenarios();

	/**
	 * Returns the value of the '<em><b>Included Scenarios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Scenarios</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Scenarios</em>' attribute.
	 * @see #setIncludedScenarios(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_IncludedScenarios()
	 * @model
	 * @generated
	 */
	String getIncludedScenarios();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getIncludedScenarios <em>Included Scenarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included Scenarios</em>' attribute.
	 * @see #getIncludedScenarios()
	 * @generated
	 */
	void setIncludedScenarios(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_Groups()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	EList<String> getGroups();

	/**
	 * Returns the value of the '<em><b>Start Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Points</em>' attribute.
	 * @see #setStartPoints(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_StartPoints()
	 * @model
	 * @generated
	 */
	String getStartPoints();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getStartPoints <em>Start Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Points</em>' attribute.
	 * @see #getStartPoints()
	 * @generated
	 */
	void setStartPoints(String value);

	/**
	 * Returns the value of the '<em><b>End Points</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Points</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getScenarioDef_EndPoints()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getEndPoints();

} // ScenarioDef

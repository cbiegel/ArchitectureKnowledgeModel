/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicCondition like EMFTrace_Rule.LogicCondition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition#getLogicalConnectiveType <em>Logical Connective Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition#getLogicConditions <em>Logic Conditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition#getBaseConditions <em>Base Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getLogicCondition()
 * @model
 * @generated
 */
public interface LogicCondition extends ConstraintsBase {
	/**
	 * Returns the value of the '<em><b>Logical Connective Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of a logical connective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Connective Type</em>' attribute.
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes
	 * @see #setLogicalConnectiveType(LogicalConnectiveTypes)
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getLogicCondition_LogicalConnectiveType()
	 * @model
	 * @generated
	 */
	LogicalConnectiveTypes getLogicalConnectiveType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition#getLogicalConnectiveType <em>Logical Connective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Connective Type</em>' attribute.
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes
	 * @see #getLogicalConnectiveType()
	 * @generated
	 */
	void setLogicalConnectiveType(LogicalConnectiveTypes value);

	/**
	 * Returns the value of the '<em><b>Logic Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sub LogicConditions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic Conditions</em>' containment reference list.
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getLogicCondition_LogicConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicCondition> getLogicConditions();

	/**
	 * Returns the value of the '<em><b>Base Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sub BaseConditions 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Conditions</em>' containment reference list.
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getLogicCondition_BaseConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseCondition> getBaseConditions();

} // LogicCondition

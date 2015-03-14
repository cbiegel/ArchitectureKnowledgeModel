/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Query;

import org.eclipse.emf.ecore.EFactory;

import org.emftrace.metamodel.QUARCModel.Query.impl.QueryFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.QUARCModel.Query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	QueryFactory eINSTANCE = QueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Query</em>'.
	 * @generated
	 */
	GSSQuery createGSSQuery();

	/**
	 * Returns a new object of class '<em>GSS Query Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Query Containment</em>'.
	 * @generated
	 */
	GSSQueryContainment createGSSQueryContainment();

	/**
	 * Returns a new object of class '<em>Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Set</em>'.
	 * @generated
	 */
	QueryResultSet createQueryResultSet();

	/**
	 * Returns a new object of class '<em>Applicable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Applicable Element</em>'.
	 * @generated
	 */
	ApplicableElement createApplicableElement();

	/**
	 * Returns a new object of class '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating</em>'.
	 * @generated
	 */
	Rating createRating();

	/**
	 * Returns a new object of class '<em>Selected Goals Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Goals Set</em>'.
	 * @generated
	 */
	SelectedGoalsSet createSelectedGoalsSet();

	/**
	 * Returns a new object of class '<em>Assigned Constraints Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Constraints Set</em>'.
	 * @generated
	 */
	AssignedConstraintsSet createAssignedConstraintsSet();

	/**
	 * Returns a new object of class '<em>Prioritized Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritized Element</em>'.
	 * @generated
	 */
	PrioritizedElement createPrioritizedElement();

	/**
	 * Returns a new object of class '<em>Selected Principles Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Principles Set</em>'.
	 * @generated
	 */
	SelectedPrinciplesSet createSelectedPrinciplesSet();

	/**
	 * Returns a new object of class '<em>Prioritized Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritized Decomposition</em>'.
	 * @generated
	 */
	PrioritizedDecomposition createPrioritizedDecomposition();

	/**
	 * Returns a new object of class '<em>Selected Goals Priorities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Goals Priorities</em>'.
	 * @generated
	 */
	SelectedGoalsPriorities createSelectedGoalsPriorities();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPackage getQueryPackage();

	
} //GSSQueryFactory

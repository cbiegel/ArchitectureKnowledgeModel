/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.QUARCModel.Query.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryPackage.GSS_QUERY: return createGSSQuery();
			case QueryPackage.GSS_QUERY_CONTAINMENT: return createGSSQueryContainment();
			case QueryPackage.QUERY_RESULT_SET: return createQueryResultSet();
			case QueryPackage.APPLICABLE_ELEMENT: return createApplicableElement();
			case QueryPackage.RATING: return createRating();
			case QueryPackage.SELECTED_GOALS_SET: return createSelectedGoalsSet();
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET: return createAssignedConstraintsSet();
			case QueryPackage.PRIORITIZED_ELEMENT: return createPrioritizedElement();
			case QueryPackage.SELECTED_PRINCIPLES_SET: return createSelectedPrinciplesSet();
			case QueryPackage.PRIORITIZED_DECOMPOSITION: return createPrioritizedDecomposition();
			case QueryPackage.SELECTED_GOALS_PRIORITIES: return createSelectedGoalsPriorities();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSQuery createGSSQuery() {
		GSSQueryImpl gssQuery = new GSSQueryImpl();
		return gssQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSQueryContainment createGSSQueryContainment() {
		GSSQueryContainmentImpl gssQueryContainment = new GSSQueryContainmentImpl();
		return gssQueryContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResultSet createQueryResultSet() {
		QueryResultSetImpl queryResultSet = new QueryResultSetImpl();
		return queryResultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableElement createApplicableElement() {
		ApplicableElementImpl applicableElement = new ApplicableElementImpl();
		return applicableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rating createRating() {
		RatingImpl rating = new RatingImpl();
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedGoalsSet createSelectedGoalsSet() {
		SelectedGoalsSetImpl selectedGoalsSet = new SelectedGoalsSetImpl();
		return selectedGoalsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedConstraintsSet createAssignedConstraintsSet() {
		AssignedConstraintsSetImpl assignedConstraintsSet = new AssignedConstraintsSetImpl();
		return assignedConstraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritizedElement createPrioritizedElement() {
		PrioritizedElementImpl prioritizedElement = new PrioritizedElementImpl();
		return prioritizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedPrinciplesSet createSelectedPrinciplesSet() {
		SelectedPrinciplesSetImpl selectedPrinciplesSet = new SelectedPrinciplesSetImpl();
		return selectedPrinciplesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritizedDecomposition createPrioritizedDecomposition() {
		PrioritizedDecompositionImpl prioritizedDecomposition = new PrioritizedDecompositionImpl();
		return prioritizedDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedGoalsPriorities createSelectedGoalsPriorities() {
		SelectedGoalsPrioritiesImpl selectedGoalsPriorities = new SelectedGoalsPrioritiesImpl();
		return selectedGoalsPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl

/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.Rating;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.QueryResultSetImpl#getApplicableElements <em>Applicable Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.QueryResultSetImpl#getRatings <em>Ratings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryResultSetImpl extends GSSQueryModelBaseImpl implements QueryResultSet {
	/**
	 * The cached value of the '{@link #getApplicableElements() <em>Applicable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicableElement> applicableElements;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<Rating> ratings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryResultSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicableElement> getApplicableElements() {
		if (applicableElements == null) {
			applicableElements = new EObjectContainmentEList<ApplicableElement>(ApplicableElement.class, this, QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS);
		}
		return applicableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rating> getRatings() {
		if (ratings == null) {
			ratings = new EObjectContainmentEList<Rating>(Rating.class, this, QueryPackage.QUERY_RESULT_SET__RATINGS);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS:
				return ((InternalEList<?>)getApplicableElements()).basicRemove(otherEnd, msgs);
			case QueryPackage.QUERY_RESULT_SET__RATINGS:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS:
				return getApplicableElements();
			case QueryPackage.QUERY_RESULT_SET__RATINGS:
				return getRatings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS:
				getApplicableElements().clear();
				getApplicableElements().addAll((Collection<? extends ApplicableElement>)newValue);
				return;
			case QueryPackage.QUERY_RESULT_SET__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends Rating>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS:
				getApplicableElements().clear();
				return;
			case QueryPackage.QUERY_RESULT_SET__RATINGS:
				getRatings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.QUERY_RESULT_SET__APPLICABLE_ELEMENTS:
				return applicableElements != null && !applicableElements.isEmpty();
			case QueryPackage.QUERY_RESULT_SET__RATINGS:
				return ratings != null && !ratings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryResultSetImpl

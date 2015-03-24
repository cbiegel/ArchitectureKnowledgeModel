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

import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Query Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryContainmentImpl#getGssQueries <em>Gss Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSSQueryContainmentImpl extends GSSQueryModelBaseImpl implements GSSQueryContainment {
	/**
	 * The cached value of the '{@link #getGssQueries() <em>Gss Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSQuery> gssQueries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSQueryContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.GSS_QUERY_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSQuery> getGssQueries() {
		if (gssQueries == null) {
			gssQueries = new EObjectContainmentEList<GSSQuery>(GSSQuery.class, this, QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES);
		}
		return gssQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES:
				return ((InternalEList<?>)getGssQueries()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES:
				return getGssQueries();
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
			case QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES:
				getGssQueries().clear();
				getGssQueries().addAll((Collection<? extends GSSQuery>)newValue);
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
			case QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES:
				getGssQueries().clear();
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
			case QueryPackage.GSS_QUERY_CONTAINMENT__GSS_QUERIES:
				return gssQueries != null && !gssQueries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSQueryContainmentImpl

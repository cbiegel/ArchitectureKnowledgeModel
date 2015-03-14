/**
 */
package org.emftrace.metamodel.LinkModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.LinkModel.LinkModelPackage;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.TraceImpl#getTraceabilityLinks <em>Traceability Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends TraceElementImpl implements Trace {
	/**
	 * The cached value of the '{@link #getTraceabilityLinks() <em>Traceability Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceabilityLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkModelPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceabilityLinks() {
		if (traceabilityLinks == null) {
			traceabilityLinks = new EObjectResolvingEList<TraceLink>(TraceLink.class, this, LinkModelPackage.TRACE__TRACEABILITY_LINKS);
		}
		return traceabilityLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkModelPackage.TRACE__TRACEABILITY_LINKS:
				return getTraceabilityLinks();
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
			case LinkModelPackage.TRACE__TRACEABILITY_LINKS:
				getTraceabilityLinks().clear();
				getTraceabilityLinks().addAll((Collection<? extends TraceLink>)newValue);
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
			case LinkModelPackage.TRACE__TRACEABILITY_LINKS:
				getTraceabilityLinks().clear();
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
			case LinkModelPackage.TRACE__TRACEABILITY_LINKS:
				return traceabilityLinks != null && !traceabilityLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl

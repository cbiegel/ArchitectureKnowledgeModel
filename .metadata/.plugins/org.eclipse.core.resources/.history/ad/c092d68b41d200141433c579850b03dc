/**
 */
package org.emftrace.metamodel.ReportModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.ChangeModel.AbstractChangeType;

import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.ReportModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ReportModel.impl.ImpactReportImpl#getAffectedElements <em>Affected Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.impl.ImpactReportImpl#getImpactSources <em>Impact Sources</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.impl.ImpactReportImpl#getChangeType <em>Change Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImpactReportImpl extends ReportImpl implements ImpactReport {
	/**
	 * The cached value of the '{@link #getAffectedElements() <em>Affected Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> affectedElements;

	/**
	 * The cached value of the '{@link #getImpactSources() <em>Impact Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactSources()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> impactSources;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected AbstractChangeType changeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelPackage.Literals.IMPACT_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAffectedElements() {
		if (affectedElements == null) {
			affectedElements = new EObjectResolvingEList<EObject>(EObject.class, this, ReportModelPackage.IMPACT_REPORT__AFFECTED_ELEMENTS);
		}
		return affectedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getImpactSources() {
		if (impactSources == null) {
			impactSources = new EObjectResolvingEList<EObject>(EObject.class, this, ReportModelPackage.IMPACT_REPORT__IMPACT_SOURCES);
		}
		return impactSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractChangeType getChangeType() {
		if (changeType != null && changeType.eIsProxy()) {
			InternalEObject oldChangeType = (InternalEObject)changeType;
			changeType = (AbstractChangeType)eResolveProxy(oldChangeType);
			if (changeType != oldChangeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE, oldChangeType, changeType));
			}
		}
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractChangeType basicGetChangeType() {
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeType(AbstractChangeType newChangeType) {
		AbstractChangeType oldChangeType = changeType;
		changeType = newChangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE, oldChangeType, changeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportModelPackage.IMPACT_REPORT__AFFECTED_ELEMENTS:
				return getAffectedElements();
			case ReportModelPackage.IMPACT_REPORT__IMPACT_SOURCES:
				return getImpactSources();
			case ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE:
				if (resolve) return getChangeType();
				return basicGetChangeType();
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
			case ReportModelPackage.IMPACT_REPORT__AFFECTED_ELEMENTS:
				getAffectedElements().clear();
				getAffectedElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case ReportModelPackage.IMPACT_REPORT__IMPACT_SOURCES:
				getImpactSources().clear();
				getImpactSources().addAll((Collection<? extends EObject>)newValue);
				return;
			case ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE:
				setChangeType((AbstractChangeType)newValue);
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
			case ReportModelPackage.IMPACT_REPORT__AFFECTED_ELEMENTS:
				getAffectedElements().clear();
				return;
			case ReportModelPackage.IMPACT_REPORT__IMPACT_SOURCES:
				getImpactSources().clear();
				return;
			case ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE:
				setChangeType((AbstractChangeType)null);
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
			case ReportModelPackage.IMPACT_REPORT__AFFECTED_ELEMENTS:
				return affectedElements != null && !affectedElements.isEmpty();
			case ReportModelPackage.IMPACT_REPORT__IMPACT_SOURCES:
				return impactSources != null && !impactSources.isEmpty();
			case ReportModelPackage.IMPACT_REPORT__CHANGE_TYPE:
				return changeType != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpactReportImpl

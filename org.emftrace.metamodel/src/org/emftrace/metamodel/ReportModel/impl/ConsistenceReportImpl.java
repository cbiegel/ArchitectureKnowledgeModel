/**
 */
package org.emftrace.metamodel.ReportModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ReportModelPackage;
import org.emftrace.metamodel.ReportModel.ViolationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consistence Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ReportModel.impl.ConsistenceReportImpl#getTypeOfViolation <em>Type Of Violation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.impl.ConsistenceReportImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsistenceReportImpl extends ReportImpl implements ConsistenceReport {
	/**
	 * The cached value of the '{@link #getTypeOfViolation() <em>Type Of Violation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfViolation()
	 * @generated
	 * @ordered
	 */
	protected ViolationType typeOfViolation;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsistenceReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelPackage.Literals.CONSISTENCE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationType getTypeOfViolation() {
		if (typeOfViolation != null && typeOfViolation.eIsProxy()) {
			InternalEObject oldTypeOfViolation = (InternalEObject)typeOfViolation;
			typeOfViolation = (ViolationType)eResolveProxy(oldTypeOfViolation);
			if (typeOfViolation != oldTypeOfViolation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION, oldTypeOfViolation, typeOfViolation));
			}
		}
		return typeOfViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationType basicGetTypeOfViolation() {
		return typeOfViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfViolation(ViolationType newTypeOfViolation) {
		ViolationType oldTypeOfViolation = typeOfViolation;
		typeOfViolation = newTypeOfViolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION, oldTypeOfViolation, typeOfViolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelPackage.CONSISTENCE_REPORT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelPackage.CONSISTENCE_REPORT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION:
				if (resolve) return getTypeOfViolation();
				return basicGetTypeOfViolation();
			case ReportModelPackage.CONSISTENCE_REPORT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION:
				setTypeOfViolation((ViolationType)newValue);
				return;
			case ReportModelPackage.CONSISTENCE_REPORT__ELEMENT:
				setElement((EObject)newValue);
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
			case ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION:
				setTypeOfViolation((ViolationType)null);
				return;
			case ReportModelPackage.CONSISTENCE_REPORT__ELEMENT:
				setElement((EObject)null);
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
			case ReportModelPackage.CONSISTENCE_REPORT__TYPE_OF_VIOLATION:
				return typeOfViolation != null;
			case ReportModelPackage.CONSISTENCE_REPORT__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsistenceReportImpl

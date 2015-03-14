/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.OccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OccurrenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OccurrenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OccurrenceSpecificationImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurrenceSpecificationImpl extends InteractionFragmentImpl implements OccurrenceSpecification {
	/**
	 * The default value of the '{@link #getToBefore() <em>To Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBefore() <em>To Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected String toBefore = TO_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAfter() <em>To After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToAfter() <em>To After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected String toAfter = TO_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getOccurrenceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToBefore() {
		return toBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBefore(String newToBefore) {
		String oldToBefore = toBefore;
		toBefore = newToBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, oldToBefore, toBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToAfter() {
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAfter(String newToAfter) {
		String oldToAfter = toAfter;
		toAfter = newToAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, oldToAfter, toAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OCCURRENCE_SPECIFICATION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return getToBefore();
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return getToAfter();
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__EVENT:
				return getEvent();
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
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				setToBefore((String)newValue);
				return;
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				setToAfter((String)newValue);
				return;
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__EVENT:
				setEvent((String)newValue);
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
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				setToBefore(TO_BEFORE_EDEFAULT);
				return;
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				setToAfter(TO_AFTER_EDEFAULT);
				return;
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__EVENT:
				setEvent(EVENT_EDEFAULT);
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
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return TO_BEFORE_EDEFAULT == null ? toBefore != null : !TO_BEFORE_EDEFAULT.equals(toBefore);
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return TO_AFTER_EDEFAULT == null ? toAfter != null : !TO_AFTER_EDEFAULT.equals(toAfter);
			case UMLModelPackage.OCCURRENCE_SPECIFICATION__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (toBefore: ");
		result.append(toBefore);
		result.append(", toAfter: ");
		result.append(toAfter);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //OccurrenceSpecificationImpl

/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.Behavior;
import org.emftrace.metamodel.UMLModel.BehavioredClassifier;
import org.emftrace.metamodel.UMLModel.InterfaceRealization;
import org.emftrace.metamodel.UMLModel.Trigger;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioredClassifierImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioredClassifierImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioredClassifierImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioredClassifierImpl extends ClassifierImpl implements BehavioredClassifier {
	/**
	 * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehavior;

	/**
	 * The default value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected String classifierBehavior = CLASSIFIER_BEHAVIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceRealization() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealization;

	/**
	 * The cached value of the '{@link #getOwnedTrigger() <em>Owned Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> ownedTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getBehavioredClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(String newClassifierBehavior) {
		String oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealization() {
		if (interfaceRealization == null) {
			interfaceRealization = new EObjectContainmentEList<InterfaceRealization>(InterfaceRealization.class, this, UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
		}
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getOwnedTrigger() {
		if (ownedTrigger == null) {
			ownedTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		}
		return ownedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				return getInterfaceRealization();
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return getOwnedTrigger();
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
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((String)newValue);
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				getOwnedTrigger().addAll((Collection<? extends Trigger>)newValue);
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
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior(CLASSIFIER_BEHAVIOR_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
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
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return CLASSIFIER_BEHAVIOR_EDEFAULT == null ? classifierBehavior != null : !CLASSIFIER_BEHAVIOR_EDEFAULT.equals(classifierBehavior);
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				return interfaceRealization != null && !interfaceRealization.isEmpty();
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
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
		result.append(" (classifierBehavior: ");
		result.append(classifierBehavior);
		result.append(')');
		return result.toString();
	}

} //BehavioredClassifierImpl

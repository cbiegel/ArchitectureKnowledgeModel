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

import org.emftrace.metamodel.UMLModel.Action;
import org.emftrace.metamodel.UMLModel.Gate;
import org.emftrace.metamodel.UMLModel.InteractionUse;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionUseImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionUseImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
	/**
	 * The default value of the '{@link #getRefersTo() <em>Refers To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERS_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected String refersTo = REFERS_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGate;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInteractionUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(String newRefersTo) {
		String oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate() {
		if (actualGate == null) {
			actualGate = new EObjectContainmentEList<Gate>(Gate.class, this, UMLModelPackage.INTERACTION_USE__ACTUAL_GATE);
		}
		return actualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Action>(Action.class, this, UMLModelPackage.INTERACTION_USE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
				return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.INTERACTION_USE__REFERS_TO:
				return getRefersTo();
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
				return getActualGate();
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
				return getArgument();
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
			case UMLModelPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				getActualGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Action>)newValue);
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
			case UMLModelPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo(REFERS_TO_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				return;
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
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
			case UMLModelPackage.INTERACTION_USE__REFERS_TO:
				return REFERS_TO_EDEFAULT == null ? refersTo != null : !REFERS_TO_EDEFAULT.equals(refersTo);
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
				return actualGate != null && !actualGate.isEmpty();
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
				return argument != null && !argument.isEmpty();
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
		result.append(" (refersTo: ");
		result.append(refersTo);
		result.append(')');
		return result.toString();
	}

} //InteractionUseImpl

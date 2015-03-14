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

import org.emftrace.metamodel.UMLModel.GeneralOrdering;
import org.emftrace.metamodel.UMLModel.InteractionConstraint;
import org.emftrace.metamodel.UMLModel.InteractionFragment;
import org.emftrace.metamodel.UMLModel.InteractionOperand;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionOperandImpl#getFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl extends NamespaceImpl implements InteractionOperand {
	/**
	 * The default value of the '{@link #getCovered() <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected static final String COVERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected String covered = COVERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrdering;

	/**
	 * The default value of the '{@link #getEnclosingInteraction() <em>Enclosing Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCLOSING_INTERACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnclosingInteraction() <em>Enclosing Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingInteraction()
	 * @generated
	 * @ordered
	 */
	protected String enclosingInteraction = ENCLOSING_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnclosingOperand() <em>Enclosing Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingOperand()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCLOSING_OPERAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnclosingOperand() <em>Enclosing Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingOperand()
	 * @generated
	 * @ordered
	 */
	protected String enclosingOperand = ENCLOSING_OPERAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected InteractionConstraint guard;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInteractionOperand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCovered() {
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovered(String newCovered) {
		String oldCovered = covered;
		covered = newCovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_OPERAND__COVERED, oldCovered, covered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnclosingInteraction() {
		return enclosingInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(String newEnclosingInteraction) {
		String oldEnclosingInteraction = enclosingInteraction;
		enclosingInteraction = newEnclosingInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnclosingOperand() {
		return enclosingOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(String newEnclosingOperand) {
		String oldEnclosingOperand = enclosingOperand;
		enclosingOperand = newEnclosingOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(InteractionConstraint newGuard, NotificationChain msgs) {
		InteractionConstraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_OPERAND__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(InteractionConstraint newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_OPERAND__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, UMLModelPackage.INTERACTION_OPERAND__FRAGMENT);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION_OPERAND__GUARD:
				return basicSetGuard(null, msgs);
			case UMLModelPackage.INTERACTION_OPERAND__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.INTERACTION_OPERAND__COVERED:
				return getCovered();
			case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UMLModelPackage.INTERACTION_OPERAND__GUARD:
				return getGuard();
			case UMLModelPackage.INTERACTION_OPERAND__FRAGMENT:
				return getFragment();
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
			case UMLModelPackage.INTERACTION_OPERAND__COVERED:
				setCovered((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)newValue);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
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
			case UMLModelPackage.INTERACTION_OPERAND__COVERED:
				setCovered(COVERED_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction(ENCLOSING_INTERACTION_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand(ENCLOSING_OPERAND_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)null);
				return;
			case UMLModelPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
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
			case UMLModelPackage.INTERACTION_OPERAND__COVERED:
				return COVERED_EDEFAULT == null ? covered != null : !COVERED_EDEFAULT.equals(covered);
			case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return ENCLOSING_INTERACTION_EDEFAULT == null ? enclosingInteraction != null : !ENCLOSING_INTERACTION_EDEFAULT.equals(enclosingInteraction);
			case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return ENCLOSING_OPERAND_EDEFAULT == null ? enclosingOperand != null : !ENCLOSING_OPERAND_EDEFAULT.equals(enclosingOperand);
			case UMLModelPackage.INTERACTION_OPERAND__GUARD:
				return guard != null;
			case UMLModelPackage.INTERACTION_OPERAND__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.INTERACTION_OPERAND__COVERED: return UMLModelPackage.INTERACTION_FRAGMENT__COVERED;
				case UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING: return UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION: return UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND: return UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.INTERACTION_FRAGMENT__COVERED: return UMLModelPackage.INTERACTION_OPERAND__COVERED;
				case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UMLModelPackage.INTERACTION_OPERAND__GENERAL_ORDERING;
				case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
				case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UMLModelPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (covered: ");
		result.append(covered);
		result.append(", enclosingInteraction: ");
		result.append(enclosingInteraction);
		result.append(", enclosingOperand: ");
		result.append(enclosingOperand);
		result.append(')');
		return result.toString();
	}

} //InteractionOperandImpl

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
import org.emftrace.metamodel.UMLModel.GeneralOrdering;
import org.emftrace.metamodel.UMLModel.Interaction;
import org.emftrace.metamodel.UMLModel.InteractionFragment;
import org.emftrace.metamodel.UMLModel.Lifeline;
import org.emftrace.metamodel.UMLModel.Message;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
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
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifeline;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getFormalGate() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> formalGate;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInteraction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION__COVERED, oldCovered, covered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UMLModelPackage.INTERACTION__GENERAL_ORDERING);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifeline() {
		if (lifeline == null) {
			lifeline = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, UMLModelPackage.INTERACTION__LIFELINE);
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, UMLModelPackage.INTERACTION__FRAGMENT);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, UMLModelPackage.INTERACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGate() {
		if (formalGate == null) {
			formalGate = new EObjectContainmentEList<Gate>(Gate.class, this, UMLModelPackage.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, UMLModelPackage.INTERACTION__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION__LIFELINE:
				return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
				return ((InternalEList<?>)getFormalGate()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.INTERACTION__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.INTERACTION__COVERED:
				return getCovered();
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UMLModelPackage.INTERACTION__LIFELINE:
				return getLifeline();
			case UMLModelPackage.INTERACTION__FRAGMENT:
				return getFragment();
			case UMLModelPackage.INTERACTION__ACTION:
				return getAction();
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
				return getFormalGate();
			case UMLModelPackage.INTERACTION__MESSAGE:
				return getMessage();
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
			case UMLModelPackage.INTERACTION__COVERED:
				setCovered((String)newValue);
				return;
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((String)newValue);
				return;
			case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((String)newValue);
				return;
			case UMLModelPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				getLifeline().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case UMLModelPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case UMLModelPackage.INTERACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				getFormalGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UMLModelPackage.INTERACTION__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
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
			case UMLModelPackage.INTERACTION__COVERED:
				setCovered(COVERED_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction(ENCLOSING_INTERACTION_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand(ENCLOSING_OPERAND_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				return;
			case UMLModelPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				return;
			case UMLModelPackage.INTERACTION__ACTION:
				getAction().clear();
				return;
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				return;
			case UMLModelPackage.INTERACTION__MESSAGE:
				getMessage().clear();
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
			case UMLModelPackage.INTERACTION__COVERED:
				return COVERED_EDEFAULT == null ? covered != null : !COVERED_EDEFAULT.equals(covered);
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION:
				return ENCLOSING_INTERACTION_EDEFAULT == null ? enclosingInteraction != null : !ENCLOSING_INTERACTION_EDEFAULT.equals(enclosingInteraction);
			case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND:
				return ENCLOSING_OPERAND_EDEFAULT == null ? enclosingOperand != null : !ENCLOSING_OPERAND_EDEFAULT.equals(enclosingOperand);
			case UMLModelPackage.INTERACTION__LIFELINE:
				return lifeline != null && !lifeline.isEmpty();
			case UMLModelPackage.INTERACTION__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case UMLModelPackage.INTERACTION__ACTION:
				return action != null && !action.isEmpty();
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
				return formalGate != null && !formalGate.isEmpty();
			case UMLModelPackage.INTERACTION__MESSAGE:
				return message != null && !message.isEmpty();
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
				case UMLModelPackage.INTERACTION__COVERED: return UMLModelPackage.INTERACTION_FRAGMENT__COVERED;
				case UMLModelPackage.INTERACTION__GENERAL_ORDERING: return UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION: return UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND: return UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
				case UMLModelPackage.INTERACTION_FRAGMENT__COVERED: return UMLModelPackage.INTERACTION__COVERED;
				case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UMLModelPackage.INTERACTION__GENERAL_ORDERING;
				case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION;
				case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UMLModelPackage.INTERACTION__ENCLOSING_OPERAND;
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

} //InteractionImpl

/**
 */
package org.emftrace.metamodel.LinkModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.LinkModel.DesignAlternatives;
import org.emftrace.metamodel.LinkModel.DesignDecision;
import org.emftrace.metamodel.LinkModel.LinkModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.DesignDecisionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.DesignDecisionImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.DesignDecisionImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignDecisionImpl extends LinkBaseImpl implements DesignDecision {
	/**
	 * The default value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected String choice = CHOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignAlternatives> alternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkModelPackage.Literals.DESIGN_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(String newChoice) {
		String oldChoice = choice;
		choice = newChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.DESIGN_DECISION__CHOICE, oldChoice, choice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.DESIGN_DECISION__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignAlternatives> getAlternatives() {
		if (alternatives == null) {
			alternatives = new EObjectContainmentEList<DesignAlternatives>(DesignAlternatives.class, this, LinkModelPackage.DESIGN_DECISION__ALTERNATIVES);
		}
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinkModelPackage.DESIGN_DECISION__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
			case LinkModelPackage.DESIGN_DECISION__CHOICE:
				return getChoice();
			case LinkModelPackage.DESIGN_DECISION__GOAL:
				return getGoal();
			case LinkModelPackage.DESIGN_DECISION__ALTERNATIVES:
				return getAlternatives();
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
			case LinkModelPackage.DESIGN_DECISION__CHOICE:
				setChoice((String)newValue);
				return;
			case LinkModelPackage.DESIGN_DECISION__GOAL:
				setGoal((String)newValue);
				return;
			case LinkModelPackage.DESIGN_DECISION__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends DesignAlternatives>)newValue);
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
			case LinkModelPackage.DESIGN_DECISION__CHOICE:
				setChoice(CHOICE_EDEFAULT);
				return;
			case LinkModelPackage.DESIGN_DECISION__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case LinkModelPackage.DESIGN_DECISION__ALTERNATIVES:
				getAlternatives().clear();
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
			case LinkModelPackage.DESIGN_DECISION__CHOICE:
				return CHOICE_EDEFAULT == null ? choice != null : !CHOICE_EDEFAULT.equals(choice);
			case LinkModelPackage.DESIGN_DECISION__GOAL:
				return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
			case LinkModelPackage.DESIGN_DECISION__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
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
		result.append(" (Choice: ");
		result.append(choice);
		result.append(", Goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}

} //DesignDecisionImpl

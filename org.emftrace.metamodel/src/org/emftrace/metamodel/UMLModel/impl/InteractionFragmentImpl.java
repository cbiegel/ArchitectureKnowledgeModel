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
import org.emftrace.metamodel.UMLModel.InteractionFragment;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionFragmentImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionFragmentImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInteractionFragment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_FRAGMENT__COVERED, oldCovered, covered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.INTERACTION_FRAGMENT__COVERED:
				return getCovered();
			case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrdering();
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand();
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
			case UMLModelPackage.INTERACTION_FRAGMENT__COVERED:
				setCovered((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((String)newValue);
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((String)newValue);
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
			case UMLModelPackage.INTERACTION_FRAGMENT__COVERED:
				setCovered(COVERED_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction(ENCLOSING_INTERACTION_EDEFAULT);
				return;
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand(ENCLOSING_OPERAND_EDEFAULT);
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
			case UMLModelPackage.INTERACTION_FRAGMENT__COVERED:
				return COVERED_EDEFAULT == null ? covered != null : !COVERED_EDEFAULT.equals(covered);
			case UMLModelPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return ENCLOSING_INTERACTION_EDEFAULT == null ? enclosingInteraction != null : !ENCLOSING_INTERACTION_EDEFAULT.equals(enclosingInteraction);
			case UMLModelPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return ENCLOSING_OPERAND_EDEFAULT == null ? enclosingOperand != null : !ENCLOSING_OPERAND_EDEFAULT.equals(enclosingOperand);
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
		result.append(" (covered: ");
		result.append(covered);
		result.append(", enclosingInteraction: ");
		result.append(enclosingInteraction);
		result.append(", enclosingOperand: ");
		result.append(enclosingOperand);
		result.append(')');
		return result.toString();
	}

} //InteractionFragmentImpl

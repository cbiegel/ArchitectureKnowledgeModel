/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ProtocolTransition;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ProtocolTransitionImpl#getReferred <em>Referred</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition {
	/**
	 * The default value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected String postCondition = POST_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferred() <em>Referred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferred()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferred() <em>Referred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferred()
	 * @generated
	 * @ordered
	 */
	protected String referred = REFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected String preCondition = PRE_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getProtocolTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(String newPostCondition) {
		String oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferred() {
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferred(String newReferred) {
		String oldReferred = referred;
		referred = newReferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PROTOCOL_TRANSITION__REFERRED, oldReferred, referred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(String newPreCondition) {
		String oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return getPostCondition();
			case UMLModelPackage.PROTOCOL_TRANSITION__REFERRED:
				return getReferred();
			case UMLModelPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return getPreCondition();
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
			case UMLModelPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((String)newValue);
				return;
			case UMLModelPackage.PROTOCOL_TRANSITION__REFERRED:
				setReferred((String)newValue);
				return;
			case UMLModelPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((String)newValue);
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
			case UMLModelPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition(POST_CONDITION_EDEFAULT);
				return;
			case UMLModelPackage.PROTOCOL_TRANSITION__REFERRED:
				setReferred(REFERRED_EDEFAULT);
				return;
			case UMLModelPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition(PRE_CONDITION_EDEFAULT);
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
			case UMLModelPackage.PROTOCOL_TRANSITION__POST_CONDITION:
				return POST_CONDITION_EDEFAULT == null ? postCondition != null : !POST_CONDITION_EDEFAULT.equals(postCondition);
			case UMLModelPackage.PROTOCOL_TRANSITION__REFERRED:
				return REFERRED_EDEFAULT == null ? referred != null : !REFERRED_EDEFAULT.equals(referred);
			case UMLModelPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? preCondition != null : !PRE_CONDITION_EDEFAULT.equals(preCondition);
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
		result.append(" (postCondition: ");
		result.append(postCondition);
		result.append(", referred: ");
		result.append(referred);
		result.append(", preCondition: ");
		result.append(preCondition);
		result.append(')');
		return result.toString();
	}

} //ProtocolTransitionImpl

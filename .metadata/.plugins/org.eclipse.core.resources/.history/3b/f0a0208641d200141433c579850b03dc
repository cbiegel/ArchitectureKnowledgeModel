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

import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.ReplyAction;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReplyActionImpl#getReplyValue <em>Reply Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl extends ActionImpl implements ReplyAction {
	/**
	 * The default value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLY_TO_CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected String replyToCall = REPLY_TO_CALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected InputPin returnInformation;

	/**
	 * The cached value of the '{@link #getReplyValue() <em>Reply Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValue()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> replyValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getReplyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplyToCall() {
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(String newReplyToCall) {
		String oldReplyToCall = replyToCall;
		replyToCall = newReplyToCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnInformation(InputPin newReturnInformation, NotificationChain msgs) {
		InputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, newReturnInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(InputPin newReturnInformation) {
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject)returnInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION, null, msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject)newReturnInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION, null, msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION, newReturnInformation, newReturnInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReplyValue() {
		if (replyValue == null) {
			replyValue = new EObjectContainmentEList<InputPin>(InputPin.class, this, UMLModelPackage.REPLY_ACTION__REPLY_VALUE);
		}
		return replyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION:
				return basicSetReturnInformation(null, msgs);
			case UMLModelPackage.REPLY_ACTION__REPLY_VALUE:
				return ((InternalEList<?>)getReplyValue()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.REPLY_ACTION__REPLY_TO_CALL:
				return getReplyToCall();
			case UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION:
				return getReturnInformation();
			case UMLModelPackage.REPLY_ACTION__REPLY_VALUE:
				return getReplyValue();
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
			case UMLModelPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((String)newValue);
				return;
			case UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)newValue);
				return;
			case UMLModelPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				getReplyValue().addAll((Collection<? extends InputPin>)newValue);
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
			case UMLModelPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall(REPLY_TO_CALL_EDEFAULT);
				return;
			case UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)null);
				return;
			case UMLModelPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
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
			case UMLModelPackage.REPLY_ACTION__REPLY_TO_CALL:
				return REPLY_TO_CALL_EDEFAULT == null ? replyToCall != null : !REPLY_TO_CALL_EDEFAULT.equals(replyToCall);
			case UMLModelPackage.REPLY_ACTION__RETURN_INFORMATION:
				return returnInformation != null;
			case UMLModelPackage.REPLY_ACTION__REPLY_VALUE:
				return replyValue != null && !replyValue.isEmpty();
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
		result.append(" (replyToCall: ");
		result.append(replyToCall);
		result.append(')');
		return result.toString();
	}

} //ReplyActionImpl

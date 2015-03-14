/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ExceptionHandler;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExceptionHandlerImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExceptionHandlerImpl#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends ElementImpl implements ExceptionHandler {
	/**
	 * The default value of the '{@link #getHandlerBody() <em>Handler Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerBody() <em>Handler Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody()
	 * @generated
	 * @ordered
	 */
	protected String handlerBody = HANDLER_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionInput() <em>Exception Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionInput() <em>Exception Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput()
	 * @generated
	 * @ordered
	 */
	protected String exceptionInput = EXCEPTION_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected String exceptionType = EXCEPTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectedNode() <em>Protected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedNode()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTED_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectedNode() <em>Protected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedNode()
	 * @generated
	 * @ordered
	 */
	protected String protectedNode = PROTECTED_NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getExceptionHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerBody() {
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerBody(String newHandlerBody) {
		String oldHandlerBody = handlerBody;
		handlerBody = newHandlerBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionInput() {
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionInput(String newExceptionInput) {
		String oldExceptionInput = exceptionInput;
		exceptionInput = newExceptionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(String newExceptionType) {
		String oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE, oldExceptionType, exceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtectedNode() {
		return protectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedNode(String newProtectedNode) {
		String oldProtectedNode = protectedNode;
		protectedNode = newProtectedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXCEPTION_HANDLER__PROTECTED_NODE, oldProtectedNode, protectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return getHandlerBody();
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return getExceptionInput();
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return getExceptionType();
			case UMLModelPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode();
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
			case UMLModelPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody((String)newValue);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput((String)newValue);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				setExceptionType((String)newValue);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode((String)newValue);
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
			case UMLModelPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody(HANDLER_BODY_EDEFAULT);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput(EXCEPTION_INPUT_EDEFAULT);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				setExceptionType(EXCEPTION_TYPE_EDEFAULT);
				return;
			case UMLModelPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode(PROTECTED_NODE_EDEFAULT);
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
			case UMLModelPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return HANDLER_BODY_EDEFAULT == null ? handlerBody != null : !HANDLER_BODY_EDEFAULT.equals(handlerBody);
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return EXCEPTION_INPUT_EDEFAULT == null ? exceptionInput != null : !EXCEPTION_INPUT_EDEFAULT.equals(exceptionInput);
			case UMLModelPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return EXCEPTION_TYPE_EDEFAULT == null ? exceptionType != null : !EXCEPTION_TYPE_EDEFAULT.equals(exceptionType);
			case UMLModelPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return PROTECTED_NODE_EDEFAULT == null ? protectedNode != null : !PROTECTED_NODE_EDEFAULT.equals(protectedNode);
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
		result.append(" (handlerBody: ");
		result.append(handlerBody);
		result.append(", exceptionInput: ");
		result.append(exceptionInput);
		result.append(", exceptionType: ");
		result.append(exceptionType);
		result.append(", protectedNode: ");
		result.append(protectedNode);
		result.append(')');
		return result.toString();
	}

} //ExceptionHandlerImpl

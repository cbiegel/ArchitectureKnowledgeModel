/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.Port;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#isIsService <em>Is Service</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
	/**
	 * The default value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected boolean isService = IS_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected String required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort()
	 * @generated
	 * @ordered
	 */
	protected String redefinedPort = REDEFINED_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected String provided = PROVIDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBehavior() {
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsService() {
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(String newRequired) {
		String oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedPort() {
		return redefinedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedPort(String newRedefinedPort) {
		String oldRedefinedPort = redefinedPort;
		redefinedPort = newRedefinedPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__REDEFINED_PORT, oldRedefinedPort, redefinedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(String newProvided) {
		String oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.PORT__IS_BEHAVIOR:
				return isIsBehavior();
			case UMLModelPackage.PORT__IS_SERVICE:
				return isIsService();
			case UMLModelPackage.PORT__REQUIRED:
				return getRequired();
			case UMLModelPackage.PORT__REDEFINED_PORT:
				return getRedefinedPort();
			case UMLModelPackage.PORT__PROVIDED:
				return getProvided();
			case UMLModelPackage.PORT__PROTOCOL:
				return getProtocol();
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
			case UMLModelPackage.PORT__IS_BEHAVIOR:
				setIsBehavior((Boolean)newValue);
				return;
			case UMLModelPackage.PORT__IS_SERVICE:
				setIsService((Boolean)newValue);
				return;
			case UMLModelPackage.PORT__REQUIRED:
				setRequired((String)newValue);
				return;
			case UMLModelPackage.PORT__REDEFINED_PORT:
				setRedefinedPort((String)newValue);
				return;
			case UMLModelPackage.PORT__PROVIDED:
				setProvided((String)newValue);
				return;
			case UMLModelPackage.PORT__PROTOCOL:
				setProtocol((String)newValue);
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
			case UMLModelPackage.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UMLModelPackage.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UMLModelPackage.PORT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case UMLModelPackage.PORT__REDEFINED_PORT:
				setRedefinedPort(REDEFINED_PORT_EDEFAULT);
				return;
			case UMLModelPackage.PORT__PROVIDED:
				setProvided(PROVIDED_EDEFAULT);
				return;
			case UMLModelPackage.PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case UMLModelPackage.PORT__IS_BEHAVIOR:
				return isBehavior != IS_BEHAVIOR_EDEFAULT;
			case UMLModelPackage.PORT__IS_SERVICE:
				return isService != IS_SERVICE_EDEFAULT;
			case UMLModelPackage.PORT__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case UMLModelPackage.PORT__REDEFINED_PORT:
				return REDEFINED_PORT_EDEFAULT == null ? redefinedPort != null : !REDEFINED_PORT_EDEFAULT.equals(redefinedPort);
			case UMLModelPackage.PORT__PROVIDED:
				return PROVIDED_EDEFAULT == null ? provided != null : !PROVIDED_EDEFAULT.equals(provided);
			case UMLModelPackage.PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
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
		result.append(" (isBehavior: ");
		result.append(isBehavior);
		result.append(", isService: ");
		result.append(isService);
		result.append(", required: ");
		result.append(required);
		result.append(", redefinedPort: ");
		result.append(redefinedPort);
		result.append(", provided: ");
		result.append(provided);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //PortImpl

/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.CallableElement;
import org.emftrace.metamodel.BPMN2Model.InputOutputBinding;
import org.emftrace.metamodel.BPMN2Model.InputOutputSpecification;
import org.emftrace.metamodel.BPMN2Model.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallableElementImpl extends RootElementImpl implements CallableElement {
	/**
	 * The cached value of the '{@link #getSupportedInterfaceRefs() <em>Supported Interface Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInterfaceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> supportedInterfaceRefs;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected InputOutputSpecification ioSpecification;

	/**
	 * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOutputBinding> ioBinding;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getCallableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getSupportedInterfaceRefs() {
		if (supportedInterfaceRefs == null) {
			supportedInterfaceRefs = new EObjectResolvingEList<Interface>(Interface.class, this, BPMN2ModelPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS);
		}
		return supportedInterfaceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
		InputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION, oldIoSpecification, newIoSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		if (newIoSpecification != ioSpecification) {
			NotificationChain msgs = null;
			if (ioSpecification != null)
				msgs = ((InternalEObject)ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs);
			if (newIoSpecification != null)
				msgs = ((InternalEObject)newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs);
			msgs = basicSetIoSpecification(newIoSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputOutputBinding> getIoBinding() {
		if (ioBinding == null) {
			ioBinding = new EObjectContainmentEList<InputOutputBinding>(InputOutputBinding.class, this, BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING);
		}
		return ioBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CALLABLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING:
				return ((InternalEList<?>)getIoBinding()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				return getSupportedInterfaceRefs();
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				return getIoSpecification();
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING:
				return getIoBinding();
			case BPMN2ModelPackage.CALLABLE_ELEMENT__NAME:
				return getName();
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
			case BPMN2ModelPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				getSupportedInterfaceRefs().clear();
				getSupportedInterfaceRefs().addAll((Collection<? extends Interface>)newValue);
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)newValue);
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
				getIoBinding().addAll((Collection<? extends InputOutputBinding>)newValue);
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__NAME:
				setName((String)newValue);
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
			case BPMN2ModelPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				getSupportedInterfaceRefs().clear();
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)null);
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
				return;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case BPMN2ModelPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				return supportedInterfaceRefs != null && !supportedInterfaceRefs.isEmpty();
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				return ioSpecification != null;
			case BPMN2ModelPackage.CALLABLE_ELEMENT__IO_BINDING:
				return ioBinding != null && !ioBinding.isEmpty();
			case BPMN2ModelPackage.CALLABLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CallableElementImpl

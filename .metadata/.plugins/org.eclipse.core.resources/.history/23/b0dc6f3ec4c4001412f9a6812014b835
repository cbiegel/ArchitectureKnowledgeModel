/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Operation;
import org.emftrace.metamodel.BPMN2Model.ServiceTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ServiceTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ServiceTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTaskImpl extends TaskImpl implements ServiceTask {
	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected Operation operationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getServiceTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.SERVICE_TASK__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationRef() {
		if (operationRef != null && operationRef.eIsProxy()) {
			InternalEObject oldOperationRef = (InternalEObject)operationRef;
			operationRef = (Operation)eResolveProxy(oldOperationRef);
			if (operationRef != oldOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF, oldOperationRef, operationRef));
			}
		}
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(Operation newOperationRef) {
		Operation oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.SERVICE_TASK__IMPLEMENTATION:
				return getImplementation();
			case BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
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
			case BPMN2ModelPackage.SERVICE_TASK__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF:
				setOperationRef((Operation)newValue);
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
			case BPMN2ModelPackage.SERVICE_TASK__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF:
				setOperationRef((Operation)null);
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
			case BPMN2ModelPackage.SERVICE_TASK__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
			case BPMN2ModelPackage.SERVICE_TASK__OPERATION_REF:
				return operationRef != null;
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
		result.append(" (implementation: ");
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //ServiceTaskImpl

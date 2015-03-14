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
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Resource;
import org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression;
import org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding;
import org.emftrace.metamodel.BPMN2Model.ResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl#getResourceParameterBindings <em>Resource Parameter Bindings</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRoleImpl extends BaseElementImpl implements ResourceRole {
	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected Resource resourceRef;

	/**
	 * The cached value of the '{@link #getResourceParameterBindings() <em>Resource Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceParameterBinding> resourceParameterBindings;

	/**
	 * The cached value of the '{@link #getResourceAssignmentExpression() <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected ResourceAssignmentExpression resourceAssignmentExpression;

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
	protected ResourceRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getResourceRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResourceRef() {
		if (resourceRef != null && resourceRef.eIsProxy()) {
			InternalEObject oldResourceRef = (InternalEObject)resourceRef;
			resourceRef = (Resource)eResolveProxy(oldResourceRef);
			if (resourceRef != oldResourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF, oldResourceRef, resourceRef));
			}
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResourceRef() {
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(Resource newResourceRef) {
		Resource oldResourceRef = resourceRef;
		resourceRef = newResourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF, oldResourceRef, resourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceParameterBinding> getResourceParameterBindings() {
		if (resourceParameterBindings == null) {
			resourceParameterBindings = new EObjectContainmentEList<ResourceParameterBinding>(ResourceParameterBinding.class, this, BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS);
		}
		return resourceParameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression getResourceAssignmentExpression() {
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
		ResourceAssignmentExpression oldResourceAssignmentExpression = resourceAssignmentExpression;
		resourceAssignmentExpression = newResourceAssignmentExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, oldResourceAssignmentExpression, newResourceAssignmentExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression) {
		if (newResourceAssignmentExpression != resourceAssignmentExpression) {
			NotificationChain msgs = null;
			if (resourceAssignmentExpression != null)
				msgs = ((InternalEObject)resourceAssignmentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
			if (newResourceAssignmentExpression != null)
				msgs = ((InternalEObject)newResourceAssignmentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
			msgs = basicSetResourceAssignmentExpression(newResourceAssignmentExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, newResourceAssignmentExpression, newResourceAssignmentExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RESOURCE_ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
				return ((InternalEList<?>)getResourceParameterBindings()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
				return basicSetResourceAssignmentExpression(null, msgs);
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
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF:
				if (resolve) return getResourceRef();
				return basicGetResourceRef();
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
				return getResourceParameterBindings();
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
				return getResourceAssignmentExpression();
			case BPMN2ModelPackage.RESOURCE_ROLE__NAME:
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
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF:
				setResourceRef((Resource)newValue);
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
				getResourceParameterBindings().clear();
				getResourceParameterBindings().addAll((Collection<? extends ResourceParameterBinding>)newValue);
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((ResourceAssignmentExpression)newValue);
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__NAME:
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
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF:
				setResourceRef((Resource)null);
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
				getResourceParameterBindings().clear();
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((ResourceAssignmentExpression)null);
				return;
			case BPMN2ModelPackage.RESOURCE_ROLE__NAME:
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
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_REF:
				return resourceRef != null;
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
				return resourceParameterBindings != null && !resourceParameterBindings.isEmpty();
			case BPMN2ModelPackage.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
				return resourceAssignmentExpression != null;
			case BPMN2ModelPackage.RESOURCE_ROLE__NAME:
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

} //ResourceRoleImpl

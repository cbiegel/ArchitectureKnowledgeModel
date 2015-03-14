/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.ComponentBinding;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl#getPluginComponent <em>Plugin Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentBindingImpl extends URNBaseImpl implements ComponentBinding {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentComponent() <em>Parent Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentComponent() <em>Parent Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentComponent()
	 * @generated
	 * @ordered
	 */
	protected String parentComponent = PARENT_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginComponent() <em>Plugin Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginComponent() <em>Plugin Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginComponent()
	 * @generated
	 * @ordered
	 */
	protected String pluginComponent = PLUGIN_COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.COMPONENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT_BINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentComponent() {
		return parentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(String newParentComponent) {
		String oldParentComponent = parentComponent;
		parentComponent = newParentComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT_BINDING__PARENT_COMPONENT, oldParentComponent, parentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginComponent() {
		return pluginComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginComponent(String newPluginComponent) {
		String oldPluginComponent = pluginComponent;
		pluginComponent = newPluginComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT_BINDING__PLUGIN_COMPONENT, oldPluginComponent, pluginComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.COMPONENT_BINDING__ID:
				return getId();
			case URNModelPackage.COMPONENT_BINDING__PARENT_COMPONENT:
				return getParentComponent();
			case URNModelPackage.COMPONENT_BINDING__PLUGIN_COMPONENT:
				return getPluginComponent();
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
			case URNModelPackage.COMPONENT_BINDING__ID:
				setId((String)newValue);
				return;
			case URNModelPackage.COMPONENT_BINDING__PARENT_COMPONENT:
				setParentComponent((String)newValue);
				return;
			case URNModelPackage.COMPONENT_BINDING__PLUGIN_COMPONENT:
				setPluginComponent((String)newValue);
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
			case URNModelPackage.COMPONENT_BINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case URNModelPackage.COMPONENT_BINDING__PARENT_COMPONENT:
				setParentComponent(PARENT_COMPONENT_EDEFAULT);
				return;
			case URNModelPackage.COMPONENT_BINDING__PLUGIN_COMPONENT:
				setPluginComponent(PLUGIN_COMPONENT_EDEFAULT);
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
			case URNModelPackage.COMPONENT_BINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case URNModelPackage.COMPONENT_BINDING__PARENT_COMPONENT:
				return PARENT_COMPONENT_EDEFAULT == null ? parentComponent != null : !PARENT_COMPONENT_EDEFAULT.equals(parentComponent);
			case URNModelPackage.COMPONENT_BINDING__PLUGIN_COMPONENT:
				return PLUGIN_COMPONENT_EDEFAULT == null ? pluginComponent != null : !PLUGIN_COMPONENT_EDEFAULT.equals(pluginComponent);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", parentComponent: ");
		result.append(parentComponent);
		result.append(", pluginComponent: ");
		result.append(pluginComponent);
		result.append(')');
		return result.toString();
	}

} //ComponentBindingImpl

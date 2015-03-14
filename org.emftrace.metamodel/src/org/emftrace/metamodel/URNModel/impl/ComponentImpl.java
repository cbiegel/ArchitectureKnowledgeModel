/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emftrace.metamodel.URNModel.Component;
import org.emftrace.metamodel.URNModel.ComponentKind;
import org.emftrace.metamodel.URNModel.ConcreteStyle;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#isContext <em>Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getIncludedComponents <em>Included Components</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getIncludingComponents <em>Including Components</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getCompRefs <em>Comp Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends UCMmodelElementImpl implements Component {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentKind KIND_EDEFAULT = ComponentKind.TEAM;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProtected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROTECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProtected()
	 * @generated
	 * @ordered
	 */
	protected boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #isContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext()
	 * @generated
	 * @ordered
	 */
	protected boolean context = CONTEXT_EDEFAULT;

	/**
	 * This is true if the Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedComponents() <em>Included Components</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> includedComponents;

	/**
	 * The cached value of the '{@link #getIncludingComponents() <em>Including Components</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> includingComponents;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompRefs() <em>Comp Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> compRefs;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ConcreteStyle style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ComponentKind newKind) {
		ComponentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		ComponentKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.COMPONENT__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(boolean newProtected) {
		boolean oldProtected = protected_;
		protected_ = newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.COMPONENT__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(boolean newContext) {
		boolean oldContext = context;
		context = newContext;
		boolean oldContextESet = contextESet;
		contextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__CONTEXT, oldContext, context, !oldContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContext() {
		boolean oldContext = context;
		boolean oldContextESet = contextESet;
		context = CONTEXT_EDEFAULT;
		contextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.COMPONENT__CONTEXT, oldContext, CONTEXT_EDEFAULT, oldContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContext() {
		return contextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIncludedComponents() {
		if (includedComponents == null) {
			includedComponents = new EDataTypeEList<String>(String.class, this, URNModelPackage.COMPONENT__INCLUDED_COMPONENTS);
		}
		return includedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIncludingComponents() {
		if (includingComponents == null) {
			includingComponents = new EDataTypeEList<String>(String.class, this, URNModelPackage.COMPONENT__INCLUDING_COMPONENTS);
		}
		return includingComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCompRefs() {
		if (compRefs == null) {
			compRefs = new EDataTypeEList<String>(String.class, this, URNModelPackage.COMPONENT__COMP_REFS);
		}
		return compRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(ConcreteStyle newStyle, NotificationChain msgs) {
		ConcreteStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(ConcreteStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.COMPONENT__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.COMPONENT__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMPONENT__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.COMPONENT__STYLE:
				return basicSetStyle(null, msgs);
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
			case URNModelPackage.COMPONENT__KIND:
				return getKind();
			case URNModelPackage.COMPONENT__PROTECTED:
				return isProtected();
			case URNModelPackage.COMPONENT__CONTEXT:
				return isContext();
			case URNModelPackage.COMPONENT__TYPE:
				return getType();
			case URNModelPackage.COMPONENT__INCLUDED_COMPONENTS:
				return getIncludedComponents();
			case URNModelPackage.COMPONENT__INCLUDING_COMPONENTS:
				return getIncludingComponents();
			case URNModelPackage.COMPONENT__HOST:
				return getHost();
			case URNModelPackage.COMPONENT__RESOURCE:
				return getResource();
			case URNModelPackage.COMPONENT__COMP_REFS:
				return getCompRefs();
			case URNModelPackage.COMPONENT__STYLE:
				return getStyle();
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
			case URNModelPackage.COMPONENT__KIND:
				setKind((ComponentKind)newValue);
				return;
			case URNModelPackage.COMPONENT__PROTECTED:
				setProtected((Boolean)newValue);
				return;
			case URNModelPackage.COMPONENT__CONTEXT:
				setContext((Boolean)newValue);
				return;
			case URNModelPackage.COMPONENT__TYPE:
				setType((String)newValue);
				return;
			case URNModelPackage.COMPONENT__INCLUDED_COMPONENTS:
				getIncludedComponents().clear();
				getIncludedComponents().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.COMPONENT__INCLUDING_COMPONENTS:
				getIncludingComponents().clear();
				getIncludingComponents().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.COMPONENT__HOST:
				setHost((String)newValue);
				return;
			case URNModelPackage.COMPONENT__RESOURCE:
				setResource((String)newValue);
				return;
			case URNModelPackage.COMPONENT__COMP_REFS:
				getCompRefs().clear();
				getCompRefs().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.COMPONENT__STYLE:
				setStyle((ConcreteStyle)newValue);
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
			case URNModelPackage.COMPONENT__KIND:
				unsetKind();
				return;
			case URNModelPackage.COMPONENT__PROTECTED:
				unsetProtected();
				return;
			case URNModelPackage.COMPONENT__CONTEXT:
				unsetContext();
				return;
			case URNModelPackage.COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case URNModelPackage.COMPONENT__INCLUDED_COMPONENTS:
				getIncludedComponents().clear();
				return;
			case URNModelPackage.COMPONENT__INCLUDING_COMPONENTS:
				getIncludingComponents().clear();
				return;
			case URNModelPackage.COMPONENT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case URNModelPackage.COMPONENT__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case URNModelPackage.COMPONENT__COMP_REFS:
				getCompRefs().clear();
				return;
			case URNModelPackage.COMPONENT__STYLE:
				setStyle((ConcreteStyle)null);
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
			case URNModelPackage.COMPONENT__KIND:
				return isSetKind();
			case URNModelPackage.COMPONENT__PROTECTED:
				return isSetProtected();
			case URNModelPackage.COMPONENT__CONTEXT:
				return isSetContext();
			case URNModelPackage.COMPONENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case URNModelPackage.COMPONENT__INCLUDED_COMPONENTS:
				return includedComponents != null && !includedComponents.isEmpty();
			case URNModelPackage.COMPONENT__INCLUDING_COMPONENTS:
				return includingComponents != null && !includingComponents.isEmpty();
			case URNModelPackage.COMPONENT__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case URNModelPackage.COMPONENT__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case URNModelPackage.COMPONENT__COMP_REFS:
				return compRefs != null && !compRefs.isEmpty();
			case URNModelPackage.COMPONENT__STYLE:
				return style != null;
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", context: ");
		if (contextESet) result.append(context); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", includedComponents: ");
		result.append(includedComponents);
		result.append(", includingComponents: ");
		result.append(includingComponents);
		result.append(", host: ");
		result.append(host);
		result.append(", resource: ");
		result.append(resource);
		result.append(", compRefs: ");
		result.append(compRefs);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

/**
 */
package org.emftrace.metamodel.FeatureModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.FeatureModel.Desc;
import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;
import org.emftrace.metamodel.FeatureModel.Property;
import org.emftrace.metamodel.FeatureModel.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#isInheritable <em>Inheritable</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.PropertyImpl#getDescs <em>Descs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends FeatureModelBaseImpl implements Property {
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
	 * The default value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected boolean invisible = INVISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInheritable() <em>Inheritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInheritable() <em>Inheritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritable()
	 * @generated
	 * @ordered
	 */
	protected boolean inheritable = INHERITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean fixed = FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

	/**
	 * The cached value of the '{@link #getDescs() <em>Descs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescs()
	 * @generated
	 * @ordered
	 */
	protected EList<Desc> descs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvisible() {
		return invisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisible(boolean newInvisible) {
		boolean oldInvisible = invisible;
		invisible = newInvisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__INVISIBLE, oldInvisible, invisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInheritable() {
		return inheritable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritable(boolean newInheritable) {
		boolean oldInheritable = inheritable;
		inheritable = newInheritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__INHERITABLE, oldInheritable, inheritable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(boolean newFixed) {
		boolean oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__FIXED, oldFixed, fixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.PROPERTY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, FeatureModelPackage.PROPERTY__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Desc> getDescs() {
		if (descs == null) {
			descs = new EObjectContainmentEList<Desc>(Desc.class, this, FeatureModelPackage.PROPERTY__DESCS);
		}
		return descs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.PROPERTY__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.PROPERTY__DESCS:
				return ((InternalEList<?>)getDescs()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.PROPERTY__NAME:
				return getName();
			case FeatureModelPackage.PROPERTY__TYPE:
				return getType();
			case FeatureModelPackage.PROPERTY__INVISIBLE:
				return isInvisible();
			case FeatureModelPackage.PROPERTY__INHERITABLE:
				return isInheritable();
			case FeatureModelPackage.PROPERTY__FIXED:
				return isFixed();
			case FeatureModelPackage.PROPERTY__READONLY:
				return isReadonly();
			case FeatureModelPackage.PROPERTY__CONTAINER:
				return getContainer();
			case FeatureModelPackage.PROPERTY__RANGE:
				return getRange();
			case FeatureModelPackage.PROPERTY__VALUE:
				return getValue();
			case FeatureModelPackage.PROPERTY__DESCS:
				return getDescs();
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
			case FeatureModelPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case FeatureModelPackage.PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case FeatureModelPackage.PROPERTY__INVISIBLE:
				setInvisible((Boolean)newValue);
				return;
			case FeatureModelPackage.PROPERTY__INHERITABLE:
				setInheritable((Boolean)newValue);
				return;
			case FeatureModelPackage.PROPERTY__FIXED:
				setFixed((Boolean)newValue);
				return;
			case FeatureModelPackage.PROPERTY__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case FeatureModelPackage.PROPERTY__CONTAINER:
				setContainer((String)newValue);
				return;
			case FeatureModelPackage.PROPERTY__RANGE:
				setRange((String)newValue);
				return;
			case FeatureModelPackage.PROPERTY__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Value>)newValue);
				return;
			case FeatureModelPackage.PROPERTY__DESCS:
				getDescs().clear();
				getDescs().addAll((Collection<? extends Desc>)newValue);
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
			case FeatureModelPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__INVISIBLE:
				setInvisible(INVISIBLE_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__INHERITABLE:
				setInheritable(INHERITABLE_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case FeatureModelPackage.PROPERTY__VALUE:
				getValue().clear();
				return;
			case FeatureModelPackage.PROPERTY__DESCS:
				getDescs().clear();
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
			case FeatureModelPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeatureModelPackage.PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case FeatureModelPackage.PROPERTY__INVISIBLE:
				return invisible != INVISIBLE_EDEFAULT;
			case FeatureModelPackage.PROPERTY__INHERITABLE:
				return inheritable != INHERITABLE_EDEFAULT;
			case FeatureModelPackage.PROPERTY__FIXED:
				return fixed != FIXED_EDEFAULT;
			case FeatureModelPackage.PROPERTY__READONLY:
				return readonly != READONLY_EDEFAULT;
			case FeatureModelPackage.PROPERTY__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case FeatureModelPackage.PROPERTY__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case FeatureModelPackage.PROPERTY__VALUE:
				return value != null && !value.isEmpty();
			case FeatureModelPackage.PROPERTY__DESCS:
				return descs != null && !descs.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", invisible: ");
		result.append(invisible);
		result.append(", inheritable: ");
		result.append(inheritable);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", container: ");
		result.append(container);
		result.append(", range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ObjectNode;
import org.emftrace.metamodel.UMLModel.ObjectNodeOrderingKind;
import org.emftrace.metamodel.UMLModel.TypedElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#getInState <em>In State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
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
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound;

	/**
	 * The default value of the '{@link #getInState() <em>In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInState() <em>In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected String inState = IN_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected String selection = SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getObjectNode();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlType() {
		return isControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = isControlType;
		isControlType = newIsControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType, isControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInState() {
		return inState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInState(String newInState) {
		String oldInState = inState;
		inState = newInState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__IN_STATE, oldInState, inState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(String newSelection) {
		String oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.OBJECT_NODE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case UMLModelPackage.OBJECT_NODE__TYPE:
				return getType();
			case UMLModelPackage.OBJECT_NODE__ORDERING:
				return getOrdering();
			case UMLModelPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isIsControlType();
			case UMLModelPackage.OBJECT_NODE__UPPER_BOUND:
				return getUpperBound();
			case UMLModelPackage.OBJECT_NODE__IN_STATE:
				return getInState();
			case UMLModelPackage.OBJECT_NODE__SELECTION:
				return getSelection();
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
			case UMLModelPackage.OBJECT_NODE__TYPE:
				setType((String)newValue);
				return;
			case UMLModelPackage.OBJECT_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UMLModelPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType((Boolean)newValue);
				return;
			case UMLModelPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UMLModelPackage.OBJECT_NODE__IN_STATE:
				setInState((String)newValue);
				return;
			case UMLModelPackage.OBJECT_NODE__SELECTION:
				setSelection((String)newValue);
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
			case UMLModelPackage.OBJECT_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UMLModelPackage.OBJECT_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLModelPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLModelPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UMLModelPackage.OBJECT_NODE__IN_STATE:
				setInState(IN_STATE_EDEFAULT);
				return;
			case UMLModelPackage.OBJECT_NODE__SELECTION:
				setSelection(SELECTION_EDEFAULT);
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
			case UMLModelPackage.OBJECT_NODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case UMLModelPackage.OBJECT_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case UMLModelPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isControlType != IS_CONTROL_TYPE_EDEFAULT;
			case UMLModelPackage.OBJECT_NODE__UPPER_BOUND:
				return upperBound != null;
			case UMLModelPackage.OBJECT_NODE__IN_STATE:
				return IN_STATE_EDEFAULT == null ? inState != null : !IN_STATE_EDEFAULT.equals(inState);
			case UMLModelPackage.OBJECT_NODE__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.OBJECT_NODE__TYPE: return UMLModelPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.TYPED_ELEMENT__TYPE: return UMLModelPackage.OBJECT_NODE__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", isControlType: ");
		result.append(isControlType);
		result.append(", inState: ");
		result.append(inState);
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeImpl

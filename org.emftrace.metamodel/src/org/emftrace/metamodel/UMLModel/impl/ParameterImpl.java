/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.MultiplicityElement;
import org.emftrace.metamodel.UMLModel.Parameter;
import org.emftrace.metamodel.UMLModel.ParameterDirectionKind;
import org.emftrace.metamodel.UMLModel.ParameterEffectKind;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #getParameterSet() <em>Parameter Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected String parameterSet = PARAMETER_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * This is true if the Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultESet;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCEPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected boolean isException = IS_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STREAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected boolean isStream = IS_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.CREATE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected ParameterEffectKind effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterSet() {
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterSet(String newParameterSet) {
		String oldParameterSet = parameterSet;
		parameterSet = newParameterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__PARAMETER_SET, oldParameterSet, parameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		boolean oldDefaultESet = defaultESet;
		defaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__DEFAULT, oldDefault, default_, !oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		String oldDefault = default_;
		boolean oldDefaultESet = defaultESet;
		default_ = DEFAULT_EDEFAULT;
		defaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UMLModelPackage.PARAMETER__DEFAULT, oldDefault, DEFAULT_EDEFAULT, oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return defaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsException() {
		return isException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(boolean newIsException) {
		boolean oldIsException = isException;
		isException = newIsException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStream() {
		return isStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(boolean newIsStream) {
		boolean oldIsStream = isStream;
		isStream = newIsStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		boolean oldEffectESet = effectESet;
		effectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETER__EFFECT, oldEffect, effect, !oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		ParameterEffectKind oldEffect = effect;
		boolean oldEffectESet = effectESet;
		effect = EFFECT_EDEFAULT;
		effectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UMLModelPackage.PARAMETER__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return effectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case UMLModelPackage.PARAMETER__IS_ORDERED:
				return isIsOrdered();
			case UMLModelPackage.PARAMETER__IS_UNIQUE:
				return isIsUnique();
			case UMLModelPackage.PARAMETER__UPPER:
				return getUpper();
			case UMLModelPackage.PARAMETER__LOWER:
				return getLower();
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case UMLModelPackage.PARAMETER__PARAMETER_SET:
				return getParameterSet();
			case UMLModelPackage.PARAMETER__OPERATION:
				return getOperation();
			case UMLModelPackage.PARAMETER__DIRECTION:
				return getDirection();
			case UMLModelPackage.PARAMETER__DEFAULT:
				return getDefault();
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case UMLModelPackage.PARAMETER__IS_EXCEPTION:
				return isIsException();
			case UMLModelPackage.PARAMETER__IS_STREAM:
				return isIsStream();
			case UMLModelPackage.PARAMETER__EFFECT:
				return getEffect();
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
			case UMLModelPackage.PARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case UMLModelPackage.PARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case UMLModelPackage.PARAMETER__UPPER:
				setUpper((Integer)newValue);
				return;
			case UMLModelPackage.PARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UMLModelPackage.PARAMETER__PARAMETER_SET:
				setParameterSet((String)newValue);
				return;
			case UMLModelPackage.PARAMETER__OPERATION:
				setOperation((String)newValue);
				return;
			case UMLModelPackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case UMLModelPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UMLModelPackage.PARAMETER__IS_EXCEPTION:
				setIsException((Boolean)newValue);
				return;
			case UMLModelPackage.PARAMETER__IS_STREAM:
				setIsStream((Boolean)newValue);
				return;
			case UMLModelPackage.PARAMETER__EFFECT:
				setEffect((ParameterEffectKind)newValue);
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
			case UMLModelPackage.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UMLModelPackage.PARAMETER__PARAMETER_SET:
				setParameterSet(PARAMETER_SET_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__DEFAULT:
				unsetDefault();
				return;
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UMLModelPackage.PARAMETER__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__IS_STREAM:
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETER__EFFECT:
				unsetEffect();
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
			case UMLModelPackage.PARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UMLModelPackage.PARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UMLModelPackage.PARAMETER__UPPER:
				return upper != UPPER_EDEFAULT;
			case UMLModelPackage.PARAMETER__LOWER:
				return lower != LOWER_EDEFAULT;
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
				return upperValue != null;
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
				return lowerValue != null;
			case UMLModelPackage.PARAMETER__PARAMETER_SET:
				return PARAMETER_SET_EDEFAULT == null ? parameterSet != null : !PARAMETER_SET_EDEFAULT.equals(parameterSet);
			case UMLModelPackage.PARAMETER__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case UMLModelPackage.PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case UMLModelPackage.PARAMETER__DEFAULT:
				return isSetDefault();
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
			case UMLModelPackage.PARAMETER__IS_EXCEPTION:
				return isException != IS_EXCEPTION_EDEFAULT;
			case UMLModelPackage.PARAMETER__IS_STREAM:
				return isStream != IS_STREAM_EDEFAULT;
			case UMLModelPackage.PARAMETER__EFFECT:
				return isSetEffect();
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
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.PARAMETER__IS_ORDERED: return UMLModelPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLModelPackage.PARAMETER__IS_UNIQUE: return UMLModelPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLModelPackage.PARAMETER__UPPER: return UMLModelPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLModelPackage.PARAMETER__LOWER: return UMLModelPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLModelPackage.PARAMETER__UPPER_VALUE: return UMLModelPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UMLModelPackage.PARAMETER__LOWER_VALUE: return UMLModelPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return UMLModelPackage.PARAMETER__IS_ORDERED;
				case UMLModelPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UMLModelPackage.PARAMETER__IS_UNIQUE;
				case UMLModelPackage.MULTIPLICITY_ELEMENT__UPPER: return UMLModelPackage.PARAMETER__UPPER;
				case UMLModelPackage.MULTIPLICITY_ELEMENT__LOWER: return UMLModelPackage.PARAMETER__LOWER;
				case UMLModelPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UMLModelPackage.PARAMETER__UPPER_VALUE;
				case UMLModelPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UMLModelPackage.PARAMETER__LOWER_VALUE;
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(", parameterSet: ");
		result.append(parameterSet);
		result.append(", operation: ");
		result.append(operation);
		result.append(", direction: ");
		result.append(direction);
		result.append(", default: ");
		if (defaultESet) result.append(default_); else result.append("<unset>");
		result.append(", isException: ");
		result.append(isException);
		result.append(", isStream: ");
		result.append(isStream);
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterImpl

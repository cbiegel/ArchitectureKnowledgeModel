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
import org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition;
import org.emftrace.metamodel.BPMN2Model.DataInput;
import org.emftrace.metamodel.BPMN2Model.DataOutput;
import org.emftrace.metamodel.BPMN2Model.EventDefinition;
import org.emftrace.metamodel.BPMN2Model.Expression;
import org.emftrace.metamodel.BPMN2Model.ItemAwareElement;
import org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior;
import org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
	/**
	 * The cached value of the '{@link #getLoopCardinality() <em>Loop Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCardinality()
	 * @generated
	 * @ordered
	 */
	protected Expression loopCardinality;

	/**
	 * The cached value of the '{@link #getLoopDataInputRef() <em>Loop Data Input Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataInputRef()
	 * @generated
	 * @ordered
	 */
	protected ItemAwareElement loopDataInputRef;

	/**
	 * The cached value of the '{@link #getLoopDataOutputRef() <em>Loop Data Output Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataOutputRef()
	 * @generated
	 * @ordered
	 */
	protected ItemAwareElement loopDataOutputRef;

	/**
	 * The cached value of the '{@link #getInputDataItem() <em>Input Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataItem()
	 * @generated
	 * @ordered
	 */
	protected DataInput inputDataItem;

	/**
	 * The cached value of the '{@link #getOutputDataItem() <em>Output Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataItem()
	 * @generated
	 * @ordered
	 */
	protected DataOutput outputDataItem;

	/**
	 * The cached value of the '{@link #getComplexBehaviorDefinition() <em>Complex Behavior Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexBehaviorDefinition> complexBehaviorDefinition;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression completionCondition;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final MultiInstanceBehavior BEHAVIOR_EDEFAULT = MultiInstanceBehavior.ALL;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected MultiInstanceBehavior behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequential()
	 * @generated
	 * @ordered
	 */
	protected boolean isSequential = IS_SEQUENTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition noneBehaviorEventRef;

	/**
	 * The cached value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition oneBehaviorEventRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiInstanceLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCardinality() {
		return loopCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCardinality(Expression newLoopCardinality, NotificationChain msgs) {
		Expression oldLoopCardinality = loopCardinality;
		loopCardinality = newLoopCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, oldLoopCardinality, newLoopCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCardinality(Expression newLoopCardinality) {
		if (newLoopCardinality != loopCardinality) {
			NotificationChain msgs = null;
			if (loopCardinality != null)
				msgs = ((InternalEObject)loopCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
			if (newLoopCardinality != null)
				msgs = ((InternalEObject)newLoopCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
			msgs = basicSetLoopCardinality(newLoopCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, newLoopCardinality, newLoopCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataInputRef() {
		if (loopDataInputRef != null && loopDataInputRef.eIsProxy()) {
			InternalEObject oldLoopDataInputRef = (InternalEObject)loopDataInputRef;
			loopDataInputRef = (ItemAwareElement)eResolveProxy(oldLoopDataInputRef);
			if (loopDataInputRef != oldLoopDataInputRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, oldLoopDataInputRef, loopDataInputRef));
			}
		}
		return loopDataInputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement basicGetLoopDataInputRef() {
		return loopDataInputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataInputRef(ItemAwareElement newLoopDataInputRef) {
		ItemAwareElement oldLoopDataInputRef = loopDataInputRef;
		loopDataInputRef = newLoopDataInputRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, oldLoopDataInputRef, loopDataInputRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataOutputRef() {
		if (loopDataOutputRef != null && loopDataOutputRef.eIsProxy()) {
			InternalEObject oldLoopDataOutputRef = (InternalEObject)loopDataOutputRef;
			loopDataOutputRef = (ItemAwareElement)eResolveProxy(oldLoopDataOutputRef);
			if (loopDataOutputRef != oldLoopDataOutputRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, oldLoopDataOutputRef, loopDataOutputRef));
			}
		}
		return loopDataOutputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement basicGetLoopDataOutputRef() {
		return loopDataOutputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataOutputRef(ItemAwareElement newLoopDataOutputRef) {
		ItemAwareElement oldLoopDataOutputRef = loopDataOutputRef;
		loopDataOutputRef = newLoopDataOutputRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, oldLoopDataOutputRef, loopDataOutputRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getInputDataItem() {
		return inputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputDataItem(DataInput newInputDataItem, NotificationChain msgs) {
		DataInput oldInputDataItem = inputDataItem;
		inputDataItem = newInputDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, oldInputDataItem, newInputDataItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataItem(DataInput newInputDataItem) {
		if (newInputDataItem != inputDataItem) {
			NotificationChain msgs = null;
			if (inputDataItem != null)
				msgs = ((InternalEObject)inputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
			if (newInputDataItem != null)
				msgs = ((InternalEObject)newInputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
			msgs = basicSetInputDataItem(newInputDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, newInputDataItem, newInputDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput getOutputDataItem() {
		return outputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputDataItem(DataOutput newOutputDataItem, NotificationChain msgs) {
		DataOutput oldOutputDataItem = outputDataItem;
		outputDataItem = newOutputDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, oldOutputDataItem, newOutputDataItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataItem(DataOutput newOutputDataItem) {
		if (newOutputDataItem != outputDataItem) {
			NotificationChain msgs = null;
			if (outputDataItem != null)
				msgs = ((InternalEObject)outputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
			if (newOutputDataItem != null)
				msgs = ((InternalEObject)newOutputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
			msgs = basicSetOutputDataItem(newOutputDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, newOutputDataItem, newOutputDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
		if (complexBehaviorDefinition == null) {
			complexBehaviorDefinition = new EObjectContainmentEList<ComplexBehaviorDefinition>(ComplexBehaviorDefinition.class, this, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION);
		}
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(Expression newCompletionCondition, NotificationChain msgs) {
		Expression oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(Expression newCompletionCondition) {
		if (newCompletionCondition != completionCondition) {
			NotificationChain msgs = null;
			if (completionCondition != null)
				msgs = ((InternalEObject)completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
			if (newCompletionCondition != null)
				msgs = ((InternalEObject)newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
			msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(MultiInstanceBehavior newBehavior) {
		MultiInstanceBehavior oldBehavior = behavior;
		behavior = newBehavior == null ? BEHAVIOR_EDEFAULT : newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSequential() {
		return isSequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequential(boolean newIsSequential) {
		boolean oldIsSequential = isSequential;
		isSequential = newIsSequential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential, isSequential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getNoneBehaviorEventRef() {
		if (noneBehaviorEventRef != null && noneBehaviorEventRef.eIsProxy()) {
			InternalEObject oldNoneBehaviorEventRef = (InternalEObject)noneBehaviorEventRef;
			noneBehaviorEventRef = (EventDefinition)eResolveProxy(oldNoneBehaviorEventRef);
			if (noneBehaviorEventRef != oldNoneBehaviorEventRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, oldNoneBehaviorEventRef, noneBehaviorEventRef));
			}
		}
		return noneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition basicGetNoneBehaviorEventRef() {
		return noneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoneBehaviorEventRef(EventDefinition newNoneBehaviorEventRef) {
		EventDefinition oldNoneBehaviorEventRef = noneBehaviorEventRef;
		noneBehaviorEventRef = newNoneBehaviorEventRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, oldNoneBehaviorEventRef, noneBehaviorEventRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getOneBehaviorEventRef() {
		if (oneBehaviorEventRef != null && oneBehaviorEventRef.eIsProxy()) {
			InternalEObject oldOneBehaviorEventRef = (InternalEObject)oneBehaviorEventRef;
			oneBehaviorEventRef = (EventDefinition)eResolveProxy(oldOneBehaviorEventRef);
			if (oneBehaviorEventRef != oldOneBehaviorEventRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, oldOneBehaviorEventRef, oneBehaviorEventRef));
			}
		}
		return oneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition basicGetOneBehaviorEventRef() {
		return oneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneBehaviorEventRef(EventDefinition newOneBehaviorEventRef) {
		EventDefinition oldOneBehaviorEventRef = oneBehaviorEventRef;
		oneBehaviorEventRef = newOneBehaviorEventRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, oldOneBehaviorEventRef, oneBehaviorEventRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return basicSetLoopCardinality(null, msgs);
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return basicSetInputDataItem(null, msgs);
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return basicSetOutputDataItem(null, msgs);
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return ((InternalEList<?>)getComplexBehaviorDefinition()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
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
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return getLoopCardinality();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				if (resolve) return getLoopDataInputRef();
				return basicGetLoopDataInputRef();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				if (resolve) return getLoopDataOutputRef();
				return basicGetLoopDataOutputRef();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return getInputDataItem();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return getOutputDataItem();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return getCompletionCondition();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return getBehavior();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isIsSequential();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				if (resolve) return getNoneBehaviorEventRef();
				return basicGetNoneBehaviorEventRef();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				if (resolve) return getOneBehaviorEventRef();
				return basicGetOneBehaviorEventRef();
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
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((Expression)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef((ItemAwareElement)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef((ItemAwareElement)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((DataInput)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((DataOutput)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
				getComplexBehaviorDefinition().addAll((Collection<? extends ComplexBehaviorDefinition>)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((Expression)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				setBehavior((MultiInstanceBehavior)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				setIsSequential((Boolean)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef((EventDefinition)newValue);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef((EventDefinition)newValue);
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
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((Expression)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef((ItemAwareElement)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef((ItemAwareElement)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((DataInput)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((DataOutput)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((Expression)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				setIsSequential(IS_SEQUENTIAL_EDEFAULT);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef((EventDefinition)null);
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef((EventDefinition)null);
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
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return loopCardinality != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				return loopDataInputRef != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				return loopDataOutputRef != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return inputDataItem != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return outputDataItem != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return complexBehaviorDefinition != null && !complexBehaviorDefinition.isEmpty();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return completionCondition != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return behavior != BEHAVIOR_EDEFAULT;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isSequential != IS_SEQUENTIAL_EDEFAULT;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				return noneBehaviorEventRef != null;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				return oneBehaviorEventRef != null;
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
		result.append(" (behavior: ");
		result.append(behavior);
		result.append(", isSequential: ");
		result.append(isSequential);
		result.append(')');
		return result.toString();
	}

} //MultiInstanceLoopCharacteristicsImpl

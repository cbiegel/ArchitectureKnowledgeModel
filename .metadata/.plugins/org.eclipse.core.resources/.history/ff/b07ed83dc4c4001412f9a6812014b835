/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.DataState;
import org.emftrace.metamodel.BPMN2Model.ItemAwareElement;
import org.emftrace.metamodel.BPMN2Model.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Aware Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemAwareElementImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemAwareElementImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemAwareElementImpl extends BaseElementImpl implements ItemAwareElement {
	/**
	 * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataState()
	 * @generated
	 * @ordered
	 */
	protected DataState dataState;

	/**
	 * The cached value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSubjectRef()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition itemSubjectRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemAwareElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getItemAwareElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState getDataState() {
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
		DataState oldDataState = dataState;
		dataState = newDataState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE, oldDataState, newDataState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataState(DataState newDataState) {
		if (newDataState != dataState) {
			NotificationChain msgs = null;
			if (dataState != null)
				msgs = ((InternalEObject)dataState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE, null, msgs);
			if (newDataState != null)
				msgs = ((InternalEObject)newDataState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE, null, msgs);
			msgs = basicSetDataState(newDataState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE, newDataState, newDataState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemSubjectRef() {
		if (itemSubjectRef != null && itemSubjectRef.eIsProxy()) {
			InternalEObject oldItemSubjectRef = (InternalEObject)itemSubjectRef;
			itemSubjectRef = (ItemDefinition)eResolveProxy(oldItemSubjectRef);
			if (itemSubjectRef != oldItemSubjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef));
			}
		}
		return itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemSubjectRef() {
		return itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		ItemDefinition oldItemSubjectRef = itemSubjectRef;
		itemSubjectRef = newItemSubjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE:
				return basicSetDataState(null, msgs);
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
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE:
				return getDataState();
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
				if (resolve) return getItemSubjectRef();
				return basicGetItemSubjectRef();
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
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE:
				setDataState((DataState)newValue);
				return;
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)newValue);
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
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE:
				setDataState((DataState)null);
				return;
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)null);
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
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__DATA_STATE:
				return dataState != null;
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
				return itemSubjectRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemAwareElementImpl

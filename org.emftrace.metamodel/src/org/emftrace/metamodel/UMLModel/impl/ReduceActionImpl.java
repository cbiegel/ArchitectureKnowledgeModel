/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.OutputPin;
import org.emftrace.metamodel.UMLModel.ReduceAction;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReduceActionImpl#getReducer <em>Reducer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReduceActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReduceActionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReduceActionImpl#isIsOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReduceActionImpl extends ActionImpl implements ReduceAction {
	/**
	 * The default value of the '{@link #getReducer() <em>Reducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducer()
	 * @generated
	 * @ordered
	 */
	protected static final String REDUCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReducer() <em>Reducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducer()
	 * @generated
	 * @ordered
	 */
	protected String reducer = REDUCER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected InputPin collection;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getReduceAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReducer() {
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReducer(String newReducer) {
		String oldReducer = reducer;
		reducer = newReducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__REDUCER, oldReducer, reducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(OutputPin newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REDUCE_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REDUCE_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(InputPin newCollection, NotificationChain msgs) {
		InputPin oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(InputPin newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REDUCE_ACTION__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.REDUCE_ACTION__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__COLLECTION, newCollection, newCollection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDUCE_ACTION__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.REDUCE_ACTION__RESULT:
				return basicSetResult(null, msgs);
			case UMLModelPackage.REDUCE_ACTION__COLLECTION:
				return basicSetCollection(null, msgs);
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
			case UMLModelPackage.REDUCE_ACTION__REDUCER:
				return getReducer();
			case UMLModelPackage.REDUCE_ACTION__RESULT:
				return getResult();
			case UMLModelPackage.REDUCE_ACTION__COLLECTION:
				return getCollection();
			case UMLModelPackage.REDUCE_ACTION__IS_ORDERED:
				return isIsOrdered();
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
			case UMLModelPackage.REDUCE_ACTION__REDUCER:
				setReducer((String)newValue);
				return;
			case UMLModelPackage.REDUCE_ACTION__RESULT:
				setResult((OutputPin)newValue);
				return;
			case UMLModelPackage.REDUCE_ACTION__COLLECTION:
				setCollection((InputPin)newValue);
				return;
			case UMLModelPackage.REDUCE_ACTION__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
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
			case UMLModelPackage.REDUCE_ACTION__REDUCER:
				setReducer(REDUCER_EDEFAULT);
				return;
			case UMLModelPackage.REDUCE_ACTION__RESULT:
				setResult((OutputPin)null);
				return;
			case UMLModelPackage.REDUCE_ACTION__COLLECTION:
				setCollection((InputPin)null);
				return;
			case UMLModelPackage.REDUCE_ACTION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
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
			case UMLModelPackage.REDUCE_ACTION__REDUCER:
				return REDUCER_EDEFAULT == null ? reducer != null : !REDUCER_EDEFAULT.equals(reducer);
			case UMLModelPackage.REDUCE_ACTION__RESULT:
				return result != null;
			case UMLModelPackage.REDUCE_ACTION__COLLECTION:
				return collection != null;
			case UMLModelPackage.REDUCE_ACTION__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
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
		result.append(" (reducer: ");
		result.append(reducer);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(')');
		return result.toString();
	}

} //ReduceActionImpl

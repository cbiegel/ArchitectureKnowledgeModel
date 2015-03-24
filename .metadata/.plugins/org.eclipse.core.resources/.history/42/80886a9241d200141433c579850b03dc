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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.DataInput;
import org.emftrace.metamodel.BPMN2Model.InputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInputImpl extends ItemAwareElementImpl implements DataInput {
	/**
	 * The cached value of the '{@link #getInputSetWithOptional() <em>Input Set With Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSetWithOptional()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSet> inputSetWithOptional;

	/**
	 * The cached value of the '{@link #getInputSetWithWhileExecuting() <em>Input Set With While Executing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSetWithWhileExecuting()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSet> inputSetWithWhileExecuting;

	/**
	 * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSetRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSet> inputSetRefs;

	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

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
	protected DataInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getDataInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSetWithOptional() {
		if (inputSetWithOptional == null) {
			inputSetWithOptional = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>(InputSet.class, this, BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL, BPMN2ModelPackage.INPUT_SET__OPTIONAL_INPUT_REFS);
		}
		return inputSetWithOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSetWithWhileExecuting() {
		if (inputSetWithWhileExecuting == null) {
			inputSetWithWhileExecuting = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>(InputSet.class, this, BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING, BPMN2ModelPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS);
		}
		return inputSetWithWhileExecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSetRefs() {
		if (inputSetRefs == null) {
			inputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>(InputSet.class, this, BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS, BPMN2ModelPackage.INPUT_SET__DATA_INPUT_REFS);
		}
		return inputSetRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DATA_INPUT__IS_COLLECTION, oldIsCollection, isCollection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DATA_INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSetWithOptional()).basicAdd(otherEnd, msgs);
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSetWithWhileExecuting()).basicAdd(otherEnd, msgs);
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSetRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return ((InternalEList<?>)getInputSetWithOptional()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return ((InternalEList<?>)getInputSetWithWhileExecuting()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				return ((InternalEList<?>)getInputSetRefs()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return getInputSetWithOptional();
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return getInputSetWithWhileExecuting();
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				return getInputSetRefs();
			case BPMN2ModelPackage.DATA_INPUT__IS_COLLECTION:
				return isIsCollection();
			case BPMN2ModelPackage.DATA_INPUT__NAME:
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
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				getInputSetWithOptional().clear();
				getInputSetWithOptional().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				getInputSetWithWhileExecuting().clear();
				getInputSetWithWhileExecuting().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				getInputSetRefs().clear();
				getInputSetRefs().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BPMN2ModelPackage.DATA_INPUT__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case BPMN2ModelPackage.DATA_INPUT__NAME:
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
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				getInputSetWithOptional().clear();
				return;
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				getInputSetWithWhileExecuting().clear();
				return;
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				getInputSetRefs().clear();
				return;
			case BPMN2ModelPackage.DATA_INPUT__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case BPMN2ModelPackage.DATA_INPUT__NAME:
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
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return inputSetWithOptional != null && !inputSetWithOptional.isEmpty();
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return inputSetWithWhileExecuting != null && !inputSetWithWhileExecuting.isEmpty();
			case BPMN2ModelPackage.DATA_INPUT__INPUT_SET_REFS:
				return inputSetRefs != null && !inputSetRefs.isEmpty();
			case BPMN2ModelPackage.DATA_INPUT__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case BPMN2ModelPackage.DATA_INPUT__NAME:
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
		result.append(" (isCollection: ");
		result.append(isCollection);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataInputImpl

/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Escalation;
import org.emftrace.metamodel.BPMN2Model.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationImpl#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationImpl#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationImpl extends BPMNBaseImpl implements Escalation {
	/**
	 * The default value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCALATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected String escalationCode = ESCALATION_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition structureRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscalationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getEscalation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscalationCode() {
		return escalationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationCode(String newEscalationCode) {
		String oldEscalationCode = escalationCode;
		escalationCode = newEscalationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ESCALATION__ESCALATION_CODE, oldEscalationCode, escalationCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ESCALATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getStructureRef() {
		if (structureRef != null && structureRef.eIsProxy()) {
			InternalEObject oldStructureRef = (InternalEObject)structureRef;
			structureRef = (ItemDefinition)eResolveProxy(oldStructureRef);
			if (structureRef != oldStructureRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.ESCALATION__STRUCTURE_REF, oldStructureRef, structureRef));
			}
		}
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetStructureRef() {
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(ItemDefinition newStructureRef) {
		ItemDefinition oldStructureRef = structureRef;
		structureRef = newStructureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ESCALATION__STRUCTURE_REF, oldStructureRef, structureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.ESCALATION__ESCALATION_CODE:
				return getEscalationCode();
			case BPMN2ModelPackage.ESCALATION__NAME:
				return getName();
			case BPMN2ModelPackage.ESCALATION__STRUCTURE_REF:
				if (resolve) return getStructureRef();
				return basicGetStructureRef();
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
			case BPMN2ModelPackage.ESCALATION__ESCALATION_CODE:
				setEscalationCode((String)newValue);
				return;
			case BPMN2ModelPackage.ESCALATION__NAME:
				setName((String)newValue);
				return;
			case BPMN2ModelPackage.ESCALATION__STRUCTURE_REF:
				setStructureRef((ItemDefinition)newValue);
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
			case BPMN2ModelPackage.ESCALATION__ESCALATION_CODE:
				setEscalationCode(ESCALATION_CODE_EDEFAULT);
				return;
			case BPMN2ModelPackage.ESCALATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN2ModelPackage.ESCALATION__STRUCTURE_REF:
				setStructureRef((ItemDefinition)null);
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
			case BPMN2ModelPackage.ESCALATION__ESCALATION_CODE:
				return ESCALATION_CODE_EDEFAULT == null ? escalationCode != null : !ESCALATION_CODE_EDEFAULT.equals(escalationCode);
			case BPMN2ModelPackage.ESCALATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN2ModelPackage.ESCALATION__STRUCTURE_REF:
				return structureRef != null;
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
		result.append(" (escalationCode: ");
		result.append(escalationCode);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EscalationImpl

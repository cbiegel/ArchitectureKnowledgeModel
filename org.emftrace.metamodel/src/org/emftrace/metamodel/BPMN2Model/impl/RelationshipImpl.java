/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Relationship;
import org.emftrace.metamodel.BPMN2Model.RelationshipDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends BaseElementImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targets;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipDirection DIRECTION_EDEFAULT = RelationshipDirection.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected RelationshipDirection direction = DIRECTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<EObject>(EObject.class, this, BPMN2ModelPackage.RELATIONSHIP__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<EObject>(EObject.class, this, BPMN2ModelPackage.RELATIONSHIP__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(RelationshipDirection newDirection) {
		RelationshipDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RELATIONSHIP__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.RELATIONSHIP__SOURCES:
				return getSources();
			case BPMN2ModelPackage.RELATIONSHIP__TARGETS:
				return getTargets();
			case BPMN2ModelPackage.RELATIONSHIP__DIRECTION:
				return getDirection();
			case BPMN2ModelPackage.RELATIONSHIP__TYPE:
				return getType();
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
			case BPMN2ModelPackage.RELATIONSHIP__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends EObject>)newValue);
				return;
			case BPMN2ModelPackage.RELATIONSHIP__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends EObject>)newValue);
				return;
			case BPMN2ModelPackage.RELATIONSHIP__DIRECTION:
				setDirection((RelationshipDirection)newValue);
				return;
			case BPMN2ModelPackage.RELATIONSHIP__TYPE:
				setType((String)newValue);
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
			case BPMN2ModelPackage.RELATIONSHIP__SOURCES:
				getSources().clear();
				return;
			case BPMN2ModelPackage.RELATIONSHIP__TARGETS:
				getTargets().clear();
				return;
			case BPMN2ModelPackage.RELATIONSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case BPMN2ModelPackage.RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
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
			case BPMN2ModelPackage.RELATIONSHIP__SOURCES:
				return sources != null && !sources.isEmpty();
			case BPMN2ModelPackage.RELATIONSHIP__TARGETS:
				return targets != null && !targets.isEmpty();
			case BPMN2ModelPackage.RELATIONSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case BPMN2ModelPackage.RELATIONSHIP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl

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

import org.emftrace.metamodel.URNModel.ActorRef;
import org.emftrace.metamodel.URNModel.Label;
import org.emftrace.metamodel.URNModel.Position;
import org.emftrace.metamodel.URNModel.Size;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl#getActorDef <em>Actor Def</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorRefImpl extends GRLmodelElementImpl implements ActorRef {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The default value of the '{@link #getActorDef() <em>Actor Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDef()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorDef() <em>Actor Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDef()
	 * @generated
	 * @ordered
	 */
	protected String actorDef = ACTOR_DEF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nodes;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected Position pos;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.ACTOR_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorDef() {
		return actorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorDef(String newActorDef) {
		String oldActorDef = actorDef;
		actorDef = newActorDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__ACTOR_DEF, oldActorDef, actorDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNodes() {
		if (nodes == null) {
			nodes = new EDataTypeEList<String>(String.class, this, URNModelPackage.ACTOR_REF__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(Position newPos, NotificationChain msgs) {
		Position oldPos = pos;
		pos = newPos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__POS, oldPos, newPos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Position newPos) {
		if (newPos != pos) {
			NotificationChain msgs = null;
			if (pos != null)
				msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__POS, null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__POS, null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__POS, newPos, newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Size newSize, NotificationChain msgs) {
		Size oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR_REF__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR_REF__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.ACTOR_REF__LABEL:
				return basicSetLabel(null, msgs);
			case URNModelPackage.ACTOR_REF__POS:
				return basicSetPos(null, msgs);
			case URNModelPackage.ACTOR_REF__SIZE:
				return basicSetSize(null, msgs);
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
			case URNModelPackage.ACTOR_REF__LABEL:
				return getLabel();
			case URNModelPackage.ACTOR_REF__ACTOR_DEF:
				return getActorDef();
			case URNModelPackage.ACTOR_REF__NODES:
				return getNodes();
			case URNModelPackage.ACTOR_REF__POS:
				return getPos();
			case URNModelPackage.ACTOR_REF__SIZE:
				return getSize();
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
			case URNModelPackage.ACTOR_REF__LABEL:
				setLabel((Label)newValue);
				return;
			case URNModelPackage.ACTOR_REF__ACTOR_DEF:
				setActorDef((String)newValue);
				return;
			case URNModelPackage.ACTOR_REF__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.ACTOR_REF__POS:
				setPos((Position)newValue);
				return;
			case URNModelPackage.ACTOR_REF__SIZE:
				setSize((Size)newValue);
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
			case URNModelPackage.ACTOR_REF__LABEL:
				setLabel((Label)null);
				return;
			case URNModelPackage.ACTOR_REF__ACTOR_DEF:
				setActorDef(ACTOR_DEF_EDEFAULT);
				return;
			case URNModelPackage.ACTOR_REF__NODES:
				getNodes().clear();
				return;
			case URNModelPackage.ACTOR_REF__POS:
				setPos((Position)null);
				return;
			case URNModelPackage.ACTOR_REF__SIZE:
				setSize((Size)null);
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
			case URNModelPackage.ACTOR_REF__LABEL:
				return label != null;
			case URNModelPackage.ACTOR_REF__ACTOR_DEF:
				return ACTOR_DEF_EDEFAULT == null ? actorDef != null : !ACTOR_DEF_EDEFAULT.equals(actorDef);
			case URNModelPackage.ACTOR_REF__NODES:
				return nodes != null && !nodes.isEmpty();
			case URNModelPackage.ACTOR_REF__POS:
				return pos != null;
			case URNModelPackage.ACTOR_REF__SIZE:
				return size != null;
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
		result.append(" (actorDef: ");
		result.append(actorDef);
		result.append(", nodes: ");
		result.append(nodes);
		result.append(')');
		return result.toString();
	}

} //ActorRefImpl

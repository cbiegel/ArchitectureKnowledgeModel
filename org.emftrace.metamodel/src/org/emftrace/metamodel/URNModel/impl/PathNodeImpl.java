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

import org.emftrace.metamodel.URNModel.Label;
import org.emftrace.metamodel.URNModel.PathNode;
import org.emftrace.metamodel.URNModel.Position;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl#getSucc <em>Succ</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl#getContRef <em>Cont Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathNodeImpl extends UCMmodelElementImpl implements PathNode {
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
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pred;

	/**
	 * The cached value of the '{@link #getSucc() <em>Succ</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucc()
	 * @generated
	 * @ordered
	 */
	protected EList<String> succ;

	/**
	 * The default value of the '{@link #getContRef() <em>Cont Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContRef() <em>Cont Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContRef()
	 * @generated
	 * @ordered
	 */
	protected String contRef = CONT_REF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.PATH_NODE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.PATH_NODE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.PATH_NODE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.PATH_NODE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.PATH_NODE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPred() {
		if (pred == null) {
			pred = new EDataTypeEList<String>(String.class, this, URNModelPackage.PATH_NODE__PRED);
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSucc() {
		if (succ == null) {
			succ = new EDataTypeEList<String>(String.class, this, URNModelPackage.PATH_NODE__SUCC);
		}
		return succ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContRef() {
		return contRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContRef(String newContRef) {
		String oldContRef = contRef;
		contRef = newContRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.PATH_NODE__CONT_REF, oldContRef, contRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.PATH_NODE__POS, oldPos, newPos);
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
				msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.PATH_NODE__POS, null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.PATH_NODE__POS, null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.PATH_NODE__POS, newPos, newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.PATH_NODE__LABEL:
				return basicSetLabel(null, msgs);
			case URNModelPackage.PATH_NODE__POS:
				return basicSetPos(null, msgs);
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
			case URNModelPackage.PATH_NODE__LABEL:
				return getLabel();
			case URNModelPackage.PATH_NODE__PRED:
				return getPred();
			case URNModelPackage.PATH_NODE__SUCC:
				return getSucc();
			case URNModelPackage.PATH_NODE__CONT_REF:
				return getContRef();
			case URNModelPackage.PATH_NODE__POS:
				return getPos();
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
			case URNModelPackage.PATH_NODE__LABEL:
				setLabel((Label)newValue);
				return;
			case URNModelPackage.PATH_NODE__PRED:
				getPred().clear();
				getPred().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.PATH_NODE__SUCC:
				getSucc().clear();
				getSucc().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.PATH_NODE__CONT_REF:
				setContRef((String)newValue);
				return;
			case URNModelPackage.PATH_NODE__POS:
				setPos((Position)newValue);
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
			case URNModelPackage.PATH_NODE__LABEL:
				setLabel((Label)null);
				return;
			case URNModelPackage.PATH_NODE__PRED:
				getPred().clear();
				return;
			case URNModelPackage.PATH_NODE__SUCC:
				getSucc().clear();
				return;
			case URNModelPackage.PATH_NODE__CONT_REF:
				setContRef(CONT_REF_EDEFAULT);
				return;
			case URNModelPackage.PATH_NODE__POS:
				setPos((Position)null);
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
			case URNModelPackage.PATH_NODE__LABEL:
				return label != null;
			case URNModelPackage.PATH_NODE__PRED:
				return pred != null && !pred.isEmpty();
			case URNModelPackage.PATH_NODE__SUCC:
				return succ != null && !succ.isEmpty();
			case URNModelPackage.PATH_NODE__CONT_REF:
				return CONT_REF_EDEFAULT == null ? contRef != null : !CONT_REF_EDEFAULT.equals(contRef);
			case URNModelPackage.PATH_NODE__POS:
				return pos != null;
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
		result.append(" (pred: ");
		result.append(pred);
		result.append(", succ: ");
		result.append(succ);
		result.append(", contRef: ");
		result.append(contRef);
		result.append(')');
		return result.toString();
	}

} //PathNodeImpl

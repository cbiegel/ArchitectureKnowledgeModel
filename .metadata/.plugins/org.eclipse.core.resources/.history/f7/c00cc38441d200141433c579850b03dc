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

import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.ConcreteStyle;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorImpl#getCollapsedRefs <em>Collapsed Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorImpl#getActorRefs <em>Actor Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ActorImpl#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends GRLLinkableElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getCollapsedRefs() <em>Collapsed Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> collapsedRefs;

	/**
	 * The cached value of the '{@link #getActorRefs() <em>Actor Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actorRefs;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ConcreteStyle style;

	/**
	 * The cached value of the '{@link #getElems() <em>Elems</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCollapsedRefs() {
		if (collapsedRefs == null) {
			collapsedRefs = new EDataTypeEList<String>(String.class, this, URNModelPackage.ACTOR__COLLAPSED_REFS);
		}
		return collapsedRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActorRefs() {
		if (actorRefs == null) {
			actorRefs = new EDataTypeEList<String>(String.class, this, URNModelPackage.ACTOR__ACTOR_REFS);
		}
		return actorRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(ConcreteStyle newStyle, NotificationChain msgs) {
		ConcreteStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(ConcreteStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.ACTOR__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.ACTOR__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getElems() {
		if (elems == null) {
			elems = new EDataTypeEList<String>(String.class, this, URNModelPackage.ACTOR__ELEMS);
		}
		return elems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.ACTOR__STYLE:
				return basicSetStyle(null, msgs);
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
			case URNModelPackage.ACTOR__COLLAPSED_REFS:
				return getCollapsedRefs();
			case URNModelPackage.ACTOR__ACTOR_REFS:
				return getActorRefs();
			case URNModelPackage.ACTOR__STYLE:
				return getStyle();
			case URNModelPackage.ACTOR__ELEMS:
				return getElems();
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
			case URNModelPackage.ACTOR__COLLAPSED_REFS:
				getCollapsedRefs().clear();
				getCollapsedRefs().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.ACTOR__ACTOR_REFS:
				getActorRefs().clear();
				getActorRefs().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.ACTOR__STYLE:
				setStyle((ConcreteStyle)newValue);
				return;
			case URNModelPackage.ACTOR__ELEMS:
				getElems().clear();
				getElems().addAll((Collection<? extends String>)newValue);
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
			case URNModelPackage.ACTOR__COLLAPSED_REFS:
				getCollapsedRefs().clear();
				return;
			case URNModelPackage.ACTOR__ACTOR_REFS:
				getActorRefs().clear();
				return;
			case URNModelPackage.ACTOR__STYLE:
				setStyle((ConcreteStyle)null);
				return;
			case URNModelPackage.ACTOR__ELEMS:
				getElems().clear();
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
			case URNModelPackage.ACTOR__COLLAPSED_REFS:
				return collapsedRefs != null && !collapsedRefs.isEmpty();
			case URNModelPackage.ACTOR__ACTOR_REFS:
				return actorRefs != null && !actorRefs.isEmpty();
			case URNModelPackage.ACTOR__STYLE:
				return style != null;
			case URNModelPackage.ACTOR__ELEMS:
				return elems != null && !elems.isEmpty();
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
		result.append(" (collapsedRefs: ");
		result.append(collapsedRefs);
		result.append(", actorRefs: ");
		result.append(actorRefs);
		result.append(", elems: ");
		result.append(elems);
		result.append(')');
		return result.toString();
	}

} //ActorImpl

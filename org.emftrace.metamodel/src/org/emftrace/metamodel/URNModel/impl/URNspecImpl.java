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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.ConcreteURNspec;
import org.emftrace.metamodel.URNModel.GRLspec;
import org.emftrace.metamodel.URNModel.Metadata;
import org.emftrace.metamodel.URNModel.UCMspec;
import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.URNlink;
import org.emftrace.metamodel.URNModel.URNspec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UR Nspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getUcmspec <em>Ucmspec</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getUrnLinks <em>Urn Links</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URNspecImpl extends URNBaseImpl implements URNspec {
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
	 * The cached value of the '{@link #getUcmspec() <em>Ucmspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUcmspec()
	 * @generated
	 * @ordered
	 */
	protected UCMspec ucmspec;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The cached value of the '{@link #getUrnLinks() <em>Urn Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrnLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<URNlink> urnLinks;

	/**
	 * The cached value of the '{@link #getGrlspec() <em>Grlspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrlspec()
	 * @generated
	 * @ordered
	 */
	protected GRLspec grlspec;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected ConcreteURNspec info;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<Concern> concerns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URNspecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.UR_NSPEC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCMspec getUcmspec() {
		return ucmspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUcmspec(UCMspec newUcmspec, NotificationChain msgs) {
		UCMspec oldUcmspec = ucmspec;
		ucmspec = newUcmspec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__UCMSPEC, oldUcmspec, newUcmspec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUcmspec(UCMspec newUcmspec) {
		if (newUcmspec != ucmspec) {
			NotificationChain msgs = null;
			if (ucmspec != null)
				msgs = ((InternalEObject)ucmspec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__UCMSPEC, null, msgs);
			if (newUcmspec != null)
				msgs = ((InternalEObject)newUcmspec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__UCMSPEC, null, msgs);
			msgs = basicSetUcmspec(newUcmspec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__UCMSPEC, newUcmspec, newUcmspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, URNModelPackage.UR_NSPEC__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URNlink> getUrnLinks() {
		if (urnLinks == null) {
			urnLinks = new EObjectContainmentEList<URNlink>(URNlink.class, this, URNModelPackage.UR_NSPEC__URN_LINKS);
		}
		return urnLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRLspec getGrlspec() {
		return grlspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrlspec(GRLspec newGrlspec, NotificationChain msgs) {
		GRLspec oldGrlspec = grlspec;
		grlspec = newGrlspec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__GRLSPEC, oldGrlspec, newGrlspec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrlspec(GRLspec newGrlspec) {
		if (newGrlspec != grlspec) {
			NotificationChain msgs = null;
			if (grlspec != null)
				msgs = ((InternalEObject)grlspec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__GRLSPEC, null, msgs);
			if (newGrlspec != null)
				msgs = ((InternalEObject)newGrlspec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__GRLSPEC, null, msgs);
			msgs = basicSetGrlspec(newGrlspec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__GRLSPEC, newGrlspec, newGrlspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteURNspec getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(ConcreteURNspec newInfo, NotificationChain msgs) {
		ConcreteURNspec oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(ConcreteURNspec newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.UR_NSPEC__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NSPEC__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentEList<Concern>(Concern.class, this, URNModelPackage.UR_NSPEC__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.UR_NSPEC__UCMSPEC:
				return basicSetUcmspec(null, msgs);
			case URNModelPackage.UR_NSPEC__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case URNModelPackage.UR_NSPEC__URN_LINKS:
				return ((InternalEList<?>)getUrnLinks()).basicRemove(otherEnd, msgs);
			case URNModelPackage.UR_NSPEC__GRLSPEC:
				return basicSetGrlspec(null, msgs);
			case URNModelPackage.UR_NSPEC__INFO:
				return basicSetInfo(null, msgs);
			case URNModelPackage.UR_NSPEC__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
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
			case URNModelPackage.UR_NSPEC__NAME:
				return getName();
			case URNModelPackage.UR_NSPEC__UCMSPEC:
				return getUcmspec();
			case URNModelPackage.UR_NSPEC__METADATA:
				return getMetadata();
			case URNModelPackage.UR_NSPEC__URN_LINKS:
				return getUrnLinks();
			case URNModelPackage.UR_NSPEC__GRLSPEC:
				return getGrlspec();
			case URNModelPackage.UR_NSPEC__INFO:
				return getInfo();
			case URNModelPackage.UR_NSPEC__CONCERNS:
				return getConcerns();
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
			case URNModelPackage.UR_NSPEC__NAME:
				setName((String)newValue);
				return;
			case URNModelPackage.UR_NSPEC__UCMSPEC:
				setUcmspec((UCMspec)newValue);
				return;
			case URNModelPackage.UR_NSPEC__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case URNModelPackage.UR_NSPEC__URN_LINKS:
				getUrnLinks().clear();
				getUrnLinks().addAll((Collection<? extends URNlink>)newValue);
				return;
			case URNModelPackage.UR_NSPEC__GRLSPEC:
				setGrlspec((GRLspec)newValue);
				return;
			case URNModelPackage.UR_NSPEC__INFO:
				setInfo((ConcreteURNspec)newValue);
				return;
			case URNModelPackage.UR_NSPEC__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends Concern>)newValue);
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
			case URNModelPackage.UR_NSPEC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case URNModelPackage.UR_NSPEC__UCMSPEC:
				setUcmspec((UCMspec)null);
				return;
			case URNModelPackage.UR_NSPEC__METADATA:
				getMetadata().clear();
				return;
			case URNModelPackage.UR_NSPEC__URN_LINKS:
				getUrnLinks().clear();
				return;
			case URNModelPackage.UR_NSPEC__GRLSPEC:
				setGrlspec((GRLspec)null);
				return;
			case URNModelPackage.UR_NSPEC__INFO:
				setInfo((ConcreteURNspec)null);
				return;
			case URNModelPackage.UR_NSPEC__CONCERNS:
				getConcerns().clear();
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
			case URNModelPackage.UR_NSPEC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case URNModelPackage.UR_NSPEC__UCMSPEC:
				return ucmspec != null;
			case URNModelPackage.UR_NSPEC__METADATA:
				return metadata != null && !metadata.isEmpty();
			case URNModelPackage.UR_NSPEC__URN_LINKS:
				return urnLinks != null && !urnLinks.isEmpty();
			case URNModelPackage.UR_NSPEC__GRLSPEC:
				return grlspec != null;
			case URNModelPackage.UR_NSPEC__INFO:
				return info != null;
			case URNModelPackage.UR_NSPEC__CONCERNS:
				return concerns != null && !concerns.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //URNspecImpl

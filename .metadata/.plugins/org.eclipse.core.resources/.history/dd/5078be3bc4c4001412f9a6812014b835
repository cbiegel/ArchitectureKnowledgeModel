/**
 */
package org.emftrace.metamodel.EMFfitModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.Factor;
import org.emftrace.metamodel.EMFfitModel.Hypertext;
import org.emftrace.metamodel.EMFfitModel.InfluencingFactor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influencing Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.InfluencingFactorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.InfluencingFactorImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluencingFactorImpl extends FTICBaseImpl implements InfluencingFactor {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Hypertext description;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Factor factor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluencingFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.INFLUENCING_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Hypertext newDescription, NotificationChain msgs) {
		Hypertext oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Hypertext newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject)factor;
			factor = (Factor)eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Factor newFactor) {
		Factor oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION:
				return getDescription();
			case EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
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
			case EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION:
				setDescription((Hypertext)newValue);
				return;
			case EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR:
				setFactor((Factor)newValue);
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
			case EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION:
				setDescription((Hypertext)null);
				return;
			case EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR:
				setFactor((Factor)null);
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
			case EMFfitModelPackage.INFLUENCING_FACTOR__DESCRIPTION:
				return description != null;
			case EMFfitModelPackage.INFLUENCING_FACTOR__FACTOR:
				return factor != null;
		}
		return super.eIsSet(featureID);
	}

} //InfluencingFactorImpl

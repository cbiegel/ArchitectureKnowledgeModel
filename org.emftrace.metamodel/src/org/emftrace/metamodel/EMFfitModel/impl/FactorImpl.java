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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorImpl#getFlexibility <em>Flexibility</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorImpl#getChangeability <em>Changeability</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorImpl#getInfluence <em>Influence</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorImpl extends FTEntryImpl implements Factor {
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
	 * The cached value of the '{@link #getFlexibility() <em>Flexibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexibility()
	 * @generated
	 * @ordered
	 */
	protected Hypertext flexibility;

	/**
	 * The cached value of the '{@link #getChangeability() <em>Changeability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeability()
	 * @generated
	 * @ordered
	 */
	protected Hypertext changeability;

	/**
	 * The cached value of the '{@link #getInfluence() <em>Influence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluence()
	 * @generated
	 * @ordered
	 */
	protected Hypertext influence;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.FACTOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext getFlexibility() {
		return flexibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlexibility(Hypertext newFlexibility, NotificationChain msgs) {
		Hypertext oldFlexibility = flexibility;
		flexibility = newFlexibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__FLEXIBILITY, oldFlexibility, newFlexibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlexibility(Hypertext newFlexibility) {
		if (newFlexibility != flexibility) {
			NotificationChain msgs = null;
			if (flexibility != null)
				msgs = ((InternalEObject)flexibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__FLEXIBILITY, null, msgs);
			if (newFlexibility != null)
				msgs = ((InternalEObject)newFlexibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__FLEXIBILITY, null, msgs);
			msgs = basicSetFlexibility(newFlexibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__FLEXIBILITY, newFlexibility, newFlexibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext getChangeability() {
		return changeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeability(Hypertext newChangeability, NotificationChain msgs) {
		Hypertext oldChangeability = changeability;
		changeability = newChangeability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__CHANGEABILITY, oldChangeability, newChangeability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeability(Hypertext newChangeability) {
		if (newChangeability != changeability) {
			NotificationChain msgs = null;
			if (changeability != null)
				msgs = ((InternalEObject)changeability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__CHANGEABILITY, null, msgs);
			if (newChangeability != null)
				msgs = ((InternalEObject)newChangeability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__CHANGEABILITY, null, msgs);
			msgs = basicSetChangeability(newChangeability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__CHANGEABILITY, newChangeability, newChangeability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext getInfluence() {
		return influence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfluence(Hypertext newInfluence, NotificationChain msgs) {
		Hypertext oldInfluence = influence;
		influence = newInfluence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__INFLUENCE, oldInfluence, newInfluence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluence(Hypertext newInfluence) {
		if (newInfluence != influence) {
			NotificationChain msgs = null;
			if (influence != null)
				msgs = ((InternalEObject)influence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__INFLUENCE, null, msgs);
			if (newInfluence != null)
				msgs = ((InternalEObject)newInfluence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.FACTOR__INFLUENCE, null, msgs);
			msgs = basicSetInfluence(newInfluence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__INFLUENCE, newInfluence, newInfluence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
				return basicSetFlexibility(null, msgs);
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
				return basicSetChangeability(null, msgs);
			case EMFfitModelPackage.FACTOR__INFLUENCE:
				return basicSetInfluence(null, msgs);
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
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
				return getDescription();
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
				return getFlexibility();
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
				return getChangeability();
			case EMFfitModelPackage.FACTOR__INFLUENCE:
				return getInfluence();
			case EMFfitModelPackage.FACTOR__PRIORITY:
				return getPriority();
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
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
				setDescription((Hypertext)newValue);
				return;
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
				setFlexibility((Hypertext)newValue);
				return;
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
				setChangeability((Hypertext)newValue);
				return;
			case EMFfitModelPackage.FACTOR__INFLUENCE:
				setInfluence((Hypertext)newValue);
				return;
			case EMFfitModelPackage.FACTOR__PRIORITY:
				setPriority((String)newValue);
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
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
				setDescription((Hypertext)null);
				return;
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
				setFlexibility((Hypertext)null);
				return;
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
				setChangeability((Hypertext)null);
				return;
			case EMFfitModelPackage.FACTOR__INFLUENCE:
				setInfluence((Hypertext)null);
				return;
			case EMFfitModelPackage.FACTOR__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
				return description != null;
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
				return flexibility != null;
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
				return changeability != null;
			case EMFfitModelPackage.FACTOR__INFLUENCE:
				return influence != null;
			case EMFfitModelPackage.FACTOR__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //FactorImpl

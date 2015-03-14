/**
 */
package org.emftrace.metamodel.EMFfitModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.Hypertext;
import org.emftrace.metamodel.EMFfitModel.Item;
import org.emftrace.metamodel.EMFfitModel.RelatedIssue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.RelatedIssueImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.RelatedIssueImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedIssueImpl extends FTICBaseImpl implements RelatedIssue {
	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected Item issue;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.RELATED_ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getIssue() {
		if (issue != null && issue.eIsProxy()) {
			InternalEObject oldIssue = (InternalEObject)issue;
			issue = (Item)eResolveProxy(oldIssue);
			if (issue != oldIssue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFfitModelPackage.RELATED_ISSUE__ISSUE, oldIssue, issue));
			}
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(Item newIssue) {
		Item oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.RELATED_ISSUE__ISSUE, oldIssue, issue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION:
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
			case EMFfitModelPackage.RELATED_ISSUE__ISSUE:
				if (resolve) return getIssue();
				return basicGetIssue();
			case EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION:
				return getDescription();
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
			case EMFfitModelPackage.RELATED_ISSUE__ISSUE:
				setIssue((Item)newValue);
				return;
			case EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION:
				setDescription((Hypertext)newValue);
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
			case EMFfitModelPackage.RELATED_ISSUE__ISSUE:
				setIssue((Item)null);
				return;
			case EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION:
				setDescription((Hypertext)null);
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
			case EMFfitModelPackage.RELATED_ISSUE__ISSUE:
				return issue != null;
			case EMFfitModelPackage.RELATED_ISSUE__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatedIssueImpl

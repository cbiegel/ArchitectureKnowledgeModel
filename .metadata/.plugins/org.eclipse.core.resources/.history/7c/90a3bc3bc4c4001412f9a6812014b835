/**
 */
package org.emftrace.metamodel.EMFfitModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.Hypertext;
import org.emftrace.metamodel.EMFfitModel.InfluencingFactor;
import org.emftrace.metamodel.EMFfitModel.IssueCard;
import org.emftrace.metamodel.EMFfitModel.RelatedIssue;
import org.emftrace.metamodel.EMFfitModel.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getInfluencingFactors <em>Influencing Factors</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.IssueCardImpl#getRelatedIssues <em>Related Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueCardImpl extends ItemImpl implements IssueCard {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Hypertext description;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Hypertext solution;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategies;

	/**
	 * The cached value of the '{@link #getInfluencingFactors() <em>Influencing Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencingFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<InfluencingFactor> influencingFactors;

	/**
	 * The cached value of the '{@link #getRelatedIssues() <em>Related Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedIssue> relatedIssues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.ISSUE_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.ISSUE_CARD__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.ISSUE_CARD__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.ISSUE_CARD__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.ISSUE_CARD__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.ISSUE_CARD__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext getSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Hypertext newSolution, NotificationChain msgs) {
		Hypertext oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.ISSUE_CARD__SOLUTION, oldSolution, newSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Hypertext newSolution) {
		if (newSolution != solution) {
			NotificationChain msgs = null;
			if (solution != null)
				msgs = ((InternalEObject)solution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.ISSUE_CARD__SOLUTION, null, msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFfitModelPackage.ISSUE_CARD__SOLUTION, null, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.ISSUE_CARD__SOLUTION, newSolution, newSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, EMFfitModelPackage.ISSUE_CARD__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluencingFactor> getInfluencingFactors() {
		if (influencingFactors == null) {
			influencingFactors = new EObjectContainmentEList<InfluencingFactor>(InfluencingFactor.class, this, EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS);
		}
		return influencingFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedIssue> getRelatedIssues() {
		if (relatedIssues == null) {
			relatedIssues = new EObjectContainmentEList<RelatedIssue>(RelatedIssue.class, this, EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES);
		}
		return relatedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.ISSUE_CARD__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EMFfitModelPackage.ISSUE_CARD__SOLUTION:
				return basicSetSolution(null, msgs);
			case EMFfitModelPackage.ISSUE_CARD__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS:
				return ((InternalEList<?>)getInfluencingFactors()).basicRemove(otherEnd, msgs);
			case EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES:
				return ((InternalEList<?>)getRelatedIssues()).basicRemove(otherEnd, msgs);
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
			case EMFfitModelPackage.ISSUE_CARD__NAME:
				return getName();
			case EMFfitModelPackage.ISSUE_CARD__DESCRIPTION:
				return getDescription();
			case EMFfitModelPackage.ISSUE_CARD__SOLUTION:
				return getSolution();
			case EMFfitModelPackage.ISSUE_CARD__STRATEGIES:
				return getStrategies();
			case EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS:
				return getInfluencingFactors();
			case EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES:
				return getRelatedIssues();
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
			case EMFfitModelPackage.ISSUE_CARD__NAME:
				setName((String)newValue);
				return;
			case EMFfitModelPackage.ISSUE_CARD__DESCRIPTION:
				setDescription((Hypertext)newValue);
				return;
			case EMFfitModelPackage.ISSUE_CARD__SOLUTION:
				setSolution((Hypertext)newValue);
				return;
			case EMFfitModelPackage.ISSUE_CARD__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS:
				getInfluencingFactors().clear();
				getInfluencingFactors().addAll((Collection<? extends InfluencingFactor>)newValue);
				return;
			case EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES:
				getRelatedIssues().clear();
				getRelatedIssues().addAll((Collection<? extends RelatedIssue>)newValue);
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
			case EMFfitModelPackage.ISSUE_CARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFfitModelPackage.ISSUE_CARD__DESCRIPTION:
				setDescription((Hypertext)null);
				return;
			case EMFfitModelPackage.ISSUE_CARD__SOLUTION:
				setSolution((Hypertext)null);
				return;
			case EMFfitModelPackage.ISSUE_CARD__STRATEGIES:
				getStrategies().clear();
				return;
			case EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS:
				getInfluencingFactors().clear();
				return;
			case EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES:
				getRelatedIssues().clear();
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
			case EMFfitModelPackage.ISSUE_CARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFfitModelPackage.ISSUE_CARD__DESCRIPTION:
				return description != null;
			case EMFfitModelPackage.ISSUE_CARD__SOLUTION:
				return solution != null;
			case EMFfitModelPackage.ISSUE_CARD__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case EMFfitModelPackage.ISSUE_CARD__INFLUENCING_FACTORS:
				return influencingFactors != null && !influencingFactors.isEmpty();
			case EMFfitModelPackage.ISSUE_CARD__RELATED_ISSUES:
				return relatedIssues != null && !relatedIssues.isEmpty();
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

} //IssueCardImpl

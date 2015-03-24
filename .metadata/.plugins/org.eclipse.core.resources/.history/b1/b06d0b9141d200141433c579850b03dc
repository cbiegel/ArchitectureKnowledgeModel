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
import org.emftrace.metamodel.EMFfitModel.FTICPackage;
import org.emftrace.metamodel.EMFfitModel.FactorTable;
import org.emftrace.metamodel.EMFfitModel.IssueCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTIC Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTICPackageImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTICPackageImpl#getIssueCards <em>Issue Cards</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTICPackageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FTICPackageImpl extends FTICBaseImpl implements FTICPackage {
	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<FactorTable> tables;

	/**
	 * The cached value of the '{@link #getIssueCards() <em>Issue Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueCards()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueCard> issueCards;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTICPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.FTIC_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactorTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<FactorTable>(FactorTable.class, this, EMFfitModelPackage.FTIC_PACKAGE__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueCard> getIssueCards() {
		if (issueCards == null) {
			issueCards = new EObjectContainmentEList<IssueCard>(IssueCard.class, this, EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS);
		}
		return issueCards;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FTIC_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.FTIC_PACKAGE__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS:
				return ((InternalEList<?>)getIssueCards()).basicRemove(otherEnd, msgs);
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
			case EMFfitModelPackage.FTIC_PACKAGE__TABLES:
				return getTables();
			case EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS:
				return getIssueCards();
			case EMFfitModelPackage.FTIC_PACKAGE__NAME:
				return getName();
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
			case EMFfitModelPackage.FTIC_PACKAGE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends FactorTable>)newValue);
				return;
			case EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS:
				getIssueCards().clear();
				getIssueCards().addAll((Collection<? extends IssueCard>)newValue);
				return;
			case EMFfitModelPackage.FTIC_PACKAGE__NAME:
				setName((String)newValue);
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
			case EMFfitModelPackage.FTIC_PACKAGE__TABLES:
				getTables().clear();
				return;
			case EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS:
				getIssueCards().clear();
				return;
			case EMFfitModelPackage.FTIC_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case EMFfitModelPackage.FTIC_PACKAGE__TABLES:
				return tables != null && !tables.isEmpty();
			case EMFfitModelPackage.FTIC_PACKAGE__ISSUE_CARDS:
				return issueCards != null && !issueCards.isEmpty();
			case EMFfitModelPackage.FTIC_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FTICPackageImpl

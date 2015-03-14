/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern Based Drawback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedDrawbackImpl#getConcern <em>Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcernBasedDrawbackImpl extends DrawbackImpl implements ConcernBasedDrawback {
	/**
	 * The default value of the '{@link #getConcern() <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcern() <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected String concern = CONCERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernBasedDrawbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureKnowledgeModelPackage.Literals.CONCERN_BASED_DRAWBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcern() {
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(String newConcern) {
		String oldConcern = concern;
		concern = newConcern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK__CONCERN, oldConcern, concern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK__CONCERN:
				return getConcern();
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
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK__CONCERN:
				setConcern((String)newValue);
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
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK__CONCERN:
				setConcern(CONCERN_EDEFAULT);
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
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK__CONCERN:
				return CONCERN_EDEFAULT == null ? concern != null : !CONCERN_EDEFAULT.equals(concern);
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
		result.append(" (Concern: ");
		result.append(concern);
		result.append(')');
		return result.toString();
	}

} //ConcernBasedDrawbackImpl

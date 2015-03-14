/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl#getProgrammingLanguage <em>Programming Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentEnvironmentImpl extends RelationSourceTypeImpl implements DevelopmentEnvironment {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammingLanguage() <em>Programming Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammingLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> programmingLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureKnowledgeModelPackage.Literals.DEVELOPMENT_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProgrammingLanguage() {
		if (programmingLanguage == null) {
			programmingLanguage = new EDataTypeUniqueEList<String>(String.class, this, ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE);
		}
		return programmingLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__DESCRIPTION:
				return getDescription();
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE:
				return getProgrammingLanguage();
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
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE:
				getProgrammingLanguage().clear();
				getProgrammingLanguage().addAll((Collection<? extends String>)newValue);
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
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE:
				getProgrammingLanguage().clear();
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
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArchitectureKnowledgeModelPackage.DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE:
				return programmingLanguage != null && !programmingLanguage.isEmpty();
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
		result.append(" (Description: ");
		result.append(description);
		result.append(", ProgrammingLanguage: ");
		result.append(programmingLanguage);
		result.append(')');
		return result.toString();
	}

} //DevelopmentEnvironmentImpl

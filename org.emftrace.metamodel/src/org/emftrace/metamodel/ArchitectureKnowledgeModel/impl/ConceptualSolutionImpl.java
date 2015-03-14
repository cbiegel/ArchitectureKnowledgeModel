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
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl#getVariation <em>Variation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualSolutionImpl extends RelationSourceTypeImpl implements ConceptualSolution {
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
	 * The cached value of the '{@link #getVariation() <em>Variation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureKnowledgeModelPackage.Literals.CONCEPTUAL_SOLUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariation() {
		if (variation == null) {
			variation = new EDataTypeUniqueEList<String>(String.class, this, ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__VARIATION);
		}
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__DESCRIPTION:
				return getDescription();
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__VARIATION:
				return getVariation();
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__VARIATION:
				getVariation().clear();
				getVariation().addAll((Collection<? extends String>)newValue);
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__VARIATION:
				getVariation().clear();
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION__VARIATION:
				return variation != null && !variation.isEmpty();
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
		result.append(", Variation: ");
		result.append(variation);
		result.append(')');
		return result.toString();
	}

} //ConceptualSolutionImpl

/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Solution Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl#getConceptualSolution <em>Conceptual Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualSolutionCatalogImpl extends ArchitectureKnowledgeModelBaseImpl implements ConceptualSolutionCatalog {
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
	 * The cached value of the '{@link #getConceptualSolution() <em>Conceptual Solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualSolution> conceptualSolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureKnowledgeModelPackage.Literals.CONCEPTUAL_SOLUTION_CATALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualSolution> getConceptualSolution() {
		if (conceptualSolution == null) {
			conceptualSolution = new EObjectContainmentEList<ConceptualSolution>(ConceptualSolution.class, this, ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION);
		}
		return conceptualSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION:
				return ((InternalEList<?>)getConceptualSolution()).basicRemove(otherEnd, msgs);
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION:
				return getDescription();
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION:
				return getConceptualSolution();
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION:
				getConceptualSolution().clear();
				getConceptualSolution().addAll((Collection<? extends ConceptualSolution>)newValue);
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION:
				getConceptualSolution().clear();
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
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArchitectureKnowledgeModelPackage.CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION:
				return conceptualSolution != null && !conceptualSolution.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ConceptualSolutionCatalogImpl

/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getVariation <em>Variation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getConceptualSolution()
 * @model
 * @generated
 */
public interface ConceptualSolution extends RelationSourceType, RelationTargetType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getConceptualSolution_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Variation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation</em>' attribute list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getConceptualSolution_Variation()
	 * @model
	 * @generated
	 */
	EList<String> getVariation();

} // ConceptualSolution

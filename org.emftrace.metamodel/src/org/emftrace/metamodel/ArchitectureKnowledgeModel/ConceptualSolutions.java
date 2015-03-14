/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Solutions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions#getConceptualSolutions <em>Conceptual Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getConceptualSolutions()
 * @model
 * @generated
 */
public interface ConceptualSolutions extends ArchitectureKnowledgeModelBase {
	/**
	 * Returns the value of the '<em><b>Conceptual Solutions</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Solutions</em>' reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getConceptualSolutions_ConceptualSolutions()
	 * @model
	 * @generated
	 */
	EList<ConceptualSolution> getConceptualSolutions();

} // ConceptualSolutions

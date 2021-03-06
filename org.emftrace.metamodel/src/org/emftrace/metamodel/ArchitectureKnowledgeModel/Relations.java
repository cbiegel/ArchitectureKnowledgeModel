/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations#getSolutionAndFeatureRelation <em>Solution And Feature Relation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations#getASTARelation <em>ASTA Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelations()
 * @model
 * @generated
 */
public interface Relations extends ArchitectureKnowledgeModelBase {
	/**
	 * Returns the value of the '<em><b>Solution And Feature Relation</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution And Feature Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution And Feature Relation</em>' reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelations_SolutionAndFeatureRelation()
	 * @model
	 * @generated
	 */
	EList<TechnologySolutionRelation> getSolutionAndFeatureRelation();

	/**
	 * Returns the value of the '<em><b>ASTA Relation</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTARelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASTA Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASTA Relation</em>' reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelations_ASTARelation()
	 * @model
	 * @generated
	 */
	EList<ASTARelation> getASTARelation();

} // Relations

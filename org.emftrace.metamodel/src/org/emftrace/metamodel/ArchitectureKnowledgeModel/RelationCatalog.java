/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelationCatalog()
 * @model
 * @generated
 */
public interface RelationCatalog extends ArchitectureKnowledgeModelBase {
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
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelationCatalog_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getRelationCatalog_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechnologySolutionRelation> getRelation();

} // RelationCatalog

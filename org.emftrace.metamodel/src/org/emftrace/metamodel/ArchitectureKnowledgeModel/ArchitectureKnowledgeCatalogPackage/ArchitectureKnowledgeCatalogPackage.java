/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage;

import org.eclipse.emf.ecore.EObject;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Knowledge Catalog Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getTechnologySolutionCatalog <em>Technology Solution Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getTechnologyFeatureCatalog <em>Technology Feature Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getASTACatalog <em>ASTA Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getRelationCatalog <em>Relation Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage#getArchitectureKnowledgeCatalogPackage()
 * @model
 * @generated
 */
public interface ArchitectureKnowledgeCatalogPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Technology Solution Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Solution Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Solution Catalog</em>' containment reference.
	 * @see #setTechnologySolutionCatalog(TechnologySolutionCatalog)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage#getArchitectureKnowledgeCatalogPackage_TechnologySolutionCatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TechnologySolutionCatalog getTechnologySolutionCatalog();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getTechnologySolutionCatalog <em>Technology Solution Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Solution Catalog</em>' containment reference.
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 */
	void setTechnologySolutionCatalog(TechnologySolutionCatalog value);

	/**
	 * Returns the value of the '<em><b>Technology Feature Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Feature Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Feature Catalog</em>' containment reference.
	 * @see #setTechnologyFeatureCatalog(TechnologyFeatureCatalog)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage#getArchitectureKnowledgeCatalogPackage_TechnologyFeatureCatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TechnologyFeatureCatalog getTechnologyFeatureCatalog();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getTechnologyFeatureCatalog <em>Technology Feature Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Feature Catalog</em>' containment reference.
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 */
	void setTechnologyFeatureCatalog(TechnologyFeatureCatalog value);

	/**
	 * Returns the value of the '<em><b>ASTA Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASTA Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASTA Catalog</em>' containment reference.
	 * @see #setASTACatalog(ASTACatalog)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage#getArchitectureKnowledgeCatalogPackage_ASTACatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ASTACatalog getASTACatalog();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getASTACatalog <em>ASTA Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ASTA Catalog</em>' containment reference.
	 * @see #getASTACatalog()
	 * @generated
	 */
	void setASTACatalog(ASTACatalog value);

	/**
	 * Returns the value of the '<em><b>Relation Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Catalog</em>' containment reference.
	 * @see #setRelationCatalog(RelationCatalog)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage#getArchitectureKnowledgeCatalogPackage_RelationCatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationCatalog getRelationCatalog();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackage#getRelationCatalog <em>Relation Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Catalog</em>' containment reference.
	 * @see #getRelationCatalog()
	 * @generated
	 */
	void setRelationCatalog(RelationCatalog value);

} // ArchitectureKnowledgeCatalogPackage

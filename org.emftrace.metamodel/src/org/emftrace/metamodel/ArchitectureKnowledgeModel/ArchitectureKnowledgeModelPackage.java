/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitectureKnowledgeModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ArchitectureKnowledgeModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ArchitectureKnowledgeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArchitectureKnowledgeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureKnowledgeModelPackage eINSTANCE = org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelBaseImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getArchitectureKnowledgeModelBase()
	 * @generated
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL_BASE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelImpl <em>Architecture Knowledge Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getArchitectureKnowledgeModel()
	 * @generated
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__VERSION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conceptual Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Development Environments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Architecture Knowledge Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_KNOWLEDGE_MODEL_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionCatalogImpl <em>Technology Solution Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionCatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolutionCatalog()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION_CATALOG = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__TECHNOLOGY_SOLUTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Solution Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl <em>Technology Feature Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologyFeatureCatalog()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE_CATALOG = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Feature Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationCatalogImpl <em>Relation Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationCatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationCatalog()
	 * @generated
	 */
	int RELATION_CATALOG = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__RELATION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTACatalogImpl <em>ASTA Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTACatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getASTACatalog()
	 * @generated
	 */
	int ASTA_CATALOG = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ASTA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__ASTA = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ASTA Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl <em>Conceptual Solution Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolutionCatalog()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTION_CATALOG = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conceptual Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Solution Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentCatalogImpl <em>Development Environment Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentCatalogImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Development Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__DEVELOPMENT_ENVIRONMENT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Environment Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionsImpl <em>Technology Solutions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionsImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolutions()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTIONS = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Technology Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technology Solutions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationSourceTypeImpl <em>Relation Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationSourceTypeImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationSourceType()
	 * @generated
	 */
	int RELATION_SOURCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Relation Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionImpl <em>Technology Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolution()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__FEATURES = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__RELATIONS = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Technology Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureImpl <em>Technology Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologyFeature()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__CAPABILITY_TYPE = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ASTA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__ASTA = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__RELATIONS = RELATION_SOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Technology Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTAImpl <em>ASTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTAImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getASTA()
	 * @generated
	 */
	int ASTA = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__CONDITION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__CAPABILITY_TYPE = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ASTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.BenefitImpl <em>Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.BenefitImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getBenefit()
	 * @generated
	 */
	int BENEFIT = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__ID = ASTA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__NAME = ASTA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__DESCRIPTION = ASTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__CONDITION = ASTA__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__CAPABILITY_TYPE = ASTA__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_FEATURE_COUNT = ASTA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedBenefitImpl <em>Feature Based Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedBenefitImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getFeatureBasedBenefit()
	 * @generated
	 */
	int FEATURE_BASED_BENEFIT = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__ID = BENEFIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__NAME = BENEFIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__DESCRIPTION = BENEFIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__CONDITION = BENEFIT__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__CAPABILITY_TYPE = BENEFIT__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Feature Based Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT_FEATURE_COUNT = BENEFIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedBenefitImpl <em>Concern Based Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedBenefitImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConcernBasedBenefit()
	 * @generated
	 */
	int CONCERN_BASED_BENEFIT = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__ID = BENEFIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__NAME = BENEFIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__DESCRIPTION = BENEFIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CONDITION = BENEFIT__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CAPABILITY_TYPE = BENEFIT__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CONCERN = BENEFIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Based Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT_FEATURE_COUNT = BENEFIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DrawbackImpl <em>Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DrawbackImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDrawback()
	 * @generated
	 */
	int DRAWBACK = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__ID = ASTA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__NAME = ASTA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__DESCRIPTION = ASTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__CONDITION = ASTA__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__CAPABILITY_TYPE = ASTA__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK_FEATURE_COUNT = ASTA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedDrawbackImpl <em>Feature Based Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedDrawbackImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getFeatureBasedDrawback()
	 * @generated
	 */
	int FEATURE_BASED_DRAWBACK = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__ID = DRAWBACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__NAME = DRAWBACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__DESCRIPTION = DRAWBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__CONDITION = DRAWBACK__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__CAPABILITY_TYPE = DRAWBACK__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Feature Based Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedDrawbackImpl <em>Concern Based Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedDrawbackImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConcernBasedDrawback()
	 * @generated
	 */
	int CONCERN_BASED_DRAWBACK = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__ID = DRAWBACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__NAME = DRAWBACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__DESCRIPTION = DRAWBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CONDITION = DRAWBACK__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CAPABILITY_TYPE = DRAWBACK__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CONCERN = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Based Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionsImpl <em>Conceptual Solutions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionsImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolutions()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTIONS = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Conceptual Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conceptual Solutions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl <em>Conceptual Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolution()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTION = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__VARIATION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentsImpl <em>Development Environments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentsImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironments()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENTS = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Development Environments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Development Environments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironment()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENT = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationsImpl <em>Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationsImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelations()
	 * @generated
	 */
	int RELATIONS = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__RELATIONS = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DESCRIPTION = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE_ELEMENT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET_ELEMENT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationTargetTypeImpl <em>Relation Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationTargetTypeImpl
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationTargetType()
	 * @generated
	 */
	int RELATION_TARGET_TYPE = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE__ID = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE__NAME = ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Relation Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE_FEATURE_COUNT = ARCHITECTURE_KNOWLEDGE_MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType <em>Capability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getCapabilityType()
	 * @generated
	 */
	int CAPABILITY_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 27;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getID()
	 * @generated
	 */
	int ID = 28;


	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase
	 * @generated
	 */
	EClass getArchitectureKnowledgeModelBase();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getID()
	 * @see #getArchitectureKnowledgeModelBase()
	 * @generated
	 */
	EAttribute getArchitectureKnowledgeModelBase_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getName()
	 * @see #getArchitectureKnowledgeModelBase()
	 * @generated
	 */
	EAttribute getArchitectureKnowledgeModelBase_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel <em>Architecture Knowledge Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Knowledge Model</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel
	 * @generated
	 */
	EClass getArchitectureKnowledgeModel();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getVersion()
	 * @see #getArchitectureKnowledgeModel()
	 * @generated
	 */
	EAttribute getArchitectureKnowledgeModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getTechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Solutions</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getTechnologySolutions()
	 * @see #getArchitectureKnowledgeModel()
	 * @generated
	 */
	EReference getArchitectureKnowledgeModel_TechnologySolutions();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getConceptualSolutions()
	 * @see #getArchitectureKnowledgeModel()
	 * @generated
	 */
	EReference getArchitectureKnowledgeModel_ConceptualSolutions();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getDevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getDevelopmentEnvironments()
	 * @see #getArchitectureKnowledgeModel()
	 * @generated
	 */
	EReference getArchitectureKnowledgeModel_DevelopmentEnvironments();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel#getRelations()
	 * @see #getArchitectureKnowledgeModel()
	 * @generated
	 */
	EReference getArchitectureKnowledgeModel_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog <em>Technology Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog
	 * @generated
	 */
	EClass getTechnologySolutionCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog#getDescription()
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 */
	EAttribute getTechnologySolutionCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog#getTechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technology Solution</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog#getTechnologySolution()
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 */
	EReference getTechnologySolutionCatalog_TechnologySolution();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog <em>Technology Feature Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog
	 * @generated
	 */
	EClass getTechnologyFeatureCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog#getDescription()
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 */
	EAttribute getTechnologyFeatureCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog#getTechnologyFeature <em>Technology Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technology Feature</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog#getTechnologyFeature()
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 */
	EReference getTechnologyFeatureCatalog_TechnologyFeature();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog <em>Relation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog
	 * @generated
	 */
	EClass getRelationCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getDescription()
	 * @see #getRelationCatalog()
	 * @generated
	 */
	EAttribute getRelationCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog#getRelation()
	 * @see #getRelationCatalog()
	 * @generated
	 */
	EReference getRelationCatalog_Relation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog <em>ASTA Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASTA Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog
	 * @generated
	 */
	EClass getASTACatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog#getDescription()
	 * @see #getASTACatalog()
	 * @generated
	 */
	EAttribute getASTACatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog#getASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog#getASTA()
	 * @see #getASTACatalog()
	 * @generated
	 */
	EReference getASTACatalog_ASTA();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog <em>Conceptual Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solution Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog
	 * @generated
	 */
	EClass getConceptualSolutionCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog#getDescription()
	 * @see #getConceptualSolutionCatalog()
	 * @generated
	 */
	EAttribute getConceptualSolutionCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog#getConceptualSolution <em>Conceptual Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptual Solution</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog#getConceptualSolution()
	 * @see #getConceptualSolutionCatalog()
	 * @generated
	 */
	EReference getConceptualSolutionCatalog_ConceptualSolution();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog <em>Development Environment Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environment Catalog</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog
	 * @generated
	 */
	EClass getDevelopmentEnvironmentCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog#getDescription()
	 * @see #getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironmentCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog#getDevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Development Environment</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog#getDevelopmentEnvironment()
	 * @see #getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	EReference getDevelopmentEnvironmentCatalog_DevelopmentEnvironment();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solutions</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions
	 * @generated
	 */
	EClass getTechnologySolutions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions#getTechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Technology Solution</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions#getTechnologySolution()
	 * @see #getTechnologySolutions()
	 * @generated
	 */
	EReference getTechnologySolutions_TechnologySolution();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution
	 * @generated
	 */
	EClass getTechnologySolution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getDescription()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EAttribute getTechnologySolution_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getFeatures()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EReference getTechnologySolution_Features();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution#getRelations()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EReference getTechnologySolution_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature <em>Technology Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature
	 * @generated
	 */
	EClass getTechnologyFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getDescription()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EAttribute getTechnologyFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getCapabilityType()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EAttribute getTechnologyFeature_CapabilityType();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getASTA()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EReference getTechnologyFeature_ASTA();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getRelations()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EReference getTechnologyFeature_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA
	 * @generated
	 */
	EClass getASTA();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getDescription()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getCondition()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA#getCapabilityType()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_CapabilityType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benefit</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit
	 * @generated
	 */
	EClass getBenefit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit <em>Feature Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Based Benefit</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit
	 * @generated
	 */
	EClass getFeatureBasedBenefit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit <em>Concern Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Based Benefit</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit
	 * @generated
	 */
	EClass getConcernBasedBenefit();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit#getConcern()
	 * @see #getConcernBasedBenefit()
	 * @generated
	 */
	EAttribute getConcernBasedBenefit_Concern();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawback</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback
	 * @generated
	 */
	EClass getDrawback();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback <em>Feature Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Based Drawback</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback
	 * @generated
	 */
	EClass getFeatureBasedDrawback();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback <em>Concern Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Based Drawback</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback
	 * @generated
	 */
	EClass getConcernBasedDrawback();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback#getConcern()
	 * @see #getConcernBasedDrawback()
	 * @generated
	 */
	EAttribute getConcernBasedDrawback_Concern();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions
	 * @generated
	 */
	EClass getConceptualSolutions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions#getConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions#getConceptualSolutions()
	 * @see #getConceptualSolutions()
	 * @generated
	 */
	EReference getConceptualSolutions_ConceptualSolutions();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution <em>Conceptual Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solution</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution
	 * @generated
	 */
	EClass getConceptualSolution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getDescription()
	 * @see #getConceptualSolution()
	 * @generated
	 */
	EAttribute getConceptualSolution_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getVariation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variation</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution#getVariation()
	 * @see #getConceptualSolution()
	 * @generated
	 */
	EAttribute getConceptualSolution_Variation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments
	 * @generated
	 */
	EClass getDevelopmentEnvironments();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments#getDevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments#getDevelopmentEnvironments()
	 * @see #getDevelopmentEnvironments()
	 * @generated
	 */
	EReference getDevelopmentEnvironments_DevelopmentEnvironments();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environment</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment
	 * @generated
	 */
	EClass getDevelopmentEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment#getDescription()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Programming Language</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment#getProgrammingLanguage()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_ProgrammingLanguage();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations
	 * @generated
	 */
	EClass getRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations#getRelations()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getDescription()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Description();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getSourceElement()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_SourceElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Element</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getTargetElement()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationSourceType <em>Relation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Source Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationSourceType
	 * @generated
	 */
	EClass getRelationSourceType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationTargetType <em>Relation Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Target Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationTargetType
	 * @generated
	 */
	EClass getRelationTargetType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType
	 * @generated
	 */
	EEnum getCapabilityType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureKnowledgeModelFactory getArchitectureKnowledgeModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelBaseImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getArchitectureKnowledgeModelBase()
		 * @generated
		 */
		EClass ARCHITECTURE_KNOWLEDGE_MODEL_BASE = eINSTANCE.getArchitectureKnowledgeModelBase();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID = eINSTANCE.getArchitectureKnowledgeModelBase_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME = eINSTANCE.getArchitectureKnowledgeModelBase_Name();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelImpl <em>Architecture Knowledge Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getArchitectureKnowledgeModel()
		 * @generated
		 */
		EClass ARCHITECTURE_KNOWLEDGE_MODEL = eINSTANCE.getArchitectureKnowledgeModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_KNOWLEDGE_MODEL__VERSION = eINSTANCE.getArchitectureKnowledgeModel_Version();

		/**
		 * The meta object literal for the '<em><b>Technology Solutions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS = eINSTANCE.getArchitectureKnowledgeModel_TechnologySolutions();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solutions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS = eINSTANCE.getArchitectureKnowledgeModel_ConceptualSolutions();

		/**
		 * The meta object literal for the '<em><b>Development Environments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getArchitectureKnowledgeModel_DevelopmentEnvironments();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS = eINSTANCE.getArchitectureKnowledgeModel_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionCatalogImpl <em>Technology Solution Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionCatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolutionCatalog()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION_CATALOG = eINSTANCE.getTechnologySolutionCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION_CATALOG__DESCRIPTION = eINSTANCE.getTechnologySolutionCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Technology Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG__TECHNOLOGY_SOLUTION = eINSTANCE.getTechnologySolutionCatalog_TechnologySolution();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl <em>Technology Feature Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologyFeatureCatalog()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE_CATALOG = eINSTANCE.getTechnologyFeatureCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION = eINSTANCE.getTechnologyFeatureCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Technology Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE = eINSTANCE.getTechnologyFeatureCatalog_TechnologyFeature();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationCatalogImpl <em>Relation Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationCatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationCatalog()
		 * @generated
		 */
		EClass RELATION_CATALOG = eINSTANCE.getRelationCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CATALOG__DESCRIPTION = eINSTANCE.getRelationCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CATALOG__RELATION = eINSTANCE.getRelationCatalog_Relation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTACatalogImpl <em>ASTA Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTACatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getASTACatalog()
		 * @generated
		 */
		EClass ASTA_CATALOG = eINSTANCE.getASTACatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA_CATALOG__DESCRIPTION = eINSTANCE.getASTACatalog_Description();

		/**
		 * The meta object literal for the '<em><b>ASTA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTA_CATALOG__ASTA = eINSTANCE.getASTACatalog_ASTA();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl <em>Conceptual Solution Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionCatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolutionCatalog()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTION_CATALOG = eINSTANCE.getConceptualSolutionCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION = eINSTANCE.getConceptualSolutionCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION = eINSTANCE.getConceptualSolutionCatalog_ConceptualSolution();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentCatalogImpl <em>Development Environment Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentCatalogImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironmentCatalog()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENT_CATALOG = eINSTANCE.getDevelopmentEnvironmentCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT_CATALOG__DESCRIPTION = eINSTANCE.getDevelopmentEnvironmentCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Development Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT_CATALOG__DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironmentCatalog_DevelopmentEnvironment();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionsImpl <em>Technology Solutions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionsImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolutions()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTIONS = eINSTANCE.getTechnologySolutions();

		/**
		 * The meta object literal for the '<em><b>Technology Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTION = eINSTANCE.getTechnologySolutions_TechnologySolution();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionImpl <em>Technology Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologySolutionImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologySolution()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION = eINSTANCE.getTechnologySolution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION__DESCRIPTION = eINSTANCE.getTechnologySolution_Description();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION__FEATURES = eINSTANCE.getTechnologySolution_Features();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION__RELATIONS = eINSTANCE.getTechnologySolution_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureImpl <em>Technology Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getTechnologyFeature()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE = eINSTANCE.getTechnologyFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE__DESCRIPTION = eINSTANCE.getTechnologyFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE__CAPABILITY_TYPE = eINSTANCE.getTechnologyFeature_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>ASTA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE__ASTA = eINSTANCE.getTechnologyFeature_ASTA();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE__RELATIONS = eINSTANCE.getTechnologyFeature_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTAImpl <em>ASTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ASTAImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getASTA()
		 * @generated
		 */
		EClass ASTA = eINSTANCE.getASTA();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__DESCRIPTION = eINSTANCE.getASTA_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__CONDITION = eINSTANCE.getASTA_Condition();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__CAPABILITY_TYPE = eINSTANCE.getASTA_CapabilityType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.BenefitImpl <em>Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.BenefitImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getBenefit()
		 * @generated
		 */
		EClass BENEFIT = eINSTANCE.getBenefit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedBenefitImpl <em>Feature Based Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedBenefitImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getFeatureBasedBenefit()
		 * @generated
		 */
		EClass FEATURE_BASED_BENEFIT = eINSTANCE.getFeatureBasedBenefit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedBenefitImpl <em>Concern Based Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedBenefitImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConcernBasedBenefit()
		 * @generated
		 */
		EClass CONCERN_BASED_BENEFIT = eINSTANCE.getConcernBasedBenefit();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_BASED_BENEFIT__CONCERN = eINSTANCE.getConcernBasedBenefit_Concern();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DrawbackImpl <em>Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DrawbackImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDrawback()
		 * @generated
		 */
		EClass DRAWBACK = eINSTANCE.getDrawback();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedDrawbackImpl <em>Feature Based Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.FeatureBasedDrawbackImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getFeatureBasedDrawback()
		 * @generated
		 */
		EClass FEATURE_BASED_DRAWBACK = eINSTANCE.getFeatureBasedDrawback();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedDrawbackImpl <em>Concern Based Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConcernBasedDrawbackImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConcernBasedDrawback()
		 * @generated
		 */
		EClass CONCERN_BASED_DRAWBACK = eINSTANCE.getConcernBasedDrawback();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_BASED_DRAWBACK__CONCERN = eINSTANCE.getConcernBasedDrawback_Concern();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionsImpl <em>Conceptual Solutions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionsImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolutions()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTIONS = eINSTANCE.getConceptualSolutions();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS = eINSTANCE.getConceptualSolutions_ConceptualSolutions();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl <em>Conceptual Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ConceptualSolutionImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getConceptualSolution()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTION = eINSTANCE.getConceptualSolution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION__DESCRIPTION = eINSTANCE.getConceptualSolution_Description();

		/**
		 * The meta object literal for the '<em><b>Variation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION__VARIATION = eINSTANCE.getConceptualSolution_Variation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentsImpl <em>Development Environments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentsImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironments()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getDevelopmentEnvironments();

		/**
		 * The meta object literal for the '<em><b>Development Environments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getDevelopmentEnvironments_DevelopmentEnvironments();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.DevelopmentEnvironmentImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getDevelopmentEnvironment()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__DESCRIPTION = eINSTANCE.getDevelopmentEnvironment_Description();

		/**
		 * The meta object literal for the '<em><b>Programming Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE = eINSTANCE.getDevelopmentEnvironment_ProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationsImpl <em>Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationsImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelations()
		 * @generated
		 */
		EClass RELATIONS = eINSTANCE.getRelations();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__RELATIONS = eINSTANCE.getRelations_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DESCRIPTION = eINSTANCE.getRelation_Description();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE_ELEMENT = eINSTANCE.getRelation_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET_ELEMENT = eINSTANCE.getRelation_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationSourceTypeImpl <em>Relation Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationSourceTypeImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationSourceType()
		 * @generated
		 */
		EClass RELATION_SOURCE_TYPE = eINSTANCE.getRelationSourceType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationTargetTypeImpl <em>Relation Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.RelationTargetTypeImpl
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationTargetType()
		 * @generated
		 */
		EClass RELATION_TARGET_TYPE = eINSTANCE.getRelationTargetType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType <em>Capability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getCapabilityType()
		 * @generated
		 */
		EEnum CAPABILITY_TYPE = eINSTANCE.getCapabilityType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

	}

} //ArchitectureKnowledgeModelPackage

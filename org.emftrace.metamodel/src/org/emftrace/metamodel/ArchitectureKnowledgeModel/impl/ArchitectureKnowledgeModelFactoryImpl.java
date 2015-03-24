/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureKnowledgeModelFactoryImpl extends EFactoryImpl implements ArchitectureKnowledgeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureKnowledgeModelFactory init() {
		try {
			ArchitectureKnowledgeModelFactory theArchitectureKnowledgeModelFactory = (ArchitectureKnowledgeModelFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitectureKnowledgeModelPackage.eNS_URI);
			if (theArchitectureKnowledgeModelFactory != null) {
				return theArchitectureKnowledgeModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureKnowledgeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureKnowledgeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL: return createArchitectureKnowledgeModel();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_SOLUTION_CATALOG: return createTechnologySolutionCatalog();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG: return createTechnologyFeatureCatalog();
			case ArchitectureKnowledgeModelPackage.RELATION_CATALOG: return createRelationCatalog();
			case ArchitectureKnowledgeModelPackage.ASTA_CATALOG: return createASTACatalog();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_SOLUTIONS: return createTechnologySolutions();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_SOLUTION: return createTechnologySolution();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE: return createTechnologyFeature();
			case ArchitectureKnowledgeModelPackage.FEATURE_BASED_BENEFIT: return createFeatureBasedBenefit();
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_BENEFIT: return createConcernBasedBenefit();
			case ArchitectureKnowledgeModelPackage.FEATURE_BASED_DRAWBACK: return createFeatureBasedDrawback();
			case ArchitectureKnowledgeModelPackage.CONCERN_BASED_DRAWBACK: return createConcernBasedDrawback();
			case ArchitectureKnowledgeModelPackage.RELATIONS: return createRelations();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_SOLUTION_RELATION: return createTechnologySolutionRelation();
			case ArchitectureKnowledgeModelPackage.ASTA_RELATION: return createASTARelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArchitectureKnowledgeModelPackage.CAPABILITY_TYPE:
				return createCapabilityTypeFromString(eDataType, initialValue);
			case ArchitectureKnowledgeModelPackage.SOLUTION_AND_FEATURE_RELATION_TYPE:
				return createSolutionAndFeatureRelationTypeFromString(eDataType, initialValue);
			case ArchitectureKnowledgeModelPackage.ASTA_RELATION_TYPE:
				return createASTARelationTypeFromString(eDataType, initialValue);
			case ArchitectureKnowledgeModelPackage.ID:
				return createIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArchitectureKnowledgeModelPackage.CAPABILITY_TYPE:
				return convertCapabilityTypeToString(eDataType, instanceValue);
			case ArchitectureKnowledgeModelPackage.SOLUTION_AND_FEATURE_RELATION_TYPE:
				return convertSolutionAndFeatureRelationTypeToString(eDataType, instanceValue);
			case ArchitectureKnowledgeModelPackage.ASTA_RELATION_TYPE:
				return convertASTARelationTypeToString(eDataType, instanceValue);
			case ArchitectureKnowledgeModelPackage.ID:
				return convertIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureKnowledgeModel createArchitectureKnowledgeModel() {
		ArchitectureKnowledgeModelImpl architectureKnowledgeModel = new ArchitectureKnowledgeModelImpl();
		return architectureKnowledgeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionCatalog createTechnologySolutionCatalog() {
		TechnologySolutionCatalogImpl technologySolutionCatalog = new TechnologySolutionCatalogImpl();
		return technologySolutionCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureCatalog createTechnologyFeatureCatalog() {
		TechnologyFeatureCatalogImpl technologyFeatureCatalog = new TechnologyFeatureCatalogImpl();
		return technologyFeatureCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationCatalog createRelationCatalog() {
		RelationCatalogImpl relationCatalog = new RelationCatalogImpl();
		return relationCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTACatalog createASTACatalog() {
		ASTACatalogImpl astaCatalog = new ASTACatalogImpl();
		return astaCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutions createTechnologySolutions() {
		TechnologySolutionsImpl technologySolutions = new TechnologySolutionsImpl();
		return technologySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolution createTechnologySolution() {
		TechnologySolutionImpl technologySolution = new TechnologySolutionImpl();
		return technologySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeature createTechnologyFeature() {
		TechnologyFeatureImpl technologyFeature = new TechnologyFeatureImpl();
		return technologyFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureBasedBenefit createFeatureBasedBenefit() {
		FeatureBasedBenefitImpl featureBasedBenefit = new FeatureBasedBenefitImpl();
		return featureBasedBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernBasedBenefit createConcernBasedBenefit() {
		ConcernBasedBenefitImpl concernBasedBenefit = new ConcernBasedBenefitImpl();
		return concernBasedBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureBasedDrawback createFeatureBasedDrawback() {
		FeatureBasedDrawbackImpl featureBasedDrawback = new FeatureBasedDrawbackImpl();
		return featureBasedDrawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernBasedDrawback createConcernBasedDrawback() {
		ConcernBasedDrawbackImpl concernBasedDrawback = new ConcernBasedDrawbackImpl();
		return concernBasedDrawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations createRelations() {
		RelationsImpl relations = new RelationsImpl();
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionRelation createTechnologySolutionRelation() {
		TechnologySolutionRelationImpl technologySolutionRelation = new TechnologySolutionRelationImpl();
		return technologySolutionRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTARelation createASTARelation() {
		ASTARelationImpl astaRelation = new ASTARelationImpl();
		return astaRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType createCapabilityTypeFromString(EDataType eDataType, String initialValue) {
		CapabilityType result = CapabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionAndFeatureRelationType createSolutionAndFeatureRelationTypeFromString(EDataType eDataType, String initialValue) {
		SolutionAndFeatureRelationType result = SolutionAndFeatureRelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolutionAndFeatureRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTARelationType createASTARelationTypeFromString(EDataType eDataType, String initialValue) {
		ASTARelationType result = ASTARelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASTARelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureKnowledgeModelPackage getArchitectureKnowledgeModelPackage() {
		return (ArchitectureKnowledgeModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitectureKnowledgeModelPackage getPackage() {
		return ArchitectureKnowledgeModelPackage.eINSTANCE;
	}

} //ArchitectureKnowledgeModelFactoryImpl

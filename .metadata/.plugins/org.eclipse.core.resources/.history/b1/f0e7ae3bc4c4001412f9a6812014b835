/**
 */
package org.emftrace.metamodel.EMFfitModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.EMFfitModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFfitModelFactoryImpl extends EFactoryImpl implements EMFfitModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFfitModelFactory init() {
		try {
			EMFfitModelFactory theEMFfitModelFactory = (EMFfitModelFactory)EPackage.Registry.INSTANCE.getEFactory(EMFfitModelPackage.eNS_URI);
			if (theEMFfitModelFactory != null) {
				return theEMFfitModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFfitModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFfitModelFactoryImpl() {
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
			case EMFfitModelPackage.HYPERTEXT: return createHypertext();
			case EMFfitModelPackage.LINK: return createLink();
			case EMFfitModelPackage.TERM: return createTerm();
			case EMFfitModelPackage.FACTOR_TABLE: return createFactorTable();
			case EMFfitModelPackage.FACTOR_CATEGORY: return createFactorCategory();
			case EMFfitModelPackage.FACTOR: return createFactor();
			case EMFfitModelPackage.ISSUE_CARD: return createIssueCard();
			case EMFfitModelPackage.STRATEGY: return createStrategy();
			case EMFfitModelPackage.INFLUENCING_FACTOR: return createInfluencingFactor();
			case EMFfitModelPackage.RELATED_ISSUE: return createRelatedIssue();
			case EMFfitModelPackage.FTIC_PACKAGE: return createFTICPackage();
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
			case EMFfitModelPackage.CATEGORY_TYPE:
				return createCategoryTypeFromString(eDataType, initialValue);
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
			case EMFfitModelPackage.CATEGORY_TYPE:
				return convertCategoryTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypertext createHypertext() {
		HypertextImpl hypertext = new HypertextImpl();
		return hypertext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorTable createFactorTable() {
		FactorTableImpl factorTable = new FactorTableImpl();
		return factorTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorCategory createFactorCategory() {
		FactorCategoryImpl factorCategory = new FactorCategoryImpl();
		return factorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor createFactor() {
		FactorImpl factor = new FactorImpl();
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCard createIssueCard() {
		IssueCardImpl issueCard = new IssueCardImpl();
		return issueCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluencingFactor createInfluencingFactor() {
		InfluencingFactorImpl influencingFactor = new InfluencingFactorImpl();
		return influencingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedIssue createRelatedIssue() {
		RelatedIssueImpl relatedIssue = new RelatedIssueImpl();
		return relatedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTICPackage createFTICPackage() {
		FTICPackageImpl fticPackage = new FTICPackageImpl();
		return fticPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType createCategoryTypeFromString(EDataType eDataType, String initialValue) {
		CategoryType result = CategoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFfitModelPackage getEMFfitModelPackage() {
		return (EMFfitModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFfitModelPackage getPackage() {
		return EMFfitModelPackage.eINSTANCE;
	}

} //EMFfitModelFactoryImpl

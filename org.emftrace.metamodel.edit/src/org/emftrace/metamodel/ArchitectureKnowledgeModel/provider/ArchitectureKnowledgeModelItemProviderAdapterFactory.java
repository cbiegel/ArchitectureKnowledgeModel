/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.util.ArchitectureKnowledgeModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureKnowledgeModelItemProviderAdapterFactory extends ArchitectureKnowledgeModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureKnowledgeModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureKnowledgeModelItemProvider architectureKnowledgeModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchitectureKnowledgeModelAdapter() {
		if (architectureKnowledgeModelItemProvider == null) {
			architectureKnowledgeModelItemProvider = new ArchitectureKnowledgeModelItemProvider(this);
		}

		return architectureKnowledgeModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionCatalogItemProvider technologySolutionCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologySolutionCatalogAdapter() {
		if (technologySolutionCatalogItemProvider == null) {
			technologySolutionCatalogItemProvider = new TechnologySolutionCatalogItemProvider(this);
		}

		return technologySolutionCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeatureCatalogItemProvider technologyFeatureCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologyFeatureCatalogAdapter() {
		if (technologyFeatureCatalogItemProvider == null) {
			technologyFeatureCatalogItemProvider = new TechnologyFeatureCatalogItemProvider(this);
		}

		return technologyFeatureCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationCatalogItemProvider relationCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationCatalogAdapter() {
		if (relationCatalogItemProvider == null) {
			relationCatalogItemProvider = new RelationCatalogItemProvider(this);
		}

		return relationCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTACatalogItemProvider astaCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createASTACatalogAdapter() {
		if (astaCatalogItemProvider == null) {
			astaCatalogItemProvider = new ASTACatalogItemProvider(this);
		}

		return astaCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionCatalogItemProvider conceptualSolutionCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualSolutionCatalogAdapter() {
		if (conceptualSolutionCatalogItemProvider == null) {
			conceptualSolutionCatalogItemProvider = new ConceptualSolutionCatalogItemProvider(this);
		}

		return conceptualSolutionCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentCatalogItemProvider developmentEnvironmentCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevelopmentEnvironmentCatalogAdapter() {
		if (developmentEnvironmentCatalogItemProvider == null) {
			developmentEnvironmentCatalogItemProvider = new DevelopmentEnvironmentCatalogItemProvider(this);
		}

		return developmentEnvironmentCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionsItemProvider technologySolutionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologySolutionsAdapter() {
		if (technologySolutionsItemProvider == null) {
			technologySolutionsItemProvider = new TechnologySolutionsItemProvider(this);
		}

		return technologySolutionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionItemProvider technologySolutionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologySolutionAdapter() {
		if (technologySolutionItemProvider == null) {
			technologySolutionItemProvider = new TechnologySolutionItemProvider(this);
		}

		return technologySolutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeatureItemProvider technologyFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologyFeatureAdapter() {
		if (technologyFeatureItemProvider == null) {
			technologyFeatureItemProvider = new TechnologyFeatureItemProvider(this);
		}

		return technologyFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureBasedBenefitItemProvider featureBasedBenefitItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureBasedBenefitAdapter() {
		if (featureBasedBenefitItemProvider == null) {
			featureBasedBenefitItemProvider = new FeatureBasedBenefitItemProvider(this);
		}

		return featureBasedBenefitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernBasedBenefitItemProvider concernBasedBenefitItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernBasedBenefitAdapter() {
		if (concernBasedBenefitItemProvider == null) {
			concernBasedBenefitItemProvider = new ConcernBasedBenefitItemProvider(this);
		}

		return concernBasedBenefitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureBasedDrawbackItemProvider featureBasedDrawbackItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureBasedDrawbackAdapter() {
		if (featureBasedDrawbackItemProvider == null) {
			featureBasedDrawbackItemProvider = new FeatureBasedDrawbackItemProvider(this);
		}

		return featureBasedDrawbackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernBasedDrawbackItemProvider concernBasedDrawbackItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernBasedDrawbackAdapter() {
		if (concernBasedDrawbackItemProvider == null) {
			concernBasedDrawbackItemProvider = new ConcernBasedDrawbackItemProvider(this);
		}

		return concernBasedDrawbackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionsItemProvider conceptualSolutionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualSolutionsAdapter() {
		if (conceptualSolutionsItemProvider == null) {
			conceptualSolutionsItemProvider = new ConceptualSolutionsItemProvider(this);
		}

		return conceptualSolutionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionItemProvider conceptualSolutionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualSolutionAdapter() {
		if (conceptualSolutionItemProvider == null) {
			conceptualSolutionItemProvider = new ConceptualSolutionItemProvider(this);
		}

		return conceptualSolutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentsItemProvider developmentEnvironmentsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevelopmentEnvironmentsAdapter() {
		if (developmentEnvironmentsItemProvider == null) {
			developmentEnvironmentsItemProvider = new DevelopmentEnvironmentsItemProvider(this);
		}

		return developmentEnvironmentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentItemProvider developmentEnvironmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevelopmentEnvironmentAdapter() {
		if (developmentEnvironmentItemProvider == null) {
			developmentEnvironmentItemProvider = new DevelopmentEnvironmentItemProvider(this);
		}

		return developmentEnvironmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsItemProvider relationsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationsAdapter() {
		if (relationsItemProvider == null) {
			relationsItemProvider = new RelationsItemProvider(this);
		}

		return relationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (architectureKnowledgeModelItemProvider != null) architectureKnowledgeModelItemProvider.dispose();
		if (technologySolutionCatalogItemProvider != null) technologySolutionCatalogItemProvider.dispose();
		if (technologyFeatureCatalogItemProvider != null) technologyFeatureCatalogItemProvider.dispose();
		if (relationCatalogItemProvider != null) relationCatalogItemProvider.dispose();
		if (astaCatalogItemProvider != null) astaCatalogItemProvider.dispose();
		if (conceptualSolutionCatalogItemProvider != null) conceptualSolutionCatalogItemProvider.dispose();
		if (developmentEnvironmentCatalogItemProvider != null) developmentEnvironmentCatalogItemProvider.dispose();
		if (technologySolutionsItemProvider != null) technologySolutionsItemProvider.dispose();
		if (technologySolutionItemProvider != null) technologySolutionItemProvider.dispose();
		if (technologyFeatureItemProvider != null) technologyFeatureItemProvider.dispose();
		if (featureBasedBenefitItemProvider != null) featureBasedBenefitItemProvider.dispose();
		if (concernBasedBenefitItemProvider != null) concernBasedBenefitItemProvider.dispose();
		if (featureBasedDrawbackItemProvider != null) featureBasedDrawbackItemProvider.dispose();
		if (concernBasedDrawbackItemProvider != null) concernBasedDrawbackItemProvider.dispose();
		if (conceptualSolutionsItemProvider != null) conceptualSolutionsItemProvider.dispose();
		if (conceptualSolutionItemProvider != null) conceptualSolutionItemProvider.dispose();
		if (developmentEnvironmentsItemProvider != null) developmentEnvironmentsItemProvider.dispose();
		if (developmentEnvironmentItemProvider != null) developmentEnvironmentItemProvider.dispose();
		if (relationsItemProvider != null) relationsItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
	}

}
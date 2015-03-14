/**
 */
package org.emftrace.metamodel.OWLModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.Ontology;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.Ontology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyItemProvider
	extends OWLBaseItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPrefixPropertyDescriptor(object);
			addImportPropertyDescriptor(object);
			addAnnotationPropertyDescriptor(object);
			addDeclarationPropertyDescriptor(object);
			addSubClassOfPropertyDescriptor(object);
			addEquivalentClassesPropertyDescriptor(object);
			addDisjointClassesPropertyDescriptor(object);
			addDisjointUnionPropertyDescriptor(object);
			addSubObjectPropertyOfPropertyDescriptor(object);
			addEquivalentObjectPropertiesPropertyDescriptor(object);
			addDisjointObjectPropertiesPropertyDescriptor(object);
			addInverseObjectPropertiesPropertyDescriptor(object);
			addObjectPropertyDomainPropertyDescriptor(object);
			addObjectPropertyRangePropertyDescriptor(object);
			addFunctionalObjectPropertyPropertyDescriptor(object);
			addInverseFunctionalObjectPropertyPropertyDescriptor(object);
			addReflexiveObjectPropertyPropertyDescriptor(object);
			addIrreflexiveObjectPropertyPropertyDescriptor(object);
			addSymmetricObjectPropertyPropertyDescriptor(object);
			addAsymmetricObjectPropertyPropertyDescriptor(object);
			addTransitiveObjectPropertyPropertyDescriptor(object);
			addSubDataPropertyOfPropertyDescriptor(object);
			addEquivalentDataPropertiesPropertyDescriptor(object);
			addDisjointDataPropertiesPropertyDescriptor(object);
			addDataPropertyDomainPropertyDescriptor(object);
			addDataPropertyRangePropertyDescriptor(object);
			addFunctionalDataPropertyPropertyDescriptor(object);
			addDatatypeDefinitionPropertyDescriptor(object);
			addHasKeyPropertyDescriptor(object);
			addSameIndividualPropertyDescriptor(object);
			addDifferentIndividualsPropertyDescriptor(object);
			addClassAssertionPropertyDescriptor(object);
			addObjectPropertyAssertionPropertyDescriptor(object);
			addNegativeObjectPropertyAssertionPropertyDescriptor(object);
			addDataPropertyAssertionPropertyDescriptor(object);
			addNegativeDataPropertyAssertionPropertyDescriptor(object);
			addAnnotationAssertionPropertyDescriptor(object);
			addSubAnnotationPropertyOfPropertyDescriptor(object);
			addAnnotationPropertyDomainPropertyDescriptor(object);
			addAnnotationPropertyRangePropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addOntologyIRIPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addVersionIRIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_Prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_Prefix_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Prefix(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_Import_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_Import_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Import(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_Annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_Annotation_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Annotation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclarationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_Declaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_Declaration_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Declaration(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Class Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubClassOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SubClassOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SubClassOf_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SubClassOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_EquivalentClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_EquivalentClasses_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_EquivalentClasses(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disjoint Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjointClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DisjointClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DisjointClasses_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DisjointClasses(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disjoint Union feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjointUnionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DisjointUnion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DisjointUnion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DisjointUnion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Object Property Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubObjectPropertyOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SubObjectPropertyOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SubObjectPropertyOf_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SubObjectPropertyOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent Object Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentObjectPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_EquivalentObjectProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_EquivalentObjectProperties_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_EquivalentObjectProperties(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disjoint Object Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjointObjectPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DisjointObjectProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DisjointObjectProperties_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DisjointObjectProperties(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse Object Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverseObjectPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_InverseObjectProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_InverseObjectProperties_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_InverseObjectProperties(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Property Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ObjectPropertyDomain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ObjectPropertyDomain_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyDomain(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Property Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ObjectPropertyRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ObjectPropertyRange_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyRange(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functional Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_FunctionalObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_FunctionalObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_FunctionalObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse Functional Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverseFunctionalObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_InverseFunctionalObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_InverseFunctionalObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_InverseFunctionalObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reflexive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReflexiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ReflexiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ReflexiveObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_ReflexiveObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Irreflexive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIrreflexiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_IrreflexiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_IrreflexiveObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_IrreflexiveObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symmetric Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymmetricObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SymmetricObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SymmetricObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SymmetricObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asymmetric Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsymmetricObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_AsymmetricObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_AsymmetricObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_AsymmetricObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitive Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitiveObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_TransitiveObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_TransitiveObjectProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_TransitiveObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Data Property Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubDataPropertyOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SubDataPropertyOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SubDataPropertyOf_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SubDataPropertyOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent Data Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentDataPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_EquivalentDataProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_EquivalentDataProperties_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_EquivalentDataProperties(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disjoint Data Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjointDataPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DisjointDataProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DisjointDataProperties_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DisjointDataProperties(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Property Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DataPropertyDomain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DataPropertyDomain_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DataPropertyDomain(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Property Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DataPropertyRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DataPropertyRange_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DataPropertyRange(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functional Data Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalDataPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_FunctionalDataProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_FunctionalDataProperty_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_FunctionalDataProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datatype Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypeDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DatatypeDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DatatypeDefinition_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DatatypeDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_HasKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_HasKey_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_HasKey(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Same Individual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSameIndividualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SameIndividual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SameIndividual_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SameIndividual(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Different Individuals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifferentIndividualsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DifferentIndividuals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DifferentIndividuals_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DifferentIndividuals(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ClassAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ClassAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_ClassAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Property Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ObjectPropertyAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ObjectPropertyAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative Object Property Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativeObjectPropertyAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_NegativeObjectPropertyAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_NegativeObjectPropertyAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_NegativeObjectPropertyAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Property Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_DataPropertyAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_DataPropertyAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_DataPropertyAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative Data Property Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativeDataPropertyAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_NegativeDataPropertyAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_NegativeDataPropertyAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_NegativeDataPropertyAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationAssertionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_AnnotationAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_AnnotationAssertion_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_AnnotationAssertion(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Annotation Property Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubAnnotationPropertyOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_SubAnnotationPropertyOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_SubAnnotationPropertyOf_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_SubAnnotationPropertyOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation Property Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationPropertyDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_AnnotationPropertyDomain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_AnnotationPropertyDomain_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyDomain(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation Property Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationPropertyRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_AnnotationPropertyRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_AnnotationPropertyRange_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyRange(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_base_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_base_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Base(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_id_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_lang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_lang_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Lang(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ontology IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOntologyIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_ontologyIRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_ontologyIRI_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_OntologyIRI(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_space_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_space_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_Space(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ontology_versionIRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ontology_versionIRI_feature", "_UI_Ontology_type"),
				 OWLModelPackage.eINSTANCE.getOntology_VersionIRI(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_Prefix());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_Import());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_Annotation());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_Declaration());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SubClassOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_EquivalentClasses());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DisjointClasses());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DisjointUnion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SubObjectPropertyOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_EquivalentObjectProperties());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DisjointObjectProperties());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_InverseObjectProperties());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyDomain());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyRange());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_FunctionalObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_InverseFunctionalObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_ReflexiveObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_IrreflexiveObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SymmetricObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_AsymmetricObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_TransitiveObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SubDataPropertyOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_EquivalentDataProperties());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DisjointDataProperties());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DataPropertyDomain());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DataPropertyRange());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_FunctionalDataProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DatatypeDefinition());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_HasKey());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SameIndividual());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DifferentIndividuals());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_ClassAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_NegativeObjectPropertyAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_DataPropertyAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_NegativeDataPropertyAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_AnnotationAssertion());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_SubAnnotationPropertyOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyDomain());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyRange());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Ontology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ontology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ontology)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Ontology_type") :
			getString("_UI_Ontology_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Ontology.class)) {
			case OWLModelPackage.ONTOLOGY__BASE:
			case OWLModelPackage.ONTOLOGY__ID:
			case OWLModelPackage.ONTOLOGY__LANG:
			case OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI:
			case OWLModelPackage.ONTOLOGY__SPACE:
			case OWLModelPackage.ONTOLOGY__VERSION_IRI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OWLModelPackage.ONTOLOGY__PREFIX:
			case OWLModelPackage.ONTOLOGY__IMPORT:
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
			case OWLModelPackage.ONTOLOGY__DECLARATION:
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_Prefix(),
				 OWLModelFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_Import(),
				 OWLModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_Annotation(),
				 OWLModelFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_Declaration(),
				 OWLModelFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SubClassOf(),
				 OWLModelFactory.eINSTANCE.createSubClassOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_EquivalentClasses(),
				 OWLModelFactory.eINSTANCE.createEquivalentClasses()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DisjointClasses(),
				 OWLModelFactory.eINSTANCE.createDisjointClasses()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DisjointUnion(),
				 OWLModelFactory.eINSTANCE.createDisjointUnion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SubObjectPropertyOf(),
				 OWLModelFactory.eINSTANCE.createSubObjectPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_EquivalentObjectProperties(),
				 OWLModelFactory.eINSTANCE.createEquivalentObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DisjointObjectProperties(),
				 OWLModelFactory.eINSTANCE.createDisjointObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_InverseObjectProperties(),
				 OWLModelFactory.eINSTANCE.createInverseObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyDomain(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyRange(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_FunctionalObjectProperty(),
				 OWLModelFactory.eINSTANCE.createFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_InverseFunctionalObjectProperty(),
				 OWLModelFactory.eINSTANCE.createInverseFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_ReflexiveObjectProperty(),
				 OWLModelFactory.eINSTANCE.createReflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_IrreflexiveObjectProperty(),
				 OWLModelFactory.eINSTANCE.createIrreflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SymmetricObjectProperty(),
				 OWLModelFactory.eINSTANCE.createSymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_AsymmetricObjectProperty(),
				 OWLModelFactory.eINSTANCE.createAsymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_TransitiveObjectProperty(),
				 OWLModelFactory.eINSTANCE.createTransitiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SubDataPropertyOf(),
				 OWLModelFactory.eINSTANCE.createSubDataPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_EquivalentDataProperties(),
				 OWLModelFactory.eINSTANCE.createEquivalentDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DisjointDataProperties(),
				 OWLModelFactory.eINSTANCE.createDisjointDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DataPropertyDomain(),
				 OWLModelFactory.eINSTANCE.createDataPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DataPropertyRange(),
				 OWLModelFactory.eINSTANCE.createDataPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_FunctionalDataProperty(),
				 OWLModelFactory.eINSTANCE.createFunctionalDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DatatypeDefinition(),
				 OWLModelFactory.eINSTANCE.createDatatypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_HasKey(),
				 OWLModelFactory.eINSTANCE.createHasKey()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SameIndividual(),
				 OWLModelFactory.eINSTANCE.createSameIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DifferentIndividuals(),
				 OWLModelFactory.eINSTANCE.createDifferentIndividuals()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_ClassAssertion(),
				 OWLModelFactory.eINSTANCE.createClassAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_ObjectPropertyAssertion(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_NegativeObjectPropertyAssertion(),
				 OWLModelFactory.eINSTANCE.createNegativeObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_DataPropertyAssertion(),
				 OWLModelFactory.eINSTANCE.createDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_NegativeDataPropertyAssertion(),
				 OWLModelFactory.eINSTANCE.createNegativeDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_AnnotationAssertion(),
				 OWLModelFactory.eINSTANCE.createAnnotationAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_SubAnnotationPropertyOf(),
				 OWLModelFactory.eINSTANCE.createSubAnnotationPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyDomain(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getOntology_AnnotationPropertyRange(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyRange()));
	}

}

/**
 */
package org.emftrace.metamodel.UMLModel.provider;


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

import org.emftrace.metamodel.UMLModel.Classifier;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider
	extends NamespaceItemProvider
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
	public ClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addIsLeafPropertyDescriptor(object);
			addRedefinedElementPropertyDescriptor(object);
			addRedefinitionContextPropertyDescriptor(object);
			addOwningTemplateParameterPropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addOwnedTemplateSignaturePropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addGeneralizationPropertyDescriptor(object);
			addPowertypeExtentPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addInheritedMemberPropertyDescriptor(object);
			addRedefinedClassifierPropertyDescriptor(object);
			addGeneralPropertyDescriptor(object);
			addSubstitutionPropertyDescriptor(object);
			addRepresentationPropertyDescriptor(object);
			addCollaborationUsePropertyDescriptor(object);
			addOwnedUseCasePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addUseCasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLeafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_isLeaf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_isLeaf_feature", "_UI_RedefinableElement_type"),
				 UMLModelPackage.eINSTANCE.getRedefinableElement_IsLeaf(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinedElement_feature", "_UI_RedefinableElement_type"),
				 UMLModelPackage.eINSTANCE.getRedefinableElement_RedefinedElement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefinition Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinitionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinitionContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinitionContext_feature", "_UI_RedefinableElement_type"),
				 UMLModelPackage.eINSTANCE.getRedefinableElement_RedefinitionContext(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterableElement_owningTemplateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterableElement_owningTemplateParameter_feature", "_UI_ParameterableElement_type"),
				 UMLModelPackage.eINSTANCE.getParameterableElement_OwningTemplateParameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterableElement_templateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterableElement_templateParameter_feature", "_UI_ParameterableElement_type"),
				 UMLModelPackage.eINSTANCE.getParameterableElement_TemplateParameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_package_feature", "_UI_Type_type"),
				 UMLModelPackage.eINSTANCE.getType_Package(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateableElement_templateBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateableElement_templateBinding_feature", "_UI_TemplateableElement_type"),
				 UMLModelPackage.eINSTANCE.getTemplateableElement_TemplateBinding(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Template Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTemplateSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateableElement_ownedTemplateSignature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateableElement_ownedTemplateSignature_feature", "_UI_TemplateableElement_type"),
				 UMLModelPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_IsAbstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_generalization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_generalization_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_Generalization(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Powertype Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowertypeExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_powertypeExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_powertypeExtent_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_PowertypeExtent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_feature_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_Feature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_inheritedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_inheritedMember_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_InheritedMember(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_redefinedClassifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_redefinedClassifier_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_RedefinedClassifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the General feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_general_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_general_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_General(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substitution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstitutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_substitution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_substitution_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_Substitution(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Representation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_representation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_representation_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_Representation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collaboration Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollaborationUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_collaborationUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_collaborationUse_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_CollaborationUse(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_ownedUseCase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_ownedUseCase_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_OwnedUseCase(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_attribute_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_Attribute(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_useCase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_useCase_feature", "_UI_Classifier_type"),
				 UMLModelPackage.eINSTANCE.getClassifier_UseCase(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getTemplateableElement_TemplateBinding());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getClassifier_Generalization());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getClassifier_Substitution());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getClassifier_CollaborationUse());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getClassifier_OwnedUseCase());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Classifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Classifier_type") :
			getString("_UI_Classifier_type") + " " + label;
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

		switch (notification.getFeatureID(Classifier.class)) {
			case UMLModelPackage.CLASSIFIER__IS_LEAF:
			case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT:
			case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT:
			case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
			case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER:
			case UMLModelPackage.CLASSIFIER__PACKAGE:
			case UMLModelPackage.CLASSIFIER__IS_ABSTRACT:
			case UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT:
			case UMLModelPackage.CLASSIFIER__FEATURE:
			case UMLModelPackage.CLASSIFIER__INHERITED_MEMBER:
			case UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
			case UMLModelPackage.CLASSIFIER__GENERAL:
			case UMLModelPackage.CLASSIFIER__REPRESENTATION:
			case UMLModelPackage.CLASSIFIER__ATTRIBUTE:
			case UMLModelPackage.CLASSIFIER__USE_CASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
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
				(UMLModelPackage.eINSTANCE.getTemplateableElement_TemplateBinding(),
				 UMLModelFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(),
				 UMLModelFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(),
				 UMLModelFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getClassifier_Generalization(),
				 UMLModelFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getClassifier_Substitution(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getClassifier_CollaborationUse(),
				 UMLModelFactory.eINSTANCE.createCollaborationUse()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getClassifier_OwnedUseCase(),
				 UMLModelFactory.eINSTANCE.createUseCase()));
	}

}

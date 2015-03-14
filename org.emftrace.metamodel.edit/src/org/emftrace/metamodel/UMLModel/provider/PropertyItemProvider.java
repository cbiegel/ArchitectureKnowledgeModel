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

import org.emftrace.metamodel.UMLModel.Property;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Property} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProvider
	extends StructuralFeatureItemProvider
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
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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

			addOwningTemplateParameterPropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addDeploymentPropertyDescriptor(object);
			addDeployedElementPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addOwnedTemplateSignaturePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDatatypePropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsDerivedUnionPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addAggregationPropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
			addRedefinedPropertyPropertyDescriptor(object);
			addOwningAssociationPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addOppositePropertyDescriptor(object);
			addSubsettedPropertyPropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addQualifierPropertyDescriptor(object);
			addAssociationEndPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectableElement_end_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectableElement_end_feature", "_UI_ConnectableElement_type"),
				 UMLModelPackage.eINSTANCE.getConnectableElement_End(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeploymentTarget_deployment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployment_feature", "_UI_DeploymentTarget_type"),
				 UMLModelPackage.eINSTANCE.getDeploymentTarget_Deployment(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployed Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeploymentTarget_deployedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployedElement_feature", "_UI_DeploymentTarget_type"),
				 UMLModelPackage.eINSTANCE.getDeploymentTarget_DeployedElement(),
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
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_class_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_datatype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_datatype_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Datatype(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerived_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_IsDerived(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived Union feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedUnionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isDerivedUnion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerivedUnion_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_IsDerivedUnion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_default_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Default(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_aggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_aggregation_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Aggregation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isComposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isComposite_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_IsComposite(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_redefinedProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_redefinedProperty_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_RedefinedProperty(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_owningAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_owningAssociation_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_OwningAssociation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_defaultValue_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_opposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_opposite_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Opposite(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subsetted Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsettedPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_subsettedProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_subsettedProperty_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_SubsettedProperty(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_association_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_association_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Association(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_qualifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_qualifier_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_Qualifier(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_associationEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_associationEnd_feature", "_UI_Property_type"),
				 UMLModelPackage.eINSTANCE.getProperty_AssociationEnd(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getDeploymentTarget_Deployment());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getTemplateableElement_TemplateBinding());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getTemplateableElement_OwnedTemplateSignature());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getProperty_DefaultValue());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getProperty_Qualifier());
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
	 * This returns Property.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Property)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Property_type") :
			getString("_UI_Property_type") + " " + label;
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

		switch (notification.getFeatureID(Property.class)) {
			case UMLModelPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
			case UMLModelPackage.PROPERTY__TEMPLATE_PARAMETER:
			case UMLModelPackage.PROPERTY__END:
			case UMLModelPackage.PROPERTY__DEPLOYED_ELEMENT:
			case UMLModelPackage.PROPERTY__CLASS:
			case UMLModelPackage.PROPERTY__DATATYPE:
			case UMLModelPackage.PROPERTY__IS_DERIVED:
			case UMLModelPackage.PROPERTY__IS_DERIVED_UNION:
			case UMLModelPackage.PROPERTY__DEFAULT:
			case UMLModelPackage.PROPERTY__AGGREGATION:
			case UMLModelPackage.PROPERTY__IS_COMPOSITE:
			case UMLModelPackage.PROPERTY__REDEFINED_PROPERTY:
			case UMLModelPackage.PROPERTY__OWNING_ASSOCIATION:
			case UMLModelPackage.PROPERTY__OPPOSITE:
			case UMLModelPackage.PROPERTY__SUBSETTED_PROPERTY:
			case UMLModelPackage.PROPERTY__ASSOCIATION:
			case UMLModelPackage.PROPERTY__ASSOCIATION_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.PROPERTY__DEPLOYMENT:
			case UMLModelPackage.PROPERTY__TEMPLATE_BINDING:
			case UMLModelPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
			case UMLModelPackage.PROPERTY__DEFAULT_VALUE:
			case UMLModelPackage.PROPERTY__QUALIFIER:
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
				(UMLModelPackage.eINSTANCE.getDeploymentTarget_Deployment(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

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
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_Qualifier(),
				 UMLModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_Qualifier(),
				 UMLModelFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getProperty_Qualifier(),
				 UMLModelFactory.eINSTANCE.createPort()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UMLModelPackage.eINSTANCE.getNamedElement_NameExpression() ||
			childFeature == UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue() ||
			childFeature == UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue() ||
			childFeature == UMLModelPackage.eINSTANCE.getProperty_DefaultValue();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

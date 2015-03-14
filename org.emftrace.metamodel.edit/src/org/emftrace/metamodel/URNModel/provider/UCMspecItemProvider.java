/**
 */
package org.emftrace.metamodel.URNModel.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.URNModel.UCMspec;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.URNModel.UCMspec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UCMspecItemProvider
	extends URNBaseItemProvider
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
	public UCMspecItemProvider(AdapterFactory adapterFactory) {
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

			addEnumerationTypesPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
			addScenarioGroupsPropertyDescriptor(object);
			addResourcesPropertyDescriptor(object);
			addUcmMapsPropertyDescriptor(object);
			addComponentsPropertyDescriptor(object);
			addComponentTypesPropertyDescriptor(object);
			addResponsibilitiesPropertyDescriptor(object);
			addScenarioDefsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enumeration Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumerationTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_enumerationTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_enumerationTypes_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__ENUMERATION_TYPES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_variables_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__VARIABLES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_scenarioGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_scenarioGroups_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__SCENARIO_GROUPS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_resources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_resources_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ucm Maps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUcmMapsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_ucmMaps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_ucmMaps_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__UCM_MAPS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_components_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_components_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__COMPONENTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_componentTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_componentTypes_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__COMPONENT_TYPES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsibilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsibilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_responsibilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_responsibilities_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__RESPONSIBILITIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario Defs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioDefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCMspec_scenarioDefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCMspec_scenarioDefs_feature", "_UI_UCMspec_type"),
				 URNModelPackage.Literals.UC_MSPEC__SCENARIO_DEFS,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__ENUMERATION_TYPES);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__VARIABLES);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__SCENARIO_GROUPS);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__RESOURCES);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__UCM_MAPS);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__COMPONENTS);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__COMPONENT_TYPES);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__RESPONSIBILITIES);
			childrenFeatures.add(URNModelPackage.Literals.UC_MSPEC__SCENARIO_DEFS);
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
	 * This returns UCMspec.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UCMspec"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UCMspec_type");
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

		switch (notification.getFeatureID(UCMspec.class)) {
			case URNModelPackage.UC_MSPEC__ENUMERATION_TYPES:
			case URNModelPackage.UC_MSPEC__VARIABLES:
			case URNModelPackage.UC_MSPEC__SCENARIO_GROUPS:
			case URNModelPackage.UC_MSPEC__RESOURCES:
			case URNModelPackage.UC_MSPEC__UCM_MAPS:
			case URNModelPackage.UC_MSPEC__COMPONENTS:
			case URNModelPackage.UC_MSPEC__COMPONENT_TYPES:
			case URNModelPackage.UC_MSPEC__RESPONSIBILITIES:
			case URNModelPackage.UC_MSPEC__SCENARIO_DEFS:
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
				(URNModelPackage.Literals.UC_MSPEC__ENUMERATION_TYPES,
				 URNModelFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__VARIABLES,
				 URNModelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__SCENARIO_GROUPS,
				 URNModelFactory.eINSTANCE.createScenarioGroup()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 URNModelFactory.eINSTANCE.createGeneralResource()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 URNModelFactory.eINSTANCE.createActiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 URNModelFactory.eINSTANCE.createExternalOperation()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 URNModelFactory.eINSTANCE.createPassiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESOURCES,
				 URNModelFactory.eINSTANCE.createProcessingResource()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__UCM_MAPS,
				 URNModelFactory.eINSTANCE.createUCMmap()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__COMPONENTS,
				 URNModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__COMPONENT_TYPES,
				 URNModelFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__RESPONSIBILITIES,
				 URNModelFactory.eINSTANCE.createResponsibility()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UC_MSPEC__SCENARIO_DEFS,
				 URNModelFactory.eINSTANCE.createScenarioDef()));
	}

}

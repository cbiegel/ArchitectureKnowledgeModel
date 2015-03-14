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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.URNModel.ScenarioDef;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.URNModel.ScenarioDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioDefItemProvider
	extends UCMmodelElementItemProvider
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
	public ScenarioDefItemProvider(AdapterFactory adapterFactory) {
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

			addInitializationsPropertyDescriptor(object);
			addPostconditionsPropertyDescriptor(object);
			addPreconditionsPropertyDescriptor(object);
			addParentScenariosPropertyDescriptor(object);
			addIncludedScenariosPropertyDescriptor(object);
			addGroupsPropertyDescriptor(object);
			addStartPointsPropertyDescriptor(object);
			addEndPointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initializations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_initializations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_initializations_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__INITIALIZATIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postconditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostconditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_postconditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_postconditions_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__POSTCONDITIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preconditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_preconditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_preconditions_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__PRECONDITIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Scenarios feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_parentScenarios_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_parentScenarios_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__PARENT_SCENARIOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Included Scenarios feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludedScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_includedScenarios_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_includedScenarios_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__INCLUDED_SCENARIOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_groups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_groups_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__GROUPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_startPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_startPoints_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__START_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioDef_endPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioDef_endPoints_feature", "_UI_ScenarioDef_type"),
				 URNModelPackage.Literals.SCENARIO_DEF__END_POINTS,
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
			childrenFeatures.add(URNModelPackage.Literals.SCENARIO_DEF__INITIALIZATIONS);
			childrenFeatures.add(URNModelPackage.Literals.SCENARIO_DEF__POSTCONDITIONS);
			childrenFeatures.add(URNModelPackage.Literals.SCENARIO_DEF__PRECONDITIONS);
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
	 * This returns ScenarioDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScenarioDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScenarioDef)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScenarioDef_type") :
			getString("_UI_ScenarioDef_type") + " " + label;
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

		switch (notification.getFeatureID(ScenarioDef.class)) {
			case URNModelPackage.SCENARIO_DEF__PARENT_SCENARIOS:
			case URNModelPackage.SCENARIO_DEF__INCLUDED_SCENARIOS:
			case URNModelPackage.SCENARIO_DEF__GROUPS:
			case URNModelPackage.SCENARIO_DEF__START_POINTS:
			case URNModelPackage.SCENARIO_DEF__END_POINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case URNModelPackage.SCENARIO_DEF__INITIALIZATIONS:
			case URNModelPackage.SCENARIO_DEF__POSTCONDITIONS:
			case URNModelPackage.SCENARIO_DEF__PRECONDITIONS:
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
				(URNModelPackage.Literals.SCENARIO_DEF__INITIALIZATIONS,
				 URNModelFactory.eINSTANCE.createInitialization()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.SCENARIO_DEF__POSTCONDITIONS,
				 URNModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.SCENARIO_DEF__PRECONDITIONS,
				 URNModelFactory.eINSTANCE.createCondition()));
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
			childFeature == URNModelPackage.Literals.SCENARIO_DEF__POSTCONDITIONS ||
			childFeature == URNModelPackage.Literals.SCENARIO_DEF__PRECONDITIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

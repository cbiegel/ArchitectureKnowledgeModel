/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Query.provider;

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
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.QUARCModel.Query.GSSQuery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GSSQueryItemProvider
	extends GSSQueryModelBaseItemProvider
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
	public GSSQueryItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addUuidPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addIncludeAllPropertyDescriptor(object);
			addIncludePatternPropertyDescriptor(object);
			addIncludeRefactoringsPropertyDescriptor(object);
			addIncludePrinciplesPropertyDescriptor(object);
			addIncludeFlawsPropertyDescriptor(object);
			addQueryResultSetPropertyDescriptor(object);
			addSelectedGoalsSetPropertyDescriptor(object);
			addAssignedConstraintsSetPropertyDescriptor(object);
			addSelectedPrinciplesSetPropertyDescriptor(object);
			addSelectedGoalsPrioritiesPropertyDescriptor(object);
			addChangedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_name_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_description_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_uuid_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_username_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_timestamp_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_includeAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_includeAll_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__INCLUDE_ALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_includePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_includePattern_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__INCLUDE_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Refactorings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeRefactoringsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_includeRefactorings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_includeRefactorings_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__INCLUDE_REFACTORINGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Principles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludePrinciplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_includePrinciples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_includePrinciples_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__INCLUDE_PRINCIPLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Flaws feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeFlawsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_includeFlaws_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_includeFlaws_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__INCLUDE_FLAWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Query Result Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryResultSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_queryResultSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_queryResultSet_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__QUERY_RESULT_SET,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Goals Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedGoalsSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_selectedGoalsSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_selectedGoalsSet_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_SET,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigned Constraints Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedConstraintsSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_assignedConstraintsSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_assignedConstraintsSet_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Principles Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPrinciplesSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_selectedPrinciplesSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_selectedPrinciplesSet_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__SELECTED_PRINCIPLES_SET,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Goals Priorities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedGoalsPrioritiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_selectedGoalsPriorities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_selectedGoalsPriorities_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_PRIORITIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Changed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSSQuery_changed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSSQuery_changed_feature", "_UI_GSSQuery_type"),
				 QueryPackage.Literals.GSS_QUERY__CHANGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(QueryPackage.Literals.GSS_QUERY__QUERY_RESULT_SET);
			childrenFeatures.add(QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_SET);
			childrenFeatures.add(QueryPackage.Literals.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET);
			childrenFeatures.add(QueryPackage.Literals.GSS_QUERY__SELECTED_PRINCIPLES_SET);
			childrenFeatures.add(QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_PRIORITIES);
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
	 * This returns GSSQuery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GSSQuery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String name = ((GSSQuery)object).getName();
		String time  = ((GSSQuery)object).getTimestamp();
		if (time == null){
			time = "never";
		}
		return	getString("_UI_GSSQuery_type") + " \"" + name+"\" (last execution: "+ time+")";
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

		switch (notification.getFeatureID(GSSQuery.class)) {
			case QueryPackage.GSS_QUERY__NAME:
			case QueryPackage.GSS_QUERY__DESCRIPTION:
			case QueryPackage.GSS_QUERY__UUID:
			case QueryPackage.GSS_QUERY__USERNAME:
			case QueryPackage.GSS_QUERY__TIMESTAMP:
			case QueryPackage.GSS_QUERY__INCLUDE_ALL:
			case QueryPackage.GSS_QUERY__INCLUDE_PATTERN:
			case QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS:
			case QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES:
			case QueryPackage.GSS_QUERY__INCLUDE_FLAWS:
			case QueryPackage.GSS_QUERY__CHANGED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
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
				(QueryPackage.Literals.GSS_QUERY__QUERY_RESULT_SET,
				 QueryFactory.eINSTANCE.createQueryResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_SET,
				 QueryFactory.eINSTANCE.createSelectedGoalsSet()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET,
				 QueryFactory.eINSTANCE.createAssignedConstraintsSet()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.GSS_QUERY__SELECTED_PRINCIPLES_SET,
				 QueryFactory.eINSTANCE.createSelectedPrinciplesSet()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.GSS_QUERY__SELECTED_GOALS_PRIORITIES,
				 QueryFactory.eINSTANCE.createSelectedGoalsPriorities()));
	}

	
}

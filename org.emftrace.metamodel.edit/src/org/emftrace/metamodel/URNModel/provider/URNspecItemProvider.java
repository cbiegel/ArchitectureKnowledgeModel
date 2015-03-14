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

import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.URNspec;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.URNModel.URNspec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class URNspecItemProvider
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
	public URNspecItemProvider(AdapterFactory adapterFactory) {
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
			addUcmspecPropertyDescriptor(object);
			addMetadataPropertyDescriptor(object);
			addUrnLinksPropertyDescriptor(object);
			addGrlspecPropertyDescriptor(object);
			addInfoPropertyDescriptor(object);
			addConcernsPropertyDescriptor(object);
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
				 getString("_UI_URNspec_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_name_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ucmspec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUcmspecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_ucmspec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_ucmspec_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__UCMSPEC,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metadata feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetadataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_metadata_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_metadata_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__METADATA,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Urn Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrnLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_urnLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_urnLinks_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__URN_LINKS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grlspec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrlspecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_grlspec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_grlspec_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__GRLSPEC,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_info_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_info_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__INFO,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concerns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcernsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URNspec_concerns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URNspec_concerns_feature", "_UI_URNspec_type"),
				 URNModelPackage.Literals.UR_NSPEC__CONCERNS,
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
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__UCMSPEC);
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__METADATA);
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__URN_LINKS);
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__GRLSPEC);
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__INFO);
			childrenFeatures.add(URNModelPackage.Literals.UR_NSPEC__CONCERNS);
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
	 * This returns URNspec.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/URNspec"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((URNspec)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_URNspec_type") :
			getString("_UI_URNspec_type") + " " + label;
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

		switch (notification.getFeatureID(URNspec.class)) {
			case URNModelPackage.UR_NSPEC__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case URNModelPackage.UR_NSPEC__UCMSPEC:
			case URNModelPackage.UR_NSPEC__METADATA:
			case URNModelPackage.UR_NSPEC__URN_LINKS:
			case URNModelPackage.UR_NSPEC__GRLSPEC:
			case URNModelPackage.UR_NSPEC__INFO:
			case URNModelPackage.UR_NSPEC__CONCERNS:
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
				(URNModelPackage.Literals.UR_NSPEC__UCMSPEC,
				 URNModelFactory.eINSTANCE.createUCMspec()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UR_NSPEC__METADATA,
				 URNModelFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UR_NSPEC__URN_LINKS,
				 URNModelFactory.eINSTANCE.createURNlink()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UR_NSPEC__GRLSPEC,
				 URNModelFactory.eINSTANCE.createGRLspec()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UR_NSPEC__INFO,
				 URNModelFactory.eINSTANCE.createConcreteURNspec()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.UR_NSPEC__CONCERNS,
				 URNModelFactory.eINSTANCE.createConcern()));
	}

}

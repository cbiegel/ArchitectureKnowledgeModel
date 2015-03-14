/**
 */
package org.emftrace.metamodel.QUARCModel.Packages.provider;


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

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;

import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;

import org.emftrace.metamodel.QUARCModel.Packages.PackagesPackage;
import org.emftrace.metamodel.QUARCModel.Packages.Toolbox;

import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.QUARCModel.Packages.Toolbox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolboxItemProvider
	extends PackageBaseItemProvider
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
	public ToolboxItemProvider(AdapterFactory adapterFactory) {
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

			addGssCataloguePropertyDescriptor(object);
			addPropertiesCataloguePropertyDescriptor(object);
			addTagsCataloguePropertyDescriptor(object);
			addQueryContainmentPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gss Catalogue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGssCataloguePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Toolbox_gssCatalogue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Toolbox_gssCatalogue_feature", "_UI_Toolbox_type"),
				 PackagesPackage.Literals.TOOLBOX__GSS_CATALOGUE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties Catalogue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesCataloguePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Toolbox_propertiesCatalogue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Toolbox_propertiesCatalogue_feature", "_UI_Toolbox_type"),
				 PackagesPackage.Literals.TOOLBOX__PROPERTIES_CATALOGUE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tags Catalogue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagsCataloguePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Toolbox_tagsCatalogue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Toolbox_tagsCatalogue_feature", "_UI_Toolbox_type"),
				 PackagesPackage.Literals.TOOLBOX__TAGS_CATALOGUE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Query Containment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryContainmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Toolbox_queryContainment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Toolbox_queryContainment_feature", "_UI_Toolbox_type"),
				 PackagesPackage.Literals.TOOLBOX__QUERY_CONTAINMENT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
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
				 getString("_UI_Toolbox_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Toolbox_name_feature", "_UI_Toolbox_type"),
				 PackagesPackage.Literals.TOOLBOX__NAME,
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
			childrenFeatures.add(PackagesPackage.Literals.TOOLBOX__GSS_CATALOGUE);
			childrenFeatures.add(PackagesPackage.Literals.TOOLBOX__PROPERTIES_CATALOGUE);
			childrenFeatures.add(PackagesPackage.Literals.TOOLBOX__PREDEFINED_CONTRAINTS_SET_CATALOGUE);
			childrenFeatures.add(PackagesPackage.Literals.TOOLBOX__TAGS_CATALOGUE);
			childrenFeatures.add(PackagesPackage.Literals.TOOLBOX__QUERY_CONTAINMENT);
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
	 * This returns Toolbox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Toolbox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Toolbox)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Toolbox_type") :
			getString("_UI_Toolbox_type") + " " + label;
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

		switch (notification.getFeatureID(Toolbox.class)) {
			case PackagesPackage.TOOLBOX__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PackagesPackage.TOOLBOX__GSS_CATALOGUE:
			case PackagesPackage.TOOLBOX__PROPERTIES_CATALOGUE:
			case PackagesPackage.TOOLBOX__PREDEFINED_CONTRAINTS_SET_CATALOGUE:
			case PackagesPackage.TOOLBOX__TAGS_CATALOGUE:
			case PackagesPackage.TOOLBOX__QUERY_CONTAINMENT:
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
				(PackagesPackage.Literals.TOOLBOX__GSS_CATALOGUE,
				 GSSFactory.eINSTANCE.createGSS()));

		newChildDescriptors.add
			(createChildParameter
				(PackagesPackage.Literals.TOOLBOX__PROPERTIES_CATALOGUE,
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertiesCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(PackagesPackage.Literals.TOOLBOX__PREDEFINED_CONTRAINTS_SET_CATALOGUE,
				 ConstraintsFactory.eINSTANCE.createPredefinedConstraintSetCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(PackagesPackage.Literals.TOOLBOX__TAGS_CATALOGUE,
				 GSSFactory.eINSTANCE.createTagsCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(PackagesPackage.Literals.TOOLBOX__QUERY_CONTAINMENT,
				 QueryFactory.eINSTANCE.createGSSQueryContainment()));
	}

}

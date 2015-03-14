/**
 */
package org.emftrace.metamodel.FeatureModel.provider;


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

import org.emftrace.metamodel.FeatureModel.Element;
import org.emftrace.metamodel.FeatureModel.FeatureModelFactory;
import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.FeatureModel.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider
	extends FeatureModelBaseItemProvider
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
	public ElementItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addRelationsPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addVnamePropertyDescriptor(object);
			addDescPropertyDescriptor(object);
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
				 getString("_UI_Element_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_type_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Element_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_class_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Element_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_default_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_relations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_relations_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__RELATIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_properties_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__PROPERTIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_vname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_vname_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__VNAME,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Desc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_desc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_desc_feature", "_UI_Element_type"),
				 FeatureModelPackage.Literals.ELEMENT__DESC,
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
			childrenFeatures.add(FeatureModelPackage.Literals.ELEMENT__RELATIONS);
			childrenFeatures.add(FeatureModelPackage.Literals.ELEMENT__PROPERTIES);
			childrenFeatures.add(FeatureModelPackage.Literals.ELEMENT__VNAME);
			childrenFeatures.add(FeatureModelPackage.Literals.ELEMENT__DESC);
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
	 * This returns Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Element"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Element)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Element_type") :
			getString("_UI_Element_type") + " " + label;
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

		switch (notification.getFeatureID(Element.class)) {
			case FeatureModelPackage.ELEMENT__NAME:
			case FeatureModelPackage.ELEMENT__TYPE:
			case FeatureModelPackage.ELEMENT__CLASS:
			case FeatureModelPackage.ELEMENT__DEFAULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FeatureModelPackage.ELEMENT__RELATIONS:
			case FeatureModelPackage.ELEMENT__PROPERTIES:
			case FeatureModelPackage.ELEMENT__VNAME:
			case FeatureModelPackage.ELEMENT__DESC:
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
				(FeatureModelPackage.Literals.ELEMENT__RELATIONS,
				 FeatureModelFactory.eINSTANCE.createRelations()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureModelPackage.Literals.ELEMENT__PROPERTIES,
				 FeatureModelFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureModelPackage.Literals.ELEMENT__VNAME,
				 FeatureModelFactory.eINSTANCE.createVName()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureModelPackage.Literals.ELEMENT__DESC,
				 FeatureModelFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureModelPackage.Literals.ELEMENT__DESC,
				 FeatureModelFactory.eINSTANCE.createVName()));
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
			childFeature == FeatureModelPackage.Literals.ELEMENT__VNAME ||
			childFeature == FeatureModelPackage.Literals.ELEMENT__DESC;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

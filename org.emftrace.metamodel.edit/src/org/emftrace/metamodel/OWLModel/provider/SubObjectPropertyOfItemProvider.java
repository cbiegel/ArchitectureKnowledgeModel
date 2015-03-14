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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.SubObjectPropertyOf;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.SubObjectPropertyOf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubObjectPropertyOfItemProvider
	extends ObjectPropertyAxiomItemProvider
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
	public SubObjectPropertyOfItemProvider(AdapterFactory adapterFactory) {
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

			addObjectPropertyPropertyDescriptor(object);
			addObjectInverseOfPropertyDescriptor(object);
			addObjectPropertyChainPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Object Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubObjectPropertyOf_ObjectProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubObjectPropertyOf_ObjectProperty_feature", "_UI_SubObjectPropertyOf_type"),
				 OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Inverse Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectInverseOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubObjectPropertyOf_ObjectInverseOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubObjectPropertyOf_ObjectInverseOf_feature", "_UI_SubObjectPropertyOf_type"),
				 OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectInverseOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Property Chain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyChainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubObjectPropertyOf_ObjectPropertyChain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubObjectPropertyOf_ObjectPropertyChain_feature", "_UI_SubObjectPropertyOf_type"),
				 OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectPropertyChain(),
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
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectInverseOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectPropertyChain());
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
	 * This returns SubObjectPropertyOf.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubObjectPropertyOf"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubObjectPropertyOf)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SubObjectPropertyOf_type") :
			getString("_UI_SubObjectPropertyOf_type") + " " + label;
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

		switch (notification.getFeatureID(SubObjectPropertyOf.class)) {
			case OWLModelPackage.SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY:
			case OWLModelPackage.SUB_OBJECT_PROPERTY_OF__OBJECT_INVERSE_OF:
			case OWLModelPackage.SUB_OBJECT_PROPERTY_OF__OBJECT_PROPERTY_CHAIN:
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
				(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectProperty(),
				 OWLModelFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectInverseOf(),
				 OWLModelFactory.eINSTANCE.createObjectInverseOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getSubObjectPropertyOf_ObjectPropertyChain(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyChain()));
	}

}

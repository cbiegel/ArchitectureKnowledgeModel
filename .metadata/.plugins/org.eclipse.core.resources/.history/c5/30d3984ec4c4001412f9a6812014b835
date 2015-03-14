/**
 */
package org.emftrace.metamodel.QUARCModel.GSS.provider;


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

import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;

import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.QUARCModel.GSS.GSS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GSSItemProvider
	extends GSSBaseItemProvider
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
	public GSSItemProvider(AdapterFactory adapterFactory) {
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

			addElementsPropertyDescriptor(object);
			addRelationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GSS_elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSS_elements_feature", "_UI_GSS_type"),
				 GSSPackage.Literals.GSS__ELEMENTS,
				 true,
				 false,
				 false,
				 null,
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
				 getString("_UI_GSS_relations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GSS_relations_feature", "_UI_GSS_type"),
				 GSSPackage.Literals.GSS__RELATIONS,
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
			childrenFeatures.add(GSSPackage.Literals.GSS__ELEMENTS);
			childrenFeatures.add(GSSPackage.Literals.GSS__RELATIONS);
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
	 * This returns GSS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GSS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GSS_type");
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

		switch (notification.getFeatureID(GSS.class)) {
			case GSSPackage.GSS__ELEMENTS:
			case GSSPackage.GSS__RELATIONS:
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
				(GSSPackage.Literals.GSS__ELEMENTS,
				 GSSFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__ELEMENTS,
				 GSSFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__ELEMENTS,
				 GSSFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__ELEMENTS,
				 GSSFactory.eINSTANCE.createRefactoring()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__ELEMENTS,
				 GSSFactory.eINSTANCE.createFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__RELATIONS,
				 GSSFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__RELATIONS,
				 GSSFactory.eINSTANCE.createImpact()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__RELATIONS,
				 GSSFactory.eINSTANCE.createOffset()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__RELATIONS,
				 GSSFactory.eINSTANCE.createisA()));

		newChildDescriptors.add
			(createChildParameter
				(GSSPackage.Literals.GSS__RELATIONS,
				 QueryFactory.eINSTANCE.createRating()));
	}

}

/**
 */
package org.emftrace.metamodel.EMFfitModel.provider;


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

import org.emftrace.metamodel.EMFfitModel.EMFfitModelFactory;
import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.Factor;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.EMFfitModel.Factor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FactorItemProvider
	extends FTEntryItemProvider
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
	public FactorItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addFlexibilityPropertyDescriptor(object);
			addChangeabilityPropertyDescriptor(object);
			addInfluencePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Factor_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Factor_description_feature", "_UI_Factor_type"),
				 EMFfitModelPackage.Literals.FACTOR__DESCRIPTION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flexibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlexibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Factor_flexibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Factor_flexibility_feature", "_UI_Factor_type"),
				 EMFfitModelPackage.Literals.FACTOR__FLEXIBILITY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Changeability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Factor_changeability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Factor_changeability_feature", "_UI_Factor_type"),
				 EMFfitModelPackage.Literals.FACTOR__CHANGEABILITY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Influence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfluencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Factor_influence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Factor_influence_feature", "_UI_Factor_type"),
				 EMFfitModelPackage.Literals.FACTOR__INFLUENCE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Factor_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Factor_priority_feature", "_UI_Factor_type"),
				 EMFfitModelPackage.Literals.FACTOR__PRIORITY,
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
			childrenFeatures.add(EMFfitModelPackage.Literals.FACTOR__DESCRIPTION);
			childrenFeatures.add(EMFfitModelPackage.Literals.FACTOR__FLEXIBILITY);
			childrenFeatures.add(EMFfitModelPackage.Literals.FACTOR__CHANGEABILITY);
			childrenFeatures.add(EMFfitModelPackage.Literals.FACTOR__INFLUENCE);
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
	 * This returns Factor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Factor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Factor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Factor_type") :
			getString("_UI_Factor_type") + " " + label;
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

		switch (notification.getFeatureID(Factor.class)) {
			case EMFfitModelPackage.FACTOR__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFfitModelPackage.FACTOR__DESCRIPTION:
			case EMFfitModelPackage.FACTOR__FLEXIBILITY:
			case EMFfitModelPackage.FACTOR__CHANGEABILITY:
			case EMFfitModelPackage.FACTOR__INFLUENCE:
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
				(EMFfitModelPackage.Literals.FACTOR__DESCRIPTION,
				 EMFfitModelFactory.eINSTANCE.createHypertext()));

		newChildDescriptors.add
			(createChildParameter
				(EMFfitModelPackage.Literals.FACTOR__FLEXIBILITY,
				 EMFfitModelFactory.eINSTANCE.createHypertext()));

		newChildDescriptors.add
			(createChildParameter
				(EMFfitModelPackage.Literals.FACTOR__CHANGEABILITY,
				 EMFfitModelFactory.eINSTANCE.createHypertext()));

		newChildDescriptors.add
			(createChildParameter
				(EMFfitModelPackage.Literals.FACTOR__INFLUENCE,
				 EMFfitModelFactory.eINSTANCE.createHypertext()));
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
			childFeature == EMFfitModelPackage.Literals.FACTOR__DESCRIPTION ||
			childFeature == EMFfitModelPackage.Literals.FACTOR__FLEXIBILITY ||
			childFeature == EMFfitModelPackage.Literals.FACTOR__CHANGEABILITY ||
			childFeature == EMFfitModelPackage.Literals.FACTOR__INFLUENCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

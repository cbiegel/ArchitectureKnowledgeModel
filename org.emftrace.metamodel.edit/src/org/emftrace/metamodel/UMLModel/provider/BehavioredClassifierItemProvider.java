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

import org.emftrace.metamodel.UMLModel.BehavioredClassifier;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.BehavioredClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehavioredClassifierItemProvider
	extends ClassifierItemProvider
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
	public BehavioredClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedBehaviorPropertyDescriptor(object);
			addClassifierBehaviorPropertyDescriptor(object);
			addInterfaceRealizationPropertyDescriptor(object);
			addOwnedTriggerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_ownedBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedBehavior_feature", "_UI_BehavioredClassifier_type"),
				 UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_classifierBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_classifierBehavior_feature", "_UI_BehavioredClassifier_type"),
				 UMLModelPackage.eINSTANCE.getBehavioredClassifier_ClassifierBehavior(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_interfaceRealization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_interfaceRealization_feature", "_UI_BehavioredClassifier_type"),
				 UMLModelPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_ownedTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedTrigger_feature", "_UI_BehavioredClassifier_type"),
				 UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehavioredClassifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BehavioredClassifier_type") :
			getString("_UI_BehavioredClassifier_type") + " " + label;
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

		switch (notification.getFeatureID(BehavioredClassifier.class)) {
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
			case UMLModelPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
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
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger(),
				 UMLModelFactory.eINSTANCE.createTrigger()));
	}

}

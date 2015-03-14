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

import org.emftrace.metamodel.UMLModel.InteractionUse;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.InteractionUse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionUseItemProvider
	extends InteractionFragmentItemProvider
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
	public InteractionUseItemProvider(AdapterFactory adapterFactory) {
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

			addRefersToPropertyDescriptor(object);
			addActualGatePropertyDescriptor(object);
			addArgumentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refers To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefersToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionUse_refersTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionUse_refersTo_feature", "_UI_InteractionUse_type"),
				 UMLModelPackage.eINSTANCE.getInteractionUse_RefersTo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Gate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualGatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionUse_actualGate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionUse_actualGate_feature", "_UI_InteractionUse_type"),
				 UMLModelPackage.eINSTANCE.getInteractionUse_ActualGate(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Argument feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionUse_argument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionUse_argument_feature", "_UI_InteractionUse_type"),
				 UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteractionUse_ActualGate());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteractionUse_Argument());
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
	 * This returns InteractionUse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionUse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InteractionUse)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InteractionUse_type") :
			getString("_UI_InteractionUse_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionUse.class)) {
			case UMLModelPackage.INTERACTION_USE__REFERS_TO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.INTERACTION_USE__ACTUAL_GATE:
			case UMLModelPackage.INTERACTION_USE__ARGUMENT:
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
				(UMLModelPackage.eINSTANCE.getInteractionUse_ActualGate(),
				 UMLModelFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteractionUse_Argument(),
				 UMLModelFactory.eINSTANCE.createValueSpecificationAction()));
	}

}

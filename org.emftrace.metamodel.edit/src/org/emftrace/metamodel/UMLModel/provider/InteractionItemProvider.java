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

import org.emftrace.metamodel.UMLModel.Interaction;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider
	extends BehaviorItemProvider
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
	public InteractionItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredPropertyDescriptor(object);
			addGeneralOrderingPropertyDescriptor(object);
			addEnclosingInteractionPropertyDescriptor(object);
			addEnclosingOperandPropertyDescriptor(object);
			addLifelinePropertyDescriptor(object);
			addFragmentPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addFormalGatePropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_covered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_covered_feature", "_UI_InteractionFragment_type"),
				 UMLModelPackage.eINSTANCE.getInteractionFragment_Covered(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the General Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_generalOrdering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_generalOrdering_feature", "_UI_InteractionFragment_type"),
				 UMLModelPackage.eINSTANCE.getInteractionFragment_GeneralOrdering(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enclosing Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingInteraction_feature", "_UI_InteractionFragment_type"),
				 UMLModelPackage.eINSTANCE.getInteractionFragment_EnclosingInteraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enclosing Operand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingOperandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingOperand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingOperand_feature", "_UI_InteractionFragment_type"),
				 UMLModelPackage.eINSTANCE.getInteractionFragment_EnclosingOperand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lifeline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifelinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_lifeline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_lifeline_feature", "_UI_Interaction_type"),
				 UMLModelPackage.eINSTANCE.getInteraction_Lifeline(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_fragment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_fragment_feature", "_UI_Interaction_type"),
				 UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_action_feature", "_UI_Interaction_type"),
				 UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formal Gate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalGatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_formalGate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_formalGate_feature", "_UI_Interaction_type"),
				 UMLModelPackage.eINSTANCE.getInteraction_FormalGate(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_message_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_message_feature", "_UI_Interaction_type"),
				 UMLModelPackage.eINSTANCE.getInteraction_Message(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteractionFragment_GeneralOrdering());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteraction_Lifeline());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteraction_Fragment());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteraction_Action());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteraction_FormalGate());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getInteraction_Message());
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interaction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interaction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Interaction_type") :
			getString("_UI_Interaction_type") + " " + label;
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

		switch (notification.getFeatureID(Interaction.class)) {
			case UMLModelPackage.INTERACTION__COVERED:
			case UMLModelPackage.INTERACTION__ENCLOSING_INTERACTION:
			case UMLModelPackage.INTERACTION__ENCLOSING_OPERAND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.INTERACTION__GENERAL_ORDERING:
			case UMLModelPackage.INTERACTION__LIFELINE:
			case UMLModelPackage.INTERACTION__FRAGMENT:
			case UMLModelPackage.INTERACTION__ACTION:
			case UMLModelPackage.INTERACTION__FORMAL_GATE:
			case UMLModelPackage.INTERACTION__MESSAGE:
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
				(UMLModelPackage.eINSTANCE.getInteractionFragment_GeneralOrdering(),
				 UMLModelFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Lifeline(),
				 UMLModelFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Fragment(),
				 UMLModelFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Action(),
				 UMLModelFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_FormalGate(),
				 UMLModelFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getInteraction_Message(),
				 UMLModelFactory.eINSTANCE.createMessage()));
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
			childFeature == UMLModelPackage.eINSTANCE.getClassifier_OwnedUseCase() ||
			childFeature == UMLModelPackage.eINSTANCE.getClass_NestedClassifier() ||
			childFeature == UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior() ||
			childFeature == UMLModelPackage.eINSTANCE.getInteraction_Fragment();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

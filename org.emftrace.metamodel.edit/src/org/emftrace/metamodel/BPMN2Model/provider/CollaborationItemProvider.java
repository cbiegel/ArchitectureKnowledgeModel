/**
 */
package org.emftrace.metamodel.BPMN2Model.provider;


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

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelFactory;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Collaboration;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.BPMN2Model.Collaboration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationItemProvider
	extends RootElementItemProvider
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
	public CollaborationItemProvider(AdapterFactory adapterFactory) {
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

			addParticipantsPropertyDescriptor(object);
			addMessageFlowsPropertyDescriptor(object);
			addArtifactsPropertyDescriptor(object);
			addConversationsPropertyDescriptor(object);
			addConversationAssociationsPropertyDescriptor(object);
			addParticipantAssociationsPropertyDescriptor(object);
			addMessageFlowAssociationsPropertyDescriptor(object);
			addCorrelationKeysPropertyDescriptor(object);
			addChoreographyRefPropertyDescriptor(object);
			addConversationLinksPropertyDescriptor(object);
			addIsClosedPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Participants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_participants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_participants_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_Participants(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_messageFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_messageFlows_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlows(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifacts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_artifacts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_artifacts_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_Artifacts(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_conversations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_conversations_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_Conversations(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_conversationAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_conversationAssociations_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationAssociations(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Participant Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_participantAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_participantAssociations_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_ParticipantAssociations(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Flow Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageFlowAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_messageFlowAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_messageFlowAssociations_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlowAssociations(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_correlationKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_correlationKeys_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_CorrelationKeys(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choreography Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoreographyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_choreographyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_choreographyRef_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_ChoreographyRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_conversationLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_conversationLinks_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationLinks(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Closed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsClosedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_isClosed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_isClosed_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_IsClosed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Collaboration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_name_feature", "_UI_Collaboration_type"),
				 BPMN2ModelPackage.eINSTANCE.getCollaboration_Name(),
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
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_Participants());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlows());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationAssociations());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_ParticipantAssociations());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlowAssociations());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_CorrelationKeys());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationLinks());
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
	 * This returns Collaboration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Collaboration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Collaboration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Collaboration_type") :
			getString("_UI_Collaboration_type") + " " + label;
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

		switch (notification.getFeatureID(Collaboration.class)) {
			case BPMN2ModelPackage.COLLABORATION__IS_CLOSED:
			case BPMN2ModelPackage.COLLABORATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN2ModelPackage.COLLABORATION__PARTICIPANTS:
			case BPMN2ModelPackage.COLLABORATION__MESSAGE_FLOWS:
			case BPMN2ModelPackage.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			case BPMN2ModelPackage.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			case BPMN2ModelPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			case BPMN2ModelPackage.COLLABORATION__CORRELATION_KEYS:
			case BPMN2ModelPackage.COLLABORATION__CONVERSATION_LINKS:
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
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_Participants(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlows(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationAssociations(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_ParticipantAssociations(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_MessageFlowAssociations(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_CorrelationKeys(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getCollaboration_ConversationLinks(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));
	}

}

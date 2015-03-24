/**
 */
package org.emftrace.metamodel.BPMN2Model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
import org.emftrace.metamodel.BPMN2Model.Lane;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.BPMN2Model.Lane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneItemProvider
	extends BaseElementItemProvider
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
	public LaneItemProvider(AdapterFactory adapterFactory) {
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

			addPartitionElementPropertyDescriptor(object);
			addFlowNodeRefsPropertyDescriptor(object);
			addChildLaneSetPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPartitionElementRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Partition Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lane_partitionElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lane_partitionElement_feature", "_UI_Lane_type"),
				 BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Node Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowNodeRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lane_flowNodeRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lane_flowNodeRefs_feature", "_UI_Lane_type"),
				 BPMN2ModelPackage.eINSTANCE.getLane_FlowNodeRefs(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Lane Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildLaneSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lane_childLaneSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lane_childLaneSet_feature", "_UI_Lane_type"),
				 BPMN2ModelPackage.eINSTANCE.getLane_ChildLaneSet(),
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
				 getString("_UI_Lane_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lane_name_feature", "_UI_Lane_type"),
				 BPMN2ModelPackage.eINSTANCE.getLane_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partition Element Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionElementRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lane_partitionElementRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lane_partitionElementRef_feature", "_UI_Lane_type"),
				 BPMN2ModelPackage.eINSTANCE.getLane_PartitionElementRef(),
				 true,
				 false,
				 true,
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
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getLane_ChildLaneSet());
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
	 * This returns Lane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lane"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lane)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Lane_type") :
			getString("_UI_Lane_type") + " " + label;
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

		switch (notification.getFeatureID(Lane.class)) {
			case BPMN2ModelPackage.LANE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
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
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getLane_ChildLaneSet(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == BPMN2ModelPackage.eINSTANCE.getBaseElement_Documentation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getLane_PartitionElement() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getLane_ChildLaneSet();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

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

import org.emftrace.metamodel.UMLModel.ActivityPartition;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.ActivityPartition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityPartitionItemProvider
	extends NamedElementItemProvider
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
	public ActivityPartitionItemProvider(AdapterFactory adapterFactory) {
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

			addContainedEdgePropertyDescriptor(object);
			addContainedNodePropertyDescriptor(object);
			addSubgroupPropertyDescriptor(object);
			addSuperGroupPropertyDescriptor(object);
			addInActivityPropertyDescriptor(object);
			addIsDimensionPropertyDescriptor(object);
			addIsExternalPropertyDescriptor(object);
			addEdgePropertyDescriptor(object);
			addRepresentsPropertyDescriptor(object);
			addSuperPartitionPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addSubpartitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contained Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_containedEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedEdge_feature", "_UI_ActivityGroup_type"),
				 UMLModelPackage.eINSTANCE.getActivityGroup_ContainedEdge(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contained Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_containedNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedNode_feature", "_UI_ActivityGroup_type"),
				 UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subgroup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubgroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_subgroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_subgroup_feature", "_UI_ActivityGroup_type"),
				 UMLModelPackage.eINSTANCE.getActivityGroup_Subgroup(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_superGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_superGroup_feature", "_UI_ActivityGroup_type"),
				 UMLModelPackage.eINSTANCE.getActivityGroup_SuperGroup(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_inActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_inActivity_feature", "_UI_ActivityGroup_type"),
				 UMLModelPackage.eINSTANCE.getActivityGroup_InActivity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_isDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_isDimension_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_IsDimension(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_isExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_isExternal_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_IsExternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_edge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_edge_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_Edge(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Represents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_represents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_represents_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_Represents(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Partition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperPartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_superPartition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_superPartition_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_SuperPartition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_node_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_Node(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subpartition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubpartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityPartition_subpartition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityPartition_subpartition_feature", "_UI_ActivityPartition_type"),
				 UMLModelPackage.eINSTANCE.getActivityPartition_Subpartition(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedEdge());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode());
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
	 * This returns ActivityPartition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityPartition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityPartition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityPartition_type") :
			getString("_UI_ActivityPartition_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityPartition.class)) {
			case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP:
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP:
			case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
			case UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION:
			case UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
			case UMLModelPackage.ACTIVITY_PARTITION__EDGE:
			case UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS:
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
			case UMLModelPackage.ACTIVITY_PARTITION__NODE:
			case UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
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
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedEdge(),
				 UMLModelFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedEdge(),
				 UMLModelFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getActivityGroup_ContainedNode(),
				 UMLModelFactory.eINSTANCE.createValueSpecificationAction()));
	}

}

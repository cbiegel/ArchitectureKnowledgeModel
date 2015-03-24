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
import org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiInstanceLoopCharacteristicsItemProvider
	extends LoopCharacteristicsItemProvider
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
	public MultiInstanceLoopCharacteristicsItemProvider(AdapterFactory adapterFactory) {
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

			addLoopCardinalityPropertyDescriptor(object);
			addLoopDataInputRefPropertyDescriptor(object);
			addLoopDataOutputRefPropertyDescriptor(object);
			addInputDataItemPropertyDescriptor(object);
			addOutputDataItemPropertyDescriptor(object);
			addComplexBehaviorDefinitionPropertyDescriptor(object);
			addCompletionConditionPropertyDescriptor(object);
			addBehaviorPropertyDescriptor(object);
			addIsSequentialPropertyDescriptor(object);
			addNoneBehaviorEventRefPropertyDescriptor(object);
			addOneBehaviorEventRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Loop Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_loopCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_loopCardinality_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop Data Input Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopDataInputRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_loopDataInputRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_loopDataInputRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataInputRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop Data Output Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopDataOutputRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_loopDataOutputRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_loopDataOutputRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataOutputRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Data Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputDataItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_inputDataItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_inputDataItem_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_InputDataItem(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Data Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputDataItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_outputDataItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_outputDataItem_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_OutputDataItem(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complex Behavior Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexBehaviorDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_complexBehaviorDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_complexBehaviorDefinition_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_completionCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_completionCondition_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_CompletionCondition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_behavior_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Sequential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSequentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_isSequential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_isSequential_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_IsSequential(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the None Behavior Event Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoneBehaviorEventRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the One Behavior Event Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOneBehaviorEventRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"),
				 BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_OneBehaviorEventRef(),
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
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopCardinality());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_InputDataItem());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_OutputDataItem());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_CompletionCondition());
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
	 * This returns MultiInstanceLoopCharacteristics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MultiInstanceLoopCharacteristics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MultiInstanceLoopCharacteristics)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_MultiInstanceLoopCharacteristics_type") :
			getString("_UI_MultiInstanceLoopCharacteristics_type") + " " + label;
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

		switch (notification.getFeatureID(MultiInstanceLoopCharacteristics.class)) {
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
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
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopCardinality(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopCardinality(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_InputDataItem(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_OutputDataItem(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_CompletionCondition(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_CompletionCondition(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));
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
			childFeature == BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopCardinality() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getMultiInstanceLoopCharacteristics_CompletionCondition();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

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

import org.emftrace.metamodel.UMLModel.Component;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends ClassItemProvider
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
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addIndirectlyInstantiatedPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addProvidedPropertyDescriptor(object);
			addPackagedElementPropertyDescriptor(object);
			addRealizationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Indirectly Instantiated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndirectlyInstantiatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_indirectlyInstantiated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_indirectlyInstantiated_feature", "_UI_Component_type"),
				 UMLModelPackage.eINSTANCE.getComponent_IndirectlyInstantiated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_required_feature", "_UI_Component_type"),
				 UMLModelPackage.eINSTANCE.getComponent_Required(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_provided_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_provided_feature", "_UI_Component_type"),
				 UMLModelPackage.eINSTANCE.getComponent_Provided(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Packaged Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_packagedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_packagedElement_feature", "_UI_Component_type"),
				 UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_realization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_realization_feature", "_UI_Component_type"),
				 UMLModelPackage.eINSTANCE.getComponent_Realization(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getComponent_PackagedElement());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getComponent_Realization());
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case UMLModelPackage.COMPONENT__INDIRECTLY_INSTANTIATED:
			case UMLModelPackage.COMPONENT__REQUIRED:
			case UMLModelPackage.COMPONENT__PROVIDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.COMPONENT__PACKAGED_ELEMENT:
			case UMLModelPackage.COMPONENT__REALIZATION:
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
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_PackagedElement(),
				 UMLModelFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getComponent_Realization(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));
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
			childFeature == UMLModelPackage.eINSTANCE.getNamedElement_NameExpression() ||
			childFeature == UMLModelPackage.eINSTANCE.getComponent_PackagedElement() ||
			childFeature == UMLModelPackage.eINSTANCE.getNamespace_OwnedRule() ||
			childFeature == UMLModelPackage.eINSTANCE.getClassifier_Substitution() ||
			childFeature == UMLModelPackage.eINSTANCE.getClassifier_OwnedUseCase() ||
			childFeature == UMLModelPackage.eINSTANCE.getClass_NestedClassifier() ||
			childFeature == UMLModelPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior() ||
			childFeature == UMLModelPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization() ||
			childFeature == UMLModelPackage.eINSTANCE.getComponent_Realization();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

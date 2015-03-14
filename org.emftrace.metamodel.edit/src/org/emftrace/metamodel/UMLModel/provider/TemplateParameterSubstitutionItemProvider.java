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

import org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProvider
	extends ElementItemProvider
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
	public TemplateParameterSubstitutionItemProvider(AdapterFactory adapterFactory) {
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

			addFormalPropertyDescriptor(object);
			addActualPropertyDescriptor(object);
			addOwnedActualPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Formal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_formal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_formal_feature", "_UI_TemplateParameterSubstitution_type"),
				 UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_Formal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_actual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_actual_feature", "_UI_TemplateParameterSubstitution_type"),
				 UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_Actual(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_ownedActual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_ownedActual_feature", "_UI_TemplateParameterSubstitution_type"),
				 UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_templateBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_templateBinding_feature", "_UI_TemplateParameterSubstitution_type"),
				 UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_TemplateBinding(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual());
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
	 * This returns TemplateParameterSubstitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateParameterSubstitution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TemplateParameterSubstitution)object).getUmlID();
		return label == null || label.length() == 0 ?
			getString("_UI_TemplateParameterSubstitution_type") :
			getString("_UI_TemplateParameterSubstitution_type") + " " + label;
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

		switch (notification.getFeatureID(TemplateParameterSubstitution.class)) {
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
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
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getTemplateParameterSubstitution_OwnedActual(),
				 UMLModelFactory.eINSTANCE.createVariable()));
	}

}

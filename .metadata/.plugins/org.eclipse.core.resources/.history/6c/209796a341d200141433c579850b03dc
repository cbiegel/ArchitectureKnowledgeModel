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

import org.emftrace.metamodel.UMLModel.ElementImport;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.ElementImport} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementImportItemProvider
	extends DirectedRelationshipItemProvider
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
	public ElementImportItemProvider(AdapterFactory adapterFactory) {
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

			addVisibilityPropertyDescriptor(object);
			addAliasPropertyDescriptor(object);
			addImportedElementPropertyDescriptor(object);
			addImportingNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementImport_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementImport_visibility_feature", "_UI_ElementImport_type"),
				 UMLModelPackage.eINSTANCE.getElementImport_Visibility(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementImport_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementImport_alias_feature", "_UI_ElementImport_type"),
				 UMLModelPackage.eINSTANCE.getElementImport_Alias(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementImport_importedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementImport_importedElement_feature", "_UI_ElementImport_type"),
				 UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Importing Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportingNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementImport_importingNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementImport_importingNamespace_feature", "_UI_ElementImport_type"),
				 UMLModelPackage.eINSTANCE.getElementImport_ImportingNamespace(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement());
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
	 * This returns ElementImport.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementImport"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementImport)object).getImportingNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementImport_type") :
			getString("_UI_ElementImport_type") + " " + label;
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

		switch (notification.getFeatureID(ElementImport.class)) {
			case UMLModelPackage.ELEMENT_IMPORT__VISIBILITY:
			case UMLModelPackage.ELEMENT_IMPORT__ALIAS:
			case UMLModelPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT:
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
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getElementImport_ImportedElement(),
				 UMLModelFactory.eINSTANCE.createUseCase()));
	}

}

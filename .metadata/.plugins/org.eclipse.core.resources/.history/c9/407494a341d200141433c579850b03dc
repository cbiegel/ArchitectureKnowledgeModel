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

import org.emftrace.metamodel.UMLModel.PackageImport;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.PackageImport} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageImportItemProvider
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
	public PackageImportItemProvider(AdapterFactory adapterFactory) {
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
			addImportingNamespacePropertyDescriptor(object);
			addImportedPackagePropertyDescriptor(object);
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
				 getString("_UI_PackageImport_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageImport_visibility_feature", "_UI_PackageImport_type"),
				 UMLModelPackage.eINSTANCE.getPackageImport_Visibility(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_PackageImport_importingNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageImport_importingNamespace_feature", "_UI_PackageImport_type"),
				 UMLModelPackage.eINSTANCE.getPackageImport_ImportingNamespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageImport_importedPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageImport_importedPackage_feature", "_UI_PackageImport_type"),
				 UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage());
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
	 * This returns PackageImport.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PackageImport"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PackageImport)object).getImportingNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_PackageImport_type") :
			getString("_UI_PackageImport_type") + " " + label;
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

		switch (notification.getFeatureID(PackageImport.class)) {
			case UMLModelPackage.PACKAGE_IMPORT__VISIBILITY:
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
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
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getPackageImport_ImportedPackage(),
				 UMLModelFactory.eINSTANCE.createUseCase()));
	}

}

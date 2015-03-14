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

import org.emftrace.metamodel.UMLModel.Artifact;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Artifact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactItemProvider
	extends ClassifierItemProvider
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
	public ArtifactItemProvider(AdapterFactory adapterFactory) {
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

			addFileNamePropertyDescriptor(object);
			addNestedArtifactPropertyDescriptor(object);
			addManifestationPropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addOwnedAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_fileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_fileName_feature", "_UI_Artifact_type"),
				 UMLModelPackage.eINSTANCE.getArtifact_FileName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nested Artifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedArtifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_nestedArtifact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_nestedArtifact_feature", "_UI_Artifact_type"),
				 UMLModelPackage.eINSTANCE.getArtifact_NestedArtifact(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manifestation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManifestationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_manifestation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_manifestation_feature", "_UI_Artifact_type"),
				 UMLModelPackage.eINSTANCE.getArtifact_Manifestation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_ownedOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_ownedOperation_feature", "_UI_Artifact_type"),
				 UMLModelPackage.eINSTANCE.getArtifact_OwnedOperation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_ownedAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_ownedAttribute_feature", "_UI_Artifact_type"),
				 UMLModelPackage.eINSTANCE.getArtifact_OwnedAttribute(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getArtifact_NestedArtifact());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getArtifact_Manifestation());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getArtifact_OwnedOperation());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getArtifact_OwnedAttribute());
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
	 * This returns Artifact.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Artifact"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Artifact)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Artifact_type") :
			getString("_UI_Artifact_type") + " " + label;
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

		switch (notification.getFeatureID(Artifact.class)) {
			case UMLModelPackage.ARTIFACT__FILE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.ARTIFACT__NESTED_ARTIFACT:
			case UMLModelPackage.ARTIFACT__MANIFESTATION:
			case UMLModelPackage.ARTIFACT__OWNED_OPERATION:
			case UMLModelPackage.ARTIFACT__OWNED_ATTRIBUTE:
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
				(UMLModelPackage.eINSTANCE.getArtifact_NestedArtifact(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_NestedArtifact(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_Manifestation(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_OwnedOperation(),
				 UMLModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_OwnedAttribute(),
				 UMLModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_OwnedAttribute(),
				 UMLModelFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getArtifact_OwnedAttribute(),
				 UMLModelFactory.eINSTANCE.createPort()));
	}

}

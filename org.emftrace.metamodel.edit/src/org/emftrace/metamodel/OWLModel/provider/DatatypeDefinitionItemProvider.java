/**
 */
package org.emftrace.metamodel.OWLModel.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.OWLModel.DatatypeDefinition;
import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.DatatypeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeDefinitionItemProvider
	extends AxiomItemProvider
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
	public DatatypeDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addDatatypePropertyDescriptor(object);
			addDataIntersectionOfPropertyDescriptor(object);
			addDataUnionOfPropertyDescriptor(object);
			addDataComplementOfPropertyDescriptor(object);
			addDataOneOfPropertyDescriptor(object);
			addDatatypeRestrictionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_Datatype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_Datatype_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_Datatype(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Intersection Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataIntersectionOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_DataIntersectionOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_DataIntersectionOf_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataIntersectionOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Union Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataUnionOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_DataUnionOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_DataUnionOf_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataUnionOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Complement Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataComplementOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_DataComplementOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_DataComplementOf_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataComplementOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data One Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOneOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_DataOneOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_DataOneOf_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataOneOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datatype Restriction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypeRestrictionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatatypeDefinition_DatatypeRestriction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatatypeDefinition_DatatypeRestriction_feature", "_UI_DatatypeDefinition_type"),
				 OWLModelPackage.eINSTANCE.getDatatypeDefinition_DatatypeRestriction(),
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
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_Datatype());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataIntersectionOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataUnionOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataComplementOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataOneOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DatatypeRestriction());
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
	 * This returns DatatypeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatatypeDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DatatypeDefinition)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DatatypeDefinition_type") :
			getString("_UI_DatatypeDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(DatatypeDefinition.class)) {
			case OWLModelPackage.DATATYPE_DEFINITION__DATATYPE:
			case OWLModelPackage.DATATYPE_DEFINITION__DATA_INTERSECTION_OF:
			case OWLModelPackage.DATATYPE_DEFINITION__DATA_UNION_OF:
			case OWLModelPackage.DATATYPE_DEFINITION__DATA_COMPLEMENT_OF:
			case OWLModelPackage.DATATYPE_DEFINITION__DATA_ONE_OF:
			case OWLModelPackage.DATATYPE_DEFINITION__DATATYPE_RESTRICTION:
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
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_Datatype(),
				 OWLModelFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataIntersectionOf(),
				 OWLModelFactory.eINSTANCE.createDataIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataUnionOf(),
				 OWLModelFactory.eINSTANCE.createDataUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataComplementOf(),
				 OWLModelFactory.eINSTANCE.createDataComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DataOneOf(),
				 OWLModelFactory.eINSTANCE.createDataOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getDatatypeDefinition_DatatypeRestriction(),
				 OWLModelFactory.eINSTANCE.createDatatypeRestriction()));
	}

}

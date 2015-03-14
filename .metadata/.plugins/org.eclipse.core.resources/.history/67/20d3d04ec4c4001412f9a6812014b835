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

import org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain;
import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationPropertyDomainItemProvider
	extends AnnotationAxiomItemProvider
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
	public AnnotationPropertyDomainItemProvider(AdapterFactory adapterFactory) {
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

			addAnnotationPropertyPropertyDescriptor(object);
			addIRIPropertyDescriptor(object);
			addAbbreviatedIRIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Annotation Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationPropertyDomain_AnnotationProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationPropertyDomain_AnnotationProperty_feature", "_UI_AnnotationPropertyDomain_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AnnotationProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationPropertyDomain_IRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationPropertyDomain_IRI_feature", "_UI_AnnotationPropertyDomain_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_IRI(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abbreviated IRI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbbreviatedIRIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationPropertyDomain_abbreviatedIRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationPropertyDomain_abbreviatedIRI_feature", "_UI_AnnotationPropertyDomain_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AbbreviatedIRI(),
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
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AnnotationProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_IRI());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AbbreviatedIRI());
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
	 * This returns AnnotationPropertyDomain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationPropertyDomain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnnotationPropertyDomain)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AnnotationPropertyDomain_type") :
			getString("_UI_AnnotationPropertyDomain_type") + " " + label;
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

		switch (notification.getFeatureID(AnnotationPropertyDomain.class)) {
			case OWLModelPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
			case OWLModelPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
			case OWLModelPackage.ANNOTATION_PROPERTY_DOMAIN__ABBREVIATED_IRI:
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
				(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AnnotationProperty(),
				 OWLModelFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_IRI(),
				 OWLModelFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationPropertyDomain_AbbreviatedIRI(),
				 OWLModelFactory.eINSTANCE.createAbbreviatedIRI()));
	}

}

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

import org.emftrace.metamodel.OWLModel.AnnotationAssertion;
import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.AnnotationAssertion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationAssertionItemProvider
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
	public AnnotationAssertionItemProvider(AdapterFactory adapterFactory) {
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
			addAnonymousIndividualPropertyDescriptor(object);
			addLiteralPropertyDescriptor(object);
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
				 getString("_UI_AnnotationAssertion_AnnotationProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationAssertion_AnnotationProperty_feature", "_UI_AnnotationAssertion_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnnotationProperty(),
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
				 getString("_UI_AnnotationAssertion_IRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationAssertion_IRI_feature", "_UI_AnnotationAssertion_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationAssertion_IRI(),
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
				 getString("_UI_AnnotationAssertion_abbreviatedIRI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationAssertion_abbreviatedIRI_feature", "_UI_AnnotationAssertion_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationAssertion_AbbreviatedIRI(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anonymous Individual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnonymousIndividualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationAssertion_AnonymousIndividual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationAssertion_AnonymousIndividual_feature", "_UI_AnnotationAssertion_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnonymousIndividual(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotationAssertion_Literal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotationAssertion_Literal_feature", "_UI_AnnotationAssertion_type"),
				 OWLModelPackage.eINSTANCE.getAnnotationAssertion_Literal(),
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
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnnotationProperty());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationAssertion_IRI());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AbbreviatedIRI());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnonymousIndividual());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getAnnotationAssertion_Literal());
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
	 * This returns AnnotationAssertion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationAssertion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnnotationAssertion)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AnnotationAssertion_type") :
			getString("_UI_AnnotationAssertion_type") + " " + label;
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

		switch (notification.getFeatureID(AnnotationAssertion.class)) {
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
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
				(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnnotationProperty(),
				 OWLModelFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationAssertion_IRI(),
				 OWLModelFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AbbreviatedIRI(),
				 OWLModelFactory.eINSTANCE.createAbbreviatedIRI()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationAssertion_AnonymousIndividual(),
				 OWLModelFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getAnnotationAssertion_Literal(),
				 OWLModelFactory.eINSTANCE.createLiteral()));
	}

}

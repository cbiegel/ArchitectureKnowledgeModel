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

import org.emftrace.metamodel.UMLModel.Lifeline;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Lifeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifelineItemProvider
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
	public LifelineItemProvider(AdapterFactory adapterFactory) {
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

			addRepresentsPropertyDescriptor(object);
			addInteractionPropertyDescriptor(object);
			addSelectorPropertyDescriptor(object);
			addDecomposedAsPropertyDescriptor(object);
			addCoveredByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Lifeline_represents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_represents_feature", "_UI_Lifeline_type"),
				 UMLModelPackage.eINSTANCE.getLifeline_Represents(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_interaction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_interaction_feature", "_UI_Lifeline_type"),
				 UMLModelPackage.eINSTANCE.getLifeline_Interaction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_selector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_selector_feature", "_UI_Lifeline_type"),
				 UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposed As feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposedAsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_decomposedAs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_decomposedAs_feature", "_UI_Lifeline_type"),
				 UMLModelPackage.eINSTANCE.getLifeline_DecomposedAs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Covered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_coveredBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_coveredBy_feature", "_UI_Lifeline_type"),
				 UMLModelPackage.eINSTANCE.getLifeline_CoveredBy(),
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getLifeline_Selector());
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
	 * This returns Lifeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lifeline"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lifeline)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Lifeline_type") :
			getString("_UI_Lifeline_type") + " " + label;
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

		switch (notification.getFeatureID(Lifeline.class)) {
			case UMLModelPackage.LIFELINE__REPRESENTS:
			case UMLModelPackage.LIFELINE__INTERACTION:
			case UMLModelPackage.LIFELINE__DECOMPOSED_AS:
			case UMLModelPackage.LIFELINE__COVERED_BY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.LIFELINE__SELECTOR:
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
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getLifeline_Selector(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));
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
			childFeature == UMLModelPackage.eINSTANCE.getLifeline_Selector();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

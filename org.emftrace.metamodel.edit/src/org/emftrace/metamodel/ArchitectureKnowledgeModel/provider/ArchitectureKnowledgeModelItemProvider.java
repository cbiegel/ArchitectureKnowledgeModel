/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.provider;


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

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelFactory;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureKnowledgeModelItemProvider
	extends ArchitectureKnowledgeModelBaseItemProvider
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
	public ArchitectureKnowledgeModelItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchitectureKnowledgeModel_Version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchitectureKnowledgeModel_Version_feature", "_UI_ArchitectureKnowledgeModel_type"),
				 ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__VERSION,
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
			childrenFeatures.add(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS);
			childrenFeatures.add(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS);
			childrenFeatures.add(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS);
			childrenFeatures.add(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS);
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
	 * This returns ArchitectureKnowledgeModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArchitectureKnowledgeModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArchitectureKnowledgeModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArchitectureKnowledgeModel_type") :
			getString("_UI_ArchitectureKnowledgeModel_type") + " " + label;
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

		switch (notification.getFeatureID(ArchitectureKnowledgeModel.class)) {
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS:
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS:
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS:
			case ArchitectureKnowledgeModelPackage.ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS:
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
				(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS,
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutions()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS,
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createConceptualSolutions()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS,
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createDevelopmentEnvironments()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitectureKnowledgeModelPackage.Literals.ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS,
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createRelations()));
	}

}

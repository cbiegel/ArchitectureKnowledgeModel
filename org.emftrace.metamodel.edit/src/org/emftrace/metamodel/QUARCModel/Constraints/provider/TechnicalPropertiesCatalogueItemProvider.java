/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.provider;


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

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnicalPropertiesCatalogueItemProvider
	extends ConstraintsBaseItemProvider
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
	public TechnicalPropertiesCatalogueItemProvider(AdapterFactory adapterFactory) {
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

			addCataloguePropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Catalogue Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCataloguePropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnicalPropertiesCatalogue_catalogueProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnicalPropertiesCatalogue_catalogueProperties_feature", "_UI_TechnicalPropertiesCatalogue_type"),
				 ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
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
			childrenFeatures.add(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES);
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
	 * This returns TechnicalPropertiesCatalogue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnicalPropertiesCatalogue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TechnicalPropertiesCatalogue_type");
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

		switch (notification.getFeatureID(TechnicalPropertiesCatalogue.class)) {
			case ConstraintsPackage.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES:
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
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createStringTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createFloatTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createRegularExpressionTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createEnumTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES,
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertyCategory()));
	}

}

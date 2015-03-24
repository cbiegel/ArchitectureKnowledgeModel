/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Query.provider;

import org.emftrace.metamodel.QUARCModel.GSS.Element;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.QUARCModel.Query.ApplicableElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicableElementItemProvider
	extends GSSQueryModelBaseItemProvider
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
	public ApplicableElementItemProvider(AdapterFactory adapterFactory) {
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

			addElementPropertyDescriptor(object);
			addOutgoingImpactRelationsPropertyDescriptor(object);
			addIncomingImpactRelationsPropertyDescriptor(object);
			addIncomingOffsetRelationsPropertyDescriptor(object);
			addOutgoingOffsetRelationsPropertyDescriptor(object);
			addIncomingDecompositionRelationsPropertyDescriptor(object);
			addOutgoingDecompositionRelationsPropertyDescriptor(object);
			addIncomingIsARelationsPropertyDescriptor(object);
			addOutgoingIsARelationsPropertyDescriptor(object);
			addIncomingRelationsFromElementsWithUndefinedPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_element_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_element_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Impact Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingImpactRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_outgoingImpactRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_outgoingImpactRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Impact Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingImpactRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_incomingImpactRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_incomingImpactRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Offset Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingOffsetRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_incomingOffsetRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_incomingOffsetRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Offset Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingOffsetRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_outgoingOffsetRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_outgoingOffsetRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Decomposition Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingDecompositionRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_incomingDecompositionRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_incomingDecompositionRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Decomposition Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingDecompositionRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_outgoingDecompositionRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_outgoingDecompositionRelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Is ARelations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingIsARelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_incomingIsARelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_incomingIsARelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Is ARelations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingIsARelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_outgoingIsARelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_outgoingIsARelations_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Relations From Elements With Undefined Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingRelationsFromElementsWithUndefinedPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicableElement_incomingRelationsFromElementsWithUndefinedProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicableElement_incomingRelationsFromElementsWithUndefinedProperties_feature", "_UI_ApplicableElement_type"),
				 QueryPackage.Literals.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ApplicableElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApplicableElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		String label = getString("_UI_ApplicableElement_type");

		Element assignedElement = ((ApplicableElement)object).getElement();
		if (assignedElement != null){
			label += " \"" +assignedElement.getName()+"\"";
		}
		return 	label;
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
	}

}

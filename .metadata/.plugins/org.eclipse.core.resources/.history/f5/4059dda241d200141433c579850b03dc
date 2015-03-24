/**
 */
package org.emftrace.metamodel.URNModel.provider;


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

import org.emftrace.metamodel.URNModel.GRLGraph;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.URNModel.GRLGraph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GRLGraphItemProvider
	extends GRLmodelElementItemProvider
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
	public GRLGraphItemProvider(AdapterFactory adapterFactory) {
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

			addConnectionsPropertyDescriptor(object);
			addNodesPropertyDescriptor(object);
			addContRefsPropertyDescriptor(object);
			addCommentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GRLGraph_connections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GRLGraph_connections_feature", "_UI_GRLGraph_type"),
				 URNModelPackage.Literals.GRL_GRAPH__CONNECTIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GRLGraph_nodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GRLGraph_nodes_feature", "_UI_GRLGraph_type"),
				 URNModelPackage.Literals.GRL_GRAPH__NODES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cont Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GRLGraph_contRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GRLGraph_contRefs_feature", "_UI_GRLGraph_type"),
				 URNModelPackage.Literals.GRL_GRAPH__CONT_REFS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GRLGraph_comments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GRLGraph_comments_feature", "_UI_GRLGraph_type"),
				 URNModelPackage.Literals.GRL_GRAPH__COMMENTS,
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
			childrenFeatures.add(URNModelPackage.Literals.GRL_GRAPH__CONNECTIONS);
			childrenFeatures.add(URNModelPackage.Literals.GRL_GRAPH__NODES);
			childrenFeatures.add(URNModelPackage.Literals.GRL_GRAPH__CONT_REFS);
			childrenFeatures.add(URNModelPackage.Literals.GRL_GRAPH__COMMENTS);
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
	 * This returns GRLGraph.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GRLGraph"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GRLGraph)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GRLGraph_type") :
			getString("_UI_GRLGraph_type") + " " + label;
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

		switch (notification.getFeatureID(GRLGraph.class)) {
			case URNModelPackage.GRL_GRAPH__CONNECTIONS:
			case URNModelPackage.GRL_GRAPH__NODES:
			case URNModelPackage.GRL_GRAPH__CONT_REFS:
			case URNModelPackage.GRL_GRAPH__COMMENTS:
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
				(URNModelPackage.Literals.GRL_GRAPH__CONNECTIONS,
				 URNModelFactory.eINSTANCE.createLinkRef()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.GRL_GRAPH__NODES,
				 URNModelFactory.eINSTANCE.createGRLNode()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.GRL_GRAPH__NODES,
				 URNModelFactory.eINSTANCE.createCollapsedActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.GRL_GRAPH__NODES,
				 URNModelFactory.eINSTANCE.createIntentionalElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.GRL_GRAPH__CONT_REFS,
				 URNModelFactory.eINSTANCE.createActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(URNModelPackage.Literals.GRL_GRAPH__COMMENTS,
				 URNModelFactory.eINSTANCE.createComment()));
	}

}

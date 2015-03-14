/**
 */
package org.emftrace.metamodel.LinkModel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.emftrace.metamodel.LinkModel.util.LinkModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkModelItemProviderAdapterFactory extends LinkModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.DesignAlternatives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignAlternativesItemProvider designAlternativesItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.DesignAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignAlternativesAdapter() {
		if (designAlternativesItemProvider == null) {
			designAlternativesItemProvider = new DesignAlternativesItemProvider(this);
		}

		return designAlternativesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.DesignDecision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignDecisionItemProvider designDecisionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.DesignDecision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignDecisionAdapter() {
		if (designDecisionItemProvider == null) {
			designDecisionItemProvider = new DesignDecisionItemProvider(this);
		}

		return designDecisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.TraceLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkItemProvider traceLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceLinkAdapter() {
		if (traceLinkItemProvider == null) {
			traceLinkItemProvider = new TraceLinkItemProvider(this);
		}

		return traceLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.Trace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceItemProvider traceItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceAdapter() {
		if (traceItemProvider == null) {
			traceItemProvider = new TraceItemProvider(this);
		}

		return traceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.LinkType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeItemProvider linkTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkTypeAdapter() {
		if (linkTypeItemProvider == null) {
			linkTypeItemProvider = new LinkTypeItemProvider(this);
		}

		return linkTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeCatalogItemProvider linkTypeCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkTypeCatalogAdapter() {
		if (linkTypeCatalogItemProvider == null) {
			linkTypeCatalogItemProvider = new LinkTypeCatalogItemProvider(this);
		}

		return linkTypeCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.LinkModel.LinkContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkContainerItemProvider linkContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.LinkModel.LinkContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkContainerAdapter() {
		if (linkContainerItemProvider == null) {
			linkContainerItemProvider = new LinkContainerItemProvider(this);
		}

		return linkContainerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (designAlternativesItemProvider != null) designAlternativesItemProvider.dispose();
		if (designDecisionItemProvider != null) designDecisionItemProvider.dispose();
		if (traceLinkItemProvider != null) traceLinkItemProvider.dispose();
		if (traceItemProvider != null) traceItemProvider.dispose();
		if (linkTypeItemProvider != null) linkTypeItemProvider.dispose();
		if (linkTypeCatalogItemProvider != null) linkTypeCatalogItemProvider.dispose();
		if (linkContainerItemProvider != null) linkContainerItemProvider.dispose();
	}

}
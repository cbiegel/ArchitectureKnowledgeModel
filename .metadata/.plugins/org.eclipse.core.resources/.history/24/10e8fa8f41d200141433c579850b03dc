/**
 */
package org.emftrace.metamodel.LinkModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.LinkModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkModelFactoryImpl extends EFactoryImpl implements LinkModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinkModelFactory init() {
		try {
			LinkModelFactory theLinkModelFactory = (LinkModelFactory)EPackage.Registry.INSTANCE.getEFactory(LinkModelPackage.eNS_URI);
			if (theLinkModelFactory != null) {
				return theLinkModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinkModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LinkModelPackage.DESIGN_ALTERNATIVES: return createDesignAlternatives();
			case LinkModelPackage.DESIGN_DECISION: return createDesignDecision();
			case LinkModelPackage.TRACE_LINK: return createTraceLink();
			case LinkModelPackage.TRACE: return createTrace();
			case LinkModelPackage.LINK_TYPE: return createLinkType();
			case LinkModelPackage.LINK_TYPE_CATALOG: return createLinkTypeCatalog();
			case LinkModelPackage.LINK_CONTAINER: return createLinkContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAlternatives createDesignAlternatives() {
		DesignAlternativesImpl designAlternatives = new DesignAlternativesImpl();
		return designAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDecision createDesignDecision() {
		DesignDecisionImpl designDecision = new DesignDecisionImpl();
		return designDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink createTraceLink() {
		TraceLinkImpl traceLink = new TraceLinkImpl();
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeCatalog createLinkTypeCatalog() {
		LinkTypeCatalogImpl linkTypeCatalog = new LinkTypeCatalogImpl();
		return linkTypeCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkContainer createLinkContainer() {
		LinkContainerImpl linkContainer = new LinkContainerImpl();
		return linkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkModelPackage getLinkModelPackage() {
		return (LinkModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinkModelPackage getPackage() {
		return LinkModelPackage.eINSTANCE;
	}

} //LinkModelFactoryImpl

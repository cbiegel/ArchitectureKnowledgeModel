/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.isA;

import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getOutgoingImpactRelations <em>Outgoing Impact Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getIncomingImpactRelations <em>Incoming Impact Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getIncomingOffsetRelations <em>Incoming Offset Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getOutgoingOffsetRelations <em>Outgoing Offset Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getIncomingDecompositionRelations <em>Incoming Decomposition Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getOutgoingDecompositionRelations <em>Outgoing Decomposition Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getIncomingIsARelations <em>Incoming Is ARelations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getOutgoingIsARelations <em>Outgoing Is ARelations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.ApplicableElementImpl#getIncomingRelationsFromElementsWithUndefinedProperties <em>Incoming Relations From Elements With Undefined Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicableElementImpl extends GSSQueryModelBaseImpl implements ApplicableElement {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The cached value of the '{@link #getOutgoingImpactRelations() <em>Outgoing Impact Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingImpactRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> outgoingImpactRelations;

	/**
	 * The cached value of the '{@link #getIncomingImpactRelations() <em>Incoming Impact Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingImpactRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> incomingImpactRelations;

	/**
	 * The cached value of the '{@link #getIncomingOffsetRelations() <em>Incoming Offset Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingOffsetRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Offset> incomingOffsetRelations;

	/**
	 * The cached value of the '{@link #getOutgoingOffsetRelations() <em>Outgoing Offset Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingOffsetRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Offset> outgoingOffsetRelations;

	/**
	 * The cached value of the '{@link #getIncomingDecompositionRelations() <em>Incoming Decomposition Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDecompositionRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> incomingDecompositionRelations;

	/**
	 * The cached value of the '{@link #getOutgoingDecompositionRelations() <em>Outgoing Decomposition Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDecompositionRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> outgoingDecompositionRelations;

	/**
	 * The cached value of the '{@link #getIncomingIsARelations() <em>Incoming Is ARelations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingIsARelations()
	 * @generated
	 * @ordered
	 */
	protected EList<isA> incomingIsARelations;

	/**
	 * The cached value of the '{@link #getOutgoingIsARelations() <em>Outgoing Is ARelations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingIsARelations()
	 * @generated
	 * @ordered
	 */
	protected isA outgoingIsARelations;

	/**
	 * The cached value of the '{@link #getIncomingRelationsFromElementsWithUndefinedProperties() <em>Incoming Relations From Elements With Undefined Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelationsFromElementsWithUndefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incomingRelationsFromElementsWithUndefinedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.APPLICABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.APPLICABLE_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.APPLICABLE_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getOutgoingImpactRelations() {
		if (outgoingImpactRelations == null) {
			outgoingImpactRelations = new EObjectResolvingEList<Impact>(Impact.class, this, QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS);
		}
		return outgoingImpactRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getIncomingImpactRelations() {
		if (incomingImpactRelations == null) {
			incomingImpactRelations = new EObjectResolvingEList<Impact>(Impact.class, this, QueryPackage.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS);
		}
		return incomingImpactRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offset> getIncomingOffsetRelations() {
		if (incomingOffsetRelations == null) {
			incomingOffsetRelations = new EObjectResolvingEList<Offset>(Offset.class, this, QueryPackage.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS);
		}
		return incomingOffsetRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offset> getOutgoingOffsetRelations() {
		if (outgoingOffsetRelations == null) {
			outgoingOffsetRelations = new EObjectResolvingEList<Offset>(Offset.class, this, QueryPackage.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS);
		}
		return outgoingOffsetRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decomposition> getIncomingDecompositionRelations() {
		if (incomingDecompositionRelations == null) {
			incomingDecompositionRelations = new EObjectResolvingEList<Decomposition>(Decomposition.class, this, QueryPackage.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS);
		}
		return incomingDecompositionRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decomposition> getOutgoingDecompositionRelations() {
		if (outgoingDecompositionRelations == null) {
			outgoingDecompositionRelations = new EObjectResolvingEList<Decomposition>(Decomposition.class, this, QueryPackage.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS);
		}
		return outgoingDecompositionRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<isA> getIncomingIsARelations() {
		if (incomingIsARelations == null) {
			incomingIsARelations = new EObjectResolvingEList<isA>(isA.class, this, QueryPackage.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS);
		}
		return incomingIsARelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isA getOutgoingIsARelations() {
		if (outgoingIsARelations != null && outgoingIsARelations.eIsProxy()) {
			InternalEObject oldOutgoingIsARelations = (InternalEObject)outgoingIsARelations;
			outgoingIsARelations = (isA)eResolveProxy(oldOutgoingIsARelations);
			if (outgoingIsARelations != oldOutgoingIsARelations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS, oldOutgoingIsARelations, outgoingIsARelations));
			}
		}
		return outgoingIsARelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isA basicGetOutgoingIsARelations() {
		return outgoingIsARelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingIsARelations(isA newOutgoingIsARelations) {
		isA oldOutgoingIsARelations = outgoingIsARelations;
		outgoingIsARelations = newOutgoingIsARelations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS, oldOutgoingIsARelations, outgoingIsARelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIncomingRelationsFromElementsWithUndefinedProperties() {
		if (incomingRelationsFromElementsWithUndefinedProperties == null) {
			incomingRelationsFromElementsWithUndefinedProperties = new EObjectResolvingEList<Relation>(Relation.class, this, QueryPackage.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES);
		}
		return incomingRelationsFromElementsWithUndefinedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.APPLICABLE_ELEMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS:
				return getOutgoingImpactRelations();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS:
				return getIncomingImpactRelations();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS:
				return getIncomingOffsetRelations();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS:
				return getOutgoingOffsetRelations();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS:
				return getIncomingDecompositionRelations();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS:
				return getOutgoingDecompositionRelations();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS:
				return getIncomingIsARelations();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS:
				if (resolve) return getOutgoingIsARelations();
				return basicGetOutgoingIsARelations();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES:
				return getIncomingRelationsFromElementsWithUndefinedProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.APPLICABLE_ELEMENT__ELEMENT:
				setElement((Element)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS:
				getOutgoingImpactRelations().clear();
				getOutgoingImpactRelations().addAll((Collection<? extends Impact>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS:
				getIncomingImpactRelations().clear();
				getIncomingImpactRelations().addAll((Collection<? extends Impact>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS:
				getIncomingOffsetRelations().clear();
				getIncomingOffsetRelations().addAll((Collection<? extends Offset>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS:
				getOutgoingOffsetRelations().clear();
				getOutgoingOffsetRelations().addAll((Collection<? extends Offset>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS:
				getIncomingDecompositionRelations().clear();
				getIncomingDecompositionRelations().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS:
				getOutgoingDecompositionRelations().clear();
				getOutgoingDecompositionRelations().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS:
				getIncomingIsARelations().clear();
				getIncomingIsARelations().addAll((Collection<? extends isA>)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS:
				setOutgoingIsARelations((isA)newValue);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES:
				getIncomingRelationsFromElementsWithUndefinedProperties().clear();
				getIncomingRelationsFromElementsWithUndefinedProperties().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.APPLICABLE_ELEMENT__ELEMENT:
				setElement((Element)null);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS:
				getOutgoingImpactRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS:
				getIncomingImpactRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS:
				getIncomingOffsetRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS:
				getOutgoingOffsetRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS:
				getIncomingDecompositionRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS:
				getOutgoingDecompositionRelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS:
				getIncomingIsARelations().clear();
				return;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS:
				setOutgoingIsARelations((isA)null);
				return;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES:
				getIncomingRelationsFromElementsWithUndefinedProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.APPLICABLE_ELEMENT__ELEMENT:
				return element != null;
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS:
				return outgoingImpactRelations != null && !outgoingImpactRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS:
				return incomingImpactRelations != null && !incomingImpactRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS:
				return incomingOffsetRelations != null && !incomingOffsetRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS:
				return outgoingOffsetRelations != null && !outgoingOffsetRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS:
				return incomingDecompositionRelations != null && !incomingDecompositionRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS:
				return outgoingDecompositionRelations != null && !outgoingDecompositionRelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS:
				return incomingIsARelations != null && !incomingIsARelations.isEmpty();
			case QueryPackage.APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS:
				return outgoingIsARelations != null;
			case QueryPackage.APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES:
				return incomingRelationsFromElementsWithUndefinedProperties != null && !incomingRelationsFromElementsWithUndefinedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicableElementImpl

/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.ConcreteGRLspec;
import org.emftrace.metamodel.URNModel.ElementLink;
import org.emftrace.metamodel.URNModel.EvaluationStrategy;
import org.emftrace.metamodel.URNModel.GRLGraph;
import org.emftrace.metamodel.URNModel.GRLspec;
import org.emftrace.metamodel.URNModel.IntentionalElement;
import org.emftrace.metamodel.URNModel.StrategiesGroup;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GR Lspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getIntElements <em>Int Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getGrlGraphs <em>Grl Graphs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GRLspecImpl extends URNBaseImpl implements GRLspec {
	/**
	 * The cached value of the '{@link #getIntElements() <em>Int Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentionalElement> intElements;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementLink> links;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<StrategiesGroup> groups;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationStrategy> strategies;

	/**
	 * The cached value of the '{@link #getGrlGraphs() <em>Grl Graphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrlGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<GRLGraph> grlGraphs;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected ConcreteGRLspec info;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GRLspecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.GR_LSPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentionalElement> getIntElements() {
		if (intElements == null) {
			intElements = new EObjectContainmentEList<IntentionalElement>(IntentionalElement.class, this, URNModelPackage.GR_LSPEC__INT_ELEMENTS);
		}
		return intElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, URNModelPackage.GR_LSPEC__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<ElementLink>(ElementLink.class, this, URNModelPackage.GR_LSPEC__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrategiesGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<StrategiesGroup>(StrategiesGroup.class, this, URNModelPackage.GR_LSPEC__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<EvaluationStrategy>(EvaluationStrategy.class, this, URNModelPackage.GR_LSPEC__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GRLGraph> getGrlGraphs() {
		if (grlGraphs == null) {
			grlGraphs = new EObjectContainmentEList<GRLGraph>(GRLGraph.class, this, URNModelPackage.GR_LSPEC__GRL_GRAPHS);
		}
		return grlGraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteGRLspec getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(ConcreteGRLspec newInfo, NotificationChain msgs) {
		ConcreteGRLspec oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.GR_LSPEC__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(ConcreteGRLspec newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.GR_LSPEC__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.GR_LSPEC__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.GR_LSPEC__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.GR_LSPEC__INT_ELEMENTS:
				return ((InternalEList<?>)getIntElements()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__GRL_GRAPHS:
				return ((InternalEList<?>)getGrlGraphs()).basicRemove(otherEnd, msgs);
			case URNModelPackage.GR_LSPEC__INFO:
				return basicSetInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.GR_LSPEC__INT_ELEMENTS:
				return getIntElements();
			case URNModelPackage.GR_LSPEC__ACTORS:
				return getActors();
			case URNModelPackage.GR_LSPEC__LINKS:
				return getLinks();
			case URNModelPackage.GR_LSPEC__GROUPS:
				return getGroups();
			case URNModelPackage.GR_LSPEC__STRATEGIES:
				return getStrategies();
			case URNModelPackage.GR_LSPEC__GRL_GRAPHS:
				return getGrlGraphs();
			case URNModelPackage.GR_LSPEC__INFO:
				return getInfo();
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
			case URNModelPackage.GR_LSPEC__INT_ELEMENTS:
				getIntElements().clear();
				getIntElements().addAll((Collection<? extends IntentionalElement>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends ElementLink>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends StrategiesGroup>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__GRL_GRAPHS:
				getGrlGraphs().clear();
				getGrlGraphs().addAll((Collection<? extends GRLGraph>)newValue);
				return;
			case URNModelPackage.GR_LSPEC__INFO:
				setInfo((ConcreteGRLspec)newValue);
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
			case URNModelPackage.GR_LSPEC__INT_ELEMENTS:
				getIntElements().clear();
				return;
			case URNModelPackage.GR_LSPEC__ACTORS:
				getActors().clear();
				return;
			case URNModelPackage.GR_LSPEC__LINKS:
				getLinks().clear();
				return;
			case URNModelPackage.GR_LSPEC__GROUPS:
				getGroups().clear();
				return;
			case URNModelPackage.GR_LSPEC__STRATEGIES:
				getStrategies().clear();
				return;
			case URNModelPackage.GR_LSPEC__GRL_GRAPHS:
				getGrlGraphs().clear();
				return;
			case URNModelPackage.GR_LSPEC__INFO:
				setInfo((ConcreteGRLspec)null);
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
			case URNModelPackage.GR_LSPEC__INT_ELEMENTS:
				return intElements != null && !intElements.isEmpty();
			case URNModelPackage.GR_LSPEC__ACTORS:
				return actors != null && !actors.isEmpty();
			case URNModelPackage.GR_LSPEC__LINKS:
				return links != null && !links.isEmpty();
			case URNModelPackage.GR_LSPEC__GROUPS:
				return groups != null && !groups.isEmpty();
			case URNModelPackage.GR_LSPEC__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case URNModelPackage.GR_LSPEC__GRL_GRAPHS:
				return grlGraphs != null && !grlGraphs.isEmpty();
			case URNModelPackage.GR_LSPEC__INFO:
				return info != null;
		}
		return super.eIsSet(featureID);
	}

} //GRLspecImpl

/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prioritized Element Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.PrioritizedElementSetImpl#getPrioritizedElements <em>Prioritized Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.PrioritizedElementSetImpl#getPriorizedDecompositionRelations <em>Priorized Decomposition Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.PrioritizedElementSetImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PrioritizedElementSetImpl extends GSSQueryModelBaseImpl implements PrioritizedElementSet {
	/**
	 * The cached value of the '{@link #getPrioritizedElements() <em>Prioritized Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritizedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PrioritizedElement> prioritizedElements;

	/**
	 * The cached value of the '{@link #getPriorizedDecompositionRelations() <em>Priorized Decomposition Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorizedDecompositionRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<PrioritizedDecomposition> priorizedDecompositionRelations;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrioritizedElementSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.PRIORITIZED_ELEMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrioritizedElement> getPrioritizedElements() {
		if (prioritizedElements == null) {
			prioritizedElements = new EObjectContainmentEList<PrioritizedElement>(PrioritizedElement.class, this, QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS);
		}
		return prioritizedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrioritizedDecomposition> getPriorizedDecompositionRelations() {
		if (priorizedDecompositionRelations == null) {
			priorizedDecompositionRelations = new EObjectContainmentEList<PrioritizedDecomposition>(PrioritizedDecomposition.class, this, QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS);
		}
		return priorizedDecompositionRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.PRIORITIZED_ELEMENT_SET__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS:
				return ((InternalEList<?>)getPrioritizedElements()).basicRemove(otherEnd, msgs);
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS:
				return ((InternalEList<?>)getPriorizedDecompositionRelations()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS:
				return getPrioritizedElements();
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS:
				return getPriorizedDecompositionRelations();
			case QueryPackage.PRIORITIZED_ELEMENT_SET__CHANGED:
				return isChanged();
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
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS:
				getPrioritizedElements().clear();
				getPrioritizedElements().addAll((Collection<? extends PrioritizedElement>)newValue);
				return;
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS:
				getPriorizedDecompositionRelations().clear();
				getPriorizedDecompositionRelations().addAll((Collection<? extends PrioritizedDecomposition>)newValue);
				return;
			case QueryPackage.PRIORITIZED_ELEMENT_SET__CHANGED:
				setChanged((Boolean)newValue);
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
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS:
				getPrioritizedElements().clear();
				return;
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS:
				getPriorizedDecompositionRelations().clear();
				return;
			case QueryPackage.PRIORITIZED_ELEMENT_SET__CHANGED:
				setChanged(CHANGED_EDEFAULT);
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
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS:
				return prioritizedElements != null && !prioritizedElements.isEmpty();
			case QueryPackage.PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS:
				return priorizedDecompositionRelations != null && !priorizedDecompositionRelations.isEmpty();
			case QueryPackage.PRIORITIZED_ELEMENT_SET__CHANGED:
				return changed != CHANGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //PrioritizedElementSetImpl

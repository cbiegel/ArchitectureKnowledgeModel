/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.DifferentIndividuals;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DifferentIndividualsImpl#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DifferentIndividualsImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentIndividualsImpl extends AssertionImpl implements DifferentIndividuals {
	/**
	 * The cached value of the '{@link #getNamedIndividual() <em>Named Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedIndividual> namedIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousIndividual> anonymousIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferentIndividualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDifferentIndividuals();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedIndividual> getNamedIndividual() {
		if (namedIndividual == null) {
			namedIndividual = new EObjectContainmentEList<NamedIndividual>(NamedIndividual.class, this, OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL);
		}
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnonymousIndividual> getAnonymousIndividual() {
		if (anonymousIndividual == null) {
			anonymousIndividual = new EObjectContainmentEList<AnonymousIndividual>(AnonymousIndividual.class, this, OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL);
		}
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL:
				return ((InternalEList<?>)getNamedIndividual()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL:
				return ((InternalEList<?>)getAnonymousIndividual()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL:
				return getNamedIndividual();
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
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
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL:
				getNamedIndividual().clear();
				getNamedIndividual().addAll((Collection<? extends NamedIndividual>)newValue);
				return;
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
				getAnonymousIndividual().addAll((Collection<? extends AnonymousIndividual>)newValue);
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
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL:
				getNamedIndividual().clear();
				return;
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
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
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__NAMED_INDIVIDUAL:
				return namedIndividual != null && !namedIndividual.isEmpty();
			case OWLModelPackage.DIFFERENT_INDIVIDUALS__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null && !anonymousIndividual.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DifferentIndividualsImpl

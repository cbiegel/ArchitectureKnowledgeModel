/**
 */
package org.emftrace.metamodel.FeatureModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.FeatureModel.Calculate;
import org.emftrace.metamodel.FeatureModel.Desc;
import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;
import org.emftrace.metamodel.FeatureModel.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.CalculateImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.CalculateImpl#getDescs <em>Descs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculateImpl extends ValueImpl implements Calculate {
	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> script;

	/**
	 * The cached value of the '{@link #getDescs() <em>Descs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescs()
	 * @generated
	 * @ordered
	 */
	protected EList<Desc> descs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.CALCULATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<Script>(Script.class, this, FeatureModelPackage.CALCULATE__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Desc> getDescs() {
		if (descs == null) {
			descs = new EObjectContainmentEList<Desc>(Desc.class, this, FeatureModelPackage.CALCULATE__DESCS);
		}
		return descs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.CALCULATE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.CALCULATE__DESCS:
				return ((InternalEList<?>)getDescs()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.CALCULATE__SCRIPT:
				return getScript();
			case FeatureModelPackage.CALCULATE__DESCS:
				return getDescs();
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
			case FeatureModelPackage.CALCULATE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends Script>)newValue);
				return;
			case FeatureModelPackage.CALCULATE__DESCS:
				getDescs().clear();
				getDescs().addAll((Collection<? extends Desc>)newValue);
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
			case FeatureModelPackage.CALCULATE__SCRIPT:
				getScript().clear();
				return;
			case FeatureModelPackage.CALCULATE__DESCS:
				getDescs().clear();
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
			case FeatureModelPackage.CALCULATE__SCRIPT:
				return script != null && !script.isEmpty();
			case FeatureModelPackage.CALCULATE__DESCS:
				return descs != null && !descs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CalculateImpl

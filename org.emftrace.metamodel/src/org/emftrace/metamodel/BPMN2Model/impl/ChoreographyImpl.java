/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Choreography;
import org.emftrace.metamodel.BPMN2Model.FlowElement;
import org.emftrace.metamodel.BPMN2Model.FlowElementsContainer;
import org.emftrace.metamodel.BPMN2Model.LaneSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyImpl#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographyImpl extends CollaborationImpl implements Choreography {
	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneSets()
	 * @generated
	 * @ordered
	 */
	protected EList<LaneSet> laneSets;

	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getChoreography();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaneSet> getLaneSets() {
		if (laneSets == null) {
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class, this, BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS);
		}
		return laneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS:
				return ((InternalEList<?>)getLaneSets()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS:
				return getLaneSets();
			case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
				return getFlowElements();
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
			case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
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
			case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS:
				getLaneSets().clear();
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
				getFlowElements().clear();
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
			case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS:
				return laneSets != null && !laneSets.isEmpty();
			case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
				case BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS: return BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				case BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS: return BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
				case BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS: return BPMN2ModelPackage.CHOREOGRAPHY__LANE_SETS;
				case BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS: return BPMN2ModelPackage.CHOREOGRAPHY__FLOW_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChoreographyImpl

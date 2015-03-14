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

import org.emftrace.metamodel.BPMN2Model.Artifact;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.FlowElement;
import org.emftrace.metamodel.BPMN2Model.FlowElementsContainer;
import org.emftrace.metamodel.BPMN2Model.LaneSet;
import org.emftrace.metamodel.BPMN2Model.SubChoreography;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.SubChoreographyImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.SubChoreographyImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.SubChoreographyImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubChoreographyImpl extends ChoreographyActivityImpl implements SubChoreography {
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
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getSubChoreography();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaneSet> getLaneSets() {
		if (laneSets == null) {
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class, this, BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS);
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
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS:
				return ((InternalEList<?>)getLaneSets()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS:
				return getLaneSets();
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
				return getFlowElements();
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS:
				return getArtifacts();
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
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
				return;
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS:
				getLaneSets().clear();
				return;
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS:
				getArtifacts().clear();
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
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS:
				return laneSets != null && !laneSets.isEmpty();
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
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
				case BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS: return BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				case BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS: return BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
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
				case BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS: return BPMN2ModelPackage.SUB_CHOREOGRAPHY__LANE_SETS;
				case BPMN2ModelPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS: return BPMN2ModelPackage.SUB_CHOREOGRAPHY__FLOW_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubChoreographyImpl

/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.FlowNode;
import org.emftrace.metamodel.BPMN2Model.Lane;
import org.emftrace.metamodel.BPMN2Model.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.FlowNodeImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> incoming;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanes;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getFlowNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this, BPMN2ModelPackage.FLOW_NODE__INCOMING, BPMN2ModelPackage.SEQUENCE_FLOW__TARGET_REF);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanes() {
		if (lanes == null) {
			lanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>(Lane.class, this, BPMN2ModelPackage.FLOW_NODE__LANES, BPMN2ModelPackage.LANE__FLOW_NODE_REFS);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this, BPMN2ModelPackage.FLOW_NODE__OUTGOING, BPMN2ModelPackage.SEQUENCE_FLOW__SOURCE_REF);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanes()).basicAdd(otherEnd, msgs);
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				return ((InternalEList<?>)getLanes()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				return getIncoming();
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				return getLanes();
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				return getOutgoing();
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
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SequenceFlow>)newValue);
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
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				getIncoming().clear();
				return;
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				getLanes().clear();
				return;
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				getOutgoing().clear();
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
			case BPMN2ModelPackage.FLOW_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case BPMN2ModelPackage.FLOW_NODE__LANES:
				return lanes != null && !lanes.isEmpty();
			case BPMN2ModelPackage.FLOW_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowNodeImpl

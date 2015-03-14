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
import org.emftrace.metamodel.BPMN2Model.ConversationNode;
import org.emftrace.metamodel.BPMN2Model.SubConversation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.SubConversationImpl#getConversationNodes <em>Conversation Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubConversationImpl extends ConversationNodeImpl implements SubConversation {
	/**
	 * The cached value of the '{@link #getConversationNodes() <em>Conversation Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversationNode> conversationNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubConversationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getSubConversation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationNode> getConversationNodes() {
		if (conversationNodes == null) {
			conversationNodes = new EObjectContainmentEList<ConversationNode>(ConversationNode.class, this, BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES);
		}
		return conversationNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES:
				return ((InternalEList<?>)getConversationNodes()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES:
				return getConversationNodes();
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
			case BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES:
				getConversationNodes().clear();
				getConversationNodes().addAll((Collection<? extends ConversationNode>)newValue);
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
			case BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES:
				getConversationNodes().clear();
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
			case BPMN2ModelPackage.SUB_CONVERSATION__CONVERSATION_NODES:
				return conversationNodes != null && !conversationNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubConversationImpl

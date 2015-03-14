/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.Deployment;
import org.emftrace.metamodel.UMLModel.DeploymentTarget;
import org.emftrace.metamodel.UMLModel.Node;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.NodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.NodeImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.NodeImpl#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ClassImpl implements Node {
	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * The default value of the '{@link #getDeployedElement() <em>Deployed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedElement() <em>Deployed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedElement()
	 * @generated
	 * @ordered
	 */
	protected String deployedElement = DEPLOYED_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedNode() <em>Nested Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nestedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentEList<Deployment>(Deployment.class, this, UMLModelPackage.NODE__DEPLOYMENT);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedElement() {
		return deployedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedElement(String newDeployedElement) {
		String oldDeployedElement = deployedElement;
		deployedElement = newDeployedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.NODE__DEPLOYED_ELEMENT, oldDeployedElement, deployedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNestedNode() {
		if (nestedNode == null) {
			nestedNode = new EObjectContainmentEList<Node>(Node.class, this, UMLModelPackage.NODE__NESTED_NODE);
		}
		return nestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.NODE__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.NODE__NESTED_NODE:
				return ((InternalEList<?>)getNestedNode()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.NODE__DEPLOYMENT:
				return getDeployment();
			case UMLModelPackage.NODE__DEPLOYED_ELEMENT:
				return getDeployedElement();
			case UMLModelPackage.NODE__NESTED_NODE:
				return getNestedNode();
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
			case UMLModelPackage.NODE__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UMLModelPackage.NODE__DEPLOYED_ELEMENT:
				setDeployedElement((String)newValue);
				return;
			case UMLModelPackage.NODE__NESTED_NODE:
				getNestedNode().clear();
				getNestedNode().addAll((Collection<? extends Node>)newValue);
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
			case UMLModelPackage.NODE__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UMLModelPackage.NODE__DEPLOYED_ELEMENT:
				setDeployedElement(DEPLOYED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.NODE__NESTED_NODE:
				getNestedNode().clear();
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
			case UMLModelPackage.NODE__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UMLModelPackage.NODE__DEPLOYED_ELEMENT:
				return DEPLOYED_ELEMENT_EDEFAULT == null ? deployedElement != null : !DEPLOYED_ELEMENT_EDEFAULT.equals(deployedElement);
			case UMLModelPackage.NODE__NESTED_NODE:
				return nestedNode != null && !nestedNode.isEmpty();
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
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.NODE__DEPLOYMENT: return UMLModelPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UMLModelPackage.NODE__DEPLOYED_ELEMENT: return UMLModelPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return UMLModelPackage.NODE__DEPLOYMENT;
				case UMLModelPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UMLModelPackage.NODE__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (deployedElement: ");
		result.append(deployedElement);
		result.append(')');
		return result.toString();
	}

} //NodeImpl

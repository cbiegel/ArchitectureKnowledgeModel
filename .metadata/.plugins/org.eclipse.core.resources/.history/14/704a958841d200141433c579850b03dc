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
import org.emftrace.metamodel.UMLModel.DeploymentSpecification;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.DeploymentImpl#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.DeploymentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends DependencyImpl implements Deployment {
	/**
	 * The default value of the '{@link #getDeployedArtifact() <em>Deployed Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_ARTIFACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedArtifact() <em>Deployed Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifact()
	 * @generated
	 * @ordered
	 */
	protected String deployedArtifact = DEPLOYED_ARTIFACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentSpecification> configuration;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getDeployment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedArtifact() {
		return deployedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedArtifact(String newDeployedArtifact) {
		String oldDeployedArtifact = deployedArtifact;
		deployedArtifact = newDeployedArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.DEPLOYMENT__DEPLOYED_ARTIFACT, oldDeployedArtifact, deployedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentSpecification> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<DeploymentSpecification>(DeploymentSpecification.class, this, UMLModelPackage.DEPLOYMENT__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.DEPLOYMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.DEPLOYMENT__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return getDeployedArtifact();
			case UMLModelPackage.DEPLOYMENT__CONFIGURATION:
				return getConfiguration();
			case UMLModelPackage.DEPLOYMENT__LOCATION:
				return getLocation();
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
			case UMLModelPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				setDeployedArtifact((String)newValue);
				return;
			case UMLModelPackage.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends DeploymentSpecification>)newValue);
				return;
			case UMLModelPackage.DEPLOYMENT__LOCATION:
				setLocation((String)newValue);
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
			case UMLModelPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				setDeployedArtifact(DEPLOYED_ARTIFACT_EDEFAULT);
				return;
			case UMLModelPackage.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
				return;
			case UMLModelPackage.DEPLOYMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case UMLModelPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return DEPLOYED_ARTIFACT_EDEFAULT == null ? deployedArtifact != null : !DEPLOYED_ARTIFACT_EDEFAULT.equals(deployedArtifact);
			case UMLModelPackage.DEPLOYMENT__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case UMLModelPackage.DEPLOYMENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (deployedArtifact: ");
		result.append(deployedArtifact);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl

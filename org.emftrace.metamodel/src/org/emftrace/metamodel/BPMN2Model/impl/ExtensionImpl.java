/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Extension;
import org.emftrace.metamodel.BPMN2Model.ExtensionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionImpl#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionImpl#getXsdDefinition <em>Xsd Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends BPMNBaseImpl implements Extension {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ExtensionDefinition definition;

	/**
	 * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getXsdDefinition() <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final QName XSD_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdDefinition() <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdDefinition()
	 * @generated
	 * @ordered
	 */
	protected QName xsdDefinition = XSD_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(ExtensionDefinition newDefinition, NotificationChain msgs) {
		ExtensionDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.EXTENSION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ExtensionDefinition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.EXTENSION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.EXTENSION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.EXTENSION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustUnderstand(boolean newMustUnderstand) {
		boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getXsdDefinition() {
		return xsdDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdDefinition(QName newXsdDefinition) {
		QName oldXsdDefinition = xsdDefinition;
		xsdDefinition = newXsdDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.EXTENSION__XSD_DEFINITION, oldXsdDefinition, xsdDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.EXTENSION__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case BPMN2ModelPackage.EXTENSION__DEFINITION:
				return getDefinition();
			case BPMN2ModelPackage.EXTENSION__MUST_UNDERSTAND:
				return isMustUnderstand();
			case BPMN2ModelPackage.EXTENSION__XSD_DEFINITION:
				return getXsdDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN2ModelPackage.EXTENSION__DEFINITION:
				setDefinition((ExtensionDefinition)newValue);
				return;
			case BPMN2ModelPackage.EXTENSION__MUST_UNDERSTAND:
				setMustUnderstand((Boolean)newValue);
				return;
			case BPMN2ModelPackage.EXTENSION__XSD_DEFINITION:
				setXsdDefinition((QName)newValue);
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
			case BPMN2ModelPackage.EXTENSION__DEFINITION:
				setDefinition((ExtensionDefinition)null);
				return;
			case BPMN2ModelPackage.EXTENSION__MUST_UNDERSTAND:
				setMustUnderstand(MUST_UNDERSTAND_EDEFAULT);
				return;
			case BPMN2ModelPackage.EXTENSION__XSD_DEFINITION:
				setXsdDefinition(XSD_DEFINITION_EDEFAULT);
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
			case BPMN2ModelPackage.EXTENSION__DEFINITION:
				return definition != null;
			case BPMN2ModelPackage.EXTENSION__MUST_UNDERSTAND:
				return mustUnderstand != MUST_UNDERSTAND_EDEFAULT;
			case BPMN2ModelPackage.EXTENSION__XSD_DEFINITION:
				return XSD_DEFINITION_EDEFAULT == null ? xsdDefinition != null : !XSD_DEFINITION_EDEFAULT.equals(xsdDefinition);
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
		result.append(" (mustUnderstand: ");
		result.append(mustUnderstand);
		result.append(", xsdDefinition: ");
		result.append(xsdDefinition);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl

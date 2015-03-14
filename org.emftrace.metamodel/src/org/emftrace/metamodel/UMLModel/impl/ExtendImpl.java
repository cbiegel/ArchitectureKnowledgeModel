/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.Constraint;
import org.emftrace.metamodel.UMLModel.DirectedRelationship;
import org.emftrace.metamodel.UMLModel.Extend;
import org.emftrace.metamodel.UMLModel.Relationship;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends NamedElementImpl implements Extend {
	/**
	 * The default value of the '{@link #getRelatedElement() <em>Related Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected String relatedElement = RELATED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedCase() <em>Extended Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected String extendedCase = EXTENDED_CASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint condition;

	/**
	 * The default value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation()
	 * @generated
	 * @ordered
	 */
	protected String extensionLocation = EXTENSION_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getExtend();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelatedElement() {
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(String newRelatedElement) {
		String oldRelatedElement = relatedElement;
		relatedElement = newRelatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__RELATED_ELEMENT, oldRelatedElement, relatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedCase() {
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase(String newExtendedCase) {
		String oldExtendedCase = extendedCase;
		extendedCase = newExtendedCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Constraint newCondition, NotificationChain msgs) {
		Constraint oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Constraint newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.EXTEND__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.EXTEND__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionLocation() {
		return extensionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionLocation(String newExtensionLocation) {
		String oldExtensionLocation = extensionLocation;
		extensionLocation = newExtensionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__EXTENSION_LOCATION, oldExtensionLocation, extensionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTEND__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.EXTEND__CONDITION:
				return basicSetCondition(null, msgs);
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
			case UMLModelPackage.EXTEND__RELATED_ELEMENT:
				return getRelatedElement();
			case UMLModelPackage.EXTEND__SOURCE:
				return getSource();
			case UMLModelPackage.EXTEND__TARGET:
				return getTarget();
			case UMLModelPackage.EXTEND__EXTENDED_CASE:
				return getExtendedCase();
			case UMLModelPackage.EXTEND__CONDITION:
				return getCondition();
			case UMLModelPackage.EXTEND__EXTENSION_LOCATION:
				return getExtensionLocation();
			case UMLModelPackage.EXTEND__EXTENSION:
				return getExtension();
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
			case UMLModelPackage.EXTEND__RELATED_ELEMENT:
				setRelatedElement((String)newValue);
				return;
			case UMLModelPackage.EXTEND__SOURCE:
				setSource((String)newValue);
				return;
			case UMLModelPackage.EXTEND__TARGET:
				setTarget((String)newValue);
				return;
			case UMLModelPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase((String)newValue);
				return;
			case UMLModelPackage.EXTEND__CONDITION:
				setCondition((Constraint)newValue);
				return;
			case UMLModelPackage.EXTEND__EXTENSION_LOCATION:
				setExtensionLocation((String)newValue);
				return;
			case UMLModelPackage.EXTEND__EXTENSION:
				setExtension((String)newValue);
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
			case UMLModelPackage.EXTEND__RELATED_ELEMENT:
				setRelatedElement(RELATED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.EXTEND__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case UMLModelPackage.EXTEND__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case UMLModelPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase(EXTENDED_CASE_EDEFAULT);
				return;
			case UMLModelPackage.EXTEND__CONDITION:
				setCondition((Constraint)null);
				return;
			case UMLModelPackage.EXTEND__EXTENSION_LOCATION:
				setExtensionLocation(EXTENSION_LOCATION_EDEFAULT);
				return;
			case UMLModelPackage.EXTEND__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
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
			case UMLModelPackage.EXTEND__RELATED_ELEMENT:
				return RELATED_ELEMENT_EDEFAULT == null ? relatedElement != null : !RELATED_ELEMENT_EDEFAULT.equals(relatedElement);
			case UMLModelPackage.EXTEND__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case UMLModelPackage.EXTEND__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case UMLModelPackage.EXTEND__EXTENDED_CASE:
				return EXTENDED_CASE_EDEFAULT == null ? extendedCase != null : !EXTENDED_CASE_EDEFAULT.equals(extendedCase);
			case UMLModelPackage.EXTEND__CONDITION:
				return condition != null;
			case UMLModelPackage.EXTEND__EXTENSION_LOCATION:
				return EXTENSION_LOCATION_EDEFAULT == null ? extensionLocation != null : !EXTENSION_LOCATION_EDEFAULT.equals(extensionLocation);
			case UMLModelPackage.EXTEND__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.EXTEND__RELATED_ELEMENT: return UMLModelPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.EXTEND__SOURCE: return UMLModelPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLModelPackage.EXTEND__TARGET: return UMLModelPackage.DIRECTED_RELATIONSHIP__TARGET;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.RELATIONSHIP__RELATED_ELEMENT: return UMLModelPackage.EXTEND__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.DIRECTED_RELATIONSHIP__SOURCE: return UMLModelPackage.EXTEND__SOURCE;
				case UMLModelPackage.DIRECTED_RELATIONSHIP__TARGET: return UMLModelPackage.EXTEND__TARGET;
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
		result.append(" (relatedElement: ");
		result.append(relatedElement);
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", extendedCase: ");
		result.append(extendedCase);
		result.append(", extensionLocation: ");
		result.append(extensionLocation);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //ExtendImpl

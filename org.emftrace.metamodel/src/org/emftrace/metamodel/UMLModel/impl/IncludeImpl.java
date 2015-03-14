/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.DirectedRelationship;
import org.emftrace.metamodel.UMLModel.Include;
import org.emftrace.metamodel.UMLModel.Relationship;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.IncludeImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.IncludeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.IncludeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends NamedElementImpl implements Include {
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
	 * The default value of the '{@link #getAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected String addition = ADDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludingCase() <em>Including Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludingCase()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDING_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludingCase() <em>Including Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludingCase()
	 * @generated
	 * @ordered
	 */
	protected String includingCase = INCLUDING_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInclude();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INCLUDE__RELATED_ELEMENT, oldRelatedElement, relatedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INCLUDE__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INCLUDE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(String newAddition) {
		String oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INCLUDE__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludingCase() {
		return includingCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(String newIncludingCase) {
		String oldIncludingCase = includingCase;
		includingCase = newIncludingCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INCLUDE__INCLUDING_CASE, oldIncludingCase, includingCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.INCLUDE__RELATED_ELEMENT:
				return getRelatedElement();
			case UMLModelPackage.INCLUDE__SOURCE:
				return getSource();
			case UMLModelPackage.INCLUDE__TARGET:
				return getTarget();
			case UMLModelPackage.INCLUDE__ADDITION:
				return getAddition();
			case UMLModelPackage.INCLUDE__INCLUDING_CASE:
				return getIncludingCase();
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
			case UMLModelPackage.INCLUDE__RELATED_ELEMENT:
				setRelatedElement((String)newValue);
				return;
			case UMLModelPackage.INCLUDE__SOURCE:
				setSource((String)newValue);
				return;
			case UMLModelPackage.INCLUDE__TARGET:
				setTarget((String)newValue);
				return;
			case UMLModelPackage.INCLUDE__ADDITION:
				setAddition((String)newValue);
				return;
			case UMLModelPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((String)newValue);
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
			case UMLModelPackage.INCLUDE__RELATED_ELEMENT:
				setRelatedElement(RELATED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.INCLUDE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case UMLModelPackage.INCLUDE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case UMLModelPackage.INCLUDE__ADDITION:
				setAddition(ADDITION_EDEFAULT);
				return;
			case UMLModelPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase(INCLUDING_CASE_EDEFAULT);
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
			case UMLModelPackage.INCLUDE__RELATED_ELEMENT:
				return RELATED_ELEMENT_EDEFAULT == null ? relatedElement != null : !RELATED_ELEMENT_EDEFAULT.equals(relatedElement);
			case UMLModelPackage.INCLUDE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case UMLModelPackage.INCLUDE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case UMLModelPackage.INCLUDE__ADDITION:
				return ADDITION_EDEFAULT == null ? addition != null : !ADDITION_EDEFAULT.equals(addition);
			case UMLModelPackage.INCLUDE__INCLUDING_CASE:
				return INCLUDING_CASE_EDEFAULT == null ? includingCase != null : !INCLUDING_CASE_EDEFAULT.equals(includingCase);
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
				case UMLModelPackage.INCLUDE__RELATED_ELEMENT: return UMLModelPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.INCLUDE__SOURCE: return UMLModelPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLModelPackage.INCLUDE__TARGET: return UMLModelPackage.DIRECTED_RELATIONSHIP__TARGET;
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
				case UMLModelPackage.RELATIONSHIP__RELATED_ELEMENT: return UMLModelPackage.INCLUDE__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.DIRECTED_RELATIONSHIP__SOURCE: return UMLModelPackage.INCLUDE__SOURCE;
				case UMLModelPackage.DIRECTED_RELATIONSHIP__TARGET: return UMLModelPackage.INCLUDE__TARGET;
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
		result.append(", addition: ");
		result.append(addition);
		result.append(", includingCase: ");
		result.append(includingCase);
		result.append(')');
		return result.toString();
	}

} //IncludeImpl

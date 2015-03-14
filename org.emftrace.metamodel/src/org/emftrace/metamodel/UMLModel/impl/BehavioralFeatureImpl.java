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

import org.emftrace.metamodel.UMLModel.BehavioralFeature;
import org.emftrace.metamodel.UMLModel.CallConcurrencyKind;
import org.emftrace.metamodel.UMLModel.Feature;
import org.emftrace.metamodel.UMLModel.Parameter;
import org.emftrace.metamodel.UMLModel.ParameterSet;
import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected String redefinedElement = REDEFINED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINITION_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected String redefinitionContext = REDEFINITION_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeaturingClassifier() <em>Featuring Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURING_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeaturingClassifier() <em>Featuring Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifier()
	 * @generated
	 * @ordered
	 */
	protected String featuringClassifier = FEATURING_CLASSIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaisedException() <em>Raised Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected static final String RAISED_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected String raisedException = RAISED_EXCEPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameterSet() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> ownedParameterSet;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getBehavioralFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedElement() {
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedElement(String newRedefinedElement) {
		String oldRedefinedElement = redefinedElement;
		redefinedElement = newRedefinedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT, oldRedefinedElement, redefinedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinitionContext() {
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinitionContext(String newRedefinitionContext) {
		String oldRedefinitionContext = redefinitionContext;
		redefinitionContext = newRedefinitionContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeaturingClassifier() {
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturingClassifier(String newFeaturingClassifier) {
		String oldFeaturingClassifier = featuringClassifier;
		featuringClassifier = newFeaturingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, oldFeaturingClassifier, featuringClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaisedException() {
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedException(String newRaisedException) {
		String oldRaisedException = raisedException;
		raisedException = newRaisedException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION, oldRaisedException, raisedException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getOwnedParameterSet() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.BEHAVIORAL_FEATURE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return isIsLeaf();
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return isIsStatic();
			case UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isIsAbstract();
			case UMLModelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
			case UMLModelPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedException();
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case UMLModelPackage.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
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
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				setRedefinedElement((String)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				setRedefinitionContext((String)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				setFeaturingClassifier((String)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				setRaisedException((String)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__METHOD:
				setMethod((String)newValue);
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
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				setRedefinedElement(REDEFINED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				setRedefinitionContext(REDEFINITION_CONTEXT_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				setFeaturingClassifier(FEATURING_CLASSIFIER_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				setRaisedException(RAISED_EXCEPTION_EDEFAULT);
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case UMLModelPackage.BEHAVIORAL_FEATURE__METHOD:
				setMethod(METHOD_EDEFAULT);
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
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				return REDEFINED_ELEMENT_EDEFAULT == null ? redefinedElement != null : !REDEFINED_ELEMENT_EDEFAULT.equals(redefinedElement);
			case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return REDEFINITION_CONTEXT_EDEFAULT == null ? redefinitionContext != null : !REDEFINITION_CONTEXT_EDEFAULT.equals(redefinitionContext);
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return FEATURING_CLASSIFIER_EDEFAULT == null ? featuringClassifier != null : !FEATURING_CLASSIFIER_EDEFAULT.equals(featuringClassifier);
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLModelPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UMLModelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case UMLModelPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return RAISED_EXCEPTION_EDEFAULT == null ? raisedException != null : !RAISED_EXCEPTION_EDEFAULT.equals(raisedException);
			case UMLModelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case UMLModelPackage.BEHAVIORAL_FEATURE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF: return UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC: return UMLModelPackage.FEATURE__IS_STATIC;
				case UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return UMLModelPackage.FEATURE__FEATURING_CLASSIFIER;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UMLModelPackage.BEHAVIORAL_FEATURE__IS_LEAF;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UMLModelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.FEATURE__IS_STATIC: return UMLModelPackage.BEHAVIORAL_FEATURE__IS_STATIC;
				case UMLModelPackage.FEATURE__FEATURING_CLASSIFIER: return UMLModelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", redefinedElement: ");
		result.append(redefinedElement);
		result.append(", redefinitionContext: ");
		result.append(redefinitionContext);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", featuringClassifier: ");
		result.append(featuringClassifier);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(", raisedException: ");
		result.append(raisedException);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl

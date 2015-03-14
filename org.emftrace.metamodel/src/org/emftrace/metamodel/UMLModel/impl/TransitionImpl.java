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

import org.emftrace.metamodel.UMLModel.Behavior;
import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.Transition;
import org.emftrace.metamodel.UMLModel.TransitionKind;
import org.emftrace.metamodel.UMLModel.Trigger;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TransitionImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamespaceImpl implements Transition {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.EXTERNAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedTransition() <em>Redefined Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_TRANSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedTransition() <em>Redefined Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition()
	 * @generated
	 * @ordered
	 */
	protected String redefinedTransition = REDEFINED_TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Behavior effect;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getTransition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__IS_LEAF, oldIsLeaf, isLeaf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__REDEFINED_ELEMENT, oldRedefinedElement, redefinedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransitionKind newKind) {
		TransitionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedTransition() {
		return redefinedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedTransition(String newRedefinedTransition) {
		String oldRedefinedTransition = redefinedTransition;
		redefinedTransition = newRedefinedTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Behavior newEffect, NotificationChain msgs) {
		Behavior oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Behavior newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TRANSITION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TRANSITION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UMLModelPackage.TRANSITION__TRIGGER);
		}
		return trigger;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.TRANSITION__EFFECT:
				return basicSetEffect(null, msgs);
			case UMLModelPackage.TRANSITION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.TRANSITION__IS_LEAF:
				return isIsLeaf();
			case UMLModelPackage.TRANSITION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UMLModelPackage.TRANSITION__KIND:
				return getKind();
			case UMLModelPackage.TRANSITION__CONTAINER:
				return getContainer();
			case UMLModelPackage.TRANSITION__REDEFINED_TRANSITION:
				return getRedefinedTransition();
			case UMLModelPackage.TRANSITION__GUARD:
				return getGuard();
			case UMLModelPackage.TRANSITION__EFFECT:
				return getEffect();
			case UMLModelPackage.TRANSITION__TRIGGER:
				return getTrigger();
			case UMLModelPackage.TRANSITION__TARGET:
				return getTarget();
			case UMLModelPackage.TRANSITION__SOURCE:
				return getSource();
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
			case UMLModelPackage.TRANSITION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UMLModelPackage.TRANSITION__REDEFINED_ELEMENT:
				setRedefinedElement((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT:
				setRedefinitionContext((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__KIND:
				setKind((TransitionKind)newValue);
				return;
			case UMLModelPackage.TRANSITION__CONTAINER:
				setContainer((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__GUARD:
				setGuard((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__EFFECT:
				setEffect((Behavior)newValue);
				return;
			case UMLModelPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UMLModelPackage.TRANSITION__TARGET:
				setTarget((String)newValue);
				return;
			case UMLModelPackage.TRANSITION__SOURCE:
				setSource((String)newValue);
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
			case UMLModelPackage.TRANSITION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__REDEFINED_ELEMENT:
				setRedefinedElement(REDEFINED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT:
				setRedefinitionContext(REDEFINITION_CONTEXT_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition(REDEFINED_TRANSITION_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__EFFECT:
				setEffect((Behavior)null);
				return;
			case UMLModelPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				return;
			case UMLModelPackage.TRANSITION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case UMLModelPackage.TRANSITION__SOURCE:
				setSource(SOURCE_EDEFAULT);
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
			case UMLModelPackage.TRANSITION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UMLModelPackage.TRANSITION__REDEFINED_ELEMENT:
				return REDEFINED_ELEMENT_EDEFAULT == null ? redefinedElement != null : !REDEFINED_ELEMENT_EDEFAULT.equals(redefinedElement);
			case UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT:
				return REDEFINITION_CONTEXT_EDEFAULT == null ? redefinitionContext != null : !REDEFINITION_CONTEXT_EDEFAULT.equals(redefinitionContext);
			case UMLModelPackage.TRANSITION__KIND:
				return kind != KIND_EDEFAULT;
			case UMLModelPackage.TRANSITION__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case UMLModelPackage.TRANSITION__REDEFINED_TRANSITION:
				return REDEFINED_TRANSITION_EDEFAULT == null ? redefinedTransition != null : !REDEFINED_TRANSITION_EDEFAULT.equals(redefinedTransition);
			case UMLModelPackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case UMLModelPackage.TRANSITION__EFFECT:
				return effect != null;
			case UMLModelPackage.TRANSITION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case UMLModelPackage.TRANSITION__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case UMLModelPackage.TRANSITION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
				case UMLModelPackage.TRANSITION__IS_LEAF: return UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLModelPackage.TRANSITION__REDEFINED_ELEMENT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
				case UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UMLModelPackage.TRANSITION__IS_LEAF;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UMLModelPackage.TRANSITION__REDEFINED_ELEMENT;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UMLModelPackage.TRANSITION__REDEFINITION_CONTEXT;
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
		result.append(", kind: ");
		result.append(kind);
		result.append(", container: ");
		result.append(container);
		result.append(", redefinedTransition: ");
		result.append(redefinedTransition);
		result.append(", guard: ");
		result.append(guard);
		result.append(", target: ");
		result.append(target);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl

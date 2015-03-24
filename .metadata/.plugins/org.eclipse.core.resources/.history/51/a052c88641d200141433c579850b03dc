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

import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.Region;
import org.emftrace.metamodel.UMLModel.Transition;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
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
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected String extendedRegion = EXTENDED_REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateMachine() <em>State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_MACHINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected String stateMachine = STATE_MACHINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getRegion();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__IS_LEAF, oldIsLeaf, isLeaf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__REDEFINED_ELEMENT, oldRedefinedElement, redefinedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentEList<Vertex>(Vertex.class, this, UMLModelPackage.REGION__SUBVERTEX);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, UMLModelPackage.REGION__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(String newExtendedRegion) {
		String oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateMachine() {
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(String newStateMachine) {
		String oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REGION__STATE_MACHINE, oldStateMachine, stateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.REGION__IS_LEAF:
				return isIsLeaf();
			case UMLModelPackage.REGION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UMLModelPackage.REGION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UMLModelPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case UMLModelPackage.REGION__TRANSITION:
				return getTransition();
			case UMLModelPackage.REGION__STATE:
				return getState();
			case UMLModelPackage.REGION__EXTENDED_REGION:
				return getExtendedRegion();
			case UMLModelPackage.REGION__STATE_MACHINE:
				return getStateMachine();
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
			case UMLModelPackage.REGION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UMLModelPackage.REGION__REDEFINED_ELEMENT:
				setRedefinedElement((String)newValue);
				return;
			case UMLModelPackage.REGION__REDEFINITION_CONTEXT:
				setRedefinitionContext((String)newValue);
				return;
			case UMLModelPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case UMLModelPackage.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case UMLModelPackage.REGION__STATE:
				setState((String)newValue);
				return;
			case UMLModelPackage.REGION__EXTENDED_REGION:
				setExtendedRegion((String)newValue);
				return;
			case UMLModelPackage.REGION__STATE_MACHINE:
				setStateMachine((String)newValue);
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
			case UMLModelPackage.REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLModelPackage.REGION__REDEFINED_ELEMENT:
				setRedefinedElement(REDEFINED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.REGION__REDEFINITION_CONTEXT:
				setRedefinitionContext(REDEFINITION_CONTEXT_EDEFAULT);
				return;
			case UMLModelPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case UMLModelPackage.REGION__TRANSITION:
				getTransition().clear();
				return;
			case UMLModelPackage.REGION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UMLModelPackage.REGION__EXTENDED_REGION:
				setExtendedRegion(EXTENDED_REGION_EDEFAULT);
				return;
			case UMLModelPackage.REGION__STATE_MACHINE:
				setStateMachine(STATE_MACHINE_EDEFAULT);
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
			case UMLModelPackage.REGION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UMLModelPackage.REGION__REDEFINED_ELEMENT:
				return REDEFINED_ELEMENT_EDEFAULT == null ? redefinedElement != null : !REDEFINED_ELEMENT_EDEFAULT.equals(redefinedElement);
			case UMLModelPackage.REGION__REDEFINITION_CONTEXT:
				return REDEFINITION_CONTEXT_EDEFAULT == null ? redefinitionContext != null : !REDEFINITION_CONTEXT_EDEFAULT.equals(redefinitionContext);
			case UMLModelPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case UMLModelPackage.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case UMLModelPackage.REGION__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case UMLModelPackage.REGION__EXTENDED_REGION:
				return EXTENDED_REGION_EDEFAULT == null ? extendedRegion != null : !EXTENDED_REGION_EDEFAULT.equals(extendedRegion);
			case UMLModelPackage.REGION__STATE_MACHINE:
				return STATE_MACHINE_EDEFAULT == null ? stateMachine != null : !STATE_MACHINE_EDEFAULT.equals(stateMachine);
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
				case UMLModelPackage.REGION__IS_LEAF: return UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLModelPackage.REGION__REDEFINED_ELEMENT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLModelPackage.REGION__REDEFINITION_CONTEXT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
				case UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UMLModelPackage.REGION__IS_LEAF;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UMLModelPackage.REGION__REDEFINED_ELEMENT;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UMLModelPackage.REGION__REDEFINITION_CONTEXT;
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
		result.append(", state: ");
		result.append(state);
		result.append(", extendedRegion: ");
		result.append(extendedRegion);
		result.append(", stateMachine: ");
		result.append(stateMachine);
		result.append(')');
		return result.toString();
	}

} //RegionImpl

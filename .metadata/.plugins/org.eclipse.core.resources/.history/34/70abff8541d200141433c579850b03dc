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
import org.emftrace.metamodel.UMLModel.ConnectionPointReference;
import org.emftrace.metamodel.UMLModel.Constraint;
import org.emftrace.metamodel.UMLModel.Pseudostate;
import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.Region;
import org.emftrace.metamodel.UMLModel.State;
import org.emftrace.metamodel.UMLModel.Trigger;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateImpl#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
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
	 * The default value of the '{@link #getIncoming() <em>Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected static final String INCOMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected String incoming = INCOMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTGOING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected String outgoing = OUTGOING_EDEFAULT;

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
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrthogonal = IS_ORTHOGONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubmachineState = IS_SUBMACHINE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmachine() <em>Submachine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMACHINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected String submachine = SUBMACHINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connection;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The default value of the '{@link #getRedefinedState() <em>Redefined State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected String redefinedState = REDEFINED_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTrigger;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getState();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__IS_LEAF, oldIsLeaf, isLeaf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__REDEFINED_ELEMENT, oldRedefinedElement, redefinedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(String newIncoming) {
		String oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__INCOMING, oldIncoming, incoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(String newOutgoing) {
		String oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__OUTGOING, oldOutgoing, outgoing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrthogonal() {
		return isOrthogonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubmachineState() {
		return isSubmachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmachine() {
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachine(String newSubmachine) {
		String oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPointReference> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<ConnectionPointReference>(ConnectionPointReference.class, this, UMLModelPackage.STATE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList<Pseudostate>(Pseudostate.class, this, UMLModelPackage.STATE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedState() {
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(String newRedefinedState) {
		String oldRedefinedState = redefinedState;
		redefinedState = newRedefinedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(Constraint newStateInvariant) {
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Behavior newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Behavior newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Behavior newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTrigger() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UMLModelPackage.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<Region>(Region.class, this, UMLModelPackage.STATE__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.STATE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.STATE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.STATE__STATE_INVARIANT:
				return basicSetStateInvariant(null, msgs);
			case UMLModelPackage.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case UMLModelPackage.STATE__EXIT:
				return basicSetExit(null, msgs);
			case UMLModelPackage.STATE__DO_ACTIVITY:
				return basicSetDoActivity(null, msgs);
			case UMLModelPackage.STATE__DEFERRABLE_TRIGGER:
				return ((InternalEList<?>)getDeferrableTrigger()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.STATE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.STATE__IS_LEAF:
				return isIsLeaf();
			case UMLModelPackage.STATE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UMLModelPackage.STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UMLModelPackage.STATE__INCOMING:
				return getIncoming();
			case UMLModelPackage.STATE__OUTGOING:
				return getOutgoing();
			case UMLModelPackage.STATE__CONTAINER:
				return getContainer();
			case UMLModelPackage.STATE__IS_COMPOSITE:
				return isIsComposite();
			case UMLModelPackage.STATE__IS_ORTHOGONAL:
				return isIsOrthogonal();
			case UMLModelPackage.STATE__IS_SIMPLE:
				return isIsSimple();
			case UMLModelPackage.STATE__IS_SUBMACHINE_STATE:
				return isIsSubmachineState();
			case UMLModelPackage.STATE__SUBMACHINE:
				return getSubmachine();
			case UMLModelPackage.STATE__CONNECTION:
				return getConnection();
			case UMLModelPackage.STATE__CONNECTION_POINT:
				return getConnectionPoint();
			case UMLModelPackage.STATE__REDEFINED_STATE:
				return getRedefinedState();
			case UMLModelPackage.STATE__STATE_INVARIANT:
				return getStateInvariant();
			case UMLModelPackage.STATE__ENTRY:
				return getEntry();
			case UMLModelPackage.STATE__EXIT:
				return getExit();
			case UMLModelPackage.STATE__DO_ACTIVITY:
				return getDoActivity();
			case UMLModelPackage.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTrigger();
			case UMLModelPackage.STATE__REGION:
				return getRegion();
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
			case UMLModelPackage.STATE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UMLModelPackage.STATE__REDEFINED_ELEMENT:
				setRedefinedElement((String)newValue);
				return;
			case UMLModelPackage.STATE__REDEFINITION_CONTEXT:
				setRedefinitionContext((String)newValue);
				return;
			case UMLModelPackage.STATE__INCOMING:
				setIncoming((String)newValue);
				return;
			case UMLModelPackage.STATE__OUTGOING:
				setOutgoing((String)newValue);
				return;
			case UMLModelPackage.STATE__CONTAINER:
				setContainer((String)newValue);
				return;
			case UMLModelPackage.STATE__SUBMACHINE:
				setSubmachine((String)newValue);
				return;
			case UMLModelPackage.STATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
				return;
			case UMLModelPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UMLModelPackage.STATE__REDEFINED_STATE:
				setRedefinedState((String)newValue);
				return;
			case UMLModelPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
				return;
			case UMLModelPackage.STATE__ENTRY:
				setEntry((Behavior)newValue);
				return;
			case UMLModelPackage.STATE__EXIT:
				setExit((Behavior)newValue);
				return;
			case UMLModelPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)newValue);
				return;
			case UMLModelPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UMLModelPackage.STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
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
			case UMLModelPackage.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLModelPackage.STATE__REDEFINED_ELEMENT:
				setRedefinedElement(REDEFINED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.STATE__REDEFINITION_CONTEXT:
				setRedefinitionContext(REDEFINITION_CONTEXT_EDEFAULT);
				return;
			case UMLModelPackage.STATE__INCOMING:
				setIncoming(INCOMING_EDEFAULT);
				return;
			case UMLModelPackage.STATE__OUTGOING:
				setOutgoing(OUTGOING_EDEFAULT);
				return;
			case UMLModelPackage.STATE__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case UMLModelPackage.STATE__SUBMACHINE:
				setSubmachine(SUBMACHINE_EDEFAULT);
				return;
			case UMLModelPackage.STATE__CONNECTION:
				getConnection().clear();
				return;
			case UMLModelPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case UMLModelPackage.STATE__REDEFINED_STATE:
				setRedefinedState(REDEFINED_STATE_EDEFAULT);
				return;
			case UMLModelPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
				return;
			case UMLModelPackage.STATE__ENTRY:
				setEntry((Behavior)null);
				return;
			case UMLModelPackage.STATE__EXIT:
				setExit((Behavior)null);
				return;
			case UMLModelPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)null);
				return;
			case UMLModelPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				return;
			case UMLModelPackage.STATE__REGION:
				getRegion().clear();
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
			case UMLModelPackage.STATE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UMLModelPackage.STATE__REDEFINED_ELEMENT:
				return REDEFINED_ELEMENT_EDEFAULT == null ? redefinedElement != null : !REDEFINED_ELEMENT_EDEFAULT.equals(redefinedElement);
			case UMLModelPackage.STATE__REDEFINITION_CONTEXT:
				return REDEFINITION_CONTEXT_EDEFAULT == null ? redefinitionContext != null : !REDEFINITION_CONTEXT_EDEFAULT.equals(redefinitionContext);
			case UMLModelPackage.STATE__INCOMING:
				return INCOMING_EDEFAULT == null ? incoming != null : !INCOMING_EDEFAULT.equals(incoming);
			case UMLModelPackage.STATE__OUTGOING:
				return OUTGOING_EDEFAULT == null ? outgoing != null : !OUTGOING_EDEFAULT.equals(outgoing);
			case UMLModelPackage.STATE__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case UMLModelPackage.STATE__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case UMLModelPackage.STATE__IS_ORTHOGONAL:
				return isOrthogonal != IS_ORTHOGONAL_EDEFAULT;
			case UMLModelPackage.STATE__IS_SIMPLE:
				return isSimple != IS_SIMPLE_EDEFAULT;
			case UMLModelPackage.STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState != IS_SUBMACHINE_STATE_EDEFAULT;
			case UMLModelPackage.STATE__SUBMACHINE:
				return SUBMACHINE_EDEFAULT == null ? submachine != null : !SUBMACHINE_EDEFAULT.equals(submachine);
			case UMLModelPackage.STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case UMLModelPackage.STATE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UMLModelPackage.STATE__REDEFINED_STATE:
				return REDEFINED_STATE_EDEFAULT == null ? redefinedState != null : !REDEFINED_STATE_EDEFAULT.equals(redefinedState);
			case UMLModelPackage.STATE__STATE_INVARIANT:
				return stateInvariant != null;
			case UMLModelPackage.STATE__ENTRY:
				return entry != null;
			case UMLModelPackage.STATE__EXIT:
				return exit != null;
			case UMLModelPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
			case UMLModelPackage.STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case UMLModelPackage.STATE__REGION:
				return region != null && !region.isEmpty();
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
				case UMLModelPackage.STATE__IS_LEAF: return UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLModelPackage.STATE__REDEFINED_ELEMENT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLModelPackage.STATE__REDEFINITION_CONTEXT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.STATE__INCOMING: return UMLModelPackage.VERTEX__INCOMING;
				case UMLModelPackage.STATE__OUTGOING: return UMLModelPackage.VERTEX__OUTGOING;
				case UMLModelPackage.STATE__CONTAINER: return UMLModelPackage.VERTEX__CONTAINER;
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
				case UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UMLModelPackage.STATE__IS_LEAF;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UMLModelPackage.STATE__REDEFINED_ELEMENT;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UMLModelPackage.STATE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.VERTEX__INCOMING: return UMLModelPackage.STATE__INCOMING;
				case UMLModelPackage.VERTEX__OUTGOING: return UMLModelPackage.STATE__OUTGOING;
				case UMLModelPackage.VERTEX__CONTAINER: return UMLModelPackage.STATE__CONTAINER;
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
		result.append(", incoming: ");
		result.append(incoming);
		result.append(", outgoing: ");
		result.append(outgoing);
		result.append(", container: ");
		result.append(container);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isOrthogonal: ");
		result.append(isOrthogonal);
		result.append(", isSimple: ");
		result.append(isSimple);
		result.append(", isSubmachineState: ");
		result.append(isSubmachineState);
		result.append(", submachine: ");
		result.append(submachine);
		result.append(", redefinedState: ");
		result.append(redefinedState);
		result.append(')');
		return result.toString();
	}

} //StateImpl

/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ActivityNode;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends RedefinableElementImpl implements ActivityNode {
	/**
	 * The default value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_INTERRUPTIBLE_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected String inInterruptibleRegion = IN_INTERRUPTIBLE_REGION_EDEFAULT;

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
	 * The default value of the '{@link #getInPartition() <em>In Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInPartition() <em>In Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition()
	 * @generated
	 * @ordered
	 */
	protected String inPartition = IN_PARTITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInGroup() <em>In Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInGroup() <em>In Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroup()
	 * @generated
	 * @ordered
	 */
	protected String inGroup = IN_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedNode() <em>Redefined Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedNode()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedNode() <em>Redefined Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedNode()
	 * @generated
	 * @ordered
	 */
	protected String redefinedNode = REDEFINED_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected String activity = ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_STRUCTURED_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected String inStructuredNode = IN_STRUCTURED_NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInInterruptibleRegion() {
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInInterruptibleRegion(String newInInterruptibleRegion) {
		String oldInInterruptibleRegion = inInterruptibleRegion;
		inInterruptibleRegion = newInInterruptibleRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__OUTGOING, oldOutgoing, outgoing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__INCOMING, oldIncoming, incoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInPartition() {
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPartition(String newInPartition) {
		String oldInPartition = inPartition;
		inPartition = newInPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__IN_PARTITION, oldInPartition, inPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInGroup() {
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInGroup(String newInGroup) {
		String oldInGroup = inGroup;
		inGroup = newInGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__IN_GROUP, oldInGroup, inGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedNode() {
		return redefinedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedNode(String newRedefinedNode) {
		String oldRedefinedNode = redefinedNode;
		redefinedNode = newRedefinedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__REDEFINED_NODE, oldRedefinedNode, redefinedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(String newActivity) {
		String oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInStructuredNode() {
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(String newInStructuredNode) {
		String oldInStructuredNode = inStructuredNode;
		inStructuredNode = newInStructuredNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegion();
			case UMLModelPackage.ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case UMLModelPackage.ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case UMLModelPackage.ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case UMLModelPackage.ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case UMLModelPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return getRedefinedNode();
			case UMLModelPackage.ACTIVITY_NODE__ACTIVITY:
				return getActivity();
			case UMLModelPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
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
			case UMLModelPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__OUTGOING:
				setOutgoing((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__INCOMING:
				setIncoming((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_PARTITION:
				setInPartition((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_GROUP:
				setInGroup((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__REDEFINED_NODE:
				setRedefinedNode((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__ACTIVITY:
				setActivity((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((String)newValue);
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
			case UMLModelPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion(IN_INTERRUPTIBLE_REGION_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__OUTGOING:
				setOutgoing(OUTGOING_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__INCOMING:
				setIncoming(INCOMING_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_PARTITION:
				setInPartition(IN_PARTITION_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_GROUP:
				setInGroup(IN_GROUP_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__REDEFINED_NODE:
				setRedefinedNode(REDEFINED_NODE_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__ACTIVITY:
				setActivity(ACTIVITY_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode(IN_STRUCTURED_NODE_EDEFAULT);
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
			case UMLModelPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return IN_INTERRUPTIBLE_REGION_EDEFAULT == null ? inInterruptibleRegion != null : !IN_INTERRUPTIBLE_REGION_EDEFAULT.equals(inInterruptibleRegion);
			case UMLModelPackage.ACTIVITY_NODE__OUTGOING:
				return OUTGOING_EDEFAULT == null ? outgoing != null : !OUTGOING_EDEFAULT.equals(outgoing);
			case UMLModelPackage.ACTIVITY_NODE__INCOMING:
				return INCOMING_EDEFAULT == null ? incoming != null : !INCOMING_EDEFAULT.equals(incoming);
			case UMLModelPackage.ACTIVITY_NODE__IN_PARTITION:
				return IN_PARTITION_EDEFAULT == null ? inPartition != null : !IN_PARTITION_EDEFAULT.equals(inPartition);
			case UMLModelPackage.ACTIVITY_NODE__IN_GROUP:
				return IN_GROUP_EDEFAULT == null ? inGroup != null : !IN_GROUP_EDEFAULT.equals(inGroup);
			case UMLModelPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return REDEFINED_NODE_EDEFAULT == null ? redefinedNode != null : !REDEFINED_NODE_EDEFAULT.equals(redefinedNode);
			case UMLModelPackage.ACTIVITY_NODE__ACTIVITY:
				return ACTIVITY_EDEFAULT == null ? activity != null : !ACTIVITY_EDEFAULT.equals(activity);
			case UMLModelPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return IN_STRUCTURED_NODE_EDEFAULT == null ? inStructuredNode != null : !IN_STRUCTURED_NODE_EDEFAULT.equals(inStructuredNode);
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
		result.append(" (inInterruptibleRegion: ");
		result.append(inInterruptibleRegion);
		result.append(", outgoing: ");
		result.append(outgoing);
		result.append(", incoming: ");
		result.append(incoming);
		result.append(", inPartition: ");
		result.append(inPartition);
		result.append(", inGroup: ");
		result.append(inGroup);
		result.append(", redefinedNode: ");
		result.append(redefinedNode);
		result.append(", activity: ");
		result.append(activity);
		result.append(", inStructuredNode: ");
		result.append(inStructuredNode);
		result.append(')');
		return result.toString();
	}

} //ActivityNodeImpl

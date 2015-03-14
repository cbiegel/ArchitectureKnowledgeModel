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

import org.emftrace.metamodel.UMLModel.ActivityEdge;
import org.emftrace.metamodel.UMLModel.ActivityGroup;
import org.emftrace.metamodel.UMLModel.ActivityNode;
import org.emftrace.metamodel.UMLModel.ActivityPartition;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActivityPartitionImpl#getSubpartition <em>Subpartition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends NamedElementImpl implements ActivityPartition {
	/**
	 * The cached value of the '{@link #getContainedEdge() <em>Contained Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> containedEdge;

	/**
	 * The cached value of the '{@link #getContainedNode() <em>Contained Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> containedNode;

	/**
	 * The default value of the '{@link #getSubgroup() <em>Subgroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBGROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubgroup() <em>Subgroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroup()
	 * @generated
	 * @ordered
	 */
	protected String subgroup = SUBGROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperGroup() <em>Super Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperGroup() <em>Super Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected String superGroup = SUPER_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInActivity() <em>In Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInActivity() <em>In Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActivity()
	 * @generated
	 * @ordered
	 */
	protected String inActivity = IN_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected boolean isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected String edge = EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresents() <em>Represents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected String represents = REPRESENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperPartition() <em>Super Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPartition()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperPartition() <em>Super Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPartition()
	 * @generated
	 * @ordered
	 */
	protected String superPartition = SUPER_PARTITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubpartition() <em>Subpartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartition()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBPARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubpartition() <em>Subpartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartition()
	 * @generated
	 * @ordered
	 */
	protected String subpartition = SUBPARTITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getActivityPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		if (containedEdge == null) {
			containedEdge = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE);
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubgroup() {
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubgroup(String newSubgroup) {
		String oldSubgroup = subgroup;
		subgroup = newSubgroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP, oldSubgroup, subgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuperGroup() {
		return superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(String newSuperGroup) {
		String oldSuperGroup = superGroup;
		superGroup = newSuperGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP, oldSuperGroup, superGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInActivity() {
		return inActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(String newInActivity) {
		String oldInActivity = inActivity;
		inActivity = newInActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY, oldInActivity, inActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDimension() {
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(String newEdge) {
		String oldEdge = edge;
		edge = newEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__EDGE, oldEdge, edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(String newRepresents) {
		String oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuperPartition() {
		return superPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(String newSuperPartition) {
		String oldSuperPartition = superPartition;
		superPartition = newSuperPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION, oldSuperPartition, superPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubpartition() {
		return subpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubpartition(String newSubpartition) {
		String oldSubpartition = subpartition;
		subpartition = newSubpartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION, oldSubpartition, subpartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return getContainedEdge();
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return getContainedNode();
			case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP:
				return getSubgroup();
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP:
				return getSuperGroup();
			case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
				return getInActivity();
			case UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isIsDimension();
			case UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isIsExternal();
			case UMLModelPackage.ACTIVITY_PARTITION__EDGE:
				return getEdge();
			case UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS:
				return getRepresents();
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition();
			case UMLModelPackage.ACTIVITY_PARTITION__NODE:
				return getNode();
			case UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return getSubpartition();
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
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP:
				setSubgroup((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP:
				setSuperGroup((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
				setInActivity((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__EDGE:
				setEdge((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__NODE:
				setNode((String)newValue);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION:
				setSubpartition((String)newValue);
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
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP:
				setSubgroup(SUBGROUP_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP:
				setSuperGroup(SUPER_GROUP_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
				setInActivity(IN_ACTIVITY_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__EDGE:
				setEdge(EDGE_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents(REPRESENTS_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition(SUPER_PARTITION_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION:
				setSubpartition(SUBPARTITION_EDEFAULT);
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
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP:
				return SUBGROUP_EDEFAULT == null ? subgroup != null : !SUBGROUP_EDEFAULT.equals(subgroup);
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP:
				return SUPER_GROUP_EDEFAULT == null ? superGroup != null : !SUPER_GROUP_EDEFAULT.equals(superGroup);
			case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
				return IN_ACTIVITY_EDEFAULT == null ? inActivity != null : !IN_ACTIVITY_EDEFAULT.equals(inActivity);
			case UMLModelPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case UMLModelPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case UMLModelPackage.ACTIVITY_PARTITION__EDGE:
				return EDGE_EDEFAULT == null ? edge != null : !EDGE_EDEFAULT.equals(edge);
			case UMLModelPackage.ACTIVITY_PARTITION__REPRESENTS:
				return REPRESENTS_EDEFAULT == null ? represents != null : !REPRESENTS_EDEFAULT.equals(represents);
			case UMLModelPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return SUPER_PARTITION_EDEFAULT == null ? superPartition != null : !SUPER_PARTITION_EDEFAULT.equals(superPartition);
			case UMLModelPackage.ACTIVITY_PARTITION__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case UMLModelPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return SUBPARTITION_EDEFAULT == null ? subpartition != null : !SUBPARTITION_EDEFAULT.equals(subpartition);
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
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE: return UMLModelPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				case UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE: return UMLModelPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP: return UMLModelPackage.ACTIVITY_GROUP__SUBGROUP;
				case UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP: return UMLModelPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY: return UMLModelPackage.ACTIVITY_GROUP__IN_ACTIVITY;
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
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_EDGE;
				case UMLModelPackage.ACTIVITY_GROUP__CONTAINED_NODE: return UMLModelPackage.ACTIVITY_PARTITION__CONTAINED_NODE;
				case UMLModelPackage.ACTIVITY_GROUP__SUBGROUP: return UMLModelPackage.ACTIVITY_PARTITION__SUBGROUP;
				case UMLModelPackage.ACTIVITY_GROUP__SUPER_GROUP: return UMLModelPackage.ACTIVITY_PARTITION__SUPER_GROUP;
				case UMLModelPackage.ACTIVITY_GROUP__IN_ACTIVITY: return UMLModelPackage.ACTIVITY_PARTITION__IN_ACTIVITY;
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
		result.append(" (subgroup: ");
		result.append(subgroup);
		result.append(", superGroup: ");
		result.append(superGroup);
		result.append(", inActivity: ");
		result.append(inActivity);
		result.append(", isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(", edge: ");
		result.append(edge);
		result.append(", represents: ");
		result.append(represents);
		result.append(", superPartition: ");
		result.append(superPartition);
		result.append(", node: ");
		result.append(node);
		result.append(", subpartition: ");
		result.append(subpartition);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl

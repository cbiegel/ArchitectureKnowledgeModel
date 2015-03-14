/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emftrace.metamodel.URNModel.Condition;
import org.emftrace.metamodel.URNModel.Label;
import org.emftrace.metamodel.URNModel.NodeConnection;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getOutBindings <em>Out Bindings</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeConnectionImpl extends URNBaseImpl implements NodeConnection {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PROBABILITY_EDEFAULT = new BigInteger("100");

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected BigInteger probability = PROBABILITY_EDEFAULT;

	/**
	 * This is true if the Probability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabilityESet;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected String threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInBindings() <em>In Bindings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inBindings;

	/**
	 * The cached value of the '{@link #getOutBindings() <em>Out Bindings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outBindings;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected String timer = TIMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

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
	protected NodeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.NODE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(BigInteger newProbability) {
		BigInteger oldProbability = probability;
		probability = newProbability;
		boolean oldProbabilityESet = probabilityESet;
		probabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__PROBABILITY, oldProbability, probability, !oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbability() {
		BigInteger oldProbability = probability;
		boolean oldProbabilityESet = probabilityESet;
		probability = PROBABILITY_EDEFAULT;
		probabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.NODE_CONNECTION__PROBABILITY, oldProbability, PROBABILITY_EDEFAULT, oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbability() {
		return probabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(String newThreshold) {
		String oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInBindings() {
		if (inBindings == null) {
			inBindings = new EDataTypeEList<String>(String.class, this, URNModelPackage.NODE_CONNECTION__IN_BINDINGS);
		}
		return inBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutBindings() {
		if (outBindings == null) {
			outBindings = new EDataTypeEList<String>(String.class, this, URNModelPackage.NODE_CONNECTION__OUT_BINDINGS);
		}
		return outBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.NODE_CONNECTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.NODE_CONNECTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(String newTimer) {
		String oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__TIMER, oldTimer, timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.NODE_CONNECTION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.NODE_CONNECTION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__LABEL, newLabel, newLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.NODE_CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.NODE_CONNECTION__CONDITION:
				return basicSetCondition(null, msgs);
			case URNModelPackage.NODE_CONNECTION__LABEL:
				return basicSetLabel(null, msgs);
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
			case URNModelPackage.NODE_CONNECTION__ID:
				return getId();
			case URNModelPackage.NODE_CONNECTION__PROBABILITY:
				return getProbability();
			case URNModelPackage.NODE_CONNECTION__THRESHOLD:
				return getThreshold();
			case URNModelPackage.NODE_CONNECTION__IN_BINDINGS:
				return getInBindings();
			case URNModelPackage.NODE_CONNECTION__OUT_BINDINGS:
				return getOutBindings();
			case URNModelPackage.NODE_CONNECTION__CONDITION:
				return getCondition();
			case URNModelPackage.NODE_CONNECTION__TIMER:
				return getTimer();
			case URNModelPackage.NODE_CONNECTION__LABEL:
				return getLabel();
			case URNModelPackage.NODE_CONNECTION__TARGET:
				return getTarget();
			case URNModelPackage.NODE_CONNECTION__SOURCE:
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
			case URNModelPackage.NODE_CONNECTION__ID:
				setId((String)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__PROBABILITY:
				setProbability((BigInteger)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__THRESHOLD:
				setThreshold((String)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__IN_BINDINGS:
				getInBindings().clear();
				getInBindings().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__OUT_BINDINGS:
				getOutBindings().clear();
				getOutBindings().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__TIMER:
				setTimer((String)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__LABEL:
				setLabel((Label)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__TARGET:
				setTarget((String)newValue);
				return;
			case URNModelPackage.NODE_CONNECTION__SOURCE:
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
			case URNModelPackage.NODE_CONNECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case URNModelPackage.NODE_CONNECTION__PROBABILITY:
				unsetProbability();
				return;
			case URNModelPackage.NODE_CONNECTION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case URNModelPackage.NODE_CONNECTION__IN_BINDINGS:
				getInBindings().clear();
				return;
			case URNModelPackage.NODE_CONNECTION__OUT_BINDINGS:
				getOutBindings().clear();
				return;
			case URNModelPackage.NODE_CONNECTION__CONDITION:
				setCondition((Condition)null);
				return;
			case URNModelPackage.NODE_CONNECTION__TIMER:
				setTimer(TIMER_EDEFAULT);
				return;
			case URNModelPackage.NODE_CONNECTION__LABEL:
				setLabel((Label)null);
				return;
			case URNModelPackage.NODE_CONNECTION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case URNModelPackage.NODE_CONNECTION__SOURCE:
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
			case URNModelPackage.NODE_CONNECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case URNModelPackage.NODE_CONNECTION__PROBABILITY:
				return isSetProbability();
			case URNModelPackage.NODE_CONNECTION__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
			case URNModelPackage.NODE_CONNECTION__IN_BINDINGS:
				return inBindings != null && !inBindings.isEmpty();
			case URNModelPackage.NODE_CONNECTION__OUT_BINDINGS:
				return outBindings != null && !outBindings.isEmpty();
			case URNModelPackage.NODE_CONNECTION__CONDITION:
				return condition != null;
			case URNModelPackage.NODE_CONNECTION__TIMER:
				return TIMER_EDEFAULT == null ? timer != null : !TIMER_EDEFAULT.equals(timer);
			case URNModelPackage.NODE_CONNECTION__LABEL:
				return label != null;
			case URNModelPackage.NODE_CONNECTION__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case URNModelPackage.NODE_CONNECTION__SOURCE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", probability: ");
		if (probabilityESet) result.append(probability); else result.append("<unset>");
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", inBindings: ");
		result.append(inBindings);
		result.append(", outBindings: ");
		result.append(outBindings);
		result.append(", timer: ");
		result.append(timer);
		result.append(", target: ");
		result.append(target);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //NodeConnectionImpl

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

import org.emftrace.metamodel.URNModel.ConcreteStyle;
import org.emftrace.metamodel.URNModel.DecompositionType;
import org.emftrace.metamodel.URNModel.ImportanceType;
import org.emftrace.metamodel.URNModel.IntentionalElement;
import org.emftrace.metamodel.URNModel.IntentionalElementType;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentionalElementImpl extends GRLLinkableElementImpl implements IntentionalElement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IntentionalElementType TYPE_EDEFAULT = IntentionalElementType.SOFTGOAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElementType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionType()
	 * @generated
	 * @ordered
	 */
	protected static final DecompositionType DECOMPOSITION_TYPE_EDEFAULT = DecompositionType.AND;

	/**
	 * The cached value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionType()
	 * @generated
	 * @ordered
	 */
	protected DecompositionType decompositionType = DECOMPOSITION_TYPE_EDEFAULT;

	/**
	 * This is true if the Decomposition Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decompositionTypeESet;

	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final ImportanceType IMPORTANCE_EDEFAULT = ImportanceType.NONE;

	/**
	 * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected ImportanceType importance = IMPORTANCE_EDEFAULT;

	/**
	 * This is true if the Importance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean importanceESet;

	/**
	 * The default value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceQuantitative()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IMPORTANCE_QUANTITATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceQuantitative()
	 * @generated
	 * @ordered
	 */
	protected BigInteger importanceQuantitative = IMPORTANCE_QUANTITATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> refs;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ConcreteStyle style;

	/**
	 * The default value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected String actor = ACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentionalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.INTENTIONAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IntentionalElementType newType) {
		IntentionalElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		IntentionalElementType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.INTENTIONAL_ELEMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType getDecompositionType() {
		return decompositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompositionType(DecompositionType newDecompositionType) {
		DecompositionType oldDecompositionType = decompositionType;
		decompositionType = newDecompositionType == null ? DECOMPOSITION_TYPE_EDEFAULT : newDecompositionType;
		boolean oldDecompositionTypeESet = decompositionTypeESet;
		decompositionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE, oldDecompositionType, decompositionType, !oldDecompositionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecompositionType() {
		DecompositionType oldDecompositionType = decompositionType;
		boolean oldDecompositionTypeESet = decompositionTypeESet;
		decompositionType = DECOMPOSITION_TYPE_EDEFAULT;
		decompositionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE, oldDecompositionType, DECOMPOSITION_TYPE_EDEFAULT, oldDecompositionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecompositionType() {
		return decompositionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportanceType getImportance() {
		return importance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportance(ImportanceType newImportance) {
		ImportanceType oldImportance = importance;
		importance = newImportance == null ? IMPORTANCE_EDEFAULT : newImportance;
		boolean oldImportanceESet = importanceESet;
		importanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE, oldImportance, importance, !oldImportanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportance() {
		ImportanceType oldImportance = importance;
		boolean oldImportanceESet = importanceESet;
		importance = IMPORTANCE_EDEFAULT;
		importanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE, oldImportance, IMPORTANCE_EDEFAULT, oldImportanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportance() {
		return importanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getImportanceQuantitative() {
		return importanceQuantitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceQuantitative(BigInteger newImportanceQuantitative) {
		BigInteger oldImportanceQuantitative = importanceQuantitative;
		importanceQuantitative = newImportanceQuantitative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE, oldImportanceQuantitative, importanceQuantitative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRefs() {
		if (refs == null) {
			refs = new EDataTypeEList<String>(String.class, this, URNModelPackage.INTENTIONAL_ELEMENT__REFS);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(ConcreteStyle newStyle, NotificationChain msgs) {
		ConcreteStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(ConcreteStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.INTENTIONAL_ELEMENT__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.INTENTIONAL_ELEMENT__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(String newActor) {
		String oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.INTENTIONAL_ELEMENT__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.INTENTIONAL_ELEMENT__STYLE:
				return basicSetStyle(null, msgs);
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
			case URNModelPackage.INTENTIONAL_ELEMENT__TYPE:
				return getType();
			case URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
				return getDecompositionType();
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
				return getImportance();
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
				return getImportanceQuantitative();
			case URNModelPackage.INTENTIONAL_ELEMENT__REFS:
				return getRefs();
			case URNModelPackage.INTENTIONAL_ELEMENT__STYLE:
				return getStyle();
			case URNModelPackage.INTENTIONAL_ELEMENT__ACTOR:
				return getActor();
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
			case URNModelPackage.INTENTIONAL_ELEMENT__TYPE:
				setType((IntentionalElementType)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
				setDecompositionType((DecompositionType)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
				setImportance((ImportanceType)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
				setImportanceQuantitative((BigInteger)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__REFS:
				getRefs().clear();
				getRefs().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__STYLE:
				setStyle((ConcreteStyle)newValue);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__ACTOR:
				setActor((String)newValue);
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
			case URNModelPackage.INTENTIONAL_ELEMENT__TYPE:
				unsetType();
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
				unsetDecompositionType();
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
				unsetImportance();
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
				setImportanceQuantitative(IMPORTANCE_QUANTITATIVE_EDEFAULT);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__REFS:
				getRefs().clear();
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__STYLE:
				setStyle((ConcreteStyle)null);
				return;
			case URNModelPackage.INTENTIONAL_ELEMENT__ACTOR:
				setActor(ACTOR_EDEFAULT);
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
			case URNModelPackage.INTENTIONAL_ELEMENT__TYPE:
				return isSetType();
			case URNModelPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
				return isSetDecompositionType();
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
				return isSetImportance();
			case URNModelPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
				return IMPORTANCE_QUANTITATIVE_EDEFAULT == null ? importanceQuantitative != null : !IMPORTANCE_QUANTITATIVE_EDEFAULT.equals(importanceQuantitative);
			case URNModelPackage.INTENTIONAL_ELEMENT__REFS:
				return refs != null && !refs.isEmpty();
			case URNModelPackage.INTENTIONAL_ELEMENT__STYLE:
				return style != null;
			case URNModelPackage.INTENTIONAL_ELEMENT__ACTOR:
				return ACTOR_EDEFAULT == null ? actor != null : !ACTOR_EDEFAULT.equals(actor);
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", decompositionType: ");
		if (decompositionTypeESet) result.append(decompositionType); else result.append("<unset>");
		result.append(", importance: ");
		if (importanceESet) result.append(importance); else result.append("<unset>");
		result.append(", importanceQuantitative: ");
		result.append(importanceQuantitative);
		result.append(", refs: ");
		result.append(refs);
		result.append(", actor: ");
		result.append(actor);
		result.append(')');
		return result.toString();
	}

} //IntentionalElementImpl

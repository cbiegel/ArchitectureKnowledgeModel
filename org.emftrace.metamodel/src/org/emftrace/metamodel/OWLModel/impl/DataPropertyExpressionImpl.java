/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.emftrace.metamodel.OWLModel.DataPropertyExpression;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyExpressionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyExpressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyExpressionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyExpressionImpl#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataPropertyExpressionImpl extends OWLBaseImpl implements DataPropertyExpression {
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDataPropertyExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_EXPRESSION__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_EXPRESSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_EXPRESSION__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__BASE:
				return getBase();
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__ID:
				return getId();
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__LANG:
				return getLang();
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE:
				return getSpace();
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
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__BASE:
				setBase((String)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__ID:
				setId((String)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__LANG:
				setLang((String)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE:
				setSpace((SpaceType)newValue);
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
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__ID:
				setId(ID_EDEFAULT);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE:
				unsetSpace();
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
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION__SPACE:
				return isSetSpace();
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
		result.append(" (base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPropertyExpressionImpl

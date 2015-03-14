/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.Comment;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getX <em>X</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.CommentImpl#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends URNBaseImpl implements Comment {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected BigInteger x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected String fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(BigInteger newX) {
		BigInteger oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(BigInteger newY) {
		BigInteger oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigInteger newWidth) {
		BigInteger oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BigInteger newHeight) {
		BigInteger oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(String newFillColor) {
		String oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.COMMENT__FILL_COLOR, oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.COMMENT__DESCRIPTION:
				return getDescription();
			case URNModelPackage.COMMENT__X:
				return getX();
			case URNModelPackage.COMMENT__Y:
				return getY();
			case URNModelPackage.COMMENT__WIDTH:
				return getWidth();
			case URNModelPackage.COMMENT__HEIGHT:
				return getHeight();
			case URNModelPackage.COMMENT__FILL_COLOR:
				return getFillColor();
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
			case URNModelPackage.COMMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case URNModelPackage.COMMENT__X:
				setX((BigInteger)newValue);
				return;
			case URNModelPackage.COMMENT__Y:
				setY((BigInteger)newValue);
				return;
			case URNModelPackage.COMMENT__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case URNModelPackage.COMMENT__HEIGHT:
				setHeight((BigInteger)newValue);
				return;
			case URNModelPackage.COMMENT__FILL_COLOR:
				setFillColor((String)newValue);
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
			case URNModelPackage.COMMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case URNModelPackage.COMMENT__X:
				setX(X_EDEFAULT);
				return;
			case URNModelPackage.COMMENT__Y:
				setY(Y_EDEFAULT);
				return;
			case URNModelPackage.COMMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case URNModelPackage.COMMENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case URNModelPackage.COMMENT__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
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
			case URNModelPackage.COMMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case URNModelPackage.COMMENT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case URNModelPackage.COMMENT__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case URNModelPackage.COMMENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case URNModelPackage.COMMENT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case URNModelPackage.COMMENT__FILL_COLOR:
				return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(')');
		return result.toString();
	}

} //CommentImpl

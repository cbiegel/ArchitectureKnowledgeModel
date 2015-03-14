/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.DataProperty;
import org.emftrace.metamodel.OWLModel.DataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.Literal;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyAssertionImpl#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyAssertionImpl#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyAssertionImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataPropertyAssertionImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyAssertionImpl extends AssertionImpl implements DataPropertyAssertion {
	/**
	 * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataProperty dataProperty;

	/**
	 * The cached value of the '{@link #getNamedIndividual() <em>Named Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedIndividual()
	 * @generated
	 * @ordered
	 */
	protected NamedIndividual namedIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected AnonymousIndividual anonymousIndividual;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected Literal literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDataPropertyAssertion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getDataProperty() {
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProperty(DataProperty newDataProperty, NotificationChain msgs) {
		DataProperty oldDataProperty = dataProperty;
		dataProperty = newDataProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, oldDataProperty, newDataProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProperty(DataProperty newDataProperty) {
		if (newDataProperty != dataProperty) {
			NotificationChain msgs = null;
			if (dataProperty != null)
				msgs = ((InternalEObject)dataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, null, msgs);
			if (newDataProperty != null)
				msgs = ((InternalEObject)newDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, null, msgs);
			msgs = basicSetDataProperty(newDataProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, newDataProperty, newDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual getNamedIndividual() {
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedIndividual(NamedIndividual newNamedIndividual, NotificationChain msgs) {
		NamedIndividual oldNamedIndividual = namedIndividual;
		namedIndividual = newNamedIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL, oldNamedIndividual, newNamedIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedIndividual(NamedIndividual newNamedIndividual) {
		if (newNamedIndividual != namedIndividual) {
			NotificationChain msgs = null;
			if (namedIndividual != null)
				msgs = ((InternalEObject)namedIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL, null, msgs);
			if (newNamedIndividual != null)
				msgs = ((InternalEObject)newNamedIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL, null, msgs);
			msgs = basicSetNamedIndividual(newNamedIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL, newNamedIndividual, newNamedIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual getAnonymousIndividual() {
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousIndividual(AnonymousIndividual newAnonymousIndividual, NotificationChain msgs) {
		AnonymousIndividual oldAnonymousIndividual = anonymousIndividual;
		anonymousIndividual = newAnonymousIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual, newAnonymousIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousIndividual(AnonymousIndividual newAnonymousIndividual) {
		if (newAnonymousIndividual != anonymousIndividual) {
			NotificationChain msgs = null;
			if (anonymousIndividual != null)
				msgs = ((InternalEObject)anonymousIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL, null, msgs);
			if (newAnonymousIndividual != null)
				msgs = ((InternalEObject)newAnonymousIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL, null, msgs);
			msgs = basicSetAnonymousIndividual(newAnonymousIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL, newAnonymousIndividual, newAnonymousIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs) {
		Literal oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL, oldLiteral, newLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(Literal newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return basicSetDataProperty(null, msgs);
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return basicSetNamedIndividual(null, msgs);
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return basicSetAnonymousIndividual(null, msgs);
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL:
				return basicSetLiteral(null, msgs);
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
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return getDataProperty();
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return getNamedIndividual();
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL:
				return getLiteral();
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
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				setDataProperty((DataProperty)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividual)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)newValue);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL:
				setLiteral((Literal)newValue);
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
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				setDataProperty((DataProperty)null);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividual)null);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)null);
				return;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL:
				setLiteral((Literal)null);
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
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return dataProperty != null;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return namedIndividual != null;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null;
			case OWLModelPackage.DATA_PROPERTY_ASSERTION__LITERAL:
				return literal != null;
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyAssertionImpl

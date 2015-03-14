/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.AbbreviatedIRI;
import org.emftrace.metamodel.OWLModel.AnnotationProperty;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyRange;
import org.emftrace.metamodel.OWLModel.IRI;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationPropertyRangeImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationPropertyRangeImpl#getIRI <em>IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationPropertyRangeImpl#getAbbreviatedIRI <em>Abbreviated IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationPropertyRangeImpl extends AnnotationAxiomImpl implements AnnotationPropertyRange {
	/**
	 * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty annotationProperty;

	/**
	 * The cached value of the '{@link #getIRI() <em>IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRI()
	 * @generated
	 * @ordered
	 */
	protected IRI iri;

	/**
	 * The cached value of the '{@link #getAbbreviatedIRI() <em>Abbreviated IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviatedIRI()
	 * @generated
	 * @ordered
	 */
	protected AbbreviatedIRI abbreviatedIRI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationPropertyRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getAnnotationPropertyRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getAnnotationProperty() {
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationProperty(AnnotationProperty newAnnotationProperty, NotificationChain msgs) {
		AnnotationProperty oldAnnotationProperty = annotationProperty;
		annotationProperty = newAnnotationProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY, oldAnnotationProperty, newAnnotationProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationProperty(AnnotationProperty newAnnotationProperty) {
		if (newAnnotationProperty != annotationProperty) {
			NotificationChain msgs = null;
			if (annotationProperty != null)
				msgs = ((InternalEObject)annotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY, null, msgs);
			if (newAnnotationProperty != null)
				msgs = ((InternalEObject)newAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY, null, msgs);
			msgs = basicSetAnnotationProperty(newAnnotationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY, newAnnotationProperty, newAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI getIRI() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIRI(IRI newIRI, NotificationChain msgs) {
		IRI oldIRI = iri;
		iri = newIRI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI, oldIRI, newIRI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIRI(IRI newIRI) {
		if (newIRI != iri) {
			NotificationChain msgs = null;
			if (iri != null)
				msgs = ((InternalEObject)iri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI, null, msgs);
			if (newIRI != null)
				msgs = ((InternalEObject)newIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI, null, msgs);
			msgs = basicSetIRI(newIRI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI, newIRI, newIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviatedIRI getAbbreviatedIRI() {
		return abbreviatedIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbreviatedIRI(AbbreviatedIRI newAbbreviatedIRI, NotificationChain msgs) {
		AbbreviatedIRI oldAbbreviatedIRI = abbreviatedIRI;
		abbreviatedIRI = newAbbreviatedIRI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI, oldAbbreviatedIRI, newAbbreviatedIRI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviatedIRI(AbbreviatedIRI newAbbreviatedIRI) {
		if (newAbbreviatedIRI != abbreviatedIRI) {
			NotificationChain msgs = null;
			if (abbreviatedIRI != null)
				msgs = ((InternalEObject)abbreviatedIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI, null, msgs);
			if (newAbbreviatedIRI != null)
				msgs = ((InternalEObject)newAbbreviatedIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI, null, msgs);
			msgs = basicSetAbbreviatedIRI(newAbbreviatedIRI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI, newAbbreviatedIRI, newAbbreviatedIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY:
				return basicSetAnnotationProperty(null, msgs);
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI:
				return basicSetIRI(null, msgs);
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI:
				return basicSetAbbreviatedIRI(null, msgs);
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
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY:
				return getAnnotationProperty();
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI:
				return getIRI();
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI:
				return getAbbreviatedIRI();
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
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)newValue);
				return;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI:
				setIRI((IRI)newValue);
				return;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI:
				setAbbreviatedIRI((AbbreviatedIRI)newValue);
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
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)null);
				return;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI:
				setIRI((IRI)null);
				return;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI:
				setAbbreviatedIRI((AbbreviatedIRI)null);
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
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY:
				return annotationProperty != null;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__IRI:
				return iri != null;
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE__ABBREVIATED_IRI:
				return abbreviatedIRI != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationPropertyRangeImpl

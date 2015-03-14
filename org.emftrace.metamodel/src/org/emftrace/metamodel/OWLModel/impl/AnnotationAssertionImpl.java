/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.AbbreviatedIRI;
import org.emftrace.metamodel.OWLModel.AnnotationAssertion;
import org.emftrace.metamodel.OWLModel.AnnotationProperty;
import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.IRI;
import org.emftrace.metamodel.OWLModel.Literal;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationAssertionImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationAssertionImpl#getIRI <em>IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationAssertionImpl#getAbbreviatedIRI <em>Abbreviated IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationAssertionImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.AnnotationAssertionImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationAssertionImpl extends AnnotationAxiomImpl implements AnnotationAssertion {
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
	 * The cached value of the '{@link #getIRI() <em>IRI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRI()
	 * @generated
	 * @ordered
	 */
	protected EList<IRI> iri;

	/**
	 * The cached value of the '{@link #getAbbreviatedIRI() <em>Abbreviated IRI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviatedIRI()
	 * @generated
	 * @ordered
	 */
	protected EList<AbbreviatedIRI> abbreviatedIRI;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousIndividual> anonymousIndividual;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getAnnotationAssertion();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, oldAnnotationProperty, newAnnotationProperty);
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
				msgs = ((InternalEObject)annotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, null, msgs);
			if (newAnnotationProperty != null)
				msgs = ((InternalEObject)newAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, null, msgs);
			msgs = basicSetAnnotationProperty(newAnnotationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, newAnnotationProperty, newAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRI> getIRI() {
		if (iri == null) {
			iri = new EObjectContainmentEList<IRI>(IRI.class, this, OWLModelPackage.ANNOTATION_ASSERTION__IRI);
		}
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbreviatedIRI> getAbbreviatedIRI() {
		if (abbreviatedIRI == null) {
			abbreviatedIRI = new EObjectContainmentEList<AbbreviatedIRI>(AbbreviatedIRI.class, this, OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI);
		}
		return abbreviatedIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnonymousIndividual> getAnonymousIndividual() {
		if (anonymousIndividual == null) {
			anonymousIndividual = new EObjectContainmentEList<AnonymousIndividual>(AnonymousIndividual.class, this, OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL);
		}
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getLiteral() {
		if (literal == null) {
			literal = new EObjectContainmentEList<Literal>(Literal.class, this, OWLModelPackage.ANNOTATION_ASSERTION__LITERAL);
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
				return basicSetAnnotationProperty(null, msgs);
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
				return ((InternalEList<?>)getIRI()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
				return ((InternalEList<?>)getAbbreviatedIRI()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return ((InternalEList<?>)getAnonymousIndividual()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
				return getAnnotationProperty();
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
				return getIRI();
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
				return getAbbreviatedIRI();
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
				return getLiteral();
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
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)newValue);
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
				getIRI().clear();
				getIRI().addAll((Collection<? extends IRI>)newValue);
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
				getAbbreviatedIRI().clear();
				getAbbreviatedIRI().addAll((Collection<? extends AbbreviatedIRI>)newValue);
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
				getAnonymousIndividual().addAll((Collection<? extends AnonymousIndividual>)newValue);
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends Literal>)newValue);
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
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)null);
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
				getIRI().clear();
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
				getAbbreviatedIRI().clear();
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
				return;
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
				getLiteral().clear();
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
			case OWLModelPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
				return annotationProperty != null;
			case OWLModelPackage.ANNOTATION_ASSERTION__IRI:
				return iri != null && !iri.isEmpty();
			case OWLModelPackage.ANNOTATION_ASSERTION__ABBREVIATED_IRI:
				return abbreviatedIRI != null && !abbreviatedIRI.isEmpty();
			case OWLModelPackage.ANNOTATION_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null && !anonymousIndividual.isEmpty();
			case OWLModelPackage.ANNOTATION_ASSERTION__LITERAL:
				return literal != null && !literal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationAssertionImpl

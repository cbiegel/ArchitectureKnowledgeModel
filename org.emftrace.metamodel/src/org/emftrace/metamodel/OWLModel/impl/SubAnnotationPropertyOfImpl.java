/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.AnnotationProperty;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.SubAnnotationPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.SubAnnotationPropertyOfImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubAnnotationPropertyOfImpl extends AnnotationAxiomImpl implements SubAnnotationPropertyOf {
	/**
	 * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationProperty> annotationProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubAnnotationPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getSubAnnotationPropertyOf();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationProperty> getAnnotationProperty() {
		if (annotationProperty == null) {
			annotationProperty = new EObjectContainmentEList<AnnotationProperty>(AnnotationProperty.class, this, OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY);
		}
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY:
				return ((InternalEList<?>)getAnnotationProperty()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY:
				return getAnnotationProperty();
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
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY:
				getAnnotationProperty().clear();
				getAnnotationProperty().addAll((Collection<? extends AnnotationProperty>)newValue);
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
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY:
				getAnnotationProperty().clear();
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
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF__ANNOTATION_PROPERTY:
				return annotationProperty != null && !annotationProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubAnnotationPropertyOfImpl

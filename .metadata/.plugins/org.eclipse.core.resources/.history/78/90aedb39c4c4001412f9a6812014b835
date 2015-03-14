/**
 */
package org.emftrace.metamodel.QUARCModel.GSS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Instrument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl#getRelatedInstruments <em>Related Instruments</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SolutionInstrumentImpl extends ConstrainedElementImpl implements SolutionInstrument {
	/**
	 * The cached value of the '{@link #getRelatedInstruments() <em>Related Instruments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedInstruments()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionInstrument> relatedInstruments;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionInstrumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSSPackage.Literals.SOLUTION_INSTRUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionInstrument> getRelatedInstruments() {
		if (relatedInstruments == null) {
			relatedInstruments = new EObjectResolvingEList<SolutionInstrument>(SolutionInstrument.class, this, GSSPackage.SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS);
		}
		return relatedInstruments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSSPackage.SOLUTION_INSTRUMENT__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSSPackage.SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS:
				return getRelatedInstruments();
			case GSSPackage.SOLUTION_INSTRUMENT__LINK:
				return getLink();
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
			case GSSPackage.SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS:
				getRelatedInstruments().clear();
				getRelatedInstruments().addAll((Collection<? extends SolutionInstrument>)newValue);
				return;
			case GSSPackage.SOLUTION_INSTRUMENT__LINK:
				setLink((String)newValue);
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
			case GSSPackage.SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS:
				getRelatedInstruments().clear();
				return;
			case GSSPackage.SOLUTION_INSTRUMENT__LINK:
				setLink(LINK_EDEFAULT);
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
			case GSSPackage.SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS:
				return relatedInstruments != null && !relatedInstruments.isEmpty();
			case GSSPackage.SOLUTION_INSTRUMENT__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
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
		result.append(" (link: ");
		result.append(link);
		result.append(')');
		return result.toString();
	}

} //SolutionInstrumentImpl

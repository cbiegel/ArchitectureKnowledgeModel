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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.Action;
import org.emftrace.metamodel.UMLModel.Constraint;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ActionImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends ExecutableNodeImpl implements Action {
	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> input;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UMLModelPackage.ACTION__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UMLModelPackage.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutput() {
		if (output == null) {
			output = new EDataTypeUniqueEList<String>(String.class, this, UMLModelPackage.ACTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInput() {
		if (input == null) {
			input = new EDataTypeUniqueEList<String>(String.class, this, UMLModelPackage.ACTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ACTION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.ACTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case UMLModelPackage.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case UMLModelPackage.ACTION__OUTPUT:
				return getOutput();
			case UMLModelPackage.ACTION__INPUT:
				return getInput();
			case UMLModelPackage.ACTION__CONTEXT:
				return getContext();
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
			case UMLModelPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UMLModelPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UMLModelPackage.ACTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends String>)newValue);
				return;
			case UMLModelPackage.ACTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends String>)newValue);
				return;
			case UMLModelPackage.ACTION__CONTEXT:
				setContext((String)newValue);
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
			case UMLModelPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				return;
			case UMLModelPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				return;
			case UMLModelPackage.ACTION__OUTPUT:
				getOutput().clear();
				return;
			case UMLModelPackage.ACTION__INPUT:
				getInput().clear();
				return;
			case UMLModelPackage.ACTION__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
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
			case UMLModelPackage.ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UMLModelPackage.ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UMLModelPackage.ACTION__OUTPUT:
				return output != null && !output.isEmpty();
			case UMLModelPackage.ACTION__INPUT:
				return input != null && !input.isEmpty();
			case UMLModelPackage.ACTION__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
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
		result.append(" (output: ");
		result.append(output);
		result.append(", input: ");
		result.append(input);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //ActionImpl

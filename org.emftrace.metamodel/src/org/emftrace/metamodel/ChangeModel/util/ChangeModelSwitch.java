/**
 */
package org.emftrace.metamodel.ChangeModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.ChangeModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage
 * @generated
 */
public class ChangeModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChangeModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ChangeModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChangeModelPackage.ABSTRACT_CHANGE_TYPE: {
				AbstractChangeType abstractChangeType = (AbstractChangeType)theEObject;
				T result = caseAbstractChangeType(abstractChangeType);
				if (result == null) result = caseChangeModelBase(abstractChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.ATOMIC_CHANGE_TYPE: {
				AtomicChangeType atomicChangeType = (AtomicChangeType)theEObject;
				T result = caseAtomicChangeType(atomicChangeType);
				if (result == null) result = caseAbstractChangeType(atomicChangeType);
				if (result == null) result = caseChangeModelBase(atomicChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE: {
				CompositeChangeType compositeChangeType = (CompositeChangeType)theEObject;
				T result = caseCompositeChangeType(compositeChangeType);
				if (result == null) result = caseAbstractChangeType(compositeChangeType);
				if (result == null) result = caseChangeModelBase(compositeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE: {
				AbstractChangeInstance abstractChangeInstance = (AbstractChangeInstance)theEObject;
				T result = caseAbstractChangeInstance(abstractChangeInstance);
				if (result == null) result = caseChangeModelBase(abstractChangeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.ATOMIC_CHANGE_INSTANCE: {
				AtomicChangeInstance atomicChangeInstance = (AtomicChangeInstance)theEObject;
				T result = caseAtomicChangeInstance(atomicChangeInstance);
				if (result == null) result = caseAbstractChangeInstance(atomicChangeInstance);
				if (result == null) result = caseChangeModelBase(atomicChangeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE: {
				CompositeChangeInstance compositeChangeInstance = (CompositeChangeInstance)theEObject;
				T result = caseCompositeChangeInstance(compositeChangeInstance);
				if (result == null) result = caseAbstractChangeInstance(compositeChangeInstance);
				if (result == null) result = caseChangeModelBase(compositeChangeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.CHANGE_TYPE_CATALOG: {
				ChangeTypeCatalog changeTypeCatalog = (ChangeTypeCatalog)theEObject;
				T result = caseChangeTypeCatalog(changeTypeCatalog);
				if (result == null) result = caseChangeModelBase(changeTypeCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangeModelPackage.CHANGE_MODEL_BASE: {
				ChangeModelBase changeModelBase = (ChangeModelBase)theEObject;
				T result = caseChangeModelBase(changeModelBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractChangeType(AbstractChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicChangeType(AtomicChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeChangeType(CompositeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractChangeInstance(AbstractChangeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Change Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Change Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicChangeInstance(AtomicChangeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Change Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Change Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeChangeInstance(CompositeChangeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Type Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Type Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTypeCatalog(ChangeTypeCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeModelBase(ChangeModelBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChangeModelSwitch

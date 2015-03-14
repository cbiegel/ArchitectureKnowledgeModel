/**
 */
package org.emftrace.metamodel.ChangeModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.ChangeModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeModelFactoryImpl extends EFactoryImpl implements ChangeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeModelFactory init() {
		try {
			ChangeModelFactory theChangeModelFactory = (ChangeModelFactory)EPackage.Registry.INSTANCE.getEFactory(ChangeModelPackage.eNS_URI);
			if (theChangeModelFactory != null) {
				return theChangeModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChangeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChangeModelPackage.ATOMIC_CHANGE_TYPE: return createAtomicChangeType();
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE: return createCompositeChangeType();
			case ChangeModelPackage.ATOMIC_CHANGE_INSTANCE: return createAtomicChangeInstance();
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE: return createCompositeChangeInstance();
			case ChangeModelPackage.CHANGE_TYPE_CATALOG: return createChangeTypeCatalog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ChangeModelPackage.ATOMIC_TYPE:
				return createAtomicTypeFromString(eDataType, initialValue);
			case ChangeModelPackage.COMPOSITE_TYPE:
				return createCompositeTypeFromString(eDataType, initialValue);
			case ChangeModelPackage.ABSTRACTION_LEVEL:
				return createAbstractionLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ChangeModelPackage.ATOMIC_TYPE:
				return convertAtomicTypeToString(eDataType, instanceValue);
			case ChangeModelPackage.COMPOSITE_TYPE:
				return convertCompositeTypeToString(eDataType, instanceValue);
			case ChangeModelPackage.ABSTRACTION_LEVEL:
				return convertAbstractionLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicChangeType createAtomicChangeType() {
		AtomicChangeTypeImpl atomicChangeType = new AtomicChangeTypeImpl();
		return atomicChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeChangeType createCompositeChangeType() {
		CompositeChangeTypeImpl compositeChangeType = new CompositeChangeTypeImpl();
		return compositeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicChangeInstance createAtomicChangeInstance() {
		AtomicChangeInstanceImpl atomicChangeInstance = new AtomicChangeInstanceImpl();
		return atomicChangeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeChangeInstance createCompositeChangeInstance() {
		CompositeChangeInstanceImpl compositeChangeInstance = new CompositeChangeInstanceImpl();
		return compositeChangeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTypeCatalog createChangeTypeCatalog() {
		ChangeTypeCatalogImpl changeTypeCatalog = new ChangeTypeCatalogImpl();
		return changeTypeCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicType createAtomicTypeFromString(EDataType eDataType, String initialValue) {
		AtomicType result = AtomicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAtomicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeTypeFromString(EDataType eDataType, String initialValue) {
		CompositeType result = CompositeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel createAbstractionLevelFromString(EDataType eDataType, String initialValue) {
		AbstractionLevel result = AbstractionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeModelPackage getChangeModelPackage() {
		return (ChangeModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChangeModelPackage getPackage() {
		return ChangeModelPackage.eINSTANCE;
	}

} //ChangeModelFactoryImpl

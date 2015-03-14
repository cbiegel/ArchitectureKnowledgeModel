/**
 */
package org.emftrace.metamodel.RuleModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.RuleModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleModelFactoryImpl extends EFactoryImpl implements RuleModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleModelFactory init() {
		try {
			RuleModelFactory theRuleModelFactory = (RuleModelFactory)EPackage.Registry.INSTANCE.getEFactory(RuleModelPackage.eNS_URI);
			if (theRuleModelFactory != null) {
				return theRuleModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuleModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleModelFactoryImpl() {
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
			case RuleModelPackage.RULE_CATALOG: return createRuleCatalog();
			case RuleModelPackage.RULE: return createRule();
			case RuleModelPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case RuleModelPackage.ACTION_DEFINITION: return createActionDefinition();
			case RuleModelPackage.LOGIC_CONDITION: return createLogicCondition();
			case RuleModelPackage.BASE_CONDITION: return createBaseCondition();
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
			case RuleModelPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case RuleModelPackage.LOGIC_CONDITION_TYPE:
				return createLogicConditionTypeFromString(eDataType, initialValue);
			case RuleModelPackage.BASE_CONDITION_TYPE:
				return createBaseConditionTypeFromString(eDataType, initialValue);
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
			case RuleModelPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case RuleModelPackage.LOGIC_CONDITION_TYPE:
				return convertLogicConditionTypeToString(eDataType, instanceValue);
			case RuleModelPackage.BASE_CONDITION_TYPE:
				return convertBaseConditionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCatalog createRuleCatalog() {
		RuleCatalogImpl ruleCatalog = new RuleCatalogImpl();
		return ruleCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition createActionDefinition() {
		ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicCondition createLogicCondition() {
		LogicConditionImpl logicCondition = new LogicConditionImpl();
		return logicCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCondition createBaseCondition() {
		BaseConditionImpl baseCondition = new BaseConditionImpl();
		return baseCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicConditionType createLogicConditionTypeFromString(EDataType eDataType, String initialValue) {
		LogicConditionType result = LogicConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseConditionType createBaseConditionTypeFromString(EDataType eDataType, String initialValue) {
		BaseConditionType result = BaseConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleModelPackage getRuleModelPackage() {
		return (RuleModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuleModelPackage getPackage() {
		return RuleModelPackage.eINSTANCE;
	}

} //RuleModelFactoryImpl

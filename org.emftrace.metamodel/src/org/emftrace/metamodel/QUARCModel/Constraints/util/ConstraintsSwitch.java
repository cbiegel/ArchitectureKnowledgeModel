/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.QUARCModel.Constraints.*;

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
 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage
 * @generated
 */
public class ConstraintsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConstraintsPackage.eINSTANCE;
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
			case ConstraintsPackage.CONSTRAINTS_BASE: {
				ConstraintsBase constraintsBase = (ConstraintsBase)theEObject;
				T result = caseConstraintsBase(constraintsBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.TECHNICAL_PROPERTY: {
				TechnicalProperty technicalProperty = (TechnicalProperty)theEObject;
				T result = caseTechnicalProperty(technicalProperty);
				if (result == null) result = caseConstraintsBase(technicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.LOGIC_CONDITION: {
				LogicCondition logicCondition = (LogicCondition)theEObject;
				T result = caseLogicCondition(logicCondition);
				if (result == null) result = caseConstraintsBase(logicCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.BASE_CONDITION: {
				BaseCondition baseCondition = (BaseCondition)theEObject;
				T result = caseBaseCondition(baseCondition);
				if (result == null) result = caseConstraintsBase(baseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.PREDEFINED_CONSTRAINT_SET: {
				PredefinedConstraintSet predefinedConstraintSet = (PredefinedConstraintSet)theEObject;
				T result = casePredefinedConstraintSet(predefinedConstraintSet);
				if (result == null) result = caseConstraintsBase(predefinedConstraintSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseBaseCondition(constraint);
				if (result == null) result = caseConstraintsBase(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.PRECONDITION: {
				Precondition precondition = (Precondition)theEObject;
				T result = casePrecondition(precondition);
				if (result == null) result = caseLogicCondition(precondition);
				if (result == null) result = caseConstraintsBase(precondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.STRING_TECHNICAL_PROPERTY: {
				StringTechnicalProperty stringTechnicalProperty = (StringTechnicalProperty)theEObject;
				T result = caseStringTechnicalProperty(stringTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(stringTechnicalProperty);
				if (result == null) result = caseConstraintsBase(stringTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.INTEGER_TECHNICAL_PROPERTY: {
				IntegerTechnicalProperty integerTechnicalProperty = (IntegerTechnicalProperty)theEObject;
				T result = caseIntegerTechnicalProperty(integerTechnicalProperty);
				if (result == null) result = caseNumericalTechnicalProperty(integerTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(integerTechnicalProperty);
				if (result == null) result = caseConstraintsBase(integerTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.BOOLEAN_TECHNICAL_PROPERTY: {
				BooleanTechnicalProperty booleanTechnicalProperty = (BooleanTechnicalProperty)theEObject;
				T result = caseBooleanTechnicalProperty(booleanTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(booleanTechnicalProperty);
				if (result == null) result = caseConstraintsBase(booleanTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FLOAT_TECHNICAL_PROPERTY: {
				FloatTechnicalProperty floatTechnicalProperty = (FloatTechnicalProperty)theEObject;
				T result = caseFloatTechnicalProperty(floatTechnicalProperty);
				if (result == null) result = caseNumericalTechnicalProperty(floatTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(floatTechnicalProperty);
				if (result == null) result = caseConstraintsBase(floatTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.REGULAR_EXPRESSION_TECHNICAL_PROPERTY: {
				RegularExpressionTechnicalProperty regularExpressionTechnicalProperty = (RegularExpressionTechnicalProperty)theEObject;
				T result = caseRegularExpressionTechnicalProperty(regularExpressionTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(regularExpressionTechnicalProperty);
				if (result == null) result = caseConstraintsBase(regularExpressionTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.ENUM_TECHNICAL_PROPERTY: {
				EnumTechnicalProperty enumTechnicalProperty = (EnumTechnicalProperty)theEObject;
				T result = caseEnumTechnicalProperty(enumTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(enumTechnicalProperty);
				if (result == null) result = caseConstraintsBase(enumTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.NUMERICAL_TECHNICAL_PROPERTY: {
				NumericalTechnicalProperty numericalTechnicalProperty = (NumericalTechnicalProperty)theEObject;
				T result = caseNumericalTechnicalProperty(numericalTechnicalProperty);
				if (result == null) result = caseTechnicalProperty(numericalTechnicalProperty);
				if (result == null) result = caseConstraintsBase(numericalTechnicalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.TECHNICAL_PROPERTIES_CATALOGUE: {
				TechnicalPropertiesCatalogue technicalPropertiesCatalogue = (TechnicalPropertiesCatalogue)theEObject;
				T result = caseTechnicalPropertiesCatalogue(technicalPropertiesCatalogue);
				if (result == null) result = caseConstraintsBase(technicalPropertiesCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.PREDEFINED_CONSTRAINT_SET_CATALOGUE: {
				PredefinedConstraintSetCatalogue predefinedConstraintSetCatalogue = (PredefinedConstraintSetCatalogue)theEObject;
				T result = casePredefinedConstraintSetCatalogue(predefinedConstraintSetCatalogue);
				if (result == null) result = caseConstraintsBase(predefinedConstraintSetCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.TECHNICAL_PROPERTY_CATEGORY: {
				TechnicalPropertyCategory technicalPropertyCategory = (TechnicalPropertyCategory)theEObject;
				T result = caseTechnicalPropertyCategory(technicalPropertyCategory);
				if (result == null) result = caseTechnicalProperty(technicalPropertyCategory);
				if (result == null) result = caseConstraintsBase(technicalPropertyCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseConstraintsBase(ConstraintsBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalProperty(TechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicCondition(LogicCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseCondition(BaseCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Constraint Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Constraint Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedConstraintSet(PredefinedConstraintSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTechnicalProperty(StringTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerTechnicalProperty(IntegerTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanTechnicalProperty(BooleanTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatTechnicalProperty(FloatTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Expression Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Expression Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularExpressionTechnicalProperty(RegularExpressionTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTechnicalProperty(EnumTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Technical Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Technical Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalTechnicalProperty(NumericalTechnicalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Properties Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Properties Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalPropertiesCatalogue(TechnicalPropertiesCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Constraint Set Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Constraint Set Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedConstraintSetCatalogue(PredefinedConstraintSetCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Property Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Property Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalPropertyCategory(TechnicalPropertyCategory object) {
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

} //ConstraintsSwitch

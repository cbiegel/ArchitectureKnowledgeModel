/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 

package org.emftrace.quarc.core.gssquery.preselector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertyCategory;
import org.emftrace.metamodel.QUARCModel.Constraints.ToleranceTypes;




/**
 * Evaluator for a LogicCondition
 * 
 * @author Daniel Motschmann
 *
 */
public class LogicConditionEvaluator {
	

	/**
	 * a Map with Properties and their values
	 */
	private Map<TechnicalProperty, String> assignedProperies;
	private Map<TechnicalProperty, BaseConditionOperators> assignedProperiesOperators;

	/**
	 * the constructor
	 * 
	 * @param assignedConstraints
	 *            a List with assigned Constraints
	 */
	public LogicConditionEvaluator(List<Constraint> assignedConstraints) {

		assignedProperies = new HashMap<TechnicalProperty, String>();
		assignedProperiesOperators = new HashMap<TechnicalProperty, BaseConditionOperators>();
		if (assignedConstraints != null)
			for (Constraint assignedConstraint : assignedConstraints) {
				assignedProperies.put(assignedConstraint.getTechnicalProperty(),
						assignedConstraint.getValue());
				assignedProperiesOperators.put(assignedConstraint.getTechnicalProperty(),
						assignedConstraint.getOperator());
			}
	}

	/**
	 * @param property
	 *            an assigned Property
	 * @return true if Property is contained by the set of the assigned
	 *         Constraints specified by the constructor
	 */
	private boolean propertyIsAssigned(TechnicalProperty property) {
		return assignedProperies.containsKey(property);
	}

	/**
	 * @param property
	 *            an assigned Property
	 * @return the value of the assigned Property
	 */
	private String getPropertyValue(TechnicalProperty property) {
		return assignedProperies.get(property);
	}
	
	/**
	 * @param property
	 *            an assigned Property
	 * @return the value of the assigned Property
	 */
	private BaseConditionOperators getPropertyOperator(TechnicalProperty property) {
		return assignedProperiesOperators.get(property);
	}

	/**
	 * evaluates a pair of LogicalValue on the basis of LogicConditionType
	 * 
	 * @param logicalValueA
	 *            the 1st LogicalValue
	 * @param logicConditionType
	 *            the type of the condition
	 * @param logicalValueB
	 *            a 2nd LogicalValue
	 * @return the result of the evaluation
	 * @throws Exception
	 */
	private LogicConditionResultItem evaluateCondition(LogicConditionResultItem logicalValueA,
			LogicalConnectiveTypes logicConditionType, LogicConditionResultItem logicalValueB) {
		
		Map<TechnicalProperty, Boolean> unassignedConstraints = new HashMap<TechnicalProperty, Boolean>();
		LogicalValues result = LogicalValues.INVALID;
		
		if (logicalValueA != null && logicalValueA.getLogicalResultValue() == LogicalValues.INVALID || logicalValueB != null && logicalValueB.getLogicalResultValue() == LogicalValues.INVALID)
			result = LogicalValues.INVALID;
		else {
			
		switch (logicConditionType.getValue()) {
		case LogicalConnectiveTypes.NOT_VALUE:
			if (logicalValueB != null) {
				 new Exception("logicalValueB must be null").printStackTrace();
				result = LogicalValues.INVALID;
			}

			switch (logicalValueA.getLogicalResultValue().getValue()) {
			case LogicalValues.TRUE_VALUE:
				result = LogicalValues.FALSE;
				break;
			case LogicalValues.FALSE_VALUE:
				result = LogicalValues.TRUE;
				break;
			case LogicalValues.UNDEFINED_VALUE:
				result = LogicalValues.UNDEFINED;
				unassignedConstraints.putAll(logicalValueA.getUnassignedProperties());
				break;
			}
			break;

		case LogicalConnectiveTypes.AND_VALUE:
			switch (logicalValueA.getLogicalResultValue().getValue()) {
			case LogicalValues.TRUE_VALUE:
				result = logicalValueB.getLogicalResultValue();
				if (logicalValueB.getLogicalResultValue() == LogicalValues.UNDEFINED){
					unassignedConstraints.putAll(logicalValueB.getUnassignedProperties());
				}
				break;
			case LogicalValues.FALSE_VALUE:
				result = LogicalValues.FALSE;
				break;
			case LogicalValues.UNDEFINED_VALUE:
				if ( logicalValueB.getLogicalResultValue() == LogicalValues.FALSE)
					result = LogicalValues.FALSE;
				else {
					result =  LogicalValues.UNDEFINED;
					unassignedConstraints.putAll(logicalValueA.getUnassignedProperties());
					if (logicalValueB.getLogicalResultValue() == LogicalValues.UNDEFINED ){
						unassignedConstraints.putAll(logicalValueB.getUnassignedProperties());
						for (Entry<TechnicalProperty, Boolean> entry: unassignedConstraints.entrySet()){
							unassignedConstraints.put(entry.getKey(), false);
						}
					}
				
				}
				break;
			}

			break;
		case LogicalConnectiveTypes.OR_VALUE:
			switch (logicalValueA.getLogicalResultValue().getValue()) {
			case LogicalValues.TRUE_VALUE:
				result = LogicalValues.TRUE;
				break;
			case LogicalValues.FALSE_VALUE:
				result = logicalValueB.getLogicalResultValue();
				if (logicalValueB.getLogicalResultValue() == LogicalValues.UNDEFINED){
					unassignedConstraints.putAll(logicalValueB.getUnassignedProperties());
				}
				break;
			case LogicalValues.UNDEFINED_VALUE:
				if (logicalValueB.getLogicalResultValue() == LogicalValues.TRUE)
						result = LogicalValues.TRUE;
					else {
						result = LogicalValues.UNDEFINED;
						unassignedConstraints.putAll(logicalValueA.getUnassignedProperties());
						if (logicalValueB.getLogicalResultValue() == LogicalValues.UNDEFINED ){
							unassignedConstraints.putAll(logicalValueB.getUnassignedProperties());
						//	for (Entry<Property, Boolean> entry: unassignedConstraints.entrySet())
						//		unassignedConstraints.put(entry.getKey(), false);
							}
					}
				break;
			}

			break;

		case LogicalConnectiveTypes.XOR_VALUE:
			LogicConditionResultItem conditionResultItem = 
			 evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.OR, logicalValueB), LogicalConnectiveTypes.AND,  evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.AND, logicalValueB),LogicalConnectiveTypes.NOT, null ));
			result = conditionResultItem.getLogicalResultValue();
			unassignedConstraints = conditionResultItem.getUnassignedProperties();
			break;
		case LogicalConnectiveTypes.NAND_VALUE:	
			LogicConditionResultItem nandConditionResultItem = 
				evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.AND, logicalValueB),LogicalConnectiveTypes.NOT, null );
			result = nandConditionResultItem.getLogicalResultValue();
			unassignedConstraints = nandConditionResultItem.getUnassignedProperties();
			break;
		case LogicalConnectiveTypes.NOR_VALUE:
			LogicConditionResultItem norConditionResultItem = 
			   evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.OR, logicalValueB),LogicalConnectiveTypes.NOT, null );
			result = norConditionResultItem.getLogicalResultValue();
			unassignedConstraints = norConditionResultItem.getUnassignedProperties();
			break;
		case LogicalConnectiveTypes.IMPLIES_VALUE:
			LogicConditionResultItem impliesConditionResultItem = 
			  evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.NOT, null), LogicalConnectiveTypes.OR, logicalValueB);
			result = impliesConditionResultItem.getLogicalResultValue();
			unassignedConstraints = impliesConditionResultItem.getUnassignedProperties();
			break;
		case LogicalConnectiveTypes.EQUIVALENT_VALUE:
			LogicConditionResultItem equivalentConditionResultItem = 
					 evaluateCondition(evaluateCondition(logicalValueA, LogicalConnectiveTypes.IMPLIES, logicalValueB), LogicalConnectiveTypes.AND,  evaluateCondition(logicalValueB, LogicalConnectiveTypes.IMPLIES, logicalValueA));
			result = equivalentConditionResultItem.getLogicalResultValue();
			unassignedConstraints = equivalentConditionResultItem.getUnassignedProperties();
			break;
		default:
			 new Exception("unknown LogicConditionType "
					+ logicConditionType).printStackTrace();
			 result = LogicalValues.INVALID;
		}
		}

	
		return new LogicConditionResultItem(result, unassignedConstraints);
	}

	/**
	 * evaluates a Precondition
	 * 
	 * @param precondition
	 *            a Precondition
	 * @return the result of the evaluation
	 * @throws Exception
	 */
	public LogicConditionResultItem evaluatePrecondition(Precondition precondition) {
		if (precondition == null
				|| (precondition.getBaseConditions().isEmpty() && precondition
						.getLogicConditions().isEmpty()))
			return new LogicConditionResultItem(LogicalValues.TRUE, new HashMap<TechnicalProperty, Boolean>());
		else
			return evaluateLogicCondition(precondition);
	}

	/**
	 * evaluates a LogicCondition
	 * 
	 * @param logicCondition
	 *            a LogicCondition
	 * @return the result of the evaluation
	 * @throws Exception
	 */
	private LogicConditionResultItem evaluateLogicCondition(LogicCondition logicCondition) {
		LogicalValues result = null;
		Map<TechnicalProperty, Boolean> unassignedConstraints = new HashMap<TechnicalProperty, Boolean>();

		LogicConditionResultItem conditonResult = null;
		switch (logicCondition.getLogicalConnectiveType().getValue()) {

		case LogicalConnectiveTypes.NOT_VALUE:
			int baseConditionsSize = logicCondition.getBaseConditions().size();
			int logicConditionsSize = logicCondition.getLogicConditions()
					.size();

			if (baseConditionsSize > 1 || logicConditionsSize > 1
					|| (baseConditionsSize == 1 && logicConditionsSize == 1)) {
				 new Exception("invalid Not LogicCondition "
						+ logicCondition).printStackTrace();
					result = LogicalValues.INVALID;
				
			}  else {
			if (baseConditionsSize == 1)
				conditonResult = evaluateBaseCondition(logicCondition
						.getBaseConditions().get(0));
			else
				conditonResult = evaluateLogicCondition(logicCondition
						.getLogicConditions().get(0));

			switch (conditonResult.getLogicalResultValue().getValue()) {
			case LogicalValues.TRUE_VALUE:
				result = LogicalValues.FALSE;
				unassignedConstraints.clear();
				break;
			case LogicalValues.FALSE_VALUE:
				result = LogicalValues.TRUE;
				unassignedConstraints.clear();
				break;
			default:
				result = LogicalValues.UNDEFINED;
				unassignedConstraints.putAll(conditonResult.getUnassignedProperties());
				break;
			}
			}
			break;
		default:

			for (BaseCondition condition : logicCondition.getBaseConditions())
				if (conditonResult == null) // is 1st condition
					conditonResult = evaluateBaseCondition(condition);
				else
					conditonResult = evaluateCondition(conditonResult,
							logicCondition.getLogicalConnectiveType(),
							evaluateBaseCondition(condition));

			for (LogicCondition condition : logicCondition.getLogicConditions())
				if (conditonResult == null) // is 1st condition
					conditonResult = evaluateLogicCondition(condition);
				else
					conditonResult = evaluateCondition(conditonResult,
							logicCondition.getLogicalConnectiveType(),
							evaluateLogicCondition(condition));
					
			result = conditonResult.getLogicalResultValue();
			unassignedConstraints.putAll(conditonResult.getUnassignedProperties());
			break;
		}

		return new LogicConditionResultItem(result, unassignedConstraints);
	}

	/**
	 * evaluates a BaseCondition
	 * 
	 * @param baseCondtion
	 *            a BaseCondition
	 * @return the result of the evaluation
	 * @throws Exception
	 */
	private LogicConditionResultItem evaluateBaseCondition(BaseCondition baseCondtion) {

		LogicalValues result = LogicalValues.UNDEFINED;
		Map<TechnicalProperty, Boolean> unassignedConstraints = new HashMap<TechnicalProperty, Boolean>();
		TechnicalProperty property = baseCondtion.getTechnicalProperty();
		if (property instanceof TechnicalPropertyCategory) {
			 new Exception("assigned property must not be a TechnicalPropertyCategory ("+ baseCondtion+ ")").printStackTrace();
			 result = LogicalValues.INVALID;
		} else {
		String constraintStringValue = getPropertyValue(property);
		BaseConditionOperators constraintOperator = getPropertyOperator(property);
		String conditionStringValue = baseCondtion.getValue();
		if (propertyIsAssigned(property))
			if  (baseCondtion.getTechnicalProperty() instanceof BooleanTechnicalProperty) {
				switch (baseCondtion.getOperator().getValue()) {
				case BaseConditionOperators.EQUALS_VALUE:
					if (!(constraintStringValue.equals("false") || constraintStringValue.equals("true"))) {
					   new Exception("invalid constraint value ("+ constraintStringValue +")").printStackTrace();
					   result = LogicalValues.INVALID;
					} else
					if (!(conditionStringValue.equals("false")|| conditionStringValue.equals("true"))) {
						new Exception("invalid condition value ("+ conditionStringValue +")").printStackTrace();
						result = LogicalValues.INVALID;
					} else {
					
					Boolean constraintBooleanValue = Boolean.parseBoolean(constraintStringValue);
					Boolean conditionBooleanValue = Boolean.parseBoolean(conditionStringValue);
					result = constraintBooleanValue == conditionBooleanValue ? LogicalValues.TRUE
							: LogicalValues.FALSE;
					}
					break;
				default:
					new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}
			}
			else if  (baseCondtion.getTechnicalProperty() instanceof FloatTechnicalProperty) {


				Float constraintFloatValue = Float
						.parseFloat(constraintStringValue);
				Float conditionFloatValue = Float
						.parseFloat(conditionStringValue);
				switch (baseCondtion.getOperator().getValue()) {

				case BaseConditionOperators.EQUALS_VALUE:
				//todo do evaluation by including constraint operator
					
					switch (constraintOperator.getValue()) {
					case BaseConditionOperators.EQUALS_VALUE:
						if (constraintFloatValue.equals(conditionFloatValue))
							result = LogicalValues.TRUE;
						else
							result = LogicalValues.FALSE;
						break;
					default:
						new Exception("invalid constraint operator "
								+ constraintOperator
								+ " for "
								+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
						result = LogicalValues.INVALID;
				
					}
					break;
				case BaseConditionOperators.GREATER_THAN_VALUE:
					if (constraintFloatValue > conditionFloatValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.LESS_THAN_VALUE:
					if (constraintFloatValue < conditionFloatValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.MAXIMAL_VALUE:
					if (constraintFloatValue <= conditionFloatValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.MINIMAL_VALUE:
					if (constraintFloatValue >= conditionFloatValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
					
				case BaseConditionOperators.APPROXIMATELY_EQUALS_VALUE:
					float toleranceFloatValue = Float.parseFloat(baseCondtion.getTolerance());
					
					if (baseCondtion.getToleranceType().getValue() == ToleranceTypes.ABSOLUTE_VALUE) {
				
					if (constraintFloatValue >= conditionFloatValue - toleranceFloatValue && constraintFloatValue <= conditionFloatValue +toleranceFloatValue )
						result = LogicalValues.TRUE;
				else
					result = LogicalValues.FALSE;
				} else if (baseCondtion.getToleranceType().getValue() == ToleranceTypes.RELATIVE_VALUE) {
					if (constraintFloatValue >= conditionFloatValue - conditionFloatValue*toleranceFloatValue& constraintFloatValue <= conditionFloatValue + conditionFloatValue*toleranceFloatValue )
						result = LogicalValues.TRUE;
				else
					result = LogicalValues.FALSE;
				}  else  { new Exception("unknown toleranceType "
								+ baseCondtion.getToleranceType()
								+ " for "
								+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}
					break;

				default:
					 new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
						result = LogicalValues.INVALID;
				}
			}
			else if  (baseCondtion.getTechnicalProperty() instanceof IntegerTechnicalProperty) {

				Integer constraintIntValue = Integer
						.parseInt(constraintStringValue);
				Integer conditionIntValue = Integer
						.parseInt(conditionStringValue);
				switch (baseCondtion.getOperator().getValue()) {

				case BaseConditionOperators.EQUALS_VALUE:

					if (constraintIntValue == conditionIntValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
				case BaseConditionOperators.GREATER_THAN_VALUE:
					if (constraintIntValue > conditionIntValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.LESS_THAN_VALUE:
					if (constraintIntValue < conditionIntValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.MAXIMAL_VALUE:
					if (constraintIntValue <= conditionIntValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;

				case BaseConditionOperators.MINIMAL_VALUE:
					if (constraintIntValue >= conditionIntValue)
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
					
				case BaseConditionOperators.APPROXIMATELY_EQUALS_VALUE:
				
					float toleranceFloatValue = Float.parseFloat(baseCondtion.getTolerance());
					
					if (baseCondtion.getToleranceType().getValue() == ToleranceTypes.ABSOLUTE_VALUE) {
						if (constraintIntValue >= conditionIntValue - toleranceFloatValue && constraintIntValue <= conditionIntValue + toleranceFloatValue )
								result = LogicalValues.TRUE;
						else
							result = LogicalValues.FALSE;
						} else if (baseCondtion.getToleranceType().getValue() == ToleranceTypes.RELATIVE_VALUE) {
							if (constraintIntValue >= conditionIntValue - conditionIntValue*toleranceFloatValue && constraintIntValue <= conditionIntValue + conditionIntValue*toleranceFloatValue )
								result = LogicalValues.TRUE;
						else
							result = LogicalValues.FALSE;
						} else { 	new Exception("unknown toleranceType "
								+ baseCondtion.getToleranceType()
								+ " for "
								+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
						}
					break;
					
			

				default:
					new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}

			}
			else if  (baseCondtion.getTechnicalProperty() instanceof StringTechnicalProperty) {
				switch (baseCondtion.getOperator().getValue()) {
				case BaseConditionOperators.EQUALS_VALUE:
					if (constraintStringValue.equals(conditionStringValue))
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
				case BaseConditionOperators.EQUALS_IGNORE_CASE_VALUE:
					if (constraintStringValue.equalsIgnoreCase(conditionStringValue))
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
				default:
					 new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}
			}
				
			else if  (baseCondtion.getTechnicalProperty() instanceof RegularExpressionTechnicalProperty) {
				switch (baseCondtion.getOperator().getValue()) {
				case BaseConditionOperators.MATCHES_VALUE:
					if (constraintStringValue.matches(conditionStringValue))
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
				default:
					new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}
			}
			else if  (baseCondtion.getTechnicalProperty() instanceof EnumTechnicalProperty) {
				switch (baseCondtion.getOperator().getValue()) {
				case BaseConditionOperators.EQUALS_VALUE:
					if (constraintStringValue.equals(conditionStringValue))
						result = LogicalValues.TRUE;
					else
						result = LogicalValues.FALSE;
					break;
				default:
					new Exception("invalid operator "
							+ baseCondtion.getOperator()
							+ " for "
							+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
				}
				
			}
			else {
				 new Exception("no rule found for type "
						+ baseCondtion.getTechnicalProperty().getClass().getName()).printStackTrace();
					result = LogicalValues.INVALID;
			}
		else{
			result = LogicalValues.UNDEFINED;
			unassignedConstraints.put(property, true);
		}
		}
		return new LogicConditionResultItem(result, unassignedConstraints);
	}

}

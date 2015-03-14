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

package org.emftrace.quarc.core.helpers;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.quarc.core.cache.CacheManager;



/**
 * 
 * helper to find preconditions of an Element
 * @author Daniel
 *
 */
public class PreconditionFinder {

	/**
	 * finds all Preconditons of parents 
	 * @param element an Element
	 * @param cacheManager a CacheManager
	 * @return all Preconditons of parents as string
	 */
	public static String getRequirementsFromParent(Element element,
			CacheManager cacheManager) {
		String result = "";
		List<Relation> outgoingRelations = new ArrayList<Relation>();
		if (cacheManager.isApplicableElement(element)) {
		outgoingRelations.addAll(cacheManager
				.getApplicableOutgoingDecompositionRelations(element));
		outgoingRelations.addAll(cacheManager
				.getApplicableOutgoingImpactRelations(element));
		outgoingRelations.addAll(cacheManager
				.getApplicableOutgoingOffsetRelations(element));
		outgoingRelations.addAll(cacheManager
				.getApplicableIncomingIsARelations(element));
		}
		int size = outgoingRelations.size();
		int i = 0;
		for (Relation relation : outgoingRelations) {

			Element parentElement = cacheManager.getTargetOfRelation(relation);
			if (parentElement instanceof ConstrainedElement) {
				Precondition precondition = ((ConstrainedElement) parentElement)
						.getPrecondition();
				if (precondition != null)
				result += formatConditionString(precondition);

				i++;
				if (i < size)
					result += " or ";
			} else {
				i++;
			}
			result += getRequirementsFromParent(parentElement, cacheManager);
		}
		return result;
	}



	/**
	 * formats a precondition (LogicCondition)
	 * @param condition a Precondition
	 * @return
	 */
	public static String formatConditionString(LogicCondition condition) {
		if (condition == null)
			return "";
		String result = "";
		if (condition.getLogicalConnectiveType() == LogicalConnectiveTypes.NOT)
			result = "not (";
		else
			result = "(";
		int size = condition.getBaseConditions().size()
				+ condition.getLogicConditions().size();
		int i = 0;
		for (BaseCondition baseCondition : condition.getBaseConditions()) {
			result += " " + baseCondition.getTechnicalProperty().getName();
			result += " " + baseCondition.getOperator().getLiteral();
			result += " " + baseCondition.getValue();
			i++;
			if (i < size)
				result += " "
						+ condition.getLogicalConnectiveType().getLiteral();

		}

		for (LogicCondition logicCondition : condition.getLogicConditions()) {

			result += " " + formatConditionString(logicCondition);

			i++;
			if (i < size)
				result += " "
						+ condition.getLogicalConnectiveType().getLiteral();
		}
		result += " )";
		return result;
	}
}

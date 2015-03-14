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

import java.util.Map;

import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;


/**
 * An Item for the Result of a LogicCondition<br>
 * Contains the logical result and a List with unassigned properties
 * 
 * @author Daniel Motschmann
 *
 */
public class LogicConditionResultItem {
	private Map<TechnicalProperty, Boolean> unassignedProperties;
	private LogicalValues logicalResultValue;
	
	/**
	 * 
	 * the constructor
	 * 
	 * @param logicalResultValue a LogicalValues
	 * @param unassignedProperties a list with unassigned properties
	 */
	public LogicConditionResultItem(LogicalValues logicalResultValue, Map<TechnicalProperty, Boolean> unassignedProperties){
		this.setLogicalResultValue(logicalResultValue);
		this.setUnassignedProperties(unassignedProperties);
	}

	/**
	 * @return the logicalResultValue
	 */
	public LogicalValues getLogicalResultValue() {
		return logicalResultValue;
	}

	/**
	 * @param logicalResultValue the logicalResultValue to set
	 */
	public void setLogicalResultValue(LogicalValues logicalResultValue) {
		this.logicalResultValue = logicalResultValue;
	}

	/**
	 * @return the unassignedProperties
	 */
	public Map<TechnicalProperty, Boolean> getUnassignedProperties() {
		return unassignedProperties;
	}

	/**
	 * @param unassignedProperties the unassignedProperties to set
	 */
	public void setUnassignedProperties(Map<TechnicalProperty, Boolean> unassignedProperties) {
		this.unassignedProperties = unassignedProperties;
	}
	
}

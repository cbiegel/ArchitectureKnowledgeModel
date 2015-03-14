/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.reportmanager;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.ITraceComponent;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.ViolationType;

/**
 * This is the interface for the EMFTrace-ReportManager, based upon the {@link ITraceComponent TraceComponent}.
 * It is responsible for creating, deleting and validating both {@link ImpactReport impact report} and {@link ConsistenceReport consistence reports}.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public interface IReportManager extends ITraceComponent
{
	/**
	 * Creates a new {@link ImpactReport}
	 * 
	 * @param project the current project
	 * @param source the changed element causing the impact
	 * @param affectedModel the impacted element
	 * @param changeType the type of change applied on the source element
	 * @param creator the creator of the report
	 * @param description a description
	 * @param solution a possible solution to resolve the impact
	 * 
	 * @return the created impact report
	 */
	public ImpactReport createImpactReport(ECPProject project, List<EObject> sources, List<EObject> affectedModels, AbstractChangeType changeType, String creator, String description, String solution, boolean saveToEMFStore);
	
	/**
	 * Creates a new {@link ConsistenceReport}
	 * 
	 * @param project the current project
	 * @param model the model which has a design flaw
	 * @param violatioType the type of violation / flaw
	 * @param creator the creator of the report
	 * @param description a description
	 * @param solution a possible solution to fix the flaw / bad smell
	 * 
	 * @return the created consistency report
	 */
	public ConsistenceReport createConsistenceReport(ECPProject project, EObject model, ViolationType violationType, String creator, String description, String solution);
	
	/**
	 * Checks whether a certain {@link ImpactReport} already exists. It doesn't check the Id only, but all the report data to 
	 * identify true duplicates as well.
	 * 
	 * @param project the current project
	 * @param source the changed element causing the impact
	 * @param affectedModel the impacted element
	 * @param changeType the type of change applied on the source element
	 * @return true if the same report already exists
	 */
	public boolean checkIfImpactReportAlreadyExists(ECPProject project, List<EObject> sources, List<EObject> affectedModels, AbstractChangeType changeType);
	
	/**
	 * Checks whether a certain {@link ConsistenceReport} already exists. It doesn't check the Id only, but all the report data to 
	 * identify true duplicates as well.
	 * 
	 * @param project the current project
	 * @param model the model which has a design flaw
	 * @param typeOfViolation the type of violation / flaw
	 * @return true if the same report already exists
	 */
	public boolean checkIfConsistenceReportAlreadyExists(ECPProject project, EObject model, ViolationType violationType);	
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.impactanalyzer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.tracecomponent.ITraceComponent;

/**
 * An interface for an impact analysis component offering basic functions
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public interface IImpactAnalyzer extends ITraceComponent 
{
    /**
     * Registers a new {@link ReportManager} 
     *
     * @param reportMgr the current used ReportManager-instance
     */
	public void registerReportManager(ReportManager reportMgr);
	
    /**
     * De-registers the current used {@link ReportManager}
     */
	public void disconnectReportManager();
	
	/**
	 * Performs the actual impact analysis. Override this method for concrete algorithms. It returns the size of the 
	 * computed impact set.
	 * 
	 * @param project                   the current project
	 * @param startingImpactSet         the originally changed model
	 * @param createIndividualReports   whether single impact reports shall be created
	 * @param createComprehensiveReport whether one comprehensive report shall be created
	 * @return the size of the computed impact set
	 */
	public int performImpactAnalysis(ECPProject project, List<EObject> startingImpactSet, boolean createIndividualReports, boolean createComprehensiveReport);
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.impactanalyzer;

import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.tracecomponent.TraceComponent;

/**
 * Provides a base class for impact analyzers with some utility functions
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public abstract class AbstractImpactAnalyzer extends TraceComponent implements IImpactAnalyzer 
{
	/**
	 * The current {@link ReportManager}-instance 
	 */
	protected ReportManager reportManager;
	
	/**
	 * Constructor
	 */
	public AbstractImpactAnalyzer(String name)
	{
		super(name);
		
		reportManager = null;
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void registerReportManager(ReportManager reportMgr)
	{
		reportManager = reportMgr;
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void disconnectReportManager() 
	{
		reportManager = null;
	}
}

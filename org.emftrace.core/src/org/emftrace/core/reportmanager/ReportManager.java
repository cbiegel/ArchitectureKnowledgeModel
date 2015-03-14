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
import org.emftrace.core.tracecomponent.TraceComponent;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.Report;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.ReportModel.ReportType;
import org.emftrace.metamodel.ReportModel.ViolationType;

/**
 * @author Steffen Lehnert
 * @version 1.0
 */
public class ReportManager extends TraceComponent implements IReportManager
{
	/**
	 * Constructor
	 */
	public ReportManager()
	{
		super("ReportManager");
	}
	
    ///////////////////////////////////////////////////////////////////////////

	public ImpactReport createImpactReport(ECPProject project, List<EObject> sources, List<EObject> affectedModels, AbstractChangeType changeType, String creator, String description, String solution, boolean saveToEMFStore) 
	{
		if( project        == null   ) return null;
		if( sources        == null   ) return null;
		if( affectedModels == null   ) return null;
		if( sources.isEmpty()        ) return null;
		if( affectedModels.isEmpty() ) return null;
		
		ImpactReport report = ReportModelFactory.eINSTANCE.createImpactReport();
		
		ReportContainer container = null;    
               
        if( saveToEMFStore )
        {
            List<EObject> helper    = accessLayer.getElements(project, "ReportContainer");
            if( helper.isEmpty() )          
            {
                container = ReportModelFactory.eINSTANCE.createReportContainer();
                accessLayer.addElement(project, container);
            }
            else container = (ReportContainer)helper.get(0);
            
        	accessLayer.addElement(project, report);
        	container.getReports().add(report);
        }
                
        report.getImpactSources().addAll(sources);
        report.getAffectedElements().addAll(affectedModels);
        report.setType(ReportType.IMPACT);

        if( changeType  != null ) report.setChangeType(changeType);
        if( creator     != null ) report.setDetectedBy(creator);
        if( description != null ) report.setDescription(description);
        if( solution    != null ) report.setSolution(solution);
        
        return report;
	}

    ///////////////////////////////////////////////////////////////////////////
	
	public ConsistenceReport createConsistenceReport(ECPProject project, EObject model, ViolationType violationType, String creator, String description, String solution)
	{	
		if( project       == null ) return null;
		if( model         == null ) return null;
		if( violationType == null ) return null;
		
		ReportContainer container = null;        
        List<EObject> helper    = accessLayer.getElements(project, "ReportContainer");
        if( helper.isEmpty() )          
        {
            container = ReportModelFactory.eINSTANCE.createReportContainer();
            accessLayer.addElement(project, container);
        }
        else container = (ReportContainer)helper.get(0);
        
        ConsistenceReport report = ReportModelFactory.eINSTANCE.createConsistenceReport();     
               
        accessLayer.addElement(project, report);
        
        container.getReports().add(report);
        
        report.setElement(model);
        report.setTypeOfViolation(violationType);
        report.setType(ReportType.VIOLATION);
        
        if( creator     != null ) report.setDetectedBy(creator);
        if( description != null ) report.setDescription(description);
        if( solution    != null ) report.setSolution(solution);
        
        return report;
	}
	
    ///////////////////////////////////////////////////////////////////////////

	public boolean checkIfImpactReportAlreadyExists(ECPProject project, List<EObject> sources, List<EObject> affectedModels, AbstractChangeType changeType) 
	{
        List<EObject> helper = accessLayer.getElements(project, "ReportContainer");
        if( helper.isEmpty() ) return false;
        
        ReportContainer container = (ReportContainer)helper.get(0);
        
        for(int i = 0; i < container.getReports().size(); i++)
        {
        	Report report = container.getReports().get(i);
        	
        	if( !(report instanceof ImpactReport)     ) continue;
        	if( report.getType() == null              ) continue;
        	if( report.getType() != ReportType.IMPACT ) continue;
        	
        	if( ((ImpactReport) report).getChangeType() != changeType ) continue;
        	
        	List<EObject> srcs = ((ImpactReport) report).getImpactSources();
        	List<EObject> targets = ((ImpactReport) report).getAffectedElements();
        	
        	if( sources.size()        != srcs.size()    || !sources.containsAll(srcs)           ) continue;
        	if( affectedModels.size() != targets.size() || !affectedModels.containsAll(targets) ) continue;        	
        	
        	return true;
        }
        
		return false;
	}
	
    ///////////////////////////////////////////////////////////////////////////

	public boolean checkIfConsistenceReportAlreadyExists(ECPProject project, EObject model, ViolationType violationType) 
	{
        List<EObject> helper = accessLayer.getElements(project, "ReportContainer");
        if( helper.isEmpty() ) return false;
        
        ReportContainer container = (ReportContainer)helper.get(0);
        
        for(int i = 0; i < container.getReports().size(); i++)
        {
        	Report report = container.getReports().get(i);
        	
        	if( !(report instanceof ConsistenceReport) ) continue;
        	if( report.getType() == null               ) continue;
        	if( report.getType() == ReportType.IMPACT  ) continue;
        	
        	if( ((ConsistenceReport) report).getElement()         != model         ) continue;
        	if( ((ConsistenceReport) report).getTypeOfViolation() != violationType ) continue;
        	
        	return true;
        }
        
		return false;
	}
}
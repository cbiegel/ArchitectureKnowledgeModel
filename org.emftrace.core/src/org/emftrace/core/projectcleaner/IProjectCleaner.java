/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.projectcleaner;

import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.ITraceComponent;


/**
 * This is the interface for the EMFTrace-ProjectCleaner, based upon the {@link ITraceComponent TraceComponent}.
 * It is responsible for updating the names of rule- and type-catalogs as well as for grouping single rules
 * and types in a new orphan catalog.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public interface IProjectCleaner extends ITraceComponent
{
    /**
     * Cleans the entire {@link ECPProject project}.
     * 
     * @param project the current project
     */
    public void cleanUpProject(ECPProject project);
    
    /**
     * Searches for {@link Rule rules} that do not belong to any {@link RuleCatalog catalog}.
     * If such rules are found, a new catalog will be created and all orphaned rules will be
     * grouped in this catalog.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void cleanUpRuleOrphans(ECPProject project);
    
    /**
     * Searches for {@link LinkType link-types} that do not belong to any {@link LinkTypeCatalog catalog}.
     * If such types are found, a new catalog will be created and all orphaned types will be
     * grouped in this catalog.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void cleanUpLinkTypeOrphans(ECPProject project);
    
    /**
     * Searches for {@link ViolationType violation-types} that do not belong to any {@link ViolationTypeCatalog catalog}.
     * If such types are found, a new catalog will be created and all orphaned types will be
     * grouped in this catalog.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void cleanUpViolationTypeOrphans(ECPProject project);
    
    /**
     * Searches for {@link AbstractChangeType change-types} that do not belong to any {@link ChangeTypeCatalog catalog}.
     * If such types are found, a new catalog will be created and all orphaned types will be
     * grouped in this catalog.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void cleanUpChangeTypeOrphans(ECPProject project);
    
    /**
     * Updates the names of all {@link LinkTypeCatalog link-type catalogs}.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateLinkTypeCatalogs(ECPProject project);
    
    /**
     * Updates the names of all {@link ViolationTypeCatalog violation-type catalogs}.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateViolationTypeCatalogs(ECPProject project);
    
    /**
     * Updates the names of all {@link RuleCatalog rule catalogs}.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateRuleCatalogs(ECPProject project);
    
    /**
     * Updates the names of all {@link ChangeTypeCatalog change type catalogs}.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateChangeTypeCatalogs(ECPProject project);
    
    /**
     * Checks if there are more than one {@link LinkContainer LinkContainer}. If so, they will be merged. If there is none,
     * a new one will be created.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateLinkContainer(ECPProject project);
    
    /**
     * Checks if there are more than one {@link ReportContainer ReportContainer}. If so, they will be merged. If there is none,
     * a new one will be created.
     * 
     * @param project the current {@link ECPProject project}
     */
    public void updateReportContainer(ECPProject project);
}
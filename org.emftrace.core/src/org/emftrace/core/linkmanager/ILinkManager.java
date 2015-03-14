/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.linkmanager;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.ITraceComponent;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * This is the interface for the EMFTrace-LinkManager, based upon the {@link ITraceComponent TraceComponent}.
 * It is responsible for creating, deleting and validating both {@link TraceLink TraceLinks} and {@link Trace Traces}. In addition, it offers
 * methods for editing existing TraceLinks or Traces, especially adding new links to an Trace-instance.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public interface ILinkManager extends ITraceComponent
{
    /**
     * Checks whether all sources/targets have been linked by a certain {@link Rule rule} previously
     *
     * @param project the current project
     * @param sources the list of all sources
     * @param targets the list of all targets
     * @param rule    the name of the rule
     * @param type    the type of the new link
     * @return        the link if it already exists, else null
     */
    public TraceLink checkIfLinkExists(ECPProject project, List<EObject> sources, List<EObject> targets, String rule, LinkType type);
    
    /**
     * Adds a new {@link TraceLink}-object to the {@link ECPProject project}. The link will
     * be of a binary fashion, connecting one source- with one target-{@link LindEnd}.
     * 
     * @param project the current project
     * @param source  the LinkEnd-source
     * @param target  the LinkEnd-target
     * @param creator the creator of this object
     * @param type    the type of the new link
     * @param rule    the name of the rule
     * @return        the new TraceLink
     */
    public TraceLink createLink(ECPProject project, EObject source, EObject target, String creator, LinkType type, String rule);
    
    /**
     * Removes an {@link TraceLink}-object from the {@link ECPProject project}.
     * 
     * @param project the current project
     * @param link    the TraceLink-object
     */
    public void deleteLink(ECPProject project, TraceLink link);
    
    /**
     * Adds a new {@link Trace}-object to the {@link ECPProject project}. It can be an empty object, or if the
     * {@link List list} of {@link TraceLink TraceLinks} ain't empty, a composed link consisting of 
     * several, related links.
     * 
     * @param project    the current project
     * @param traceLinks a list of TraceLink-objects, can be null
     * @param creator    the creator of this object
     * @return           the new Trace
     */
    public Trace createTrace(ECPProject project, List<TraceLink> traceLinks, String creator);
    
    /**
     * Removes an {@link Trace}-object from the {@link ECPProject project}.
     * 
     * @param project the current project
     * @param trace   the Trace-object
     */
    public void deleteTrace(ECPProject project, Trace trace);
    
    /**
     * Validates a {@link TraceLink}-instance. If there is no source- or no target,
     * the link will be removed. It also checks whether the models the LinkEnds point to still
     * exist, if not, they will be removed too.
     * 
     * @param project the current project
     * @param link    the TraceLink
     * @return whether the TraceLink is valid or not 
     */
    public boolean validateLink(ECPProject project, TraceLink link);
    
    /**
     * Validates a {@link Trace}-object. If it is a generated entry (creator = LinkManager) and consists
     * of only one {@link TraceLink}-instance, the Trace-object will be deleted. It also checks whether
     * the contained links are still related. It will remove unrelated links from the Trace and split
     * the Trace into several new Traces if partial relationships have been found.
     * 
     * @param project the current project
     * @param trace   the Trace-object
     * @return whether the Trace is valid or not 
     */
    public boolean validateTrace(ECPProject project, Trace trace);
                
    /**
     * Adds a {@link TraceLink link} to an {@link Trace}-object.
     * 
     * @param project the current project
     * @param trace   the Trace-object
     * @param link    the link that should be added
     */
    public void addToTrace(ECPProject project, Trace trace, TraceLink link);
    
    /**
     * Removes a {@link TraceLink link} from a {@link Trace}-object and validates the Trace-object
     * afterwards to ensure integrity of automatic generated, composed links. If the validation fails,
     * the Trace-object will be deleted if it was created by
     * 
     * @param project  the current project
     * @param trace    the Trace-object
     * @param validate whether the trace should be validated after removing the link
     * @param link     the link that should be removed from the Trace-object
     */
    public void removeFromTrace(ECPProject project, Trace trace, TraceLink link, boolean validate);
    
    /**
     * This method scans the project for transitive relationships between {@link TraceLink links}. If
     * such relations are found, new {@link Trace traces} will be created, containing the related links.
     * 
     * @param project the current project
     */
    public void performTransitivityAnalysis(ECPProject project);
    
    /**
     * Checks whether two {@link TraceLink TraceLinks} share common {@link EObject targets}.
     * 
     * @param link1 the first TraceLink
     * @param link2 the second TraceLink
     * @return true if both links share 1 or more common target
     */
    public boolean checkForDirectRelationship(TraceLink link1, TraceLink link2);
    
    /**
     * Computes possible, transitive connections between a {@link List list} of {@link TraceLink TraceLinks}.
     * It will store its findings as a list of "result-lists". Each "result-list" that contains more than 1 
     * element represents a transitive relation between them and may be turned into an {@link Trace}.
     * 
     * @param links  the list of TraceLink-objects
     * @return a list of possible, transitive Traces 
     */
    public List<List<TraceLink>> checkForIndirectRelationships(List<TraceLink> links);
}

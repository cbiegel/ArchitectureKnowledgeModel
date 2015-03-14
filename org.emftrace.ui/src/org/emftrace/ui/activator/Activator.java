/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.activator;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.impactanalyzer.DistanceBasedImpactAnalyzer;
import org.emftrace.core.impactanalyzer.TypeBasedImpactAnalyzer;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.projectcleaner.ProjectCleaner;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class Activator extends AbstractUIPlugin 
{
    /**
     *  The plug-in ID
     */
    public static final String PLUGIN_ID = "org.emftrace.ui";

    /**
     *  The shared instance
     */
    private static Activator plugin;
    
    /**
     * The instance of the {@link AccessLayer} {@link TraceComponent component}
     */
    private AccessLayer accessLayer;
    
    /**
     * The instance of the {@link LinkManager} {@link TraceComponent component}
     */
    private LinkManager linkManager;
    
    /**
     * The instance of the {@link ReportManager} {@link TraceComponent component}
     */
    private ReportManager reportManager;
    
    /**
     * The instance of the {@link ProjectCleaner} {@link TraceComponent component}
     */
    private ProjectCleaner projectCleaner;
    
    /**
     * The instance of the {@link RuleEngine} {@link TraceComponent component}
     */
    private RuleEngine ruleEngine;
    
    /**
     * The instance of the {@link DistanceBasedImpactAnalyzer} {@link TraceComponent component}
     */
    private DistanceBasedImpactAnalyzer distanceBasedImpactAnalyzer;
    
    /**
     * The instance of the {@link TypeBasedImpactAnalyzer} {@link TraceComponent component}
     */
    private TypeBasedImpactAnalyzer typeBasedImpactAnalyzer;
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * The constructor
     */
    public Activator() 
    {
        accessLayer    = EMFTraceCoreFactory.createAccessLayer();        
        linkManager    = EMFTraceCoreFactory.createLinkManager();
        reportManager  = EMFTraceCoreFactory.createReportManager();
        projectCleaner = EMFTraceCoreFactory.createProjectCleaner();
        ruleEngine     = EMFTraceCoreFactory.createRuleEngine();
        distanceBasedImpactAnalyzer = EMFTraceCoreFactory.createDistanceBasedImpactAnalyzer();
        typeBasedImpactAnalyzer     = EMFTraceCoreFactory.createTypeBasedImpactAnalyzer();
                
        //linkManager.enableLogging(true);
        //reportManager.enableLogging(true);
        //ruleEngine.enableLogging(true);
        //projectCleaner.enableLogging(true);
        //distanceBasedImpactAnalyzer.enableLogging(true);
        linkManager.enableLogging(false);
        reportManager.enableLogging(false);
        ruleEngine.enableLogging(false);
        projectCleaner.enableLogging(false);
        distanceBasedImpactAnalyzer.enableLogging(false);
        
        linkManager.registerAccessLayer(accessLayer);              
        reportManager.registerAccessLayer(accessLayer);
        projectCleaner.registerAccessLayer(accessLayer);        
        ruleEngine.registerAccessLayer(accessLayer);
        distanceBasedImpactAnalyzer.registerAccessLayer(accessLayer);
        typeBasedImpactAnalyzer.registerAccessLayer(accessLayer);
        
        ruleEngine.registerLinkManager(linkManager);
        ruleEngine.registerReportManager(reportManager);
        distanceBasedImpactAnalyzer.registerReportManager(reportManager);
        typeBasedImpactAnalyzer.registerReportManager(reportManager);
        
        typeBasedImpactAnalyzer.registerRuleEngine(ruleEngine);
    }
    
	///////////////////////////////////////////////////////////////////////////

    /**
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
    }

	///////////////////////////////////////////////////////////////////////////
    
    /**
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception 
    {
        plugin = null;
        super.stop(context);
    }
    
	///////////////////////////////////////////////////////////////////////////

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault() 
    {
        return plugin;
    }
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link AccessLayer} used by this plugin
     * 
     * @return the AccessLayer
     */
    public static AccessLayer getAccessLayer()
    {
        return plugin.accessLayer;
    }
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link LinkManager} used by this plugin
     * 
     * @return the LinkManager
     */
    public static LinkManager getLinkManager()
    {
        return plugin.linkManager;
    }
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link ReportManager} used by this plugin
     * 
     * @return the ReportManager
     */
    public static ReportManager getReportManager()
    {
        return plugin.reportManager;
    }
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link ProjectCleaner} used by this plugin
     * 
     * @return the ProjectCleaner
     */
    public static ProjectCleaner getProjectCleaner()
    {
        return plugin.projectCleaner;
    }
    
	///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link RuleEngine} used by this plugin
     * 
     * @return the RuleEngine
     */
    public static RuleEngine getRuleEngine()
    {
        return plugin.ruleEngine;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link DistanceBasedImpactAnalyzer} used by this plugin
     * 
     * @return the distance-based impact analyzer
     */
    public static DistanceBasedImpactAnalyzer getDistanceBasedImpactAnalyzer()
    {
    	return plugin.distanceBasedImpactAnalyzer;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the {@link TypeBasedImpactAnalyzer} used by this plugin
     * 
     * @return the type-based impact analyzer
     */
    public static TypeBasedImpactAnalyzer getTypeBasedImpactAnalyzer()
    {
    	return plugin.typeBasedImpactAnalyzer;
    }
}
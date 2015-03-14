/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.tracecomponent;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.core.accesslayer.IAccessLayer;


/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TraceComponent implements ITraceComponent
{
	/**
	 * Logging component
	 */
	static private Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
    /**
     * A default value for the name, if none is set 
     */    
    private static final String defaultName = "Unnamed TraceComponent";
    
    /**
     * The name of this component
     */
    protected String componentName;
    
    /**
     * The current registered instance of {@link IAccessLayer}
     */
    protected AccessLayer accessLayer;
    
    /**
     * Indicates whether messages will be print into the log
     */
    protected boolean isLoggingEnabled;
    
    ///////////////////////////////////////////////////////////////////////////
        
    /**
     * Constructor
     */
    public TraceComponent()
    {
        componentName = defaultName;
        accessLayer = null;
        isLoggingEnabled = false;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param newname
     */
    public TraceComponent(String newname)
    {
        componentName = newname;
        accessLayer = null; 
        isLoggingEnabled = false;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void disconnectAccessLayer()
    {
        accessLayer = null;
        if( isLoggingEnabled ) printToLog("disconnectAccesslayer", "AccessLayer disconnected...");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void enableLogging(boolean status)
    {
        isLoggingEnabled = status;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public boolean isLoggingEnabled()
    {
        return isLoggingEnabled;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public String getName()
    {
        return componentName;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void printToLog(String method, String msg)
    {
    	if( !isLoggingEnabled ) return;
    	    	
        StringBuffer logEntry = new StringBuffer(Calendar.getInstance().getTime().toString());
        logEntry.append(" - ");
        logEntry.append(componentName);
        logEntry.append(" @");
        logEntry.append(method);
        logEntry.append(": ");
        logEntry.append(msg);
        
        logger.log(Level.INFO, logEntry.toString());
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void printToLog(String msg)
    {
    	if( !isLoggingEnabled ) return;
    	
    	StringBuffer logEntry = new StringBuffer(Calendar.getInstance().getTime().toString());
        logEntry.append(" - ");
        logEntry.append(componentName);
        logEntry.append(": ");
        logEntry.append(msg);
        
        logger.log(Level.INFO, logEntry.toString());
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void registerAccessLayer(AccessLayer accesslayer)
    {
        accessLayer = accesslayer;
        if( isLoggingEnabled ) printToLog("registerAccessLayer", "AccessLayer registered...");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void setName(String newname)
    {
        componentName = newname;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public AccessLayer getAccessLayer()
    {
        return accessLayer;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void printToLog(String method, StringBuffer msg)
    {
    	if( !isLoggingEnabled ) return;
    	
        StringBuffer logEntry = new StringBuffer(Calendar.getInstance().getTime().toString());
        logEntry.append(" - ");
        logEntry.append(componentName);
        logEntry.append(" @");
        logEntry.append(method);
        logEntry.append(": ");
        logEntry.append(msg);
        
        logger.log(Level.INFO, logEntry.toString());
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void printToLog(StringBuffer msg)
    {
    	if( !isLoggingEnabled ) return;
    	
        StringBuffer logEntry = new StringBuffer(Calendar.getInstance().getTime().toString());
        logEntry.append(" - ");
        logEntry.append(componentName);
        logEntry.append(": ");
        logEntry.append(msg);
        
        logger.log(Level.INFO, logEntry.toString());
    }
}

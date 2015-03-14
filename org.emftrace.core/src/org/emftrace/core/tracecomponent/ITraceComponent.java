/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.tracecomponent;

import org.emftrace.core.accesslayer.AccessLayer;

/**
 * This is the interface for a common base class for all components that should be added to EMFTrace.
 * It provides access to the {@link IAccessLayer AccessLayer}-component and several means of logging.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public interface ITraceComponent
{
    /**
     * Registers an instance of {@link IAccessLayer} at the component to gain access to EMFStore
     * 
     * @param accesslayer the new AccessLayer
     */
    public void registerAccessLayer(AccessLayer accesslayer);
    
    /**
     * Disconnects the current registered instance of {@link AccessLayer}
     */
    public void disconnectAccessLayer();
    
    /**
     * Returns the current registered {@link AccessLayer} or null, if there is none
     * 
     * @return the current registered AccessLayer
     */
    public AccessLayer getAccessLayer();
    
    /**
     * Enables or disables this components logging functions
     * 
     * @param status whether to enable or disable logging
     */
    public void enableLogging(boolean status);
    
    /**
     * Returns whether this TraceComponent should keep a log or not
     * 
     * @return whether logging is enabled or disabled
     */
    public boolean isLoggingEnabled();
        
    /**
     * Prints a message into the log. The message will consist of the following:
     * log-msg = component-name + method-name + msg
     * 
     * @param method the name of the method that has been called
     * @param msg    the actual message
     */
    public void printToLog(String method, String msg);
    
    /**
     * Prints a message into the log. The message will consist of the following:
     * log-msg = component-name + method-name + msg
     * 
     * @param method the name of the method that has been called
     * @param msg    the actual message
     */
    public void printToLog(String method, StringBuffer msg);
    
    /**
     * Prints a message into the log. The message will consist of the following:
     * log-msg = component-name + msg
     * 
     * @param msg the actual message
     */
    public void printToLog(String msg);
    
    /**
     * Prints a message into the log. The message will consist of the following:
     * log-msg = component-name + msg
     * 
     * @param msg the actual message
     */
    public void printToLog(StringBuffer msg);    
    
    /**
     * Sets the name for this component
     * 
     * @param newname the new name for this component
     */
    public void setName(String newname);
    
    /**
     *  Returns the name of this component as {@link String}
     * 
     * @return the current name of this component
     */
    public String getName();
}
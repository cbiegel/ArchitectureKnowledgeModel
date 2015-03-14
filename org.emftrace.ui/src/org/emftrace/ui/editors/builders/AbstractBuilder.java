/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.ui.editors.builders;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;
import org.emftrace.core.accesslayer.AccessLayer;

/**
 * The abstract class for all builders
 * 
 * @author  Daniel Motschmann
 * @version 1.0
 */
public abstract class AbstractBuilder {
	
	/**
	 * The AccessLayer member
	 */
	protected AccessLayer accessLayer;
	
	/**
	 * A list with all error messages
	 */
	protected List<String> errorMessageStack;
	
	/**
	 * The constructor
	 * 
	 * @param accessLayer the AccessLayer
	 */
	public AbstractBuilder(AccessLayer accessLayer){
		this.accessLayer = accessLayer;
		this.errorMessageStack = new ArrayList<String>();
	}
	
	/**
	 * adds an error message to the error stack
	 * @param msg the new error message
	 */
	protected void addErrorMessage(String msg){
		errorMessageStack.add(msg);
	}
	
	/**
	 * Build was executed with Errors.
	 * @return true if last build was executed with errors.
	 */
	public boolean wasBuildedWithErrors(){
		return errorMessageStack.size() > 0;
	}
	
	/**
	 *  displays the collected error messages.<br>
	 *  Shows only the 1st 10 messages.<br>
	 *  Only opens MessageDialog if messageStack isn't empty<br>
	 */
	protected void displayErrors(){
		if (errorMessageStack != null || errorMessageStack.size() > 0){
			MessageBox messageBox = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.ICON_ERROR);
			String displayedMessage = "GUI was build with "+ errorMessageStack.size()+" errors :\n";
			int max = 10; //display only10 messages -> 
			int count = 0;
			for (String errorMsg : errorMessageStack){
				displayedMessage += errorMsg+"\n";
				count += 1;
				if (count > max) {
					displayedMessage+= "[...]";
					break;
				}
			}
			messageBox.setMessage(displayedMessage);
			messageBox.open();
			}
		}
	
	/**
	 *  displays the collected error messages
	 */
	protected void clearErrorMessageStack(){
		errorMessageStack.clear();
	}


	/**
	 * Builds the content within the current thread.
	 * 
	 */
	public void build(){
	  try {
	    	clearErrorMessageStack();
	    	doBuild();
		} catch (Exception e) {
			addErrorMessage("Can't build.\n"+e);
			e.printStackTrace();
		}
		if (wasBuildedWithErrors()){
			dispose();
			displayErrors();
		}

	}
		
	/**
	 * Implementation of the task
	 */
	protected abstract void doBuild();
	
	/**
	 * disposes the builder
	 */
	public abstract void dispose();
}

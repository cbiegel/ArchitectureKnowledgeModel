/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor: Daniel Motschmann
 ******************************************************************************/

package org.emftrace.ui.command;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;


/**
 * The abstract class for all commands
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class AbstractCommand {

	/**
	 * The default constructor
	 * @param label the label for a eclipse job
	 */
	public AbstractCommand(String label) {
		this.label = label != null && label != "" ? label : "custom command";
	}
	
	/**
	 * An alternative constructor without specifying a label
	 */
	public AbstractCommand() {
		this(null);
	}

	/**
	 * the label for a job<br>
	 * it will be used by the progress view of eclipse
	 */
	public String label;

	/**
	 * Runs the command as an UnicaseCommand as a Job.<br>
	 * <br>
	 * note:<br>
	 * fired change notifications must be handled within the UI thread or an
	 * UIJob, if SWT widgets will be changed<br>
	 * otherwise SWT blocks access to widgets
	 * 
	 * @see Job
	 */
	public void runAsJob() {
		final AbstractCommand command = this;

		Job job = new Job("executing " + label) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {

				command.run();
				return Status.OK_STATUS;

			}
		};
		job.setPriority(Job.SHORT);
		job.schedule();
	}
	
	/**
	 * Runs the command as an EMFStoreCommand within the current thread<br>
	 */
	public void run() {
		final AbstractCommand abstractCommand = this;
		EMFStoreCommand command = new EMFStoreCommand() {

			@Override
			protected void doRun() {
				abstractCommand.doRun();
			}
		};
		command.run();
	}

	/**
	 * Runs the command as an UnicaseCommand as an own thread.<br>
	 * <br>
	 * hint:<br>
	 * fired change notifications must be handled within the UI thread, if SWT
	 * widgets will be changed<br>
	 * otherwise SWT blocks access
	 * 
	 * @see org.eclipse.swt.widgets.Display.syncExec()<br>
	 *      or<br>
	 * @see org.eclipse.swt.widgets.Display.asyncExec()
	 */
	public void runThreaded() {
		final AbstractCommand abstractCommand = this;
		Thread t = new Thread(new Runnable() {
			public void run() {
				abstractCommand.run();
			}
		});
		t.start();
	}
	
	/**
	 * Don't run the command as an EMFStoreCommand.<br>
	 * For test or nested use only.
	 */
	public void runWithoutUnicaseCommand() {
		this.doRun();
	}

	/**
	 * The implementation of the task for the command.
	 */
	protected abstract void doRun();
}

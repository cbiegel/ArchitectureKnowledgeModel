/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.editors.builders;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;
import org.emftrace.ui.dependencygraph.DependencyGraph;

/**
 * A concrete GUI builder for an Trace
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public class TraceGUIBuilder extends AbstractGUIBuilder
{
	/**
	 * The {@link Trace} for which a {@link DependencyGraph} shall be constructed.
	 */
	private EObject model;
	
	/**
	 * The {@link DependencyGraph} for a {@link Trace}.
	 */
	private DependencyGraph graph;
	
	/**
	 * The {@link ECPProject} containing the model.
	 */
	private ECPProject project;
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param accessLayer     the current {@link AccessLayer}
	 * @param trace           the {@link Trace} for which the GUI is constructed
	 * @param parentComposite the parent Composite
	 */
	public TraceGUIBuilder(AccessLayer accessLayer, EObject newModel, Composite parentComposite, ECPProject newProject)
	{
		super(accessLayer, parentComposite);
		model = newModel;
		project = newProject;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Build the user interface for the {@link Trace}.
	 */
	protected void doBuild() 
	{
		super.doBuild();
		bodyComposite.setLayout(new GridLayout(1, true));
		graph = new DependencyGraph(bodyComposite, SWT.NONE, accessLayer);
		
		if( model instanceof Trace) graph.buildFromTrace((Trace)model);
		else                        graph.buildForModel(model, project, true, true);
	}
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.dependencygraph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;

/**
 * An extension of the Zest edge to display dependencies between nodes
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyGraphEdge extends GraphConnection 
{
	/**
	 * The {@link TraceLink traceability link} which is represented by this edge
	 */
	private TraceLink link;
	
	/**
	 * The list of all {@link ImpactReport impact reports} that are related to the traceability link
	 */
	private List<ImpactReport> impacts;
	
	/**
	 * The menu which appears after right-clicking on the edge
	 */
	private Menu menu;
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor.
	 * 
	 * @param graphModel  the graph this edge belongs to
	 * @param style       some style flags for the edge
	 * @param source      the source node
	 * @param destination the target node
	 * @param link        the actual link
	 */
	public DependencyGraphEdge(Graph graphModel, int style, DependencyGraphNode source, DependencyGraphNode destination, TraceLink newLink) 
	{
		super(graphModel, style, source, destination);
		link = newLink;
		impacts = new ArrayList<ImpactReport>();
		menu = null;
				
		addDefaultMouseListener();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns the actual {@link TraceLink traceability-link} which is represented by this edge
	 * 
	 * @return the actual traceability-link
	 */
	public TraceLink getLink()
	{
		return link;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds a mouse listener
	 */
	private void addDefaultMouseListener() 
	{
		this.getConnectionFigure().addMouseListener( new MouseListener()
		{
			@Override
			public void mouseDoubleClicked(MouseEvent me) 
			{
				EMFTraceModelElementOpener.openStandardEditor(link);
				//ModelOpenHelper.openModel(link);
			}

			@Override
			public void mousePressed(MouseEvent me) 
			{
				//highlight();
			}

			@Override
			public void mouseReleased(MouseEvent me) 
			{
				if( me.button == 3 && menu != null ) // right mouse
				{
			        menu.setVisible(true);
				}
			}				
		});
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates the menu which will appear once the user right-clicked on this node
	 * 
	 * @param list a list of all impacts which are related to this connection
	 */
	public void createMenu(List<ImpactReport> list)
	{
		impacts.clear();
		impacts.addAll(list);		
		menu = new Menu(this.getGraphModel().getShell(), SWT.POP_UP);

		MenuItem item = new MenuItem(menu, SWT.PUSH);
		item.setText("Open traceability link");
		item.addSelectionListener(new SelectionListener() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				EMFTraceModelElementOpener.openStandardEditor(link);
				//ModelOpenHelper.openModel(link);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
			}
		});
		
		for(int i = 0; i < impacts.size(); i++)
		{
			item = new MenuItem(menu, SWT.PUSH);
			item.setText("Open impact report " + (i+1));
			final ImpactReport impact = impacts.get(i);
			item.addSelectionListener(new SelectionListener()
			{
				@Override
				public void widgetSelected(SelectionEvent e)
				{
					EMFTraceModelElementOpener.openStandardEditor(impact);
					//ModelOpenHelper.openModel(impact);
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
				}
			});
		}	
	}
}

/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.dependencygraph;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphNode;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;
import org.emftrace.ui.rules.ImpactAnalysisOperation;
import org.emftrace.ui.wizards.DistanceBasedImpactAnalysisWizard;
import org.emftrace.ui.wizards.TypeBasedImpactAnalysisWizard;

/**
 * An extension of the Zest node to display entities of the dependency graph
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyGraphNode extends GraphNode 
{
	/**
	 * The model which is represented by this node
	 */
	private EObject model;
	
	/**
	 * Determines whether this node is the root/center of a local sub-graph
	 */
	private boolean localRoot;
		
	/**
	 * The center node of the sub-graph this nodes belongs to
	 */
	private DependencyGraphNode parent;
	
	/**
	 * Indicates whether the user can interact with this node, i.e. click on it 
	 */
	private boolean interactive;
	
	/**
	 * The menu which appears after right-clicking on the node
	 */
	private Menu menu;
	
    ///////////////////////////////////////////////////////////////////////////
		
	/**
	 * Constructor
	 * 
	 * @param graph the graph this node belongs to
	 * @param style style flags for the node
	 * @param text  the label of the node
	 * @param model the actual model
	 */
	public DependencyGraphNode(Graph graph, int style, String text, EObject newModel, boolean isRoot, DependencyGraphNode newParent, boolean isInteractive) 
	{
		super(graph, style, text);

		addDefaultMouseListener();
		
		interactive = isInteractive;
		model = newModel;
		localRoot = isRoot;
		parent = newParent;
		
		createMenu();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Return the new parent node, i.e. the center of the subgraph this node belongs to
	 * 
	 * @return the current parent node
	 */
	public DependencyGraphNode getParentNode()
	{
		return parent;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Set the new parent node, i.e. the center of the subgraph this node belongs to
	 * 
	 * @param newParent the new parent node 
	 */
	public void setParentNode(DependencyGraphNode newParent)
	{
		parent = newParent;
	}
	
    ///////////////////////////////////////////////////////////////////////////
		
	/**
	 * Reset all the additional node data
	 */
	public void reset()
	{
		localRoot = false;
		parent = null;
	}
		
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns whether this node is a center of a local sub-graph
	 * 
	 * @return true if it is a center of a sub-graph
	 */
	public boolean isLocalRoot()
	{
		return localRoot;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Declare this node as the center of a sub-graph
	 * 
	 * @param root whether it is a center node or not
	 */
	public void setAsLocalRoot(boolean root)
	{
		localRoot = root;
	}
	
    ///////////////////////////////////////////////////////////////////////////
		
	/**
	 * Get the actual {@link EObject model) represented by this node
	 * 
	 * @return get the actual model
	 */
	public EObject getModel()
	{
		return model;
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds a mouse listener
	 */
	private void addDefaultMouseListener() 
	{
		this.getNodeFigure().addMouseListener( new MouseListener()
		{			
			@Override
			public void mouseDoubleClicked(MouseEvent me) 
			{
				//ModelOpenHelper.openModel(model);
				EMFTraceModelElementOpener.openStandardEditor(model);
			}

			@Override
			public void mousePressed(MouseEvent me) 
			{				
			}

			@Override
			public void mouseReleased(MouseEvent me) 
			{			
				if( !interactive ) return;
						
				DependencyGraph graph = (DependencyGraph)getGraphModel();
				
				if( me.button == 1 ) // left mouse 
				{				
					graph.unhilightNodes();
					graph.reduceToSingleGraph(model);
					graph.buildForModel(model, graph.getProject(), true, true);
					createMenu();
					
					highlight();
				}
				
				if( me.button == 3 ) // right mouse
				{
			        menu.setVisible(true);
				}
			}				
		});
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates the menu which will appear once the user right-clicked on this node
	 */
	private void createMenu()
	{
		menu = new Menu(graph.getShell(), SWT.POP_UP);

		MenuItem item = new MenuItem(menu, SWT.PUSH);
		item.setText("Open Model Element");
		item.addSelectionListener(new SelectionListener() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				//ModelOpenHelper.openModel(model);
				EMFTraceModelElementOpener.openStandardEditor(model);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
			}
		});
		
		if( localRoot )
		{
			item = new MenuItem(menu, SWT.PUSH);
			item.setText("Hide incoming relations");
			item.addSelectionListener(new SelectionListener()
			{
				@Override
				public void widgetSelected(SelectionEvent e) 
				{
					DependencyGraph graph = (DependencyGraph)getGraphModel();					
					graph.deleteAllNodes();
					graph.buildForModel(model, graph.getProject(), false, true);
						
					highlight();
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
				}
			});
			
			item = new MenuItem(menu, SWT.PUSH);
			item.setText("Hide outgoing relations");
			item.addSelectionListener(new SelectionListener()
			{
				@Override
				public void widgetSelected(SelectionEvent e) 
				{
					DependencyGraph graph = (DependencyGraph)getGraphModel();
					graph.deleteAllNodes();
					graph.buildForModel(model, graph.getProject(), true, false);
						
					highlight();
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
				}
			});
			
			item = new MenuItem(menu, SWT.PUSH);
			item.setText("Restore node");
			item.addSelectionListener(new SelectionListener()
			{
				@Override
				public void widgetSelected(SelectionEvent e) 
				{
					DependencyGraph graph = (DependencyGraph)getGraphModel();					
					graph.buildForModel(model, graph.getProject(), true, true);
						
					highlight();
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
				}
			});
		}
	
		item = new MenuItem(menu, SWT.PUSH);
		item.setText("Start Type-based Impact Analysis");
		item.addSelectionListener(new SelectionListener()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				performTypeBasedImpactAnalysis();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
			}
		});
		
		item = new MenuItem(menu, SWT.PUSH);
		item.setText("Start Distance-based Impact Analysis");
		item.addSelectionListener(new SelectionListener()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				performDistanceBasedImpactAnalysis();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
			}
		});
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Starts a type-based impact analysis with this node as the source of change
	 */
	private void performTypeBasedImpactAnalysis()
	{
		DependencyGraph graph = (DependencyGraph)getGraphModel();
		Shell shell = graph.getShell();
		
		Activator.getAccessLayer().invalidateCache(graph.getProject());
				        
        TypeBasedImpactAnalysisWizard wizard = new TypeBasedImpactAnalysisWizard(graph.getProject(), model);
        WizardDialog dialog = new WizardDialog(shell, wizard);
        
        dialog.open();
        
        if( wizard.finishedSuccessfully )
        {       	
        	wizard.selectedModels.add(model);
        	
        	if( wizard.changeTarget != null )
        		wizard.selectedModels.add(wizard.changeTarget);
        	
            ImpactAnalysisOperation op = new ImpactAnalysisOperation(graph.getProject(), wizard.selectedModels, wizard.selectedCatalog, wizard.b1, wizard.b2, true);

            ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
            progressDialog.setCancelable(false);
            try 
            {
				progressDialog.run(true, true, op);
				
				MessageDialog.openInformation(shell, "Impact Analysis completed", op.getSizeOfImpactSet()+" impact reports generated");
			}
            catch (InvocationTargetException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	      	
	        graph.adjustEdgesAfterImpactAnalysis();
        }
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Starts a distance-based impact analysis with this node as the source of change
	 */
	private void performDistanceBasedImpactAnalysis()
	{
		DependencyGraph graph = (DependencyGraph)getGraphModel();
		Shell shell = graph.getShell();
		
		Activator.getAccessLayer().invalidateCache(graph.getProject());
		
        DistanceBasedImpactAnalysisWizard wizard = new DistanceBasedImpactAnalysisWizard();
        WizardDialog dialog = new WizardDialog(shell, wizard);
        
        dialog.open();
		
		List<EObject> startingImpactSet = new ArrayList<EObject>();
		startingImpactSet.add(model);
		
        if( wizard.finishedSuccessfully )
        {       	
            ImpactAnalysisOperation op = new ImpactAnalysisOperation(graph.getProject(), startingImpactSet, null, false, true, false);

            ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
            progressDialog.setCancelable(false);
            try 
            {
				progressDialog.run(true, true, op);
				
				MessageDialog.openInformation(shell, "Impact Analysis completed", op.getSizeOfImpactSet()+" impacted elements found");
			}
            catch (InvocationTargetException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	      	
	        graph.adjustEdgesAfterImpactAnalysis();
        }      
	}
}
/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.wizards.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;
import org.emftrace.ui.activator.Activator;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TreeHelperUtil
{
	public static final int treeControlWidth = 500;
	public static final int treeControlHeight = 200;
	/**
	 * Returns the name of a model
	 * 
	 * @param model the model element
	 * @return the name of the model
	 */
	public static String getName(EObject model)
    {
    	return (model.eClass().getName() + " \"" + Activator.getAccessLayer().getNameOfModel(model) + "\"");
    }
	
	/**
	 * 
	 * @param tree
	 * @param model
	 */
	public static void addToTree(Tree tree, EObject model)
	{
    	TreeItem item = new TreeItem(tree, SWT.NONE);
    	item.setText(TreeHelperUtil.getName(model));        	
    	item.setData(model);
    	
    	scanSubModels(item, model);
	}
	 
    /**
     * Recursively scans models for sub-models to insert them into the tree
     * 
     * @param item  the current model tree
     * @param model the current model
     */
    public static void scanSubModels(TreeItem item, EObject model)
    {
    	java.util.List<EObject> models = Activator.getAccessLayer().getDirectChildren(model);
    	
    	for(int i = 0; i < models.size(); i++)
    	{
    		TreeItem subItem = new TreeItem(item, SWT.NONE);
    		subItem.setText(getName(models.get(i)));
    		subItem.setData(models.get(i));
    		
    		scanSubModels(subItem, models.get(i));
    	}
    }
    
    /**
     * Scans the content of a {@link ChangeTypeCatalog change type catalogue} and prepares the tree layout
     * 
     * @param item      the current root of the subtree created for "catalogue"
     * @param catalogue the which should be scanned
     */
    public static void scanSubCatalogs(TreeItem item, ChangeTypeCatalog catalogue)
    {
    	for(int i = 0; i < catalogue.getChangeTypes().size(); i++)
    	{
    		String name = ((AbstractChangeType) catalogue.getChangeTypes().get(i)).getName();
        	TreeItem subItem = new TreeItem(item, SWT.NONE);
        	subItem.setText(name);
    	}
    	
    	for(int i = 0; i < catalogue.getCluster().size(); i++)
    	{
    		String name = ((ChangeTypeCatalog) catalogue.getCluster().get(i)).getName();
    		TreeItem subItem = new TreeItem(item, SWT.NONE);
    		subItem.setText(name);
    		
    		scanSubCatalogs(subItem, catalogue.getCluster().get(i));
    	}
    }
}

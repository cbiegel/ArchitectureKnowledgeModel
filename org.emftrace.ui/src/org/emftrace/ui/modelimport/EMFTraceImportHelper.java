/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.emf.emfstore.internal.common.CommonUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.util.UIHelper;
import org.emftrace.ui.util.UIHelper.ModelExchangeState;
import org.osgi.framework.Bundle;


/**
 * Handles the import of models into a project.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class EMFTraceImportHelper implements IRunnableWithProgress
{   
	private ECPProject project;
	private String fileName;
	private String fileExtension;
	private String template;
	private Shell  shell;
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param newProject the current {@link  ECPProject project}
	 * @param name       the name of the model
	 * @param extension  the file extension of the model
	 * @param templ      the name of the template
	 */
	EMFTraceImportHelper(final Shell shl, ECPProject newProject, String name, String extension, String templ)
	{
		project = newProject;
		fileName      = name;
		fileExtension = extension;
		template      = templ;
		shell         = shl;
	}
    
    ///////////////////////////////////////////////////////////////////////////
	
    @Override
    public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
    {        
        if( project  == null ) 
        {
            processResult(shell, ModelExchangeState.Project_Missing, false);
            return;
        }
        
        if( fileName  == null ) 
        {
            processResult(shell, ModelExchangeState.File_Missing, false);
            return;
        }
        
        if( template  == null ) 
        {
            processResult(shell, ModelExchangeState.Template_Missing, false);
            return;
        }
        
        if( fileExtension  == null ) 
        {
            processResult(shell, ModelExchangeState.Extension_Missing, false);
            return;
        }
        
        String finalPath = "";
        FileOutputStream file = null;
        
        if( !template.contains(UIHelper.NO_TEMPLATE) )
        {           
	        TransformerFactory tFactory = TransformerFactory.newInstance();
	        Transformer transformer = null;
	        
	        Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	        URL url = bundle.getEntry(template);
	        URL realUrl = null;
	        
			try 
			{
				realUrl = FileLocator.resolve(url);
			} 
			catch (IOException e2) 
			{
				e2.printStackTrace();
			}
			
	        String path = realUrl.getPath();
	        path.replace(" ", "%20");
	            
	        try
	        {
	            transformer = tFactory.newTransformer(new StreamSource(path));
	        }
	        catch (TransformerConfigurationException e1)
	        {
	            e1.printStackTrace();
	            processResult(shell, ModelExchangeState.Transformation_Error, false);
	            return;
	        }
	        try
	        {  
	        	monitor.beginTask("Transforming the input file...",100);
	        	monitor.worked(1);
	            finalPath = finalPath.concat(fileName);
	            finalPath = finalPath.replace(fileExtension, "TEMP"+fileExtension);
	            file = new FileOutputStream(finalPath);
	            transformer.transform(new StreamSource(fileName), new StreamResult(file));
	            monitor.worked(50);
	        }
	        catch (FileNotFoundException e)
	        {
	            e.printStackTrace();
	            processResult(shell, ModelExchangeState.Transformation_Error, false);
	            return;
	        }
	        catch (TransformerException e)
	        {
	            e.printStackTrace();
	            processResult(shell, ModelExchangeState.Transformation_Error, false);
	            return;
	        }          
	        
	        if( finalPath == null || finalPath.equals("") ) 
	        {
	        	processResult(shell, ModelExchangeState.Misc_Error, false);
	        	return;
	        }
        }
        else finalPath = fileName;

        final URI fileURI = URI.createFileURI(finalPath);
        
        // create resource set and resource
        ResourceSet resourceSet = new ResourceSetImpl();

        final Resource resource = resourceSet.getResource(fileURI, true);

    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{  
            	monitor.setTaskName("Importing file...");
                importFile(project, fileURI, resource, monitor);
                monitor.worked(95);
                
                return null;
            }
        };
        
		RunESCommand.run(call);
        
        try
        {
        	monitor.setTaskName("Removing temporary files...");
            if( file != null) file.close();
            if( !template.contains(UIHelper.NO_TEMPLATE) ) new File(finalPath).delete();
            monitor.worked(100);
            processResult(shell, ModelExchangeState.Import_OK, false);
        }
        catch (IOException e)
        {
        	processResult(shell, ModelExchangeState.Misc_Error, false);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Processes the result of the import process and prints out the proper notification.
     * 
     * @param shell the shell for the dialog window
     * @param state the import state
     * @param usePopUp decides whether to open a pop-up or to write to Eclipse console
     * @return the state of the model import
     */
    protected static ModelExchangeState processResult(Shell shell, ModelExchangeState state, boolean usePopUp)
    {
        switch(state)
        {
            case Import_OK : 
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import finished", "The model has been imported properly");
            	else            System.out.println("Import finished: The model has been imported properly");
            	
                break;
            }          
            
            case Transformation_Error :
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import abborted", "An error occured during model transformation. See the Eclipse Log for more details.");
            	else            System.out.println("Import abborted: An error occured during model transformation. See the Eclipse Log for more details.");
            	
                break;
            }
            
            case Template_Missing :
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import abborted", "XSLT-Template missing");
            	else            System.out.println("Import abborted: XSLT-Template missing");
            	
                break;
            }
            
            case Project_Missing :
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import abborted", "Project missing");
            	else            System.out.println("Import abborted: Project missing");
            	
                break;               
            }
            
            case File_Missing :
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import abborted", "No file specified");
            	else            System.out.println("Import abborted: No file specified");
            	
                break;                
            }
            
            case Misc_Error :
            {
            	if( usePopUp )  MessageDialog.openInformation(shell, "Import abborted", "An error occured during the import procedure. See the Eclipse Log for more details.");
            	else            System.out.println("Import abborted:  An error occured during the import procedure. See the Eclipse Log for more details.");
            	
                break;                
            }
		
            default: break;
        }
        
        return state;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Runs the import
     * 
     * @param project  the current project
     * @param fileURI  the URI of the file
     * @param resource the file as resource
     */
    private static void importFile(ECPProject project, final URI fileURI, final Resource resource, final IProgressMonitor monitor) 
    {   	
        try 
        {
            Set<EObject> importElements = validation(resource, monitor);

            if( importElements.size() > 0 )
            {
            	monitor.setTaskName("Adding model elements...");
            	
                int i = 0;
                for( EObject eObject : importElements )
                {
                    runImport(project, fileURI, (EObject) EcoreUtil.copy(eObject), i);
                    monitor.worked(90);
                    i++;
                }
            }
        } 
        catch(RuntimeException e) 
        {
            e.printStackTrace();
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Validates if the EObjects can be imported
     * 
     * @param resource
     * @return
     */
	private static Set<EObject> validation(Resource resource, final IProgressMonitor monitor) 
    {
    	monitor.setTaskName("Validating model elements. Phase 1/3...");
    	
        Set<EObject> childrenSet = new HashSet<EObject>();
        Set<EObject> rootNodes = new HashSet<EObject>();

        EList<EObject> rootContent = resource.getContents();

        for(EObject rootNode : rootContent) 
        {
            TreeIterator<EObject> contents = rootNode.eAllContents();
            // 1. Run: Put all children in set
            while( contents.hasNext() ) 
            {
                EObject content = contents.next();
                if( !(content instanceof EObject) ) continue;
                childrenSet.add(content);
            }
        }        
        
        monitor.worked(60);        
        monitor.setTaskName("Validating model elements. Phase 2/3...");

        // 2. Run: Check if RootNodes are children -> set.contains(RootNode) -- no: RootNode in rootNode-Set -- yes:
        // Drop RootNode, will be imported as a child
        for(EObject rootNode : rootContent) 
        {
            if( !(rootNode instanceof EObject)  ) continue;
            if( !childrenSet.contains(rootNode) ) rootNodes.add(rootNode);
        }
        
        monitor.worked(70);        
        monitor.setTaskName("Validating model elements. Phase 3/3...");

        // 3. Check if RootNodes are SelfContained -- yes: import -- no: error
        Set<EObject> notSelfContained = new HashSet<EObject>();
        for(EObject rootNode : rootNodes) 
        {
            if( !CommonUtil.isSelfContained(rootNode) )
            {
                notSelfContained.add(rootNode);
            }
        }
        rootNodes.removeAll(notSelfContained);
        monitor.worked(75);

        return rootNodes;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Runs the import command.
     * 
     * @param project - the projectSpace where the element should be imported in.
     * @param uri - the uri of the resource.
     * @param element - the modelElement to import.
     * @param resourceIndex - the index of the element inside the eResource.
     */
    private static void runImport(final ECPProject project, final org.eclipse.emf.common.util.URI uri, final EObject element, final int resourceIndex) 
    {
    	project.getContents().add(element);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Return the currently selected {@link EObject}
     * 
     * @param event the current selection event
     * @return the selected EObject
     */
    protected static EObject getSelection(ExecutionEvent event)
    {
        EObject result = null;
        ISelection sel = HandlerUtil.getCurrentSelection(event);
        if (!(sel instanceof IStructuredSelection)) {
            return null;
        }
        IStructuredSelection ssel = (IStructuredSelection) sel;
        if (ssel.isEmpty()) {
            return null;
        }

        Object obj = ssel.getFirstElement();
        if (obj instanceof EObject) {
            result = (EObject) obj;
        }

        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Return a selected {@link EObject}
     *  
     * @param event the current selection event
     * @return the selected EObject
     */
    public static EObject getModelElement(ExecutionEvent event) 
    {
        EObject me = null;

        String partId = HandlerUtil.getActivePartId(event);
        if( partId != null && partId.equals(UIHelper.ECP_EDITOR) ) 
        {
            // extract model element from editor input
            IEditorInput editorInput = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput();
            Object obj = editorInput.getAdapter(EObject.class);
            me = (EObject) obj;
        }
        else 
        {
            // extract model element from current selection in navigator
            EObject eObject = getSelection(event);
            if( eObject == null ) return null;
            me = eObject;
        }

        return me;
    }
}
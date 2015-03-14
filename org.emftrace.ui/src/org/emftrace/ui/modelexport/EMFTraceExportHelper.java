/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.modelexport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.emftrace.ui.activator.Activator;
import org.emftrace.ui.util.UIHelper.ModelExchangeState;
import org.osgi.framework.Bundle;


/**
 * Handles the export of models from a project. The execute-method must be overloaded by subclasses.
 * 
 * This class uses code from EMFStore (org.unicase.navigator.handler.ExportModelHandler)
 * Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public abstract class EMFTraceExportHelper 
{
    /**
     * 
     * @param exportModelElements
     * @param filePath
     * @param fileExtension
     * @param template
     * @return
     * @throws IOException 
     */
    public static ModelExchangeState exportModel(final List<EObject> exportModelElements, String filePath, String fileExtension, String template) throws IOException
    {
        if( filePath            == null ) return ModelExchangeState.File_Missing;
        if( template            == null ) return ModelExchangeState.Template_Missing;
        if( fileExtension       == null ) return ModelExchangeState.Extension_Missing;
        if( exportModelElements == null ) return ModelExchangeState.Model_Missing;
        
        if( exportModelElements.size() > 0 )
        {            
            try
            {
                filePath = filePath.replace(fileExtension, "_TEMP"+fileExtension);
                return runCommand(exportModelElements, filePath, template, fileExtension);
            }
            catch (TransformerConfigurationException e)
            {
                e.printStackTrace();
                return ModelExchangeState.Transformation_Error;
            }
        }
        
        return ModelExchangeState.Export_OK;        
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Runs the actual export command
     * 
     * @param exportModelElements a list of elements to export
     * @param filePath            the path of the file
     * @param template            the XSLT-template that should be used
     * @param extension           the file extension
     * @throws TransformerConfigurationException
     * @throws IOException 
     */
    private static ModelExchangeState runCommand(final List<EObject> exportModelElements, String filePath, String template, String extension) throws TransformerConfigurationException, IOException 
    {
        final URI uri = URI.createFileURI(filePath);

    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{ 
                try 
                {
                    ModelUtil.saveEObjectToResource(exportModelElements, uri);
                }
                catch(IOException e) 
                {
                }
                
                return null;
            }
        };
        
		RunESCommand.run(call);
        
        Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
        URL url = bundle.getEntry(template);
        URL realUrl = FileLocator.resolve(url);
        String path = realUrl.getPath();
        path.replace(" ", "%20");
        
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer(new StreamSource(path));
        try
        {
            String finalPath = "";
            finalPath = finalPath.concat(filePath);
            finalPath = finalPath.replace(("_TEMP" + extension), extension);
            transformer.transform(new StreamSource(filePath), new StreamResult(new FileOutputStream(finalPath)));
            @SuppressWarnings("unused")
            boolean success = new File(filePath).delete();            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return ModelExchangeState.Misc_Error;
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
            return ModelExchangeState.Transformation_Error;
        }
        
        return ModelExchangeState.Export_OK;
    }
}
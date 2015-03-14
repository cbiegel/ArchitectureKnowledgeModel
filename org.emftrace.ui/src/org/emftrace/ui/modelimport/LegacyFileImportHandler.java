package org.emftrace.ui.modelimport;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.emftrace.ui.util.UIHelper;

public class LegacyFileImportHandler extends EMFTraceImportHandler
{
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        FILTER_NAMES   = new String[]{UIHelper.ECM_Filter_Name, UIHelper.XMI_Filter_Name};        
        FILTER_EXTS    = new String[]{UIHelper.ECM_Filter_Extension, UIHelper.XMI_Filter_Extension};        
        TEMPLATE_NAMES = new String[]{UIHelper.NO_TEMPLATE, UIHelper.NO_TEMPLATE};        
        FILE_EXTS      = new String[]{UIHelper.ECM_File_Extension, UIHelper.XMI_File_Extension};
        
        try 
        {
			processImport(event);
		} 
        catch (InvocationTargetException e)
		{
			e.printStackTrace();
		} 
        catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

        return null;
    }
}

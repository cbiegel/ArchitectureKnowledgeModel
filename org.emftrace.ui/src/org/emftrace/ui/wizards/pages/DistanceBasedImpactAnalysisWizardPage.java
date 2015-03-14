/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.emftrace.ui.wizards.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.emftrace.ui.activator.Activator;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DistanceBasedImpactAnalysisWizardPage extends WizardPage 
{
    private Composite container;
    
    private Text distanceEditor;
    
    boolean inputValid;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the current propagation distance as specified by the user
     * 
     * @return the current propagation distance
     */
    public int getPropagationDistance()
    {
    	return Integer.valueOf(distanceEditor.getText()).intValue();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param pageName the name of the page
     */
	public DistanceBasedImpactAnalysisWizardPage(String pageName) 
	{
		super(pageName);
		setControl(distanceEditor);
        inputValid = true;
	}
	
	///////////////////////////////////////////////////////////////////////////

	@Override
	public void createControl(Composite parent) 
	{		
        container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
                
        Label labelN = new Label(container, SWT.NULL);
        labelN.setText("The maximum propagation distance of changes (typically 2):");        
        labelN.setLayoutData(new GridData());  
        
        distanceEditor = new Text(container, SWT.BORDER | SWT.SINGLE);
        distanceEditor.setText("" + Activator.getDistanceBasedImpactAnalyzer().getPropagationDistance());
        distanceEditor.addKeyListener(new KeyListener() 
        {
            @Override
            public void keyPressed(KeyEvent e) 
            {
            }

            @Override
            public void keyReleased(KeyEvent e) 
            {
                try
                {
                    Integer.valueOf(distanceEditor.getText());
                    int val = Integer.valueOf(distanceEditor.getText()).intValue();
                    if( val < 1 ) 
                    {
                        setErrorMessage("Value for parameter \"Propagation Distance\" must be greater than 0");
                        inputValid = false;
                        setPageComplete(inputValid);
                    }
                    else 
                    {
                        inputValid = true;
                        setErrorMessage(null);
                        setPageComplete(inputValid);
                    }
                    
                }
                catch(NumberFormatException exception)
                {
                    setErrorMessage("Integer value expected for parameter \"Propagation Distance\"");
                    inputValid = false;
                    setPageComplete(inputValid);
                }
            }
        });

        distanceEditor.setLayoutData(new GridData(50, 20));
        
		setControl(container);
        setPageComplete(true);
	}
}

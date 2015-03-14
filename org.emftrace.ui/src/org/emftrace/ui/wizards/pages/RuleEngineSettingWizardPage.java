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
public class RuleEngineSettingWizardPage extends WizardPage
{       
    private Composite container;
    
    private Text N;
    private Text correlation;
    
    boolean inputNValid;
    boolean inputCValid;
    
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     */
    public RuleEngineSettingWizardPage()
    {
        super("RuleEngineSettingWizardPage");
        setControl(N);
        setControl(correlation);
        inputNValid = true;
        inputCValid = true;
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void createControl(Composite parent)
    {
        container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
                
        Label labelN = new Label(container, SWT.NULL);
        labelN.setText("The size of the n-Grams (typically 3):");        
        labelN.setLayoutData(new GridData());  
        
        N = new Text(container, SWT.BORDER | SWT.SINGLE);
        N.setText("" + Activator.getRuleEngine().getN());
        N.addKeyListener(new KeyListener() 
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
                    Integer.valueOf(N.getText());
                    int val = Integer.valueOf(N.getText()).intValue();
                    if( val < 1 ) 
                    {
                        setErrorMessage("Value for parameter \"N\" must be greater than 0");
                        inputNValid = false;
                        setPageComplete(inputNValid & inputCValid);
                    }
                    else 
                    {
                        inputNValid = true;
                        setErrorMessage(null);
                        setPageComplete(inputNValid & inputCValid);
                    }
                    
                }
                catch(NumberFormatException exception)
                {
                    setErrorMessage("Integer value expected for parameter \"N\"");
                    inputNValid = false;
                    setPageComplete(inputNValid & inputCValid);
                }
            }
        });

        N.setLayoutData(new GridData(50, 20));
        
        Label labelCorrelation = new Label(container, SWT.NULL);
        labelCorrelation.setText("The minimum correlation for two items to match (min. 0, max. 1):");        
        labelCorrelation.setLayoutData(new GridData());  
               
        correlation = new Text(container, SWT.BORDER | SWT.SINGLE);
        correlation.setText("" + Activator.getRuleEngine().getCorrelation());
        correlation.addKeyListener(new KeyListener() 
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
                    Float.valueOf(correlation.getText());
                    float val = Float.valueOf(correlation.getText()).floatValue();
                    if( val < 0.0f || val > 1.0f ) 
                    {
                        setErrorMessage("Value for parameter \"Correlation\" not within interval of [0...1]");
                        inputCValid = false;
                        setPageComplete(inputNValid & inputCValid);
                    }
                    else
                    {
                        setErrorMessage(null);
                        inputCValid = true;
                        setPageComplete(inputNValid & inputCValid);
                    }
                    
                }
                catch(NumberFormatException exception)
                {
                    setErrorMessage("Float value expected for parameter \"Correlation\"");
                    inputCValid = false;
                    setPageComplete(inputNValid & inputCValid);
                }
            }
        });

        correlation.setLayoutData(new GridData(50, 20));

        
        // Required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the N, set by the user
     * 
     * @return the N
     */
    public int getN()
    {
        return Integer.valueOf(N.getText()).intValue();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the minimum correlation, set by the user
     * 
     * @return the minimum correlation
     */
    public float getCorrelation()
    {
        return Float.valueOf(correlation.getText()).floatValue();
    }
}
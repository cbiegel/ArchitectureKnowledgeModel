
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

package org.emftrace.quarc.ui.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.NumericalTechnicalProperty;
import org.emftrace.quarc.core.commands.constraints.SetConstraintValueCommand;



/**
 * A Part for a Constraint with a NumericalTechicalProperty
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public abstract class NumericalPropertyConstraintPart extends ConstraintPart  {
	
	/**
	 * the constructor 
	 *
	 * @param parent a parent composite 
	 * @param constraint the Constraint to display
	 */
	public NumericalPropertyConstraintPart(Composite parent,
			Constraint constraint) {
		super(parent, constraint);
	}

	protected Text valueText;
	protected Label unitLabel;
	




	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.parts.ConstraintPart#addBody()
	 */
	@Override
	protected void addBody() {

		bodyComposite.setLayout(new GridLayout(2,false));
		valueText = new Text(bodyComposite,  SWT.BORDER);
		addDefaultVertifyListener(valueText, property);
		String valueStr = constraint.getValue();
		valueText.setText(valueStr != null? valueStr : "");
		valueText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		valueText.addFocusListener( new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				new SetConstraintValueCommand(constraint, getValue()).runAsJob();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		NumericalTechnicalProperty property = ((NumericalTechnicalProperty)constraint.getTechnicalProperty());
		
		String unitLabelStr = property.getUnit();
		unitLabel = new Label(bodyComposite, SWT.NONE);


		if (unitLabelStr != null)
			unitLabel.setText("["+unitLabelStr+"]");
		else
			unitLabel.setText("");		

		unitLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));
		
		unitLabel.setBackground(unitLabel.getParent().getBackground());
		
		String unitDescriptionStr = property.getUnitDescription();
		if (unitDescriptionStr == null)
			unitLabel.setToolTipText("no description avalible");
		else 
			unitLabel.setToolTipText(unitDescriptionStr);
		
	}
	
	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.parts.ConstraintPart#getValue()
	 */
	@Override
	public String getValue() {
		return valueText.getText();
	}

}

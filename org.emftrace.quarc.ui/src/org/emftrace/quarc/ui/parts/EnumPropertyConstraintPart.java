
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.quarc.core.commands.constraints.SetConstraintValueCommand;



/**
 * A Part for a Constraint with a EnumTechicalProperty
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class EnumPropertyConstraintPart extends ConstraintPart {

	/**
	 * the constructor 
	 *
	 * @param parent a parent composite 
	 * @param constraint the Constraint to display
	 */
public EnumPropertyConstraintPart(Composite parent, Constraint constraint) {
		super(parent, constraint);
	}

private Combo possibileValuesCombo;
/* (non-Javadoc)
 * @see org.emftrace.quarc.ui.parts.ConstraintPart#addBody()
 */
@Override
protected void addBody() {

	bodyComposite.setLayout(new GridLayout());

		 possibileValuesCombo = new Combo(bodyComposite, SWT.BORDER);
			for (String possibileValue : ((EnumTechnicalProperty)property).getPossibleValues()){
				possibileValuesCombo.add(possibileValue);
			}
			
		 addDefaultVertifyListener(possibileValuesCombo, property);
		 String valueStr = constraint.getValue();
		 possibileValuesCombo.setText(valueStr != null? valueStr : "");
		 possibileValuesCombo.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		 possibileValuesCombo.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				new SetConstraintValueCommand(constraint, getValue() ).runAsJob();
			}
			
			@Override
			public void focusGained(FocusEvent e) {	
			}
		});

	}

	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.parts.ConstraintPart#getValue()
	 */
	@Override
	public String getValue() {
		return possibileValuesCombo.getText();
	}
}

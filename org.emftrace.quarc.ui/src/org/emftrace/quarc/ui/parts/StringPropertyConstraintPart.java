
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.quarc.core.commands.constraints.SetConstraintValueCommand;

/**
 * A Part for a Constraint with a StringTechicalProperty
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class StringPropertyConstraintPart extends ConstraintPart  {

	/**
	 * the constructor 
	 *
	 * @param parent a parent composite 
	 * @param constraint the Constraint to display
	 */
	public StringPropertyConstraintPart(Composite parent, Constraint constraint) {
		super(parent, constraint);
	}

	private  Text valueText ;
	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.parts.ConstraintPart#addBody()
	 */
	@Override
	protected void addBody() {

		bodyComposite.setLayout(new GridLayout());
			valueText = new Text(bodyComposite, SWT.BORDER);
			addDefaultVertifyListener(valueText, property);
			
			valueText.setText(constraint.getValue());
			valueText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
			valueText.addSelectionListener( new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
				//	if (hasValidValue())
					new SetConstraintValueCommand(constraint, getValue()).runAsJob();
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		/* (non-Javadoc)
		 * @see org.emftrace.quarc.ui.parts.ConstraintPart#getValue()
		 */
		@Override
		public String getValue() {
			return valueText.getText();
		}

}

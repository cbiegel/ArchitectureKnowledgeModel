
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

package org.emftrace.quarc.ui.editors;

import java.util.ArrayList;
import java.util.List;
import org.emftrace.quarc.ui.editors.inputs.ICompareElementsEditorInput;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.helpers.PreconditionFinder;
import org.emftrace.ui.controls.EmbeddedLink;




/**
 * An EditorPart used to compare a set of selected SolutionInstruments
 * 
 * @author Daniel Motschmann
 *
 */
public class CompareElementsEditor extends EditorPart {

	//public static final String ID = "org.emftrace.quarc.ui.editors.CompareElementsEditorPart"; //$NON-NLS-1$	
	private List<Element> elementsToCompare;
	private AccessLayer accessLayer;
	private CacheManager cacheManager;
	private ArrayList<ISelectionChangedListener> selectionChangedListeners;
	private ISelectionProvider selectionProvider;
	
	/**
	 * the constructor
	 */
	public CompareElementsEditor() {

	}
	
	/**
	 * @return the shown Elements
	 */
	public List<Element> getElements(){
		return elementsToCompare;
	}
	
	/**
	 * @return the used CacheManager
	 */
	public CacheManager getCacheManager(){
		return cacheManager;
	}
	
	/**
	 * @return the used AccessLayer
	 */
	public AccessLayer getAccessLayer(){
		return accessLayer;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		int labelWidth = 150;
		int labelHeight = 25;
		
		int linkWidth = 160;
		int linkHeight = 25;
		
		
		int textboxWidth = 250;
		int textboxHeight = 100;

		parent.setLayout(new FillLayout());

			this.elementsToCompare = ((ICompareElementsEditorInput)this.getEditorInput()).getElements();
			this.accessLayer = ((ICompareElementsEditorInput)this.getEditorInput()).getAccessLayer();
			this.cacheManager = ((ICompareElementsEditorInput)this.getEditorInput()).getCacheManager();

			Composite composite = new Composite(parent, SWT.NONE);
			composite.setLayout(new RowLayout(SWT.VERTICAL));
			
			if (elementsToCompare.size() == 0){
				Label label = new Label(composite, SWT.NONE);
				label.setText("no item selected");
				return;
			}
		

			List<EAttribute> attributesToCompare = accessLayer.getAttributes(elementsToCompare.get(0));

			//name
			Composite nameComposite = new Composite(composite, SWT.NONE);
			nameComposite.setLayout( new RowLayout(SWT.HORIZONTAL));
			Label nameLabel = new Label(nameComposite, SWT.NONE);
			nameLabel.setText("name:");   
			nameLabel.setLayoutData( new RowData(labelWidth, labelHeight));
			for (Element element : elementsToCompare){
				EmbeddedLink link = new EmbeddedLink(nameComposite, SWT.NONE, false);
				String attributeValue = accessLayer.getAttributeValue(element, "name");
				link.setText(attributeValue!=null? attributeValue : "");
				link.setLayoutData( new RowData(linkWidth, linkHeight));
				link.setTarget(element);
			}

			
			//attributes
			for (EAttribute eAttribute : attributesToCompare ){
				Composite attributeComposite = new Composite(composite, SWT.NONE);
				attributeComposite.setLayout( new RowLayout(SWT.HORIZONTAL));
				if (eAttribute.getName() != "name"){
		
				Label label = new Label(attributeComposite, SWT.NONE);
				label.setText(eAttribute.getName()+":");   
				label.setLayoutData( new RowData(labelWidth, labelHeight));
				int maxLength = 0;
				for (Element element : elementsToCompare){
					String attributeValue = accessLayer.getAttributeValue(element, eAttribute.getName());
					maxLength = Math.max(maxLength, (attributeValue!=null? attributeValue : "").length());
				}
				
				for (Element element : elementsToCompare){
					
					Text text = new Text(attributeComposite, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI| SWT.WRAP);
					String attributeValue = accessLayer.getAttributeValue(element, eAttribute.getName());
					text.setText(attributeValue!=null? attributeValue : "");
					text.setLayoutData( new RowData(textboxWidth, textboxHeight));
					
					text.setToolTipText("the "+eAttribute.getName() +" of the element " + accessLayer.getAttributeValue(element, "name"));
					
					}
				}
			}

	        
	        
	    	
	        ///parent Preconditions
			Composite parentPreconditionsComposite = new Composite(composite, SWT.NONE);
			parentPreconditionsComposite.setLayout( new RowLayout(SWT.HORIZONTAL));
			Label parentPreconditionLabel = new Label(parentPreconditionsComposite, SWT.NONE);
			parentPreconditionLabel.setLayoutData( new RowData(labelWidth, labelHeight));

			parentPreconditionLabel.setText("foreign preconditions:");
			
			for (Element element : elementsToCompare){
				
				Text text = new Text(parentPreconditionsComposite, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI| SWT.WRAP);
				String precoditionString = PreconditionFinder.getRequirementsFromParent(element, cacheManager);
				text.setText(precoditionString!=null && precoditionString!=""? precoditionString : "none");
				text.setLayoutData( new RowData(textboxWidth, textboxHeight));
				text.setToolTipText("foreign preconditions of the element " + accessLayer.getAttributeValue(element, "name"));
				}
			
	        ///Preconditions
			Composite preconditionsComposite = new Composite(composite, SWT.NONE);
			preconditionsComposite.setLayout( new RowLayout(SWT.HORIZONTAL));
			Label preconditionLabel = new Label(preconditionsComposite, SWT.NONE);
			preconditionLabel.setLayoutData( new RowData(labelWidth, labelHeight ));
			preconditionLabel.setText("own preconditions:");
			
			for (Element element : elementsToCompare){
				
				Text text = new Text(preconditionsComposite, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI| SWT.WRAP);
				String precoditionString = PreconditionFinder.formatConditionString(((ConstrainedElement)element).getPrecondition());
				text.setText(precoditionString!=null && precoditionString!=""? precoditionString : "none");
				text.setLayoutData( new RowData(textboxHeight, textboxWidth));
				text.setToolTipText("own preconditions of the element " + accessLayer.getAttributeValue(element, "name"));
				}

		////////////
		
		selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

		selectionProvider = new ISelectionProvider() {

			@Override
			public void setSelection(ISelection selection) {

			}

			@Override
			public void removeSelectionChangedListener(
					ISelectionChangedListener listener) {
				selectionChangedListeners.remove(listener);

			}

			@Override
			public ISelection getSelection() {
				return new StructuredSelection(getElements());
			}

			@Override
			public void addSelectionChangedListener(
					ISelectionChangedListener listener) {
				selectionChangedListeners.add(listener);

			}
		};


		getSite().setSelectionProvider(selectionProvider);
		
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

}

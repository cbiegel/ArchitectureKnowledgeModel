
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


package org.emftrace.quarc.ui.editors.inputs;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.quarc.core.cache.CacheManager;

/**
 * The IEditorInput for the CompareElementsEditorPart
 * 
 * @author Daniel Motschmann
 *
 */
public class ICompareElementsEditorInput implements IEditorInput{

		private List<Element> elements;
		private AccessLayer accessLayer;
		private CacheManager cacheManager;

		/**
		 * the constructor
		 * 
		 * @param elements a List with Dlements to compare
		 * @param accessLayer an AccessLayer
		 * @param cacheManager a CacheManager
		 */
		public ICompareElementsEditorInput(List<Element> elements, AccessLayer accessLayer, CacheManager cacheManager){
			this.elements = elements;
			this.accessLayer = accessLayer;
			this.cacheManager= cacheManager;
		}
		
		/**
		 * @return the used CacheManager
		 */
		public CacheManager getCacheManager(){
			return cacheManager;
		}
		
		/**
		 * @return the used List with Elements to compare
		 */
		public List<Element> getElements(){
			return elements;
		}
		
		/**
		 * @return the used AccessLayer
		 */
		public AccessLayer getAccessLayer(){
			return accessLayer;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
		 */
		@Override
		public Object getAdapter(Class adapter) {
			return null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IEditorInput#exists()
		 */
		@Override
		public boolean exists() {
			return false;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
		 */
		@Override
		public ImageDescriptor getImageDescriptor() {
			return null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IEditorInput#getName()
		 */
		@Override
		public String getName() {
			return "elements to compare";
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IEditorInput#getPersistable()
		 */
		@Override
		public IPersistableElement getPersistable() {
			return null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IEditorInput#getToolTipText()
		 */
		@Override
		public String getToolTipText() {
			return "elements to compare";
		}
		
}

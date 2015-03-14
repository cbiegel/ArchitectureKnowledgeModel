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


package org.emftrace.quarc.core.cache;

/**
 * A Lister used to notify about cache changes
 * @author Daniel Motschmann
 *
 */
public interface ICacheChangedListener {

	/**
	 * fired if some element of the cache was changed
	 */
	public abstract void changed();
}

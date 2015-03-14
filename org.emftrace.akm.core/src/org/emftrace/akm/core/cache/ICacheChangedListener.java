/**
 * 
 */
package org.emftrace.akm.core.cache;

/**
 * An interface for a listener which can be used to notify about changes in a cache.
 * 
 * @author Christopher Biegel
 */
public interface ICacheChangedListener {

	/**
	 * Fired, if an element of a cache was changed
	 */
	public abstract void changed();
}

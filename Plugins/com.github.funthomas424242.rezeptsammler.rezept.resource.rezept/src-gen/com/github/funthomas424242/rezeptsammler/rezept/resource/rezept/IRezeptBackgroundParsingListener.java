/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * A listener interface for classes that need notification when a background
 * parsing pass has completed.
 */
public interface IRezeptBackgroundParsingListener {
	
	/**
	 * <p>
	 * Signals that the given resource has been changed and the background parsing is
	 * completed.
	 * </p>
	 * 
	 * @param resource the resource that has changed
	 */
	public void parsingCompleted(Resource resource);
}

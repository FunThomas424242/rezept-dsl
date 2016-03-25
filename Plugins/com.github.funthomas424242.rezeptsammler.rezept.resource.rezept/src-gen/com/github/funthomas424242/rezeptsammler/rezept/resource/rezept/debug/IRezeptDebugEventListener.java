/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;


public interface IRezeptDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message);
}

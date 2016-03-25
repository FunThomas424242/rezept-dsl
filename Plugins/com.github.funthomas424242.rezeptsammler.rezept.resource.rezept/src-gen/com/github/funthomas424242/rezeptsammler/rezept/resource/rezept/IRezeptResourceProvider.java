/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;


/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IRezeptResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource getResource();
	
}

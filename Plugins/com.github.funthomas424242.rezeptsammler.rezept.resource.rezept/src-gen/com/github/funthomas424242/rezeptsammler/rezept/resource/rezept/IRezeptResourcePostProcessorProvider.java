/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;


/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IRezeptResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourcePostProcessor getResourcePostProcessor();
	
}

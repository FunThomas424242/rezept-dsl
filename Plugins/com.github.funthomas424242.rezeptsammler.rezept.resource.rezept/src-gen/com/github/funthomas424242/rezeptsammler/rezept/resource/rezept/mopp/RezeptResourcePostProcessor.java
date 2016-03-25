/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;


public class RezeptResourcePostProcessor implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourcePostProcessor {
	
	public void process(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}

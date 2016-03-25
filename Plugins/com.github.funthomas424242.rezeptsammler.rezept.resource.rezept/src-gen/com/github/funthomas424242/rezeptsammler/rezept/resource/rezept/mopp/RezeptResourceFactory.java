/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class RezeptResourceFactory implements Resource.Factory {
	
	public RezeptResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource(uri);
	}
	
}

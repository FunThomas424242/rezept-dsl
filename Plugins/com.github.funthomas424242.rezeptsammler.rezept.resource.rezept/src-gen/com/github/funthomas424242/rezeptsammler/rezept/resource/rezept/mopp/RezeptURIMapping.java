/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptURIMappin
 * g interface that can map identifiers to URIs.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptURIMappin
 * g.
 */
public class RezeptURIMapping<ReferenceType> implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptURIMapping<ReferenceType> {
	
	private URI uri;
	private String identifier;
	private String warning;
	
	public RezeptURIMapping(String identifier, URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}

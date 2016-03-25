/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;


/**
 * <p>
 * A basic implementation of the
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptElementMa
 * pping interface.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class RezeptElementMapping<ReferenceType> implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public RezeptElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}

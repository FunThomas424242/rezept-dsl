/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class RezeptPlaceholder extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptTerminal {
	
	private final String tokenName;
	
	public RezeptPlaceholder(EStructuralFeature feature, String tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}

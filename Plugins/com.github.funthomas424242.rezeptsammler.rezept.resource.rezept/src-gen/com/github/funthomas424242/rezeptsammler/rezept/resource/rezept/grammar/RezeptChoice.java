/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;


public class RezeptChoice extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement {
	
	public RezeptChoice(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.explode(getChildren(), "|");
	}
	
}

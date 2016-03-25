/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class RezeptRule extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement {
	
	private final EClass metaclass;
	
	public RezeptRule(EClass metaclass, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice choice, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality) {
		super(cardinality, new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice getDefinition() {
		return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptChoice) getChildren()[0];
	}
	
	@Deprecated
	public String toString() {
		return metaclass == null ? "null" : metaclass.getName() + " ::= " + getDefinition().toString();
	}
	
}


/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class RezeptSyntaxElement {
	
	private RezeptSyntaxElement[] children;
	private RezeptSyntaxElement parent;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality;
	
	public RezeptSyntaxElement(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality, RezeptSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (RezeptSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(RezeptSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public RezeptSyntaxElement getParent() {
		return parent;
	}
	
	/**
	 * Returns the rule of this syntax element. The rule is determined by the
	 * containment hierarchy in the CS model.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule getRule() {
		if (this instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule) {
			return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule) this;
		}
		return parent.getRule();
	}
	
	public RezeptSyntaxElement[] getChildren() {
		if (children == null) {
			return new RezeptSyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality getCardinality() {
		return cardinality;
	}
	
	public boolean hasContainment(EClass metaclass) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement[] children = getChildren();
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement child : children) {
			if (child.hasContainment(metaclass)) {
				return true;
			}
		}
		return false;
	}
	
}

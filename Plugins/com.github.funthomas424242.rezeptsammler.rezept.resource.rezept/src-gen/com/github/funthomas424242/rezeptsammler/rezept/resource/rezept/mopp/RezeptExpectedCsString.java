/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collections;
import java.util.Set;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class RezeptExpectedCsString extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptAbstractExpectedElement {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword keyword;
	
	public RezeptExpectedCsString(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement getSyntaxElement() {
		return keyword;
	}
	
	public Set<String> getTokenNames() {
		return Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof RezeptExpectedCsString) {
			return getValue().equals(((RezeptExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
}

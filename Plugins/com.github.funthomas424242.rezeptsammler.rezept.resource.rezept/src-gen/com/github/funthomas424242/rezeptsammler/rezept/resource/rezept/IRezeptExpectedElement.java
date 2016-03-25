/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IRezeptExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement getSyntaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement follower, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>> getFollowers();
	
}

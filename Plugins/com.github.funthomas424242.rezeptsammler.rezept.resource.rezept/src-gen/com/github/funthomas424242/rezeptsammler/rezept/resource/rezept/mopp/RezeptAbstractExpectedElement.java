/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class RezeptAbstractExpectedElement implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>> followers = new LinkedHashSet<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>>();
	
	public RezeptAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement follower, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] path) {
		followers.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>(follower, path));
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptPair<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptExpectedElement, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}

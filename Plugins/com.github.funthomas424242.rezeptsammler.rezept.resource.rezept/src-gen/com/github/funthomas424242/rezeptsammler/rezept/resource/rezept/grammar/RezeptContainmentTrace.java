/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A RezeptContainmentTrace represents a specific path to a structural feature by
 * navigating over a set of a structural feature from a start class.
 * RezeptContainmentTraces are used during code completion to reconstruct
 * containment trees that are not created by the parser, for example, if the first
 * character of the contained object has not been typed yet.
 */
public class RezeptContainmentTrace {
	
	/**
	 * The class where the trace starts.
	 */
	private EClass startClass;
	
	/**
	 * The path of contained features.
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] path;
	
	public RezeptContainmentTrace(EClass startClass, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] path) {
		super();
		// Verify arguments
		if (startClass != null) {
			if (path.length > 0) {
				EStructuralFeature feature = path[path.length - 1].getFeature();
				if (!startClass.getEAllStructuralFeatures().contains(feature)) {
					throw new RuntimeException("Metaclass " + startClass.getName() + " must contain feature " + feature.getName());
				}
			}
		}
		this.startClass = startClass;
		this.path = path;
	}
	
	public EClass getStartClass() {
		return startClass;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature[] getPath() {
		return path;
	}
	
	public String toString() {
		return (startClass == null ? "null" : startClass.getName()) + "." + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.explode(path, "->");
	}
	
	public boolean contains(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptRule rule) {
		if (path == null) {
			return false;
		}
		
		EClass ruleMetaclass = rule.getMetaclass();
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContainedFeature pathElement : path) {
			EClass containerClass = pathElement.getContainerClass();
			if (containerClass == ruleMetaclass) {
				return true;
			}
		}
		
		return startClass == ruleMetaclass;
	}
	
}

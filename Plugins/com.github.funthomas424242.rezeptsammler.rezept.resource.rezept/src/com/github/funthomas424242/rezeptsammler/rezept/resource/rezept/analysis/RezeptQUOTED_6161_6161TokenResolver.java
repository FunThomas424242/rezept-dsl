/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RezeptQUOTED_6161_6161TokenResolver implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultTokenResolver defaultTokenResolver = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultTokenResolver(true);
	
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "==", "==", null);
		return result;
	}
	
	public void resolve(String lexem, EStructuralFeature feature, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "==", "==", null);
	}
	
	public void setOptions(Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}

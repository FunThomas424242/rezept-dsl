/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class RezeptImportImportedResourceReferenceResolver implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<com.github.funthomas424242.rezeptsammler.rezept.RezeptImport, com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste> {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultResolverDelegate<com.github.funthomas424242.rezeptsammler.rezept.RezeptImport, com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste> delegate = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultResolverDelegate<com.github.funthomas424242.rezeptsammler.rezept.RezeptImport, com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste>();
	
	public void resolve(String identifier, com.github.funthomas424242.rezeptsammler.rezept.RezeptImport container, EReference reference, int position, boolean resolveFuzzy, final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste element, com.github.funthomas424242.rezeptsammler.rezept.RezeptImport container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

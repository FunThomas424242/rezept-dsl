/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class ProduktRefProduktReferenceResolver implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<com.github.funthomas424242.rezeptsammler.rezept.ProduktRef, com.github.funthomas424242.rezeptsammler.rezept.Produkt> {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultResolverDelegate<com.github.funthomas424242.rezeptsammler.rezept.ProduktRef, com.github.funthomas424242.rezeptsammler.rezept.Produkt> delegate = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultResolverDelegate<com.github.funthomas424242.rezeptsammler.rezept.ProduktRef, com.github.funthomas424242.rezeptsammler.rezept.Produkt>();
	
	public void resolve(String identifier, com.github.funthomas424242.rezeptsammler.rezept.ProduktRef container, EReference reference, int position, boolean resolveFuzzy, final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Produkt> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(com.github.funthomas424242.rezeptsammler.rezept.Produkt element, com.github.funthomas424242.rezeptsammler.rezept.ProduktRef container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

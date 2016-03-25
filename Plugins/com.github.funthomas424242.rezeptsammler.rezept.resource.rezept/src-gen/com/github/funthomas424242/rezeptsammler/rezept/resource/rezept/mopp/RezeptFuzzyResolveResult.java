/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A FuzzyResolveResult is an implementation of the IRezeptReferenceResolveResult
 * interface that delegates all method calls to a given
 * IRezeptReferenceResolveResult with ReferenceType EObject. It is used by
 * reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class RezeptFuzzyResolveResult<ReferenceType extends EObject> implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<ReferenceType> {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<EObject> delegate;
	
	public RezeptFuzzyResolveResult(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (EObject) target);
	}
	
	public void addMapping(String identifier, URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (EObject) target, warning);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}

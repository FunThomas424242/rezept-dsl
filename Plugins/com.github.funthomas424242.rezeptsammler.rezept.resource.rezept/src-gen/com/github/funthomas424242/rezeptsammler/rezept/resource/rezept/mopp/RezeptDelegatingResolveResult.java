/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * An implementation of the ResolveResult interface that delegates all method
 * calls to another ResolveResult. Client may subclass this class to easily create
 * custom ResolveResults.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class RezeptDelegatingResolveResult<ReferenceType> implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<ReferenceType> {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<ReferenceType> delegate;
	
	public RezeptDelegatingResolveResult(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<ReferenceType> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>> getMappings() {
		return delegate.getMappings();
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
		delegate.addMapping(identifier, target);
	}
	
	public void addMapping(String identifier, URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, target, warning);
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

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReference
 * ResolveResult interface that collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class RezeptReferenceResolveResult<ReferenceType> implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<ReferenceType> {
	
	private Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes;
	
	public RezeptReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptURIMapping<ReferenceType>(identifier, uri, warning));
	}
}

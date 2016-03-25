/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RezeptReferenceResolverSwitch implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptImportImportedResourceReferenceResolver rezeptImportImportedResourceReferenceResolver = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptImportImportedResourceReferenceResolver();
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.ProduktImportImportedResourceReferenceResolver produktImportImportedResourceReferenceResolver = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.ProduktImportImportedResourceReferenceResolver();
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.ProduktRefProduktReferenceResolver produktRefProduktReferenceResolver = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.ProduktRefProduktReferenceResolver();
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<com.github.funthomas424242.rezeptsammler.rezept.RezeptImport, com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste> getRezeptImportImportedResourceReferenceResolver() {
		return getResolverChain(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport_ImportedResource(), rezeptImportImportedResourceReferenceResolver);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<com.github.funthomas424242.rezeptsammler.rezept.ProduktImport, com.github.funthomas424242.rezeptsammler.rezept.Produktliste> getProduktImportImportedResourceReferenceResolver() {
		return getResolverChain(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport_ImportedResource(), produktImportImportedResourceReferenceResolver);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<com.github.funthomas424242.rezeptsammler.rezept.ProduktRef, com.github.funthomas424242.rezeptsammler.rezept.Produkt> getProduktRefProduktReferenceResolver() {
		return getResolverChain(com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef_Produkt(), produktRefProduktReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		rezeptImportImportedResourceReferenceResolver.setOptions(options);
		produktImportImportedResourceReferenceResolver.setOptions(options);
		produktRefProduktReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport().isInstance(container)) {
			RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste> frr = new RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("importedResource")) {
				rezeptImportImportedResourceReferenceResolver.resolve(identifier, (com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) container, (EReference) feature, position, true, frr);
			}
		}
		if (com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport().isInstance(container)) {
			RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Produktliste> frr = new RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Produktliste>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("importedResource")) {
				produktImportImportedResourceReferenceResolver.resolve(identifier, (com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) container, (EReference) feature, position, true, frr);
			}
		}
		if (com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef().isInstance(container)) {
			RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Produkt> frr = new RezeptFuzzyResolveResult<com.github.funthomas424242.rezeptsammler.rezept.Produkt>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("produkt")) {
				produktRefProduktReferenceResolver.resolve(identifier, (com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptImport_ImportedResource()) {
			return getResolverChain(reference, rezeptImportImportedResourceReferenceResolver);
		}
		if (reference == com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktImport_ImportedResource()) {
			return getResolverChain(reference, produktImportImportedResourceReferenceResolver);
		}
		if (reference == com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktRef_Produkt()) {
			return getResolverChain(reference, produktRefProduktReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptRuntimeUtil().logWarning("Found value with invalid type for option " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver replacingResolver = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver) resolverValue;
			if (replacingResolver instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceCache) {
					com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver nextResolver = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver) next;
					if (nextResolver instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptRuntimeUtil().logWarning("Found value with invalid type in value map for option " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptRuntimeUtil().logWarning("Found value with invalid type in value map for option " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}

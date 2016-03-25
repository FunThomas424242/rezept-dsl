/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class RezeptContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject>  implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public RezeptContextDependentURIFragmentFactory(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy) {
		
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}

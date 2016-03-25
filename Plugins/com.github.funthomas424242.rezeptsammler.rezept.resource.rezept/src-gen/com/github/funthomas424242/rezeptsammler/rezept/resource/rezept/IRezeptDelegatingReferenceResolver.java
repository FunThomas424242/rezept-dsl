/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * </p>
 * 
 * @see
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptions
 */
public interface IRezeptDelegatingReferenceResolver<ContainerType extends EObject, ReferenceType extends EObject> extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolver<ContainerType, ReferenceType> delegate);
	
}

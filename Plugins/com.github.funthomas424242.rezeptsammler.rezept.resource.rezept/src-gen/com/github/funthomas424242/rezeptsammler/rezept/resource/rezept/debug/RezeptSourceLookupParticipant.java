/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

public class RezeptSourceLookupParticipant extends AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptStackFrame) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptStackFrame frame = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}

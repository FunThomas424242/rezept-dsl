/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;

import java.util.Collection;

public interface IRezeptProblem {
	public String getMessage();
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity getSeverity();
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType getType();
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes();
}

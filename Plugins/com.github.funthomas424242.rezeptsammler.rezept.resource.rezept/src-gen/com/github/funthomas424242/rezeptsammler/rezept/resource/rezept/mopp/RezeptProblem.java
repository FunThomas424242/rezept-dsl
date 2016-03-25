/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RezeptProblem implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptProblem {
	
	private String message;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType type;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity severity;
	private Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes;
	
	public RezeptProblem(String message, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType type, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity severity) {
		this(message, type, severity, Collections.<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>emptySet());
	}
	
	public RezeptProblem(String message, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType type, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity severity, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public RezeptProblem(String message, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType type, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity severity, Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemType getType() {
		return type;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.RezeptEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}

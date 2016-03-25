/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.jface.text.AbstractReusableInformationControlCreator;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.DefaultInformationControl.IInformationPresenter;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.QuickAssistAssistant;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.widgets.Shell;

public class RezeptQuickAssistAssistant extends QuickAssistAssistant implements IQuickAssistAssistant {
	
	public RezeptQuickAssistAssistant(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourceProvider resourceProvider, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.IRezeptAnnotationModelProvider annotationModelProvider) {
		setQuickAssistProcessor(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptQuickAssistProcessor(resourceProvider, annotationModelProvider));
		setInformationControlCreator(new AbstractReusableInformationControlCreator() {
			public IInformationControl doCreateInformationControl(Shell parent) {
				return new DefaultInformationControl(parent, (IInformationPresenter) null);
			}
		});
	}
	
	public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(Annotation annotation) {
		return true;
	}
	
}

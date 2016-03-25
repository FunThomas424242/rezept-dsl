/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.TextInvocationContext;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

public class RezeptQuickAssistProcessor implements IQuickAssistProcessor {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourceProvider resourceProvider;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.IRezeptAnnotationModelProvider annotationModelProvider;
	
	public RezeptQuickAssistProcessor(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourceProvider resourceProvider, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.IRezeptAnnotationModelProvider annotationModelProvider) {
		super();
		this.resourceProvider = resourceProvider;
		this.annotationModelProvider = annotationModelProvider;
	}
	
	public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(Annotation annotation) {
		Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes = getQuickFixes(annotation);
		return quickFixes.size() > 0;
	}
	
	public ICompletionProposal[] computeQuickAssistProposals(IQuickAssistInvocationContext invocationContext) {
		ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		int offset = -1;
		int length = 0;
		if (invocationContext instanceof TextInvocationContext) {
			TextInvocationContext textContext = (TextInvocationContext) invocationContext;
			offset = textContext.getOffset();
			length = textContext.getLength();
		}
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes = getQuickFixes(sourceViewer, offset, length);
		ICompletionProposal[] proposals = new ICompletionProposal[quickFixes.size()];
		for (int i = 0; i < proposals.length; i++) {
			proposals[i] = createCompletionProposal(sourceViewer, quickFixes.get(i));
		}
		return proposals;
	}
	
	private ICompletionProposal createCompletionProposal(final ISourceViewer sourceViewer, final com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix quickFix) {
		return new ICompletionProposal() {
			
			public Point getSelection(IDocument document) {
				return null;
			}
			
			public Image getImage() {
				return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIMetaInformation().getImageProvider().getImage(quickFix.getImageKey());
			}
			
			public String getDisplayString() {
				return quickFix.getDisplayString();
			}
			
			public IContextInformation getContextInformation() {
				return null;
			}
			
			public String getAdditionalProposalInfo() {
				return null;
			}
			
			public void apply(IDocument document) {
				String currentContent = sourceViewer.getDocument().get();
				String newContent = quickFix.apply(currentContent);
				if (newContent != null) {
					sourceViewer.getDocument().set(newContent);
				}
			}
		};
	}
	
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes(ISourceViewer sourceViewer, int offset, int length) {
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> foundFixes = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>();
		IAnnotationModel model = annotationModelProvider.getAnnotationModel();
		
		if (model == null) {
			return foundFixes;
		}
		
		Iterator<?> iter = model.getAnnotationIterator();
		while (iter.hasNext()) {
			Annotation annotation = (Annotation) iter.next();
			Position position = model.getPosition(annotation);
			if (offset >= 0) {
				if (!position.overlapsWith(offset, length)) {
					continue;
				}
			}
			Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> quickFixes = getQuickFixes(annotation);
			if (quickFixes != null) {
				foundFixes.addAll(quickFixes);
			}
		}
		return foundFixes;
	}
	
	private Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> getQuickFixes(Annotation annotation) {
		
		Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix> foundQuickFixes = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptQuickFix>();
		if (annotation.isMarkedDeleted()) {
			return foundQuickFixes;
		}
		
		if (annotation instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptMarkerAnnotation) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptMarkerAnnotation markerAnnotation = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptMarkerAnnotation) annotation;
			IMarker marker = markerAnnotation.getMarker();
			foundQuickFixes.addAll(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptMarkerResolutionGenerator().getQuickFixes(resourceProvider.getResource(), marker));
		}
		return foundQuickFixes;
	}
	
	public String getErrorMessage() {
		return null;
	}
	
}

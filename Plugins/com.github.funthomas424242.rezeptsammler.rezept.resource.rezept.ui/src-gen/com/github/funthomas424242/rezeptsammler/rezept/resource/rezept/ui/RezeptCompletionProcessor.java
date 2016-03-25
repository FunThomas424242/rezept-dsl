/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class RezeptCompletionProcessor implements IContentAssistProcessor {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourceProvider resourceProvider;
	
	public RezeptCompletionProcessor(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		return computeCompletionProposals(textResource, content, offset);
	}
	
	public ICompletionProposal[] computeCompletionProposals(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource textResource, String text, int offset) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCodeCompletionHelper helper = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCodeCompletionHelper();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, text, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptProposalPostProcessor proposalPostProcessor = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptProposalPostProcessor();
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal> computedProposalList = Arrays.asList(computedProposals);
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = Collections.emptyList();
		}
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal> finalProposalList = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal>();
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal proposal : extendedProposalList) {
			if (proposal.isMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		ICompletionProposal[] result = new ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = (proposal.getDisplayString()==null)?proposalString:proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			Image image = proposal.getImage();
			IContextInformation info;
			info = new ContextInformation(image, displayString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			result[i++] = new CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		IPreferenceStore preferenceStore = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore();
		boolean enabled = preferenceStore.getBoolean(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED);
		String triggerString = preferenceStore.getString(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS);
		if(enabled && triggerString != null && triggerString.length() > 0){
			char[] triggers = new char[triggerString.length()];
			for (int i = 0; i < triggerString.length(); i++) {
				triggers[i] = triggerString.charAt(i);
			}
			return triggers;
		}
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class RezeptProposalPostProcessor {
	
	public List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal> process(List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}

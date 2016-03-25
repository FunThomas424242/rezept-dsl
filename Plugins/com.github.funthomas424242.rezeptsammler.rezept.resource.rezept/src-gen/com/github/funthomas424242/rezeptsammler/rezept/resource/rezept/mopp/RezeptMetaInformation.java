/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class RezeptMetaInformation implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptMetaInformation {
	
	public String getSyntaxName() {
		return "rezept";
	}
	
	public String getURI() {
		return "http://www.github.com/funthomas424242/language/rezept";
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextScanner createLexer() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptAntlrScanner(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptLexer());
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextParser createParser(InputStream inputStream, String encoding) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptParser().createInstance(inputStream, encoding);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextPrinter createPrinter(OutputStream outputStream, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPrinter2(outputStream, resource);
	}
	
	public EClass[] getClassesWithSyntax() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public EClass[] getStartSymbols() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptReferenceResolverSwitch getReferenceResolverSwitch() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptReferenceResolverSwitch();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolverFactory getTokenResolverFactory() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "com.github.funthomas424242.rezeptsammler.rezept/src/metamodel/rezept.cs";
	}
	
	public String[] getTokenNames() {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptParser.tokenNames;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle getDefaultTokenStyle(String tokenName) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair> getBracketPairs() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptBracketInformationProvider().getBracketPairs();
	}
	
	public EClass[] getFoldableClasses() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFoldingInformationProvider().getFoldableClasses();
	}
	
	public Factory createResourceFactory() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResourceFactory();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptNewFileContentProvider getNewFileContentProvider() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.launchConfigurationType";
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptNameProvider createNameProvider() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptAntlrTokenHelper tokenHelper = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptAntlrTokenHelper();
		List<String> highlightableTokens = new ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}

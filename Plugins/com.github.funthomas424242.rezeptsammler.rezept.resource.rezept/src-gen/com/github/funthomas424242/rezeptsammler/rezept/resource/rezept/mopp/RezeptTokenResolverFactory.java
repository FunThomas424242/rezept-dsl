/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The RezeptTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class RezeptTokenResolverFactory implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolverFactory {
	
	private Map<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver> tokenName2TokenResolver;
	private Map<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver> featureName2CollectInTokenResolver;
	private static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver defaultResolver = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDefaultTokenResolver();
	
	public RezeptTokenResolverFactory() {
		tokenName2TokenResolver = new LinkedHashMap<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver>();
		featureName2CollectInTokenResolver = new LinkedHashMap<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver>();
		registerTokenResolver("DATUM", new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptDATUMTokenResolver());
		registerTokenResolver("NUMBER", new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptNUMBERTokenResolver());
		registerTokenResolver("TEXT", new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptQUOTED_34_34TokenResolver());
		registerTokenResolver("QUOTED_6161_6161", new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.analysis.RezeptQUOTED_6161_6161TokenResolver());
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver internalCreateResolver(Map<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(Map<String, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver> resolverMap, String key, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
/**
 * This class can be used to configure options that must be used when resources
 * are loaded. This is similar to using the extension point
 * 'com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.default_load_op
 * tions' with the difference that the options defined in this class are used even
 * if no Eclipse platform is running.
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.Collections;
import java.util.Map;

public class RezeptOptionProvider implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptOptionProvider {
	
	public Map<?,?> getOptions() {
		// create a map with static option providers here
		return Collections.emptyMap();
	}
	
}

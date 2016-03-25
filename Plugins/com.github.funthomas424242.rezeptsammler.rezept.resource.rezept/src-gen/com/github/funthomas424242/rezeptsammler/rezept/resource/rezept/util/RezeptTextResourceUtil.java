/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class RezeptTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResou
 * rceUtil.
 */
public class RezeptTextResourceUtil {
	
	/**
	 * Use
	 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated
	public static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource getResource(IFile file) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated
	public static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource getResource(File file, Map<?,?> options) {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated
	public static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource getResource(URI uri) {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated
	public static com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource getResource(URI uri, Map<?,?> options) {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptResourceUtil.getResource(uri, options);
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class RezeptNewFileContentProvider {
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptMetaInformation getMetaInformation() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new EClass[] {
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProjektBeschreibung(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getRezeptliste(),
			com.github.funthomas424242.rezeptsammler.rezept.RezeptPackage.eINSTANCE.getProduktliste(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(EClass[] startClasses, EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(EClass eClass, EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		EObject root = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (IOException e) {
			new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptRuntimeUtil().logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextPrinter getPrinter(OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource());
	}
	
}

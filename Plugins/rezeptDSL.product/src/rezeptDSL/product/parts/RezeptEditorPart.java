/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package rezeptDSL.product.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;

import com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptEditor;

public class RezeptEditorPart {

	private RezeptEditor editor = new RezeptEditor();

	@PostConstruct
	public void createComposite(Composite parent) {
		editor.createPartControl(parent);
	}

	@Focus
	public void setFocus() {
		editor.setFocus();
	}

	
}

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
package rezeptDSL.product.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class OpenHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
		FileDialog dialog = new FileDialog(shell);
		final String filePath = dialog.open();
		System.out.println("PATH:" + filePath);

		// Assuming that all editors should open in the the stack with the
		// ID "org.eclipse.e4.primaryDataStack"

		// MPartStack stack = (MPartStack)
		// modelService.find("org.eclipse.e4.primaryDataStack", application);

		MPart part = MBasicFactory.INSTANCE.createInputPart();
		// // Pointing to the contributing class
		// part.setContributionURI("bundleclass://de.vogella.rcp.e4.todo/de.vogella.rcp.e4.parts.Part1");
		// part.setInputURI(input.getInputURI());
		// part.setIconURI("platform:/plugin/de.vogella.rcp.e4.todo/icons/sample.gif");
		// part.setLabel(input.getName());
		// part.setTooltip(input.getTooltip());
		// part.setCloseable(true);
		// stack.getChildren().add(part);
		// partService.showPart(part, PartState.ACTIVATE);

	}
}

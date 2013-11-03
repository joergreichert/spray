/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.xtext.tests;

import javax.inject.Inject;

import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.formatting.INodeModelFormatter.IFormattedRegion;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.XpectString;
import org.eclipse.xtext.junit4.validation.AbstractValidatorTester;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(ParameterizedXtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
@ResourceURIs(baseDir = "model/testcases/formatter", fileExtensions = "spray")
@Ignore("TODO: Something wrong with indentation")
public class SprayFormatterTest extends AbstractValidatorTester {

	@InjectParameter
	protected XtextResource resource;

	@Inject
	protected INodeModelFormatter formatter;

	@InjectParameter
	protected int offset;

	@InjectParameter
	protected int to;

	@XpectString(whitespaceSensitive = true)
	@ParameterSyntax("('from' offset=OFFSET)? 'to' to=OFFSET")
	public String formatted() {
		ICompositeNode rootNode = resource.getParseResult().getRootNode();
		IFormattedRegion r = null;
		if(offset >= 0 && to > offset) {
			r = formatter.format(rootNode, offset, to - offset);
		} else {
			r = formatter.format(rootNode, rootNode.getOffset(), rootNode.getTotalLength());	
		}
		String formatted = r.getFormattedText();
		if(isWindowsEnding()) {
			formatted = formatted.replace("\r\n", "\n");
		}
		formatted = formatted.replace("\r\b", "\n");
		formatted = formatted + getEnding();
		return formatted;
	}
	
	private String getEnding() {
		return isWindowsEnding() ? "" : /*"\r"*/"";
	}
	
	private boolean isWindowsEnding() {
		String ls = System.getProperty("line.separator");
		return "\r\n".equals(ls);
	}
}

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
package org.eclipselabs.spray.styles.tests;

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
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(ParameterizedXtextRunner.class)
@InjectWith(StyleTestsInjectorProvider.class)
@ResourceURIs(baseDir = "model/formatter", fileExtensions = "style")
public class StyleFormatterTest extends AbstractValidatorTester {

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
		return r.getFormattedText().replaceAll("\\r\\b", "\n") + getEnding();
	}
	
	private String getEnding() {
		String ls = System.getProperty("line.separator");
		return "\r\n".equals(ls) ? "\r" : "";
	}	
}

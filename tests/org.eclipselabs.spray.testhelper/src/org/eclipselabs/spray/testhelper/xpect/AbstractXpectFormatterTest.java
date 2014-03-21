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
package org.eclipselabs.spray.testhelper.xpect;

import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.formatting.INodeModelFormatter.IFormattedRegion;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.testhelper.xpect.AbstractXpectFormatterTest.NullValidatorSetup;
import org.junit.runner.RunWith;
import org.xpect.expectation.IStringExpectation;
import org.xpect.expectation.StringExpectation;
import org.xpect.parameter.ParameterParser;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.setup.XpectSetup;
import org.xpect.xtext.lib.setup.ThisOffset;
import org.xpect.xtext.lib.setup.ThisResource;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.xpect.xtext.lib.setup.XtextValidatingSetup;

import com.google.inject.Inject;

@RunWith(XpectRunner.class)
@XpectSetup({ XtextStandaloneSetup.class, NullValidatorSetup.class })
public abstract class AbstractXpectFormatterTest {

	public static class NullValidatorSetup extends XtextValidatingSetup {
		public NullValidatorSetup(@ThisResource XtextResource resource) {
			super(resource);
		}

		@Override
		public void validate() {
			// do nothing
		}
	}
	
	@Inject
	protected INodeModelFormatter formatter;

	@ParameterParser(syntax = "('from' offset=OFFSET 'to' to=OFFSET)?")
	@Xpect
	public void formatted(
			@StringExpectation(whitespaceSensitive = true) IStringExpectation expectation,
			@ThisResource XtextResource resource, @ThisOffset int offset,
			@ThisOffset int to) {
		ICompositeNode rootNode = resource.getParseResult().getRootNode();
		IFormattedRegion r = null;
		if (offset >= 0 && to > offset) {
			r = formatter.format(rootNode, offset, to - offset);
		} else {
			r = formatter.format(rootNode, rootNode.getOffset(),
					rootNode.getTotalLength());
		}
		String formatted = r.getFormattedText();
		if (isUnixEnding()) {
			formatted = formatted.replaceAll("\r\n", "\n");
		} else if (isWindowsEnding()) {
			if(!rootNode.getText().contains("\r\n")) {
				formatted = formatted.replaceAll("\r\n", "\n");
			} else {
				formatted = formatted.replaceAll("(!\r)\n", "\r\n");
			}
		}
		expectation.assertEquals(formatted);
	}

	private static boolean isWindowsEnding() {
		String ls = System.getProperty("line.separator");
		return "\r\n".equals(ls);
	}

	private static boolean isUnixEnding() {
		String ls = System.getProperty("line.separator");
		return "\n".equals(ls);
	}
}

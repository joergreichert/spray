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
package org.eclipselabs.spray.styles.ui.tests;

import java.util.Arrays;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.styles.StyleUiInjectorProvider;
import org.junit.runner.RunWith;
import org.xpect.expectation.CommaSeparatedValuesExpectation;
import org.xpect.expectation.ICommaSeparatedValuesExpectation;
import org.xpect.parameter.ParameterParser;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;
import org.xpect.setup.XpectSetup;
import org.xpect.xtext.lib.setup.ThisOffset;
import org.xpect.xtext.lib.setup.ThisResource;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.xpect.xtext.lib.setup.XtextWorkspaceSetup;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
@RunWith(XpectRunner.class)
@XpectSetup({ XtextStandaloneSetup.class, XtextWorkspaceSetup.class })
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "model/contentassist", fileExtensions = "xt")
public class StyleProposalPluginTest extends AbstractContentAssistProcessorTest {
	@Inject 
	private StyleUiInjectorProvider injectorProvider;

	@Override
	protected ISetup doGetSetup() {
		return new ISetup() {

			@SuppressWarnings("unused")
			public void register(Injector injector) {
				// do nothing
			}

			@Override
			public Injector createInjectorAndDoEMFRegistration() {
				return injectorProvider.getInjector();
			}
		};
	}

	@ParameterParser(syntax = "('from' offset=OFFSET)?")
	@Xpect
	public Iterable<String> elementsProposed(
			@CommaSeparatedValuesExpectation ICommaSeparatedValuesExpectation expectation,
			@ThisResource XtextResource resource, @ThisOffset int offset) throws Exception {
		super.setUp();
		ContentAssistProcessorTestBuilder fixture = newBuilder(getSetup());
		ICompositeNode rootNode = resource.getParseResult().getRootNode();
		String content = rootNode.getText();
		fixture = fixture.append(content);
		ICompletionProposal[] proposals = fixture
				.computeCompletionProposals(offset);
		return Iterables.transform(Arrays.asList(proposals),
				new Function<ICompletionProposal, String>() {
					public String apply(ICompletionProposal proposal) {
						return proposal.getDisplayString();
					}
				});
	}
}

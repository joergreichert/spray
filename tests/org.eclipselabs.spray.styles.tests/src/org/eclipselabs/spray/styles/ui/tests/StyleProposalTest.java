package org.eclipselabs.spray.styles.ui.tests;

import java.util.Arrays;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.XpectCommaSeparatedValues;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.styles.StyleUiInjectorProvider;
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
@RunWith(ParameterizedXtextRunner.class)
@InjectWith(StyleTestsInjectorProvider.class)
@ResourceURIs(files = { "model/contentassist/a.style" })
public class StyleProposalTest extends AbstractContentAssistProcessorTest {
	
	@Override
	protected ISetup doGetSetup() {
		return new ISetup() {

			@SuppressWarnings("unused")
			public void register(Injector injector) {
				// do nothing
			}

			@Override
			public Injector createInjectorAndDoEMFRegistration() {
				return new StyleUiInjectorProvider().getInjector();
			}
		};
	}
	
	
	@InjectParameter
	protected XtextResource resource;
	
	@InjectParameter
	private int offset;

	@ParameterSyntax("('at' offset=OFFSET)?")
	@XpectCommaSeparatedValues
	public Iterable<String> elementsProposed() throws Exception {
		super.setUp();
		ICompositeNode rootNode = resource.getParseResult().getRootNode();
		String content = rootNode.getText();
		ContentAssistProcessorTestBuilder fixture = newBuilder(getSetup());
		fixture = fixture.append(content);
		ICompletionProposal[] proposals = fixture.computeCompletionProposals(offset);
		return Iterables.transform(Arrays.asList(proposals), new Function<ICompletionProposal, String>() {
			public String apply(ICompletionProposal proposal) {
				return proposal.getDisplayString();
			}
		});
	}
}

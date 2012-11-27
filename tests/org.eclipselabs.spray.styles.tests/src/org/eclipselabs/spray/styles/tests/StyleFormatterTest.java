package org.eclipselabs.spray.styles.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner2.class)
@InjectWith(StyleTestsInjectorProvider.class)
public class StyleFormatterTest extends XtextTest {

	@Inject
	protected INodeModelFormatter formatter;

	@Test
	public void testShapeFormatter() throws Exception {
		Scanner scanner = new Scanner(new File(
				"model/formatter/formatted.style"));
		String expected = scanner.useDelimiter("\\A").next();
		scanner.close();
		String actual = getExpectedFormattedString("formatter/unformatted.style");
		assertEquals("Expected formatted result", expected, actual);
	}

	public String getExpectedFormattedString(String path) {
		URI uri = URI.createURI(resourceRoot + "/" + path);
		EObject model = loadModel(resourceSet, uri, getRootObjectType(uri));
		ICompositeNode rootNode = ((XtextResource) model.eResource())
				.getParseResult().getRootNode();
		return formatter.format(rootNode, 0, rootNode.getTotalLength())
				.getFormattedText();
	}
}

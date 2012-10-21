package org.eclipselabs.spray.xtext.formatting;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Scanner;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.IBusinessDomainDslPackage;

import com.google.inject.Inject;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class SprayFormatterTest extends XtextTest {

	@Inject
	protected INodeModelFormatter formatter;

	@Before
	public void before() {
		EPackage.Registry.INSTANCE.put(IBusinessDomainDslPackage.eNS_URI,
				IBusinessDomainDslPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI,
				GenModelPackage.eINSTANCE);

		EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(
				IBusinessDomainDslPackage.eNS_URI,
				URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
	}

	@Test
	public void testSprayFormatter() throws Exception {
		Scanner scanner = new Scanner(new File(
				"model/formatter/formatted.spray"));
		String expected = scanner.useDelimiter("\\A").next();
		scanner.close();
		String actual = getExpectedFormattedString("formatter/unformatted.spray");
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

package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.ecore.EPackage;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class AbstractSprayXtextTest extends XtextTest {
	protected static final String TESTCASES_FOLDER = "/testcases/";
	protected static final String REFERENCED_TEST_SHAPE = TESTCASES_FOLDER
			+ "referenced/test.shape";
	protected static String MOD4J_XCORE = "model/BusinessDomainDsl.xcore";

	@Inject
	private Injector injector;

	public AbstractSprayXtextTest() {
		super("classpath:/");
	}

	@Before
	public void before() {

		resourceSet.getPackageRegistry().put(StylesPackage.eNS_URI,
				StylesPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ShapesPackage.eNS_URI,
				ShapesPackage.eINSTANCE);

		Injector styleInjector = new StyleStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		org.eclipse.xtext.resource.IResourceFactory styleResourceFactory = styleInjector
				.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("style", styleResourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider styleServiceProvider = styleInjector
				.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE
				.getExtensionToFactoryMap().put("style", styleServiceProvider);

		Injector shapeInjector = new ShapeStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		org.eclipse.xtext.resource.IResourceFactory shapeResourceFactory = shapeInjector
				.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("shape", shapeResourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider shapeServiceProvider = shapeInjector
				.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE
				.getExtensionToFactoryMap().put("shape", shapeServiceProvider);

		EPackage.Registry packageRegistry = injector
				.getInstance(EPackage.Registry.class);
		packageRegistry.put(BusinessDomainDslPackage.eNS_URI,
				BusinessDomainDslPackage.eINSTANCE);

		suppressSerialization();
	}

}

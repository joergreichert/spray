package org.eclipselabs.spray.shapes.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeInjectorProvider.class)
public class ConnectionModelTest extends XtextTest {
	
	@Before
	public void before() {
		super.before();
		suppressSerialization();
	}
	
}

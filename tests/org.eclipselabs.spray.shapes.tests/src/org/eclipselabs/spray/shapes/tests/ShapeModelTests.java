package org.eclipselabs.spray.shapes.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeInjectorProvider.class)
public class ShapeModelTests extends XtextTest {

	@Before
	public void before() {
		super.before();
		suppressSerialization();
	}

	@Test
	public void test_01_EllipseTest() {
		testFile("testcases/shapes/01_EllipseTest.shape");
	}

	@Test
	public void test_02_RectangleTest() {
		testFile("testcases/shapes/02_RectangleTest.shape");
	}

	@Test
	public void test_03_RoundedRectangleTest() {
		testFile("testcases/shapes/03_RoundedRectangleTest.shape");
	}

	@Test
	public void test_04_PolygonTest() {
		testFile("testcases/shapes/04_PolygonTest.shape");
	}

	@Test
	public void test_05_PolylineTest() {
		testFile("testcases/shapes/05_PolylineTest.shape");
	}

	@Test
	public void test_06_LineTest() {
		testFile("testcases/shapes/06_LineTest.shape");
	}

	@Test
	public void test_07_NestedShapesTest() {
		testFile("testcases/shapes/07_NestedShapesTest.shape");
	}

	@Test
	public void test_08_MultipleShapesTest() {
		testFile("testcases/shapes/08_MultipleShapesTest.shape");
	}

	@Test
	public void test_09_MultipleAndNestedShapesTest() {
		testFile("testcases/shapes/09_MultipleAndNestedShapesTest.shape");
	}

	@Test
	public void test_10_ShapesPropertiesTest() {
		testFile("testcases/shapes/10_ShapesPropertiesTest.shape");
	}

	@Test
	public void test_11_CenterAnchorsTest() {
		testFile("testcases/shapes/11_CenterAnchorsTest.shape");
	}

	@Test
	public void test_12_CornerAnchorsTest() {
		testFile("testcases/shapes/12_CornerAnchorsTest.shape");
	}

	@Test
	public void test_13_RelativeAnchorsTest() {
		testFile("testcases/shapes/13_RelativeAnchorsTest.shape");
	}

	@Test
	public void test_14_FixPointAnchorsTest() {
		testFile("testcases/shapes/14_FixPointAnchorsTest.shape");
	}

	@Test
	public void test_15_RelativeAndFixPointAnchorsTest() {
		testFile("testcases/shapes/15_RelativeAndFixPointAnchorsTest.shape");
	}

}

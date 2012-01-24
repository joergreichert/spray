package org.eclipselabs.spray.styles.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.styles.StyleInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(StyleInjectorProvider.class)
public class StyleModelTest extends XtextTest {
	
	@Before
	public void before() {
		super.before();
		suppressSerialization();
	}

	@Test
	public void test_01_FullFilledStyle() {
		testFile("testcases/01_FullFilledStyle.style");
	}

	@Test
	public void test_02_NoTransparency() {
		testFile("testcases/02_NoTransparency.style");
	}

	@Test
	public void test_03_DefaultBackground() {
		testFile("testcases/03_DefaultBackground.style");
	}

	@Test
	public void test_04_TransparentBackground() {
		testFile("testcases/04_TransparentBackground.style");
	}

	@Test
	public void test_05_NoLinecolor() {
		testFile("testcases/05_NoLinecolor.style");
	}

	@Test
	public void test_06_TransparentLineColor() {
		testFile("testcases/06_TransparentLineColor.style");
	}

	@Test
	public void test_07_NoFontname() {
		testFile("testcases/07_NoFontname.style");
	}

	@Test
	public void test_08_NoFontsize() {
		testFile("testcases/08_NoFontsize.style");
	}

	@Test
	public void test_09_NoFontnameAndSize() {
		testFile("testcases/09_NoFontnameAndSize.style");
	}

	@Test
	public void test_10_NoFontStyle() {
		testFile("testcases/10_NoFontStyle.style");
	}

	@Test
	public void test_11_EmptyStyle() {
		testFile("testcases/11_EmptyStyle.style");
	}

	@Test
	public void test_12_StyleInheritance() {
		testFile("testcases/12_StyleInheritance.style");
	}
	
	@Test
	public void test_13_DefaultLine() {
		testFile("testcases/13_DefaultLine.style");
	}
	
	@Test
	public void test_14_DefaultFont() {
		testFile("testcases/14_DefaultFont.style");
	}

}

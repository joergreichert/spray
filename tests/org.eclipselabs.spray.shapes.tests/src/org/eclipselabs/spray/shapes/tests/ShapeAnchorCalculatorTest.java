package org.eclipselabs.spray.shapes.tests;

import junit.framework.Assert;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.generator.util.ShapeAnchorCalculator;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeTestsInjectorProvider.class)
public class ShapeAnchorCalculatorTest {

	@Inject
	private ShapeAnchorCalculator anchorCalc;

	@Test
	public void testCalculateCorrectionOffset() {
		int c = anchorCalc.calculateCorrection(200, 10, 0.0);
		Assert.assertEquals("The correction on offset 0.00 is wrong.", c, 0);
		c = anchorCalc.calculateCorrection(200, 10, 0.01);
		Assert.assertEquals("The correction on offset 0.01 is wrong.", c, -2);
		c = anchorCalc.calculateCorrection(200, 10, 0.02);
		Assert.assertEquals("The correction on offset 0.02 is wrong.", c, -4);
		c = anchorCalc.calculateCorrection(200, 10, 0.1);
		Assert.assertEquals("The correction on offset 0.10 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(200, 10, 0.5);
		Assert.assertEquals("The correction on offset 0.50 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(200, 10, 0.9);
		Assert.assertEquals("The correction on offset 0.90 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(200, 10, 0.98);
		Assert.assertEquals("The correction on offset 0.98 is wrong.", c, -6);
		c = anchorCalc.calculateCorrection(200, 10, 0.99);
		Assert.assertEquals("The correction on offset 0.99 is wrong.", c, -8);
		c = anchorCalc.calculateCorrection(200, 10, 1.0);
		Assert.assertEquals("The correction on offset 1.00 is wrong.", c, -10);
	}

	@Test
	public void testCalculateCorrectionPosition() {
		int c = anchorCalc.calculateCorrection(0, 200, 10);
		Assert.assertEquals("The correction on position 0 is wrong.", c, 0);
		c = anchorCalc.calculateCorrection(1, 200, 10);
		Assert.assertEquals("The correction on position 1 is wrong.", c, -1);
		c = anchorCalc.calculateCorrection(2, 200, 10);
		Assert.assertEquals("The correction on position 2 is wrong.", c, -2);
		c = anchorCalc.calculateCorrection(5, 200, 10);
		Assert.assertEquals("The correction on position 5 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(100, 200, 10);
		Assert.assertEquals("The correction on position 100 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(195, 200, 10);
		Assert.assertEquals("The correction on position 195 is wrong.", c, -5);
		c = anchorCalc.calculateCorrection(198, 200, 10);
		Assert.assertEquals("The correction on position 198 is wrong.", c, -8);
		c = anchorCalc.calculateCorrection(199, 200, 10);
		Assert.assertEquals("The correction on position 199 is wrong.", c, -9);
		c = anchorCalc.calculateCorrection(200, 200, 10);
		Assert.assertEquals("The correction on position 200 is wrong.", c, -10);
	}

}

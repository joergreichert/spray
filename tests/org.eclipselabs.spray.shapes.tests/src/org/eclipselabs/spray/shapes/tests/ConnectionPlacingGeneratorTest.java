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
package org.eclipselabs.spray.shapes.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeTestsInjectorProvider.class)
public class ConnectionPlacingGeneratorTest {

	@Inject
	private ConnectionPlacingGenerator placeGen;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAngle0() {
		// Distance 0 and Angle 0
		int d = 0, a = 0;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance >0 and Angle 0
		a = 0;
		d = 47;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = d;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testAngle90() {
		// Distance 0 and Angle 90
		int d = 0, a = 90;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance >0 and Angle 90
		a = 90;
		d = 87;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = -d;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testAngle180() {
		// Distance 0 and Angle 180
		int d = 0, a = 180;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance >0 and Angle 180
		a = 180;
		d = 15;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -d;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testAngle270() {
		// Distance 0 and Angle 270
		int d = 0, a = 270;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance >0 and Angle 270
		a = 270;
		d = 178;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = d;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testAngle360() {
		// Distance 0 and Angle 360
		int d = 0, a = 360;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance 50 and Angle 360
		a = 360;
		d = 98;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = d;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		// Distance 50 and Angle 360
		a = 400;
		d = 48;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = d;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testQ1() {
		int d = 0, a = 1;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 80;
		a = 1;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 79;
		expectedY = -1;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 30;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 87;
		a = 30;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 75;
		expectedY = -43;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 45;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 98;
		a = 45;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 69;
		expectedY = -69;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 60;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 15;
		a = 60;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 7;
		expectedY = -12;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 89;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 90;
		a = 89;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 1;
		expectedY = -89;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testQ2() {
		int d = 0, a = 91;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 80;
		a = 91;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -1;
		expectedY = -79;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 120;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 87;
		a = 120;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -43;
		expectedY = -75;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 135;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 98;
		a = 135;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -69;
		expectedY = -69;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 150;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 15;
		a = 150;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -12;
		expectedY = -7;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 179;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 90;
		a = 179;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -89;
		expectedY = -1;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testQ3() {
		int d = 0, a = 181;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 80;
		a = 181;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -79;
		expectedY = 1;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 210;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 87;
		a = 210;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -75;
		expectedY = 43;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 225;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 98;
		a = 225;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -69;
		expectedY = 69;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 240;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 15;
		a = 240;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -7;
		expectedY = 12;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 269;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 90;
		a = 269;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = -1;
		expectedY = 89;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

	@Test
	public void testQ4() {
		int d = 0, a = 271;
		int x = placeGen.getXPositionforAngle(d, a);
		int y = placeGen.getYPositionforAngle(d, a);
		int expectedX = 0, expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 80;
		a = 271;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 1;
		expectedY = 79;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 300;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 87;
		a = 300;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 43;
		expectedY = 75;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 315;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 98;
		a = 315;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 69;
		expectedY = 69;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 330;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 15;
		a = 330;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 12;
		expectedY = 7;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 0;
		a = 359;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 0;
		expectedY = 0;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);

		d = 90;
		a = 359;
		x = placeGen.getXPositionforAngle(d, a);
		y = placeGen.getYPositionforAngle(d, a);
		expectedX = 89;
		expectedY = 1;
		assertEquals("Wrong X coordinate for Angle " + a + " and distance " + d + ".", x, expectedX);
		assertEquals("Wrong Y coordinate for Angle " + a + " and distance " + d + ".", y, expectedY);
	}

}

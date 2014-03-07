package org.eclipselabs.spray.shapes.tests.svg

import org.junit.Assert

class CustomAssert {
	
	def assertEquals(String description, String expected, String serialized) {
       	val expectedMod = expected.replaceAll("(\r\n|\r)", "\n");
       	val serializedMod = serialized.replaceAll("(\r\n|\r)", "\n");
        // Remove trailing whitespace, see Bug#320074
        // todo: Check if the trim really is still necessary!!
        Assert.assertEquals(description, expectedMod.trim(), serializedMod.trim());
	}
}
package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleUtilitiesTest {

	@Test
	public void testPerimeter() {
		int height = 4;
		int width = 6;
		int expected = 20;
		
		int actualPerimeter = RectangleUtilities.getPeremiter(height, width);
		
		assertEquals(expected, actualPerimeter);
	}
}

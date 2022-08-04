package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringUtilitiesTestingDemo {

	@Test
	public void testCapitalized() {
		
		String s = "Apple";
		String t = "apple";
		String r = "image";
		String w = "";
		
		StringUtilities utils = new StringUtilities();
		assertTrue(utils.isCapitalized(s));
		assertFalse(utils.isCapitalized(t));
		assertFalse(utils.isCapitalized(r));
		assertFalse(utils.isCapitalized(w));
	}
}

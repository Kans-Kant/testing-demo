package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleUtilitiesTest {

	/*@Test
	public void isEquilateral() {
		assertFalse(TriangleUtilities.isEquilateral(2, 3, 4));
		assertFalse(TriangleUtilities.isEquilateral(2, 3, 3));
		assertTrue(TriangleUtilities.isEquilateral(3, 3, 3));
	}*/
	
	@Test
	public void testIsSoceles() {
		
		int sideA = 3;
		int sideB = 2;
		int sideC = 3;
		assertTrue(TriangleUtilities.isIsoceles(sideA, sideB, sideC));
	}
}

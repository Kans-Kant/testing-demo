package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TheoryDemo1 {

	@Test
	public void myTest() {
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		int[] array3 = {1, 7, 7};
		int[] array4 = {1, 2, 3, 4};
		
		//assertArrayEquals(array1, array2);
		//assertArrayEquals(array2, array3);
		assertArrayEquals(array3, array4);
	}
}

package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PracticeDemo {
	
	int x = 2;
	int y = 2;
	int z = 3;

	@Test
	public void test1() {
		assertEquals(x, y);
	}
	
	@Test
	public void test2() {
		assertNotEquals(y, z);
	}
}

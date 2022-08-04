package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTrueDemo {

	@Test
	public void test1() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertTrue(Integer.parseInt("3") == 2);
	}
	
	@Test
	public void test3() {
		assertTrue("abc".length() ==3);
	}
	
}

package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Practice2 {

	int x = 2;
	int y = 2;
	int z = 3;
	
	boolean a = ( x == y );
	boolean b = ( y == z );
	
	@Test
	public void test1() {
		assertTrue(a);
	}
	
	@Test
	public void test2() {
		assertFalse(b);
	}
}

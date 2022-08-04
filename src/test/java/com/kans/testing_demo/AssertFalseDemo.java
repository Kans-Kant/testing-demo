package com.kans.testing_demo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseDemo {

	@Test
	public void myTest() {
		assertFalse(false);
		assertFalse(1==2);
		assertFalse("abc".length() ==4 );
	}
}

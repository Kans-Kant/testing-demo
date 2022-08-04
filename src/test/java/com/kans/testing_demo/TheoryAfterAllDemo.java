package com.kans.testing_demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TheoryAfterAllDemo {

	@BeforeAll
	public void setup() {
		System.out.println("start");
	}
	
	@AfterAll
	public void tearDown() {
		System.out.println("end");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	}
}

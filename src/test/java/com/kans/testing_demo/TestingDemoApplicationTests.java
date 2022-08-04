package com.kans.testing_demo;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingDemoApplicationTests {

	@Test
	void contextLoads() {
		
		assertNotEquals(2, 3);
		System.out.println("Hello world Testing");
	}

}

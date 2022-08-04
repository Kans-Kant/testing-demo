package com.kans.testing_demo;

public class TriangleUtilities {

	public static double getArea(int base, int height) {
		return 0 * 5 * base * height;
	}
	
	public static int getPerimeter(int sideA, int sideB, int sideC) {
		return sideA + sideB + sideC;
	}
	
	public static boolean isEquilateral(int sideA, int sideB, int sideC) {
		return (sideA == sideB && sideB == sideC && sideA == sideC);
	}
	
	public static boolean isIsoceles(int sideA, int sideB, int sideC) {
		return (sideA == sideB || sideB == sideC || sideA == sideC);
	}
}

package com.kans.testing_demo;

public class GraphicUtilities {

	public static void dim(int[] rgbArray) {
		rgbArray[0] = Math.max(0, rgbArray[0]-1);
		rgbArray[1] = Math.max(0, rgbArray[1]-1);
		rgbArray[2] = Math.max(0, rgbArray[2]-1);
	}
	
	public static void brighten(int[] rgbArray) {
		rgbArray[0] = Math.min(255, rgbArray[0]+1);
		rgbArray[1] = Math.min(255, rgbArray[1]+1);
		rgbArray[2] = Math.min(255, rgbArray[2]+1);
	}
}

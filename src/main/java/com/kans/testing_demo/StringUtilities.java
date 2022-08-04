package com.kans.testing_demo;

import java.util.HashSet;

public class StringUtilities {

	HashSet<String> lowerCases= new HashSet<>(); 
	HashSet<String> upperCases= new HashSet<>(); 
	
	public StringUtilities() {
		lowerCases.add("a");
		lowerCases.add("e");
		lowerCases.add("i");
		lowerCases.add("o");
		lowerCases.add("u");
		
		upperCases.add("A");
		upperCases.add("E");
		upperCases.add("I");
		upperCases.add("O");
		upperCases.add("U");
		
	}
	
	public int vowelCount(String s) {
		int count = 0 ;
		
		for(int i=0; i<s.length(); i++) {
			
			if(lowerCases.contains(Character.toString(s.charAt(i)))) {
				count++;
			}else if(upperCases.contains(Character.toString(s.charAt(i)))){
				count++;
			}
		}
		
		return count;
	}
	
	public boolean isCapitalized(String s) {
		if(s==null || s.length()==0) {
			return false;
		}else {
			return upperCases.contains(Character.toString(s.charAt(0)));
		}
	}
}

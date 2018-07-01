package com.logicalprograms;

import java.util.Arrays;

public class Anagrom {
	
	String s1 = "ABCD";
	String S2 = "DBAC";
	

	public static void main(String[] args) {
		
		String s1 = "ABCD";
		String s2 = "DBAC";
		
		calculateAnagrom(s1, s2);
		
		}


	private static void calculateAnagrom(String s1, String s2) {
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(Arrays.equals(c1, c2)){
			System.out.println("Given words are Anagrom");
		}
		else{
			System.out.println("Given words are not Anagrom");
		}
	}

}

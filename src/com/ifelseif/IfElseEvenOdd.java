package com.ifelseif;

public class IfElseEvenOdd {

	public static void main(String[] args) {
		printEvenOrOdd(10);
		printEvenOrOdd(3);
		String res = returnEvenOrOdd(2);
		System.out.println(res);
	}
	
	public static void printEvenOrOdd(int a){
		
		if(a%2 == 0){
		System.out.println("number is even: " + a);	
		}
		else{
		System.out.println("number is odd: " + a);	
		}
		
		
		
		
		
	
		
	}
//need output 5 is odd
// 6 is even
public static String returnEvenOrOdd(int a){
		
	String results = null;
	
		if(a%2 == 0){
		results = a + "is even";	
		}
		else{
		results = a + "is odd";		
		}
		return results;
		
	}
}

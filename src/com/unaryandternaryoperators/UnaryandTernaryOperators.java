package com.unaryandternaryoperators;

public class UnaryandTernaryOperators {
	
	
	
public static void printEvenOrOdd(int a){
	
	String s = 	(a%2 ==0)? ("number is even: " + a)   :    ("number is odd: " + a);	
	System.out.println( s );
	
	// the below syso is equal to above 2 lines
	//System.out.println((a%2 ==0)? ("number is even: " + a)   :    ("number is odd: " + a)  );
	
	
	
	}
	
	
	
	
	public static void main(String [] args){
		/*
		int a = 10;
		int c = a++;
		
		
		System.out.println(c);
		
		int d = a;
		
		System.out.println(d);
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);*/
		
		
		
		
		
		int b = 20;
		System.out.println(b);
		System.out.println(++b);
		
		
		System.out.println(b);
	}
	

}

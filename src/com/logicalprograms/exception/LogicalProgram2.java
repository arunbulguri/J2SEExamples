package com.logicalprograms.exception;

import com.exception.userdefined.WrongInputCheckedException;

public class LogicalProgram2 {

	public static void main(String[] args) {
		LogicalProgram2 o1 = new LogicalProgram2();
		try {
			o1.stringPalindrome("");
		} catch (WrongInputCheckedException e) {
			
		System.out.println(e.getMessage());
		}
		

	}

	
	public void stringPalindrome(String s1) throws WrongInputCheckedException{
	
		if (s1.isEmpty()) throw new WrongInputCheckedException("This is a Blank String S1. Please Enter Valid String");
		
		else {
		String s2 =  "";
		for (int i =s1.length()-1; i>=0; i--){
		//	s2 = s2+s1.charAt(i);
			s2 += s1.charAt(i);
			}
		
		if(s1.equals(s2)){
			System.out.println("given string is a palindrome");
		}else System.out.println("given string is Not a palindrome");
		
		
	}
		
}
	
}

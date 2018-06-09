package com.logicalprograms.exception;

import com.exception.userdefined.InvalidInputException;

public class LogicalPrograms1 {

	public static void main(String[] args) {
		LogicalPrograms1  lp1 = new LogicalPrograms1();
		try{
		lp1.factorial(4);
		lp1.integerPalindrome(0);
		}catch (InvalidInputException e1){
			System.out.println(e1.getMessage());
			}  catch (Exception e1){
				System.out.println(e1.getMessage());
				} 
		
		

	}
	
	
	public void factorial(int n){
		
		if(n<=0){
		throw new InvalidInputException("Invalid Input number");
		}else {
			int f = 1;
			while(n>0){
				f = f*n;
				n--;
			}
			System.out.println(" factorial is " + f);
		}
	}
	
	
	public void integerPalindrome(int n){
		
		if( n ==0){
			throw new RuntimeException("Invalid Number for integer palindrome. Please give valid number");
			
		}
	
		int p = 0;
		int n1 = n;
		
		while (n!=0){ 
		
		int r = n%10;  
		
		    n = n/10;  
		
		    p = p*10+r;   
		}
		if(p == n1){
			System.out.println("given integer is palindrome");
			
		}else {
			System.out.println("given integer is not a  palindrome");
		}
		
	}

	
	
	
	
	
	
	
	
}

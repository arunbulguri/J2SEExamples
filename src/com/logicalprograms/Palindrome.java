package com.logicalprograms;

public class Palindrome {
	public static void main(String args[]){
		Palindrome o1 = new Palindrome();
		o1.stringPalindrome();
		//o1.integerPalindrome();
		
	}
	

/*	n = 1234;

	input = n;

	P = 0;

	while(n!=0){


	we are trying to get the last digit of the number by %10

	int r = n%10 = 4;     3   2  1

	we are trying to get the quotient to calculate the reminder  repeatedly
	n = n/10;   123,  12,  1,  0

	Now Apply  the palindrome logic
	p = p*10+r ;   (0*10 + 4 = 4) (4*10 + 3 = 43) (43*10 + 2=432) (432*10 + 1=4321);


	}

	   if input ==p{
	syso(it is a palindrome)
	else syso ( it is not a palindrome);*/
	
	
	public void integerPalindrome(){
		int n = 373;
		int input = n;
		int p = 0;
		
		while(n!=0){
			int r = n%10; //2 4 2 
			 n = n/10;  //24 2 0
			 p = p*10+r;    // 2  24  242
			 
			System.out.println(p);
		}
		
		System.out.println(n);
		if (p == input){
			System.out.println("Palindrome");
			
		}else System.out.println("Not Palindrome");
		
		}
		
	
		
		
		
		
	
	
	


	
	
	public void stringPalindrome(){
		
		String s3 = "madam";
		String s4 = "";
		
		for (int i=s3.length()-1;i>=0;i--){
			s4 = s4 + s3.charAt(i);
			}
		System.out.println(s4);
		if (s4.equals(s3)){
			System.out.println("Palindrome");
			
		}else System.out.println("Not Palindrome");
		
		}
	
	
	
	
	
	
	public void m1(){
		
		String s1 = "radar";
		char a1[] = s1.toCharArray();
		System.out.println(a1);
		System.out.println(a1.length);
		
		
		
			//char a2[] = { a1[4],a1[3], a1[2],a1[1],  a1[0] };
		int l=a1.length-1;
		char a2[] = new char[l];
		
		for(int i=l, j=0;i>=0; i--,j++){
	   a2[j] = a1[i];
	   System.out.println(a2[j] + " "+ a1[i]);
			
			
		}
			System.out.println(a2);
			
			
			
			String s2 = String.valueOf(a2);
			
			System.out.println(s2);
			
			if(s1.equalsIgnoreCase(s2)){
				System.out.println("Given string is a palindrome");
			}else{System.out.println("Given string i not a palindrome");
					
				
			
			
	}

}
	}

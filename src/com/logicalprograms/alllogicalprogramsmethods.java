package com.logicalprograms;

public class alllogicalprogramsmethods {

	public static void main(String[] args) {
		
		alllogicalprogramsmethods o1 = new alllogicalprogramsmethods();
		//o1.findfactorial1(0);
		//o1.findfactorial2(0);
		//o1.febonociseries(13);
		//o1.palindromeinteger(272);
		o1.palindromestring();
		
		}
	//1)
   public void findfactorial1(int n){
	   int f =1;
	   if (n<=0){
		   System.out.println("Not a valid Number for factorial");
		   } else {
			   while(n>0){
				    f = f*n ;
				    	n--	;
				   }
			   System.out.println(f);
			  }
	     }
   //2)
   public void findfactorial2(int n){
	   
	   if (n<=0){
		   System.out.println("Not a valid Number for factorial");
		   
	   }else {
		   int f = 1;
		   for(; n>=1;  n--){
		   f = f*n;
		   }
		   System.out.println(f);
		   }
	   
	  }
   
   
   //3)
   public void febonociseries(int n){
	   // 13 =   0,1,1,2,3,5,8,13
	   
	/*  e1,e2,e3  011  1 1 0
       e3 = e1+e2;*/
	   
	  int  e1 = 0;   //  0   1   1  2  3
	  int  e2 = 1;   //  1   1   2  3  5
	  int  e3 = 0;   //  1   2   3  5  8
	   
	   System.out.print(e1 +" "+e2 +" ");   
	   while(e3<=n){
		e3 = e1+e2;
		if (e3<=n){
		System.out.print(e3 + " ");
		   
	   }   
		   e1 = e2;
		   e2 = e3;
	   
	  }System.out.println();
	   
	   
	 
   }
   
   //4)
   public void palindromeinteger(int n){
	   
	   //n = 272;
	   
	   int p = 0;
	   int input  = n;
	   
	   while(n>0){
	   int r = n%10; 
	       n = n/10; 
	       p  = p*10+r;
	   
	   }System.out.println(p);  
	       
	   if(p == input){
		   System.out.println("number is a palindrome");
	   }else {
		   System.out.println("number is not a palindrome");
	   }
	   
	   
	   
   }
   
   //5)
   public void palindromestring(){
	   
	   String s1 = "radat";
	   String s2 = "";
	   
	   for (int i = s1.length()-1;i>=0;i--){
		   
		   s2 = s2 + s1.charAt(i);
	   }
	    System.out.println(s2);
	   
	   
	   
	   
if (s2.equals(s1)){
		   System.out.println("the String is Palindrome");
	   }else {
		   System.out.println("the String is not a Palindrome");
	   }
	   
   }
   
}

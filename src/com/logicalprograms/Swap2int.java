package com.logicalprograms;

public class Swap2int {
	
	public static void main(String args[]){
		
		int a = 5;
		int b = 10;
		System.out.println("Before Swapping a =  " + a  + "    b = "  + b);
		Swap2int  o1 = new Swap2int();
		o1.withThirdVariable(a,b);
		o1.withoutThirdVariable(a, b);
		
				
		
	}
		

	

	public void withThirdVariable(int a, int b){
	System.out.println("withThirdVariable");	
	   int  c = a;
		a = b;
		b = c;
		System.out.println( " After Swapping a =  " + a +"  b =  "+b );
		
	}

   public void withoutThirdVariable(int a, int b){
	   System.out.println("withoutThirdVariable");		
	   a = a+b;
	   b = a-b; 
	   a = a-b;
	   System.out.println( " After Swapping a =  " + a +"  b =  "+b );
	}

}
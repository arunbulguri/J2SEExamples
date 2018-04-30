package com.logicalprograms;

public class ArmStrongExample {

	public static void main(String[] args) {
		
		ArmStrongExample o1 = new ArmStrongExample();
		o1.armStrongNumber(1531);
		
		}

public void armStrongNumber(int n){
	
	
	int input = n;
	int a = 0;
	
	while(n!=0){
	int r = n%10; //3  5  1 
	    n = n/10; //15 1
	    a = a+r*r*r;
	}
	if  (a == input){
	System.out.println("It is a armstrong number" );
	}else System.out.println("It is Not a armstrong number" );

}

}
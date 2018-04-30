package com.logicalprograms;

public class Primenumber {

	public static void main(String[] args) {
		
		Primenumber o1 = new Primenumber();
		/*boolean r = o1.isPrimeornot(5);
		if (r == true){
			System.out.println("the given number is prime number");
		}
		else System.out.println("the given number is not a  prime number");*/
		
	
	o1.printPrimerange();
	
	}
	
	public boolean isPrimeornot(int n){
		boolean v1 = true;
		for (int i = 2;i<n;i++){
			if (n%i == 0){
				v1 = false;
				break;
			} 
			
		}
		
		return v1;
		
	}
	
	
	public void printPrimerange(){
		
		int n1 = 5;
		int n2 = 47;
		int n = n1;
		
		for (;n<=n2;n++){
		int i = 2;
		boolean flag = true;
		while(i<n)	{
			if (n%i==0){
				flag = false;//(n is not a prime number)
				break;
				}
			i++;
		}
		if (flag == true){
			System.out.println(n);
		}
		
		
		
		
		
		
		}
		
		
	
		
	}

}

	



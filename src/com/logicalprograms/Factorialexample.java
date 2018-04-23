package com.logicalprograms;

public class Factorialexample {

	public static void main(String args[]) {
		Factorialexample o1 = new Factorialexample();
		// o1.findfactorial(1);
		// o1.findfactorialusingfor(1);
		o1.findfactorialusingdowhile(0);
	}

	public void findfactorial(int n) {

		if (n <= 0) {
			System.out.println("Not a Valid Number for Factorial calc");

		} else {
			int f = 1;
			while (n != 0) {

				f = f * n;
				n--;
			}
			System.out.println(f);
		}

	}

	public void findfactorialusingfor(int x) {
		
		if (x <= 0) {
			System.out.println("not a valid number for factorial");
		} else {
			int f = 1;
			for (; x >= 1; x--) {
				
				f = f * x;
			}
			System.out.println(f);

		}

	}
	
	
	public void findfactorialusingdowhile(int x){
		
		int n= x;
		
		if(n<=0){
			System.out.println("not a valid number for factorial");
			
		}
		else {
			int f = 1;
		do {
			f = f*n;
			n--;
		}while(n>=1);
		System.out.println(f);
	}
	}




}

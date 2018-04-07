package com.ifelseif;

public class IfElseIfbig2int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		big2Int(10,20);
		big2Int(200,40);
		big2Int(10,10);
	}

	
	public static void big2Int(int a,int b){
		if(a>b)
			System.out.println("a is bigger");
		else if(b>a)
			System.out.println("b is bigger");
		else 
			System.out.println("a and b are same value");
		
	}
}

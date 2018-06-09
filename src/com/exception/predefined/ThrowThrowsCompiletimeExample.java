package com.exception.predefined;

public class ThrowThrowsCompiletimeExample {

	public static void main(String[] args) {
		
		ThrowThrowsCompiletimeExample o1 = new ThrowThrowsCompiletimeExample();
		try {
			o1.m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		
		
		
	}
	
		
		public void m1() throws Exception {
			System.out.println("m1 started");
			
			m2();
			
			System.out.println("m1 ended");
		}

		
		public void m2() throws Exception {
			System.out.println("m2 started");
			
			m3();
			
			System.out.println("m2 ended");
		}
		
		public void m3() throws Exception{
			System.out.println("m3 started");
		int a = 3;
		int b = 2;
		int c = a/b;	
		if (c<=0){
			throw new Exception("wrong operation");
		}
			
			System.out.println("m3 ended");
		}

	}



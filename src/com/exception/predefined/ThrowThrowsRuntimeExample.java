package com.exception.predefined;

public class ThrowThrowsRuntimeExample {

	public static void main(String[] args) {
		ThrowThrowsRuntimeExample o1 = new ThrowThrowsRuntimeExample();
		
		try {
			o1.m1();
		}catch(RuntimeException e1) {
			
			System.out.println(e1.getMessage());
			
			
		}
		
		
	}
		
		public void m1(){
		
			System.out.println("m1 Started");
			
				m2(1	);
				
				System.out.println(" m1 ended");
			
				
			}
		
			public void m2(int a) {
				
				System.out.println("m2 started");
			if (a<=0){
				throw new RuntimeException("invalid input");
				
			}
			System.out.println("m2 ended");
			
		}
	}


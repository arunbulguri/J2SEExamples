package com.exception.predefined;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		TryCatchFinallyExample o1 = new TryCatchFinallyExample();
		//o1.arithmeticException();
		o1.nullPointerException();
		
	}

	private void m1(){
		
	}
	
	
	
	//using Java 7 Catch Block syntax
	private void nullPointerException1(){
		TryCatchFinallyExample o2 = null; 	
		o2 = new TryCatchFinallyExample();
		
		try{
			o2.m1();
			int c = 1/0;
			
		}catch (NullPointerException |ArithmeticException  e2 ){
		System.out.println("expected user message");	
		}catch (RuntimeException e2){
			System.out.println("in RuntimeException");
			}
	}
	
	
	private void nullPointerException(){
		TryCatchFinallyExample o2 = null; 	
		o2 = new TryCatchFinallyExample();
		
		try{
			o2.m1();
			int c = 1/0;
			
		}catch (NullPointerException e2){
		System.out.println("in NullPointerException");	
		}catch (ArithmeticException e3){
			System.out.println("in Arithmetic Exception");	
		}catch (RuntimeException e2){
			System.out.println("in RuntimeException");	
			}/*catch (ArithmeticException e3){
				System.out.println("in RuntimeException");	
			}*/  //this is unreachable catch block because catch block order should be from child to parent
	}
	
	private  void arithmeticException() {
		int a = 1;
		int b = 0;
		//int c = a/b;
		try{
			int c = a/b;
			System.out.println(c);
			}catch(ArithmeticException e1) {
				System.out.println("Please enter the Non Zero value for b");
				
			}finally{
				System.out.println("this block is usually used for  resources Closing" );
				
			}
	}

}

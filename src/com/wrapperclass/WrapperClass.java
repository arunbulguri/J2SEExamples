package com.wrapperclass;

public class WrapperClass {
	
	int i1;
	boolean b1;
	float f1;
	double d1;
    char c1;
    
   //Writing the wrapper classes for above primitive data types:- 
   
    Integer i2;
    Boolean b2;
    Float f2;
    Double d2;
    Character c2;
    
    
    public void m1(int i1){
    	
    	System.out.println("this is a primitive m1");
    	
    }
    
    
 public void m1(Integer i2){
    	
	 	System.out.println("this is a Wrapper m1");
    	
    }
    
    public void pprim(){
    	
    	System.out.println("i1 = " + i1   + "   b1 = " + b1 +"   f1 = " + f1   + "   d1 = " + d1 + "  c1 =" + c1);
    	
    }
    
    
public void pwrapClass(){
	System.out.println("i2 = " + i2   + "   b2 = " + b2 +"   f2 = " + f2   + "   d2 = " + d2 + "  c2 =" + c2);
	
    }


public static void main(String[] args){
	
	WrapperClass o1 = new WrapperClass();
	o1.pprim();
	o1.pwrapClass();
	
	//int i=5;
	//Integer i1 = i;
	
	//Integer i2 = new Integer(10);
	
	//o1.m1(i);
	
	//o1.m1(i1);
	
	//o1.m1(Integer.valueOf(i));
	
	Integer i2 = 10;
	o1.m1(i2);
	//o1.m1(i2.intValue());
	
	
	
	
	
}
    
    
    
    

}

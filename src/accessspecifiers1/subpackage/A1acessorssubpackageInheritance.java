package accessspecifiers1.subpackage;

import accessspecifiers1.A1;

public class A1acessorssubpackageInheritance extends A1{
	
public void m1(){
		
		//privatevariable = 10;// As this is private variable, it will not be visible
		//defualtvariableA1 = 15;//it is not accessable in the subpackage classes
		protectedvariableA1 = 20;
		publicvariableA1 = 25;
		
		A1 o2 = new A1();
		//o2.protectedvariableA1 = 65;//As this is protected variable, it will not be visible by creating object.
		o2.publicvariableA1 = 55;
		
		
		int a;
		
		
		
		
		
	}
	
	

}

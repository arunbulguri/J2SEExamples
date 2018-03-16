package accessspecifiers2;

import accessspecifiers1.A1;

public class A1AccessorsinDifferentPackageInheritance extends A1 {
	
	public void m1(){
		
		//privatevariable = 10;// As this is private variable, it will not be visible
		//defualtvariableA1 = 15;//
		protectedvariableA1 = 20;//there is no problem in accessing protected variable in this way. if we access this varaible using object name it will give a compilation error.
		publicvariableA1 = 25;
		
		
		
		A1 o1 = new A1();
		//o1.privatevariable = 10;// As this is private variable, it will not be visible
		//o1.defualtvariableA1 = 15;
		//o1.protectedvariableA1 = 20;//this is compilation error.
		o1.publicvariableA1 = 25;
		
		
		
		
		
	}
}

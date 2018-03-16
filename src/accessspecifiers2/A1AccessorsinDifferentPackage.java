package accessspecifiers2;

import accessspecifiers1.A1;

public class A1AccessorsinDifferentPackage {
	/*private int privatevariableB1;
	//default int b;// we should not add default, it throws compilation error
	int defualtvariableB1;
	protected int protectedvariableB1;
	public int publicvariableB1;*/
	
	
	public void m2(){
		A1 o1 = new A1();
		//o1.privatevariable = 10;// As this is private variable, it will not be visible
	//	o1.defualtvariableA1 = 15;//because it cannot be accessed in different package
	//	o1.protectedvariableA1 = 20;////because it cannot be accessed in different package
		o1.publicvariableA1 = 25;// it can be accessed in different package because it is a public variable.
		
	
		
		
		
			
	}


}

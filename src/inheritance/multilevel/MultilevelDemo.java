package inheritance.multilevel;

public class MultilevelDemo {
	public static void main(String[] args) {
	/*HierarchialSuperClass o1 = new HierarchialSuperClass();
	o1.superM1();
	o1.superM2();*/
	
	Multilevel2SuperClass o2 = new Multilevel2SuperClass();
	
	o2.superM1();
	o2.superM2();
	o2.superM3();
	o2.superM4();
	
	MultilevelSubClass o3 = new MultilevelSubClass();
	o3.superM1();
	o3.superM2();
	
	//Here we are able to access the multilevel1Superclass methods from the above subclass.
	
	
    
	
	Multilevel1SuperClass o4 = new Multilevel2SuperClass();
	o4.superM1();
	o4.superM2();
	
	// here as we have created subclass object with  SuperClass reference & thus we can access only superclass methods
	
	
	
	Multilevel2SuperClass o5 = new MultilevelSubClass();
	o5.superM1();
	o5.superM2();
	o5.superM3();
	o5.superM4();
	
	//
	
	Multilevel1SuperClass o6 = new MultilevelSubClass();
	o6.superM1();
	o6.superM2();
	
	//
	
	
	
	}
	

}

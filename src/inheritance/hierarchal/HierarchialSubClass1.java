package inheritance.hierarchal;

public class HierarchialSubClass1 extends  HierarchialSuperClass{
	
	public void subM1(){
		System.out.println("HierarchialSubClass1 subM1");
		
		System.out.println("Before Overriding s Value = "   + s);
		
		
	 s = "sub1 variable";
	 System.out.println("HierarchialSuperClass s  OverRidden in HierarchialSubClass1 " + s);
	 //i = 20; //It is private variable in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
	 }
	
	public void subM2(){
		System.out.println("HierarchialSubClass1 subM2");
	}

}

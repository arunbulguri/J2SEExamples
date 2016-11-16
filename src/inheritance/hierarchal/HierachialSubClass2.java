package inheritance.hierarchal;

public class HierachialSubClass2 extends  HierarchialSuperClass {
	
	
	
	public void subM1(){
		System.out.println("HierachialSubClass2 subM1");
	 s = "sub2 variable";
	 System.out.println("HierarchialSuperClass s  OverRidden in HierarchialSubClass2 " + s);
	 //i = 20; //It is private variable in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
	 }
	
	public void subM2(){
		System.out.println("HierachialSubClass2 subM2");
	}

}

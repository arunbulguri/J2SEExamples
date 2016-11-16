package inheritance.hierarchal;

public class HierarchialSubClass3 extends  HierarchialSuperClass {
	
	public void subM1(){
		System.out.println("HierarchialSubClass3 subM1");
	 s = "sub3 variable";
	 System.out.println("HierarchialSuperClass s  OverRidden in HierarchialSubClass3 " + s);
	 //i = 20; //It is private variable in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
	 }
	
	public void subM2(){
		System.out.println("HierarchialSubClass3 subM2");
	}

}

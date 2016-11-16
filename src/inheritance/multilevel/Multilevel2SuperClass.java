package inheritance.multilevel;

public class Multilevel2SuperClass extends  Multilevel1SuperClass{
	
	public void superM3(){
		System.out.println("Multilevel2SuperClass1 superM3");
		
		System.out.println("Before Overriding s Value = "   + s);
		
		
	 s = "sub1 variable";
	 System.out.println("Multilevel1SuperClass s  OverRidden in Multilevel2SuperClass " + s);
	 //i = 20; //It is private variable in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
	 }
	
	public void superM4(){
		System.out.println("Multilevel2SuperClass1 superM4");
	}

}

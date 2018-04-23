package inheritance.hierarchal;

public class Class5demo extends Class1 {
	
	
	public static void main(String [] args){
		
		Class1 o1 = new Class1();
		Class2 o2 = new Class2();
		Class3 o3 = new Class3();
		Class4 o4 = new Class4();
		
		
		o1.a = 50;
		o1.b = 25;
		o1.c = 15;
		o1.d = 5;
		
		
		
		
	System.out.println(o1.m1());    
	System.out.println(o1.m2());
	
	System.out.println(o2.m3());
	System.out.println(o2.m4());
	
	System.out.println(o3.m5());
	System.out.println(o3.m6());
	
	System.out.println(o4.m7());
	System.out.println(o4.m8());
	
	
	
	
		
		
		
		
		
	}

}

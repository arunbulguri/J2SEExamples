package polymorphism.compiletime;

public class CompileTimePolymorphism {
	
	
	public void m1(){
		System.out.println("m1()");
	}
	public void m1(int a){
		System.out.println("m1(inta)   "+ a);
		
	}
	public void m1(int a, int b){//Number of Arguments are Different
		System.out.println("m1(inta, int b)   "+ a + "  " + b);
		
	}
	
	
	public void m1(int a, String b){//type of Arguments are Different compared to above method
		System.out.println("m1(inta, String b)   "+ a + "  " + b);
		
	}
	
	public void m1(String a, int b){//Order of Arguments are Different compared to above method
		System.out.println("m1(String a, int b)   "+ a + "  " + b);
		
	}
	
	/*private void m1(){
		System.out.println("m1()");
	}*///Access Specifiers are not Considered in Polymorphism
	
	/*public int m1(){
		System.out.println("m1()");
		return 0;
	}*/// return type are not considered in polymorphism
	
	
	public static void main(String[] args) {
		
		CompileTimePolymorphism o1 = new CompileTimePolymorphism();
		o1.m1();
		o1.m1(10);
		o1.m1(2,5);
		o1.m1(1, "Arun");
		o1.m1("kiran", 100);
		
		
		
		
		
	

	}

}

package inheritance.single_1;

public class ClassA {
	public int Id1;
	public int Id2;
	private String Name;
	
	
	public ClassA(){
		System.out.println("this is classA constructor");
	}
	
	public static void m1(){
		System.out.println("This Arun");
		
	}
	
	public int m1(int Id1,int Id2){
		int sum = Id1+Id2;
		return sum;
		
		
	}
	
	public void m1(int Id1, String Name){
		System.out.println( Id1 + Name);
		
	}

}

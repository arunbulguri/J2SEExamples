package finalvariables;

public class Finalvariable2 {
	
	
	public final int a = 5;
	
	public void m1(){
		
		/* a = 25;*/
		System.out.println(a);
		
	}
	
	
	
	public static void main(String[] args){
		
		Finalvariable2 finalvariable = new Finalvariable2();
		System.out.println(finalvariable.a);
		
		/*finalvariable.a = 15;*/
		System.out.println(finalvariable.a);
		
		
		finalvariable.m1();
		
	}

}

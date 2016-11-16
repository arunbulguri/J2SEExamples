package staticexamples;

public class StaticMethodsBlocks {
	
	{
		System.out.println("Instance Block1");
	}//Instance Block
	
	static {
		System.out.println("Static Block1");
	}//static Block1
	
	public StaticMethodsBlocks(){
		System.out.println("default constructor");
	}
	
	public StaticMethodsBlocks(int i){
		System.out.println("one argument constructor");
	}
	
	
	
public static void staticM1(){
	
	System.out.println("staticM1");
	
}


{
	System.out.println("Instance Block2");
}//Instance Block

public void m2(){
	System.out.println("Normal Methodm2" );
}
static {
	System.out.println("Static Block2");
}//static Block2



}

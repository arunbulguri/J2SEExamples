package finalmethods2;

public class FinalSubMethod extends FinalSuperMethod{
	
	
	public  void m1(){
		System.out.println("this is subclass m1");
		
	}
	
	/*public  void m2(){
		System.out.println("this is subclass m2");
		
	}*/ //Compile time error -  it cannot be overriden as method int he super class is already final;

	
	public final void m3(){
		System.out.println("this is subclass m3");
		
	}
	public FinalSubMethod() {
		// TODO Auto-generated constructor stub
	}
}

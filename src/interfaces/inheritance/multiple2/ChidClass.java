package interfaces.inheritance.multiple2;

public class ChidClass extends P1Abstract implements Iparent2{

	
	public void m1() {
		
		System.out.println("Overridden m1( Iparent2)");
		
		
		
	}
	
	

	

	
	public static void main(String [] args){
		
		P1Abstract o1 = new ChidClass();
		o1.m1();
		
		
		Iparent2 o2 = new ChidClass();
		o2.m1();
		
	}
}

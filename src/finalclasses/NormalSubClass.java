package finalclasses;

public class NormalSubClass //extends FinalSuperClass //final SuperClass cannot be inherited.
{

	public void m3(){
		System.out.println("normalsubclassm3 started");
		
		FinalSuperClass o1 = new FinalSuperClass();
		o1.m1();
		o1.m2();
		System.out.println("normalsubclassm3 ended");
	}
	
	public static void main(String[] args){
		NormalSubClass o2 = new NormalSubClass();
		o2.m3();
		
		
	}
}

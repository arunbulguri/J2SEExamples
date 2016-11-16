package polymorphism.singleinheritance;

public class SingleDemo {

	public static void main(String[] args) {
		SingleSuperClass o1 = new SingleSuperClass();
		o1.m1();
		
		SingleSubClass o2 = new SingleSubClass();
		o2.m1();
		
		SingleSuperClass o3 = new SingleSubClass();
		o3.m1();
		
		
		
		
	}
	

}

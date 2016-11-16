package polymorphism.abstractinterfaceinheritance;

public class Demo {

	public static void main(String[] args) {
		Level1Interface o1 = new Level3Class();
		o1.m1();
		Level2AbstractClass o2 = new Level3Class();
		o2.m20();
		
		

	}

}

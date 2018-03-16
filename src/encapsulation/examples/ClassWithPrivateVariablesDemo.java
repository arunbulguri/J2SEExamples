package encapsulation.examples;

public class ClassWithPrivateVariablesDemo {

	public static void main(String[] args) {
		ClassWithPrivateVariables o1 = new ClassWithPrivateVariables();
		o1.setI1(3);
		//o1.setI1(5);
		System.out.println(o1.getI1());
		
System.out.println(o1.getS1());
o1.setS1("Arun");
System.out.println(o1.getS1());

		
		

	}

}

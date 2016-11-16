package encapsulation.examples;

public class ClasswithPublicPrivateVariablesDemo {

	public static void main(String[] args) {
		
		ClasswithPublicPrivateVariables o1 = new ClasswithPublicPrivateVariables();
		o1.i2 = 5;
		o1.setI1(10);
		System.out.println(o1.i2);
		System.out.println(o1.getI1());
		
		

	}

}

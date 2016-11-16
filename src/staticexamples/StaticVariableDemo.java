package staticexamples;

public class StaticVariableDemo {
	
public static void main(String[] args){
		
		//we can access the static variable using the class name instead of creating the object
		System.out.println("StaticVariable.b"  + StaticVariable.b);
		
		
		StaticVariable o1 = new StaticVariable();
		
		System.out.println("StaticVariable.a" + o1.a );
		
		System.out.println("StaticVariable.b" + o1.b);
		
	}
}

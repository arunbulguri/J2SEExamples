package constructors.examples;

public class DefaultConstructor {
	
	
	private int a;
	private String s;
	
	
	public  DefaultConstructor(){
		
		a = 10;
		s = "Arun";
		
		System.out.println("DefaultConstructor   a = " + a  + "s =  " + s);
	}
	
	
	public static void main(String[] args){
		DefaultConstructor o1 = new DefaultConstructor();
		
	}

}

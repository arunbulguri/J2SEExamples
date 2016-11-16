package staticexamples;

public class StaticMethodsBlocksDemo {
	
	static StaticMethodsBlocks o1;
	public static void main(String[] args){
		System.out.println("Accessing staticm1 method in static way");
		
		StaticMethodsBlocks.staticM1();	
		
		
		System.out.println("o1 =   " + o1);
		
		o1 = new StaticMethodsBlocks();
		
		System.out.println("o1 =   " + o1);
		StaticMethodsBlocks o2 = new StaticMethodsBlocks(5);
		
		
		
		/*StaticMethodsBlocks.staticM1();	 
		
		StaticMethodsBlocks o1 = new StaticMethodsBlocks();
		
		System.out.println("Accessing staticm1/m2 methods by creating object" );
		o1.staticM1();
		o1.m2();*/
		
		
	}

}

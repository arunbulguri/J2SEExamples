package inheritance.single_1;

public class SingleDemo {
	static SingleSuperClass o1;
	public static void main(String[] args) {
		//SingleSuperClass o1; //new SingleSuperClass();
		System.out.println(1/0);
		o1.superM1();
		//o1.superM2();//As superM2 is Private method in SingleSuperClass
		
		SingleSubClass o2 = new SingleSubClass();
		o2.subM1();
		o2.superM1();
		/*AsSingleSubClass extends SingleSuperClass , 
		thus we are able to Access the public method of the SingleSuperClass
	*/
		
		SingleSuperClass o4; 
		SingleSuperClass o3 = new SingleSubClass();
		o3.superM1();// methods are visible for the class which has reference created
		//
		
	}
	

}

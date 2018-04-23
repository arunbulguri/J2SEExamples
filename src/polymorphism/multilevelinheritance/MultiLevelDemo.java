package polymorphism.multilevelinheritance;

public class MultiLevelDemo {
	
	public static void main(String []args){
		
	C4 c4 = new C4();
	c4.m1();
	
	//P1 p1 = new P3C2();
	//p1.m1();
	
	P2C1  p2c1 = new P4C3();
	/*p2c1.m1();
	p2c1.m2();
	
	
	
	P3C2 p3c2 = new C4();
	p3c2.m1();
	p3c2.m2();
	p3c2.m3();
		
	*/
	
	}

}

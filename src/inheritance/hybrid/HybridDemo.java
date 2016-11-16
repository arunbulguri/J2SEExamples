package inheritance.hybrid;

public class HybridDemo {

	public static void main(String[] args) {
		
		
		HybridLevel1Super1 o1 = new HybridSubClass();

		HybridLevel2Super1 o2 = new HybridSubClass();
		

		HybridLevel2Super2 o3 = new HybridSubClass();
		
		HybridSubClass o4 = new HybridSubClass();
		
		o1.level1m1();
		
		o2.level2m1();
		o2.level1m1();
		o2.commmonmethod();
		
		
		o3.level2m2();
		o3.level1m1();
		o3.commmonmethod();
		
		
		o4.level3m1();
		o4.level1m1();
		o4.level2m1();
		o4.level2m2();
		o4.commmonmethod();
		
		
		
		
		

	}

}

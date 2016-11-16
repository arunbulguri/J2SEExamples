package inheritance.hybrid;

public class HybridSubClass implements HybridLevel2Super1, HybridLevel2Super2{
	
	
	public void level3m1() {
		System.out.println("level3m1");
		
	}
	

	@Override
	public void level1m1() {
		System.out.println("level1m1");
		
	}
	
	public void level2m1(){
		System.out.println("leve2m1");
		
	}

	@Override
	public void level2m2() {
		System.out.println("level2m2");
		
	}

	@Override
	public void commmonmethod() {
		System.out.println("commonmethod");
		
	}

	

	
	

}

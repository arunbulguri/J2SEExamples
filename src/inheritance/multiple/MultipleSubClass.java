package inheritance.multiple;

public class MultipleSubClass implements MultipleSuper1, MultipleSuper2{

	@Override
	public void super2m1() {
		System.out.println("super2m1");
		
	}

	@Override
	public void super1m1() {
		System.out.println("super1m1");
		
	}

	@Override
	public void commmonmethod() {
		System.out.println("commmonmethod");
		
		
		
	}
	

}

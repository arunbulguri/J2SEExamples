package thisexamples;

public  class ThisExample {
	private int a;

	public void printA(int a) {
		this.a = 20;
		System.out.println("a   " + a);

	}

	public static void main(String[] args) {

		ThisExample o1 = new ThisExample();
		System.out.println(o1.a);
		o1.printA(10);

		System.out.println(o1.a);
	}

}

package constructors.examples;

public class OverLoadedConstructor {

	private int a;
	private String s;

	public OverLoadedConstructor() {
		a = 10;
		s = "Arun";

		System.out.println("OverLoadedDefaultConstructor   a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(int a) {

		s = "Kiran";

		System.out.println("OverLoadedConstructor(int a)   a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(String s) {

		a = 30;

		System.out.println("OverLoadedConstructor(String s)   a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(int a, String s) {

		System.out.println("OverLoadedConstructor(int a, String s)  a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(String s, int a) {

		System.out.println("OverLoadedConstructor( String s, int a)   a = " + a + "s =  " + s);
	}

	public static void main(String[] args) {
		OverLoadedConstructor o1 = new OverLoadedConstructor();
		OverLoadedConstructor o2 = new OverLoadedConstructor(5);
		OverLoadedConstructor o3 = new OverLoadedConstructor("Naresh");
		OverLoadedConstructor o4 = new OverLoadedConstructor(25, "Eswar");
		OverLoadedConstructor o5 = new OverLoadedConstructor("Soumya", 50);

	}

}

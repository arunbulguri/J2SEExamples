package inheritance.multilevel;

public class Multilevel1SuperClass {

	public int i  = 2;
	public String s = "super variable";
	
	
    public void superM1(){
		System.out.println("Multilevel1SuperClass superM1 : i =" + i + " s="+s);
	}
	
	public  void superM2(){
		System.out.println("Multilevel1SuperClass superM2");
	}
	
}

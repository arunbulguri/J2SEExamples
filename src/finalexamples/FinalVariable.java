package finalexamples;

public class FinalVariable {
	
	private String s;
	
	
	private final String t  = "t1";
	
	
	
	public void m1(){
		s = "s1";
		//t = "t2";//Cannot reinitialize final variable
		
		
		
	}
	public void m2(){
		s = "s2";
		//t = "t3";
	}
	
	
	

}

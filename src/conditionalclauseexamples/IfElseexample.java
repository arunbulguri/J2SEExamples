package conditionalclauseexamples;

public class IfElseexample {
	
	
	public int bigoftwonum1(int a,int b){
		
		if(a==b){
			System.out.println("a and b are same");
			return a;
			}
		
		if(a<b){
			//System.out.println("10 is less than 13");
			return b;
			}
		
		else{
			//System.out.println("13 is greater than 10");
			return a;
		}
		
		/*if(a==b){
		System.out.println("a and b are same");
		return a;
		}*/// Unreachable code because return statement is getting executed in else block which is making to come out of method.

}
	
	public static void main(String[] args) {
		IfElseexample o1 = new IfElseexample();
		 int c = o1.bigoftwonum1(5, 10);
		 System.out.println(c);
		 
	}
}

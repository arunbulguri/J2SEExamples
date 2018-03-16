package conditionalclauseexamples;

public class IfClause {
	
	public void m1(){
		if(true)//this always executes because condition is always true
			System.out.println("Always Executes");//if there is only one statement to be executed we dont need to open curly braces but this is not a good practice.
		
	    if(false) {//this never executes because condition is always false
		System.out.println("Never Executes");
	}
	}
	
	
	//10, 13
	
	public int bigoftwonum1(int a,int b){
	if(a<b){
		//System.out.println("10 is less than 13");
		return b;
		}
	
	if(a>b){
		//System.out.println("13 is greater than 10");
		return a;
	}
	System.out.println("a and b are same");
	return a;
	}
	
	
	public int bigoftwonum2(int a,int b){
		
		////This is Not a good practice. we introduce extra(Unnecessary) varibale c which does not give any additional benefits 
		int c = 0;
		if(a<b){
			//System.out.println("10 is less than 13");
			//return  b;
			c = b;
			}
		
		if(a>b){
			//System.out.println("13 is greater than 10");
			//return   a;
			c = a;
		}
		
		if (a ==b){
		
		System.out.println("a and b are same");
		c = a;
		}
		
		return  c ;
		
		}
	
	
	public static void main(String[] args) {
		IfClause o1 = new IfClause();
		//o1.m1();
		//System.out.println(o1.m1());//we cannot give void type methods in syso
		//System.out.println(o1.bigoftwonum1(10, 10));
		int result = o1.bigoftwonum1(10, 20);
		System.out.println(result);
	int d = o1.bigoftwonum2(10, 30);
	System.out.println(d);
	
		
		
	}
}
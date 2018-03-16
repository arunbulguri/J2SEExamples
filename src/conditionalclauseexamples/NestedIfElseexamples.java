package conditionalclauseexamples;

public class NestedIfElseexamples {
	
	
public int bigoftwonum2(int a,int b){
		
		////This is Not a good practice. we introduce extra(Unnecessary) varibale c which does not give any additional benefits 
		int c = 0;
		
		if(a<b){
			//System.out.println("10 is less than 13");
			//return  b;
			c = b;
			}
		
		else if(a>b){
			//System.out.println("13 is greater than 10");
			//return   a;
			c = a;
		}
		
		else  {
		
		System.out.println("a and b are same");
		c = a;
		}
		
		return  c ;
		
		}


public static void main(String[] args) {
	NestedIfElseexamples o1 = new NestedIfElseexamples();
	int d = o1.bigoftwonum2(50,35);
	System.out.println(d);
}

}

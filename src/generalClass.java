
public class generalClass {
	
public void printp1(){
	System.out.println("this is a method1");
	}
public void printp2(int id){
	System.out.println("this is a 1 argument method" + "   " + id);
}

public int printp3(int id2){
	return id2 + 1;
	}

public int add(int a, int b)	{
	int c = a+b;
	return c;
}
	
public int add(int a, int b, int c)	{
	int d = a+b+c;
	return d;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a =1;
		generalClass o1 = new generalClass();
		//o1.printp1();
		//o1.printp2(5);
		//o1.printp3(8);
		int a = o1.printp3(8);
		//System.out.println(o1.printp3(8));
		  
//		  o1.printp2(a);
//		  o1.printp2(a);
//		  o1.printp2(a);
		int x =  o1.add(5, 6,7);
	   System.out.println (o1.printp3(x));
	    
		 
		
		

	}

}

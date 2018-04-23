package inheritance.single_2;

public class SingleDemo2 {
	public static void main(String[] args){
		
		
		
		/*SingleSub2 o1 = new SingleSub2();
		o1.singleSuperM1();
        System.out.println(o1.x);
		System.out.println(o1.singleSuperM1());
		
		o1.singleSub2M1();*/
		
		/*SingleSuper2 o2 = new SingleSuper2();
		o2.x = 8;
		System.out.println(o2.x);
		o2.singleSuperM1();*/
		
		
		SingleSuper2 o3 = new SingleSub2();
		o3.x = 11;
		System.out.println(o3.singleSuperM1());
		
		
		
		//SingleSuper2 Constructor
		//SingleSub2 Constructor
		
		//	o3.singleSub2M1();
		// The above SingleSub2M1 is not acessable because in 
		//line 13 we created Reference variable for SingleSuper2 Class
		
		
		
		
		
	}

}


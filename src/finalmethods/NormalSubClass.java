package finalmethods;

public class NormalSubClass extends SuperClassFinalMethods{
	

public void m1(){
	System.out.println("finalsubclassm1  Started");
	m2();//Even tough m2 is Final method in superclass We can Still Access final methods in SubClasses.
	System.out.println("finalsubclassm1  Ended");	
}


/*public final void m2(){//Cannot override the final methods of SuperClass
	System.out.println("finalsubm2");
	}*/
public static void main(String[] args){
	NormalSubClass o1 = new NormalSubClass();
	o1.m1();
	
	
	
}

}


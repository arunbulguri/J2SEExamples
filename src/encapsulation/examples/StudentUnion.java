package encapsulation.examples;

public class StudentUnion {
	
	
	public static void main(String []args){
	    String S;
	    S = "Kiran";
		Student o1;
		o1 = new Student();
		o1.setID(8);
		o1.setName("Arun");
	    o1.setEnrolled(true);
	    o1.setAmt(200);
		System.out.println(o1.getID()+ "  "+o1.getName()+"   "+o1.getEnrolled()+ "   "+ o1.getAmt());
		
		
		
	}	
}


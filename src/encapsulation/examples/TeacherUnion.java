package encapsulation.examples;

public class TeacherUnion  {
	
	private String ourteachersunion;
	
	public static void main(String [] args){
		
		
		
		Teacher o1 = new Teacher();
		o1.setID(001);
		o1.setName("Kiran");
		o1.setSchoolName("SFS High School");
		o1.setUnionName("TTU");
		o1.setAmount(1200);
		o1.setCity("Nizamabad");
		o1.State = "Telangana";
		
		System.out.println(o1.getID()+ "  "+o1.getName()+ "   "+o1.getSchoolName()+ "   "+o1.getUnionName()+ "  "+o1.getAmount()+"   "+o1.getCity()+"  "+o1.State);
		
		
		
		
		
		
		
	}

}

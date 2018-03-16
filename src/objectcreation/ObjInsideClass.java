package objectcreation;

public class ObjInsideClass {
	
	private int x;
	String y = "Y";
	int x1;
	
	 
	//System.out.println(o1.x);
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public static void main(String[] args) {
		ObjInsideClass  o1 = new ObjInsideClass();
		o1.x = 4;
		System.out.println(o1.x + "  " + o1.y  + o1.x1);
		
	}
	

}

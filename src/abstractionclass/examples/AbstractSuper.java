package abstractionclass.examples;

public abstract class AbstractSuper {
	
	public abstract void abstractSuperM1();
	
	public void abstractSuperM2(){
		System.out.println("This is abstractSuperM2");
	}
	
	//Constructor name should be equal to Classname
	public AbstractSuper(){
		System.out.println("AbstractSuper");
	}

}

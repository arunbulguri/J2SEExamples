package com.innerclassanomimous;

public class InterfaceDemo {
	
	

	public static void main(String[] args) {
		
		I1 o1 = new I1(){
        public void interfacem1() {
				System.out.println("Interfacem1");
				annonimousm1();
			}
        public void annonimousm1(){
        	System.out.println("annonimousm1");
       
        }
			
		};

		o1.interfacem1();
		
		
	}

}

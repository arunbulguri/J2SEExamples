package com.collectionExamples;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Product1 {
	
	
	
	public static void main(String[] args){
		
		Product o1 = new Product( 001, "Lexus", "Toyota");
		Product o2 = new Product( 002, "Acura", "Honda");
		Product o3 = new Product( 003, "Pathfinder", "Nissan");
		Product o4 = new Product( 001, "Lexus", "Toyota");
		
		//List<Product> l1 = new ArrayList<>();
		Set<Product> l1 = new HashSet<>();
  l1.add(o1);
  l1.add(o2);
  l1.add(o3);
  l1.add(o4);
 
  
 // removebrand(l1,1);

  
  for(Product i:l1){
	  System.out.println(i.getPID() + "  " +  i.getPNAME()+"  "+ i.getPBRAND());
	  }
	
  
  
  
  
	//caravailability(l1,"Infiniti");
	//removebrand(l1,1);

	
	
	}

	private static void caravailability(List<Product> l1, String Input) {
		boolean b = false;
		for (Product i:l1){
			
			if(Input.equals(i.getPNAME())){
				b = true;
				System.out.println(i.getPNAME() + "   " + "Car is Available in showroom" );
				break;
			}
			
		}
		
		if (b==false){
			System.out.println(Input + "     Car is Not Available in showroom" );
		}
	
	}
		
	

      public static void removebrand(List<Product> l1, int Input){
    	  
    	  for (Product i:l1){
    		 
    		  if(i.getPID()== Input){
    		System.out.println(l1.indexOf(i));
    			  }
    	  }
    	  l1.remove(Input);
      }



}
	


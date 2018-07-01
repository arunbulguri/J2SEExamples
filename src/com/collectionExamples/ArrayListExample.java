package com.collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayListExample {
	
	
	public void  converttoset(List l1){
		
		Set s1 = new HashSet(l1);
		
		System.out.println("Converted Set  " + s1);
		
		
		}

	public static void main(String[] args) {
		
	
		
		ArrayListExample o = new ArrayListExample();	
		
	 //List<String> o1 = new ArrayList<>();
	//	List<String> o1 = new Vector<>();
		List<String> o1 = new LinkedList<>();
		
		
	 o1.add("Arun");
	 o1.add("Arun1");
	 o1.add("Arun");
	 o1.add(null);
	 o1.add("Arun");
	 o1.add(null); 
	 o1.add("Arun");
	 o1.add("Arun1");
	 o1.add("Arun");
	 o1.add(null);
	 o1.add("Arun");
	 o1.add(null);
	 
	 
	 
	 
	 
	 
	 
	 System.out.println(" list = " + o1);
	 
	 /*System.out.println("Element at index 1 " + o1.get(1));
	 
	 System.out.println("iterating arrya list ");
	 
	 for(String s : o1){
		 
		 System.out.println(s);
	 }

	o.converttoset(o1);
	 */
	}

}

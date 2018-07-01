package com.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class AddArraylist {
	
		
	public static void main(String[] args){
		
		List<Integer> l1 = generatenumbersinlist();
	    System.out.println(l1);
		evensum(l1);
		oddsum(l1);
		
	}




	private static void oddsum(List<Integer> l1) {
		int 	j = 0;
		for(int i:l1){
			
	      if(i%5 !=0 && i%2!=0 ){
	    	     j = j+i;
		}
		
	}	
	  System.out.println(j);
	}

	
	private static void evensum(List<Integer> l1) {
		int 	j = 0;
		for(int i:l1){
			
	      if(i%5 !=0 && i%2==0 ){
	    	  System.out.print(i + "  ,  ");
	    	     j = j+i;
		}
		
	}	
	  System.out.println(j);
	}
	
	
		private static List<Integer> generatenumbersinlist() {
		List<Integer> l1 = new ArrayList<>();
		int i = 1;	
	    while (i<=100) {
		l1.add(i);
		i++;
		
	}
		return l1;
	}
}

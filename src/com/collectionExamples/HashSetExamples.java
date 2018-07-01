package com.collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExamples {

	public static void main(String[] args) {
		

		//Set<String> o1 = new HashSet<>();
		//Set<String> o1 = new LinkedHashSet<>();
		Set<String> o1 = new TreeSet<>();  // Tree set Does Not allow Null Elements. It will throw Null Pointer Exception.
		 o1.add("Arun");
		 o1.add("Soumya");
		 o1.add("Anil");
		// o1.add(null);
		 o1.add("Arun1");
		 //o1.add(null);
		 
		 
		 System.out.println(o1);
		 
		 for(String s : o1){
			 
			 System.out.println(s);
		 }

		}

	}

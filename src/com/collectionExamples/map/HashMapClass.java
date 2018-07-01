package com.collectionExamples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
	
	
	public static void main(String[] args){
		
		
		Map<Integer, String > m1 = new HashMap<>();
		//System.out.println(m1.isEmpty());
		m1.put(1, "Arun");
		m1.put(2, "Kiran");
		m1.put(3, "Arun");
		m1.put(2, "Anil");
		m1.put(null ,"Arun");
		
		/*System.out.println(m1.isEmpty());
		
		System.out.println(m1.size());
		
		System.out.println(m1);
	
		System.out.println(m1.containsKey(null));
		
		System.out.println(m1.containsValue(null));
		m1.replace(2, "Soumya");
		
		System.out.println(m1);
		
		*/
	Set<Integer> s1 = 	m1.keySet();
	//System.out.println(s1);
	
	for (Integer i:s1){
		
		System.out.println(i + " : " + m1.get(i));
		
	}
	}

}

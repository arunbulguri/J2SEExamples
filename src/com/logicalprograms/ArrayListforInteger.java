package com.logicalprograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArrayListforInteger {
	
	public static void main(String[] args){
		
		int i = 5;
		
		
	prepareArrayLists(i);
	

}

	private static void prepareArrayLists(int i) {
		Map<Integer, List<Integer>> m1 = new LinkedHashMap<>();
		
		for(int s=1;s<=i;s++){
			
			List<Integer> l1 = new ArrayList<>();	
		for(int a=0;a<=s;a++){
			
			l1.add(a);
			
			}
		//System.out.println(l1);
		
		m1.put(s, l1);
			
		}
		System.out.println(m1);
	}
}
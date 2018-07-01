package com.collectionExamples.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertoIntegerArray {
	
	//int a[] = {1, 2, 3, 2, 6, 9,1,22,34,43,3,50};
	
	
	public static void main(String[] args){
	
	m1();
	
	}
	
	public static void m1(){
	
		int a[] = {1, 2, 3, 2, 6, 9,1,22,34,43,3,50};	
		
	Set<Integer> s1 = new HashSet<Integer>();
	
	for (Integer integer : a) {
		s1.add(integer);
	}
	
	System.out.println( s1);
	}
	
}

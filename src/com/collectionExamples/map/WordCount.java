/*Input string: This is original statement  
this is duplicate of original statement 
this is duplicate of original statement
this is duplicate of original statement */

/* Q)Word count : find the number of occurrences of each word from above input string 
hint: split this string to a string array or list . while iterating each word from the array or list,
Use map to store the word count logic*/

//Psuedo Code Steps :- 

/*
 
1)using array split i will check if a given word is present or not
2) using word count i will find the occurrence of each word
3) using the map(K,V) i will store the number of occurrences for each word
*/
package com.collectionExamples.map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		WordCount o1 = new WordCount();
		//o1.isWordPresent("original");
		//o1.wordCount("original");
o1.wordCount1();
	}

	public void isWordPresent(String X) {

		String s = "this is duplicate of original statement";

		String a[] = s.split(" ");
		boolean v1 = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(X)) {
				v1 = true;
				break;
			} else
				v1 = false;

		}

		if (v1 == true) {
			System.out.println("Given word found in the string");

		} else
			System.out.println("Given word is Not found in the string");

	}

	
	
	
	
	public void wordCount(String X){
	
		String s = "This is original statement this is duplicate of original statement this is duplicate of original statement this is duplicate of original statement";
		Map<String,Integer> m1 = new HashMap<>();
		String a[] = s.split(" ");
		int count = 0;
		for(int i = 0;i<a.length;i++){
			
		if(a[i].equalsIgnoreCase(X)){
			
				
			count++;
		}
		
		}System.out.println(count);
		
		  
		  //m1.put(key, value);
		 
		
		
	}
	
	
	public void wordCount1(){
		
		String s = "This is original statement this is duplicate of original statement this is duplicate of original statement this is duplicate of original statement";
		Map<String,Integer> m1 = new HashMap<>();
		String a[] = s.split(" ");
		
		for(int i = 0;i<a.length;i++){
			if(m1.containsKey(a[i])){
				int count = m1.get(a[i]);
				m1.put(a[i], count+1);
			
		
			}else {
					m1.put(a[i], 1);
				}
				
			
		} System.out.println(m1);
		
		}
		
}

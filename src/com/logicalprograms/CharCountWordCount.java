package com.logicalprograms;

public class CharCountWordCount {

	public static void main(String[] args) {
		CharCountWordCount o1 = new CharCountWordCount();
		//o1.isWordPresent("wOrd");
		//o1.calcWordCount("words");
		o1.calcCharCount('u');
		
		

	}

	public void isWordPresent(String x) {

		String s = "get number of word in a statement";

		String a[] = s.split(" ");

		boolean v1 = false;

		for (int i = 0; i < a.length; i++) {

		//	if (a[i] == x) {
			if (a[i].equalsIgnoreCase(x)){
				v1 = true;
				break;
			} else
				v1 = false;

		}
			if (v1 == true) {
				System.out.println("word found");
			} else
				System.out.println("word not found");

		

	}
	
	
	public void calcWordCount(String x){
		String s = ("number of words in a statement words ");
		String a[] = s.split(" ");
	
		int count = 0;
		for(int i=0;i<a.length;i++){
		if(a[i].equalsIgnoreCase(x)){
			count++;
			
			}
		}
		System.out.println(count);
	}
	
	
	
	
public void calcCharCount(char x){
		
		String s = "arunkumar";
		char a[] =s.toCharArray();
		System.out.println(a.length);
		
		int count = 0;
		//for (int i=0;i<a.length;i++){
		
		for(char i:a){
			if(i == x){
			count++;
			}
		}
		System.out.println(count);
	}

	public void isCharPresent(char x) {

		String s = "arunkumar";
		char a[] = s.toCharArray();

		int count = 0;
		

		for (char i : a) {
			if (i == x) {

				count++;
				break;
			}

		}
		System.out.println(count);
		if (count != 0) {
			System.out.println("character   found");
		} else
			System.out.println("character Not  found");
	}

}

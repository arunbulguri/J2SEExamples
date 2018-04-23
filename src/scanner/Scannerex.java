package scanner;

import java.util.Scanner;

public class Scannerex {

	
	public int i;
	
	public String S;
	
	public static void main(String [] args){
		
    Scanner s = new Scanner(System.in);
	System.out.println("Enter the integer value");	
	
	int i = 	s.nextInt();
	s.nextLine();
	
	System.out.println("Enter the String value");	
	String S = s.nextLine();
	
	
	
	System.out.println(i + "        "   +   S);
	
	
	
	
	
		
		
	}
	
	
}

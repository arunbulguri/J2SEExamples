package com.comparator.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {

	public static void main(String[] args) {
		
		List<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(300, "Ajeet", 32));

		   Collections.sort(arraylist, new Comparator<Student>() {

				public int compare(Student s1, Student s2) {
				   String StudentName1 = s1.getStudentname().toUpperCase();
				   String StudentName2 = s2.getStudentname().toUpperCase();

				   //ascending order
				   return StudentName1.compareTo(StudentName2);

				   //descending order
				   //return StudentName2.compareTo(StudentName1);
			    }});	
		   
		   System.out.println("Sorted based on name");
		   for(Student str: arraylist){
				System.out.println(str);
		   }
		   
Collections.sort(arraylist, new Comparator<Student>() {

	public int compare(Student s1, Student s2) {

	   int rollno1 = s1.getRollno();
	   int rollno2 = s2.getRollno();

	  
	   return rollno1-rollno2;

	   
	
   }});
		   
		   System.out.println("Sorted based on roll no");
		   for(Student str: arraylist){
				System.out.println(str);
		   }
	     }

	}



package com.comparable.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {

	public static void main(String[] args) {
		
		List<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	     }

	}



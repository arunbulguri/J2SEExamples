package com.collectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListHomework {
	
	private List<Input> generateRandomNumbers(int min, int max) {
		
		List<Input> inputData = new ArrayList<>();
		
		Random randomNum = new Random();
		for (int i = min; i <= max; i++) {
			int op = min + randomNum.nextInt(max);
			if (op % 5 == 0) {
				Input inputObj = new Input();
				if(op%15 == 0){
					inputObj.prop2 = "random" + op;
				} else {
					inputObj.prop3 = "random" + op;
				}
				inputData.add(inputObj);
			} else {
				inputData.add(new Input(op, "prop2_" + op, "prop3_" + op));
			}
			// System.out.print(op+ " ");
		}
		return inputData;
	}

	class Input {
		private int prop1;
		private String prop2;
		private String prop3;

		Input(int prop1, String prop2, String prop3) {
			this.prop1 = prop1;
			this.prop2 = prop2;
			this.prop3 = prop3;

		}

		@Override
		public String toString() {
			return "Input [prop1=" + prop1 + ", prop2=" + prop2 + ", prop3=" + prop3 + "]";
		}

		Input() {

		}
	}
	

	public static void main(String[] args) {
		
		ListHomework o1 = new ListHomework();
		List<Input> l1 = o1.generateRandomNumbers(1, 100);
		
		//System.out.println(l1);
		
		o1.findprop1list(31, l1);
		o1.findprop1list(29, l1);
		o1.findprop1list(28, l1);
		
		o1.findprop2list("prop2_31", l1);
		o1.findprop2list("prop2_29", l1);
		o1.findprop2list("prop2_28", l1);
		
		
		
		List<Integer> l4 = new ArrayList<>();
		List<Input> l5 = new ArrayList<>();
		
		
		for(Input i:l1){
			
			
			
			if(l4.contains(i.prop1)){
				l5.add(i);
			}
			else{
				l4.add(i.prop1);
			}
			
		}
	System.out.println("Duplicate Objects");
		System.out.println(l5);
		
		
		
		// 1) from the above list L1 get all the objects whose prop1 is 30 in to a list & print them
		// 2) from the above list L1 get all the objects whose prop2 is prop2_25 in to a list & print them
	// Hint :- Avoid Null Pointer Exception	 while comparing.
		// 3) Find the Duplicate Objects based on Prop_1 fiels.
		
		
		
		
		
		
		
	}


	private  void findprop2list(String s1,List<Input> l1) {
		List<Input> l3 = new ArrayList<>();
		
		for(Input i:l1){
			//if(i.prop2.equals("prop2_25")){
				
			if((s1).equals(i.prop2)){
				l3.add(i);
			}
		}
		System.out.println(l3);
	}


	private  void findprop1list(int prop1, List<Input> l1) {
		List<Input> l2 = new ArrayList<>( );

        for(Input i :l1){

		if (i.prop1==prop1){
		   l2.add( i );
		   }
	

		

		}
        System.out.println(l2);
	}

}

package com.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionHomoHeteroGeneous {

	public static void main(String[] args) {
		
		Collection o1 = new ArrayList();
		o1.add(1);
		o1.add(1.235);
		o1.add("1");
		o1.add(true);
		

		
		Collection<Integer> o2 = new ArrayList<Integer>();
		o2.add(1);
		//o2.add(1.235);// we restricted o2 to allow only integer type data buy putting generic<>
	}

}

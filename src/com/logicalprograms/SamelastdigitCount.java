package com.logicalprograms;

public class SamelastdigitCount {

	public static void main(String[] args) {

		/*
		 * a[] = { 1, 4, 9, 19,28,21,39,53 73, 75, 99}
		 * 
		 * use mod oper for logic use for each loop & while loop( write 2
		 * examples
		 */

		SamelastdigitCount o1 = new SamelastdigitCount();
		 o1.usingForLoop(9);
		 o1.usingWhileLoop(5);

	}

	public void usingForLoop(int x) {
		int a[] = { 1, 4, 3, 15, 28, 21, 39, 53, 73, 75, 99 };

		int count = 0;

		for (int i : a) {

			if (i % 10 == x) {
				count++;

			}
		}
		System.out.println(count);
	}

	public void usingWhileLoop(int x) {
		int a[] = { 1, 4, 9, 19, 28, 21, 39, 53, 73, 75, 99, 195 };
		int count = 0;
		int i = 0;
		while (i < a.length) {

			if (a[i] % 10 == x) {
				count++;

			}
			i++;
		}
		System.out.println(count);
	}

}

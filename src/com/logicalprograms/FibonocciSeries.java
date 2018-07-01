package com.logicalprograms;

public class FibonocciSeries {
	/*
	 * // 0,1,1,2,3,5,8
	 * 
	 * 
	 * 
	 * e1 e2 e3 // 0, 1 1 moved the value of e2 into e1; e3 into e2 1 ,1 2
	 * 
	 * 
	 */
	public static void main(String args[]) {
		FibonocciSeries o1 = new FibonocciSeries();
	o1.seriesUptoGivenNumber(4);
		//o1.seriesWithGivenNnumberOfElements(8);

	}

	public void seriesUptoGivenNumber(int num) {

		int ele1 = 0;
		int ele2 = 1;
		int ele3 = 0;

		System.out.print(ele1 + " " + ele2 + "  ");

		while (ele3 <= num) {
			ele3 = ele1 + ele2;
			if (ele3 <= num) {
				System.out.print(ele3 + "  ");
			}
			ele1 = ele2;
			ele2 = ele3;
		}
		System.out.println();
	}

	public void seriesWithGivenNnumberOfElements(int num) {

		int ele1 = 0;
		int ele2 = 1;
		int ele3 = 0;

		System.out.print(ele1 + " " + ele2 + "  ");

		int count = 2;
		while (count < num) {
			ele3 = ele1 + ele2;
			System.out.print(ele3 + "  ");

			ele1 = ele2;
			ele2 = ele3;
			count++;
		}
		System.out.println();

		

	}

}
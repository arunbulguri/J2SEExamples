package com.arrays;

public class MatrixTranspose {

	public static void main(String args[]) {
		MatrixTranspose o1 = new MatrixTranspose();
		//o1.fixedSizeSquareMatrix();
		o1.fixedSizeRectangleMatrix();
		
		

	}

	public void fixedSizeSquareMatrix() {
	
       int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
       int aTranspose[][] = new int [3][3];
       
		System.out.println("Before Transpose");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[j][i] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("After transpose");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aTranspose[i][j] = a[j][i];
				
				System.out.print(aTranspose[i][j] + "  ");
			}
			System.out.println();
		}
	
		
}

	public void fixedSizeRectangleMatrix() {
		
		
		
		 int a[][] = { { 1, 1, 1 }, { 2, 2, 2 } };
		 
		 
		 
		 /*1 1 1      a[0][0] a[0][1] a[0][2]
		   2 2 2      a[1][0] a[1][1] a[1][2]*/
		   int aTranspose[][] = new int [3][2];
	       
	       /*1 2      a[0][0] a[0][1] 
		     1 2      a[1][0] a[1][1] 
	         1 2      a[2][0] a[2][1]                     
	         */
	       
	       for (int i=0; i<3;i++){  // i indicates number of rows of aTranspose 
	    	   	for(int j=0; j<2; j++){ // j indicates number of columns of aTranspose 
	    	   		aTranspose[i][j] = a[j][i];
	    	   		
	    	   		System.out.print(aTranspose[i][j] +" ");
	    	   	}
	    	   	System.out.println();
	       }
	       

	}
}

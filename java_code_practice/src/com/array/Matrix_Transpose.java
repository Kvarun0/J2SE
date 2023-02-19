/**
 * 	Matrix Transpose is done in various way
 * 		- Using Direct Original Matrix
 * 		- Using Temporary matrix
 * 	
 * 	example
 * 
 * 		1 3		>	1 5 
 * 		5 8		 	3 8
 * 	
 * */
package com.array;

public class Matrix_Transpose {
	public static void main(String[] args) {
			
		Using_Matrix uomatrix=new Using_Matrix();
		
		uomatrix.original_matrix_3d();
		
		uomatrix.temp_matrix_3d();
	
	}	
}


class Using_Matrix{
	
	int [][] original_array={{1,2,3},{4,5,6},{7,8,9}};
	
	protected void original_matrix_3d(){

		System.out.println("Using Original Array");
		System.out.println();
		System.out.println("Original Array : ");
		
		for (int i = 0; i < original_array.length; i++) {
			for (int j = 0; j < original_array.length; j++) {
				System.out.print(original_array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix : ");
		for (int i = 0; i < original_array.length; i++) {
			for (int j = 0; j < original_array.length; j++) {
				System.out.print(original_array[j][i]+" ");
			}
			System.out.println();
		}
		
	}
	
	protected void temp_matrix_3d(){
		
		System.out.println();
		System.out.println("Using Temp Matrix");
		System.out.println();
		
		int [][] temp=new int[original_array.length][original_array.length];
		
		for (int i = 0; i < original_array.length; i++) {
			for (int j = 0; j < original_array[0].length; j++) {
				temp[i][j]=original_array[j][i];	
			}
		}
		
		System.out.println("Original Matrix");
		for (int[] is : original_array) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix");
		for (int[] is : temp) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	
}
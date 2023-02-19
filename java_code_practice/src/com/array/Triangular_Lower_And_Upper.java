/**
 *
 *	TrianGular Matrix 
 *	
 *	- Upper Triangular
 *
 *		1 3 5
 *		0 6 7
 *		0 0	9
 *
 *	- Lower Triangular
 *		
 *		1 0 0	
 *		2 4 0
 *		3 5 6
 */		
 
package com.array;

public class Triangular_Lower_And_Upper {
	public static void main(String[] args) {
		
		Triangular triangular=new Triangular();
		
		triangular.lower_triangular();
		
		triangular.upper_triangular();
		
	}
}

class Triangular{
	
	protected void lower_triangular() {
		int [][] arr_3d={{1,2,3},{7,8,9},{4,5,6}};
		
		int row=arr_3d.length;
		int column=arr_3d[0].length;
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column ; j++) {
				if (i<j) {
					arr_3d[i][j]=0;
				}
			}
		}
		
		System.out.println("Lower Triangular");
		for (int[] is : arr_3d) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	protected void upper_triangular() {
		
		int [][] arr_3d={{1,2,3},{7,8,9},{4,5,6}};
		
		int row=arr_3d.length;
		int column=arr_3d[0].length;
		
		System.out.println("Upper Triangular");
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column; j++) {
				if(i>j){
					arr_3d[i][j]=0;
				}
			}
		}
		
		for (int[] is : arr_3d) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
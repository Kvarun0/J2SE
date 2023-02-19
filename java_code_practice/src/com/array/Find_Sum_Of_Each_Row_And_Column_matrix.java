/**
 * Find the sum of each row and column of matrix
 * 
 */
package com.array;

public class Find_Sum_Of_Each_Row_And_Column_matrix {
	public static void main(String[] args) {
	
		Find_Sum fsum=new Find_Sum();
		
		fsum.sum_of_row();
		
		fsum.sum_of_column();
		
	}
}

class Find_Sum{
	
	protected void sum_of_row() {
		
		int[][] arr_3d={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=arr_3d.length;
		int column=arr_3d[0].length;
		
		//Integer sum_row=0;
		//if we declare hear than in for loop its added into next
		
		for (int i = 0; i < row; i++) {
			int sum_row=0;
			for (int j = 0; j < column; j++) {
				
				sum_row=sum_row+arr_3d[i][j];		
			}
			
			System.out.println("Sum Of : " + (i+1) +" th row is "+ sum_row);
		}
			
	}
	
	protected void sum_of_column() {
		
		int [][] arr_3d={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=arr_3d.length;
		int column=arr_3d[0].length;
		
		for (int i = 0; i < row; i++) {
			int sum_column=0;
			for (int j = 0; j < column; j++) {
				sum_column =sum_column+arr_3d[j][i];
			}
			System.out.println("Sum Of : "+(i+1)+" th column is "+ sum_column);
		}	
	}
	
	
}
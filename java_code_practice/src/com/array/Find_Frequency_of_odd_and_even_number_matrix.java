/**
 *  Find The Frequency of odd and even numbers in given matrix
 *  
 */
package com.array;


public class Find_Frequency_of_odd_and_even_number_matrix {
	public static void main(String[] args) {
		
		Frequency frequency=new Frequency();
		frequency.find_frequency();
		
	}
	
}

class Frequency{
	
	protected void find_frequency() {
		int countEven=0;
		int countOdd=0;
		int row,column;
		
		int [][] arr_3d={{1,2,3},{4,5,6},{7,8,9}};
		row=arr_3d.length;
		column=arr_3d[0].length;
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column; j++) {
				
				if (arr_3d[i][j]%2==0) {
					countEven++;
				}
				else {
					countOdd++;
				}
			}
		}
		
		System.out.println("Number of Even Element "+ countEven);
		System.out.println("Number of odd Element "+ countOdd);
		
	}
}
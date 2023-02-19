/**
 * 
 * Equal Matrix
 * 		- Number of rows and columns is same
 * 		- Corresponding element is same
 * */
package com.array;

public class EqualMatrix_3d {
	public static void main(String[] args) {
		
		Equal equal=new Equal();
		equal.check_equal_3d();
	}
}


class Equal{
	protected void check_equal_3d() {
			
		
		int [][] arr1={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int [][] arr2={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		int row1=arr1.length;
		int column1=arr1[0].length;
		
		int row2=arr2.length;
		int column2=arr2[0].length;
		
		boolean flag=true;
		
		if (row1 != row2 && column1 != column2) {
			System.out.println("Both Matrix is not same");
			
		} else {
			
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					if (arr1[i][j] != arr2[i][j]) {
						flag=false;
					}
				}
			}
			
			if (flag) {
				System.out.println("Both Matrix is same");
			}else {
				System.out.println("Both Matrix is not same");
			}
			
		}
		
	}
}









/**
 *	
 *	Identity
 *		its matrix with 1 in diagonal and 0 in other
 *	
 *		example
 *			100
 *			010
 *			001
 *
 *	Sparse
 * 		have more number of zero element than the non-zero element.
 * 	
 * 		Array size/2 < number of zero element		
 * 
 * 		example
 * 			001
 * 			100
 * 			
 * */

package com.array;

public class Type_Of_Matrix_Identity_and_sparse {
	public static void main(String[] args) {

		
		Identity_Matrix iMatrix=new Identity_Matrix();
		iMatrix.identity_matrix_check_3d();
		
		
		Sparse_Matrix sMatrix=new Sparse_Matrix();
		sMatrix.sparse_matrix_check_3d();
		
	}
}

class Identity_Matrix{
	protected void identity_matrix_check_3d() {
		
//		int [][] array= {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] array= {{1,0,0},{0,1,0},{0,0,1}};
		
		
		int rows=array.length;
		int column=array[0].length;
		
		boolean flag=true;
		
		if (rows != column) {
			System.out.println("Given Matrix is not an identuty matrix");
		}
		
		else {
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < column; j++) {
					
					if (i==j && array[i][j] !=1) {
						flag=false;
						break;
					}
					if (i!=j && array[i][j] !=0) {
						flag=false;
						break;
					}
					
				}
			}
			
			if (flag) {
				System.out.println("Given Matrix is an Identity matrix");
			} else {
				System.out.println("Given Matrix is not an identuty matrix");
			}
			
		}
		
	}
}

class Sparse_Matrix{
	
	protected void sparse_matrix_check_3d() {
	
		
		int arr[][]={{1,0,0},{0,0,1},{0,4,5},{4,0,0}};

		int count=0;
		
		int rows=arr.length;
		int columns=arr[0].length;
	
		int size=rows*columns;
		
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				if (arr[i][j]==0) {
					count++;
				}
				
			}
		}
		
		if (count >size/2) {
			System.out.println("Given Matrix is Sparse Matrix");
		}
		
		else{
			System.out.println("Given Matrix is not Sparse Matrix");
		}
	}
}





